package com.eeshvardasikcm.shrotalang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShrotaFile {
    protected ShrotaFile(){

    }
    private BlockDiscovery shrotaLanguageBlocks = BlockDiscovery.createBlockDiscovery();

    private ArrayList<DefStep> defStepsImplemented = new ArrayList<DefStep>(0);
    final List<DefStep> getDefStepsImplemented() {
        return Collections.unmodifiableList(this.defStepsImplemented);
    }

    private BlockDiscovery getShrotaLanguageBlocks() {
        return shrotaLanguageBlocks;
    }
}
