package com.facebook.aura.navigation.entries;

import X.AGH;
import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.SharedViewModelStoreNavEntryDecorator;
import com.facebook.aura.navigation.key.FirstPartyManageAccountsSheetKey;
import com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.navigation.key.SkillConnectSheetKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SkillConnectEntryProvider INSTANCE = new SkillConnectEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<SkillConnectDisconnectRouterScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$SkillConnectEntryProviderKt.f183lambda$1866969450;
        c5rn.A00(new G0U<SkillConnectDisconnectRouterScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey) {
                return skillConnectDisconnectRouterScreenKey.toString();
            }
        }, new G0U<SkillConnectDisconnectRouterScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey) {
                return mapBottomSheet;
            }
        }, g0w, C3cG.A0x(SkillConnectDisconnectRouterScreenKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<SkillAlreadyConnectedOrDisconnectedSheetKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$SkillConnectEntryProviderKt.lambda$362953876;
        c5rn.A00(new G0U<SkillAlreadyConnectedOrDisconnectedSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey) {
                return skillAlreadyConnectedOrDisconnectedSheetKey.toString();
            }
        }, new G0U<SkillAlreadyConnectedOrDisconnectedSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w2, C3cG.A0x(SkillAlreadyConnectedOrDisconnectedSheetKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, false);
        G0W<SkillConnectSheetKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$SkillConnectEntryProviderKt.lambda$1175653572;
        c5rn.A00(new G0U<SkillConnectSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(SkillConnectSheetKey skillConnectSheetKey) {
                return skillConnectSheetKey.toString();
            }
        }, new G0U<SkillConnectSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SkillConnectSheetKey skillConnectSheetKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SkillConnectSheetKey skillConnectSheetKey) {
                return mapBottomSheet3;
            }
        }, g0w3, C3cG.A0x(SkillConnectSheetKey.class));
        final LinkedHashMap linkedHashMapA02 = AGH.A02(companion.bottomSheet(true, true, false), AnonymousClass006.A10(SharedViewModelStoreNavEntryDecorator.PARENT_CONTENT_KEY, HatchSkillDetailEntryProviderKt.HATCH_SKILL_DETAIL_CONTENT_KEY));
        G0W<FirstPartyManageAccountsSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$SkillConnectEntryProviderKt.f182lambda$1693224421;
        c5rn.A00(new G0U<FirstPartyManageAccountsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey) {
                return firstPartyManageAccountsSheetKey.toString();
            }
        }, new G0U<FirstPartyManageAccountsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SkillConnectEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey) {
                return linkedHashMapA02;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey) {
                return linkedHashMapA02;
            }
        }, g0w4, C3cG.A0x(FirstPartyManageAccountsSheetKey.class));
    }
}
