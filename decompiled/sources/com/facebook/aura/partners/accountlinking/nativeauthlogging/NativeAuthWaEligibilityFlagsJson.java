package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class NativeAuthWaEligibilityFlagsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean is_eligible_to_link_to_linked_fb;
    public final boolean is_eligible_to_link_to_linked_ig;
    public final boolean is_eligible_to_link_to_linked_rl;
    public final boolean is_eligible_to_link_to_linked_th;
    public final boolean is_eligible_to_link_to_unlinked_fb;
    public final boolean is_eligible_to_link_to_unlinked_ig;
    public final boolean is_eligible_to_link_to_unlinked_rl;
    public final boolean is_eligible_to_link_to_unlinked_th;

    public final class Companion {
        public final C9hr<NativeAuthWaEligibilityFlagsJson> serializer() {
            return NativeAuthWaEligibilityFlagsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ NativeAuthWaEligibilityFlagsJson copy$default(NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        boolean z9 = z;
        boolean z10 = z2;
        boolean z11 = z3;
        boolean z12 = z4;
        boolean z13 = z5;
        boolean z14 = z6;
        boolean z15 = z7;
        boolean z16 = z8;
        if ((i & 1) != 0) {
            z9 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_fb;
        }
        if ((i & 2) != 0) {
            z10 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_fb;
        }
        if ((i & 4) != 0) {
            z11 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_ig;
        }
        if ((i & 8) != 0) {
            z12 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_ig;
        }
        if ((i & 16) != 0) {
            z13 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_rl;
        }
        if ((i & 32) != 0) {
            z14 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_rl;
        }
        if ((i & 64) != 0) {
            z15 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_th;
        }
        if ((i & 128) != 0) {
            z16 = nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_th;
        }
        return new NativeAuthWaEligibilityFlagsJson(z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_fb) {
            c9j5.AA7(c9iZ, 0, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_fb);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_fb) {
            c9j5.AA7(c9iZ, 1, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_fb);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_ig) {
            c9j5.AA7(c9iZ, 2, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_ig);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_ig) {
            c9j5.AA7(c9iZ, 3, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_ig);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_rl) {
            c9j5.AA7(c9iZ, 4, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_rl);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_rl) {
            c9j5.AA7(c9iZ, 5, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_rl);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_th) {
            c9j5.AA7(c9iZ, 6, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_th);
        }
        if (zAfR || nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_th) {
            c9j5.AA7(c9iZ, 7, nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_th);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeAuthWaEligibilityFlagsJson) {
                NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson = (NativeAuthWaEligibilityFlagsJson) obj;
                if (this.is_eligible_to_link_to_linked_fb != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_fb || this.is_eligible_to_link_to_unlinked_fb != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_fb || this.is_eligible_to_link_to_linked_ig != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_ig || this.is_eligible_to_link_to_unlinked_ig != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_ig || this.is_eligible_to_link_to_linked_rl != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_rl || this.is_eligible_to_link_to_unlinked_rl != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_rl || this.is_eligible_to_link_to_linked_th != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_linked_th || this.is_eligible_to_link_to_unlinked_th != nativeAuthWaEligibilityFlagsJson.is_eligible_to_link_to_unlinked_th) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.is_eligible_to_link_to_linked_fb;
    }

    public final boolean component2() {
        return this.is_eligible_to_link_to_unlinked_fb;
    }

    public final boolean component3() {
        return this.is_eligible_to_link_to_linked_ig;
    }

    public final boolean component4() {
        return this.is_eligible_to_link_to_unlinked_ig;
    }

    public final boolean component5() {
        return this.is_eligible_to_link_to_linked_rl;
    }

    public final boolean component6() {
        return this.is_eligible_to_link_to_unlinked_rl;
    }

    public final boolean component7() {
        return this.is_eligible_to_link_to_linked_th;
    }

    public final boolean component8() {
        return this.is_eligible_to_link_to_unlinked_th;
    }

    public final NativeAuthWaEligibilityFlagsJson copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new NativeAuthWaEligibilityFlagsJson(z, z2, z3, z4, z5, z6, z7, z8);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.is_eligible_to_link_to_linked_fb), this.is_eligible_to_link_to_unlinked_fb), this.is_eligible_to_link_to_linked_ig), this.is_eligible_to_link_to_unlinked_ig), this.is_eligible_to_link_to_linked_rl), this.is_eligible_to_link_to_unlinked_rl), this.is_eligible_to_link_to_linked_th), this.is_eligible_to_link_to_unlinked_th);
    }

    public final boolean is_eligible_to_link_to_linked_fb() {
        return this.is_eligible_to_link_to_linked_fb;
    }

    public final boolean is_eligible_to_link_to_linked_ig() {
        return this.is_eligible_to_link_to_linked_ig;
    }

    public final boolean is_eligible_to_link_to_linked_rl() {
        return this.is_eligible_to_link_to_linked_rl;
    }

    public final boolean is_eligible_to_link_to_linked_th() {
        return this.is_eligible_to_link_to_linked_th;
    }

    public final boolean is_eligible_to_link_to_unlinked_fb() {
        return this.is_eligible_to_link_to_unlinked_fb;
    }

    public final boolean is_eligible_to_link_to_unlinked_ig() {
        return this.is_eligible_to_link_to_unlinked_ig;
    }

    public final boolean is_eligible_to_link_to_unlinked_rl() {
        return this.is_eligible_to_link_to_unlinked_rl;
    }

    public final boolean is_eligible_to_link_to_unlinked_th() {
        return this.is_eligible_to_link_to_unlinked_th;
    }

    public NativeAuthWaEligibilityFlagsJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.is_eligible_to_link_to_linked_fb = z;
        this.is_eligible_to_link_to_unlinked_fb = z2;
        this.is_eligible_to_link_to_linked_ig = z3;
        this.is_eligible_to_link_to_unlinked_ig = z4;
        this.is_eligible_to_link_to_linked_rl = z5;
        this.is_eligible_to_link_to_unlinked_rl = z6;
        this.is_eligible_to_link_to_linked_th = z7;
        this.is_eligible_to_link_to_unlinked_th = z8;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeAuthWaEligibilityFlagsJson(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4), AnonymousClass005.A1Q(i, z5), (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, C3cH.A1N(i, z8));
    }

    public /* synthetic */ NativeAuthWaEligibilityFlagsJson(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.is_eligible_to_link_to_linked_fb = false;
        } else {
            this.is_eligible_to_link_to_linked_fb = z;
        }
        if ((i & 2) == 0) {
            this.is_eligible_to_link_to_unlinked_fb = false;
        } else {
            this.is_eligible_to_link_to_unlinked_fb = z2;
        }
        if ((i & 4) == 0) {
            this.is_eligible_to_link_to_linked_ig = false;
        } else {
            this.is_eligible_to_link_to_linked_ig = z3;
        }
        if ((i & 8) == 0) {
            this.is_eligible_to_link_to_unlinked_ig = false;
        } else {
            this.is_eligible_to_link_to_unlinked_ig = z4;
        }
        if ((i & 16) == 0) {
            this.is_eligible_to_link_to_linked_rl = false;
        } else {
            this.is_eligible_to_link_to_linked_rl = z5;
        }
        if ((i & 32) == 0) {
            this.is_eligible_to_link_to_unlinked_rl = false;
        } else {
            this.is_eligible_to_link_to_unlinked_rl = z6;
        }
        if ((i & 64) == 0) {
            this.is_eligible_to_link_to_linked_th = false;
        } else {
            this.is_eligible_to_link_to_linked_th = z7;
        }
        if ((i & 128) == 0) {
            this.is_eligible_to_link_to_unlinked_th = false;
        } else {
            this.is_eligible_to_link_to_unlinked_th = z8;
        }
    }

    public NativeAuthWaEligibilityFlagsJson() {
        this(false, false, false, false, false, false, false, false);
    }
}
