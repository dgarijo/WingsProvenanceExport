/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wings_opm_mapper;

/**
 *
 * @author Daniel Garijo
 */
public class Tests {

    public static void main(String [] args){
        Mapper m = new Mapper();
//        if(m.isRunPublished("http://wind.isi.edu:8890/sparql", "http://wind.isi.edu/marbles/assets/components/workflow_portal/users/1/wordbags/runs/run_130.ttl")) System.out.println("The run exists!!");
//        else System.out.println("The run does not exist");
        
        //Template transformation example
        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\LongRunningID3Modeler.owl","RDF/XML", "LongRunningID3Modeler.ttl");
        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\Structured_Association_Test.owl","RDF/XML", "StructuredAssociationTest.ttl");
        //m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\AbstractGlobalWorkflow2.owl","RDF/XML", "globalWF2.ttl");
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\AbstractSubWFLigandBindingSitesComparison.owl","RDF/XML", "ligandComparisonOPM.ttl");
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\AbstractSubWfDocking.owl","RDF/XML", "dockingOPM.ttl");
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\AbstracctSubWFFATCAT.owl","RDF/XML", "FATCATOPM.ttl");
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\Words.owl","RDF/XML", "Words-export.ttl");
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\AquaFlow_NTM_for_run144.owl","RDF/XML", "AquaFlow_NTM_OPMW.owl.ttl");
//
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_78.ttl","TTL", "run_78_OPM.ttl");
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_81.ttl","TTL", "run_81_OPM.ttl");
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_82.ttl","TTL", "run_82_OPM.ttl");
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_95.ttl","TTL", "run_95_OPM.ttl");
//        System.out.println(m.transformWINGSResultsToOPM("src\\SampleData\\run_83.ttl","TTL", "run_83_OPMW.ttl","run_83_PROV.ttl"));
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_148red.ttl","TTL", "run_148red_OPM.ttl");
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_148.ttl","TTL", "run_148_OPM.ttl");
//        m.transformWINGSResultsToOPM("src\\SampleData\\run_144.ttl","TTL", "run_144_OPM.ttl");
        

    }
}
