package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$24$1$1 extends C7438Evz implements G0U<HatchThreeDSChallengeResult, Unit> {
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$24$1$1(Object obj) {
        super(1, obj, HatchCcvViewModel.class, "onThreeDSChallengeFinished", "onThreeDSChallengeFinished(Lcom/facebook/aura/ccv/nativeflow/HatchThreeDSChallengeResult;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        ((HatchCcvViewModel) AnonymousClass006.A0o(hatchThreeDSChallengeResult, this)).onThreeDSChallengeFinished(hatchThreeDSChallengeResult);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        invoke2(hatchThreeDSChallengeResult);
        return Unit.INSTANCE;
    }
}
