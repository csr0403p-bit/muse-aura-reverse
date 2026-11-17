package com.facebook.aura.shopping.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ShoppingCartCardUiModel extends C06G {
    public static final int $stable = 0;
    public final int hiddenItemCount;
    public final ShoppingCartSummary summary;
    public final List<ShoppingCartItem> visibleItems;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartCardUiModel) {
                ShoppingCartCardUiModel shoppingCartCardUiModel = (ShoppingCartCardUiModel) obj;
                if (!C7384Etj.areEqual(this.summary, shoppingCartCardUiModel.summary) || !C7384Etj.areEqual(this.visibleItems, shoppingCartCardUiModel.visibleItems) || this.hiddenItemCount != shoppingCartCardUiModel.hiddenItemCount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCartCardUiModel copy$default(ShoppingCartCardUiModel shoppingCartCardUiModel, ShoppingCartSummary shoppingCartSummary, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shoppingCartSummary = shoppingCartCardUiModel.summary;
        }
        if ((i2 & 2) != 0) {
            list = shoppingCartCardUiModel.visibleItems;
        }
        if ((i2 & 4) != 0) {
            i = shoppingCartCardUiModel.hiddenItemCount;
        }
        return shoppingCartCardUiModel.copy(shoppingCartSummary, list, i);
    }

    public final ShoppingCartSummary component1() {
        return this.summary;
    }

    public final List<ShoppingCartItem> component2() {
        return this.visibleItems;
    }

    public final int component3() {
        return this.hiddenItemCount;
    }

    public final int getHiddenItemCount() {
        return this.hiddenItemCount;
    }

    public final ShoppingCartSummary getSummary() {
        return this.summary;
    }

    public final List<ShoppingCartItem> getVisibleItems() {
        return this.visibleItems;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.visibleItems, AnonymousClass005.A0E(this.summary)) + this.hiddenItemCount;
    }

    public ShoppingCartCardUiModel(ShoppingCartSummary shoppingCartSummary, List<ShoppingCartItem> list, int i) {
        AnonymousClass003.A0u(shoppingCartSummary, list);
        this.summary = shoppingCartSummary;
        this.visibleItems = list;
        this.hiddenItemCount = i;
    }

    public final ShoppingCartCardUiModel copy(ShoppingCartSummary shoppingCartSummary, List<ShoppingCartItem> list, int i) {
        AnonymousClass003.A0u(shoppingCartSummary, list);
        return new ShoppingCartCardUiModel(shoppingCartSummary, list, i);
    }

    public String toString() {
        return super.toString();
    }
}
