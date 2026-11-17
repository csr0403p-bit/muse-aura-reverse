package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.pause.HatchPauseEnrollmentDestination;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1", f = "HatchPauseBottomSheetComponent.kt", l = {203}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<HatchPauseEnrollmentDestination> $currentDestination$delegate;
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ AuraSheetState $sheetState;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, C1BO<? extends HatchPauseEnrollmentDestination> c1bo, AuraSheetState auraSheetState, HtJ<? super HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1> htJ) {
        super(2, htJ);
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$currentDestination$delegate = c1bo;
        this.$sheetState = auraSheetState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1 hatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1(this.$enrollmentViewModel, this.$currentDestination$delegate, this.$sheetState, htJ);
        hatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1.L$0 = obj;
        return hatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$currentDestination$delegate.getValue() instanceof HatchPauseEnrollmentDestination.EnrollmentComplete) {
                AuraSheetState auraSheetState = this.$sheetState;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (auraSheetState.hide(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$enrollmentViewModel.showPauseConfirmDialog();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
