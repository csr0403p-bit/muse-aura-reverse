package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$8 extends AbstractC7559F3s implements G0W<IdeaCard, Integer, IdeaFeedback, Unit> {
    public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$8(MutableState<String> mutableState, HatchExploreViewModel hatchExploreViewModel) {
        super(3);
        this.$dismissedIdeaCardId = mutableState;
        this.$viewModel = hatchExploreViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard, Integer num, IdeaFeedback ideaFeedback) {
        invoke(ideaCard, AnonymousClass001.A0F(num), ideaFeedback);
        return Unit.INSTANCE;
    }

    public final void invoke(IdeaCard ideaCard, int i, IdeaFeedback ideaFeedback) {
        AnonymousClass003.A0v(ideaCard, ideaFeedback);
        HatchIdeasTabScreenKt.logIdeaCardSwipe(ideaCard.ideaCardId, i);
        HatchIdeasTabScreenKt.logIdeaFeedback(ideaCard.ideaCardId, i, ideaFeedback, HatchSubsurface.SWIPE_ACTIONS);
        if (ideaFeedback == IdeaFeedback.DOWN) {
            this.$dismissedIdeaCardId.Af8(ideaCard.ideaCardId);
        }
        this.$viewModel.submitFeedback(ideaCard.ideaCardId, ideaFeedback, null);
    }
}
