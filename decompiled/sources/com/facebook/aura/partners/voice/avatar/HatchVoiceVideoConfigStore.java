package com.facebook.aura.partners.voice.avatar;

import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0862A6j;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceVideoConfigStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final Map<String, Snapshot> activePins;
    public volatile boolean closed;
    public final Function0<Snapshot> current;
    public final G0U<Snapshot, Boolean> isRestorable;
    public final BLG<Snapshot> latest;
    public final Function0<HatchVoiceReadinessRecord> loadReadiness;
    public final G0U<Snapshot, Boolean> onPin;
    public final G0U<Snapshot, Boolean> onPinRestored;
    public final G0U<Snapshot, Unit> onRelease;
    public final Function0<Boolean> originalStillFailure;
    public final C20Q<Snapshot> presentation;
    public final G0U<HatchVoiceReadinessRecord, Snapshot> restoreSnapshot;
    public final BLG<Snapshot> restored;
    public final G0U<HatchVoiceReadinessRecord, Unit> saveReadiness;
    public final C3UX scope;
    public final C1BN<Snapshot> updates;

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HatchVoiceReadinessRecord> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchVoiceReadinessRecord invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ HatchVoiceReadinessRecord invoke() {
            return null;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchVoiceReadinessRecord, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HatchVoiceReadinessRecord, Snapshot> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Snapshot invoke2(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            return null;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Snapshot invoke(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$7", f = "HatchAvatarReferenceStore.kt", l = {378}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<?> $currentChanges;
        public int label;
        public final /* synthetic */ HatchVoiceVideoConfigStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(C20Q<?> c20q, HatchVoiceVideoConfigStore hatchVoiceVideoConfigStore, HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
            this.$currentChanges = c20q;
            this.this$0 = hatchVoiceVideoConfigStore;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass7(this.$currentChanges, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<?> c20q = this.$currentChanges;
                final HatchVoiceVideoConfigStore hatchVoiceVideoConfigStore = this.this$0;
                C20Z<? super Object> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore.7.1
                    @Override // X.C20Z
                    public final Object emit(Object obj2, HtJ<? super Unit> htJ) {
                        Unit unit;
                        HatchVoiceVideoConfigStore hatchVoiceVideoConfigStore2 = hatchVoiceVideoConfigStore;
                        synchronized (hatchVoiceVideoConfigStore2) {
                            Snapshot snapshotLiveSnapshot = hatchVoiceVideoConfigStore2.liveSnapshot();
                            if (C7384Etj.areEqual(snapshotLiveSnapshot, hatchVoiceVideoConfigStore2.latest.getValue())) {
                                unit = Unit.INSTANCE;
                            } else {
                                hatchVoiceVideoConfigStore2.latest.Af8(snapshotLiveSnapshot);
                                if (snapshotLiveSnapshot != null) {
                                    hatchVoiceVideoConfigStore2.restored.Af8(null);
                                    HatchVoiceReadinessRecord hatchVoiceReadinessRecord = snapshotLiveSnapshot.readinessRecord$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar();
                                    if (hatchVoiceReadinessRecord != null) {
                                        hatchVoiceVideoConfigStore2.saveReadiness.invoke(hatchVoiceReadinessRecord);
                                    }
                                }
                                unit = Unit.INSTANCE;
                            }
                        }
                        return unit;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass7) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Snapshot extends C06G {
        public final PreparedHatchAvatar avatar;
        public final HatchAiIdentityHandler.AvatarImageKey avatarKey;
        public final String avatarStem;
        public final HxE<String, String> vm;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Snapshot) {
                    Snapshot snapshot = (Snapshot) obj;
                    if (!C7384Etj.areEqual(this.avatar, snapshot.avatar) || !C7384Etj.areEqual(this.vm, snapshot.vm) || !C7384Etj.areEqual(this.avatarKey, snapshot.avatarKey) || !C7384Etj.areEqual(this.avatarStem, snapshot.avatarStem)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean sameConfig(Snapshot snapshot) {
            if (snapshot == null || !C7384Etj.areEqual(this.vm, snapshot.vm)) {
                return false;
            }
            return C7384Etj.areEqual(this.avatar.selection.reference.assetId, snapshot.avatar.selection.reference.assetId) && C7384Etj.areEqual(resolvedCrop(), snapshot.resolvedCrop());
        }

        public final boolean sameMediaGeneration(Snapshot snapshot) {
            return snapshot != null && sameConfig(snapshot) && C7384Etj.areEqual(this.avatar.selection.reference.sourceSha1, snapshot.avatar.selection.reference.sourceSha1);
        }

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, PreparedHatchAvatar preparedHatchAvatar, HxE hxE, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                preparedHatchAvatar = snapshot.avatar;
            }
            if ((i & 2) != 0) {
                hxE = snapshot.vm;
            }
            if ((i & 4) != 0) {
                avatarImageKey = snapshot.avatarKey;
            }
            if ((i & 8) != 0) {
                str = snapshot.avatarStem;
            }
            AnonymousClass003.A0u(preparedHatchAvatar, hxE);
            return new Snapshot(preparedHatchAvatar, hxE, avatarImageKey, str);
        }

        public final PreparedHatchAvatar component1() {
            return this.avatar;
        }

        public final HxE<String, String> component2() {
            return this.vm;
        }

        public final HatchAiIdentityHandler.AvatarImageKey component3() {
            return this.avatarKey;
        }

        public final String component4() {
            return this.avatarStem;
        }

        public final PreparedHatchAvatar getAvatar() {
            return this.avatar;
        }

        public final HatchAiIdentityHandler.AvatarImageKey getAvatarKey() {
            return this.avatarKey;
        }

        public final String getAvatarStem() {
            return this.avatarStem;
        }

        public final HxE<String, String> getVm() {
            return this.vm;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.vm, AnonymousClass005.A0E(this.avatar)) + AnonymousClass006.A0D(this.avatarKey)) * 31) + AnonymousClass005.A0H(this.avatarStem);
        }

        public final HatchVoiceReadinessRecord readinessRecord$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar() {
            String str;
            HatchAvatarReference hatchAvatarReference = this.avatar.selection.reference;
            HatchAiIdentityHandler.AvatarImageKey avatarImageKey = this.avatarKey;
            if (avatarImageKey == null || hatchAvatarReference.assetId.length() == 0 || (str = avatarImageKey.path) == null || str.length() == 0) {
                return null;
            }
            HatchVideoCrop hatchVideoCropResolvedCrop = resolvedCrop();
            HxE<String, String> hxE = this.vm;
            String str2 = hxE.first;
            String str3 = hxE.second;
            String str4 = avatarImageKey.path;
            long j = avatarImageKey.updatedMs;
            PreparedHatchAvatar preparedHatchAvatar = this.avatar;
            String str5 = preparedHatchAvatar.avatarStillPath;
            HatchAvatarSelection hatchAvatarSelection = preparedHatchAvatar.selection;
            return new HatchVoiceReadinessRecord(str2, str3, str4, j, str5, hatchAvatarSelection.kind, hatchAvatarSelection.fullFrame, hatchAvatarReference.assetId, hatchVideoCropResolvedCrop.top, hatchVideoCropResolvedCrop.bottom, hatchAvatarReference.sourceSha1, hatchAvatarReference.idleVideoUri, hatchAvatarReference.imageUri, hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, hatchAvatarReference.embodimentCompatible, null, preparedHatchAvatar.referenceFromOriginal);
        }

        public final HatchVideoCrop resolvedCrop() {
            HatchAvatarSelection hatchAvatarSelection = this.avatar.selection;
            HatchAvatarReference hatchAvatarReference = hatchAvatarSelection.reference;
            return VideoConfigJsonKt.resolveHatchVoiceVideoCrop(hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, hatchAvatarSelection.fullFrame);
        }

        public Snapshot(PreparedHatchAvatar preparedHatchAvatar, HxE<String, String> hxE, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str) {
            AnonymousClass003.A0u(preparedHatchAvatar, hxE);
            this.avatar = preparedHatchAvatar;
            this.vm = hxE;
            this.avatarKey = avatarImageKey;
            this.avatarStem = str;
        }

        public final Snapshot copy(PreparedHatchAvatar preparedHatchAvatar, HxE<String, String> hxE, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str) {
            AnonymousClass003.A0u(preparedHatchAvatar, hxE);
            return new Snapshot(preparedHatchAvatar, hxE, avatarImageKey, str);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Snapshot(PreparedHatchAvatar preparedHatchAvatar, HxE hxE, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str, int i, C06H c06h) {
            this(preparedHatchAvatar, hxE, (i & 4) != 0 ? null : avatarImageKey, (i & 8) != 0 ? null : str);
        }
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.closed = true;
        this.latest.Af8(null);
        this.restored.Af8(null);
        this.saveReadiness.invoke(null);
        Hxb.A03(null, this.scope);
    }

    public final synchronized Snapshot pin(String str) {
        Snapshot snapshotRestoredSnapshot;
        if (str == null) {
            return null;
        }
        Snapshot snapshot = this.activePins.get(str);
        if (snapshot != null) {
            return snapshot;
        }
        Snapshot snapshotLiveSnapshot = liveSnapshot();
        if (snapshotLiveSnapshot == null) {
            snapshotRestoredSnapshot = restoredSnapshot();
            if (snapshotRestoredSnapshot == null) {
                return null;
            }
        } else {
            snapshotRestoredSnapshot = snapshotLiveSnapshot;
        }
        Collection<Snapshot> collectionValues = this.activePins.values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator<Snapshot> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!it.next().sameMediaGeneration(snapshotRestoredSnapshot)) {
                    return null;
                }
            }
        }
        if (AnonymousClass001.A1X(snapshotLiveSnapshot != null ? this.onPin.invoke(snapshotRestoredSnapshot) : this.onPinRestored.invoke(snapshotRestoredSnapshot))) {
            this.activePins.put(str, snapshotRestoredSnapshot);
            CFK.A00(str, snapshotRestoredSnapshot.avatar.selection.reference.assetId, Integer.valueOf(this.activePins.size()), Boolean.valueOf(AnonymousClass002.A1Y(snapshotLiveSnapshot)), HatchAvatarReferenceStoreKt.TAG, "video_config.pinned owner=%s assetId=%s owners=%d restored=%b");
            return snapshotRestoredSnapshot;
        }
        if (snapshotLiveSnapshot == null) {
            this.restored.Af8(null);
        }
        return null;
    }

    public final synchronized void releasePin(String str) {
        Snapshot snapshot = (Snapshot) C0862A6j.A01(this.activePins).remove(str);
        if (snapshot != null) {
            this.onRelease.invoke(snapshot);
            CFK.A02(str, Integer.valueOf(this.activePins.size()), HatchAvatarReferenceStoreKt.TAG, "video_config.pin_released owner=%s owners=%d");
        }
    }

    public final synchronized Snapshot repin(String str) {
        Snapshot snapshotRestoredSnapshot;
        C7384Etj.A0Y(str, 0);
        Snapshot snapshotLiveSnapshot = liveSnapshot();
        if (snapshotLiveSnapshot == null) {
            snapshotRestoredSnapshot = restoredSnapshot();
            if (snapshotRestoredSnapshot == null) {
            }
            return null;
        }
        snapshotRestoredSnapshot = snapshotLiveSnapshot;
        Snapshot snapshot = this.activePins.get(str);
        if (snapshot != null && snapshot.sameMediaGeneration(snapshotRestoredSnapshot)) {
            return snapshot;
        }
        Map<String, Snapshot> map = this.activePins;
        if (!map.isEmpty()) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String str2 = (String) entryA0l.getKey();
                Snapshot snapshot2 = (Snapshot) entryA0l.getValue();
                if (!str.equals(str2) && !snapshot2.sameMediaGeneration(snapshotRestoredSnapshot)) {
                    break;
                }
            }
        }
        if (AnonymousClass001.A1X(snapshotLiveSnapshot != null ? this.onPin.invoke(snapshotRestoredSnapshot) : this.onPinRestored.invoke(snapshotRestoredSnapshot))) {
            this.activePins.put(str, snapshotRestoredSnapshot);
            if (snapshot != null) {
                this.onRelease.invoke(snapshot);
            }
            CFK.A01(str, snapshotRestoredSnapshot.avatar.selection.reference.assetId, Boolean.valueOf(snapshotLiveSnapshot == null), HatchAvatarReferenceStoreKt.TAG, "video_config.repinned owner=%s assetId=%s restored=%b");
            return snapshotRestoredSnapshot;
        }
        return null;
    }

    public final void seedRestoredAvatar() {
        Snapshot snapshotInvoke;
        synchronized (this) {
            if (!this.closed && this.latest.getValue() == null && this.restored.getValue() == null) {
                HatchVoiceReadinessRecord hatchVoiceReadinessRecordInvoke = this.loadReadiness.invoke();
                if (hatchVoiceReadinessRecordInvoke == null || (snapshotInvoke = this.restoreSnapshot.invoke(hatchVoiceReadinessRecordInvoke)) == null) {
                    return;
                }
                synchronized (this) {
                    if (!this.closed && this.latest.getValue() == null && this.restored.getValue() == null) {
                        AnonymousClass002.A1I(this.restored, snapshotInvoke);
                        CFK.A03(hatchVoiceReadinessRecordInvoke.assetId, HatchAvatarReferenceStoreKt.TAG, "video_config.seeded assetId=%s");
                    }
                }
            }
        }
    }

    public final synchronized Snapshot snapshot() {
        Snapshot snapshotLiveSnapshot;
        snapshotLiveSnapshot = liveSnapshot();
        if (snapshotLiveSnapshot == null) {
            snapshotLiveSnapshot = restoredSnapshot();
        }
        return snapshotLiveSnapshot;
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Snapshot, Boolean> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Snapshot snapshot) {
            return AnonymousClass001.A0h();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Snapshot snapshot) {
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<Snapshot, Boolean> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Snapshot snapshot) {
            return AnonymousClass001.A0h();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Snapshot snapshot) {
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Snapshot liveSnapshot() {
        Snapshot snapshotInvoke = this.current.invoke();
        if (snapshotInvoke == null || this.closed) {
            return null;
        }
        return snapshotInvoke;
    }

    private final Snapshot restoredSnapshot() {
        Snapshot value = this.restored.getValue();
        if (value == null || this.closed || !AnonymousClass003.A1X(value, this.isRestorable)) {
            return null;
        }
        return value;
    }

    public final C20Q<Snapshot> getPresentation() {
        return this.presentation;
    }

    public final C1BN<Snapshot> getUpdates() {
        return this.updates;
    }

    public final boolean originalStillFailed() {
        return AnonymousClass003.A1Y(this.originalStillFailure);
    }

    public final class Companion {
        public final HatchVoiceVideoConfigStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVoiceVideoConfigStore) abstractC3358CGz.A03(HatchVoiceVideoConfigStore.class, new HatchVoiceVideoConfigStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceVideoConfigStore(C3UX c3ux, Function0<Snapshot> function0, G0U<? super Snapshot, Boolean> g0u, G0U<? super Snapshot, Unit> g0u2, Function0<HatchVoiceReadinessRecord> function02, G0U<? super HatchVoiceReadinessRecord, Unit> g0u3, G0U<? super HatchVoiceReadinessRecord, Snapshot> g0u4, G0U<? super Snapshot, Boolean> g0u5, G0U<? super Snapshot, Boolean> g0u6, Function0<Boolean> function03, C20Q<?> c20q) {
        AnonymousClass005.A17(c3ux, function0, g0u, g0u2, function02);
        AnonymousClass005.A0z(g0u3, g0u4, g0u5);
        AnonymousClass002.A1F(g0u6, 8, function03);
        C7384Etj.A0Y(c20q, 10);
        this.scope = c3ux;
        this.current = function0;
        this.onPin = g0u;
        this.onRelease = g0u2;
        this.loadReadiness = function02;
        this.saveReadiness = g0u3;
        this.restoreSnapshot = g0u4;
        this.isRestorable = g0u5;
        this.onPinRestored = g0u6;
        this.originalStillFailure = function03;
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this.latest = c9286GCnA14;
        this.activePins = C3cG.A0j();
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this.restored = c9286GCnA142;
        this.updates = C3cG.A11(c9286GCnA14);
        this.presentation = AbstractC05623ug.A00(AnonymousClass001.A0y(), GDB.A01(C3rb.A00(new HatchVoiceVideoConfigStore$presentation$1(this, null), c9286GCnA14, c9286GCnA142, c20q)));
        AnonymousClass001.A1J(new AnonymousClass7(c20q, this, null), c3ux);
    }

    public /* synthetic */ HatchVoiceVideoConfigStore(C3UX c3ux, Function0 function0, G0U g0u, G0U g0u2, Function0 function02, G0U g0u3, G0U g0u4, G0U g0u5, G0U g0u6, Function0 function03, C20Q c20q, int i, C06H c06h) {
        this(c3ux, function0, g0u, g0u2, (i & 16) != 0 ? AnonymousClass1.INSTANCE : function02, (i & 32) != 0 ? AnonymousClass2.INSTANCE : g0u3, (i & 64) != 0 ? AnonymousClass3.INSTANCE : g0u4, (i & 128) != 0 ? AnonymousClass4.INSTANCE : g0u5, (i & 256) != 0 ? AnonymousClass5.INSTANCE : g0u6, (i & 512) != 0 ? AnonymousClass6.INSTANCE : function03, (i & 1024) != 0 ? new C20Y(Unit.INSTANCE) : c20q);
    }
}
