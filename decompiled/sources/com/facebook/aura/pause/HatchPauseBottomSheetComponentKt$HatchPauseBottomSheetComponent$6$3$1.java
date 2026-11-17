package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.pause.HatchPauseEnrollmentDestination;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$3$1 extends AbstractC7559F3s implements G0U<HatchPauseEnrollmentDestination, Unit> {
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination) {
        C7384Etj.A0Y(hatchPauseEnrollmentDestination, 0);
        this.$enrollmentViewModel.navigateTo(hatchPauseEnrollmentDestination);
        if (hatchPauseEnrollmentDestination instanceof HatchPauseEnrollmentDestination.SaveRecoveryKey) {
            this.$enrollmentViewModel.ensurePassphrase();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$3$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel) {
        super(1);
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination) {
        invoke2(hatchPauseEnrollmentDestination);
        return Unit.INSTANCE;
    }
}
