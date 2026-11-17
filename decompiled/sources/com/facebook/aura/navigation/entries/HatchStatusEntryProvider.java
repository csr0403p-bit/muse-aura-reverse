package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchStatusEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final HatchStatusEntryProvider INSTANCE = new HatchStatusEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.HatchStatusEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchStatusScreenKey, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchStatusScreenKey hatchStatusScreenKey) {
            return HatchStatusEntryProviderKt.HATCH_STATUS_CONTENT_KEY;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HatchStatusScreenKey hatchStatusScreenKey) {
            return HatchStatusEntryProviderKt.HATCH_STATUS_CONTENT_KEY;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.statusScreenTransitionMetadata;
        c5rn.A00(AnonymousClass1.INSTANCE, new G0U<HatchStatusScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.HatchStatusEntryProvider$provideEntry$$inlined$entry$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(HatchStatusScreenKey hatchStatusScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(HatchStatusScreenKey hatchStatusScreenKey) {
                return map;
            }
        }, ComposableSingletons$HatchStatusEntryProviderKt.lambda$1333053720, C3cG.A0x(HatchStatusScreenKey.class));
    }
}
