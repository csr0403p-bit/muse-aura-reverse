package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchCitation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String permalink;
    public final boolean resolved;
    public final String sourceTool;
    public final String thumbnailUrl;

    public final class Companion {
        public final C9hr<HatchCitation> serializer() {
            return HatchCitation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchCitation hatchCitation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCitation.id, c9iZ, 0);
        c9j5.AAV(hatchCitation.permalink, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCitation.sourceTool != null) {
            c9j5.AAP(hatchCitation.sourceTool, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchCitation.thumbnailUrl != null) {
            c9j5.AAP(hatchCitation.thumbnailUrl, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchCitation.resolved) {
            c9j5.AA7(c9iZ, 4, hatchCitation.resolved);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCitation) {
                HatchCitation hatchCitation = (HatchCitation) obj;
                if (!C7384Etj.areEqual(this.id, hatchCitation.id) || !C7384Etj.areEqual(this.permalink, hatchCitation.permalink) || !C7384Etj.areEqual(this.sourceTool, hatchCitation.sourceTool) || !C7384Etj.areEqual(this.thumbnailUrl, hatchCitation.thumbnailUrl) || this.resolved != hatchCitation.resolved) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCitation copy$default(HatchCitation hatchCitation, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCitation.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCitation.permalink;
        }
        if ((i & 4) != 0) {
            str3 = hatchCitation.sourceTool;
        }
        if ((i & 8) != 0) {
            str4 = hatchCitation.thumbnailUrl;
        }
        if ((i & 16) != 0) {
            z = hatchCitation.resolved;
        }
        return hatchCitation.copy(str, str2, str3, str4, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.permalink;
    }

    public final String component3() {
        return this.sourceTool;
    }

    public final String component4() {
        return this.thumbnailUrl;
    }

    public final boolean component5() {
        return this.resolved;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPermalink() {
        return this.permalink;
    }

    public final boolean getResolved() {
        return this.resolved;
    }

    public final String getSourceTool() {
        return this.sourceTool;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0I(this.permalink, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.sourceTool)) * 31) + AnonymousClass005.A0H(this.thumbnailUrl)) * 31, this.resolved);
    }

    public HatchCitation(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.permalink = str2;
        this.sourceTool = str3;
        this.thumbnailUrl = str4;
        this.resolved = z;
    }

    public final HatchCitation copy(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new HatchCitation(str, str2, str3, str4, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCitation(String str, String str2, String str3, String str4, boolean z, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, C3cI.A1S(i, z));
    }

    public /* synthetic */ HatchCitation(int i, String str, String str2, String str3, String str4, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchCitation$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.permalink = str2;
        if ((i & 4) == 0) {
            this.sourceTool = null;
        } else {
            this.sourceTool = str3;
        }
        if ((i & 8) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str4;
        }
        if ((i & 16) == 0) {
            this.resolved = false;
        } else {
            this.resolved = z;
        }
    }
}
