package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$8$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel) {
        super(0);
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String strCurrentHatchlingId = this.$enrollmentViewModel.currentHatchlingId();
        if (strCurrentHatchlingId != null) {
            this.$enrollmentViewModel.preparePause(strCurrentHatchlingId);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
