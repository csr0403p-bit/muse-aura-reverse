package com.facebook.aura.vmdisabled;

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
/* loaded from: classes2.dex */
public final class VmReenableContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String flow;

    public final class Companion {
        public final C9hr<VmReenableContentJson> serializer() {
            return VmReenableContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmdisabled_vmdisabled(VmReenableContentJson vmReenableContentJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || vmReenableContentJson.flow != null) {
            c9j5.AAP(vmReenableContentJson.flow, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmReenableContentJson) && C7384Etj.areEqual(this.flow, ((VmReenableContentJson) obj).flow));
    }

    public static /* synthetic */ VmReenableContentJson copy$default(VmReenableContentJson vmReenableContentJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmReenableContentJson.flow;
        }
        return new VmReenableContentJson(str);
    }

    public final String component1() {
        return this.flow;
    }

    public final VmReenableContentJson copy(String str) {
        return new VmReenableContentJson(str);
    }

    public final String getFlow() {
        return this.flow;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.flow);
    }

    public /* synthetic */ VmReenableContentJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.flow = null;
        } else {
            this.flow = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public VmReenableContentJson(String str) {
        this.flow = str;
    }

    public /* synthetic */ VmReenableContentJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public VmReenableContentJson() {
        this(null);
    }
}
