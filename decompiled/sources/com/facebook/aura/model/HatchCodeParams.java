package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchCodeParams extends C06G {
    public static final int $stable = 0;
    public final String codeContent;
    public final String language;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCodeParams) {
                HatchCodeParams hatchCodeParams = (HatchCodeParams) obj;
                if (!C7384Etj.areEqual(this.codeContent, hatchCodeParams.codeContent) || !C7384Etj.areEqual(this.language, hatchCodeParams.language)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCodeParams copy$default(HatchCodeParams hatchCodeParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCodeParams.codeContent;
        }
        if ((i & 2) != 0) {
            str2 = hatchCodeParams.language;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchCodeParams(str, str2);
    }

    public final String component1() {
        return this.codeContent;
    }

    public final String component2() {
        return this.language;
    }

    public final String getCodeContent() {
        return this.codeContent;
    }

    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.language, AnonymousClass001.A0G(this.codeContent));
    }

    public HatchCodeParams(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.codeContent = str;
        this.language = str2;
    }

    public final HatchCodeParams copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchCodeParams(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
