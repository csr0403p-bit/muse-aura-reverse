package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C1062ATq;
import X.C10G;
import X.C1Cd;
import X.C3U4;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$4$1$1$1$1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
    public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
    public final /* synthetic */ String $promptDisplayText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$4$1$1$1$1(String str, Function0<Unit> function0, Function0<Unit> function02) {
        super(3);
        this.$promptDisplayText = str;
        this.$onInstructionsEditClick = function0;
        this.$onInstructionsGotItClick = function02;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
            String str = this.$promptDisplayText;
            Function0<Unit> function0 = this.$onInstructionsEditClick;
            Function0<Unit> function02 = this.$onInstructionsGotItClick;
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingMedium;
            FeedInstructionsPromptCardKt.FeedInstructionsPromptCard(str, function0, function02, HatchImpressionModifierKt.hatchImpression(C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, 0.0f, 0.0f, f), HatchOrigin.FEED, HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_CARD, FeedTabScreenKt.FEED_INSTRUCTIONS_CARD_ID, null, null, 500L, 0.0f, null, null, null), bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
