package com.eeshvardasikcm.shrotalang;

public class BlockTranslate {

    /**
     * public AllShrotaLangClasses() {} ->
     * public AllShrotaLangClasses() extends ShrotaFlowChart {}
     * subStepsInFlowChart defstep newStep: String
     * subStepsInFlowChart.add(newStep);
     */
    protected void BlockTranslate() {
        for (ClassImplementation classImplementation : classesImplemented) {
            String.join(" ",
                    classImplementation.accessAndName,
                    "extends ShrotaFlowChart",
                    classImplementation.codeBlock
            );
        }
        for (DefStep defStep : GetDefStepsImplemented()) {
            String.join(" ",
                    defStep.getSteps(),
                    "translated into rust language: " +
                            "subStepsInFlowChart.add(newStep);",
                    defStep.getNewStep()
            );
        }    }
}
