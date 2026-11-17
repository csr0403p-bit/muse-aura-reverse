package com.facebook.aura.audio;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C9258GBl;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchAudioCache {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long MAX_CACHE_BYTES = 52428800;
    public final File cacheDir;
    public final InterfaceC2261BLa evictionMutex;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioCache$downloadToCache$2", f = "HatchAudioCache.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioCache$downloadToCache$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ File $cachedFile;
        public final /* synthetic */ String $url;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public final /* synthetic */ HatchAudioCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file, String str, HatchAudioCache hatchAudioCache, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$cachedFile = file;
            this.$url = str;
            this.this$0 = hatchAudioCache;
            this.$cacheKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$cachedFile, this.$url, this.this$0, this.$cacheKey, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: Exception -> 0x014d, TRY_ENTER, TryCatch #2 {Exception -> 0x014d, blocks: (B:25:0x00d0, B:26:0x00d3, B:28:0x00d7, B:30:0x00df, B:31:0x00e6, B:38:0x0119, B:40:0x0121, B:41:0x012b, B:32:0x00fc, B:33:0x0104, B:18:0x00a3, B:37:0x0115, B:22:0x00c8, B:23:0x00cb, B:19:0x00a8, B:35:0x0113), top: B:53:0x0012, inners: #0, #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[Catch: Exception -> 0x014d, TryCatch #2 {Exception -> 0x014d, blocks: (B:25:0x00d0, B:26:0x00d3, B:28:0x00d7, B:30:0x00df, B:31:0x00e6, B:38:0x0119, B:40:0x0121, B:41:0x012b, B:32:0x00fc, B:33:0x0104, B:18:0x00a3, B:37:0x0115, B:22:0x00c8, B:23:0x00cb, B:19:0x00a8, B:35:0x0113), top: B:53:0x0012, inners: #0, #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0104 A[Catch: Exception -> 0x014d, TRY_LEAVE, TryCatch #2 {Exception -> 0x014d, blocks: (B:25:0x00d0, B:26:0x00d3, B:28:0x00d7, B:30:0x00df, B:31:0x00e6, B:38:0x0119, B:40:0x0121, B:41:0x012b, B:32:0x00fc, B:33:0x0104, B:18:0x00a3, B:37:0x0115, B:22:0x00c8, B:23:0x00cb, B:19:0x00a8, B:35:0x0113), top: B:53:0x0012, inners: #0, #1, #3 }] */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.io.Closeable] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.HatchAudioCache.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.audio.HatchAudioCache", f = "HatchAudioCache.kt", l = {156}, m = "evictIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.audio.HatchAudioCache$evictIfNeeded$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAudioCache.this.evictIfNeeded(null, this);
        }
    }

    /* renamed from: com.facebook.aura.audio.HatchAudioCache$sha256$1, reason: invalid class name and case insensitive filesystem */
    public final class C109691 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final C109691 INSTANCE = new C109691();

        public C109691() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return C3cJ.A0K(Byte.valueOf(b.byteValue()));
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Byte.valueOf(b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object evictIfNeeded(java.lang.String r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.audio.HatchAudioCache.evictIfNeeded(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void clear() {
        HatchAudioCacheKt.deleteChildrenInBackground(this.cacheDir);
    }

    public final Object getOrDownload(String str, String str2, HtJ<? super File> htJ) {
        String strSha256 = sha256(str2 != null ? FGI.A0U(str2, ":", str) : str);
        return downloadToCache(str, strSha256, C3cG.A0O(this.cacheDir, strSha256), htJ);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAudioCache(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        this.userSession = abstractC3358CGz;
        File fileA0O = C3cG.A0O(context.getCacheDir(), HatchAudioCacheKt.AUDIO_CACHE_DIR);
        fileA0O.mkdirs();
        this.cacheDir = fileA0O;
        this.evictionMutex = new C9258GBl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadToCache(String str, String str2, File file, HtJ<? super File> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(file, str, this, str2, null));
    }

    private final String sha256(String str) {
        byte[] bArrA1T = C3cH.A1T(str);
        C7384Etj.A0X(bArrA1T);
        return BFI.A0C("", C109691.INSTANCE, bArrA1T);
    }
}
