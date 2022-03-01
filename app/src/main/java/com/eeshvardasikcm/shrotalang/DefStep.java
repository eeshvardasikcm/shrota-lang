package com.eeshvardasikcm.shrotalang;

/**
 * defstep keyword is used to define steps inside the steps.shrota class
 * and helps alleviate the disabled subclassing in shrota-lang.
 * SubStepping is the ShrotaModel in String defined flowchart.shrota steps.shrota
 */
public class DefStep {
    private String steps;
    private String newStep;

    final String getSteps() {
        return this.steps;
    }

    final String getNewStep() {
        return this.newStep;
    }
}
