package com.facebook.aura.email.entries;

import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.email.keys.EmailAddSenderKey;
import com.facebook.aura.email.keys.EmailAttachmentKey;
import com.facebook.aura.email.keys.EmailDeleteMailboxKey;
import com.facebook.aura.email.keys.EmailFormKey;
import com.facebook.aura.email.keys.EmailIntroKey;
import com.facebook.aura.email.keys.EmailOwnerConfirmationKey;
import com.facebook.aura.email.keys.EmailSenderNameKey;
import com.facebook.aura.email.keys.EmailSendersKey;
import com.facebook.aura.email.keys.EmailSettingsKey;
import com.facebook.aura.email.keys.EmailThreadKey;
import com.facebook.aura.email.keys.EmailTrustedContactsKey;
import com.facebook.aura.email.keys.EmailUnknownContactsKey;
import com.facebook.aura.email.keys.EmailVerifySenderKey;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class EmailEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final EmailEntryProvider INSTANCE = new EmailEntryProvider();

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<EmailSettingsKey, BFM, Integer, Unit> g0w = ComposableSingletons$EmailEntryProviderKt.f43lambda$1881210193;
        c5rn.A00(new G0U<EmailSettingsKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(EmailSettingsKey emailSettingsKey) {
                return emailSettingsKey.toString();
            }
        }, new G0U<EmailSettingsKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailSettingsKey emailSettingsKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailSettingsKey emailSettingsKey) {
                return map;
            }
        }, g0w, C3cG.A0x(EmailSettingsKey.class));
        G0W<EmailIntroKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$EmailEntryProviderKt.lambda$312805471;
        c5rn.A00(new G0U<EmailIntroKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(EmailIntroKey emailIntroKey) {
                return emailIntroKey.toString();
            }
        }, new G0U<EmailIntroKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailIntroKey emailIntroKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailIntroKey emailIntroKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(EmailIntroKey.class));
        G0W<EmailFormKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$EmailEntryProviderKt.f42lambda$1752351386;
        c5rn.A00(new G0U<EmailFormKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(EmailFormKey emailFormKey) {
                return emailFormKey.toString();
            }
        }, new G0U<EmailFormKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailFormKey emailFormKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailFormKey emailFormKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(EmailFormKey.class));
        G0W<EmailSenderNameKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$EmailEntryProviderKt.lambda$363127243;
        c5rn.A00(new G0U<EmailSenderNameKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(EmailSenderNameKey emailSenderNameKey) {
                return emailSenderNameKey.toString();
            }
        }, new G0U<EmailSenderNameKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailSenderNameKey emailSenderNameKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailSenderNameKey emailSenderNameKey) {
                return map;
            }
        }, g0w4, C3cG.A0x(EmailSenderNameKey.class));
        G0W<EmailOwnerConfirmationKey, BFM, Integer, Unit> g0w5 = ComposableSingletons$EmailEntryProviderKt.f45lambda$634583162;
        c5rn.A00(new G0U<EmailOwnerConfirmationKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$9
            @Override // X.G0U
            public final Object invoke(EmailOwnerConfirmationKey emailOwnerConfirmationKey) {
                return emailOwnerConfirmationKey.toString();
            }
        }, new G0U<EmailOwnerConfirmationKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$10
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailOwnerConfirmationKey emailOwnerConfirmationKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailOwnerConfirmationKey emailOwnerConfirmationKey) {
                return map;
            }
        }, g0w5, C3cG.A0x(EmailOwnerConfirmationKey.class));
        G0W<EmailAttachmentKey, BFM, Integer, Unit> g0w6 = ComposableSingletons$EmailEntryProviderKt.lambda$943423850;
        c5rn.A00(new G0U<EmailAttachmentKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$11
            @Override // X.G0U
            public final Object invoke(EmailAttachmentKey emailAttachmentKey) {
                return emailAttachmentKey.toString();
            }
        }, new G0U<EmailAttachmentKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$12
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailAttachmentKey emailAttachmentKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailAttachmentKey emailAttachmentKey) {
                return map;
            }
        }, g0w6, C3cG.A0x(EmailAttachmentKey.class));
        G0W<EmailThreadKey, BFM, Integer, Unit> g0w7 = ComposableSingletons$EmailEntryProviderKt.lambda$1202971940;
        c5rn.A00(new G0U<EmailThreadKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$13
            @Override // X.G0U
            public final Object invoke(EmailThreadKey emailThreadKey) {
                return emailThreadKey.toString();
            }
        }, new G0U<EmailThreadKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$14
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailThreadKey emailThreadKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailThreadKey emailThreadKey) {
                return map;
            }
        }, g0w7, C3cG.A0x(EmailThreadKey.class));
        G0W<EmailSendersKey, BFM, Integer, Unit> g0w8 = ComposableSingletons$EmailEntryProviderKt.lambda$1908990323;
        c5rn.A00(new G0U<EmailSendersKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$15
            @Override // X.G0U
            public final Object invoke(EmailSendersKey emailSendersKey) {
                return emailSendersKey.toString();
            }
        }, new G0U<EmailSendersKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$16
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailSendersKey emailSendersKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailSendersKey emailSendersKey) {
                return map;
            }
        }, g0w8, C3cG.A0x(EmailSendersKey.class));
        G0W<EmailVerifySenderKey, BFM, Integer, Unit> g0w9 = ComposableSingletons$EmailEntryProviderKt.lambda$1960041954;
        c5rn.A00(new G0U<EmailVerifySenderKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$17
            @Override // X.G0U
            public final Object invoke(EmailVerifySenderKey emailVerifySenderKey) {
                return emailVerifySenderKey.toString();
            }
        }, new G0U<EmailVerifySenderKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$18
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailVerifySenderKey emailVerifySenderKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailVerifySenderKey emailVerifySenderKey) {
                return map;
            }
        }, g0w9, C3cG.A0x(EmailVerifySenderKey.class));
        G0W<EmailAddSenderKey, BFM, Integer, Unit> g0w10 = ComposableSingletons$EmailEntryProviderKt.f41lambda$1481540003;
        c5rn.A00(new G0U<EmailAddSenderKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$19
            @Override // X.G0U
            public final Object invoke(EmailAddSenderKey emailAddSenderKey) {
                return emailAddSenderKey.toString();
            }
        }, new G0U<EmailAddSenderKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$20
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailAddSenderKey emailAddSenderKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailAddSenderKey emailAddSenderKey) {
                return map;
            }
        }, g0w10, C3cG.A0x(EmailAddSenderKey.class));
        BottomSheetSceneStrategy.Companion companion = BottomSheetSceneStrategy.Companion;
        final Map<String, Object> mapBottomSheet = companion.bottomSheet(true, true, false);
        G0W<EmailTrustedContactsKey, BFM, Integer, Unit> g0w11 = ComposableSingletons$EmailEntryProviderKt.lambda$1461687749;
        c5rn.A00(new G0U<EmailTrustedContactsKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$21
            @Override // X.G0U
            public final Object invoke(EmailTrustedContactsKey emailTrustedContactsKey) {
                return emailTrustedContactsKey.toString();
            }
        }, new G0U<EmailTrustedContactsKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$22
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailTrustedContactsKey emailTrustedContactsKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailTrustedContactsKey emailTrustedContactsKey) {
                return mapBottomSheet;
            }
        }, g0w11, C3cG.A0x(EmailTrustedContactsKey.class));
        final Map<String, Object> mapBottomSheet2 = companion.bottomSheet(true, true, false);
        G0W<EmailUnknownContactsKey, BFM, Integer, Unit> g0w12 = ComposableSingletons$EmailEntryProviderKt.lambda$1969805977;
        c5rn.A00(new G0U<EmailUnknownContactsKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$23
            @Override // X.G0U
            public final Object invoke(EmailUnknownContactsKey emailUnknownContactsKey) {
                return emailUnknownContactsKey.toString();
            }
        }, new G0U<EmailUnknownContactsKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$24
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailUnknownContactsKey emailUnknownContactsKey) {
                return mapBottomSheet2;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailUnknownContactsKey emailUnknownContactsKey) {
                return mapBottomSheet2;
            }
        }, g0w12, C3cG.A0x(EmailUnknownContactsKey.class));
        final Map<String, Object> mapBottomSheet3 = companion.bottomSheet(true, true, false);
        G0W<EmailDeleteMailboxKey, BFM, Integer, Unit> g0w13 = ComposableSingletons$EmailEntryProviderKt.f44lambda$54611226;
        c5rn.A00(new G0U<EmailDeleteMailboxKey, Object>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$25
            @Override // X.G0U
            public final Object invoke(EmailDeleteMailboxKey emailDeleteMailboxKey) {
                return emailDeleteMailboxKey.toString();
            }
        }, new G0U<EmailDeleteMailboxKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.email.entries.EmailEntryProvider$provideEntry$$inlined$entry$default$26
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(EmailDeleteMailboxKey emailDeleteMailboxKey) {
                return mapBottomSheet3;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(EmailDeleteMailboxKey emailDeleteMailboxKey) {
                return mapBottomSheet3;
            }
        }, g0w13, C3cG.A0x(EmailDeleteMailboxKey.class));
    }
}
