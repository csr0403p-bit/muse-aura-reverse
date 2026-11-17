package com.facebook.aura.shopping.view;

import X.BO6;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityState;
import com.facebook.aura.shopping.model.ShoppingResultProduct;

/* loaded from: classes4.dex */
public final class ShoppingProductInlineEntityState extends C06G implements ConversationInlineEntityState {
    public final BO6<String, ShoppingResultProduct> productsByPillId;

    public ShoppingProductInlineEntityState(BO6<String, ShoppingResultProduct> bo6) {
        C7384Etj.A0Y(bo6, 0);
        this.productsByPillId = bo6;
    }

    public final ShoppingProductInlineEntityState copy(BO6<String, ShoppingResultProduct> bo6) {
        C7384Etj.A0Y(bo6, 0);
        return new ShoppingProductInlineEntityState(bo6);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingProductInlineEntityState) && C7384Etj.areEqual(this.productsByPillId, ((ShoppingProductInlineEntityState) obj).productsByPillId));
    }

    public static /* synthetic */ ShoppingProductInlineEntityState copy$default(ShoppingProductInlineEntityState shoppingProductInlineEntityState, BO6 bo6, int i, Object obj) {
        if ((i & 1) != 0) {
            bo6 = shoppingProductInlineEntityState.productsByPillId;
        }
        C7384Etj.A0Y(bo6, 0);
        return new ShoppingProductInlineEntityState(bo6);
    }

    public final BO6<String, ShoppingResultProduct> component1() {
        return this.productsByPillId;
    }

    public final BO6<String, ShoppingResultProduct> getProductsByPillId() {
        return this.productsByPillId;
    }

    public int hashCode() {
        return this.productsByPillId.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
