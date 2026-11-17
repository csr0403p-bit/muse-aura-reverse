package com.facebook.aura.productactions.impl;

import X.AEs;
import X.AEu;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.BFI;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C3Ej;
import X.C3Ek;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.productactions.impl.ProductMenuReplyAction;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ProductItemMenuViewModel extends AEs {
    public static final int $stable = 8;
    public final List<ProductMenuAction> actions;
    public final String previewImageUrl;
    public final C1BN<ProductItemMenuUiState> uiState;

    public final class Factory extends AuraViewModelFactory<ProductItemMenuViewModel> {
        public static final int $stable = 8;
        public final ConversationItemActionContext context;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ProductItemMenuViewModel create() {
            return new ProductItemMenuViewModel(this.context, this.userSession);
        }

        public Factory(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(conversationItemActionContext, abstractC3358CGz);
            this.context = conversationItemActionContext;
            this.userSession = abstractC3358CGz;
        }
    }

    public ProductItemMenuViewModel(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(conversationItemActionContext, abstractC3358CGz);
        ShoppingResultProduct shoppingResultProduct = conversationItemActionContext.product;
        this.previewImageUrl = (!shoppingResultProduct.isImageAvailable || shoppingResultProduct.isUnavailable) ? null : shoppingResultProduct.imageUrl;
        ProductMenuReplyAction.Companion companion = ProductMenuReplyAction.Companion;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        List<ProductMenuAction> listA0F = BFI.A0F(new ProductMenuAction[]{companion.create(conversationItemActionContext, HatchGatewayConnection.Companion.getInstance(abstractC3358CGz), AEu.A00(this)), ProductMenuSaveAction.Companion.create(conversationItemActionContext, abstractC3358CGz, AEu.A00(this)), ProductMenuShareAction.Companion.create(conversationItemActionContext, abstractC3358CGz, AEu.A00(this))});
        this.actions = listA0F;
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0F);
        Iterator<ProductMenuAction> it = listA0F.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().getUiState());
        }
        ProductItemMenuViewModel$special$$inlined$combine$1 productItemMenuViewModel$special$$inlined$combine$1 = new ProductItemMenuViewModel$special$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayListA0m).toArray(new C20Q[0]), this);
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        List<ProductMenuAction> list = this.actions;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<ProductMenuAction> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().getUiState().getValue());
        }
        this.uiState = AnonymousClass441.A00(state(arrayListA0m2), bllA00, productItemMenuViewModel$special$$inlined$combine$1, c3Ej);
        if (conversationItemActionContext.isChip) {
            ShoppingConversationItemActionsKt.logItem(conversationItemActionContext, null, zA1a);
        }
    }

    public final C1BN<ProductItemMenuUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.productactions.impl.ProductItemMenuUiState state(java.util.List<com.facebook.aura.productactions.impl.ProductMenuActionUiState> r10) {
        /*
            r9 = this;
            java.util.List r5 = X.AbstractC0878AGe.A0U(r10)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L3d
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L3d
        Le:
            r4 = 0
        Lf:
            java.lang.String r3 = r9.previewImageUrl
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r5)
            java.util.Iterator r1 = r5.iterator()
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r5 = r1.next()
            com.facebook.aura.productactions.impl.ProductMenuActionUiState r5 = (com.facebook.aura.productactions.impl.ProductMenuActionUiState) r5
            boolean r0 = r5.enabled
            if (r0 == 0) goto L2c
            r9 = 1
            if (r4 == 0) goto L2d
        L2c:
            r9 = 0
        L2d:
            com.facebook.aura.productactions.impl.ProductMenuActionId r6 = r5.id
            int r7 = r5.label
            int r8 = r5.icon
            boolean r10 = r5.inFlight
            com.facebook.aura.productactions.impl.ProductMenuActionUiState r0 = r5.copy(r6, r7, r8, r9, r10)
            r2.add(r0)
            goto L19
        L3d:
            java.util.Iterator r1 = r5.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.next()
            com.facebook.aura.productactions.impl.ProductMenuActionUiState r0 = (com.facebook.aura.productactions.impl.ProductMenuActionUiState) r0
            boolean r0 = r0.inFlight
            if (r0 == 0) goto L41
            r4 = 1
            goto Lf
        L53:
            com.facebook.aura.productactions.impl.ProductItemMenuUiState r0 = new com.facebook.aura.productactions.impl.ProductItemMenuUiState
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductItemMenuViewModel.state(java.util.List):com.facebook.aura.productactions.impl.ProductItemMenuUiState");
    }

    public final void perform(ProductMenuActionId productMenuActionId, ProductMenuActionHost productMenuActionHost) {
        ProductMenuAction next;
        AnonymousClass003.A0u(productMenuActionId, productMenuActionHost);
        List<ProductMenuActionUiState> list = this.uiState.getValue().actions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<ProductMenuActionUiState> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().inFlight) {
                    return;
                }
            }
        }
        Iterator<ProductMenuAction> it2 = this.actions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.getId() == productMenuActionId) {
                    break;
                }
            }
        }
        ProductMenuAction productMenuAction = next;
        if (productMenuAction != null) {
            productMenuAction.perform(productMenuActionHost);
        }
    }
}
