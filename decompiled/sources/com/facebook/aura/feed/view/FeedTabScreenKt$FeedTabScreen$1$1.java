package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.Au3;
import X.C1805ArO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedPrompt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$1$1", f = "FeedTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isEditorRevealed;
    public final /* synthetic */ MutableState<String> $promptSeed$delegate;
    public final /* synthetic */ MutableState<C1805ArO> $promptText$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$1$1(boolean z, FeedViewModel feedViewModel, MutableState<String> mutableState, MutableState<C1805ArO> mutableState2, HtJ<? super FeedTabScreenKt$FeedTabScreen$1$1> htJ) {
        super(2, htJ);
        this.$isEditorRevealed = z;
        this.$viewModel = feedViewModel;
        this.$promptSeed$delegate = mutableState;
        this.$promptText$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedTabScreen$1$1(this.$isEditorRevealed, this.$viewModel, this.$promptSeed$delegate, this.$promptText$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$isEditorRevealed) {
            FeedViewModel.FeedUiState value = this.$viewModel.uiState.getValue();
            FeedPrompt feedPrompt = value.prompt;
            if (feedPrompt == null || (str = feedPrompt.fullPrompt) == null) {
                str = "";
            }
            String strBuildFeedPromptSeed = FeedInstructionsEditorKt.buildFeedPromptSeed(str, value.draftInstructions);
            this.$promptSeed$delegate.Af8(strBuildFeedPromptSeed);
            this.$promptText$delegate.Af8(new C1805ArO(strBuildFeedPromptSeed, Au3.A01));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedTabScreenKt$FeedTabScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
