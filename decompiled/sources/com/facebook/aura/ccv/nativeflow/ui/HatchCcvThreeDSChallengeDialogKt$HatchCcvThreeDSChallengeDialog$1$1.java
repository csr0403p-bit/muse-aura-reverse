package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ OneShot<HatchThreeDSChallengeResult> $finish;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$1$1(OneShot<HatchThreeDSChallengeResult> oneShot) {
        super(0);
        this.$finish = oneShot;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$finish.invoke2((OneShot<HatchThreeDSChallengeResult>) HatchThreeDSChallengeResult.DISMISSED);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
