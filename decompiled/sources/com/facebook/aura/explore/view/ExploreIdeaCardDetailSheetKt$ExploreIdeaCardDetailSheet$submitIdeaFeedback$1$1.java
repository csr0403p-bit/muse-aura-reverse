package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$submitIdeaFeedback$1$1 extends AbstractC7559F3s implements G0U<IdeaFeedback, Unit> {
    public final /* synthetic */ HatchSubsurface $analyticsFeedbackSubsurface;
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$submitIdeaFeedback$1$1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, HatchExploreViewModel hatchExploreViewModel) {
        super(1);
        this.$analyticsSurface = hatchSurface;
        this.$analyticsFeedbackSubsurface = hatchSubsurface;
        this.$ideaCardId = str;
        this.$viewModel = hatchExploreViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaFeedback ideaFeedback) {
        AnonymousClass006.A0b(ideaFeedback).logClick(this.$analyticsSurface, this.$analyticsFeedbackSubsurface, HatchScreen.IDEA_DETAIL, ideaFeedback == IdeaFeedback.UP ? HatchComponent.THUMBS_UP : HatchComponent.THUMBS_DOWN, null, AnonymousClass006.A10(HatchMetadataKey.IDEA_CARD_ID.getValue(), this.$ideaCardId), null);
        this.$viewModel.submitFeedback(this.$ideaCardId, ideaFeedback, null);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaFeedback ideaFeedback) {
        invoke2(ideaFeedback);
        return Unit.INSTANCE;
    }
}
