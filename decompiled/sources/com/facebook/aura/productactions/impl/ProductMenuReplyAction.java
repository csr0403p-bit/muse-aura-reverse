package com.facebook.aura.productactions.impl;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.C06H;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.HwB;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiStateKt;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.model.ShoppingProductSource;

/* loaded from: classes4.dex */
public final class ProductMenuReplyAction implements ProductMenuAction {
    public final ConversationItemActionContext context;
    public final HatchGatewayConnection gateway;
    public final ProductMenuActionId id;
    public final ShoppingProductSource source;
    public final C1BN<ProductMenuActionUiState> uiState;
    public static final Companion Companion = new Companion();
    public static final int $stable = (HatchGatewayConnection.$stable | ShoppingProductSource.$stable) | ConversationItemActionContext.$stable;

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public void perform(ProductMenuActionHost productMenuActionHost) {
        C7384Etj.A0Y(productMenuActionHost, 0);
        ReplyContext replyContextCurrentReply = currentReply();
        productMenuActionHost.dismiss.invoke();
        if (replyContextCurrentReply != null) {
            ShoppingConversationItemActionsKt.logItem(this.context, HatchComponent.REPLY_BUTTON, false);
            if (productMenuActionHost.navigator.currentKey(true) instanceof ProductItemsScreenKey) {
                productMenuActionHost.navigator.popLast(1);
            }
            ResultEventBus resultEventBus = productMenuActionHost.resultBus;
            String str = this.context.sessionId;
            if (str == null) {
                str = "primary_session_id";
            }
            resultEventBus.sendResult(HatchConversationUiStateKt.replyContextResultKey(str), replyContextCurrentReply);
        }
    }

    public final class Companion {
        public final ProductMenuReplyAction create(ConversationItemActionContext conversationItemActionContext, HatchGatewayConnection hatchGatewayConnection, C3UX c3ux) {
            AnonymousClass005.A0x(conversationItemActionContext, hatchGatewayConnection, c3ux);
            ShoppingProductSource shoppingProductSource = conversationItemActionContext.source;
            if (shoppingProductSource != null) {
                return new ProductMenuReplyAction(conversationItemActionContext, shoppingProductSource, hatchGatewayConnection, c3ux);
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReplyContext currentReply() {
        return ShoppingProductReplyKt.productReplyContext(this.context.product, this.source, this.gateway.getCurrentReplyElementSupport());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductMenuActionUiState row(boolean z, boolean z2) {
        if (z || z2) {
            return new ProductMenuActionUiState(getId(), R.string._name_removed__res_0x7f12056c, R.drawable.arrow_big_reply_wght400_outline_24, z, false);
        }
        return null;
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public ProductMenuActionId getId() {
        return this.id;
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public C1BN<ProductMenuActionUiState> getUiState() {
        return this.uiState;
    }

    public ProductMenuReplyAction(ConversationItemActionContext conversationItemActionContext, ShoppingProductSource shoppingProductSource, HatchGatewayConnection hatchGatewayConnection, C3UX c3ux) {
        this.context = conversationItemActionContext;
        this.source = shoppingProductSource;
        this.gateway = hatchGatewayConnection;
        this.id = ProductMenuActionId.REPLY;
        ProductMenuActionUiState productMenuActionUiStateRow = row(AnonymousClass002.A1X(currentReply()), false);
        HatchGatewayConnection hatchGatewayConnection2 = this.gateway;
        this.uiState = AnonymousClass441.A00(productMenuActionUiStateRow, c3ux, new HwB(productMenuActionUiStateRow, new ProductMenuReplyAction$uiState$1$2(this, null), C3rb.A03(new ProductMenuReplyAction$uiState$1$1(this, null), hatchGatewayConnection2.protocol.replyElementSupport, hatchGatewayConnection2.connectionState)), C3Ek.A00);
    }

    public /* synthetic */ ProductMenuReplyAction(ConversationItemActionContext conversationItemActionContext, ShoppingProductSource shoppingProductSource, HatchGatewayConnection hatchGatewayConnection, C3UX c3ux, C06H c06h) {
        this(conversationItemActionContext, shoppingProductSource, hatchGatewayConnection, c3ux);
    }
}
