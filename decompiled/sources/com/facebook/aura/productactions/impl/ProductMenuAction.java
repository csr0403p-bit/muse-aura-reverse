package com.facebook.aura.productactions.impl;

import X.C1BN;

/* loaded from: classes4.dex */
public interface ProductMenuAction {
    ProductMenuActionId getId();

    C1BN<ProductMenuActionUiState> getUiState();

    void perform(ProductMenuActionHost productMenuActionHost);
}
