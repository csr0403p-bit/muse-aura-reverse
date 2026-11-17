package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.pause.HatchPauseViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.pause.HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1", f = "HatchUnpauseBottomSheetComponent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ C1BO<HatchPauseViewModel.PauseUiState> $pauseState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1(Function0<Unit> function0, Context context, C1BO<? extends HatchPauseViewModel.PauseUiState> c1bo, HtJ<? super HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1> htJ) {
        super(2, htJ);
        this.$onDismiss = function0;
        this.$context = context;
        this.$pauseState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1(this.$onDismiss, this.$context, this.$pauseState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchPauseViewModel.PauseUiState value = this.$pauseState$delegate.getValue();
        if (C7384Etj.areEqual(value, HatchPauseViewModel.PauseUiState.Unlocked.INSTANCE) || (value instanceof HatchPauseViewModel.PauseUiState.Failed)) {
            this.$onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchUnpauseBottomSheetComponentKt$HatchUnpauseBottomSheetComponent$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
