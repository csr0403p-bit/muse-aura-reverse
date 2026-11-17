package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardSection;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$9 extends AbstractC7559F3s implements G0U<IdeaCard, Unit> {
    public final /* synthetic */ IdeaCardSection $section;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaCard ideaCard) {
        C7384Etj.A0Y(ideaCard, 0);
        this.$viewModel.recordIdeaCardImpression(ideaCard, AnonymousClass006.A0x(this.$section.layout));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$9(HatchExploreViewModel hatchExploreViewModel, IdeaCardSection ideaCardSection) {
        super(1);
        this.$viewModel = hatchExploreViewModel;
        this.$section = ideaCardSection;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard) {
        invoke2(ideaCard);
        return Unit.INSTANCE;
    }
}
