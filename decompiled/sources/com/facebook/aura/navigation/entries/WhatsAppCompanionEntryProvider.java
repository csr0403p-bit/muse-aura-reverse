package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.WhatsAppCompanionSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WhatsAppCompanionEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final WhatsAppCompanionEntryProvider INSTANCE = new WhatsAppCompanionEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<WhatsAppCompanionSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$WhatsAppCompanionEntryProviderKt.f196lambda$1359912683;
        c5rn.A00(new G0U<WhatsAppCompanionSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.WhatsAppCompanionEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(WhatsAppCompanionSheetKey whatsAppCompanionSheetKey) {
                return whatsAppCompanionSheetKey.toString();
            }
        }, new G0U<WhatsAppCompanionSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.WhatsAppCompanionEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(WhatsAppCompanionSheetKey whatsAppCompanionSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(WhatsAppCompanionSheetKey whatsAppCompanionSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(WhatsAppCompanionSheetKey.class));
    }
}
