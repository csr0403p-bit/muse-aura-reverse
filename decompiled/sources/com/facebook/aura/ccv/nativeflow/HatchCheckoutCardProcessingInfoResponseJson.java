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
public final class HatchCheckoutCardProcessingInfoResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String card_action_state;

    public final class Companion {
        public final C9hr<HatchCheckoutCardProcessingInfoResponseJson> serializer() {
            return HatchCheckoutCardProcessingInfoResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutCardProcessingInfoResponseJson hatchCheckoutCardProcessingInfoResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchCheckoutCardProcessingInfoResponseJson.card_action_state != null) {
            c9j5.AAP(hatchCheckoutCardProcessingInfoResponseJson.card_action_state, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCheckoutCardProcessingInfoResponseJson) && C7384Etj.areEqual(this.card_action_state, ((HatchCheckoutCardProcessingInfoResponseJson) obj).card_action_state));
    }

    public static /* synthetic */ HatchCheckoutCardProcessingInfoResponseJson copy$default(HatchCheckoutCardProcessingInfoResponseJson hatchCheckoutCardProcessingInfoResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutCardProcessingInfoResponseJson.card_action_state;
        }
        return new HatchCheckoutCardProcessingInfoResponseJson(str);
    }

    public final String component1() {
        return this.card_action_state;
    }

    public final HatchCheckoutCardProcessingInfoResponseJson copy(String str) {
        return new HatchCheckoutCardProcessingInfoResponseJson(str);
    }

    public final String getCard_action_state() {
        return this.card_action_state;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.card_action_state);
    }

    public /* synthetic */ HatchCheckoutCardProcessingInfoResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.card_action_state = null;
        } else {
            this.card_action_state = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchCheckoutCardProcessingInfoResponseJson(String str) {
        this.card_action_state = str;
    }

    public /* synthetic */ HatchCheckoutCardProcessingInfoResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public HatchCheckoutCardProcessingInfoResponseJson() {
        this(null);
    }
}
