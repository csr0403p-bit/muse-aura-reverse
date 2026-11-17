package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmDataMigrationCopy extends C06G {
    public final ConfidentialVmDataMigrationDeleteOption deleteOption;
    public final ConfidentialVmDataMigrationKeepOption keepOption;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String subtitle;
    public final String title;

    public static /* synthetic */ ConfidentialVmDataMigrationCopy copy$default(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, String str, String str2, ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, String str3, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption2 = confidentialVmDataMigrationKeepOption;
        ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption2 = confidentialVmDataMigrationDeleteOption;
        String str7 = str3;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = confidentialVmDataMigrationCopy.title;
        }
        if ((i & 2) != 0) {
            str6 = confidentialVmDataMigrationCopy.subtitle;
        }
        if ((i & 4) != 0) {
            confidentialVmDataMigrationKeepOption2 = confidentialVmDataMigrationCopy.keepOption;
        }
        if ((i & 8) != 0) {
            confidentialVmDataMigrationDeleteOption2 = confidentialVmDataMigrationCopy.deleteOption;
        }
        if ((i & 16) != 0) {
            str7 = confidentialVmDataMigrationCopy.primaryButtonText;
        }
        if ((i & 32) != 0) {
            str8 = confidentialVmDataMigrationCopy.secondaryButtonText;
        }
        return new ConfidentialVmDataMigrationCopy(str5, str6, confidentialVmDataMigrationKeepOption2, confidentialVmDataMigrationDeleteOption2, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationCopy) {
                ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy = (ConfidentialVmDataMigrationCopy) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmDataMigrationCopy.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmDataMigrationCopy.subtitle) || !C7384Etj.areEqual(this.keepOption, confidentialVmDataMigrationCopy.keepOption) || !C7384Etj.areEqual(this.deleteOption, confidentialVmDataMigrationCopy.deleteOption) || !C7384Etj.areEqual(this.primaryButtonText, confidentialVmDataMigrationCopy.primaryButtonText) || !C7384Etj.areEqual(this.secondaryButtonText, confidentialVmDataMigrationCopy.secondaryButtonText)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final ConfidentialVmDataMigrationKeepOption component3() {
        return this.keepOption;
    }

    public final ConfidentialVmDataMigrationDeleteOption component4() {
        return this.deleteOption;
    }

    public final String component5() {
        return this.primaryButtonText;
    }

    public final String component6() {
        return this.secondaryButtonText;
    }

    public final ConfidentialVmDataMigrationCopy copy(String str, String str2, ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, String str3, String str4) {
        return new ConfidentialVmDataMigrationCopy(str, str2, confidentialVmDataMigrationKeepOption, confidentialVmDataMigrationDeleteOption, str3, str4);
    }

    public final ConfidentialVmDataMigrationDeleteOption getDeleteOption() {
        return this.deleteOption;
    }

    public final ConfidentialVmDataMigrationKeepOption getKeepOption() {
        return this.keepOption;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.keepOption)) * 31) + AnonymousClass006.A0D(this.deleteOption)) * 31) + AnonymousClass006.A0G(this.primaryButtonText)) * 31) + AnonymousClass005.A0H(this.secondaryButtonText);
    }

    public ConfidentialVmDataMigrationCopy(String str, String str2, ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.keepOption = confidentialVmDataMigrationKeepOption;
        this.deleteOption = confidentialVmDataMigrationDeleteOption;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public String toString() {
        return super.toString();
    }
}
