package com.facebook.aura.shopping.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.view.ProductItemsScreenHostKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.shopping.entries.ComposableSingletons$ProductItemsEntryProviderKt$lambda$-1844520595$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductItemsEntryProviderKt$lambda$1844520595$1 extends AbstractC7559F3s implements G0W<ProductItemsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ProductItemsEntryProviderKt$lambda$1844520595$1 INSTANCE = new ComposableSingletons$ProductItemsEntryProviderKt$lambda$1844520595$1();

    public ComposableSingletons$ProductItemsEntryProviderKt$lambda$1844520595$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ProductItemsScreenKey productItemsScreenKey, BFM bfm, Integer num) {
        invoke(productItemsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ProductItemsScreenKey productItemsScreenKey, BFM bfm, int i) {
        ProductItemsScreenHostKt.ProductItemsScreenHost(productItemsScreenKey, null, bfm, AnonymousClass006.A0E(productItemsScreenKey, i), 2);
    }
}
