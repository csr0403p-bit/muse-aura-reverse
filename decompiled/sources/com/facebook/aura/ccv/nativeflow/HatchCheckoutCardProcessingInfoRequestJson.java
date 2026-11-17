package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutCardProcessingInfoRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String credential_id;
    public final String upl_session_id;

    public final class Companion {
        public final C9hr<HatchCheckoutCardProcessingInfoRequestJson> serializer() {
            return HatchCheckoutCardProcessingInfoRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutCardProcessingInfoRequestJson hatchCheckoutCardProcessingInfoRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchCheckoutCardProcessingInfoRequestJson.credential_id, c9iZ, 0);
        c9j5.AAV(hatchCheckoutCardProcessingInfoRequestJson.upl_session_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutCardProcessingInfoRequestJson) {
                HatchCheckoutCardProcessingInfoRequestJson hatchCheckoutCardProcessingInfoRequestJson = (HatchCheckoutCardProcessingInfoRequestJson) obj;
                if (!C7384Etj.areEqual(this.credential_id, hatchCheckoutCardProcessingInfoRequestJson.credential_id) || !C7384Etj.areEqual(this.upl_session_id, hatchCheckoutCardProcessingInfoRequestJson.upl_session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutCardProcessingInfoRequestJson copy$default(HatchCheckoutCardProcessingInfoRequestJson hatchCheckoutCardProcessingInfoRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutCardProcessingInfoRequestJson.credential_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutCardProcessingInfoRequestJson.upl_session_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchCheckoutCardProcessingInfoRequestJson(str, str2);
    }

    public final String component1() {
        return this.credential_id;
    }

    public final String component2() {
        return this.upl_session_id;
    }

    public final String getCredential_id() {
        return this.credential_id;
    }

    public final String getUpl_session_id() {
        return this.upl_session_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.upl_session_id, AnonymousClass001.A0G(this.credential_id));
    }

    public HatchCheckoutCardProcessingInfoRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.credential_id = str;
        this.upl_session_id = str2;
    }

    public final HatchCheckoutCardProcessingInfoRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchCheckoutCardProcessingInfoRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutCardProcessingInfoRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchCheckoutCardProcessingInfoRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.credential_id = str;
        this.upl_session_id = str2;
    }
}
