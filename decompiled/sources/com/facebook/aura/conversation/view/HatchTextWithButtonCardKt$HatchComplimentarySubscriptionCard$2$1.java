package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.model.TextWithButtonCta;
import com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics;
import com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$2$1 extends AbstractC7559F3s implements G0V<Integer, TextWithButtonCta, Unit> {
    public final /* synthetic */ Map<String, String> $analyticsMetadata;
    public final /* synthetic */ ComplimentaryRedeemAnalytics.Attribution $attribution;
    public final /* synthetic */ ComplimentarySubscriptionRedemptionController $controller;
    public final /* synthetic */ G0V<Integer, TextWithButtonCta, Unit> $onButtonClick;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ Integer $redemptionButtonIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$2$1(Integer num, ComplimentaryRedeemAnalytics.Attribution attribution, String str, Map<String, String> map, ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController, G0V<? super Integer, ? super TextWithButtonCta, Unit> g0v) {
        super(2);
        this.$redemptionButtonIndex = num;
        this.$attribution = attribution;
        this.$presentationId = str;
        this.$analyticsMetadata = map;
        this.$controller = complimentarySubscriptionRedemptionController;
        this.$onButtonClick = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, TextWithButtonCta textWithButtonCta) {
        invoke(AnonymousClass001.A0F(num), textWithButtonCta);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, TextWithButtonCta textWithButtonCta) {
        C7384Etj.A0Y(textWithButtonCta, 1);
        Integer num = this.$redemptionButtonIndex;
        if (num != null && i == num.intValue()) {
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            ComplimentaryRedeemAnalytics.Attribution attribution = this.$attribution;
            hatchInteractionLogger.logClick(attribution.surface, attribution.subsurface, attribution.screen, HatchComponent.COMPLIMENTARY_SUBSCRIPTION_CARD, this.$presentationId, this.$analyticsMetadata, null);
            this.$controller.redeem(this.$presentationId);
            return;
        }
        G0V<Integer, TextWithButtonCta, Unit> g0v = this.$onButtonClick;
        if (g0v == null) {
            return;
        }
        g0v.invoke(Integer.valueOf(i), textWithButtonCta);
    }
}
