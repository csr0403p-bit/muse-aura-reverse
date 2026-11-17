package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.status.viewmodel.HatchStatusPillUiState;
import com.facebook.aura.status.viewmodel.HatchStatusPillViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$2$1", f = "HatchStatusPill.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $avatarVisible;
    public final /* synthetic */ C1BO<HatchStatusPillUiState> $headerState$delegate;
    public final /* synthetic */ HatchStatusPillViewModel $headerViewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$2$1(boolean z, HatchStatusPillViewModel hatchStatusPillViewModel, C1BO<HatchStatusPillUiState> c1bo, HtJ<? super HatchStatusPillKt$HatchStatusPill$2$1> htJ) {
        super(2, htJ);
        this.$avatarVisible = z;
        this.$headerViewModel = hatchStatusPillViewModel;
        this.$headerState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusPillKt$HatchStatusPill$2$1(this.$avatarVisible, this.$headerViewModel, this.$headerState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.$avatarVisible && this.$headerState$delegate.getValue().milestoneVideoUrl != null) {
            this.$headerViewModel.clearMilestoneVideo();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusPillKt$HatchStatusPill$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
