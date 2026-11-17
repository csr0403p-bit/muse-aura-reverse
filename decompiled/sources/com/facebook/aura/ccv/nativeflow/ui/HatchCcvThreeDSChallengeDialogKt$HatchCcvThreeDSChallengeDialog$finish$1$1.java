package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$finish$1$1 extends AbstractC7559F3s implements G0U<HatchThreeDSChallengeResult, Unit> {
    public final /* synthetic */ C1BO<G0U<HatchThreeDSChallengeResult, Unit>> $currentOnFinished$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        C7384Etj.A0Y(hatchThreeDSChallengeResult, 0);
        C1BO.A0B(this.$currentOnFinished$delegate).invoke(hatchThreeDSChallengeResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$finish$1$1(C1BO<? extends G0U<? super HatchThreeDSChallengeResult, Unit>> c1bo) {
        super(1);
        this.$currentOnFinished$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchThreeDSChallengeResult hatchThreeDSChallengeResult) {
        invoke2(hatchThreeDSChallengeResult);
        return Unit.INSTANCE;
    }
}
