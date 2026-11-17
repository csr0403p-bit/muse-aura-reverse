package com.facebook.aura.tryon;

import com.facebook.aura.productactions.api.ProductMediaAction;
import com.facebook.aura.productactions.api.ProductMediaActionProvider;

/* loaded from: classes4.dex */
public final class TryOnMediaActionProvider implements ProductMediaActionProvider {
    public static final int $stable = 0;
    public static final TryOnMediaActionProvider INSTANCE = new TryOnMediaActionProvider();

    @Override // com.facebook.aura.productactions.api.ProductMediaActionProvider
    public ProductMediaAction action() {
        return TryOnMediaAction.INSTANCE;
    }
}
