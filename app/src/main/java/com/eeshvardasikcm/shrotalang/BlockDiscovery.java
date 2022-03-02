package com.eeshvardasikcm.shrotalang;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BlockDiscovery {
    private ArrayList<DefStep> defStepsFound = new ArrayList<DefStep>(0);
    private ArrayList<Comparison> comparisonsFound =
            new ArrayList<Comparison>(0);

    private BlockDiscovery() {

    }

    @NonNull
    public static BlockDiscovery createBlockDiscovery() {
        return new BlockDiscovery();
    }

    private boolean containsComparison(String sectionOfShrotaCode) {
        this.SearchForShrotaComparisonPattern();
    }

    /**
     * Comparison statement is a complete statement of code that reads as
     * <i>compare a with b;</i>
     *
     * compare a with b; statement can be seen similar to when a
     * flow chart uses a question mark (?) at a fork in flow.
     *
     * The Comparison statement in Shrota Language will be
     * able to allow shrota-lang steps
     *
     * FAQ; Q: Why not simply use C style rust operators?
     * A: I found myself writing some steps and sequences out and
     * felt it would be easy to write a compare a with b statement.
     *
     * FAQ: Q: What will the future of the shrota-lang
     * compare a with b; statement be like.
     * A: Not sure. It's possible that shrota-lang comparisons will
     * return some descriptors that describe how a relates to b.
     * This would require shrota-lang to compare against all possibilities
     * in vague situations.
     *
     * FAQ: Q: Wouldn't it be nice to allow the shrota-lang
     * comparison to allow destination routes based on comparison
     * and allow the shrota-lang code to describe the exact decision
     * that needs to made in order to decide where to flow next?
     * A: Of course that sounds great! For now, shrota-lang is only
     * introducing this compare a with b; syntax to satisfy the
     * code writers flexibility to choose to acknowledge
     * only that a decision needs to be made
     * without getting into the details.
     */
    private boolean SearchForShrotaComparisonPattern(
        String sectionOfShrotaCode
    ) throws IllegalStateException {
            throw new IllegalStateException(
                    "can't search for comparison because regular expresion searching is not yet supported by shrota-lang");
    }

    private String GetComparisonFromWithinShrotaCodeSection(
            String sectionOfShrotaCode
    ) throws IllegalStateException {
        throw new IllegalStateException("can't get comparison");
    }
}
