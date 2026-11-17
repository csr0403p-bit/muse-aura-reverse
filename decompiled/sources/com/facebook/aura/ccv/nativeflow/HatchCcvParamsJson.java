package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
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
public final class HatchCcvParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final HatchCcvAmountJson amount;

    public final class Companion {
        public final C9hr<HatchCcvParamsJson> serializer() {
            return HatchCcvParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCcvParamsJson hatchCcvParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchCcvParamsJson.amount != null) {
            c9j5.AAP(hatchCcvParamsJson.amount, HatchCcvAmountJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCcvParamsJson) && C7384Etj.areEqual(this.amount, ((HatchCcvParamsJson) obj).amount));
    }

    public static /* synthetic */ HatchCcvParamsJson copy$default(HatchCcvParamsJson hatchCcvParamsJson, HatchCcvAmountJson hatchCcvAmountJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchCcvAmountJson = hatchCcvParamsJson.amount;
        }
        return new HatchCcvParamsJson(hatchCcvAmountJson);
    }

    public final HatchCcvAmountJson component1() {
        return this.amount;
    }

    public final HatchCcvParamsJson copy(HatchCcvAmountJson hatchCcvAmountJson) {
        return new HatchCcvParamsJson(hatchCcvAmountJson);
    }

    public final HatchCcvAmountJson getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.amount);
    }

    public /* synthetic */ HatchCcvParamsJson(int i, HatchCcvAmountJson hatchCcvAmountJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = hatchCcvAmountJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchCcvParamsJson(HatchCcvAmountJson hatchCcvAmountJson) {
        this.amount = hatchCcvAmountJson;
    }

    public /* synthetic */ HatchCcvParamsJson(HatchCcvAmountJson hatchCcvAmountJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchCcvAmountJson);
    }

    public HatchCcvParamsJson() {
        this(null);
    }
}
