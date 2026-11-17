package com.facebook.aura.explore.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.B1V;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.G0U;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardLayout;
import com.facebook.aura.explore.repo.IdeaCardSection;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
    public final /* synthetic */ G0U<String, Unit> $finishDismissal;
    public final /* synthetic */ C1BO<HatchExploreViewModel.IdeasUiState> $ideasState$delegate;
    public final /* synthetic */ G0U<String, Unit> $onCardClick;
    public final /* synthetic */ MutableState<String> $swipingIdeaCardId;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("ideas_title", "ideas_title", ComposableSingletons$HatchIdeasTabScreenKt.f51lambda$957648717);
        AHD<IdeaCardSection> ahd = this.$ideasState$delegate.getValue().sections;
        MutableState<String> mutableState = this.$swipingIdeaCardId;
        MutableState<String> mutableState2 = this.$dismissedIdeaCardId;
        C1BO<HatchExploreViewModel.IdeasUiState> c1bo = this.$ideasState$delegate;
        HatchExploreViewModel hatchExploreViewModel = this.$viewModel;
        G0U<String, Unit> g0u = this.$onCardClick;
        G0U<String, Unit> g0u2 = this.$finishDismissal;
        int i = 0;
        for (Object obj : ahd) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            IdeaCardSection ideaCardSection = (IdeaCardSection) obj;
            boolean z = true;
            if (i > 0) {
                IdeaCard ideaCard = (IdeaCard) AbstractC0878AGe.A0I(((IdeaCardSection) c1bo.getValue().sections.get(i - 1)).cards);
                String str = ideaCard != null ? ideaCard.ideaCardId : null;
                IdeaCard ideaCard2 = (IdeaCard) AbstractC0878AGe.A0G(ideaCardSection.cards);
                c0cd.APJ(FGI.A0M("section_divider:", ideaCardSection.sectionId), "section_divider", B1V.A01(new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$1(mutableState, new HxE(str, ideaCard2 != null ? ideaCard2.ideaCardId : null)), -41145529, true));
            }
            if (ideaCardSection.title.length() > 0 && ideaCardSection.layout != IdeaCardLayout.IDEAS) {
                c0cd.APJ(FGI.A0M("section_title:", ideaCardSection.sectionId), "section_title", B1V.A01(new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$2(ideaCardSection, i), -322019522, true));
            }
            if (i != 0) {
                z = false;
            }
            HatchIdeasTabScreenKt.ideaListSection(c0cd, ideaCardSection, z, c1bo.getValue().executionStatuses, mutableState, new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$3(hatchExploreViewModel, g0u), HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$4.INSTANCE, HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$5.INSTANCE, new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$6(hatchExploreViewModel), new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$7(mutableState), new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$8(mutableState2, hatchExploreViewModel), new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$9(hatchExploreViewModel, ideaCardSection), mutableState2, new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$10(g0u2));
            i = i2;
        }
        if (this.$ideasState$delegate.getValue().hasMore) {
            c0cd.APJ("loading_more", "loading_more", ComposableSingletons$HatchIdeasTabScreenKt.f50lambda$228990024);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1(C1BO<HatchExploreViewModel.IdeasUiState> c1bo, MutableState<String> mutableState, MutableState<String> mutableState2, HatchExploreViewModel hatchExploreViewModel, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$ideasState$delegate = c1bo;
        this.$swipingIdeaCardId = mutableState;
        this.$dismissedIdeaCardId = mutableState2;
        this.$viewModel = hatchExploreViewModel;
        this.$onCardClick = g0u;
        this.$finishDismissal = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
