package com.facebook.aura.partners.voice.avatar;

import X.AbstractC05633ui;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.G0U;
import X.GDB;
import X.HxE;
import X.HzC;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceVideoConfigStore$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchVoiceVideoConfigStore> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchVoiceVideoConfigStore.Snapshot, Boolean> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;

        @Override // X.G0U
        public final Boolean invoke(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            C7384Etj.A0Y(snapshot, 0);
            return Boolean.valueOf(this.$avatarStore.retainCurrentAvatarFile(snapshot.avatar.avatarStillPath, snapshot.vm));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchVoiceAvatarStore hatchVoiceAvatarStore) {
            super(1);
            this.$avatarStore = hatchVoiceAvatarStore;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchVoiceVideoConfigStore.Snapshot, Unit> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            C7384Etj.A0Y(snapshot, 0);
            this.$avatarStore.releaseAvatarFile(snapshot.avatar.avatarStillPath);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchVoiceAvatarStore hatchVoiceAvatarStore) {
            super(1);
            this.$avatarStore = hatchVoiceAvatarStore;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            invoke2(snapshot);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<HatchVoiceReadinessRecord> {
        public AnonymousClass3(Object obj) {
            super(0, obj, HatchAvatarReferenceStore.class, "readiness", "readiness()Lcom/facebook/aura/partners/voice/avatar/HatchVoiceReadinessRecord;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchVoiceReadinessRecord invoke() {
            return ((HatchAvatarReferenceStore) this.receiver).readiness();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<HatchVoiceReadinessRecord, Unit> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
        public final /* synthetic */ HatchAvatarReferenceStore $referenceStore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAvatarReferenceStore hatchAvatarReferenceStore, HatchVoiceAvatarStore hatchVoiceAvatarStore) {
            super(1);
            this.$referenceStore = hatchAvatarReferenceStore;
            this.$avatarStore = hatchVoiceAvatarStore;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            HatchAvatarReferenceStore hatchAvatarReferenceStore = this.$referenceStore;
            if (hatchVoiceReadinessRecord == null) {
                hatchAvatarReferenceStore.clearReadiness();
            } else {
                hatchAvatarReferenceStore.storeReadiness(HatchVoiceReadinessRecord.copy$default(hatchVoiceReadinessRecord, null, null, null, 0L, null, null, false, null, 0, 0, null, null, null, null, null, null, false, this.$avatarStore.stillSha1(hatchVoiceReadinessRecord.avatarStillPath), null, 393215, null));
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            invoke2(hatchVoiceReadinessRecord);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<HatchVoiceReadinessRecord, HatchVoiceVideoConfigStore.Snapshot> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
        public final /* synthetic */ HatchGatewayPrefsStore $gateway;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        @Override // X.G0U
        public final HatchVoiceVideoConfigStore.Snapshot invoke(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            HatchVoiceVideoConfigStore.Snapshot snapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar;
            String str;
            HatchVoiceReadinessRecord hatchVoiceReadinessRecord2;
            C7384Etj.A0Y(hatchVoiceReadinessRecord, 0);
            HxE<String, String> hxEA0q = C3cH.A0q(this.$gateway, this.$gateway.getGatewayUrl());
            HatchVoiceAvatarStore hatchVoiceAvatarStore = this.$avatarStore;
            String str2 = hatchVoiceReadinessRecord.avatarImagePath;
            String str3 = hatchVoiceReadinessRecord.avatarStillSha1;
            if (str3 == null) {
                str3 = hatchVoiceReadinessRecord.sourceSha1;
            }
            String strCachedAvatarFileFor = hatchVoiceAvatarStore.cachedAvatarFileFor(str2, str3, hxEA0q);
            if (strCachedAvatarFileFor != null && (snapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar = hatchVoiceReadinessRecord.toSnapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(strCachedAvatarFileFor)) != null) {
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                if (HatchAvatarReferenceImageProviderKt.isFullBodyReference(snapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar.avatar.selection) && (str = hatchVoiceReadinessRecord.referenceImageUri) != null && !C7BY.A0j(str) && hxEA0q.equals(C3cG.A0r(hatchVoiceReadinessRecord.gatewayUrl, hatchVoiceReadinessRecord.vmId)) && (hatchVoiceReadinessRecord2 = snapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar.readinessRecord$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar()) != null && hatchVoiceReadinessRecord2.provesSameConfigAs(hatchVoiceReadinessRecord) && AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz) && AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason())) {
                    return snapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar;
                }
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchGatewayPrefsStore hatchGatewayPrefsStore, HatchVoiceAvatarStore hatchVoiceAvatarStore, AbstractC3358CGz abstractC3358CGz) {
            super(1);
            this.$gateway = hatchGatewayPrefsStore;
            this.$avatarStore = hatchVoiceAvatarStore;
            this.$userSession = abstractC3358CGz;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<HatchVoiceVideoConfigStore.Snapshot, Boolean> {
        public final /* synthetic */ HatchGatewayConnection $connection;
        public final /* synthetic */ HatchGatewayPrefsStore $gateway;
        public final /* synthetic */ HatchAvatarReferenceImageProvider $provider;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.Snapshot r4) {
            /*
                r3 = this;
                r0 = 0
                X.C7384Etj.A0Y(r4, r0)
                com.facebook.aura.gateway.HatchGatewayConnection r0 = r3.$connection
                com.facebook.aura.gateway.HatchAiIdentityHandler$AvatarImageKey r2 = r0.getCommittedAvatarImageKey()
                com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r0 = r4.avatar
                com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = r0.selection
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProviderKt.isFullBodyReference(r0)
                if (r0 == 0) goto L57
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r1 = r3.$provider
                com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r0 = r4.avatar
                com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = r0.selection
                com.facebook.aura.partners.voice.avatar.HatchAvatarReference r0 = r0.reference
                boolean r0 = r1.canRestoreReference$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(r0)
                if (r0 == 0) goto L57
                if (r2 == 0) goto L2c
                com.facebook.aura.gateway.HatchAiIdentityHandler$AvatarImageKey r0 = r4.avatarKey
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L57
            L2c:
                X.HxE<java.lang.String, java.lang.String> r2 = r4.vm
                com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r3.$gateway
                java.lang.String r1 = r0.getGatewayUrl()
                com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r3.$gateway
                X.HxE r0 = X.C3cH.A0q(r0, r1)
                boolean r0 = X.C7384Etj.areEqual(r2, r0)
                if (r0 == 0) goto L57
                com.facebook.aura.auth.AuraSessionManager r1 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
                X.CGz r0 = r3.$userSession
                boolean r0 = r1.isCurrentSession(r0)
                if (r0 == 0) goto L57
                com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
                com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason r0 = r0.getEmbodimentOffReason()
                boolean r1 = X.AnonymousClass002.A1Y(r0)
                r0 = 1
                if (r1 != 0) goto L58
            L57:
                r0 = 0
            L58:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1.AnonymousClass6.invoke(com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Snapshot):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchGatewayConnection hatchGatewayConnection, HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HatchGatewayPrefsStore hatchGatewayPrefsStore, AbstractC3358CGz abstractC3358CGz) {
            super(1);
            this.$connection = hatchGatewayConnection;
            this.$provider = hatchAvatarReferenceImageProvider;
            this.$gateway = hatchGatewayPrefsStore;
            this.$userSession = abstractC3358CGz;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0U<HatchVoiceVideoConfigStore.Snapshot, Boolean> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;

        @Override // X.G0U
        public final Boolean invoke(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            C7384Etj.A0Y(snapshot, 0);
            return Boolean.valueOf(this.$avatarStore.retainCachedAvatarFile(snapshot.avatar.avatarStillPath));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchVoiceAvatarStore hatchVoiceAvatarStore) {
            super(1);
            this.$avatarStore = hatchVoiceAvatarStore;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$Companion$getInstance$1$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ HatchVoiceAvatarStore $avatarStore;
        public final /* synthetic */ HatchGatewayPrefsStore $gateway;
        public final /* synthetic */ HatchAvatarReferenceImageProvider $provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HatchVoiceAvatarStore hatchVoiceAvatarStore, HatchGatewayPrefsStore hatchGatewayPrefsStore) {
            super(0);
            this.$provider = hatchAvatarReferenceImageProvider;
            this.$avatarStore = hatchVoiceAvatarStore;
            this.$gateway = hatchGatewayPrefsStore;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$provider.originalStillFailed$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(this.$avatarStore.currentVoiceAvatarPath(C3cH.A0q(this.$gateway, this.$gateway.getGatewayUrl()))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceVideoConfigStore$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchVoiceVideoConfigStore invoke() {
        HatchVoiceAvatarStore companion = HatchVoiceAvatarStore.Companion.getInstance(this.$userSession);
        HatchAvatarReferenceImageProvider companion2 = HatchAvatarReferenceImageProvider.Companion.getInstance(this.$userSession);
        HatchGatewayPrefsStore companion3 = HatchGatewayPrefsStore.Companion.getInstance(this.$userSession);
        HatchGatewayConnection companion4 = HatchGatewayConnection.Companion.getInstance(this.$userSession);
        HatchAvatarReferenceStore hatchAvatarReferenceStore = new HatchAvatarReferenceStore(this.$userSession);
        HatchVoiceVideoConfigStore$Companion$getInstance$1$current$1 hatchVoiceVideoConfigStore$Companion$getInstance$1$current$1 = new HatchVoiceVideoConfigStore$Companion$getInstance$1$current$1(companion3, companion, companion2, this.$userSession, companion4);
        HzC hzCA0x = C3cH.A0x(AnonymousClass001.A0y());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(companion);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(companion);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(hatchAvatarReferenceStore);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(hatchAvatarReferenceStore, companion);
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        return new HatchVoiceVideoConfigStore(hzCA0x, hatchVoiceVideoConfigStore$Companion$getInstance$1$current$1, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, new AnonymousClass5(companion3, companion, abstractC3358CGz), new AnonymousClass6(companion4, companion2, companion3, abstractC3358CGz), new AnonymousClass7(companion), new AnonymousClass8(companion2, companion, companion3), AbstractC05633ui.A01(companion2.preparedAvatar, companion.currentAvatarUri, GDB.A01(new HatchVoiceVideoConfigStore$Companion$getInstance$1$invoke$$inlined$map$1(companion4.gatewayState, companion3))));
    }
}
