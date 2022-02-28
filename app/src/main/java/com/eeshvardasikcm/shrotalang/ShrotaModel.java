/**
 * Copyright (c) February 2022. Erik Douglas Ward (Eeshvar Das) (@eeshvardasikcm on Twitter, Instagram, Github, Venmo)
 * Erik Douglas Ward (Eeshvar Das), myself, has created code and resource reopositories with the namespace com.eeshvardasikcm. All of the material in these com.eeshvardasikcm repositories are protected by this Copyright License except some files that may be otherwise licensed using standard beginning of file licensing comments.
 * This Copyright License prevents the use of this software in warfare, or in any other damaging nature. Good ethics must be used while using this software.
 * Use of the software on com.eeshvardasikcm is only permitted by paying Erik Douglas Ward directly as a sponsor on the eeshvardasikcm GitHub repository hosted on GitHub.com at the url: https://github.com/eeshvardasikcm.
 * Erik Douglas Ward (Eeshvar Das) is not responsible for any damages or liabilites caused by the use of this sofware.
 * This software license is for one person only. The GitHub Sponsor program has both a monthly and a one time sponsor option. Monthly sponsors can use the software they gained access to for lifetime for only the one person that sponsors Erik Douglas Ward (Eeshvar Das, eeshvardasikcm) on GitHub. Although this is a lifetime license through GitHub sponsorship given to one person, the GitHub monthly sponsorship only permits access to updates if the monthly sponsorship is maintained. Cancelling a monthly sponsorship means that access to the private repositories are lost. Cancellation means the code that was used or downloaded during monthly sponsorship access to private reposiroties is the most recent version of the private repositories that the sponsor is permitted to use for the rest of their lifetime unless they resubscribe later and again gain access to the updates in the private repositories on GitHub eeshvardasikcm.
 * The One-time sponsor towards sponsorware opens the sponsorware to that one person for life and leads toward opening the associated sponsorware repository to open source.
 */
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
