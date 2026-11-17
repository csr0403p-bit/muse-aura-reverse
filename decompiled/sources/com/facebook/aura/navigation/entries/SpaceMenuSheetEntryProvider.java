package com.facebook.aura.navigation.entries;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SpaceMenuSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SpaceMenuSheetEntryProvider INSTANCE = new SpaceMenuSheetEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.SpaceMenuSheetEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<SpaceMenuSheetKey, Map<String, ? extends Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Map<String, Object> invoke(SpaceMenuSheetKey spaceMenuSheetKey) {
            Map mapA0E;
            C7384Etj.A0Y(spaceMenuSheetKey, 0);
            Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
            String str = spaceMenuSheetKey.parentContentKey;
            if (str == null || (mapA0E = AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, str)) == null) {
                mapA0E = AGH.A0E();
            }
            return AGH.A02(mapBottomSheet, mapA0E);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        c5rn.A00(new G0U<SpaceMenuSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SpaceMenuSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(SpaceMenuSheetKey spaceMenuSheetKey) {
                return spaceMenuSheetKey.toString();
            }
        }, AnonymousClass1.INSTANCE, ComposableSingletons$SpaceMenuSheetEntryProviderKt.f185lambda$1678968024, C3cG.A0x(SpaceMenuSheetKey.class));
    }
}
