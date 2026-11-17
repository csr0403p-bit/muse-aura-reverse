package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.C06827l3;
import X.C06H;
import X.C1j7;
import X.C3380CIk;
import X.C3cG;
import X.C3cJ;
import X.C6537EDs;
import X.C7384Etj;
import X.C9sU;
import X.DCl;
import X.EDZ;
import X.G0U;
import X.HtJ;
import X.HzP;
import X.HzS;
import android.content.Context;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.AtomicFile;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.localbrowser.blocklist.remote.RemoteFiles;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import com.hatch.browser.core.BrowserBlocklistFilter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistCache {
    public static final int $stable = 8;
    public static final long FILTER_TIMEOUT_MS = 60000;
    public static final long MAX_FILTER_BYTES = 33554432;
    public static final long REFRESH_AFTER_MS = 86400000;
    public final File directory;
    public final AtomicFile manifest;
    public LocalBrowserBlocklistStateJson state;
    public static final Companion Companion = new Companion();
    public static final C06827l3 FILE_NAME = C06827l3.A02("[0-9a-f-]{36}\\.bin");
    public static final C06827l3 HASH = C06827l3.A02("[0-9a-f]{64}");

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final String hex(byte[] bArr) {
            return BFI.A0C("", new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$Companion$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return C3cJ.A0K(Byte.valueOf(((Number) obj).byteValue()));
                }
            }, bArr);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Loaded {
        public static final int $stable = BrowserBlocklistFilter.$stable | LocalBrowserBlocklistFileJson.$stable;
        public final BrowserBlocklistFilter filter;
        public final LocalBrowserBlocklistFileJson record;

        public final BrowserBlocklistFilter getFilter() {
            return this.filter;
        }

        public final LocalBrowserBlocklistFileJson getRecord() {
            return this.record;
        }

        public Loaded(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, BrowserBlocklistFilter browserBlocklistFilter) {
            AnonymousClass003.A0u(localBrowserBlocklistFileJson, browserBlocklistFilter);
            this.record = localBrowserBlocklistFileJson;
            this.filter = browserBlocklistFilter;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklistCache", f = "LocalBrowserBlocklistCache.kt", l = {118, VoiceCallForegroundService.AVATAR_TARGET_PX}, m = HatchDataExportLoggingKt.PHASE_DOWNLOAD, v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$download$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBlocklistCache.this.download(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklistCache", f = "LocalBrowserBlocklistCache.kt", l = {63}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C124071 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124071(HtJ<? super C124071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBlocklistCache.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBlocklistCache", f = "LocalBrowserBlocklistCache.kt", l = {84, 87}, m = "update", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$update$1, reason: invalid class name and case insensitive filesystem */
    public final class C124081 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124081(HtJ<? super C124081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserBlocklistCache.this.update(null, null, this);
        }
    }

    public LocalBrowserBlocklistCache(Context context) {
        C7384Etj.A0Y(context, 0);
        EDZ edzA01 = EDZ.A01(AnonymousClass001.A0I(context));
        C3380CIk c3380CIk = SC.android_ras_blobs;
        C7384Etj.A0V(c3380CIk);
        File file = new File(edzA01.get(c3380CIk, (C6537EDs) null), "hatch_browser_blocklist");
        this.directory = file;
        this.manifest = new AtomicFile(new File(file, "cache.json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01be: INVOKE (r11 I:java.io.Closeable), (r1 I:java.lang.Throwable) STATIC call: X.Ezs.A00(java.io.Closeable, java.lang.Throwable):void A[Catch: all -> 0x01c2, MD:(java.io.Closeable, java.lang.Throwable):void (m), TRY_ENTER] (LINE:446), block:B:66:0x01be */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01c5: IF  (r7 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:75:0x01ce (LINE:453), block:B:71:0x01c5 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.facebook.aura.localbrowser.LocalBrowserBlocklistCache] */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.HtJ, X.HtJ<? super com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$Loaded>, java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object download(com.facebook.aura.localbrowser.LocalBrowserBlocklistFilterJson r35, long r36, X.HtJ<? super com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.Loaded> r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.download(com.facebook.aura.localbrowser.LocalBrowserBlocklistFilterJson, long, X.HtJ):java.lang.Object");
    }

    private final Loaded open(File file, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson) throws Exception {
        BrowserBlocklistFilter.Companion companion = BrowserBlocklistFilter.Companion;
        String absolutePath = file.getAbsolutePath();
        C7384Etj.A0U(absolutePath);
        BrowserBlocklistFilter browserBlocklistFilterOpen = companion.open(absolutePath);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            byte[] bArrInfo = browserBlocklistFilterOpen.info();
            C7384Etj.A0Y(bArrInfo, 0);
            LocalBrowserBlocklistInfoJson localBrowserBlocklistInfoJson = (LocalBrowserBlocklistInfoJson) c9sU.A00(new String(bArrInfo, DCl.A05), LocalBrowserBlocklistInfoJson$$serializer.INSTANCE);
            if (!C7384Etj.areEqual(localBrowserBlocklistInfoJson.version, localBrowserBlocklistFileJson.version) || localBrowserBlocklistInfoJson.source_ds == null) {
                throw new IOException("Blocklist version mismatch");
            }
            return new Loaded(localBrowserBlocklistFileJson, browserBlocklistFilterOpen);
        } catch (Exception e) {
            browserBlocklistFilterOpen.destroy();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void prune() {
        /*
            r6 = this;
            com.facebook.aura.localbrowser.LocalBrowserBlocklistStateJson r1 = r6.state
            r2 = 0
            if (r1 == 0) goto L3b
            com.facebook.aura.localbrowser.LocalBrowserBlocklistFileJson r0 = r1.current
            if (r0 == 0) goto L3b
            java.lang.String r3 = r0.file
        Lb:
            com.facebook.aura.localbrowser.LocalBrowserBlocklistFileJson r0 = r1.previous
            if (r0 == 0) goto L11
            java.lang.String r2 = r0.file
        L11:
            r5 = 0
            java.lang.String r1 = "cache.json"
            java.lang.String r0 = "cache.json.bak"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r1, r0}
            java.util.Set r4 = X.BLW.A05(r0)
            java.io.File r0 = r6.directory
            java.io.File[] r3 = r0.listFiles()
            if (r3 == 0) goto L3f
            int r2 = r3.length
        L27:
            if (r5 >= r2) goto L3f
            r1 = r3[r5]
            java.lang.String r0 = r1.getName()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L38
            r1.delete()
        L38:
            int r5 = r5 + 1
            goto L27
        L3b:
            r3 = r2
            if (r1 == 0) goto L11
            goto Lb
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.prune():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sha256(File file, HtJ<? super String> htJ) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                HzS.A05(htJ.getContext());
                int i = fileInputStream.read(bArr);
                if (i < 0) {
                    fileInputStream.close();
                    Companion companion = Companion;
                    byte[] bArrDigest = messageDigest.digest();
                    C7384Etj.A0U(bArrDigest);
                    return companion.hex(bArrDigest);
                }
                messageDigest.update(bArr, 0, i);
            }
        } finally {
        }
    }

    private final void syncDirectory() throws ErrnoException {
        FileDescriptor fileDescriptorOpen = Os.open(this.directory.getAbsolutePath(), OsConstants.O_RDONLY, 0);
        try {
            Os.fsync(fileDescriptorOpen);
        } finally {
            Os.close(fileDescriptorOpen);
        }
    }

    private final boolean validRecord(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson) {
        if (FILE_NAME.A08(localBrowserBlocklistFileJson.file)) {
            long j = localBrowserBlocklistFileJson.size;
            if (32 <= j && j < 33554433 && HASH.A08(localBrowserBlocklistFileJson.sha256)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: ApiException | IOException -> 0x0098, TryCatch #0 {ApiException | IOException -> 0x0098, blocks: (B:43:0x00cc, B:44:0x00cf, B:38:0x00b3, B:40:0x00bd, B:46:0x00d7, B:48:0x00df, B:49:0x00e1, B:51:0x00e7, B:52:0x00f0), top: B:60:0x00cc }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c9 -> B:44:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.Loaded> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.load(X.HtJ):java.lang.Object");
    }

    public final Object loadFallback(HtJ<? super Loaded> htJ) {
        return download(new LocalBrowserBlocklistFilterJson("0d42844cfc3dca76", ((C1j7) RemoteFiles.BLOCKLIST).A00.A02, "e04a69df4d73254c0126ebf124d737b9d16d4b0c1f902cb9e9c1bc6eea4ccc99", C3cG.A0S(2222684L)), 0L, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object update(com.facebook.aura.localbrowser.LocalBrowserBlocklistFilterJson r8, com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.Loaded r9, X.HtJ<? super com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.Loaded> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.C124081
            if (r0 == 0) goto L24
            r4 = r10
            com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$update$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.C124081) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 == r5) goto L2f
            if (r0 != r3) goto L2a
            X.Hwg.A00(r1)
            return r1
        L24:
            com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$update$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$update$1
            r4.<init>(r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            java.lang.Object r9 = r4.L$1
            X.Hwg.A00(r1)
            return r9
        L35:
            X.Hwg.A00(r1)
            java.lang.String r0 = r8.url
            if (r0 != 0) goto L5b
            if (r9 == 0) goto L6d
            java.lang.String r1 = r8.version
            com.facebook.aura.localbrowser.LocalBrowserBlocklistFileJson r0 = r9.record
            java.lang.String r0 = r0.version
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L6d
            com.facebook.aura.localbrowser.LocalBrowserBlocklistFileJson r3 = r9.record
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r9
            r4.label = r5
            r7.publish(r3, r1, r4)
        L5a:
            return r9
        L5b:
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r3
            java.lang.Object r9 = r7.download(r8, r1, r4)
            if (r9 != r6) goto L5a
            return r6
        L6d:
            java.lang.String r1 = "Unexpected unchanged blocklist"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklistCache.update(com.facebook.aura.localbrowser.LocalBrowserBlocklistFilterJson, com.facebook.aura.localbrowser.LocalBrowserBlocklistCache$Loaded, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object publish(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, long j, HtJ<? super Unit> htJ) throws Exception {
        LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson;
        LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2;
        HzS.A05(htJ.getContext());
        LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson2 = this.state;
        LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson3 = null;
        if ((localBrowserBlocklistStateJson2 != null && (localBrowserBlocklistFileJson2 = localBrowserBlocklistStateJson2.current) != null && !localBrowserBlocklistFileJson2.equals(localBrowserBlocklistFileJson)) || ((localBrowserBlocklistStateJson = this.state) != null && (localBrowserBlocklistFileJson2 = localBrowserBlocklistStateJson.previous) != null && !localBrowserBlocklistFileJson2.equals(localBrowserBlocklistFileJson))) {
            localBrowserBlocklistFileJson3 = localBrowserBlocklistFileJson2;
        }
        LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson3 = new LocalBrowserBlocklistStateJson(localBrowserBlocklistFileJson, localBrowserBlocklistFileJson3, j);
        byte[] bArrA1S = C3cG.A1S(HatchJsonKt.HatchJson.A02(localBrowserBlocklistStateJson3, LocalBrowserBlocklistStateJson$$serializer.INSTANCE));
        FileOutputStream fileOutputStreamStartWrite = this.manifest.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArrA1S);
            this.manifest.finishWrite(fileOutputStreamStartWrite);
            this.state = localBrowserBlocklistStateJson3;
            syncDirectory();
            prune();
            return Unit.INSTANCE;
        } catch (Exception e) {
            this.manifest.failWrite(fileOutputStreamStartWrite);
            throw e;
        }
    }

    public final boolean isStale() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson = this.state;
        if (localBrowserBlocklistStateJson == null) {
            return true;
        }
        long j = jCurrentTimeMillis - localBrowserBlocklistStateJson.checked_at;
        return j < 0 || j >= 86400000;
    }
}
