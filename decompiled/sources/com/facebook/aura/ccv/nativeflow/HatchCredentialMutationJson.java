package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCredentialMutationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String credential_id;
    public final HatchCheckoutErrorJson error;
    public final HatchCheckoutNextActionJson next_action;
    public final boolean success;

    public final class Companion {
        public final C9hr<HatchCredentialMutationJson> serializer() {
            return HatchCredentialMutationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCredentialMutationJson() {
        this(false, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCredentialMutationJson hatchCredentialMutationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCredentialMutationJson.success) {
            c9j5.AA7(c9iZ, 0, hatchCredentialMutationJson.success);
        }
        if (zAfR || hatchCredentialMutationJson.credential_id != null) {
            c9j5.AAP(hatchCredentialMutationJson.credential_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchCredentialMutationJson.error != null) {
            c9j5.AAP(hatchCredentialMutationJson.error, HatchCheckoutErrorJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || hatchCredentialMutationJson.next_action != null) {
            c9j5.AAP(hatchCredentialMutationJson.next_action, HatchCheckoutNextActionJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCredentialMutationJson) {
                HatchCredentialMutationJson hatchCredentialMutationJson = (HatchCredentialMutationJson) obj;
                if (this.success != hatchCredentialMutationJson.success || !C7384Etj.areEqual(this.credential_id, hatchCredentialMutationJson.credential_id) || !C7384Etj.areEqual(this.error, hatchCredentialMutationJson.error) || !C7384Etj.areEqual(this.next_action, hatchCredentialMutationJson.next_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCredentialMutationJson copy$default(HatchCredentialMutationJson hatchCredentialMutationJson, boolean z, String str, HatchCheckoutErrorJson hatchCheckoutErrorJson, HatchCheckoutNextActionJson hatchCheckoutNextActionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchCredentialMutationJson.success;
        }
        if ((i & 2) != 0) {
            str = hatchCredentialMutationJson.credential_id;
        }
        if ((i & 4) != 0) {
            hatchCheckoutErrorJson = hatchCredentialMutationJson.error;
        }
        if ((i & 8) != 0) {
            hatchCheckoutNextActionJson = hatchCredentialMutationJson.next_action;
        }
        return new HatchCredentialMutationJson(z, str, hatchCheckoutErrorJson, hatchCheckoutNextActionJson);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.credential_id;
    }

    public final HatchCheckoutErrorJson component3() {
        return this.error;
    }

    public final HatchCheckoutNextActionJson component4() {
        return this.next_action;
    }

    public final HatchCredentialMutationJson copy(boolean z, String str, HatchCheckoutErrorJson hatchCheckoutErrorJson, HatchCheckoutNextActionJson hatchCheckoutNextActionJson) {
        return new HatchCredentialMutationJson(z, str, hatchCheckoutErrorJson, hatchCheckoutNextActionJson);
    }

    public final String getCredential_id() {
        return this.credential_id;
    }

    public final HatchCheckoutErrorJson getError() {
        return this.error;
    }

    public final HatchCheckoutNextActionJson getNext_action() {
        return this.next_action;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return ((((C0KA.A02(this.success) + AnonymousClass006.A0G(this.credential_id)) * 31) + AnonymousClass006.A0D(this.error)) * 31) + C3cH.A02(this.next_action);
    }

    public String toString() {
        return super.toString();
    }

    public HatchCredentialMutationJson(boolean z, String str, HatchCheckoutErrorJson hatchCheckoutErrorJson, HatchCheckoutNextActionJson hatchCheckoutNextActionJson) {
        this.success = z;
        this.credential_id = str;
        this.error = hatchCheckoutErrorJson;
        this.next_action = hatchCheckoutNextActionJson;
    }

    public /* synthetic */ HatchCredentialMutationJson(boolean z, String str, HatchCheckoutErrorJson hatchCheckoutErrorJson, HatchCheckoutNextActionJson hatchCheckoutNextActionJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : hatchCheckoutErrorJson, (i & 8) != 0 ? null : hatchCheckoutNextActionJson);
    }

    public /* synthetic */ HatchCredentialMutationJson(int i, boolean z, String str, HatchCheckoutErrorJson hatchCheckoutErrorJson, HatchCheckoutNextActionJson hatchCheckoutNextActionJson, C2hx c2hx) {
        this.success = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.credential_id = null;
        } else {
            this.credential_id = str;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = hatchCheckoutErrorJson;
        }
        if ((i & 8) == 0) {
            this.next_action = null;
        } else {
            this.next_action = hatchCheckoutNextActionJson;
        }
    }
}
