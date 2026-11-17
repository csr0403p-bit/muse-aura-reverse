package com.facebook.aura.shopping.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.shopping.entries.ComposableSingletons$ProductDetailsEntryProviderKt$lambda$-708619106$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ProductDetailsEntryProviderKt$lambda$708619106$1 extends AbstractC7559F3s implements G0W<ShoppingProductDetailsPageKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ProductDetailsEntryProviderKt$lambda$708619106$1 INSTANCE = new ComposableSingletons$ProductDetailsEntryProviderKt$lambda$708619106$1();

    public ComposableSingletons$ProductDetailsEntryProviderKt$lambda$708619106$1() {
        super(3);
    }

    public final void invoke(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, BFM bfm, int i) {
        ShoppingProductDetailsPagerKt.ShoppingProductDetailsPager(shoppingProductDetailsPageKey, null, bfm, AnonymousClass006.A0E(shoppingProductDetailsPageKey, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, BFM bfm, Integer num) {
        invoke(shoppingProductDetailsPageKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
