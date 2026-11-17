package com.facebook.aura.partners.voice.avatar;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9258GBl;
import X.C9286GCn;
import X.CEV;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.HzS;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.file.core.HatchLocalFileStore;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.model.AvatarCallIdleVideo;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAvatarIdlePosterCache {
    public final BLG<Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> _posters;
    public final Set<HatchAvatarIdleKey> authRejected;
    public volatile boolean closed;
    public final Map<HatchAvatarIdleKey, Long> failedAt;
    public final InterfaceC2261BLa mutex;
    public final C1BN<Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> posters;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache", f = "HatchAvatarIdlePosterCache.kt", l = {343}, m = "copyBoundedTo", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarIdlePosterCache.this.copyBoundedTo(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$2", f = "HatchAvatarIdlePosterCache.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ InputStream $limited;
        public final /* synthetic */ File $target;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file, InputStream inputStream, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$target = file;
            this.$limited = inputStream;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$target, this.$limited, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            FileOutputStream fileOutputStream = new FileOutputStream(this.$target);
            InputStream inputStream = this.$limited;
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    HzS.A05(c3ux.AEA());
                    int i = inputStream.read(bArr);
                    if (i < 0) {
                        fileOutputStream.close();
                        return Unit.INSTANCE;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache", f = "HatchAvatarIdlePosterCache.kt", l = {296, 300}, m = HatchDataExportLoggingKt.PHASE_DOWNLOAD, v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$download$1, reason: invalid class name and case insensitive filesystem */
    public final class C130531 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C130531(HtJ<? super C130531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarIdlePosterCache.this.download(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache", f = "HatchAvatarIdlePosterCache.kt", l = {255}, m = "downloadCallIdle", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$downloadCallIdle$1, reason: invalid class name and case insensitive filesystem */
    public final class C130541 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C130541(HtJ<? super C130541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarIdlePosterCache.this.downloadCallIdle(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$publish$2, reason: invalid class name and case insensitive filesystem */
    public final class C130552 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C130552 INSTANCE = new C130552();

        public C130552() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$publish$3", f = "HatchAvatarIdlePosterCache.kt", l = {366, 188}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$publish$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $download;
        public final /* synthetic */ boolean $isCallIdle;
        public final /* synthetic */ HatchAvatarIdleKey $key;
        public final /* synthetic */ Function0<Unit> $onPublished;
        public final /* synthetic */ String $posterName;
        public final /* synthetic */ G0V<File, HtJ<? super HatchAvatarIdlePoster>, Object> $resolve;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public boolean Z$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchAvatarIdleKey hatchAvatarIdleKey, boolean z, String str, G0V<? super File, ? super HtJ<? super HatchAvatarIdlePoster>, ? extends Object> g0v, boolean z2, Function0<Unit> function0, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$key = hatchAvatarIdleKey;
            this.$download = z;
            this.$posterName = str;
            this.$resolve = g0v;
            this.$isCallIdle = z2;
            this.$onPublished = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = HatchAvatarIdlePosterCache.this.new AnonymousClass3(this.$key, this.$download, this.$posterName, this.$resolve, this.$isCallIdle, this.$onPublished, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[Catch: all -> 0x0222, TRY_ENTER, TryCatch #3 {all -> 0x0222, blocks: (B:18:0x008a, B:20:0x0094, B:26:0x00ac, B:28:0x00b4, B:29:0x00c6), top: B:114:0x008a }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f8 A[Catch: Exception -> 0x01ea, CancellationException -> 0x01ec, all -> 0x021e, TryCatch #6 {CancellationException -> 0x01ec, blocks: (B:7:0x002b, B:32:0x00e3, B:35:0x00e9, B:36:0x00f8, B:38:0x00ff, B:40:0x0109, B:44:0x0118, B:46:0x011e, B:47:0x0130, B:48:0x0132, B:49:0x0141, B:51:0x0147, B:53:0x0153, B:54:0x0155, B:56:0x015b, B:57:0x015f, B:60:0x0178, B:61:0x0181, B:63:0x0187, B:64:0x018b, B:66:0x0195, B:68:0x01a5, B:72:0x01b0, B:73:0x01c1, B:75:0x01cc, B:77:0x01d4, B:78:0x01d8, B:80:0x01de), top: B:112:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01f3 A[Catch: all -> 0x021e, TryCatch #9 {all -> 0x021e, blocks: (B:32:0x00e3, B:35:0x00e9, B:100:0x0218, B:36:0x00f8, B:38:0x00ff, B:40:0x0109, B:44:0x0118, B:46:0x011e, B:47:0x0130, B:48:0x0132, B:49:0x0141, B:51:0x0147, B:53:0x0153, B:54:0x0155, B:88:0x01ef, B:90:0x01f3, B:98:0x0204, B:99:0x0211, B:56:0x015b, B:57:0x015f, B:60:0x0178, B:61:0x0181, B:63:0x0187, B:64:0x018b, B:66:0x0195, B:68:0x01a5, B:72:0x01b0, B:73:0x01c1, B:75:0x01cc, B:77:0x01d4, B:78:0x01d8, B:80:0x01de, B:97:0x0203), top: B:120:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 551
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchAvatarIdlePosterCache(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.mutex = new C9258GBl();
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this._posters = c9286GCnA01;
        this.posters = C3Pi.A00(c9286GCnA01);
        this.failedAt = C3cG.A0j();
        this.authRejected = C3cG.A0k();
    }

    public final void clear$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar() {
        this.closed = true;
        this._posters.Af8(AGH.A0E());
    }

    public final void forget$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(HatchAvatarIdleKey hatchAvatarIdleKey) {
        Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> value;
        C7384Etj.A0Y(hatchAvatarIdleKey, 0);
        BLG<Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> blg = this._posters;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AGH.A09(hatchAvatarIdleKey, value)));
    }

    public final boolean isOnDisk$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(AvatarCallIdleVideo avatarCallIdleVideo, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
        boolean zA1a = AnonymousClass002.A1a(avatarCallIdleVideo, hatchAvatarIdlePoster);
        List listAsList = Arrays.asList(avatarCallIdleVideo.url, hatchAvatarIdlePoster.imageUri);
        if (!(listAsList instanceof Collection) || !listAsList.isEmpty()) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String path = Uri.parse(AnonymousClass005.A0j(it)).getPath();
                if (path == null || new File(path).isFile() != zA1a) {
                    return false;
                }
            }
        }
        return zA1a;
    }

    public final AvatarCallIdleVideo localCallIdle(AvatarCallIdleVideo avatarCallIdleVideo) {
        C7384Etj.A0Y(avatarCallIdleVideo, 0);
        File fileCallIdleVideoFile = callIdleVideoFile(avatarCallIdleVideo);
        if (fileCallIdleVideoFile == null) {
            return null;
        }
        String string = Uri.fromFile(fileCallIdleVideoFile).toString();
        C7384Etj.A0U(string);
        String str = avatarCallIdleVideo.path;
        Float f = avatarCallIdleVideo.cropX;
        Float f2 = avatarCallIdleVideo.cropY;
        Float f3 = avatarCallIdleVideo.cropSize;
        boolean z = avatarCallIdleVideo.dark;
        AnonymousClass003.A0u(str, string);
        return new AvatarCallIdleVideo(str, string, f, f2, f3, z);
    }

    public final Object prepareCallIdle$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(AvatarCallIdleVideo avatarCallIdleVideo, boolean z, HtJ<? super Unit> htJ) {
        File fileCallIdleVideoFile = callIdleVideoFile(avatarCallIdleVideo);
        if (fileCallIdleVideoFile != null) {
            String str = avatarCallIdleVideo.path;
            String string = Uri.fromFile(fileCallIdleVideoFile).toString();
            C7384Etj.A0U(string);
            Object objPublish = publish(new HatchAvatarIdleKey(str, string), HatchAvatarIdlePosterCacheKt.sha256(FGI.A0d("call_idle\n", ((CH0) this.userSession).A01, PairsDiscretionDocument.TERMINATOR, avatarCallIdleVideo.path)), z, true, new HatchAvatarIdlePosterCache$prepareCallIdle$2(this, fileCallIdleVideoFile), new HatchAvatarIdlePosterCache$prepareCallIdle$3(fileCallIdleVideoFile, z, this, avatarCallIdleVideo, null), htJ);
            if (objPublish == EnumC10460Hji.A02) {
                return objPublish;
            }
        }
        return Unit.INSTANCE;
    }

    private final HatchAuthScheme authSchemeFor(String str) {
        return HatchFileOperations.INSTANCE.isOwnGatewayFsUrl(str, this.userSession) ? HatchAuthScheme.VM_JWT : HatchAuthScheme.META_UNAUTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File callIdleVideoDir() {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            return C3cG.A0O(context.getCacheDir(), FGI.A0M("hatch_call_idle_videos/", HatchAvatarIdlePosterCacheKt.sha256(((CH0) this.userSession).A01)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyBoundedTo(com.facebook.aura.network.transport.HatchHttpResponseStream r9, java.io.File r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.AnonymousClass1
            if (r0 == 0) goto L1f
            r5 = r11
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$1 r5 = (com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L2e
            if (r0 != r7) goto L29
            goto L25
        L1f:
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$1 r5 = new com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$1
            r5.<init>(r11)
            goto L12
        L25:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            goto L61
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r1)
            java.io.InputStream r4 = r9.body
            if (r4 == 0) goto L6a
            long r2 = com.facebook.aura.network.transport.HatchHttpClientKt.identityContentLength(r9)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            java.io.InputStream r3 = com.facebook.aura.network.api.HttpResponseBytesKt.withByteLimit(r4, r0, r2)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            com.facebook.aura.executors.AuraExecutors r0 = com.facebook.aura.executors.AuraExecutors.INSTANCE     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            java.util.concurrent.Executor r0 = r0.createResponseStreamingSerialExecutor()     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            X.GBK r2 = X.Hu0.A01(r0)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r1 = 0
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$2 r0 = new com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$copyBoundedTo$2     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r0.<init>(r10, r3, r1)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r5.L$0 = r1     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r5.L$1 = r1     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r5.L$2 = r1     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r5.L$3 = r1     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            r5.label = r7     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)     // Catch: com.facebook.aura.network.api.ByteLimitExceededException -> L63
            if (r0 != r6) goto L61
            return r6
        L61:
            r8 = 1
            goto L6a
        L63:
            java.lang.String r1 = "HatchAvatarIdlePoster"
            java.lang.String r0 = "Idle video exceeds automatic download limit"
            X.CFK.A06(r1, r0)
        L6a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.copyBoundedTo(com.facebook.aura.network.transport.HatchHttpResponseStream, java.io.File, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r9 == r4) goto L17;
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00d9: INVOKE (r8 I:java.io.Closeable), (r1 I:java.lang.Throwable) STATIC call: X.Ezs.A00(java.io.Closeable, java.lang.Throwable):void A[MD:(java.io.Closeable, java.lang.Throwable):void (m)] (LINE:217), block:B:45:0x00d9 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object download(java.lang.String r20, java.io.File r21, X.HtJ<? super java.lang.Boolean> r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.download(java.lang.String, java.io.File, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadCallIdle(java.lang.String r7, java.io.File r8, X.HtJ<? super java.lang.Boolean> r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.C130541
            if (r0 == 0) goto L26
            r5 = r9
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$downloadCallIdle$1 r5 = (com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.C130541) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L2c
            java.lang.Object r2 = r5.L$3
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r8 = r5.L$1
            java.io.File r8 = (java.io.File) r8
            goto L66
        L26:
            com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$downloadCallIdle$1 r5 = new com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$downloadCallIdle$1
            r5.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r1)
            java.io.File r2 = r8.getParentFile()
            if (r2 == 0) goto L9c
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L47
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L47
            r2 = 0
        L47:
            if (r2 == 0) goto L9c
            java.lang.String r1 = "idle"
            java.lang.String r0 = ".part"
            java.io.File r2 = java.io.File.createTempFile(r1, r0, r2)
            X.C7384Etj.A0X(r2)     // Catch: java.lang.Throwable -> L8d
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L8d
            r5.L$1 = r8     // Catch: java.lang.Throwable -> L8d
            r5.L$2 = r0     // Catch: java.lang.Throwable -> L8d
            r5.L$3 = r2     // Catch: java.lang.Throwable -> L8d
            r5.label = r3     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r6.download(r7, r2, r5)     // Catch: java.lang.Throwable -> L8d
            if (r1 != r4) goto L69
            return r4
        L66:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L8d
        L69:
            boolean r0 = X.AnonymousClass001.A1X(r1)     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L85
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L85
            boolean r0 = r2.renameTo(r8)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L92
            java.lang.String r1 = "HatchAvatarIdlePoster"
            java.lang.String r0 = "Could not move the downloaded call idle clip into place"
            X.CFK.A06(r1, r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()     // Catch: java.lang.Throwable -> L8d
            goto L89
        L85:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()     // Catch: java.lang.Throwable -> L8d
        L89:
            r2.delete()
            return r0
        L8d:
            r0 = move-exception
            r2.delete()
            throw r0
        L92:
            r2.delete()
            boolean r0 = r6.closed
            if (r0 == 0) goto L9d
            r8.delete()
        L9c:
            r3 = 0
        L9d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache.downloadCallIdle(java.lang.String, java.io.File, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCoolingDown(HatchAvatarIdleKey hatchAvatarIdleKey) {
        Long l = this.failedAt.get(hatchAvatarIdleKey);
        return l != null && C3cG.A04(l.longValue()) < 60000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object publish$default(HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache, HatchAvatarIdleKey hatchAvatarIdleKey, String str, boolean z, boolean z2, Function0 function0, G0V g0v, HtJ htJ, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 8, z2);
        if ((i & 16) != 0) {
            function0 = C130552.INSTANCE;
        }
        return hatchAvatarIdlePosterCache.publish(hatchAvatarIdleKey, str, z, zA1K, function0, g0v, htJ);
    }

    public final C1BN<Map<HatchAvatarIdleKey, HatchAvatarIdlePoster>> getPosters() {
        return this.posters;
    }

    public final Object prepare$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(String str, String str2, HtJ<? super Unit> htJ) {
        Object objPublish = publish(new HatchAvatarIdleKey(str, str2), HatchAvatarIdlePosterCacheKt.sha256(FGI.A0U(str, PairsDiscretionDocument.TERMINATOR, str2)), true, false, C130552.INSTANCE, new HatchAvatarIdlePosterCache$prepare$2(this, str2, null), htJ);
        return objPublish != EnumC10460Hji.A02 ? Unit.INSTANCE : objPublish;
    }

    private final File callIdleVideoFile(AvatarCallIdleVideo avatarCallIdleVideo) {
        File fileCallIdleVideoDir = callIdleVideoDir();
        if (fileCallIdleVideoDir != null) {
            return C3cG.A0O(fileCallIdleVideoDir, FGI.A0M(HatchAvatarIdlePosterCacheKt.sha256(avatarCallIdleVideo.path), AuraBugReportSender.DEFAULT_VIDEO_EXTENSION));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object extractPoster(File file, File file2, HtJ<? super HatchAvatarIdlePoster> htJ) throws IOException {
        HzS.A05(htJ.getContext());
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getPath());
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
            mediaMetadataRetriever.release();
            if (frameAtTime == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (!frameAtTime.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    HzS.A05(htJ.getContext());
                    HatchLocalFileStore hatchLocalFileStore = HatchLocalFileStore.INSTANCE;
                    C7384Etj.A0X(byteArray);
                    hatchLocalFileStore.writeBytes(file2, byteArray);
                    String string = Uri.fromFile(file2).toString();
                    C7384Etj.A0U(string);
                    return new HatchAvatarIdlePoster(string, frameAtTime.getWidth(), frameAtTime.getHeight());
                } finally {
                }
            } finally {
                frameAtTime.recycle();
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pruneCallIdleVideos(File file) {
        File[] fileArrListFiles;
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null || (fileArrListFiles = parentFile.listFiles()) == null) {
                return;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (File file2 : fileArrListFiles) {
                C7384Etj.A0X(file2);
                C3cI.A1J(CEV.A01(file2), file2, "part", arrayListA0h);
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (File file3 : fileArrListFiles) {
                C7384Etj.A0X(file3);
                if ("mp4".equals(CEV.A01(file3)) && !file3.equals(file)) {
                    arrayListA0h2.add(file3);
                }
            }
            Iterator it2 = AbstractC0878AGe.A0Z(AbstractC0878AGe.A0c(arrayListA0h2, new Comparator() { // from class: com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePosterCache$pruneCallIdleVideos$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C3cJ.A04(t2, t);
                }
            }), 2).iterator();
            while (it2.hasNext()) {
                ((File) it2.next()).delete();
            }
        } catch (Exception e) {
            CFK.A0K(HatchAvatarIdlePosterCacheKt.TAG, e, "Could not prune call idle clips");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object publish(HatchAvatarIdleKey hatchAvatarIdleKey, String str, boolean z, boolean z2, Function0<Unit> function0, G0V<? super File, ? super HtJ<? super HatchAvatarIdlePoster>, ? extends Object> g0v, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass3(hatchAvatarIdleKey, z, str, g0v, z2, function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchAvatarIdlePoster readPoster(File file) {
        if (!file.isFile()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        String string = Uri.fromFile(file).toString();
        C7384Etj.A0U(string);
        return new HatchAvatarIdlePoster(string, options.outWidth, options.outHeight);
    }

    public final void deleteOtherUsersCallIdleVideos$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar() {
        File[] fileArrListFiles;
        File fileCallIdleVideoDir = callIdleVideoDir();
        if (fileCallIdleVideoDir != null) {
            File parentFile = fileCallIdleVideoDir.getParentFile();
            if (parentFile != null && (fileArrListFiles = parentFile.listFiles()) != null) {
                ArrayList<File> arrayListA0h = C3cG.A0h();
                for (File file : fileArrListFiles) {
                    if (!C7384Etj.areEqual(file, fileCallIdleVideoDir)) {
                        arrayListA0h.add(file);
                    }
                }
                for (File file2 : arrayListA0h) {
                    C7384Etj.A0X(file2);
                    CEV.A03(file2);
                }
            }
            HatchAvatarIdlePosterCacheKt.deleteRetiredCallIdleVideos();
        }
    }
}
