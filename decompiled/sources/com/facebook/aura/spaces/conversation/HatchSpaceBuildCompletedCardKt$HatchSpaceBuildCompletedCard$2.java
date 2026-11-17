package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.model.SpaceBuildCompletedPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ SpaceBuildCompletedPresentation $card;
    public final /* synthetic */ String $iconImageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpaceBuildCompletedCardKt$HatchSpaceBuildCompletedCard$2(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, String str) {
        super(2);
        this.$card = spaceBuildCompletedPresentation;
        this.$iconImageUrl = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            SpaceBuildCompletedPresentation spaceBuildCompletedPresentation = this.$card;
            HatchSpaceBuildCompletedCardKt.SpaceCardOverflowButton(spaceBuildCompletedPresentation.slug, spaceBuildCompletedPresentation.name, this.$iconImageUrl, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
    }
}
