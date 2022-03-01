package com.eeshvardasikcm.shrotalang;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BlockDiscovery {
    private ArrayList<DefStep> defStepsFound = new ArrayList<DefStep>(0);

    private BlockDiscovery() {

    }

    @NonNull
    public static BlockDiscovery createBlockDiscovery() {
        return new BlockDiscovery();
    }
}
