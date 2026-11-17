package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
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
public final class FeedTabScreenKt$FeedTabScreen$dismissEditor$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $editorRevealed$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$dismissEditor$1$1(FeedViewModel feedViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.$viewModel = feedViewModel;
        this.$editorRevealed$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.FEED, HatchSubsurface.FEED_PROMPT_EDITOR, HatchScreen.FEED_HOME, HatchComponent.FEED_PROMPT_EDITOR, null, null);
        this.$viewModel.discardDraft();
        MutableState.A09(false, this.$editorRevealed$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
