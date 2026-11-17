package com.facebook.aura.feed.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.ui.HatchHighlightGlowKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$3$1", f = "FeedTabScreen.kt", l = {937}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Integer> $handledHighlightToken$delegate;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ MutableState<String> $highlightedUnitId$delegate;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$3$1(FeedViewModel.FeedUiState feedUiState, AT5<Float, AOW> at5, MutableState<Integer> mutableState, MutableState<String> mutableState2, HtJ<? super FeedTabScreenKt$FeedList$3$1> htJ) {
        super(2, htJ);
        this.$uiState = feedUiState;
        this.$highlightGlowAlpha = at5;
        this.$handledHighlightToken$delegate = mutableState;
        this.$highlightedUnitId$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedList$3$1(this.$uiState, this.$highlightGlowAlpha, this.$handledHighlightToken$delegate, this.$highlightedUnitId$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            FeedViewModel.FeedUiState feedUiState = this.$uiState;
            String str = feedUiState.scrollToUnitId;
            if (str != null && feedUiState.scrollToUnitToken > MutableState.A02((MutableState) this.$handledHighlightToken$delegate)) {
                MutableState.A07(this.$uiState.scrollToUnitToken, this.$handledHighlightToken$delegate);
                this.$highlightedUnitId$delegate.Af8(str);
                AT5<Float, AOW> at5 = this.$highlightGlowAlpha;
                this.L$0 = null;
                this.label = 1;
                if (HatchHighlightGlowKt.playHighlightGlow(at5, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$highlightedUnitId$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedTabScreenKt$FeedList$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
