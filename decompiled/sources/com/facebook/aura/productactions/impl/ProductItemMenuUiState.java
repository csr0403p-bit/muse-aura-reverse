package com.facebook.aura.productactions.impl;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class ProductItemMenuUiState {
    public static final int $stable = 8;
    public final List<ProductMenuActionUiState> actions;
    public final String previewImageUrl;

    public ProductItemMenuUiState(String str, List<ProductMenuActionUiState> list) {
        C7384Etj.A0Y(list, 1);
        this.previewImageUrl = str;
        this.actions = list;
    }

    public final ProductItemMenuUiState copy(String str, List<ProductMenuActionUiState> list) {
        C7384Etj.A0Y(list, 1);
        return new ProductItemMenuUiState(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductItemMenuUiState) {
                ProductItemMenuUiState productItemMenuUiState = (ProductItemMenuUiState) obj;
                if (!C7384Etj.areEqual(this.previewImageUrl, productItemMenuUiState.previewImageUrl) || !C7384Etj.areEqual(this.actions, productItemMenuUiState.actions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProductItemMenuUiState copy$default(ProductItemMenuUiState productItemMenuUiState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productItemMenuUiState.previewImageUrl;
        }
        if ((i & 2) != 0) {
            list = productItemMenuUiState.actions;
        }
        C7384Etj.A0Y(list, 1);
        return new ProductItemMenuUiState(str, list);
    }

    public final String component1() {
        return this.previewImageUrl;
    }

    public final List<ProductMenuActionUiState> component2() {
        return this.actions;
    }

    public final List<ProductMenuActionUiState> getActions() {
        return this.actions;
    }

    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.actions, AnonymousClass006.A0G(this.previewImageUrl) * 31);
    }

    public String toString() {
        return C3cJ.A0L(this.actions, ", actions=", C3cI.A0x("ProductItemMenuUiState(previewImageUrl=", this.previewImageUrl));
    }
}
