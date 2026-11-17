package com.facebook.aura.feed.view;

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
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$3$1", f = "FeedTabScreen.kt", l = {302}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Integer> $handledScrollToTopToken$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ C1BO<FeedViewModel.FeedUiState> $uiState$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$3$1(LazyListState lazyListState, C1BO<FeedViewModel.FeedUiState> c1bo, MutableState<Integer> mutableState, HtJ<? super FeedTabScreenKt$FeedTabScreen$3$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$uiState$delegate = c1bo;
        this.$handledScrollToTopToken$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedTabScreen$3$1(this.$listState, this.$uiState$delegate, this.$handledScrollToTopToken$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$uiState$delegate.getValue().scrollToTopToken > MutableState.A02((MutableState) this.$handledScrollToTopToken$delegate)) {
                MutableState.A07(this.$uiState$delegate.getValue().scrollToTopToken, this.$handledScrollToTopToken$delegate);
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
        return ((FeedTabScreenKt$FeedTabScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
