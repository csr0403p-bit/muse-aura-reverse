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
import com.facebook.aura.navigation.key.NativeLoginAccountSelectionScreenKey;
import com.facebook.aura.navigation.key.NativeLoginBirthdayScreenKey;
import com.facebook.aura.navigation.key.NativeLoginCheckpointScreenKey;
import com.facebook.aura.navigation.key.NativeLoginCheckpointWebScreenKey;
import com.facebook.aura.navigation.key.NativeLoginIntroScreenKey;
import com.facebook.aura.navigation.key.NativeLoginItemizedConsentScreenKey;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginLinkingDisclosureScreenKey;
import com.facebook.aura.navigation.key.NativeLoginMoreAccountsSheetKey;
import com.facebook.aura.navigation.key.NativeLoginNameScreenKey;
import com.facebook.aura.navigation.key.NativeLoginNtpUpsellChoiceScreenKey;
import com.facebook.aura.navigation.key.NativeLoginNtpUpsellScreenKey;
import com.facebook.aura.navigation.key.NativeLoginOtpScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPasswordScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPhoneEntryScreenKey;
import com.facebook.aura.navigation.key.NativeLoginReactivationScreenKey;
import com.facebook.aura.navigation.key.NativeLoginTwoFactorMethodScreenKey;
import com.facebook.aura.navigation.key.NativeLoginTwoFactorScreenKey;
import com.facebook.aura.navigation.key.PreloadsTosScreenKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginEntryProvider implements AuraLoggedOutNavEntryProvider {
    public static final int $stable = 0;
    public static final NativeLoginEntryProvider INSTANCE = new NativeLoginEntryProvider();

    @Override // com.facebook.aura.navigation.AuraLoggedOutNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<PreloadsTosScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1032291124;
        c5rn.A00(new G0U<PreloadsTosScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(PreloadsTosScreenKey preloadsTosScreenKey) {
                return preloadsTosScreenKey.toString();
            }
        }, new G0U<PreloadsTosScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(PreloadsTosScreenKey preloadsTosScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(PreloadsTosScreenKey preloadsTosScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(PreloadsTosScreenKey.class));
        final Map<String, Object> map2 = AuraTransitionsKt.fadeTransitionMetadata;
        G0W<NativeLoginIntroScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$364005567;
        c5rn.A00(new G0U<NativeLoginIntroScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(NativeLoginIntroScreenKey nativeLoginIntroScreenKey) {
                return nativeLoginIntroScreenKey.toString();
            }
        }, new G0U<NativeLoginIntroScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginIntroScreenKey nativeLoginIntroScreenKey) {
                return map2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginIntroScreenKey nativeLoginIntroScreenKey) {
                return map2;
            }
        }, g0w2, C3cG.A0x(NativeLoginIntroScreenKey.class));
        final Map<String, Object> map3 = NativeLoginEntryProviderKt.introHandoffTransitionMetadata;
        G0W<NativeLoginLandingScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$934941961;
        c5rn.A00(new G0U<NativeLoginLandingScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(NativeLoginLandingScreenKey nativeLoginLandingScreenKey) {
                return nativeLoginLandingScreenKey.toString();
            }
        }, new G0U<NativeLoginLandingScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginLandingScreenKey nativeLoginLandingScreenKey) {
                return map3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginLandingScreenKey nativeLoginLandingScreenKey) {
                return map3;
            }
        }, g0w3, C3cG.A0x(NativeLoginLandingScreenKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<NativeLoginMoreAccountsSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1012546441;
        c5rn.A00(new G0U<NativeLoginMoreAccountsSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(NativeLoginMoreAccountsSheetKey nativeLoginMoreAccountsSheetKey) {
                return nativeLoginMoreAccountsSheetKey.toString();
            }
        }, new G0U<NativeLoginMoreAccountsSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginMoreAccountsSheetKey nativeLoginMoreAccountsSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginMoreAccountsSheetKey nativeLoginMoreAccountsSheetKey) {
                return mapBottomSheet;
            }
        }, g0w4, C3cG.A0x(NativeLoginMoreAccountsSheetKey.class));
        G0W<NativeLoginPhoneEntryScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1349675810;
        c5rn.A00(new G0U<NativeLoginPhoneEntryScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(NativeLoginPhoneEntryScreenKey nativeLoginPhoneEntryScreenKey) {
                return nativeLoginPhoneEntryScreenKey.toString();
            }
        }, new G0U<NativeLoginPhoneEntryScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginPhoneEntryScreenKey nativeLoginPhoneEntryScreenKey) {
                return map3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginPhoneEntryScreenKey nativeLoginPhoneEntryScreenKey) {
                return map3;
            }
        }, g0w5, C3cG.A0x(NativeLoginPhoneEntryScreenKey.class));
        G0W<NativeLoginOtpScreenKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1447004090;
        c5rn.A00(new G0U<NativeLoginOtpScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(NativeLoginOtpScreenKey nativeLoginOtpScreenKey) {
                return nativeLoginOtpScreenKey.toString();
            }
        }, new G0U<NativeLoginOtpScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginOtpScreenKey nativeLoginOtpScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginOtpScreenKey nativeLoginOtpScreenKey) {
                return map;
            }
        }, g0w6, C3cG.A0x(NativeLoginOtpScreenKey.class));
        G0W<NativeLoginPasswordScreenKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$NativeLoginEntryProviderKt.f156lambda$1745830121;
        c5rn.A00(new G0U<NativeLoginPasswordScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(NativeLoginPasswordScreenKey nativeLoginPasswordScreenKey) {
                return nativeLoginPasswordScreenKey.toString();
            }
        }, new G0U<NativeLoginPasswordScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginPasswordScreenKey nativeLoginPasswordScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginPasswordScreenKey nativeLoginPasswordScreenKey) {
                return map;
            }
        }, g0w7, C3cG.A0x(NativeLoginPasswordScreenKey.class));
        G0W<NativeLoginAccountSelectionScreenKey, BFM, Integer, Unit> g0w8 = ComposableSingletons$NativeLoginEntryProviderKt.f158lambda$381357126;
        c5rn.A00(new G0U<NativeLoginAccountSelectionScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$15
            @Override // X.G0U
            public final Object invoke(NativeLoginAccountSelectionScreenKey nativeLoginAccountSelectionScreenKey) {
                return nativeLoginAccountSelectionScreenKey.toString();
            }
        }, new G0U<NativeLoginAccountSelectionScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$16
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginAccountSelectionScreenKey nativeLoginAccountSelectionScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginAccountSelectionScreenKey nativeLoginAccountSelectionScreenKey) {
                return map;
            }
        }, g0w8, C3cG.A0x(NativeLoginAccountSelectionScreenKey.class));
        G0W<NativeLoginTwoFactorMethodScreenKey, BFM, Integer, Unit> g0w9 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$517874472;
        c5rn.A00(new G0U<NativeLoginTwoFactorMethodScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$17
            @Override // X.G0U
            public final Object invoke(NativeLoginTwoFactorMethodScreenKey nativeLoginTwoFactorMethodScreenKey) {
                return nativeLoginTwoFactorMethodScreenKey.toString();
            }
        }, new G0U<NativeLoginTwoFactorMethodScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$18
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginTwoFactorMethodScreenKey nativeLoginTwoFactorMethodScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginTwoFactorMethodScreenKey nativeLoginTwoFactorMethodScreenKey) {
                return map;
            }
        }, g0w9, C3cG.A0x(NativeLoginTwoFactorMethodScreenKey.class));
        G0W<NativeLoginTwoFactorScreenKey, BFM, Integer, Unit> g0w10 = ComposableSingletons$NativeLoginEntryProviderKt.f154lambda$1598710266;
        c5rn.A00(new G0U<NativeLoginTwoFactorScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$19
            @Override // X.G0U
            public final Object invoke(NativeLoginTwoFactorScreenKey nativeLoginTwoFactorScreenKey) {
                return nativeLoginTwoFactorScreenKey.toString();
            }
        }, new G0U<NativeLoginTwoFactorScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$20
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginTwoFactorScreenKey nativeLoginTwoFactorScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginTwoFactorScreenKey nativeLoginTwoFactorScreenKey) {
                return map;
            }
        }, g0w10, C3cG.A0x(NativeLoginTwoFactorScreenKey.class));
        G0W<NativeLoginNtpUpsellScreenKey, BFM, Integer, Unit> g0w11 = ComposableSingletons$NativeLoginEntryProviderKt.f155lambda$1667314816;
        c5rn.A00(new G0U<NativeLoginNtpUpsellScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$21
            @Override // X.G0U
            public final Object invoke(NativeLoginNtpUpsellScreenKey nativeLoginNtpUpsellScreenKey) {
                return nativeLoginNtpUpsellScreenKey.toString();
            }
        }, new G0U<NativeLoginNtpUpsellScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$22
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginNtpUpsellScreenKey nativeLoginNtpUpsellScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginNtpUpsellScreenKey nativeLoginNtpUpsellScreenKey) {
                return map;
            }
        }, g0w11, C3cG.A0x(NativeLoginNtpUpsellScreenKey.class));
        G0W<NativeLoginNtpUpsellChoiceScreenKey, BFM, Integer, Unit> g0w12 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1836433086;
        c5rn.A00(new G0U<NativeLoginNtpUpsellChoiceScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$23
            @Override // X.G0U
            public final Object invoke(NativeLoginNtpUpsellChoiceScreenKey nativeLoginNtpUpsellChoiceScreenKey) {
                return nativeLoginNtpUpsellChoiceScreenKey.toString();
            }
        }, new G0U<NativeLoginNtpUpsellChoiceScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$24
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginNtpUpsellChoiceScreenKey nativeLoginNtpUpsellChoiceScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginNtpUpsellChoiceScreenKey nativeLoginNtpUpsellChoiceScreenKey) {
                return map;
            }
        }, g0w12, C3cG.A0x(NativeLoginNtpUpsellChoiceScreenKey.class));
        G0W<NativeLoginLinkingDisclosureScreenKey, BFM, Integer, Unit> g0w13 = ComposableSingletons$NativeLoginEntryProviderKt.f157lambda$24743232;
        c5rn.A00(new G0U<NativeLoginLinkingDisclosureScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$25
            @Override // X.G0U
            public final Object invoke(NativeLoginLinkingDisclosureScreenKey nativeLoginLinkingDisclosureScreenKey) {
                return nativeLoginLinkingDisclosureScreenKey.toString();
            }
        }, new G0U<NativeLoginLinkingDisclosureScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$26
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginLinkingDisclosureScreenKey nativeLoginLinkingDisclosureScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginLinkingDisclosureScreenKey nativeLoginLinkingDisclosureScreenKey) {
                return map;
            }
        }, g0w13, C3cG.A0x(NativeLoginLinkingDisclosureScreenKey.class));
        G0W<NativeLoginItemizedConsentScreenKey, BFM, Integer, Unit> g0w14 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$467700317;
        c5rn.A00(new G0U<NativeLoginItemizedConsentScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$27
            @Override // X.G0U
            public final Object invoke(NativeLoginItemizedConsentScreenKey nativeLoginItemizedConsentScreenKey) {
                return nativeLoginItemizedConsentScreenKey.toString();
            }
        }, new G0U<NativeLoginItemizedConsentScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$28
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginItemizedConsentScreenKey nativeLoginItemizedConsentScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginItemizedConsentScreenKey nativeLoginItemizedConsentScreenKey) {
                return map;
            }
        }, g0w14, C3cG.A0x(NativeLoginItemizedConsentScreenKey.class));
        G0W<NativeLoginBirthdayScreenKey, BFM, Integer, Unit> g0w15 = ComposableSingletons$NativeLoginEntryProviderKt.f153lambda$1205038040;
        c5rn.A00(new G0U<NativeLoginBirthdayScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$29
            @Override // X.G0U
            public final Object invoke(NativeLoginBirthdayScreenKey nativeLoginBirthdayScreenKey) {
                return nativeLoginBirthdayScreenKey.toString();
            }
        }, new G0U<NativeLoginBirthdayScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$30
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginBirthdayScreenKey nativeLoginBirthdayScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginBirthdayScreenKey nativeLoginBirthdayScreenKey) {
                return map;
            }
        }, g0w15, C3cG.A0x(NativeLoginBirthdayScreenKey.class));
        G0W<NativeLoginNameScreenKey, BFM, Integer, Unit> g0w16 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$637418425;
        c5rn.A00(new G0U<NativeLoginNameScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$31
            @Override // X.G0U
            public final Object invoke(NativeLoginNameScreenKey nativeLoginNameScreenKey) {
                return nativeLoginNameScreenKey.toString();
            }
        }, new G0U<NativeLoginNameScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$32
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginNameScreenKey nativeLoginNameScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginNameScreenKey nativeLoginNameScreenKey) {
                return map;
            }
        }, g0w16, C3cG.A0x(NativeLoginNameScreenKey.class));
        G0W<NativeLoginCheckpointScreenKey, BFM, Integer, Unit> g0w17 = ComposableSingletons$NativeLoginEntryProviderKt.f159lambda$951500677;
        c5rn.A00(new G0U<NativeLoginCheckpointScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$33
            @Override // X.G0U
            public final Object invoke(NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey) {
                return nativeLoginCheckpointScreenKey.toString();
            }
        }, new G0U<NativeLoginCheckpointScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$34
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey) {
                return map;
            }
        }, g0w17, C3cG.A0x(NativeLoginCheckpointScreenKey.class));
        G0W<NativeLoginReactivationScreenKey, BFM, Integer, Unit> g0w18 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$1039958329;
        c5rn.A00(new G0U<NativeLoginReactivationScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$35
            @Override // X.G0U
            public final Object invoke(NativeLoginReactivationScreenKey nativeLoginReactivationScreenKey) {
                return nativeLoginReactivationScreenKey.toString();
            }
        }, new G0U<NativeLoginReactivationScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$36
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginReactivationScreenKey nativeLoginReactivationScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginReactivationScreenKey nativeLoginReactivationScreenKey) {
                return map;
            }
        }, g0w18, C3cG.A0x(NativeLoginReactivationScreenKey.class));
        G0W<NativeLoginCheckpointWebScreenKey, BFM, Integer, Unit> g0w19 = ComposableSingletons$NativeLoginEntryProviderKt.lambda$80742883;
        c5rn.A00(new G0U<NativeLoginCheckpointWebScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$37
            @Override // X.G0U
            public final Object invoke(NativeLoginCheckpointWebScreenKey nativeLoginCheckpointWebScreenKey) {
                return nativeLoginCheckpointWebScreenKey.toString();
            }
        }, new G0U<NativeLoginCheckpointWebScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.NativeLoginEntryProvider$provideEntry$$inlined$entry$default$38
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(NativeLoginCheckpointWebScreenKey nativeLoginCheckpointWebScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(NativeLoginCheckpointWebScreenKey nativeLoginCheckpointWebScreenKey) {
                return map;
            }
        }, g0w19, C3cG.A0x(NativeLoginCheckpointWebScreenKey.class));
    }
}
