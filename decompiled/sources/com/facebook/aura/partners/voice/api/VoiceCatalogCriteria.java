package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes4.dex */
public final class VoiceCatalogCriteria extends C06G {
    public static final int $stable = 0;
    public final String accent;
    public final String gender;
    public final String query;
    public final String tone;

    public VoiceCatalogCriteria() {
        this("", null, null, null);
    }

    public final VoiceCatalogCriteria copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new VoiceCatalogCriteria(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogCriteria) {
                VoiceCatalogCriteria voiceCatalogCriteria = (VoiceCatalogCriteria) obj;
                if (!C7384Etj.areEqual(this.query, voiceCatalogCriteria.query) || !C7384Etj.areEqual(this.gender, voiceCatalogCriteria.gender) || !C7384Etj.areEqual(this.accent, voiceCatalogCriteria.accent) || !C7384Etj.areEqual(this.tone, voiceCatalogCriteria.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceCatalogCriteria copy$default(VoiceCatalogCriteria voiceCatalogCriteria, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceCatalogCriteria.query;
        }
        if ((i & 2) != 0) {
            str2 = voiceCatalogCriteria.gender;
        }
        if ((i & 4) != 0) {
            str3 = voiceCatalogCriteria.accent;
        }
        if ((i & 8) != 0) {
            str4 = voiceCatalogCriteria.tone;
        }
        C7384Etj.A0Y(str, 0);
        return new VoiceCatalogCriteria(str, str2, str3, str4);
    }

    public final String component1() {
        return this.query;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.accent;
    }

    public final String component4() {
        return this.tone;
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getTone() {
        return this.tone;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.query) + AnonymousClass006.A0G(this.gender)) * 31) + AnonymousClass006.A0G(this.accent)) * 31) + AnonymousClass005.A0H(this.tone);
    }

    public final boolean isEmpty() {
        if (!C7BY.A0j(this.query)) {
            return false;
        }
        String str = this.gender;
        if (str != null && !C7BY.A0j(str)) {
            return false;
        }
        String str2 = this.accent;
        if (str2 != null && !C7BY.A0j(str2)) {
            return false;
        }
        String str3 = this.tone;
        return str3 == null || C7BY.A0j(str3);
    }

    public String toString() {
        return super.toString();
    }

    public VoiceCatalogCriteria(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.query = str;
        this.gender = str2;
        this.accent = str3;
        this.tone = str4;
    }

    public /* synthetic */ VoiceCatalogCriteria(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
