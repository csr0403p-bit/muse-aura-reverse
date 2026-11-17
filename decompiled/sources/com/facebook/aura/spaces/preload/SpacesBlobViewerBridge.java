package com.facebook.aura.spaces.preload;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.CEV;
import X.CFK;
import X.FGI;
import X.G0W;
import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpacesBlobViewerBridge {
    public static final Companion Companion = new Companion();
    public static final long MAX_BLOB_BYTES = 134217728;
    public static final int MAX_CONCURRENT_TRANSFERS = 3;
    public static final int MAX_RETAINED_BLOB_DIRS = 5;
    public static final String TAG = "SpacesBlobViewerBridge";
    public static final long TOKEN_VALIDATION_TIMEOUT_MS = 2000;
    public static final long TRANSFER_IDLE_TIMEOUT_MS = 60000;
    public final Object admissionLock;
    public final Context appContext;
    public volatile G0W<? super String, ? super String, ? super String, Unit> onLocalContentReady;
    public volatile C6t6 secureWebView;
    public final ConcurrentHashMap<String, BlobTransfer> transfers;

    public final class BlobTransfer {
        public volatile boolean aborted;
        public long bytesWritten;
        public final long declaredBytes;
        public final File dir;
        public final File file;
        public volatile long lastActivityMs;
        public final ReentrantLock lock;
        public final String mimeType;
        public final String name;
        public final OutputStream out;
        public final AtomicBoolean streamClosed;
        public final CountDownLatch tokenChecked;
        public volatile boolean tokenValid;

        public BlobTransfer(File file, File file2, OutputStream outputStream, String str, String str2, long j) {
            C7384Etj.A0Y(file, 0);
            AnonymousClass005.A11(file2, outputStream, str, 1);
            C7384Etj.A0Y(str2, 4);
            this.dir = file;
            this.file = file2;
            this.out = outputStream;
            this.mimeType = str;
            this.name = str2;
            this.declaredBytes = j;
            this.lock = new ReentrantLock();
            this.streamClosed = new AtomicBoolean(false);
            this.tokenChecked = new CountDownLatch(1);
            this.lastActivityMs = SystemClock.elapsedRealtime();
        }

        public final void abort() {
            this.aborted = true;
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                closeStream();
                CEV.A03(this.dir);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final MaterializedFile finish(Context context) {
            MaterializedFile materializedFile;
            C7384Etj.A0Y(context, 0);
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.aborted || this.bytesWritten != this.declaredBytes) {
                    materializedFile = null;
                } else {
                    closeStream();
                    materializedFile = new MaterializedFile(C60O.A0o(HatchFileProviderUtil.INSTANCE.getUriForFile(context, this.file)), this.name);
                }
                return materializedFile;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean write(byte[] r9) {
            /*
                r8 = this;
                r0 = 0
                X.C7384Etj.A0Y(r9, r0)
                java.util.concurrent.locks.ReentrantLock r6 = r8.lock
                r6.lock()
                boolean r0 = r8.aborted     // Catch: java.lang.Throwable -> L30
                if (r0 != 0) goto L29
                long r4 = r8.bytesWritten     // Catch: java.lang.Throwable -> L30
                int r0 = r9.length     // Catch: java.lang.Throwable -> L30
                long r2 = (long) r0     // Catch: java.lang.Throwable -> L30
                long r4 = r4 + r2
                long r0 = r8.declaredBytes     // Catch: java.lang.Throwable -> L30
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 > 0) goto L29
                java.io.OutputStream r0 = r8.out     // Catch: java.lang.Throwable -> L30
                r0.write(r9)     // Catch: java.lang.Throwable -> L30
                long r0 = r8.bytesWritten     // Catch: java.lang.Throwable -> L30
                long r0 = r0 + r2
                r8.bytesWritten = r0     // Catch: java.lang.Throwable -> L30
                long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L30
                r8.lastActivityMs = r0     // Catch: java.lang.Throwable -> L30
                goto L2b
            L29:
                r0 = 0
                goto L2c
            L2b:
                r0 = 1
            L2c:
                r6.unlock()
                return r0
            L30:
                r0 = move-exception
                r6.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesBlobViewerBridge.BlobTransfer.write(byte[]):boolean");
        }

        private final void closeStream() throws IOException {
            if (C3cI.A1W(this.streamClosed)) {
                try {
                    this.out.close();
                } catch (IOException e) {
                    CFK.A0A(SpacesBlobViewerBridge.TAG, "Failed to close blob transfer stream", e);
                }
            }
        }

        public final boolean awaitTokenValid() {
            return this.tokenChecked.await(2000L, TimeUnit.MILLISECONDS) && this.tokenValid;
        }

        public final long getLastActivityMs() {
            return this.lastActivityMs;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getName() {
            return this.name;
        }

        public final CountDownLatch getTokenChecked() {
            return this.tokenChecked;
        }

        public final boolean getTokenValid() {
            return this.tokenValid;
        }

        public final void setLastActivityMs(long j) {
            this.lastActivityMs = j;
        }

        public final void setTokenValid(boolean z) {
            this.tokenValid = z;
        }
    }

    public final class MaterializedFile extends C06G {
        public final String name;
        public final String uri;

        public static /* synthetic */ MaterializedFile copy$default(MaterializedFile materializedFile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = materializedFile.uri;
            }
            if ((i & 2) != 0) {
                str2 = materializedFile.name;
            }
            AnonymousClass003.A0u(str, str2);
            return new MaterializedFile(str, str2);
        }

        public final String component1() {
            return this.uri;
        }

        public final String component2() {
            return this.name;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUri() {
            return this.uri;
        }

        public MaterializedFile(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.uri = str;
            this.name = str2;
        }

        public final MaterializedFile copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new MaterializedFile(str, str2);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public SpacesBlobViewerBridge(Context context) {
        C7384Etj.A0Y(context, 0);
        this.appContext = AnonymousClass001.A0I(context);
        this.transfers = C60O.A1C();
        this.admissionLock = C3cG.A0T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validateToken(String str) {
        try {
            C6t6 c6t6 = this.secureWebView;
            if (c6t6 == null || !c6t6.validateJsInterfaceToken(str)) {
                return false;
            }
            return SpacesWebViewSessionKt.isOnGrantedSpaceOrigin(c6t6);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Exception validating JS bridge token", e);
            return false;
        }
    }

    @JavascriptInterface
    public final void abortBlob(String str) {
        C7384Etj.A0Y(str, 0);
        BlobTransfer blobTransferRemove = this.transfers.remove(str);
        if (blobTransferRemove != null) {
            blobTransferRemove.abort();
        }
    }

    private final void abandon(String str, BlobTransfer blobTransfer) {
        this.transfers.remove(str);
        blobTransfer.abort();
    }

    private final String normalizedMime(String str) {
        return C60Q.A0g(AnonymousClass002.A0l(C7BY.A0S(str, str, ';')));
    }

    private final BlobTransfer openTransfer(String str, String str2, long j) {
        File fileA0O = C3cG.A0O(this.appContext.getCacheDir(), "shared");
        if (!fileA0O.exists()) {
            fileA0O.mkdirs();
        }
        pruneOldBlobDirs(fileA0O);
        File fileA0O2 = C3cG.A0O(fileA0O, AnonymousClass002.A0k());
        fileA0O2.mkdirs();
        String strBuildFileName = buildFileName(str2, str);
        File fileA0O3 = C3cG.A0O(fileA0O2, strBuildFileName);
        return new BlobTransfer(fileA0O2, fileA0O3, new BufferedOutputStream(new FileOutputStream(fileA0O3)), str, strBuildFileName, j);
    }

    private final void pruneOldBlobDirs(File file) {
        int length;
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.facebook.aura.spaces.preload.SpacesBlobViewerBridge$pruneOldBlobDirs$dirs$1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles == null || (length = fileArrListFiles.length) < 5) {
            return;
        }
        Comparator comparator = new Comparator() { // from class: com.facebook.aura.spaces.preload.SpacesBlobViewerBridge$pruneOldBlobDirs$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C60Q.A01(Long.valueOf(((File) t2).lastModified()), ((File) t).lastModified());
            }
        };
        Object[] objArrCopyOf = Arrays.copyOf(fileArrListFiles, length);
        C7384Etj.A0U(objArrCopyOf);
        if (objArrCopyOf.length > 1) {
            Arrays.sort(objArrCopyOf, comparator);
        }
        Iterator it = AbstractC0878AGe.A0Z(Arrays.asList(objArrCopyOf), 4).iterator();
        while (it.hasNext()) {
            C60R.A1Q(it);
        }
    }

    public final void close() {
        Set<String> setKeySet = this.transfers.keySet();
        C7384Etj.A0U(setKeySet);
        Iterator it = AbstractC0878AGe.A0X(setKeySet).iterator();
        while (it.hasNext()) {
            BlobTransfer blobTransferRemove = this.transfers.remove(it.next());
            if (blobTransferRemove != null) {
                blobTransferRemove.abort();
            }
        }
        this.secureWebView = null;
        this.onLocalContentReady = null;
    }

    @JavascriptInterface
    public final void endBlob(final String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        final BlobTransfer blobTransferRemove = this.transfers.remove(str2);
        if (blobTransferRemove != null) {
            C6t6 c6t6 = this.secureWebView;
            if (c6t6 != null) {
                try {
                    final MaterializedFile materializedFileFinish = blobTransferRemove.finish(this.appContext);
                    if (materializedFileFinish != null) {
                        c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesBlobViewerBridge.endBlob.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str3;
                                if (SpacesBlobViewerBridge.this.validateToken(str)) {
                                    G0W<? super String, ? super String, ? super String, Unit> g0w = SpacesBlobViewerBridge.this.onLocalContentReady;
                                    if (g0w != null) {
                                        MaterializedFile materializedFile = materializedFileFinish;
                                        g0w.invoke(materializedFile.uri, blobTransferRemove.mimeType, materializedFile.name);
                                        return;
                                    }
                                    str3 = "endBlob: no content handler installed";
                                } else {
                                    str3 = "endBlob: token validation failed";
                                }
                                CFK.A06(SpacesBlobViewerBridge.TAG, str3);
                                blobTransferRemove.abort();
                            }
                        });
                        return;
                    }
                    CFK.A06(TAG, "endBlob: transfer was incomplete or already torn down");
                } catch (IOException e) {
                    C3cH.A1B("endBlob: failed to materialize blob: ", e.getMessage(), TAG, e);
                    blobTransferRemove.abort();
                    return;
                }
            }
            blobTransferRemove.abort();
        }
    }

    public final G0W<String, String, String, Unit> getOnLocalContentReady() {
        return this.onLocalContentReady;
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    public final void setOnLocalContentReady(G0W<? super String, ? super String, ? super String, Unit> g0w) {
        this.onLocalContentReady = g0w;
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String buildFileName(String str, String str2) {
        StringBuilder sbA0f;
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(normalizedMime(str2));
        String name = new File(str).getName();
        C7384Etj.A0X(name);
        if (C7BY.A0j(name) || name.equals(".") || name.equals("..")) {
            UUID uuidRandomUUID = UUID.randomUUID();
            extensionFromMimeType = extensionFromMimeType != null ? FGI.A0M(".", extensionFromMimeType) : "";
            sbA0f = C3cG.A0f(uuidRandomUUID, "blob_");
        } else {
            if (C7BY.A0k(name, '.') || extensionFromMimeType == null) {
                return name;
            }
            sbA0f = C3cG.A0g(name);
            sbA0f.append(".");
        }
        return AnonymousClass001.A0v(extensionFromMimeType, sbA0f);
    }

    private final void evictIdleTransfers() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Set<Map.Entry<String, BlobTransfer>> setEntrySet = this.transfers.entrySet();
        ArrayList arrayListA0s = C60Q.A0s(setEntrySet);
        for (Map.Entry<String, BlobTransfer> entry : setEntrySet) {
            if (jElapsedRealtime - entry.getValue().lastActivityMs > 60000) {
                arrayListA0s.add(entry);
            }
        }
        Iterator it = arrayListA0s.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            C7384Etj.A0X(entryA0l);
            Object key = entryA0l.getKey();
            C7384Etj.A0U(key);
            Object value = entryA0l.getValue();
            C7384Etj.A0U(value);
            CFK.A06(TAG, "evicting idle blob transfer");
            this.transfers.remove(key);
            ((BlobTransfer) value).abort();
        }
    }

    @JavascriptInterface
    public final String beginBlob(final String str, String str2, String str3, long j) {
        String str4;
        AnonymousClass005.A0x(str, str2, str3);
        C6t6 c6t6 = this.secureWebView;
        if (c6t6 == null) {
            return "";
        }
        if (j <= 0 || j > MAX_BLOB_BYTES) {
            CFK.A06(TAG, FGI.A0J("beginBlob: rejecting ", j, " byte blob"));
            return "";
        }
        String strA0k = AnonymousClass002.A0k();
        synchronized (this.admissionLock) {
            evictIdleTransfers();
            if (this.transfers.size() >= 3) {
                CFK.A06(TAG, "beginBlob: too many concurrent transfers");
                str4 = "";
            } else {
                try {
                    final BlobTransfer blobTransferOpenTransfer = openTransfer(str2, str3, j);
                    this.transfers.put(strA0k, blobTransferOpenTransfer);
                    c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesBlobViewerBridge.beginBlob.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            blobTransferOpenTransfer.tokenValid = this.validateToken(str);
                            blobTransferOpenTransfer.tokenChecked.countDown();
                        }
                    });
                    return strA0k;
                } catch (IOException e) {
                    CFK.A08(TAG, "beginBlob: failed to open destination file", e);
                    str4 = "";
                }
            }
            return str4;
        }
    }

    @JavascriptInterface
    public final boolean writeBlobChunk(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        BlobTransfer blobTransfer = this.transfers.get(str);
        boolean zWrite = false;
        if (blobTransfer != null) {
            if (blobTransfer.awaitTokenValid()) {
                try {
                    byte[] bArrDecode = Base64.decode(str2, zA1b ? 1 : 0);
                    C7384Etj.A0U(bArrDecode);
                    zWrite = blobTransfer.write(bArrDecode);
                } catch (Exception e) {
                    C3cH.A1B("writeBlobChunk: failed to write chunk: ", e.getMessage(), TAG, e);
                }
                if (!zWrite) {
                    abandon(str, blobTransfer);
                }
                return zWrite;
            }
            CFK.A06(TAG, "writeBlobChunk: token validation failed");
            abandon(str, blobTransfer);
        }
        return zA1b;
    }
}
