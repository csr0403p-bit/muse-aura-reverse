package com.facebook.aura.shopping.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.ShoppingCartScreenKey;
import com.facebook.aura.shopping.view.ShoppingCartScreenHostKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.shopping.entries.ComposableSingletons$ShoppingCartEntryProviderKt$lambda$-1517018574$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ShoppingCartEntryProviderKt$lambda$1517018574$1 extends AbstractC7559F3s implements G0W<ShoppingCartScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ShoppingCartEntryProviderKt$lambda$1517018574$1 INSTANCE = new ComposableSingletons$ShoppingCartEntryProviderKt$lambda$1517018574$1();

    public ComposableSingletons$ShoppingCartEntryProviderKt$lambda$1517018574$1() {
        super(3);
    }

    public final void invoke(ShoppingCartScreenKey shoppingCartScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(shoppingCartScreenKey, 0);
        ShoppingCartScreenHostKt.ShoppingCartScreenHost(shoppingCartScreenKey.messageId, shoppingCartScreenKey.presentationId, shoppingCartScreenKey.widgetId, shoppingCartScreenKey.sessionId, null, bfm, 0, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingCartScreenKey shoppingCartScreenKey, BFM bfm, Integer num) {
        invoke(shoppingCartScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
