WingsProvenanceExport
=====================

Provenance export for the Wings workflow system, using the OPMW vocabulary. 
The current serializations supported are:

* OPM: OPMW is an OPM Profile for scientific workflow publication. Official website: http://opmw.org

* PROV: OPMW extends PROV and it is fully compatible. More information in :http://www.opmw.org/node/8

Input: owl ontologies and ttl files used to specify templates and summary of traces, respectively.
Output: 2 files: one in PROV and one in OPMW. The names can be specified.

The project is based on the Jena framework for the conversion.
