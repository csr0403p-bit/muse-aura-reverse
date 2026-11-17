package com.facebook.aura.gateway;

import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarVideoVariant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchAiIdentityHandler {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<AiIdentity> _aiIdentity;
    public final BLG<Long> _identityInvalidationGeneration;
    public final BLG<Long> _identityRefreshGeneration;
    public final C1BN<AiIdentity> aiIdentity;
    public long avatarRequests;
    public AvatarImageKey committedAvatarKey;
    public HxE<String, String> committedIdentityVm;
    public final C1BN<HatchGatewayConnectionState> connectionState;
    public final C1BN<Long> identityInvalidationGeneration;
    public final C1BN<Long> identityRefreshGeneration;
    public final Object identityRequestLock;
    public long identityRequests;
    public final HatchGatewayPrefsStore prefsStore;
    public final C3UX scope;
    public final HatchStatusVideoCache statusVideoCache;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler$1", f = "HatchAiIdentityHandler.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAiIdentityHandler.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchAiIdentityHandler hatchAiIdentityHandler = HatchAiIdentityHandler.this;
                C20Q c20qA01 = GDB.A01(new HatchAiIdentityHandler$1$invokeSuspend$$inlined$map$1(hatchAiIdentityHandler.connectionState));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchAiIdentityHandler.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        Object objFetchAiIdentity;
                        if (z && (objFetchAiIdentity = hatchAiIdentityHandler.fetchAiIdentity(htJ)) == EnumC10460Hji.A02) {
                            return objFetchAiIdentity;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return HatchAiIdentityHandler.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class AvatarImageKey extends C06G {
        public static final int $stable = 0;
        public final String path;
        public final long updatedMs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AvatarImageKey) {
                    AvatarImageKey avatarImageKey = (AvatarImageKey) obj;
                    if (!C7384Etj.areEqual(this.path, avatarImageKey.path) || this.updatedMs != avatarImageKey.updatedMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AvatarImageKey copy$default(AvatarImageKey avatarImageKey, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = avatarImageKey.path;
            }
            if ((i & 2) != 0) {
                j = avatarImageKey.updatedMs;
            }
            return new AvatarImageKey(str, j);
        }

        public final String component1() {
            return this.path;
        }

        public final long component2() {
            return this.updatedMs;
        }

        public final AvatarImageKey copy(String str, long j) {
            return new AvatarImageKey(str, j);
        }

        public final String getPath() {
            return this.path;
        }

        public final long getUpdatedMs() {
            return this.updatedMs;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.updatedMs, AnonymousClass006.A0G(this.path) * 31);
        }

        public AvatarImageKey(String str, long j) {
            this.path = str;
            this.updatedMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler", f = "HatchAiIdentityHandler.kt", l = {150}, m = "fetchAiIdentity", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$fetchAiIdentity$1, reason: invalid class name and case insensitive filesystem */
    public final class C120411 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C120411(HtJ<? super C120411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAiIdentityHandler.this.fetchAiIdentity(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler$fetchAiIdentity$4", f = "HatchAiIdentityHandler.kt", l = {187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$fetchAiIdentity$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AvatarJson $avatar;
        public final /* synthetic */ long $avatarRequest;
        public final /* synthetic */ HxE<String, String> $vm;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            AiIdentity value;
            AiIdentity aiIdentity;
            Object objResolveAvatarMedia = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAiIdentityHandler hatchAiIdentityHandler = HatchAiIdentityHandler.this;
                AvatarJson avatarJson = this.$avatar;
                String str = avatarJson != null ? avatarJson.assets_revision : null;
                this.label = 1;
                objResolveAvatarMedia = hatchAiIdentityHandler.resolveAvatarMedia(str, this);
                if (objResolveAvatarMedia == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AvatarMedia avatarMedia = (AvatarMedia) objResolveAvatarMedia;
            if (avatarMedia == null) {
                return Unit.INSTANCE;
            }
            HatchAiIdentityHandler hatchAiIdentityHandler2 = HatchAiIdentityHandler.this;
            Object obj2 = hatchAiIdentityHandler2.identityRequestLock;
            long j = this.$avatarRequest;
            HxE<String, String> hxE = this.$vm;
            synchronized (obj2) {
                if (j == hatchAiIdentityHandler2.avatarRequests) {
                    if (C7384Etj.areEqual(hxE, C3cH.A0q(hatchAiIdentityHandler2.prefsStore, hatchAiIdentityHandler2.prefsStore.getGatewayUrl())) && AuraSessionManager.INSTANCE.isCurrentSession(hatchAiIdentityHandler2.userSession)) {
                        HatchStatusVideoCache hatchStatusVideoCache = hatchAiIdentityHandler2.statusVideoCache;
                        String str2 = hxE.second;
                        if (str2 == null) {
                            str2 = hxE.first;
                        }
                        hatchStatusVideoCache.store$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str2, avatarMedia);
                        BLG<AiIdentity> blg = hatchAiIdentityHandler2._aiIdentity;
                        do {
                            value = blg.getValue();
                            aiIdentity = value;
                        } while (!blg.A6e(value, aiIdentity != null ? AiIdentity.copy$default(aiIdentity, null, null, null, null, null, null, null, avatarMedia, null, 383, null) : null));
                    }
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AvatarJson avatarJson, long j, HxE<String, String> hxE, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$avatar = avatarJson;
            this.$avatarRequest = j;
            this.$vm = hxE;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAiIdentityHandler.this.new AnonymousClass4(this.$avatar, this.$avatarRequest, this.$vm, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler", f = "HatchAiIdentityHandler.kt", l = {336}, m = "fetchIdentityHttp", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$1, reason: invalid class name and case insensitive filesystem */
    public final class C120421 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C120421(HtJ<? super C120421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAiIdentityHandler.this.fetchIdentityHttp(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler$onIdentityUpdated$2", f = "HatchAiIdentityHandler.kt", l = {99}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$onIdentityUpdated$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAiIdentityHandler.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAiIdentityHandler hatchAiIdentityHandler = HatchAiIdentityHandler.this;
                this.label = 1;
                if (hatchAiIdentityHandler.fetchAiIdentity(this) == enumC10460Hji) {
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
            return HatchAiIdentityHandler.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchAiIdentityHandler", f = "HatchAiIdentityHandler.kt", l = {214}, m = "resolveAvatarMedia", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchAiIdentityHandler$resolveAvatarMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C120431 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C120431(HtJ<? super C120431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAiIdentityHandler.this.resolveAvatarMedia(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void applyLocalName(String str) {
        AiIdentity aiIdentity;
        C7384Etj.A0Y(str, 0);
        synchronized (this.identityRequestLock) {
            this.identityRequests++;
            BLG<AiIdentity> blg = this._aiIdentity;
            AiIdentity value = blg.getValue();
            if (value == null || (aiIdentity = AiIdentity.copy$default(value, str, null, null, null, null, null, null, null, null, 510, null)) == null) {
                aiIdentity = new AiIdentity(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 510, 0 == true ? 1 : 0);
            }
            AnonymousClass002.A1I(blg, aiIdentity);
            this.prefsStore.setCachedAiIdentityName(str);
        }
    }

    public final class Companion {
        public final String avatarImageUrl(String str, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(str, abstractC3358CGz);
            return HatchFileOperations.INSTANCE.buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str, abstractC3358CGz, HatchThumbnailDisplaySize.MEDIUM);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AiIdentity cachedFallback() {
        String cachedAiIdentityName = this.prefsStore.getCachedAiIdentityName();
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (cachedAiIdentityName == null || cachedAiIdentityName.length() <= 0) {
            return null;
        }
        return new AiIdentity(cachedAiIdentityName, this.prefsStore.getCachedAiIdentityTagline(), str, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 508, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b A[PHI: r11
  0x018b: PHI (r11v1 com.facebook.aura.model.AvatarDisplayCrop) = (r11v0 com.facebook.aura.model.AvatarDisplayCrop), (r11v3 com.facebook.aura.model.AvatarDisplayCrop) binds: [B:61:0x0188, B:50:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.model.AvatarMedia declaredAvatarMedia(com.facebook.aura.gateway.AvatarJson r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAiIdentityHandler.declaredAvatarMedia(com.facebook.aura.gateway.AvatarJson):com.facebook.aura.model.AvatarMedia");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: Exception -> 0x0186, CancellationException -> 0x0199, PHI: r9
  0x0099: PHI (r9v6 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:46:0x00b3, B:38:0x0097] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x0199, Exception -> 0x0186, blocks: (B:22:0x0070, B:23:0x0073, B:25:0x007b, B:29:0x0081, B:31:0x0085, B:33:0x008b, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:40:0x009d, B:42:0x00a7, B:49:0x00cb, B:52:0x00d7, B:55:0x00e3, B:58:0x00ef, B:62:0x00fd, B:64:0x0101, B:67:0x0108, B:71:0x011a, B:72:0x011c, B:75:0x0127, B:77:0x0139, B:78:0x013f, B:81:0x015b, B:83:0x015e, B:84:0x016d, B:47:0x00b5, B:86:0x0170, B:88:0x0176, B:89:0x0183, B:19:0x0061), top: B:102:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAiIdentity(X.HtJ<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAiIdentityHandler.fetchAiIdentity(X.HtJ):java.lang.Object");
    }

    public static final Long fetchAiIdentity$commitIdentity(HatchAiIdentityHandler hatchAiIdentityHandler, HxE<String, String> hxE, long j, AiIdentity aiIdentity, HxE<String, String> hxE2, AvatarImageKey avatarImageKey, AvatarMedia avatarMedia, boolean z) {
        Long lValueOf;
        AvatarMedia avatarMedia2;
        synchronized (hatchAiIdentityHandler.identityRequestLock) {
            lValueOf = null;
            AiIdentity aiIdentityCopy$default = null;
            if (fetchAiIdentity$isCurrent(hatchAiIdentityHandler, hxE, j)) {
                if (avatarMedia != null) {
                    HatchStatusVideoCache hatchStatusVideoCache = hatchAiIdentityHandler.statusVideoCache;
                    String str = hxE.second;
                    if (str == null) {
                        str = hxE.first;
                    }
                    hatchStatusVideoCache.store$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(str, avatarMedia);
                }
                AiIdentity value = hatchAiIdentityHandler._aiIdentity.getValue();
                if (value == null || (avatarMedia2 = value.avatarMedia) == null || !C7384Etj.areEqual(hatchAiIdentityHandler.committedIdentityVm, hxE)) {
                    avatarMedia2 = null;
                }
                BLG<AiIdentity> blg = hatchAiIdentityHandler._aiIdentity;
                if (!z) {
                    aiIdentityCopy$default = aiIdentity;
                } else if (aiIdentity != null) {
                    if (avatarMedia2 == null) {
                        avatarMedia2 = new AvatarMedia(null, null, null, null, null, null, null, 127, null);
                    }
                    aiIdentityCopy$default = AiIdentity.copy$default(aiIdentity, null, null, null, null, null, null, null, avatarMedia2, null, 383, null);
                }
                blg.Af8(aiIdentityCopy$default);
                hatchAiIdentityHandler.committedIdentityVm = hxE2;
                hatchAiIdentityHandler.committedAvatarKey = avatarImageKey;
                if (aiIdentity != null) {
                    hatchAiIdentityHandler.prefsStore.setCachedAiIdentityName(aiIdentity.name);
                    hatchAiIdentityHandler.prefsStore.setCachedAiIdentityTagline(aiIdentity.tagline);
                }
                long j2 = hatchAiIdentityHandler.avatarRequests + 1;
                hatchAiIdentityHandler.avatarRequests = j2;
                lValueOf = Long.valueOf(j2);
            }
        }
        return lValueOf;
    }

    public static /* synthetic */ Long fetchAiIdentity$commitIdentity$default(HatchAiIdentityHandler hatchAiIdentityHandler, HxE hxE, long j, AiIdentity aiIdentity, HxE hxE2, AvatarImageKey avatarImageKey, AvatarMedia avatarMedia, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            hxE2 = null;
        }
        if ((i & 32) != 0) {
            avatarImageKey = null;
        }
        if ((i & 64) != 0) {
            avatarMedia = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return fetchAiIdentity$commitIdentity(hatchAiIdentityHandler, hxE, j, aiIdentity, hxE2, avatarImageKey, avatarMedia, z);
    }

    public static final boolean fetchAiIdentity$isCurrent(HatchAiIdentityHandler hatchAiIdentityHandler, HxE<String, String> hxE, long j) {
        boolean zA1M;
        synchronized (hatchAiIdentityHandler.identityRequestLock) {
            zA1M = AnonymousClass002.A1M((j > hatchAiIdentityHandler.identityRequests ? 1 : (j == hatchAiIdentityHandler.identityRequests ? 0 : -1)));
        }
        if (zA1M) {
            if (C7384Etj.areEqual(hxE, C3cH.A0q(hatchAiIdentityHandler.prefsStore, hatchAiIdentityHandler.prefsStore.getGatewayUrl())) && AuraSessionManager.INSTANCE.isCurrentSession(hatchAiIdentityHandler.userSession)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean fetchAiIdentity$preserveCurrentIdentity(com.facebook.aura.gateway.HatchAiIdentityHandler r3, X.HxE<java.lang.String, java.lang.String> r4, long r5) {
        /*
            java.lang.Object r2 = r3.identityRequestLock
            monitor-enter(r2)
            boolean r0 = fetchAiIdentity$isCurrent(r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1a
            X.HxE<java.lang.String, java.lang.String> r0 = r3.committedIdentityVm     // Catch: java.lang.Throwable -> L1d
            boolean r0 = X.C7384Etj.areEqual(r0, r4)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1a
            X.BLG<com.facebook.aura.model.AiIdentity> r0 = r3._aiIdentity     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            monitor-exit(r2)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAiIdentityHandler.fetchAiIdentity$preserveCurrentIdentity(com.facebook.aura.gateway.HatchAiIdentityHandler, X.HxE, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchIdentityHttp(X.HtJ<? super com.facebook.aura.gateway.IdentityPayloadJson> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchAiIdentityHandler.C120421
            r5 = r18
            if (r0 == 0) goto L6b
            r3 = r4
            com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$1 r3 = (com.facebook.aura.gateway.HatchAiIdentityHandler.C120421) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L2b
            if (r0 != r14) goto L71
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L2a
            r1 = 0
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$Identity r7 = com.facebook.aura.network.api.JarvisPath.Identity.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r0 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == r1) goto L2a
            r1 = r0
            goto L25
        L6b:
            com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$1 r3 = new com.facebook.aura.gateway.HatchAiIdentityHandler$fetchIdentityHttp$1
            r3.<init>(r4)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAiIdentityHandler.fetchIdentityHttp(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveAvatarMedia(java.lang.String r10, X.HtJ<? super com.facebook.aura.model.AvatarMedia> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.gateway.HatchAiIdentityHandler.C120431
            if (r0 == 0) goto L58
            r8 = r11
            com.facebook.aura.gateway.HatchAiIdentityHandler$resolveAvatarMedia$1 r8 = (com.facebook.aura.gateway.HatchAiIdentityHandler.C120431) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r0 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 != r6) goto L5e
            int r5 = r8.I$1
            int r4 = r8.I$0
            java.lang.Object r3 = r8.L$1
            int[] r3 = (int[]) r3
            java.lang.Object r1 = r8.L$0
            java.lang.String r10 = X.C3cG.A0d(r1, r0)
        L2b:
            if (r0 == 0) goto L2e
            return r0
        L2e:
            int r4 = r4 + 1
            if (r4 < r5) goto L3d
            r7 = 0
            return r7
        L34:
            X.Hwg.A00(r0)
            int[] r3 = X.AnonymousClass005.A1b()
            r5 = 1
            r4 = 0
        L3d:
            r2 = r3[r4]
            if (r2 != 0) goto L63
            com.facebook.aura.avatarmedia.HatchAvatarMedia r1 = com.facebook.aura.avatarmedia.HatchAvatarMedia.INSTANCE
            X.CGz r0 = r9.userSession
            r8.L$0 = r10
            r8.L$1 = r3
            r8.I$0 = r4
            r8.I$1 = r5
            r8.I$2 = r2
            r8.label = r6
            java.lang.Object r0 = r1.resolve(r0, r10, r8)
            if (r0 != r7) goto L2b
            return r7
        L58:
            com.facebook.aura.gateway.HatchAiIdentityHandler$resolveAvatarMedia$1 r8 = new com.facebook.aura.gateway.HatchAiIdentityHandler$resolveAvatarMedia$1
            r8.<init>(r11)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L63:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchAiIdentityHandler.resolveAvatarMedia(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void clearState() {
        this._aiIdentity.Af8(null);
    }

    public final C1BN<AiIdentity> getAiIdentity() {
        return this.aiIdentity;
    }

    public final AvatarImageKey getCommittedAvatarImageKey() {
        AvatarImageKey avatarImageKey;
        synchronized (this.identityRequestLock) {
            avatarImageKey = this.committedAvatarKey;
        }
        return avatarImageKey;
    }

    public final C1BN<Long> getIdentityInvalidationGeneration() {
        return this.identityInvalidationGeneration;
    }

    public final C1BN<Long> getIdentityRefreshGeneration() {
        return this.identityRefreshGeneration;
    }

    public final void onIdentityUpdated() {
        HtJ htJA14;
        synchronized (this.identityRequestLock) {
            BLG<Long> blg = this._identityInvalidationGeneration;
            htJA14 = C3cI.A14(blg, Long.valueOf(C3cH.A08(blg) + 1));
        }
        AnonymousClass001.A1J(new AnonymousClass2(htJA14), this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchAiIdentityHandler(AbstractC3358CGz abstractC3358CGz, C3UX c3ux, C1BN<? extends HatchGatewayConnectionState> c1bn) {
        AiIdentity aiIdentity;
        AnonymousClass005.A0x(abstractC3358CGz, c3ux, c1bn);
        this.userSession = abstractC3358CGz;
        this.scope = c3ux;
        this.connectionState = c1bn;
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGz);
        this.prefsStore = hatchGatewayPrefsStoreA0D;
        this.statusVideoCache = new HatchStatusVideoCache(abstractC3358CGz);
        this.identityRequestLock = C3cG.A0T();
        C9286GCn c9286GCnA14 = C3cG.A14(0L);
        this._identityInvalidationGeneration = c9286GCnA14;
        String str = null;
        this.identityInvalidationGeneration = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(0L);
        this._identityRefreshGeneration = c9286GCnA142;
        this.identityRefreshGeneration = C3cG.A11(c9286GCnA142);
        String cachedAiIdentityName = hatchGatewayPrefsStoreA0D.getCachedAiIdentityName();
        if (cachedAiIdentityName != null) {
            aiIdentity = new AiIdentity(cachedAiIdentityName, hatchGatewayPrefsStoreA0D.getCachedAiIdentityTagline(), str, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 508, null == true ? 1 : 0);
        } else {
            aiIdentity = null;
        }
        C9286GCn c9286GCnA01 = HnJ.A01(aiIdentity);
        this._aiIdentity = c9286GCnA01;
        this.aiIdentity = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1J(new AnonymousClass1(null), c3ux);
    }

    private final BO6<AvatarVideoVariant, String> resolveVideoVariantPaths(Map<String, String> map, String str) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (AvatarVideoVariant avatarVideoVariant : AvatarVideoVariant.values()) {
            String str2 = map.get(avatarVideoVariant.getKey());
            if (str2 != null) {
                linkedHashMapA0j.put(avatarVideoVariant, str2);
            }
        }
        AvatarVideoVariant avatarVideoVariant2 = AvatarVideoVariant.IDLE;
        if (!linkedHashMapA0j.containsKey(avatarVideoVariant2) && str != null) {
            linkedHashMapA0j.put(avatarVideoVariant2, str);
        }
        return AGI.A08(linkedHashMapA0j);
    }
}
