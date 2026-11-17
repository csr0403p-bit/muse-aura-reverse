package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardContext;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.model.ExternalLinkPresentationData;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.ShoppingCartPresentationData;
import com.facebook.aura.model.ShoppingResultsPresentationData;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.model.ShoppingCartPresentationKt;
import com.facebook.aura.shopping.model.ShoppingCollection;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ShoppingPresentationCardRenderer implements ConversationPresentationCardRenderer {
    public static final ShoppingPresentationCardRenderer INSTANCE = new ShoppingPresentationCardRenderer();

    /* renamed from: com.facebook.aura.shopping.view.ShoppingPresentationCardRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationPresentationCardContext $context;
        public final /* synthetic */ HatchPresentationData $data;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, int i) {
            super(2);
            this.$data = hatchPresentationData;
            this.$context = conversationPresentationCardContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingPresentationCardRenderer.this.Render(this.$data, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer
    public boolean canRender(HatchPresentationData hatchPresentationData) {
        C7384Etj.A0Y(hatchPresentationData, 0);
        return (hatchPresentationData instanceof ShoppingResultsPresentationData) || (hatchPresentationData instanceof ShoppingCartPresentationData) || ((hatchPresentationData instanceof ExternalLinkPresentationData) && ((ExternalLinkPresentationData) hatchPresentationData).externalLink.shoppingCheckout != null);
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer
    public void Render(HatchPresentationData hatchPresentationData, ConversationPresentationCardContext conversationPresentationCardContext, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A10(hatchPresentationData, conversationPresentationCardContext, bRg);
        bfm.AgG(345857468);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchPresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationPresentationCardContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (hatchPresentationData instanceof ShoppingResultsPresentationData) {
                bfm.AgE(-186498588);
                ShoppingResultsPresentationData shoppingResultsPresentationData = (ShoppingResultsPresentationData) hatchPresentationData;
                ShoppingCollection shoppingCollection = shoppingResultsPresentationData.shoppingResults.shoppingCollection;
                if (shoppingCollection == null) {
                    bfm.AgE(-186420964);
                    ShoppingPresentationCardRendererKt.ShoppingResultsPresentationCard(shoppingResultsPresentationData, conversationPresentationCardContext, bRg, bfm, AnonymousClass002.A07(iA05, ShoppingResultsPresentationData.$stable | (iA05 & 14) | (ConversationPresentationCardContext.$stable << 3)), 0);
                } else {
                    bfm.AgE(-186296065);
                    HatchShoppingCollectionCardKt.m2036HatchShoppingCollectionCardCcamzx0(shoppingResultsPresentationData.shoppingResults, shoppingCollection, conversationPresentationCardContext.presentationId, ShoppingResultsPresentationKt.shoppingReplyPresentationEventId(conversationPresentationCardContext.presentationEventId), conversationPresentationCardContext.hostMessageId, conversationPresentationCardContext.containerBackgroundColor, conversationPresentationCardContext.containerShape, conversationPresentationCardContext.sessionId, bRg, bfm, (iA05 << 18) & 234881024, 0);
                }
                AnonymousClass001.A1D(bfm);
            } else if (hatchPresentationData instanceof ShoppingCartPresentationData) {
                bfm.AgE(1656577880);
                ShoppingCartPresentation shoppingCartPresentation = ((ShoppingCartPresentationData) hatchPresentationData).shoppingCart;
                HatchShoppingCartCardKt.m2034HatchShoppingCartCard1YH7lEI(shoppingCartPresentation, ShoppingCartPresentationKt.toCardUiModel(shoppingCartPresentation.cart), conversationPresentationCardContext.presentationId, conversationPresentationCardContext.hostMessageId, conversationPresentationCardContext.sessionId, conversationPresentationCardContext.containerBackgroundColor, conversationPresentationCardContext.containerShape, bRg, bfm, (iA05 << 15) & 29360128, 0);
            } else if (hatchPresentationData instanceof ExternalLinkPresentationData) {
                bfm.AgE(1656593382);
                ShoppingPresentationCardRendererKt.CheckoutOfferLinkCard((ExternalLinkPresentationData) hatchPresentationData, conversationPresentationCardContext, bRg, bfm, AnonymousClass002.A07(iA05, ExternalLinkPresentationData.$stable | (iA05 & 14) | (ConversationPresentationCardContext.$stable << 3)), 0);
            } else {
                bfm.AgE(1656596160);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchPresentationData, conversationPresentationCardContext, bRg, i);
        }
    }
}
