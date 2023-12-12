
Type E_States:
(
	Start := 0,
	SystemOff,
	StartUpMode,
	NormalMode
)

FUNCTION_BLOCK PUBLIC StateMachine

VAR_INPUT
	SystemState: INT;
END_VAR
VAR_OUTPUT
	PreheaterPump: INT;
    Fans: INT;
    Dampers: INT;
    PreheaterValve: INT;
END_VAR
VAR
    eState : E_States := 0; 
	wait : TON;
END_VAR
	
CASE eState OF
	E_States.Start:
			eState := E_States.SystemOff;
	E_States.SystemOff:
			PreheaterValve:= 0;
			PreheaterPump:= 0;
			Fans:= 0;
			Dampers:= 0;
			
			IF (SystemState = 1) THEN
				eState := E_States.StartUpMode;
			END IF
	E_States.StartUpMode:
			PreheaterValve:= 1;
			PreheaterPump:= 1;
			Fans:= 0;
			Dampers:= 0;
			
			wait(IN:=TRUE, PT:=T#5s);
		    
			IF wait.Q THEN
		        wait(IN:=FALSE);
		        eState := E_States.NormalMode;
		    END_IF
	E_States.NormalMode:
			PreheaterValve:= 2;
			PreheaterPump:= 1;
			Fans:= 1;
			Dampers:= 1;
			
			IF (SystemState = 0) THEN
				eState := E_States.SystemOff;
			END IF
END_CASE
