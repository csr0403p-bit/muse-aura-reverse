package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmDataMigrationKeepOption extends C06G {
    public final ConfidentialVmDisclosure body;
    public final String footnote;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationKeepOption) {
                ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption = (ConfidentialVmDataMigrationKeepOption) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmDataMigrationKeepOption.title) || !C7384Etj.areEqual(this.body, confidentialVmDataMigrationKeepOption.body) || !C7384Etj.areEqual(this.footnote, confidentialVmDataMigrationKeepOption.footnote)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDataMigrationKeepOption copy$default(ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, String str, ConfidentialVmDisclosure confidentialVmDisclosure, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDataMigrationKeepOption.title;
        }
        if ((i & 2) != 0) {
            confidentialVmDisclosure = confidentialVmDataMigrationKeepOption.body;
        }
        if ((i & 4) != 0) {
            str2 = confidentialVmDataMigrationKeepOption.footnote;
        }
        return new ConfidentialVmDataMigrationKeepOption(str, confidentialVmDisclosure, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final ConfidentialVmDisclosure component2() {
        return this.body;
    }

    public final String component3() {
        return this.footnote;
    }

    public final ConfidentialVmDataMigrationKeepOption copy(String str, ConfidentialVmDisclosure confidentialVmDisclosure, String str2) {
        return new ConfidentialVmDataMigrationKeepOption(str, confidentialVmDisclosure, str2);
    }

    public final ConfidentialVmDisclosure getBody() {
        return this.body;
    }

    public final String getFootnote() {
        return this.footnote;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0D(this.body)) * 31) + AnonymousClass005.A0H(this.footnote);
    }

    public ConfidentialVmDataMigrationKeepOption(String str, ConfidentialVmDisclosure confidentialVmDisclosure, String str2) {
        this.title = str;
        this.body = confidentialVmDisclosure;
        this.footnote = str2;
    }

    public String toString() {
        return super.toString();
    }
}
