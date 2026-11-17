package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.RichFormatScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RichFormatEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final RichFormatEntryProvider INSTANCE = new RichFormatEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<RichFormatScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$RichFormatEntryProviderKt.f177lambda$264404609;
        c5rn.A00(new G0U<RichFormatScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.RichFormatEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(RichFormatScreenKey richFormatScreenKey) {
                return richFormatScreenKey.toString();
            }
        }, new G0U<RichFormatScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.RichFormatEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(RichFormatScreenKey richFormatScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(RichFormatScreenKey richFormatScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(RichFormatScreenKey.class));
    }
}
