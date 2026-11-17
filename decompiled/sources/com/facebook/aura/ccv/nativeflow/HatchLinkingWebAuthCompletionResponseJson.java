package com.facebook.aura.ccv.nativeflow;

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
/* loaded from: classes4.dex */
public final class HatchLinkingWebAuthCompletionResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String next_action;

    public final class Companion {
        public final C9hr<HatchLinkingWebAuthCompletionResponseJson> serializer() {
            return HatchLinkingWebAuthCompletionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchLinkingWebAuthCompletionResponseJson hatchLinkingWebAuthCompletionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchLinkingWebAuthCompletionResponseJson.next_action != null) {
            c9j5.AAP(hatchLinkingWebAuthCompletionResponseJson.next_action, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchLinkingWebAuthCompletionResponseJson) && C7384Etj.areEqual(this.next_action, ((HatchLinkingWebAuthCompletionResponseJson) obj).next_action));
    }

    public static /* synthetic */ HatchLinkingWebAuthCompletionResponseJson copy$default(HatchLinkingWebAuthCompletionResponseJson hatchLinkingWebAuthCompletionResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkingWebAuthCompletionResponseJson.next_action;
        }
        return new HatchLinkingWebAuthCompletionResponseJson(str);
    }

    public final String component1() {
        return this.next_action;
    }

    public final HatchLinkingWebAuthCompletionResponseJson copy(String str) {
        return new HatchLinkingWebAuthCompletionResponseJson(str);
    }

    public final String getNext_action() {
        return this.next_action;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.next_action);
    }

    public /* synthetic */ HatchLinkingWebAuthCompletionResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.next_action = null;
        } else {
            this.next_action = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchLinkingWebAuthCompletionResponseJson(String str) {
        this.next_action = str;
    }

    public /* synthetic */ HatchLinkingWebAuthCompletionResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public HatchLinkingWebAuthCompletionResponseJson() {
        this(null);
    }
}
