package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmDataMigrationDeleteOption extends C06G {
    public final String body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationDeleteOption) {
                ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption = (ConfidentialVmDataMigrationDeleteOption) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmDataMigrationDeleteOption.title) || !C7384Etj.areEqual(this.body, confidentialVmDataMigrationDeleteOption.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDataMigrationDeleteOption copy$default(ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDataMigrationDeleteOption.title;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmDataMigrationDeleteOption.body;
        }
        return new ConfidentialVmDataMigrationDeleteOption(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final ConfidentialVmDataMigrationDeleteOption copy(String str, String str2) {
        return new ConfidentialVmDataMigrationDeleteOption(str, str2);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.body);
    }

    public ConfidentialVmDataMigrationDeleteOption(String str, String str2) {
        this.title = str;
        this.body = str2;
    }

    public String toString() {
        return super.toString();
    }
}
