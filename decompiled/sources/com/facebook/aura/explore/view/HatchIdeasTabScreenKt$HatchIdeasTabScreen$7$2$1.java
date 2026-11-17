package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.feedback.FeedbackReason;
import com.facebook.aura.feedback.view.IdeaFeedbackAnalytics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$2$1 extends AbstractC7559F3s implements G0V<FeedbackReason, String, Unit> {
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ MutableState<String> $reasonPromptCardId$delegate;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$2$1(String str, HatchExploreViewModel hatchExploreViewModel, MutableState<String> mutableState) {
        super(2);
        this.$ideaCardId = str;
        this.$viewModel = hatchExploreViewModel;
        this.$reasonPromptCardId$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedbackReason feedbackReason, String str) {
        invoke2(feedbackReason, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FeedbackReason feedbackReason, String str) {
        AnonymousClass003.A0u(feedbackReason, str);
        this.$reasonPromptCardId$delegate.Af8(null);
        IdeaFeedbackAnalytics.INSTANCE.logReasonClick(this.$ideaCardId, feedbackReason);
        this.$viewModel.submitFeedback(this.$ideaCardId, IdeaFeedback.DOWN, str);
    }
}
