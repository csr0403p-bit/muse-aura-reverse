package com.facebook.aura.shopping.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ShoppingCartScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ShoppingCartEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ShoppingCartEntryProvider INSTANCE = new ShoppingCartEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ShoppingCartScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ShoppingCartEntryProviderKt.f271lambda$1517018574;
        c5rn.A00(new G0U<ShoppingCartScreenKey, Object>() { // from class: com.facebook.aura.shopping.entries.ShoppingCartEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ShoppingCartScreenKey shoppingCartScreenKey) {
                return shoppingCartScreenKey.toString();
            }
        }, new G0U<ShoppingCartScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.shopping.entries.ShoppingCartEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ShoppingCartScreenKey shoppingCartScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ShoppingCartScreenKey shoppingCartScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ShoppingCartScreenKey.class));
    }
}
