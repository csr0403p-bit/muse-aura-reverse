package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$10$12$1", f = "FeedTabScreen.kt", l = {513}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$12$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $showOpeningUnitOverlay$delegate;
    public final /* synthetic */ C1BO<FeedViewModel.FeedUiState> $uiState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$12$1(C1BO<FeedViewModel.FeedUiState> c1bo, MutableState<Boolean> mutableState, HtJ<? super FeedTabScreenKt$FeedTabScreen$10$12$1> htJ) {
        super(2, htJ);
        this.$uiState$delegate = c1bo;
        this.$showOpeningUnitOverlay$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedTabScreen$10$12$1(this.$uiState$delegate, this.$showOpeningUnitOverlay$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$uiState$delegate.getValue().isOpeningUnit) {
                MutableState.A09(false, this.$showOpeningUnitOverlay$delegate);
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (C7Bq.A01(200L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$showOpeningUnitOverlay$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedTabScreenKt$FeedTabScreen$10$12$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
