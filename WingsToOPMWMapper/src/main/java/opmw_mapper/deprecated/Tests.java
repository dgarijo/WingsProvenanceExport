/*
 * Copyright 2012-2013 Ontology Engineering Group, Universidad Politécnica de Madrid, Spain
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package opmw_mapper.deprecated;

import opmw_mapper.Mapper;

/**
 * This class has to be replaced with a test
 * @author Daniel Garijo
 */
public class Tests {

    public static void main(String [] args){
        Mapper m = new Mapper();
//        if(m.isRunPublished("http://wind.isi.edu:8890/sparql", "http://wind.isi.edu/marbles/assets/components/workflow_portal/users/1/wordbags/runs/run_130.ttl")) System.out.println("The run exists!!");
//        else System.out.println("The run does not exist");
        
        //new tests without collections, but abstract components, etc.
        String s = m.transformWINGSElaboratedTemplateToOPMW("src\\sample_data\\new\\abs_words\\Template.owl","RDF/XML", "newExample.ttl");
        String s1 = m.transformWINGSResultsToOPMW("src\\sample_data\\new\\abs_words\\Execution.owl", "src\\sample_data\\new\\abs_words\\Library.owl","RDF/XML", "reusltsOPMW.ttl", "resultsPROV.ttl");
        // new tests with collections
//        m.transformWINGSElaboratedTemplateToOPMW("src\\sample_data\\new\\aquaflow_ntm\\Template.owl","RDF/XML", "newExample.ttl");
//        m.transformWINGSResultsToOPMW("src\\sample_data\\new\\aquaflow_ntm\\Execution.owl", "src\\sample_data\\new\\aquaflow_ntm\\Library.owl","RDF/XML", "reusltsOPMW.ttl", "resultsPROV.ttl");
        System.out.println("Template: "+s+"\n"+"Execution: "+s1);






//old tests        
//        m.transformWINGSElaboratedTemplateToOPM("src\\SampleData\\Structured_Association_Test.owl","RDF/XML", "StructuredAssociationTest.ttl");
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
