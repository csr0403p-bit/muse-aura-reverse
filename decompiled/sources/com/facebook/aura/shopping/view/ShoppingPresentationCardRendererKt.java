package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C31u;
import X.C60O;
import X.C78N;
import X.G0V;
import X.G0W;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.conversation.view.HatchExternalLinkCardKt;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardContext;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.ExternalLinkPresentation;
import com.facebook.aura.model.ExternalLinkPresentationData;
import com.facebook.aura.model.ShoppingResultsPresentationData;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.view.MC;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ShoppingPresentationCardRendererKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(ShoppingPresentationCardRendererKt.class, "shoppingResultPdpEnabled", "getShoppingResultPdpEnabled()Z", 1);
    public static final C31u shoppingResultPdpEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp);

    /* renamed from: com.facebook.aura.shopping.view.ShoppingPresentationCardRendererKt$CheckoutOfferLinkCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationPresentationCardContext $context;
        public final /* synthetic */ ExternalLinkPresentationData $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ExternalLinkPresentationData externalLinkPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, int i, int i2) {
            super(2);
            this.$data = externalLinkPresentationData;
            this.$context = conversationPresentationCardContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingPresentationCardRendererKt.CheckoutOfferLinkCard(this.$data, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingPresentationCardRendererKt$ShoppingResultsPresentationCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationPresentationCardContext $context;
        public final /* synthetic */ ShoppingResultsPresentationData $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingResultsPresentationData shoppingResultsPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, int i, int i2) {
            super(2);
            this.$data = shoppingResultsPresentationData;
            this.$context = conversationPresentationCardContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingPresentationCardRendererKt.ShoppingResultsPresentationCard(this.$data, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void CheckoutOfferLinkCard(ExternalLinkPresentationData externalLinkPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgThen;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-452680298);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(externalLinkPresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationPresentationCardContext, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            ShoppingCheckoutLogContext shoppingCheckoutLogContextRememberCheckoutOfferLogContext = ShoppingCheckoutImpressionKt.rememberCheckoutOfferLogContext(externalLinkPresentationData.externalLink, conversationPresentationCardContext.hostMessageId, HatchInteractionEnumsKt.chatScreen(conversationPresentationCardContext.sessionId == null), bfm, ExternalLinkPresentation.$stable);
            String str = externalLinkPresentationData.externalLink.url;
            if (shoppingCheckoutLogContextRememberCheckoutOfferLogContext == null) {
                bfm.AgE(399021002);
                i3 = 0;
                BBI.A0R((BBI) bfm, false);
                bRgThen = bRg2;
            } else {
                bfm.AgE(399069734);
                bRgThen = bRg2.then(ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(shoppingCheckoutLogContextRememberCheckoutOfferLogContext, null, null, bfm, 0, 6)).then(ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(shoppingCheckoutLogContextRememberCheckoutOfferLogContext, HatchShoppingControl.CHECKOUT_OFFER_LINK, null, bfm, 48, 4));
                i3 = 0;
                BBI.A0R((BBI) bfm, false);
            }
            long j = conversationPresentationCardContext.containerBackgroundColor;
            C1D3 c1d3 = conversationPresentationCardContext.containerShape;
            boolean zA65 = bfm.A65(shoppingCheckoutLogContextRememberCheckoutOfferLogContext);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ShoppingPresentationCardRendererKt$CheckoutOfferLinkCard$1$1(shoppingCheckoutLogContextRememberCheckoutOfferLogContext);
                bfm.Ai0(objAaT);
            }
            HatchExternalLinkCardKt.m594HatchExternalLinkCardy8DT0do(str, bRgThen, j, null, null, c1d3, null, (Function0) objAaT, bfm, i3, 88);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(externalLinkPresentationData, conversationPresentationCardContext, bRg2, i, i2);
        }
    }

    public static final void ShoppingResultsPresentationCard(ShoppingResultsPresentationData shoppingResultsPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1686401857);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultsPresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationPresentationCardContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ShoppingResultsPresentation shoppingResultsPresentation = shoppingResultsPresentationData.shoppingResults;
            String str = conversationPresentationCardContext.presentationId;
            String str2 = conversationPresentationCardContext.sessionId;
            String str3 = conversationPresentationCardContext.hostMessageId;
            String str4 = shoppingResultsPresentation.widgetId;
            String strShoppingReplyPresentationEventId = ShoppingResultsPresentationKt.shoppingReplyPresentationEventId(conversationPresentationCardContext.presentationEventId);
            boolean zA1R = AnonymousClass001.A1R(bfm, strShoppingReplyPresentationEventId, AnonymousClass005.A1T(bfm, str3, str4, str, AnonymousClass005.A1T(bfm, abstractC3358CGzA0h, contextA0H, str2, bfm.A65(auraNavigatorA0b))));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ShoppingPresentationCardRendererKt$ShoppingResultsPresentationCard$onProductClick$1$1(auraNavigatorA0b, abstractC3358CGzA0h, str2, str3, str, shoppingResultsPresentation, strShoppingReplyPresentationEventId, str4, contextA0H);
                bfm.Ai0(objAaT);
            }
            HatchShoppingResultsCardKt.m2039HatchShoppingResultsCardCcamzx0(shoppingResultsPresentation, (G0W) objAaT, str3, strShoppingReplyPresentationEventId, bRg2, conversationPresentationCardContext.containerBackgroundColor, conversationPresentationCardContext.containerShape, str2, str, bfm, (iA05 << 6) & 57344, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(shoppingResultsPresentationData, conversationPresentationCardContext, bRg2, i, i2);
        }
    }

    public static final boolean getShoppingResultPdpEnabled() {
        return AnonymousClass001.A1X(C31u.A00(shoppingResultPdpEnabled$delegate, $$delegatedProperties));
    }
}
