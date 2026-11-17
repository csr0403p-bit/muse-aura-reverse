package com.facebook.aura.partners.voice.avatar;

import X.AOk;
import X.Ab3;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.C05663ul;
import X.C06G;
import X.C06H;
import X.C07739il;
import X.C0KA;
import X.C10543Hqv;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C27k;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pU;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.Ey9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GAo;
import X.GDB;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.components.reactions.AuraRedlineKt;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.iap.MC;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarCallIdleVideo;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.settings.MC;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.utils.MC;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchAvatarReferenceImageProvider implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<PreparedHatchAvatar> _preparedAvatar;
    public final BLG<PrewarmedHatchIdleVideo> _prewarmedIdleVideo;
    public final BLG<HatchReadyCallIdle> _readyCallIdle;
    public final BLG<Boolean> admittedCallIdleDark;
    public volatile CachedReference cached;
    public volatile CachedVariant cachedFullFrameServer;
    public final AtomicBoolean callIdleRestoreStarted;
    public volatile HxE<HashedStill, String> hashedStill;
    public final HatchAvatarIdlePosterCache idlePosters;
    public final C1BN<Boolean> isCallEmbodimentDark;
    public final Object mediaLock;
    public volatile HxE<String, String> originalSha1ForStill;
    public volatile String originalStillFailure;
    public final Object originalStillFailureLock;
    public final C1BN<PreparedHatchAvatar> preparedAvatar;
    public volatile PrewarmJob prewarmJob;
    public final InterfaceC2261BLa prewarmMutex;
    public final AtomicLong prewarmRequests;
    public final C3UX prewarmScope;
    public final C1BN<PrewarmedHatchIdleVideo> prewarmedIdleVideo;
    public final C1BN<HatchReadyCallIdle> readyCallIdle;
    public final SingleFlight singleFlight;
    public final HatchAvatarReferenceStore store;
    public final AbstractC3358CGz userSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AvatarMediaPublishResult {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AvatarMediaPublishResult[] $VALUES;
        public static final AvatarMediaPublishResult IDLE_VIDEO;
        public static final AvatarMediaPublishResult PREPARED;
        public static final AvatarMediaPublishResult REJECTED;

        static {
            AvatarMediaPublishResult avatarMediaPublishResult = new AvatarMediaPublishResult("REJECTED", 0);
            REJECTED = avatarMediaPublishResult;
            AvatarMediaPublishResult avatarMediaPublishResult2 = new AvatarMediaPublishResult(CvmMigrationStatusJson.STAGE_PREPARED, 1);
            PREPARED = avatarMediaPublishResult2;
            AvatarMediaPublishResult avatarMediaPublishResult3 = new AvatarMediaPublishResult("IDLE_VIDEO", 2);
            IDLE_VIDEO = avatarMediaPublishResult3;
            AvatarMediaPublishResult[] avatarMediaPublishResultArr = {avatarMediaPublishResult, avatarMediaPublishResult2, avatarMediaPublishResult3};
            $VALUES = avatarMediaPublishResultArr;
            $ENTRIES = C3cG.A0w(avatarMediaPublishResultArr);
        }

        public static Ey9<AvatarMediaPublishResult> getEntries() {
            return $ENTRIES;
        }

        public static AvatarMediaPublishResult valueOf(String str) {
            return (AvatarMediaPublishResult) Enum.valueOf(AvatarMediaPublishResult.class, str);
        }

        public static AvatarMediaPublishResult[] values() {
            return (AvatarMediaPublishResult[]) $VALUES.clone();
        }

        public AvatarMediaPublishResult(String str, int i) {
        }
    }

    public final class CachedReference extends C06G {
        public final boolean cropRefreshed;
        public final HatchAvatarReference reference;
        public final String sourceSha1;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CachedReference) {
                    CachedReference cachedReference = (CachedReference) obj;
                    if (!C7384Etj.areEqual(this.sourceSha1, cachedReference.sourceSha1) || !C7384Etj.areEqual(this.reference, cachedReference.reference) || this.cropRefreshed != cachedReference.cropRefreshed) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CachedReference copy$default(CachedReference cachedReference, String str, HatchAvatarReference hatchAvatarReference, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cachedReference.sourceSha1;
            }
            if ((i & 2) != 0) {
                hatchAvatarReference = cachedReference.reference;
            }
            if ((i & 4) != 0) {
                z = cachedReference.cropRefreshed;
            }
            return cachedReference.copy(str, hatchAvatarReference, z);
        }

        public final String component1() {
            return this.sourceSha1;
        }

        public final HatchAvatarReference component2() {
            return this.reference;
        }

        public final boolean component3() {
            return this.cropRefreshed;
        }

        public final boolean getCropRefreshed() {
            return this.cropRefreshed;
        }

        public final HatchAvatarReference getReference() {
            return this.reference;
        }

        public final String getSourceSha1() {
            return this.sourceSha1;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.reference, AnonymousClass001.A0G(this.sourceSha1)), this.cropRefreshed);
        }

        public final boolean isUsable() {
            return HatchAvatarReferenceImageProviderKt.hasResolvedCrop(this.reference) || this.cropRefreshed;
        }

        public CachedReference(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
            AnonymousClass003.A0u(str, hatchAvatarReference);
            this.sourceSha1 = str;
            this.reference = hatchAvatarReference;
            this.cropRefreshed = z;
        }

        public final CachedReference copy(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
            AnonymousClass003.A0u(str, hatchAvatarReference);
            return new CachedReference(str, hatchAvatarReference, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ CachedReference(String str, HatchAvatarReference hatchAvatarReference, boolean z, int i, C06H c06h) {
            this(str, hatchAvatarReference, AnonymousClass005.A1O(i, z));
        }
    }

    public final class CachedVariant extends C06G {
        public final String key;
        public final HatchAvatarReference reference;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CachedVariant) {
                    CachedVariant cachedVariant = (CachedVariant) obj;
                    if (!C7384Etj.areEqual(this.key, cachedVariant.key) || !C7384Etj.areEqual(this.reference, cachedVariant.reference)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CachedVariant copy$default(CachedVariant cachedVariant, String str, HatchAvatarReference hatchAvatarReference, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cachedVariant.key;
            }
            if ((i & 2) != 0) {
                hatchAvatarReference = cachedVariant.reference;
            }
            AnonymousClass003.A0u(str, hatchAvatarReference);
            return new CachedVariant(str, hatchAvatarReference);
        }

        public final String component1() {
            return this.key;
        }

        public final HatchAvatarReference component2() {
            return this.reference;
        }

        public final String getKey() {
            return this.key;
        }

        public final HatchAvatarReference getReference() {
            return this.reference;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.reference, AnonymousClass001.A0G(this.key));
        }

        public CachedVariant(String str, HatchAvatarReference hatchAvatarReference) {
            AnonymousClass003.A0u(str, hatchAvatarReference);
            this.key = str;
            this.reference = hatchAvatarReference;
        }

        public final CachedVariant copy(String str, HatchAvatarReference hatchAvatarReference) {
            AnonymousClass003.A0u(str, hatchAvatarReference);
            return new CachedVariant(str, hatchAvatarReference);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class HashedStill extends C06G {
        public final long lastModified;
        public final long length;
        public final String path;

        public HashedStill(String str, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            this.path = str;
            this.lastModified = j;
            this.length = j2;
        }

        public final HashedStill copy(String str, long j, long j2) {
            C7384Etj.A0Y(str, 0);
            return new HashedStill(str, j, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HashedStill) {
                    HashedStill hashedStill = (HashedStill) obj;
                    if (!C7384Etj.areEqual(this.path, hashedStill.path) || this.lastModified != hashedStill.lastModified || this.length != hashedStill.length) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ HashedStill copy$default(HashedStill hashedStill, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hashedStill.path;
            }
            if ((i & 2) != 0) {
                j = hashedStill.lastModified;
            }
            if ((i & 4) != 0) {
                j2 = hashedStill.length;
            }
            return hashedStill.copy(str, j, j2);
        }

        public final String component1() {
            return this.path;
        }

        public final long component2() {
            return this.lastModified;
        }

        public final long component3() {
            return this.length;
        }

        public final long getLastModified() {
            return this.lastModified;
        }

        public final long getLength() {
            return this.length;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return AnonymousClass006.A06(this.lastModified, AnonymousClass001.A0G(this.path)) + C3cG.A02(this.length);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OriginalStill {
        public final byte[] bytes;
        public final String sha1;

        public OriginalStill(String str, byte[] bArr) {
            C7384Etj.A0Y(str, 0);
            this.sha1 = str;
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final String getSha1() {
            return this.sha1;
        }
    }

    public final class PrewarmJob {
        public C27k<PrewarmResult> job;
        public volatile long lastRetryAtMs;
        public volatile PrewarmResult latest;
        public final String path;

        public PrewarmJob(String str) {
            C7384Etj.A0Y(str, 0);
            this.path = str;
            this.lastRetryAtMs = -4611686018427387904L;
        }

        public final void setJob(C27k<PrewarmResult> c27k) {
            C7384Etj.A0Y(c27k, 0);
            this.job = c27k;
        }

        public final C27k<PrewarmResult> getJob() {
            C27k<PrewarmResult> c27k = this.job;
            if (c27k != null) {
                return c27k;
            }
            C7384Etj.A0b("job");
            throw F60.createAndThrow();
        }

        public final long getLastRetryAtMs() {
            return this.lastRetryAtMs;
        }

        public final PrewarmResult getLatest() {
            return this.latest;
        }

        public final String getPath() {
            return this.path;
        }

        public final void setLastRetryAtMs(long j) {
            this.lastRetryAtMs = j;
        }

        public final void setLatest(PrewarmResult prewarmResult) {
            this.latest = prewarmResult;
        }
    }

    public final class PrewarmResult extends C06G {
        public final ResolvedAvatarSelection selection;

        public PrewarmResult(ResolvedAvatarSelection resolvedAvatarSelection) {
            C7384Etj.A0Y(resolvedAvatarSelection, 0);
            this.selection = resolvedAvatarSelection;
        }

        public final PrewarmResult copy(ResolvedAvatarSelection resolvedAvatarSelection) {
            C7384Etj.A0Y(resolvedAvatarSelection, 0);
            return new PrewarmResult(resolvedAvatarSelection);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PrewarmResult) && C7384Etj.areEqual(this.selection, ((PrewarmResult) obj).selection));
        }

        public static /* synthetic */ PrewarmResult copy$default(PrewarmResult prewarmResult, ResolvedAvatarSelection resolvedAvatarSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvedAvatarSelection = prewarmResult.selection;
            }
            C7384Etj.A0Y(resolvedAvatarSelection, 0);
            return new PrewarmResult(resolvedAvatarSelection);
        }

        public final ResolvedAvatarSelection component1() {
            return this.selection;
        }

        public final ResolvedAvatarSelection getSelection() {
            return this.selection;
        }

        public int hashCode() {
            return this.selection.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$cachedFullFrameServerFor$5", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$cachedFullFrameServerFor$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchAvatarReference>, Object> {
        public final /* synthetic */ String $key;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$key = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new AnonymousClass5(this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchAvatarReference hatchAvatarReferenceSelection;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!HatchAvatarReferenceImageProvider.this.isCurrentSession() || (hatchAvatarReferenceSelection = HatchAvatarReferenceImageProvider.this.store.selection(this.$key)) == null || !HatchAvatarReferenceImageProvider.this.isCurrentSession()) {
                return null;
            }
            HatchAvatarReferenceImageProvider.this.cachedFullFrameServer = new CachedVariant(this.$key, hatchAvatarReferenceSelection);
            return hatchAvatarReferenceSelection;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchAvatarReference> htJ) {
            return ((AnonymousClass5) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$callIdleInputs$1", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$callIdleInputs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<AiIdentity, Boolean, HtJ<? super AvatarCallIdleVideo>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        public final Object invoke(AiIdentity aiIdentity, boolean z, HtJ<? super AvatarCallIdleVideo> htJ) {
            AnonymousClass1 anonymousClass1 = HatchAvatarReferenceImageProvider.this.new AnonymousClass1(htJ);
            anonymousClass1.L$0 = aiIdentity;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AiIdentity aiIdentity = (AiIdentity) this.L$0;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (aiIdentity != null) {
                return DarkCallMediaKt.callIdleVideo(aiIdentity, HatchAvatarReferenceImageProvider.this.userSession, z);
            }
            return null;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(AiIdentity aiIdentity, Boolean bool, HtJ<? super AvatarCallIdleVideo> htJ) {
            return invoke(aiIdentity, AnonymousClass001.A1X(bool), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$callIdleInputs$2", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$callIdleInputs$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0W<AvatarCallIdleVideo, Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster>, HtJ<? super HxE<? extends AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster>>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(3, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AvatarCallIdleVideo avatarCallIdleVideo, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> map, HtJ<? super HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>>> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = avatarCallIdleVideo;
            anonymousClass2.L$1 = map;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (obj2 == null || !AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason())) {
                obj2 = null;
            }
            return C3cG.A0r(obj2, obj3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(AvatarCallIdleVideo avatarCallIdleVideo, Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster> map, HtJ<? super HxE<? extends AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, ? extends HatchAvatarIdlePoster>>> htJ) {
            return invoke2(avatarCallIdleVideo, (Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>) map, (HtJ<? super HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__}, m = "downloadOriginalStill", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$downloadOriginalStill$1, reason: invalid class name and case insensitive filesystem */
    public final class C130561 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C130561(HtJ<? super C130561> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.downloadOriginalStill(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {606, 608}, m = "drivePrewarm", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$drivePrewarm$1, reason: invalid class name and case insensitive filesystem */
    public final class C130571 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C130571(HtJ<? super C130571> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.drivePrewarm(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {AuraRedlineKt.REDLINE_GLYPH_DURATION_MS}, m = "fetchOriginalStill", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fetchOriginalStill$1, reason: invalid class name and case insensitive filesystem */
    public final class C130581 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C130581(HtJ<? super C130581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.fetchOriginalStill(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {791, 801}, m = "fullFrameSelection", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fullFrameSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C130591 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C130591(HtJ<? super C130591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.fullFrameSelection(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$isCallEmbodimentDark$1", f = "HatchAvatarReferenceImageProvider.kt", l = {196}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$isCallEmbodimentDark$1, reason: invalid class name and case insensitive filesystem */
    public final class C130601 extends AbstractC07127nr implements G0V<C20Z<? super AiIdentity>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C130601(HtJ<? super C130601> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C130601 c130601 = HatchAvatarReferenceImageProvider.this.new C130601(htJ);
            c130601.L$0 = obj;
            return c130601;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AiIdentity> aiIdentity = HatchGatewayConnection.Companion.getInstance(HatchAvatarReferenceImageProvider.this.userSession).getAiIdentity();
                this.L$0 = null;
                this.label = 1;
                if (C3pU.A01(this, aiIdentity, c20z) == enumC10460Hji) {
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
        public final Object invoke(C20Z<? super AiIdentity> c20z, HtJ<? super Unit> htJ) {
            return ((C130601) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$isCallEmbodimentDark$3", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$isCallEmbodimentDark$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G2j<Boolean, Boolean, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(4, htJ);
        }

        public final Object invoke(Boolean bool, boolean z, boolean z2, HtJ<? super Boolean> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = bool;
            anonymousClass3.Z$0 = z;
            anonymousClass3.Z$1 = z2;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(HatchAvatarReferenceImageProviderKt.callEmbodimentDark(bool, z, z2));
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super Boolean> htJ) {
            return invoke(bool, AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$loadCallIdleForCall$2", f = "HatchAvatarReferenceImageProvider.kt", l = {708}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$loadCallIdleForCall$2, reason: invalid class name and case insensitive filesystem */
    public final class C130612 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C130612(HtJ<? super C130612> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130612(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                final C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                C20Q c20qCallIdleInputs = HatchAvatarReferenceImageProvider.this.callIdleInputs();
                final HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = HatchAvatarReferenceImageProvider.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.loadCallIdleForCall.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey, java.lang.Object] */
                    public final Object emit(HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> hxE, HtJ<? super Unit> htJ) {
                        AvatarCallIdleVideo avatarCallIdleVideoLocalCallIdle;
                        AvatarCallIdleVideo avatarCallIdleVideo = hxE.first;
                        Map map = (Map) hxE.second;
                        if (avatarCallIdleVideo != null && (avatarCallIdleVideoLocalCallIdle = hatchAvatarReferenceImageProvider.idlePosters.localCallIdle(avatarCallIdleVideo)) != null) {
                            ?? r2 = (T) HatchAvatarIdlePosterCacheKt.posterKey(avatarCallIdleVideoLocalCallIdle);
                            HatchAvatarIdlePoster hatchAvatarIdlePoster = (HatchAvatarIdlePoster) map.get(r2);
                            if (!r2.equals(c10543HqvA10.element) && (hatchAvatarIdlePoster == null || !hatchAvatarReferenceImageProvider.idlePosters.isOnDisk$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(avatarCallIdleVideoLocalCallIdle, hatchAvatarIdlePoster))) {
                                c10543HqvA10.element = r2;
                                hatchAvatarReferenceImageProvider.idlePosters.forget$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(r2);
                                hatchAvatarReferenceImageProvider.prepareCallIdle(avatarCallIdleVideo, true);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20qCallIdleInputs.collect(c20z, this) == enumC10460Hji) {
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
            return HatchAvatarReferenceImageProvider.this.new C130612(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {482, MC.c50_accounts_center_settings.__CONFIG__}, m = "mint", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$mint$1, reason: invalid class name and case insensitive filesystem */
    public final class C130621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C130621(HtJ<? super C130621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.mint(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$prepareCallIdle$1", f = "HatchAvatarReferenceImageProvider.kt", l = {739}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$prepareCallIdle$1, reason: invalid class name and case insensitive filesystem */
    public final class C130631 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $download;
        public final /* synthetic */ AvatarCallIdleVideo $idle;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$prepareCallIdle$1$1", f = "HatchAvatarReferenceImageProvider.kt", l = {740}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$prepareCallIdle$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02811 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ boolean $download;
            public final /* synthetic */ AvatarCallIdleVideo $idle;
            public int label;
            public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02811(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, AvatarCallIdleVideo avatarCallIdleVideo, boolean z, HtJ<? super C02811> htJ) {
                super(1, htJ);
                this.this$0 = hatchAvatarReferenceImageProvider;
                this.$idle = avatarCallIdleVideo;
                this.$download = z;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02811(this.this$0, this.$idle, this.$download, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache = this.this$0.idlePosters;
                    AvatarCallIdleVideo avatarCallIdleVideo = this.$idle;
                    boolean z = this.$download;
                    this.label = 1;
                    if (hatchAvatarIdlePosterCache.prepareCallIdle$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(avatarCallIdleVideo, z, this) == enumC10460Hji) {
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C02811) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130631(AvatarCallIdleVideo avatarCallIdleVideo, boolean z, HtJ<? super C130631> htJ) {
            super(2, htJ);
            this.$idle = avatarCallIdleVideo;
            this.$download = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130631(this.$idle, this.$download, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SingleFlight singleFlight = HatchAvatarReferenceImageProvider.this.singleFlight;
                HatchAvatarIdleKey hatchAvatarIdleKeyPosterKey = HatchAvatarIdlePosterCacheKt.posterKey(this.$idle);
                boolean z = this.$download;
                HxE hxEA0r = C3cG.A0r(hatchAvatarIdleKeyPosterKey, Boolean.valueOf(z));
                C02811 c02811 = new C02811(HatchAvatarReferenceImageProvider.this, this.$idle, z, null);
                this.label = 1;
                if (singleFlight.invoke(hxEA0r, c02811, this) == enumC10460Hji) {
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
            return ((C130631) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {1039}, m = "prewarm", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$prewarm$1, reason: invalid class name and case insensitive filesystem */
    public final class C130641 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C130641(HtJ<? super C130641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.prewarm(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$readyCallIdleOnDisk$2", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$readyCallIdleOnDisk$2, reason: invalid class name and case insensitive filesystem */
    public final class C130652 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchReadyCallIdle>, Object> {
        public int label;

        public C130652(HtJ<? super C130652> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130652(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchReadyCallIdle value = HatchAvatarReferenceImageProvider.this._readyCallIdle.getValue();
            if (value != null) {
                if (HatchAvatarReferenceImageProvider.this.idlePosters.isOnDisk$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(value.video, value.poster)) {
                    return value;
                }
                HatchAvatarReferenceImageProvider.this.idlePosters.forget$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(HatchAvatarIdlePosterCacheKt.posterKey(value.video));
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchReadyCallIdle> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130652(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {759}, m = "resolvePrewarmResult", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolvePrewarmResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C130661 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C130661(HtJ<? super C130661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.resolvePrewarmResult(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider", f = "HatchAvatarReferenceImageProvider.kt", l = {283, 294, 313, 315, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH}, m = "resolveRaw", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveRaw$1, reason: invalid class name and case insensitive filesystem */
    public final class C130671 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C130671(HtJ<? super C130671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarReferenceImageProvider.this.resolveRaw(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveReference$2", f = "HatchAvatarReferenceImageProvider.kt", l = {265}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveReference$2, reason: invalid class name and case insensitive filesystem */
    public final class C130682 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchAvatarReference>, Object> {
        public final /* synthetic */ String $accessToken;
        public final /* synthetic */ String $avatarStillPath;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130682(String str, String str2, HtJ<? super C130682> htJ) {
            super(2, htJ);
            this.$avatarStillPath = str;
            this.$accessToken = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130682(this.$avatarStillPath, this.$accessToken, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        
            if (r5.cropRefreshed != false) goto L34;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.security.NoSuchAlgorithmException, java.io.IOException {
            /*
                r10 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r2 = 1
                r9 = 0
                if (r0 == 0) goto L20
                if (r0 != r2) goto L9f
                X.Hwg.A00(r11)
            Ld:
                com.facebook.aura.common.coroutines.SingleFlightResult r11 = (com.facebook.aura.common.coroutines.SingleFlightResult) r11
                boolean r0 = r11 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
                if (r0 == 0) goto L92
                com.facebook.aura.common.coroutines.SingleFlightResult$Result r11 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r11
                T r1 = r11.value
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$isCurrentSession(r0)
                if (r0 == 0) goto La4
                return r1
            L20:
                X.Hwg.A00(r11)
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r1 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                java.lang.String r0 = r10.$avatarStillPath
                java.lang.String r8 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$sourceSha1For(r1, r0)
                if (r8 == 0) goto La4
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$CachedReference r1 = r0.cached
                if (r1 == 0) goto L4e
                java.lang.String r0 = r1.sourceSha1
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L4e
                boolean r0 = r1.isUsable()
                if (r0 == 0) goto L4e
                com.facebook.aura.partners.voice.avatar.HatchAvatarReference r1 = r1.reference
                if (r1 == 0) goto L4e
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$isCurrentSession(r0)
                if (r0 != 0) goto L79
                return r9
            L4e:
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceStore r0 = r0.store
                com.facebook.aura.partners.voice.avatar.StoredAvatarReference r5 = r0.reference(r8)
                if (r5 == 0) goto L7a
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$isCurrentSession(r0)
                if (r0 == 0) goto L7a
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r4 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                com.facebook.aura.partners.voice.avatar.HatchAvatarReference r1 = r5.reference
                boolean r0 = r5.cropRefreshed
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$cacheResolved(r4, r8, r1, r0)
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.access$isCurrentSession(r4)
                if (r0 == 0) goto L7a
                boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProviderKt.hasResolvedCrop(r1)
                if (r0 != 0) goto L79
                boolean r0 = r5.cropRefreshed
                if (r0 == 0) goto L7a
            L79:
                return r1
            L7a:
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider r5 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.this
                com.facebook.aura.common.coroutines.SingleFlight r0 = r5.singleFlight
                java.lang.String r6 = r10.$accessToken
                java.lang.String r7 = r10.$avatarStillPath
                com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveReference$2$flight$1 r4 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveReference$2$flight$1
                r4.<init>(r5, r6, r7, r8, r9)
                r10.L$0 = r9
                r10.label = r2
                java.lang.Object r11 = r0.invoke(r8, r4, r10)
                if (r11 != r3) goto Ld
                return r3
            L92:
                com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r11, r0)
                if (r0 != 0) goto La4
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L9f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            La4:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130682.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchAvatarReference> htJ) {
            return ((C130682) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveSelection$2", f = "HatchAvatarReferenceImageProvider.kt", l = {778, 781}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveSelection$2, reason: invalid class name and case insensitive filesystem */
    public final class C130692 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ResolvedAvatarSelection>, Object> {
        public final /* synthetic */ String $accessToken;
        public final /* synthetic */ String $avatarStillPath;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130692(String str, String str2, HtJ<? super C130692> htJ) {
            super(2, htJ);
            this.$avatarStillPath = str;
            this.$accessToken = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130692(this.$avatarStillPath, this.$accessToken, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = HatchAvatarReferenceImageProvider.this;
                String str = this.$avatarStillPath;
                this.label = 1;
                obj = hatchAvatarReferenceImageProvider.resolveReference(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchAvatarReference hatchAvatarReference = (HatchAvatarReference) obj;
            if (hatchAvatarReference == null || !HatchAvatarReferenceImageProvider.this.isCurrentSession()) {
                return new ResolvedAvatarSelection(null, false);
            }
            HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider2 = HatchAvatarReferenceImageProvider.this;
            String str2 = this.$accessToken;
            this.L$0 = null;
            this.label = 2;
            obj = hatchAvatarReferenceImageProvider2.fullFrameSelection(str2, hatchAvatarReference, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ResolvedAvatarSelection> htJ) {
            return ((C130692) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$retryIncompletePrewarm$1", f = "HatchAvatarReferenceImageProvider.kt", l = {549}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$retryIncompletePrewarm$1, reason: invalid class name and case insensitive filesystem */
    public final class C130701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PrewarmJob $job;
        public final /* synthetic */ String $path;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130701(String str, PrewarmJob prewarmJob, HtJ<? super C130701> htJ) {
            super(2, htJ);
            this.$path = str;
            this.$job = prewarmJob;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130701(this.$path, this.$job, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = HatchAvatarReferenceImageProvider.this;
                String str = this.$path;
                this.label = 1;
                obj = hatchAvatarReferenceImageProvider.resolvePrewarmResult(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PrewarmResult prewarmResult = (PrewarmResult) obj;
            if (prewarmResult != null && HatchAvatarReferenceImageProvider.this.isCurrentSession()) {
                PrewarmJob prewarmJob = HatchAvatarReferenceImageProvider.this.prewarmJob;
                PrewarmJob prewarmJob2 = this.$job;
                if (prewarmJob == prewarmJob2 && !prewarmJob2.getJob().isActive()) {
                    this.$job.latest = prewarmResult;
                    HatchAvatarReferenceImageProvider.this.publishAvatarMedia(this.$path, prewarmResult);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130701) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startCallIdleRestore$1", f = "HatchAvatarReferenceImageProvider.kt", l = {678}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startCallIdleRestore$1, reason: invalid class name and case insensitive filesystem */
    public final class C130711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C130711(HtJ<? super C130711> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchAvatarReferenceImageProvider.this.new C130711(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAvatarReferenceImageProvider.this.idlePosters.deleteOtherUsersCallIdleVideos$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar();
                final C10543Hqv c10543HqvA0z = C3cG.A0z();
                C20Q c20qCallIdleInputs = HatchAvatarReferenceImageProvider.this.callIdleInputs();
                final HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = HatchAvatarReferenceImageProvider.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.startCallIdleRestore.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey, java.lang.Object] */
                    public final Object emit(HxE<AvatarCallIdleVideo, ? extends Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> hxE, HtJ<? super Unit> htJ) {
                        AvatarCallIdleVideo avatarCallIdleVideoLocalCallIdle;
                        AvatarCallIdleVideo avatarCallIdleVideo = hxE.first;
                        Map map = (Map) hxE.second;
                        HatchReadyCallIdle hatchReadyCallIdle = null;
                        if (avatarCallIdleVideo != null && (avatarCallIdleVideoLocalCallIdle = hatchAvatarReferenceImageProvider.idlePosters.localCallIdle(avatarCallIdleVideo)) != null) {
                            ?? r3 = (T) HatchAvatarIdlePosterCacheKt.posterKey(avatarCallIdleVideoLocalCallIdle);
                            HatchAvatarIdlePoster hatchAvatarIdlePoster = (HatchAvatarIdlePoster) map.get(r3);
                            if (hatchAvatarIdlePoster == null || !hatchAvatarReferenceImageProvider.idlePosters.isOnDisk$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(avatarCallIdleVideoLocalCallIdle, hatchAvatarIdlePoster)) {
                                hatchAvatarIdlePoster = null;
                                hatchAvatarReferenceImageProvider.idlePosters.forget$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(r3);
                            }
                            BLG<HatchReadyCallIdle> blg = hatchAvatarReferenceImageProvider._readyCallIdle;
                            if (hatchAvatarIdlePoster != null) {
                                hatchReadyCallIdle = new HatchReadyCallIdle(avatarCallIdleVideoLocalCallIdle, hatchAvatarIdlePoster);
                            }
                            blg.Af8(hatchReadyCallIdle);
                            if (hatchAvatarIdlePoster == null && !r3.equals(c10543HqvA0z.element)) {
                                c10543HqvA0z.element = r3;
                                hatchAvatarReferenceImageProvider.prepareCallIdle(avatarCallIdleVideo, false);
                            }
                        } else {
                            hatchAvatarReferenceImageProvider._readyCallIdle.Af8(null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20qCallIdleInputs.collect(c20z, this) == enumC10460Hji) {
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
            return HatchAvatarReferenceImageProvider.this.new C130711(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startPrewarming$1", f = "HatchAvatarReferenceImageProvider.kt", l = {MC.hatch_android_subscription.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startPrewarming$1, reason: invalid class name and case insensitive filesystem */
    public final class C130721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Uri> $avatarUris;
        public int label;
        public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startPrewarming$1$1", f = "HatchAvatarReferenceImageProvider.kt", l = {1039, MC.dcp_iap_android.__CONFIG__}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$startPrewarming$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02831 extends AbstractC07127nr implements G0V<Uri, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02831(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HtJ<? super C02831> htJ) {
                super(2, htJ);
                this.this$0 = hatchAvatarReferenceImageProvider;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02831 c02831 = new C02831(this.this$0, htJ);
                c02831.L$0 = obj;
                return c02831;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider;
                InterfaceC2261BLa interfaceC2261BLa;
                Unit unit;
                String path;
                C27k<PrewarmResult> job;
                Uri uri = (Uri) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        hatchAvatarReferenceImageProvider = this.this$0;
                        interfaceC2261BLa = hatchAvatarReferenceImageProvider.prewarmMutex;
                        this.L$0 = uri;
                        this.L$1 = interfaceC2261BLa;
                        this.L$2 = hatchAvatarReferenceImageProvider;
                        this.label = 1;
                        if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                            return Unit.INSTANCE;
                        }
                        hatchAvatarReferenceImageProvider = (HatchAvatarReferenceImageProvider) this.L$2;
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$1;
                        Hwg.A00(obj);
                    }
                    PrewarmJob prewarmJob = hatchAvatarReferenceImageProvider.prewarmJob;
                    if (prewarmJob != null && (job = prewarmJob.getJob()) != null) {
                        job.A5w(null);
                    }
                    synchronized (hatchAvatarReferenceImageProvider.mediaLock) {
                        hatchAvatarReferenceImageProvider._preparedAvatar.Af8(null);
                        hatchAvatarReferenceImageProvider._prewarmedIdleVideo.Af8(null);
                        hatchAvatarReferenceImageProvider.prewarmJob = null;
                        unit = Unit.INSTANCE;
                    }
                    interfaceC2261BLa.Ahe(null);
                    if (!this.this$0.isCurrentSession()) {
                        return unit;
                    }
                    if (uri != null && ((uri.getScheme() == null || "file".equals(uri.getScheme())) && (path = uri.getPath()) != null)) {
                        HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider2 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        if (hatchAvatarReferenceImageProvider2.prewarm(path, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    interfaceC2261BLa.Ahe(null);
                    throw th;
                }
            }

            @Override // X.G0V
            public final Object invoke(Uri uri, HtJ<? super Unit> htJ) {
                return ((C02831) create(uri, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130721(C20Q<? extends Uri> c20q, HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HtJ<? super C130721> htJ) {
            super(2, htJ);
            this.$avatarUris = c20q;
            this.this$0 = hatchAvatarReferenceImageProvider;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C130721(this.$avatarUris, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(this.$avatarUris);
                C02831 c02831 = new C02831(this.this$0, null);
                this.label = 1;
                if (C3pU.A00(this, c02831, c20qA01) == enumC10460Hji) {
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
            return ((C130721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:10:0x001e, B:15:0x0029, B:11:0x0021, B:13:0x0025), top: B:21:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:10:0x001e, B:15:0x0029, B:11:0x0021, B:13:0x0025), top: B:21:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson decodeAttributes(kotlinx.serialization.json.JsonElement r4) {
        /*
            r3 = this;
            r3 = 0
            if (r4 == 0) goto L3d
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonPrimitive     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L21
            r2 = r4
            kotlinx.serialization.json.JsonPrimitive r2 = (kotlinx.serialization.json.JsonPrimitive) r2     // Catch: java.lang.Exception -> L34
            boolean r0 = r2.A01()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L21
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = r2.A00()     // Catch: java.lang.Exception -> L34
            kotlinx.serialization.json.JsonElement r4 = r1.A04(r0)     // Catch: java.lang.Exception -> L34
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonObject     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L3d
            kotlinx.serialization.json.JsonObject r4 = (kotlinx.serialization.json.JsonObject) r4     // Catch: java.lang.Exception -> L34
            goto L27
        L21:
            boolean r0 = r4 instanceof kotlinx.serialization.json.JsonObject     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L3d
            kotlinx.serialization.json.JsonObject r4 = (kotlinx.serialization.json.JsonObject) r4     // Catch: java.lang.Exception -> L34
        L27:
            if (r4 == 0) goto L3d
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L34
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson$$serializer r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L34
            java.lang.Object r0 = X.C3cI.A0T(r0, r1, r4)     // Catch: java.lang.Exception -> L34
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson r0 = (com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson) r0     // Catch: java.lang.Exception -> L34
            return r0
        L34:
            r2 = move-exception
            java.lang.String r1 = "Failed decoding avatar asset attributes"
            java.lang.String r0 = "HatchAvatarReferenceImage"
            X.CFK.A0K(r0, r2, r1)
            return r3
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.decodeAttributes(kotlinx.serialization.json.JsonElement):com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f3 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drivePrewarm(java.lang.String r15, com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.PrewarmJob r16, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.PrewarmResult> r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.drivePrewarm(java.lang.String, com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$PrewarmJob, X.HtJ):java.lang.Object");
    }

    private final String hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = HatchAvatarReferenceImageProviderKt.HEX_DIGITS;
            sb.append(cArr[(b & 255) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    private final int sampleSizeCappingLongerSide(int i, int i2, int i3) {
        int i4 = 1;
        if (i > 0 && i2 > 0) {
            while (true) {
                int i5 = i4 * 2;
                if (i / i5 < i3 && i2 / i5 < i3) {
                    break;
                }
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canRestoreReference$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(com.facebook.aura.partners.voice.avatar.HatchAvatarReference r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.lang.Object r4 = r5.mediaLock
            monitor-enter(r4)
            X.BLG<com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar> r0 = r5._preparedAvatar     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L32
            com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r3 = (com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar) r3     // Catch: java.lang.Throwable -> L32
            r2 = 1
            if (r3 == 0) goto L30
            com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = r3.selection     // Catch: java.lang.Throwable -> L32
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r0 = r0.reference     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r0.assetId     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r6.assetId     // Catch: java.lang.Throwable -> L32
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = r3.selection     // Catch: java.lang.Throwable -> L32
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r0 = r0.reference     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r0.sourceSha1     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r6.sourceSha1     // Catch: java.lang.Throwable -> L32
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r2 = 0
        L30:
            monitor-exit(r4)
            return r2
        L32:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.canRestoreReference$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(com.facebook.aura.partners.voice.avatar.HatchAvatarReference):boolean");
    }

    public final void startPrewarming(C20Q<? extends Uri> c20q) {
        C7384Etj.A0Y(c20q, 0);
        if (isCurrentSession()) {
            C3UX c3ux = this.prewarmScope;
            GAo.A02(C79.A0K, C6ys.A00, new C130721(c20q, this, null), c3ux);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<HxE<AvatarCallIdleVideo, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>>> callIdleInputs() {
        return C3rb.A03(new AnonymousClass2(null), C3rb.A04(new AnonymousClass1(null), HatchGatewayConnection.Companion.getInstance(this.userSession).getAiIdentity(), this.isCallEmbodimentDark), this.idlePosters.posters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap decodeBytesForUpload(byte[] bArr) {
        String str;
        Bitmap bitmapDecodeByteArray = null;
        if (isCurrentSession()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int length = bArr.length;
                BitmapFactory.decodeByteArray(bArr, 0, length, options);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = sampleSizeCappingLongerSide(options.outWidth, options.outHeight, 768);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length, options2);
                return bitmapDecodeByteArray;
            } catch (Exception e) {
                e = e;
                str = "Failed decoding the avatar still";
                CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str);
                return bitmapDecodeByteArray;
            } catch (OutOfMemoryError e2) {
                e = e2;
                str = "Ran out of memory decoding the avatar still";
                CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str);
                return bitmapDecodeByteArray;
            }
        }
        return bitmapDecodeByteArray;
    }

    private final Bitmap decodeForUpload(G0U<? super BitmapFactory.Options, Bitmap> g0u) {
        String str;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            g0u.invoke(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = sampleSizeCappingLongerSide(options.outWidth, options.outHeight, 768);
            return g0u.invoke(options2);
        } catch (Exception e) {
            e = e;
            str = "Failed decoding the avatar still";
            CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str);
            return null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            str = "Ran out of memory decoding the avatar still";
            CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadOriginalStill(java.lang.String r19, java.lang.String r20, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.OriginalStill> r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.downloadOriginalStill(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encodeStill(Bitmap bitmap) throws Throwable {
        Bitmap bitmapScaleToEncodeCeiling;
        byte[] byteArray = null;
        try {
            try {
                bitmapScaleToEncodeCeiling = scaleToEncodeCeiling(bitmap);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (bitmapScaleToEncodeCeiling.compress(HatchAvatarReferenceImageProviderKt.referenceCompressFormat(), 90, byteArrayOutputStream)) {
                        byteArray = byteArrayOutputStream.toByteArray();
                    } else {
                        CFK.A06(HatchAvatarReferenceImageProviderKt.TAG, "Failed compressing the avatar still to WebP");
                    }
                } catch (Exception e) {
                    e = e;
                    CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, "Failed encoding the avatar still");
                    bitmapScaleToEncodeCeiling.recycle();
                    bitmap.recycle();
                    return byteArray;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, "Ran out of memory encoding the avatar still");
                    bitmapScaleToEncodeCeiling.recycle();
                    bitmap.recycle();
                    return byteArray;
                }
            } catch (Throwable th) {
                th = th;
                bitmapScaleToEncodeCeiling.recycle();
                bitmap.recycle();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            bitmapScaleToEncodeCeiling = bitmap;
        } catch (OutOfMemoryError e4) {
            e = e4;
            bitmapScaleToEncodeCeiling = bitmap;
        } catch (Throwable th2) {
            th = th2;
            bitmapScaleToEncodeCeiling = bitmap;
            bitmapScaleToEncodeCeiling.recycle();
            bitmap.recycle();
            throw th;
        }
        bitmapScaleToEncodeCeiling.recycle();
        bitmap.recycle();
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchOriginalStill(java.lang.String r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.OriginalStill> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130581
            if (r0 == 0) goto L3b
            r3 = r9
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fetchOriginalStill$1 r3 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130581) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L65
            java.lang.Object r0 = r3.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r5)
        L23:
            java.lang.Object r3 = r6.originalStillFailureLock
            monitor-enter(r3)
            r2 = 0
            if (r5 == 0) goto L4c
            goto L41
        L2a:
            X.Hwg.A00(r5)
            r3.L$0 = r7
            r0 = 0
            r3.L$1 = r0
            r3.label = r4
            java.lang.Object r5 = r6.downloadOriginalStill(r7, r8, r3)
            if (r5 != r1) goto L23
            return r1
        L3b:
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fetchOriginalStill$1 r3 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fetchOriginalStill$1
            r3.<init>(r9)
            goto L12
        L41:
            java.lang.String r0 = r6.originalStillFailure     // Catch: java.lang.Throwable -> L62
            boolean r0 = X.C7384Etj.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L60
            r6.originalStillFailure = r2     // Catch: java.lang.Throwable -> L62
            goto L60
        L4c:
            com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore$Companion r1 = com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore.Companion     // Catch: java.lang.Throwable -> L62
            X.CGz r0 = r6.userSession     // Catch: java.lang.Throwable -> L62
            com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore r0 = r1.getInstance(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStore.currentVoiceAvatarPath$default(r0, r2, r4, r2)     // Catch: java.lang.Throwable -> L62
            boolean r0 = X.C7384Etj.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L60
            r6.originalStillFailure = r7     // Catch: java.lang.Throwable -> L62
        L60:
            monitor-exit(r3)
            return r5
        L62:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.fetchOriginalStill(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (isCurrentSession() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fullFrameSelection(java.lang.String r12, com.facebook.aura.partners.voice.avatar.HatchAvatarReference r13, X.HtJ<? super com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130591
            if (r0 == 0) goto Lb7
            r8 = r14
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fullFrameSelection$1 r8 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130591) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r7 = "hatch_reframed"
            r10 = 2
            r6 = 0
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L57
            if (r0 == r4) goto L77
            if (r0 != r10) goto Lbe
            java.lang.Object r3 = r8.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r8.L$1
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r13 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReference) r13
            X.Hwg.A00(r1)
        L2f:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r11.isCurrentSession()
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
            java.lang.String r0 = r13.assetId
            com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson r0 = r11.newestReframedVariant(r1, r0)
            if (r0 == 0) goto L51
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r1 = r11.toReference(r0)
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r0 = r11.cacheFullFrameServer(r3, r1)
            if (r0 == 0) goto L51
            boolean r0 = r11.isCurrentSession()
            if (r0 != 0) goto L8d
        L51:
            com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection r9 = new com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection
            r9.<init>(r5, r6)
            return r9
        L57:
            X.Hwg.A00(r1)
            boolean r0 = r11.isCurrentSession()
            if (r0 == 0) goto L51
            java.lang.String r1 = r13.assetId
            java.lang.String r0 = "fullframe:"
            java.lang.String r3 = X.FGI.A0M(r0, r1)
            r8.L$0 = r12
            r8.L$1 = r13
            r8.L$2 = r3
            r8.label = r4
            java.lang.Object r1 = r11.cachedFullFrameServerFor(r3, r8)
            if (r1 != r9) goto L85
            return r9
        L77:
            java.lang.Object r3 = r8.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r8.L$1
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r13 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReference) r13
            java.lang.Object r0 = r8.L$0
            java.lang.String r12 = X.C3cG.A0d(r0, r1)
        L85:
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r1 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReference) r1
            if (r1 == 0) goto L98
            java.lang.String r0 = r1.idleVideoUri
            if (r0 == 0) goto L98
        L8d:
            com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = new com.facebook.aura.partners.voice.avatar.HatchAvatarSelection
            r0.<init>(r7, r1, r4)
            com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection r9 = new com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection
            r9.<init>(r0, r4)
            return r9
        L98:
            boolean r0 = r11.isCurrentSession()
            if (r0 == 0) goto L51
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService r2 = com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.INSTANCE
            r0 = 100
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            r8.L$0 = r5
            r8.L$1 = r13
            r8.L$2 = r3
            r8.label = r10
            java.lang.String r0 = "reference_image_reframed_hatch"
            java.lang.Object r1 = r2.fetchCustomAvatars(r12, r0, r1, r8)
            if (r1 != r9) goto L2f
            return r9
        Lb7:
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fullFrameSelection$1 r8 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$fullFrameSelection$1
            r8.<init>(r14)
            goto L12
        Lbe:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.fullFrameSelection(java.lang.String, com.facebook.aura.partners.voice.avatar.HatchAvatarReference, X.HtJ):java.lang.Object");
    }

    private final String fullFrameSelectionKey(HatchAvatarReference hatchAvatarReference) {
        return FGI.A0M("fullframe:", hatchAvatarReference.assetId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentSession() {
        return AuraSessionManager.INSTANCE.isCurrentSession(this.userSession);
    }

    private final boolean isReusable(CustomAvatarAssetJson customAvatarAssetJson, String str) {
        HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJsonDecodeAttributes;
        Integer num;
        if (!HatchAvatarReferenceImageProviderKt.ASSET_KIND_REFERENCE_IMAGE.equals(customAvatarAssetJson.asset_kind) || (hatchAvatarAssetAttributesJsonDecodeAttributes = decodeAttributes(customAvatarAssetJson.attributes)) == null || AnonymousClass002.A1b(hatchAvatarAssetAttributesJsonDecodeAttributes.client_letterboxed_7_12, true) || (num = hatchAvatarAssetAttributesJsonDecodeAttributes.asset_family_version) == null || num.intValue() != 5) {
            return false;
        }
        return C7384Etj.areEqual(hatchAvatarAssetAttributesJsonDecodeAttributes.source_sha1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mint(java.lang.String r14, byte[] r15, java.lang.String r16, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReference> r17) {
        /*
            r13 = this;
            r3 = r17
            r8 = r16
            r10 = r14
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130621
            r4 = r13
            if (r0 == 0) goto La7
            r14 = r3
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$mint$1 r14 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130621) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r14.label = r2
        L18:
            java.lang.Object r11 = r14.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L41
            if (r0 == r1) goto L61
            if (r0 != r5) goto Laf
            X.Hwg.A00(r11)
        L2a:
            com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson r11 = (com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson) r11
            if (r11 == 0) goto Lae
            java.lang.String r0 = r11.asset_id
            int r0 = r0.length()
            if (r0 <= 0) goto Lae
            com.facebook.aura.partners.voice.avatar.HatchAvatarReference r3 = r4.toReference(r11)
            boolean r0 = r4.isCurrentSession()
            if (r0 == 0) goto Lae
            return r3
        L41:
            X.Hwg.A00(r11)
            boolean r0 = r13.isCurrentSession()
            if (r0 != 0) goto L4b
            return r2
        L4b:
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService r9 = com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.INSTANCE
            r14.L$0 = r10
            r14.L$1 = r2
            r14.L$2 = r8
            r14.label = r1
            java.lang.String r12 = "avatar_image.webp"
            java.lang.String r13 = "image/webp"
            r11 = r15
            java.lang.Object r11 = r9.uploadToEcto(r10, r11, r12, r13, r14)
            if (r11 != r3) goto L6b
            return r3
        L61:
            java.lang.Object r8 = r14.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r14.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r11)
        L6b:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L70
            return r2
        L70:
            boolean r0 = r4.isCurrentSession()
            if (r0 != 0) goto L77
            return r2
        L77:
            X.9sU r7 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson$$serializer r6 = com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson$$serializer.INSTANCE
            r0 = 5
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson r0 = new com.facebook.aura.partners.voice.avatar.HatchAvatarAssetAttributesJson
            r0.<init>(r8, r1, r2, r2)
            java.lang.String r13 = r7.A02(r0, r6)
            boolean r0 = r4.isCurrentSession()
            if (r0 != 0) goto L90
            return r2
        L90:
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService r9 = com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.INSTANCE
            r14.L$0 = r2
            r14.L$1 = r2
            r14.L$2 = r2
            r14.L$3 = r2
            r14.L$4 = r2
            r14.label = r5
            java.lang.String r12 = "reference_image"
            java.lang.Object r11 = r9.setCustomAvatar(r10, r11, r12, r13, r14)
            if (r11 != r3) goto L2a
            return r3
        La7:
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$mint$1 r14 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$mint$1
            r14.<init>(r3)
            goto L18
        Lae:
            return r2
        Laf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.mint(java.lang.String, byte[], java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void prefetchIdleVideo(String str) {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            HatchVideoPrefetcher.Companion.getInstance().prefetchVideoByUri(context, str, str, null, 1048576, !C3cH.A1P(VoiceCallStateHolder.Companion.getInstance(this.userSession)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareCallIdle(AvatarCallIdleVideo avatarCallIdleVideo, boolean z) {
        AnonymousClass001.A1J(new C130631(avatarCallIdleVideo, z, null), this.prewarmScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r2.getJob().isActive() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prewarm(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.prewarm(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final List<Long> prewarmOffsetsSeconds() {
        List listAsList = Arrays.asList(0L, 15L);
        C07739il c07739il = new C07739il(30L, 90L);
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(AbstractC0878AGe.A0X(new AOk(c07739il.A00, c07739il.A01, c07739il.A02 <= 0 ? -3L : 3L)), listAsList);
        C07739il c07739il2 = new C07739il(105L, 240L);
        return AbstractC0878AGe.A0P(AbstractC0878AGe.A0X(new AOk(c07739il2.A00, c07739il2.A01, c07739il2.A02 <= 0 ? -15L : 15L)), arrayListA0P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolvePrewarmResult(java.lang.String r7, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.PrewarmResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130661
            if (r0 == 0) goto L1f
            r5 = r8
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolvePrewarmResult$1 r5 = (com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.C130661) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L25
            goto L3f
        L1f:
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolvePrewarmResult$1 r5 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolvePrewarmResult$1
            r5.<init>(r8)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r4)
            boolean r0 = r6.isCurrentSession()
            if (r0 != 0) goto L34
            return r3
        L34:
            r5.L$0 = r3     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            r5.label = r1     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            java.lang.Object r4 = r6.resolveSelection(r7, r5)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            if (r4 != r2) goto L42
            return r2
        L3f:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
        L42:
            com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection r4 = (com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection) r4     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$PrewarmResult r2 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$PrewarmResult     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            r2.<init>(r4)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5e
            return r2
        L4a:
            r2 = move-exception
            java.lang.String r1 = "Embodiment prewarm attempt failed"
            java.lang.String r0 = "HatchAvatarReferenceImage"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection r1 = new com.facebook.aura.partners.voice.avatar.ResolvedAvatarSelection
            r1.<init>(r3, r0)
            com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$PrewarmResult r0 = new com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$PrewarmResult
            r0.<init>(r1)
            return r0
        L5e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.resolvePrewarmResult(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ed  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$OriginalStill] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$OriginalStill] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$OriginalStill, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$OriginalStill, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider] */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarReference] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.HtJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveRaw(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.HtJ<? super com.facebook.aura.partners.voice.avatar.HatchAvatarReference> r24) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.resolveRaw(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean stillIsOriginal(String str) {
        VoiceAvatarStillSource voiceAvatarStillSourceStillSourceFor = HatchVoiceAvatarStore.Companion.getInstance(this.userSession).stillSourceFor(str);
        return voiceAvatarStillSourceStillSourceFor != null && C7384Etj.areEqual(HatchFileOperations.INSTANCE.buildFSRawFileUrl(voiceAvatarStillSourceStillSourceFor.avatarPath, this.userSession), voiceAvatarStillSourceStillSourceFor.url);
    }

    private final HatchAvatarReference toReference(CustomAvatarAssetJson customAvatarAssetJson) {
        String str;
        Float f;
        Float f2;
        Float f3;
        String str2 = customAvatarAssetJson.asset_id;
        String str3 = customAvatarAssetJson.uri;
        String str4 = null;
        if (str3.length() > 0) {
            str4 = str3;
        }
        GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson = customAvatarAssetJson.generated_hatch_idle_animation;
        if (generatedHatchIdleAnimationJson == null || (str = generatedHatchIdleAnimationJson.uri) == null || str.length() <= 0) {
            str = null;
        }
        DisplayCropJson displayCropJson = customAvatarAssetJson.display_crop;
        if (displayCropJson != null) {
            f = displayCropJson.x;
            f2 = displayCropJson.y;
            f3 = displayCropJson.size;
        } else {
            f = null;
            f2 = null;
            f3 = null;
        }
        HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJsonDecodeAttributes = decodeAttributes(customAvatarAssetJson.attributes);
        return new HatchAvatarReference(str2, f, f2, f3, hatchAvatarAssetAttributesJsonDecodeAttributes != null ? hatchAvatarAssetAttributesJsonDecodeAttributes.source_sha1 : null, str4, str, !AnonymousClass002.A1b(customAvatarAssetJson.is_avatar_embodiment_compatible, false));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._readyCallIdle.Af8(null);
        this._preparedAvatar.Af8(null);
        this._prewarmedIdleVideo.Af8(null);
        Hxb.A03(null, this.prewarmScope);
        this.idlePosters.clear$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar();
    }

    public final boolean currentCallEmbodimentDark() {
        AvatarMedia avatarMedia;
        Boolean value = this.admittedCallIdleDark.getValue();
        AiIdentity aiIdentityA0R = C3cH.A0R(HatchGatewayConnection.Companion.getInstance(this.userSession));
        boolean z = false;
        if (aiIdentityA0R != null && (avatarMedia = aiIdentityA0R.avatarMedia) != null && DarkCallMediaKt.getSupportsDarkCall(avatarMedia)) {
            z = true;
        }
        return HatchAvatarReferenceImageProviderKt.callEmbodimentDark(value, z, HatchAvatarAppearance.INSTANCE.isDark());
    }

    public final HatchAvatarIdlePosterCache getIdlePosters() {
        return this.idlePosters;
    }

    public final C1BN<PreparedHatchAvatar> getPreparedAvatar() {
        return this.preparedAvatar;
    }

    public final C1BN<PrewarmedHatchIdleVideo> getPrewarmedIdleVideo() {
        return this.prewarmedIdleVideo;
    }

    public final C1BN<HatchReadyCallIdle> getReadyCallIdle() {
        return this.readyCallIdle;
    }

    public final C1BN<Boolean> isCallEmbodimentDark() {
        return this.isCallEmbodimentDark;
    }

    public final boolean originalStillFailed$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(String str) {
        return str != null && str.equals(this.originalStillFailure);
    }

    public final void pinCallIdleAppearance(Boolean bool) {
        this.admittedCallIdleDark.Af8(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar preparedAvatarFor(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.mediaLock
            monitor-enter(r3)
            X.BLG<com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar> r0 = r4._preparedAvatar     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L28
            com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar r2 = (com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar) r2     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r2 == 0) goto L25
            boolean r0 = r4.isCurrentSession()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L25
            java.lang.String r0 = r2.avatarStillPath     // Catch: java.lang.Throwable -> L28
            boolean r0 = X.C7384Etj.areEqual(r0, r5)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L25
            com.facebook.aura.partners.voice.avatar.HatchAvatarSelection r0 = r2.selection     // Catch: java.lang.Throwable -> L28
            boolean r0 = com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProviderKt.isFullBodyReference(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L25
            goto L26
        L25:
            r2 = r1
        L26:
            monitor-exit(r3)
            return r2
        L28:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider.preparedAvatarFor(java.lang.String):com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar");
    }

    public final class Companion {
        public final HatchAvatarReferenceImageProvider getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAvatarReferenceImageProvider) abstractC3358CGz.A03(HatchAvatarReferenceImageProvider.class, new HatchAvatarReferenceImageProvider$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAvatarReferenceImageProvider(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.singleFlight = C3cH.A0M();
        this.prewarmMutex = new C9258GBl();
        HzC hzCA0w = C3cH.A0w();
        this.prewarmScope = hzCA0w;
        this.idlePosters = new HatchAvatarIdlePosterCache(abstractC3358CGz);
        this.prewarmRequests = new AtomicLong(0L);
        this.callIdleRestoreStarted = new AtomicBoolean(false);
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._readyCallIdle = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this.admittedCallIdleDark = c9286GCnA142;
        this.readyCallIdle = C3cG.A11(c9286GCnA14);
        this.isCallEmbodimentDark = AnonymousClass441.A00(false, hzCA0w, C3rb.A00(new AnonymousClass3(null), c9286GCnA142, GDB.A01(new HatchAvatarReferenceImageProvider$special$$inlined$map$1(new C05663ul(new C130601(null)))), HatchAvatarAppearance.INSTANCE.isDarkFlow()), C3Ek.A00);
        C9286GCn c9286GCnA143 = C3cG.A14(hrH);
        this._prewarmedIdleVideo = c9286GCnA143;
        this.prewarmedIdleVideo = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(hrH);
        this._preparedAvatar = c9286GCnA144;
        this.preparedAvatar = C3cG.A11(c9286GCnA144);
        this.store = new HatchAvatarReferenceStore(abstractC3358CGz);
        this.originalStillFailureLock = C3cG.A0T();
        this.mediaLock = C3cG.A0T();
    }

    private final HatchAvatarReference cacheFullFrameServer(String str, HatchAvatarReference hatchAvatarReference) {
        if (isCurrentSession()) {
            this.cachedFullFrameServer = new CachedVariant(str, hatchAvatarReference);
            if (isCurrentSession()) {
                this.store.storeSelection(str, hatchAvatarReference);
            }
            if (isCurrentSession()) {
                return hatchAvatarReference;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheResolved(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        if (isCurrentSession()) {
            this.cached = new CachedReference(str, hatchAvatarReference, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cachedFullFrameServerFor(String str, HtJ<? super HatchAvatarReference> htJ) {
        HatchAvatarReference hatchAvatarReference;
        String str2;
        if (!isCurrentSession()) {
            return null;
        }
        CachedVariant cachedVariant = this.cachedFullFrameServer;
        return (cachedVariant == null || !C7384Etj.areEqual(cachedVariant.key, str) || (hatchAvatarReference = cachedVariant.reference) == null || (str2 = hatchAvatarReference.imageUri) == null || str2.length() == 0) ? GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass5(str, null)) : hatchAvatarReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap decodeStillForUpload(String str) {
        String str2;
        Bitmap bitmapDecodeFile = null;
        if (isCurrentSession()) {
            if (new File(str).isFile()) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = sampleSizeCappingLongerSide(options.outWidth, options.outHeight, 768);
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
                    return bitmapDecodeFile;
                } catch (Exception e) {
                    e = e;
                    str2 = "Failed decoding the avatar still";
                    CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str2);
                    return bitmapDecodeFile;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    str2 = "Ran out of memory decoding the avatar still";
                    CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, str2);
                    return bitmapDecodeFile;
                }
            }
            CFK.A06(HatchAvatarReferenceImageProviderKt.TAG, "Avatar still is missing");
        }
        return null;
    }

    private final CustomAvatarAssetJson firstReusable(List<CustomAvatarAssetJson> list, String str) {
        CustomAvatarAssetJson next;
        Iterator<CustomAvatarAssetJson> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomAvatarAssetJson customAvatarAssetJson = next;
            if (customAvatarAssetJson.asset_id.length() > 0 && isReusable(customAvatarAssetJson, str)) {
                break;
            }
        }
        return next;
    }

    private final boolean isCurrentAvatar(String str) {
        return isCurrentSession() && C7384Etj.areEqual(HatchVoiceAvatarStore.currentVoiceAvatarPath$default(HatchVoiceAvatarStore.Companion.getInstance(this.userSession), null, 1, null), str);
    }

    private final CustomAvatarAssetJson newestReframedVariant(List<CustomAvatarAssetJson> list, String str) {
        Object obj;
        Iterator<CustomAvatarAssetJson> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CustomAvatarAssetJson next = it.next();
            CustomAvatarAssetJson customAvatarAssetJson = next;
            if (customAvatarAssetJson.asset_id.length() > 0 && HatchAvatarReferenceImageProviderKt.ASSET_KIND_REFRAMED_HATCH.equals(customAvatarAssetJson.asset_kind) && customAvatarAssetJson.uri.length() > 0) {
                HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJsonDecodeAttributes = decodeAttributes(customAvatarAssetJson.attributes);
                if (C7384Etj.areEqual(hatchAvatarAssetAttributesJsonDecodeAttributes != null ? hatchAvatarAssetAttributesJsonDecodeAttributes.source_asset_id : null, str)) {
                    obj = next;
                    break;
                }
            }
        }
        return (CustomAvatarAssetJson) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persistResolved(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        if (isCurrentSession()) {
            cacheResolved(str, hatchAvatarReference, z);
            if (isCurrentSession()) {
                this.store.storeReference(str, hatchAvatarReference, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AvatarMediaPublishResult publishAvatarMedia(String str, PrewarmResult prewarmResult) {
        HatchAvatarSelection hatchAvatarSelection;
        PrewarmJob prewarmJob;
        PrewarmedHatchIdleVideo value;
        PrewarmedHatchIdleVideo prewarmedHatchIdleVideo;
        AvatarMediaPublishResult avatarMediaPublishResult;
        if (!isCurrentSession() || !HatchAvatarReferenceImageProviderKt.hasUsableSelectionForCall(prewarmResult.selection) || (hatchAvatarSelection = prewarmResult.selection.selection) == null) {
            return AvatarMediaPublishResult.REJECTED;
        }
        Boolean boolA0i = stillIsOriginal(str) ? AnonymousClass001.A0i() : HatchAvatarReferenceImageProviderKt.madeFromOriginal(hatchAvatarSelection.reference.sourceSha1, sourceSha1For(str));
        synchronized (this.mediaLock) {
            if (!isCurrentAvatar(str) || (prewarmJob = this.prewarmJob) == null || prewarmJob.latest != prewarmResult) {
                return AvatarMediaPublishResult.REJECTED;
            }
            AnonymousClass001.A1E(this._preparedAvatar, null, new PreparedHatchAvatar(str, hatchAvatarSelection, boolA0i));
            HatchAvatarReference hatchAvatarReference = hatchAvatarSelection.reference;
            String str2 = hatchAvatarReference.idleVideoUri;
            if (str2 == null) {
                avatarMediaPublishResult = AvatarMediaPublishResult.PREPARED;
                str2 = null;
            } else {
                PrewarmedHatchIdleVideo prewarmedHatchIdleVideo2 = new PrewarmedHatchIdleVideo(str, hatchAvatarReference.assetId, str2);
                BLG<PrewarmedHatchIdleVideo> blg = this._prewarmedIdleVideo;
                do {
                    value = blg.getValue();
                    prewarmedHatchIdleVideo = value;
                } while (!blg.A6e(value, prewarmedHatchIdleVideo2));
                if (str2.equals(prewarmedHatchIdleVideo != null ? prewarmedHatchIdleVideo.uri : null)) {
                    str2 = null;
                }
                avatarMediaPublishResult = AvatarMediaPublishResult.IDLE_VIDEO;
            }
            if (str2 != null) {
                prefetchIdleVideo(str2);
            }
            String str3 = hatchAvatarSelection.reference.idleVideoUri;
            if (str3 == null) {
                return avatarMediaPublishResult;
            }
            AnonymousClass001.A1J(new HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1(this, hatchAvatarSelection, str3, null), this.prewarmScope);
            return avatarMediaPublishResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resolveSelection(String str, HtJ<? super ResolvedAvatarSelection> htJ) {
        if (isCurrentSession()) {
            String str2 = CH0.A01((CH0) this.userSession).A04;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() != 0) {
                return GAo.A00(htJ, AnonymousClass001.A0y(), new C130692(str, str2, null));
            }
        }
        return new ResolvedAvatarSelection(null, false);
    }

    private final Bitmap scaleToEncodeCeiling(Bitmap bitmap) {
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (iMax <= 768) {
            return bitmap;
        }
        float f = 768.0f / iMax;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, Ab3.A01(bitmap.getWidth() * f)), Math.max(1, Ab3.A01(bitmap.getHeight() * f)), true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    private final String sha1HexOfFile(String str) throws NoSuchAlgorithmException, IOException {
        if (isCurrentSession()) {
            try {
                File file = new File(str);
                if (file.isFile()) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                fileInputStream.close();
                                byte[] bArrDigest = messageDigest.digest();
                                C7384Etj.A0U(bArrDigest);
                                return hex(bArrDigest);
                            }
                            messageDigest.update(bArr, 0, i);
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                CFK.A0K(HatchAvatarReferenceImageProviderKt.TAG, e, "Failed hashing the avatar still");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sourceSha1For(String str) throws NoSuchAlgorithmException, IOException {
        if (isCurrentSession()) {
            File file = new File(str);
            if (file.isFile()) {
                HashedStill hashedStill = new HashedStill(str, file.lastModified(), file.length());
                HxE<HashedStill, String> hxE = this.hashedStill;
                if (hxE != null) {
                    HashedStill hashedStill2 = hxE.first;
                    String str2 = hxE.second;
                    if (C7384Etj.areEqual(hashedStill2, hashedStill)) {
                        return str2;
                    }
                }
                String strSha1HexOfFile = sha1HexOfFile(str);
                if (strSha1HexOfFile != null) {
                    this.hashedStill = C3cG.A0r(hashedStill, strSha1HexOfFile);
                    return strSha1HexOfFile;
                }
            } else {
                CFK.A06(HatchAvatarReferenceImageProviderKt.TAG, "Avatar still is missing");
            }
        }
        return null;
    }

    public final Object loadCallIdleForCall(HtJ<? super Unit> htJ) {
        Object objA00;
        return (isCurrentSession() && (objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C130612(null))) == EnumC10460Hji.A02) ? objA00 : Unit.INSTANCE;
    }

    public final Object readyCallIdleOnDisk(HtJ<? super HatchReadyCallIdle> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C130652(null));
    }

    public final Object resolveReference(String str, HtJ<? super HatchAvatarReference> htJ) {
        if (isCurrentSession()) {
            String str2 = CH0.A01((CH0) this.userSession).A04;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() != 0 && str != null && str.length() != 0) {
                return GAo.A00(htJ, AnonymousClass001.A0y(), new C130682(str, str2, null));
            }
        }
        return null;
    }

    public final void retryIncompletePrewarm() {
        String strCurrentVoiceAvatarPath$default;
        PrewarmJob prewarmJob;
        HatchAvatarSelection hatchAvatarSelection;
        HatchAvatarReference hatchAvatarReference;
        if (!isCurrentSession() || !AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason()) || (strCurrentVoiceAvatarPath$default = HatchVoiceAvatarStore.currentVoiceAvatarPath$default(HatchVoiceAvatarStore.Companion.getInstance(this.userSession), null, 1, null)) == null || (prewarmJob = this.prewarmJob) == null || !strCurrentVoiceAvatarPath$default.equals(prewarmJob.path) || prewarmJob.getJob().isActive()) {
            return;
        }
        PreparedHatchAvatar value = this._preparedAvatar.getValue();
        if (value == null || !strCurrentVoiceAvatarPath$default.equals(value.avatarStillPath) || (hatchAvatarSelection = value.selection) == null || (hatchAvatarReference = hatchAvatarSelection.reference) == null || hatchAvatarReference.idleVideoUri == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - prewarmJob.lastRetryAtMs >= 300000) {
                prewarmJob.lastRetryAtMs = jElapsedRealtime;
                AnonymousClass001.A1J(new C130701(strCurrentVoiceAvatarPath$default, prewarmJob, null), this.prewarmScope);
            }
        }
    }

    public final void startCallIdleRestore() {
        if (isCurrentSession() && C3cI.A1W(this.callIdleRestoreStarted)) {
            AnonymousClass001.A1J(new C130711(null), this.prewarmScope);
        }
    }

    public /* synthetic */ HatchAvatarReferenceImageProvider(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
