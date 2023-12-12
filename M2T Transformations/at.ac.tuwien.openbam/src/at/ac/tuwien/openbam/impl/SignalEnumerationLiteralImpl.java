/**
 */
package at.ac.tuwien.openbam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.EnumerationLiteral;

import at.ac.tuwien.openbam.SignalEnumerationLiteral;
import at.ac.tuwien.openbam.Usecase_profilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getId <em>Id</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getDp <em>Dp</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getDp_type <em>Dp type</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getDp_function <em>Dp function</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getNtfcl <em>Ntfcl</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getObj_desc <em>Obj desc</em>}</li>
 *   <li>{@link usecase_profile.impl.SignalEnumerationLiteralImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalEnumerationLiteralImpl extends MinimalEObjectImpl.Container implements SignalEnumerationLiteral {
	/**
	 * The cached value of the '{@link #getBase_EnumerationLiteral() <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral base_EnumerationLiteral;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDp() <em>Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp()
	 * @generated
	 * @ordered
	 */
	protected static final String DP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDp() <em>Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp()
	 * @generated
	 * @ordered
	 */
	protected String dp = DP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDp_type() <em>Dp type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp_type()
	 * @generated
	 * @ordered
	 */
	protected static final String DP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDp_type() <em>Dp type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp_type()
	 * @generated
	 * @ordered
	 */
	protected String dp_type = DP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDp_function() <em>Dp function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp_function()
	 * @generated
	 * @ordered
	 */
	protected static final String DP_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDp_function() <em>Dp function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDp_function()
	 * @generated
	 * @ordered
	 */
	protected String dp_function = DP_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNtfcl() <em>Ntfcl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNtfcl()
	 * @generated
	 * @ordered
	 */
	protected static final String NTFCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNtfcl() <em>Ntfcl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNtfcl()
	 * @generated
	 * @ordered
	 */
	protected String ntfcl = NTFCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getObj_desc() <em>Obj desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj_desc()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObj_desc() <em>Obj desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj_desc()
	 * @generated
	 * @ordered
	 */
	protected String obj_desc = OBJ_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalEnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usecase_profilePackage.Literals.SIGNAL_ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getBase_EnumerationLiteral() {
		if (base_EnumerationLiteral != null && base_EnumerationLiteral.eIsProxy()) {
			InternalEObject oldBase_EnumerationLiteral = (InternalEObject)base_EnumerationLiteral;
			base_EnumerationLiteral = (EnumerationLiteral)eResolveProxy(oldBase_EnumerationLiteral);
			if (base_EnumerationLiteral != oldBase_EnumerationLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
			}
		}
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetBase_EnumerationLiteral() {
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_EnumerationLiteral(EnumerationLiteral newBase_EnumerationLiteral) {
		EnumerationLiteral oldBase_EnumerationLiteral = base_EnumerationLiteral;
		base_EnumerationLiteral = newBase_EnumerationLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDp() {
		return dp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDp(String newDp) {
		String oldDp = dp;
		dp = newDp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP, oldDp, dp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDp_type() {
		return dp_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDp_type(String newDp_type) {
		String oldDp_type = dp_type;
		dp_type = newDp_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_TYPE, oldDp_type, dp_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDp_function() {
		return dp_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDp_function(String newDp_function) {
		String oldDp_function = dp_function;
		dp_function = newDp_function;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION, oldDp_function, dp_function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNtfcl() {
		return ntfcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNtfcl(String newNtfcl) {
		String oldNtfcl = ntfcl;
		ntfcl = newNtfcl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__NTFCL, oldNtfcl, ntfcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObj_desc() {
		return obj_desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObj_desc(String newObj_desc) {
		String oldObj_desc = obj_desc;
		obj_desc = newObj_desc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__OBJ_DESC, oldObj_desc, obj_desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL:
				if (resolve) return getBase_EnumerationLiteral();
				return basicGetBase_EnumerationLiteral();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__ID:
				return getId();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP:
				return getDp();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_TYPE:
				return getDp_type();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION:
				return getDp_function();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__NTFCL:
				return getNtfcl();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__OBJ_DESC:
				return getObj_desc();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__ID:
				setId((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP:
				setDp((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_TYPE:
				setDp_type((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION:
				setDp_function((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__NTFCL:
				setNtfcl((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__OBJ_DESC:
				setObj_desc((String)newValue);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)null);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__ID:
				setId(ID_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP:
				setDp(DP_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_TYPE:
				setDp_type(DP_TYPE_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION:
				setDp_function(DP_FUNCTION_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__NTFCL:
				setNtfcl(NTFCL_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__OBJ_DESC:
				setObj_desc(OBJ_DESC_EDEFAULT);
				return;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL:
				return base_EnumerationLiteral != null;
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP:
				return DP_EDEFAULT == null ? dp != null : !DP_EDEFAULT.equals(dp);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_TYPE:
				return DP_TYPE_EDEFAULT == null ? dp_type != null : !DP_TYPE_EDEFAULT.equals(dp_type);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION:
				return DP_FUNCTION_EDEFAULT == null ? dp_function != null : !DP_FUNCTION_EDEFAULT.equals(dp_function);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__NTFCL:
				return NTFCL_EDEFAULT == null ? ntfcl != null : !NTFCL_EDEFAULT.equals(ntfcl);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__OBJ_DESC:
				return OBJ_DESC_EDEFAULT == null ? obj_desc != null : !OBJ_DESC_EDEFAULT.equals(obj_desc);
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", dp: ");
		result.append(dp);
		result.append(", dp_type: ");
		result.append(dp_type);
		result.append(", dp_function: ");
		result.append(dp_function);
		result.append(", ntfcl: ");
		result.append(ntfcl);
		result.append(", obj_desc: ");
		result.append(obj_desc);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //SignalEnumerationLiteralImpl
