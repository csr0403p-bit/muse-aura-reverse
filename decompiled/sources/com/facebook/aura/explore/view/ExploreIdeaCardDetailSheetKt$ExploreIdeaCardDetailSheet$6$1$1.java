package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.G0V;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.model.IdeaCardDetailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6$1$1 extends AbstractC7559F3s implements G0V<String, Boolean, Unit> {
    public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ IdeaCardDetailViewModel $detailViewModel;
    public final /* synthetic */ String $ideaCardId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$6$1$1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, IdeaCardDetailViewModel ideaCardDetailViewModel) {
        super(2);
        this.$analyticsSurface = hatchSurface;
        this.$analyticsSubsurface = hatchSubsurface;
        this.$ideaCardId = str;
        this.$detailViewModel = ideaCardDetailViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, boolean z) {
        AnonymousClass006.A0b(str).logToggle(z, this.$analyticsSurface, this.$analyticsSubsurface, HatchScreen.IDEA_DETAIL, HatchComponent.IDEA_INCLUDED_ITEM, null, AnonymousClass007.A0d(HatchMetadataKey.IDEA_ITEM_ID.getValue(), str, new HxE(HatchMetadataKey.IDEA_CARD_ID.getValue(), this.$ideaCardId)));
        this.$detailViewModel.setItemSelected(str, z);
    }
}
