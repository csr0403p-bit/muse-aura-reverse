package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.PasswordAuthSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PasswordAuthEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final PasswordAuthEntryProvider INSTANCE = new PasswordAuthEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<PasswordAuthSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$PasswordAuthEntryProviderKt.lambda$562314502;
        c5rn.A00(new G0U<PasswordAuthSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.PasswordAuthEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(PasswordAuthSheetKey passwordAuthSheetKey) {
                return passwordAuthSheetKey.toString();
            }
        }, new G0U<PasswordAuthSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.PasswordAuthEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PasswordAuthSheetKey passwordAuthSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PasswordAuthSheetKey passwordAuthSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(PasswordAuthSheetKey.class));
    }
}
