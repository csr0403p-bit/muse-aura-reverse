package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ C1BO<String> $passphrase$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$5$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, C1BO<String> c1bo) {
        super(0);
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$passphrase$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String strA08;
        String strCurrentHatchlingId = this.$enrollmentViewModel.currentHatchlingId();
        if (strCurrentHatchlingId == null || (strA08 = C1BO.A08(this.$passphrase$delegate)) == null) {
            return;
        }
        this.$enrollmentViewModel.enrollWithoutBiometric(strCurrentHatchlingId, strA08);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
