import json
import xmltodict
import sys
import getopt

inputfile = ''
outputpath = 'out/out.xmi'
root = 'root'
opts, args = getopt.gnu_getopt(sys.argv,"hi:o:r:",["in=","out=","root="])

for opt, arg in opts:
  if opt == '-h':
     print ('json_to_xml.py -in <inputfile> -out <outputpath>')
     sys.exit()
  elif opt in ("-i", "--in"):
     inputfile = arg
  elif opt in ("-o", "--out"):
     outputpath = arg
  elif opt in ("-r", "--root"):
     root = arg

if not inputfile:
    print('json_to_xml.py -in <inputfile> -out <outputpath>')
    sys.exit()

simultanFile = json.load(open(inputfile))

with open(outputpath, 'w') as file:
  xmltodict.unparse({root: simultanFile},output=file)