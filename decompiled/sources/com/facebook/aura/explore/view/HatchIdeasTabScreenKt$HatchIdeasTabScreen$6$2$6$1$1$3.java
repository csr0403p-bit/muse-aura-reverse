package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$3 extends AbstractC7559F3s implements G0V<IdeaCard, Integer, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onCardClick;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$3(HatchExploreViewModel hatchExploreViewModel, G0U<? super String, Unit> g0u) {
        super(2);
        this.$viewModel = hatchExploreViewModel;
        this.$onCardClick = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard, Integer num) {
        invoke(ideaCard, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IdeaCard ideaCard, int i) {
        C7384Etj.A0Y(ideaCard, 0);
        HatchIdeasTabScreenKt.logIdeaCardClick(ideaCard.ideaCardId, i);
        this.$viewModel.recordIdeaCardClick(ideaCard.ideaCardId, HatchIdeasTabScreenKt.CARD_TYPE);
        this.$onCardClick.invoke(ideaCard.ideaCardId);
    }
}
