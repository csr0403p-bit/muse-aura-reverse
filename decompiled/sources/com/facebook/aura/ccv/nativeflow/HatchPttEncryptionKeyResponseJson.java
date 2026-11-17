package com.facebook.aura.ccv.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchPttEncryptionKeyResponseJson extends C06G {
    public final boolean dev_external;
    public final String id;
    public final String platform_trust_token;
    public final List<String> trust_chain;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, HatchPttEncryptionKeyResponseJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<HatchPttEncryptionKeyResponseJson> serializer() {
            return HatchPttEncryptionKeyResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPttEncryptionKeyResponseJson(List<String> list, String str, String str2, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.trust_chain = list;
        this.id = str;
        this.platform_trust_token = str2;
        this.dev_external = z;
    }

    public final HatchPttEncryptionKeyResponseJson copy(List<String> list, String str, String str2, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new HatchPttEncryptionKeyResponseJson(list, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPttEncryptionKeyResponseJson) {
                HatchPttEncryptionKeyResponseJson hatchPttEncryptionKeyResponseJson = (HatchPttEncryptionKeyResponseJson) obj;
                if (!C7384Etj.areEqual(this.trust_chain, hatchPttEncryptionKeyResponseJson.trust_chain) || !C7384Etj.areEqual(this.id, hatchPttEncryptionKeyResponseJson.id) || !C7384Etj.areEqual(this.platform_trust_token, hatchPttEncryptionKeyResponseJson.platform_trust_token) || this.dev_external != hatchPttEncryptionKeyResponseJson.dev_external) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPttEncryptionKeyResponseJson copy$default(HatchPttEncryptionKeyResponseJson hatchPttEncryptionKeyResponseJson, List list, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchPttEncryptionKeyResponseJson.trust_chain;
        }
        if ((i & 2) != 0) {
            str = hatchPttEncryptionKeyResponseJson.id;
        }
        if ((i & 4) != 0) {
            str2 = hatchPttEncryptionKeyResponseJson.platform_trust_token;
        }
        if ((i & 8) != 0) {
            z = hatchPttEncryptionKeyResponseJson.dev_external;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchPttEncryptionKeyResponseJson(list, str, str2, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchPttEncryptionKeyResponseJson hatchPttEncryptionKeyResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(hatchPttEncryptionKeyResponseJson.trust_chain)) {
            c9j5.AAQ(hatchPttEncryptionKeyResponseJson.trust_chain, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || hatchPttEncryptionKeyResponseJson.id != null) {
            c9j5.AAP(hatchPttEncryptionKeyResponseJson.id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchPttEncryptionKeyResponseJson.platform_trust_token != null) {
            c9j5.AAP(hatchPttEncryptionKeyResponseJson.platform_trust_token, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchPttEncryptionKeyResponseJson.dev_external) {
            c9j5.AA7(c9iZ, 3, hatchPttEncryptionKeyResponseJson.dev_external);
        }
    }

    public final List<String> component1() {
        return this.trust_chain;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.platform_trust_token;
    }

    public final boolean component4() {
        return this.dev_external;
    }

    public final boolean getDev_external() {
        return this.dev_external;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlatform_trust_token() {
        return this.platform_trust_token;
    }

    public final List<String> getTrust_chain() {
        return this.trust_chain;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0E(this.trust_chain) + AnonymousClass006.A0G(this.id)) * 31) + AnonymousClass005.A0H(this.platform_trust_token)) * 31, this.dev_external);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPttEncryptionKeyResponseJson(int i, List list, String str, String str2, boolean z, C2hx c2hx) {
        this.trust_chain = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.platform_trust_token = null;
        } else {
            this.platform_trust_token = str2;
        }
        if ((i & 8) == 0) {
            this.dev_external = false;
        } else {
            this.dev_external = z;
        }
    }

    public /* synthetic */ HatchPttEncryptionKeyResponseJson(List list, String str, String str2, boolean z, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, AnonymousClass005.A1P(i, z));
    }

    public HatchPttEncryptionKeyResponseJson() {
        this(C0881AGi.A00, null, null, false);
    }
}
