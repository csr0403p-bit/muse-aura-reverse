package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ImportMemoryToHatchScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ImportMemoryToHatchEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ImportMemoryToHatchEntryProvider INSTANCE = new ImportMemoryToHatchEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA0o = C3cG.A0o(c5rn);
        G0W<ImportMemoryToHatchScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$ImportMemoryToHatchEntryProviderKt.lambda$389433477;
        c5rn.A00(new G0U<ImportMemoryToHatchScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ImportMemoryToHatchEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ImportMemoryToHatchScreenKey importMemoryToHatchScreenKey) {
                return importMemoryToHatchScreenKey.toString();
            }
        }, new G0U<ImportMemoryToHatchScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.ImportMemoryToHatchEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ImportMemoryToHatchScreenKey importMemoryToHatchScreenKey) {
                return mapA0o;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ImportMemoryToHatchScreenKey importMemoryToHatchScreenKey) {
                return mapA0o;
            }
        }, g0w, C3cG.A0x(ImportMemoryToHatchScreenKey.class));
    }
}
