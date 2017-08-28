WingsProvenanceExport
=====================

**This project has been expanded in https://github.com/KnowledgeCaptureAndDiscovery/WINGS-OPMW-Mapper

All issues, discussion and improvements can be seen there.**

Provenance export for the Wings workflow system, using the OPMW vocabulary. 
The current serializations supported are:

* OPMW: OPMW is an OPM Profile for scientific workflow publication. Official website: http://www.opmw.org/ontology/

* PROV: OPMW extends PROV and it is fully compatible. More information in : http://www.opmw.org/model/OPMW/#ontDescription

OPMW also extends the P-Plan ontology (http://purl.org/net/p-plan). Although a P-Plan serialization is not currently exported, 
OPMW is fully aligned as an extension of P-Plan. More information in http://www.opmw.org/model/OPMW/#ontDescription.

Inputs and outputs
=====================
The conversion of templates and executions is independent. Therefore, there are two main methods to obtain the OPMW and PROV serializations:

Templates: 

 public String transformWINGSElaboratedTemplateToOPMW(String template,String mode, String outFile)
 
* Input: the path of the .owl file of the Wings template, the serialization in which it's written (e.g., "RDF/XML") and the path of the file where you want the result.

* Output: The URI assigned to the workflow template.

Executions: 

 public String transformWINGSResultsToOPMW(String resultFile, String libraryFile, String modeFile, String outFilenameOPMW, String outFilenamePROV)
 
* Input: the path of the .owl file of the Wings template, the path of the .owl file with the Wings execution library, the serialization in which both files are written (e.g., "RDF/XML") and the path of the files where you want the results (OPMW and PROV serializations are written in two files, but they share the same URIs).

* Output: The URI assigned to the workflow execution account.

The project is based on the Jena framework for the conversion.

Assumptions
=====================
In order to link executions and templates correctly, the mapper assumes that variables and steps have asserted the relationship "wflow:derivedFrom", which states from which node in the original template comes the variable or step. Therefore, older versions of Wings are not supported. 

Acknowledgements: I would like to thank Varun Ratnakar for his support while doing the mapper.
