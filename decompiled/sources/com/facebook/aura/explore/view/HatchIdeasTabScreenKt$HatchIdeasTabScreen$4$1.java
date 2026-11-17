package com.facebook.aura.explore.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.ExploreLoadingState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1", f = "HatchIdeasTabScreen.kt", l = {256}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<HatchExploreViewModel.IdeasUiState> $ideasState$delegate;
    public final /* synthetic */ LazyListState $listState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1(LazyListState lazyListState, C1BO<HatchExploreViewModel.IdeasUiState> c1bo, HtJ<? super HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$ideasState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1(this.$listState, this.$ideasState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$ideasState$delegate.getValue().loadingState == ExploreLoadingState.REFRESHING || this.$ideasState$delegate.getValue().loadingState == ExploreLoadingState.REFRESH_SILENTLY) {
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
