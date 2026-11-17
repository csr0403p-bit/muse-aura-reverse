package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPausedOverlayKt$HatchPausedOverlayContent$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchPauseViewModel $pauseViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPausedOverlayKt$HatchPausedOverlayContent$5$1$1(HatchPauseViewModel hatchPauseViewModel) {
        super(0);
        this.$pauseViewModel = hatchPauseViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pauseViewModel.dismissErrorDialog();
    }
}
