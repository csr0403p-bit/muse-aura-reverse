package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.pause.HatchPauseViewModel;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1", f = "HatchPauseBottomSheetComponent.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ C1BO<HatchPauseViewModel.PauseUiState> $pauseState$delegate;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, Function0<Unit> function0, Context context, C1BO<? extends HatchPauseViewModel.PauseUiState> c1bo, HtJ<? super HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1> htJ) {
        super(2, htJ);
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$onDismiss = function0;
        this.$context = context;
        this.$pauseState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1(this.$enrollmentViewModel, this.$onDismiss, this.$context, this.$pauseState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPauseViewModel.PauseUiState value = this.$pauseState$delegate.getValue();
            if (!C7384Etj.areEqual(value, HatchPauseViewModel.PauseUiState.Success.INSTANCE)) {
                if (value instanceof HatchPauseViewModel.PauseUiState.Failed) {
                }
                return Unit.INSTANCE;
            }
            String strCurrentHatchlingId = this.$enrollmentViewModel.currentHatchlingId();
            if (strCurrentHatchlingId != null) {
                HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel = this.$enrollmentViewModel;
                this.L$0 = value;
                this.L$1 = null;
                this.label = 1;
                if (hatchPauseEnrollmentViewModel.clearTemporaryData(strCurrentHatchlingId, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$onDismiss.invoke();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
