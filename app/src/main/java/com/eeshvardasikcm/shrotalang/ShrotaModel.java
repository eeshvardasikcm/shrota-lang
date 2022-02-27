package com.eeshvardasikcm.shrotalang;

import java.util.ArrayList;

public class ShrotaModel {

    public ShrotaModel () {
        String shrotaFile;
        ArrayList<ClassImplementation> classesImplemented =
                new ArrayList<ClassImplementation>();

        for (ClassImplementation classImplementation : classesImplemented) {
            String.join(" ",
                    classImplementation.accessAndName,
                    "extends ShrotaFlowChart",
                    classImplementation.codeBlock
            );
        }
    }
}
