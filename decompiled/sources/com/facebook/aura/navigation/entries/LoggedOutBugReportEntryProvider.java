package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraLoggedOutNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.LoggedOutBugReportScreenKey;
import com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LoggedOutBugReportEntryProvider implements AuraLoggedOutNavEntryProvider {
    public static final int $stable = 0;
    public static final LoggedOutBugReportEntryProvider INSTANCE = new LoggedOutBugReportEntryProvider();

    @Override // com.facebook.aura.navigation.AuraLoggedOutNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<LoggedOutBugReportScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$LoggedOutBugReportEntryProviderKt.f147lambda$1706633702;
        c5rn.A00(new G0U<LoggedOutBugReportScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutBugReportEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey) {
                return loggedOutBugReportScreenKey.toString();
            }
        }, new G0U<LoggedOutBugReportScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutBugReportEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(LoggedOutBugReportScreenKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<ShakeToReportBottomSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$LoggedOutBugReportEntryProviderKt.lambda$1405660474;
        c5rn.A00(new G0U<ShakeToReportBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.LoggedOutBugReportEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return shakeToReportBottomSheetKey.toString();
            }
        }, new G0U<ShakeToReportBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.LoggedOutBugReportEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return mapBottomSheet;
            }
        }, g0w2, C3cG.A0x(ShakeToReportBottomSheetKey.class));
    }
}
