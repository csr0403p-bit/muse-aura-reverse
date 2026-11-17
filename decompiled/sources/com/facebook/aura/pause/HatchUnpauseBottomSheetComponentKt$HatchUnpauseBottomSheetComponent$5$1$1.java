package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$5$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ String $hatchlingId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.$hatchlingId;
        if (str2 != null) {
            this.$enrollmentViewModel.enrollAndUnpause(str2, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$5$1$1(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel) {
        super(1);
        this.$hatchlingId = str;
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
