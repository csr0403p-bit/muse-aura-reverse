package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass005;
import com.facebook.aura.ccv.nativeflow.HatchCcvResult;

/* loaded from: classes3.dex */
public final class PendingThreeDSChallenge {
    public final String billingCountry;
    public final HatchCcvResult.ThreeDSStepUpRequired stepUpRequired;
    public final String uplSessionId;

    public final String getBillingCountry() {
        return this.billingCountry;
    }

    public final HatchCcvResult.ThreeDSStepUpRequired getStepUpRequired() {
        return this.stepUpRequired;
    }

    public final String getUplSessionId() {
        return this.uplSessionId;
    }

    public PendingThreeDSChallenge(HatchCcvResult.ThreeDSStepUpRequired threeDSStepUpRequired, String str, String str2) {
        AnonymousClass005.A0x(threeDSStepUpRequired, str, str2);
        this.stepUpRequired = threeDSStepUpRequired;
        this.uplSessionId = str;
        this.billingCountry = str2;
    }
}
