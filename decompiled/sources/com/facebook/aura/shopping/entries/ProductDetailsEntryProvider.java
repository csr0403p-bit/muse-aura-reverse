package com.facebook.aura.shopping.entries;

import X.AbstractC7559F3s;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductDetailsEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ProductDetailsEntryProvider INSTANCE = new ProductDetailsEntryProvider();

    /* renamed from: com.facebook.aura.shopping.entries.ProductDetailsEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ShoppingProductDetailsPageKey, Map<String, ? extends Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Map<String, Object> invoke(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey) {
            C7384Etj.A0Y(shoppingProductDetailsPageKey, 0);
            return shoppingProductDetailsPageKey.sharedElementKey != null ? AuraTransitionsKt.cardMorphTransitionMetadata : AuraTransitionsKt.bottomUpTransitionMetadata;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        c5rn.A00(new G0U<ShoppingProductDetailsPageKey, Object>() { // from class: com.facebook.aura.shopping.entries.ProductDetailsEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey) {
                return shoppingProductDetailsPageKey.toString();
            }
        }, AnonymousClass1.INSTANCE, ComposableSingletons$ProductDetailsEntryProviderKt.f269lambda$708619106, C3cG.A0x(ShoppingProductDetailsPageKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<InstacartProductDetailsSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$ProductDetailsEntryProviderKt.lambda$1786102030;
        c5rn.A00(new G0U<InstacartProductDetailsSheetKey, Object>() { // from class: com.facebook.aura.shopping.entries.ProductDetailsEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public final Object invoke(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
                return instacartProductDetailsSheetKey.toString();
            }
        }, new G0U<InstacartProductDetailsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.shopping.entries.ProductDetailsEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(InstacartProductDetailsSheetKey.class));
    }
}
