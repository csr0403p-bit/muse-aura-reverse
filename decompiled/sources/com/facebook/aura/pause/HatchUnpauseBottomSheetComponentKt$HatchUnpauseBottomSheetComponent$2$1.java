package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pause.HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1", f = "HatchUnpauseBottomSheetComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ MutableState<Boolean> $hasEnrollment$delegate;
    public final /* synthetic */ String $hatchlingId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, MutableState<Boolean> mutableState, HtJ<? super HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1> htJ) {
        super(2, htJ);
        this.$hatchlingId = str;
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$hasEnrollment$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1(this.$hatchlingId, this.$enrollmentViewModel, this.$hasEnrollment$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (AnonymousClass002.A1b(this.$hasEnrollment$delegate.getValue(), true) && (str = this.$hatchlingId) != null) {
            this.$enrollmentViewModel.preparePause(str);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
