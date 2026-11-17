package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C60P;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.FeedStatusSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class FeedStatusSheetEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final FeedStatusSheetEntryProvider INSTANCE = new FeedStatusSheetEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        final Map mapA1S = C60P.A1S(c5rn);
        G0W<FeedStatusSheetKey, BFM, Integer, Unit> g0w = ComposableSingletons$FeedStatusSheetEntryProviderKt.lambda$1952197353;
        c5rn.A00(new G0U<FeedStatusSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.FeedStatusSheetEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(FeedStatusSheetKey feedStatusSheetKey) {
                return feedStatusSheetKey.toString();
            }
        }, new G0U<FeedStatusSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.FeedStatusSheetEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FeedStatusSheetKey feedStatusSheetKey) {
                return mapA1S;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FeedStatusSheetKey feedStatusSheetKey) {
                return mapA1S;
            }
        }, g0w, C3cG.A0x(FeedStatusSheetKey.class));
    }
}
