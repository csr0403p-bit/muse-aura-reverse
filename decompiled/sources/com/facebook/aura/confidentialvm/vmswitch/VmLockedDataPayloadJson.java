package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VmLockedDataPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cvm_env_id;

    public final class Companion {
        public final C9hr<VmLockedDataPayloadJson> serializer() {
            return VmLockedDataPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(VmLockedDataPayloadJson vmLockedDataPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || vmLockedDataPayloadJson.cvm_env_id != null) {
            c9j5.AAP(vmLockedDataPayloadJson.cvm_env_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmLockedDataPayloadJson) && C7384Etj.areEqual(this.cvm_env_id, ((VmLockedDataPayloadJson) obj).cvm_env_id));
    }

    public static /* synthetic */ VmLockedDataPayloadJson copy$default(VmLockedDataPayloadJson vmLockedDataPayloadJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmLockedDataPayloadJson.cvm_env_id;
        }
        return new VmLockedDataPayloadJson(str);
    }

    public final String component1() {
        return this.cvm_env_id;
    }

    public final VmLockedDataPayloadJson copy(String str) {
        return new VmLockedDataPayloadJson(str);
    }

    public final String getCvm_env_id() {
        return this.cvm_env_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.cvm_env_id);
    }

    public /* synthetic */ VmLockedDataPayloadJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cvm_env_id = null;
        } else {
            this.cvm_env_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public VmLockedDataPayloadJson(String str) {
        this.cvm_env_id = str;
    }

    public /* synthetic */ VmLockedDataPayloadJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public VmLockedDataPayloadJson() {
        this(null);
    }
}
