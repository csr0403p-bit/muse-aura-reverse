package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1805ArO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $editorRevealed$delegate;
    public final /* synthetic */ MutableState<C1805ArO> $promptText$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$2$1(FeedViewModel feedViewModel, MutableState<C1805ArO> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$viewModel = feedViewModel;
        this.$promptText$delegate = mutableState;
        this.$editorRevealed$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_PROMPT_EDITOR, HatchScreen.FEED_HOME, HatchComponent.FEED_PROMPT_SAVE, null, null, null);
        this.$viewModel.saveFullPrompt(AnonymousClass002.A0l(MutableState.A04((MutableState) this.$promptText$delegate)));
        MutableState.A09(false, this.$editorRevealed$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
