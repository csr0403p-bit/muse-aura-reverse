package com.facebook.aura.network.acs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AcsProofJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String c;
    public final String s;

    public final class Companion {
        public final C9hr<AcsProofJson> serializer() {
            return AcsProofJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(AcsProofJson acsProofJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(acsProofJson.c)) {
            c9j5.AAV(acsProofJson.c, c9iZ, 0);
        }
        if (zAfR || !"".equals(acsProofJson.s)) {
            c9j5.AAV(acsProofJson.s, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcsProofJson) {
                AcsProofJson acsProofJson = (AcsProofJson) obj;
                if (!C7384Etj.areEqual(this.c, acsProofJson.c) || !C7384Etj.areEqual(this.s, acsProofJson.s)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AcsProofJson copy$default(AcsProofJson acsProofJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsProofJson.c;
        }
        if ((i & 2) != 0) {
            str2 = acsProofJson.s;
        }
        AnonymousClass003.A0u(str, str2);
        return new AcsProofJson(str, str2);
    }

    public final String component1() {
        return this.c;
    }

    public final String component2() {
        return this.s;
    }

    public final String getC() {
        return this.c;
    }

    public final String getS() {
        return this.s;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.s, AnonymousClass001.A0G(this.c));
    }

    public AcsProofJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.c = str;
        this.s = str2;
    }

    public final AcsProofJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AcsProofJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AcsProofJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 2) == 0) {
            this.s = "";
        } else {
            this.s = str2;
        }
    }

    public /* synthetic */ AcsProofJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public AcsProofJson() {
        this("", "");
    }
}
