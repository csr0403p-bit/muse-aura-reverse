package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.GraduationScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class GraduationEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final GraduationEntryProvider INSTANCE = new GraduationEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<GraduationScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$GraduationEntryProviderKt.lambda$1434506672;
        c5rn.A00(new G0U<GraduationScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.GraduationEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(GraduationScreenKey graduationScreenKey) {
                return graduationScreenKey.toString();
            }
        }, new G0U<GraduationScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.GraduationEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(GraduationScreenKey graduationScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(GraduationScreenKey graduationScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(GraduationScreenKey.class));
    }
}
