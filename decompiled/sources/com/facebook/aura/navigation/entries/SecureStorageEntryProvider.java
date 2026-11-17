package com.facebook.aura.navigation.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.SecureStorageCaptureSheetKey;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.navigation.key.SecureStorageOnePasswordScreenKey;
import com.facebook.aura.navigation.key.SecureStoragePasswordsScreenKey;
import com.facebook.aura.navigation.key.SecureStorageScreenKey;
import com.facebook.aura.navigation.key.SecureStorageVerificationCodeCaptureSheetKey;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class SecureStorageEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final SecureStorageEntryProvider INSTANCE = new SecureStorageEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<SecureStorageScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$SecureStorageEntryProviderKt.lambda$607178378;
        c5rn.A00(new G0U<SecureStorageScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(SecureStorageScreenKey secureStorageScreenKey) {
                return secureStorageScreenKey.toString();
            }
        }, new G0U<SecureStorageScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageScreenKey secureStorageScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageScreenKey secureStorageScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(SecureStorageScreenKey.class));
        G0W<SecureStoragePasswordsScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$SecureStorageEntryProviderKt.f178lambda$100325607;
        c5rn.A00(new G0U<SecureStoragePasswordsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(SecureStoragePasswordsScreenKey secureStoragePasswordsScreenKey) {
                return secureStoragePasswordsScreenKey.toString();
            }
        }, new G0U<SecureStoragePasswordsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStoragePasswordsScreenKey secureStoragePasswordsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStoragePasswordsScreenKey secureStoragePasswordsScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(SecureStoragePasswordsScreenKey.class));
        G0W<SecureStorageOnePasswordScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$SecureStorageEntryProviderKt.lambda$2120317729;
        c5rn.A00(new G0U<SecureStorageOnePasswordScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(SecureStorageOnePasswordScreenKey secureStorageOnePasswordScreenKey) {
                return secureStorageOnePasswordScreenKey.toString();
            }
        }, new G0U<SecureStorageOnePasswordScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageOnePasswordScreenKey secureStorageOnePasswordScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageOnePasswordScreenKey secureStorageOnePasswordScreenKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(SecureStorageOnePasswordScreenKey.class));
        G0W<SecureStorageCredentialDetailsScreenKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$SecureStorageEntryProviderKt.f179lambda$1830354550;
        c5rn.A00(new G0U<SecureStorageCredentialDetailsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
                return secureStorageCredentialDetailsScreenKey.toString();
            }
        }, new G0U<SecureStorageCredentialDetailsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey) {
                return map;
            }
        }, g0w4, C3cG.A0x(SecureStorageCredentialDetailsScreenKey.class));
        G0W<SecureStorageCustomConnectorDetailsScreenKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$SecureStorageEntryProviderKt.f180lambda$930274570;
        c5rn.A00(new G0U<SecureStorageCustomConnectorDetailsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey) {
                return secureStorageCustomConnectorDetailsScreenKey.toString();
            }
        }, new G0U<SecureStorageCustomConnectorDetailsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey) {
                return map;
            }
        }, g0w5, C3cG.A0x(SecureStorageCustomConnectorDetailsScreenKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<SecureStorageCaptureSheetKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$SecureStorageEntryProviderKt.lambda$611105532;
        c5rn.A00(new G0U<SecureStorageCaptureSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(SecureStorageCaptureSheetKey secureStorageCaptureSheetKey) {
                return secureStorageCaptureSheetKey.toString();
            }
        }, new G0U<SecureStorageCaptureSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageCaptureSheetKey secureStorageCaptureSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageCaptureSheetKey secureStorageCaptureSheetKey) {
                return mapBottomSheet;
            }
        }, g0w6, C3cG.A0x(SecureStorageCaptureSheetKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<SecureStorageVerificationCodeCaptureSheetKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$SecureStorageEntryProviderKt.lambda$1880191139;
        c5rn.A00(new G0U<SecureStorageVerificationCodeCaptureSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey) {
                return secureStorageVerificationCodeCaptureSheetKey.toString();
            }
        }, new G0U<SecureStorageVerificationCodeCaptureSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.SecureStorageEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey) {
                return mapBottomSheet2;
            }
        }, g0w7, C3cG.A0x(SecureStorageVerificationCodeCaptureSheetKey.class));
    }
}
