package com.facebook.aura.explore.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BQI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$executeIdea$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ boolean $canExecute;
    public final /* synthetic */ String $chatDetailDismissKey;
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ IdeaCardDetailOrigin $origin;
    public final /* synthetic */ BQI<String> $selectedItemIds;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$executeIdea$1$1(boolean z, BQI<String> bqi, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, HatchExploreViewModel hatchExploreViewModel, IdeaCardDetailOrigin ideaCardDetailOrigin, String str2) {
        super(0);
        this.$canExecute = z;
        this.$selectedItemIds = bqi;
        this.$analyticsSurface = hatchSurface;
        this.$analyticsSubsurface = hatchSubsurface;
        this.$ideaCardId = str;
        this.$viewModel = hatchExploreViewModel;
        this.$origin = ideaCardDetailOrigin;
        this.$chatDetailDismissKey = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$canExecute) {
            List<String> listA0W = AbstractC0878AGe.A0W(this.$selectedItemIds);
            if (listA0W.isEmpty()) {
                listA0W = null;
            }
            HatchInteractionLogger.INSTANCE.logClick(this.$analyticsSurface, this.$analyticsSubsurface, HatchScreen.IDEA_DETAIL, HatchComponent.IDEA_CARD_EXECUTE, null, AnonymousClass006.A10(HatchMetadataKey.IDEA_CARD_ID.getValue(), this.$ideaCardId), null);
            HatchExploreViewModel hatchExploreViewModel = this.$viewModel;
            String str = this.$ideaCardId;
            IdeaCardDetailOrigin ideaCardDetailOrigin = this.$origin;
            hatchExploreViewModel.executeCard(str, listA0W, ideaCardDetailOrigin, ideaCardDetailOrigin == IdeaCardDetailOrigin.CHAT ? this.$chatDetailDismissKey : null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
