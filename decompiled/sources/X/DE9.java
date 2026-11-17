package X;

import android.net.Uri;
import android.util.LruCache;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DE9 {
    public final Object A00;
    public final AtomicInteger A01;
    public final AtomicReference<LruCache<String, DEB>> A02 = BV4.A16(new LruCache(10));
    public final boolean A03;

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1 A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:51:0x0092, B:52:0x00a1, B:54:0x00a7, B:55:0x00b5, B:57:0x00bd, B:59:0x00c5, B:63:0x00d1, B:65:0x00d6, B:67:0x00e5, B:69:0x00eb, B:72:0x00f3, B:74:0x00fb, B:75:0x00ff, B:80:0x010e, B:82:0x0111, B:84:0x0126, B:79:0x0106, B:89:0x012f, B:92:0x013a, B:96:0x0144, B:98:0x0153, B:100:0x015a, B:103:0x0168, B:105:0x0170, B:116:0x019d, B:106:0x0177, B:107:0x017b, B:109:0x0181, B:112:0x0191, B:114:0x0195, B:95:0x0142, B:90:0x0137, B:64:0x00d4), top: B:127:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4 A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:51:0x0092, B:52:0x00a1, B:54:0x00a7, B:55:0x00b5, B:57:0x00bd, B:59:0x00c5, B:63:0x00d1, B:65:0x00d6, B:67:0x00e5, B:69:0x00eb, B:72:0x00f3, B:74:0x00fb, B:75:0x00ff, B:80:0x010e, B:82:0x0111, B:84:0x0126, B:79:0x0106, B:89:0x012f, B:92:0x013a, B:96:0x0144, B:98:0x0153, B:100:0x015a, B:103:0x0168, B:105:0x0170, B:116:0x019d, B:106:0x0177, B:107:0x017b, B:109:0x0181, B:112:0x0191, B:114:0x0195, B:95:0x0142, B:90:0x0137, B:64:0x00d4), top: B:127:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5 A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:51:0x0092, B:52:0x00a1, B:54:0x00a7, B:55:0x00b5, B:57:0x00bd, B:59:0x00c5, B:63:0x00d1, B:65:0x00d6, B:67:0x00e5, B:69:0x00eb, B:72:0x00f3, B:74:0x00fb, B:75:0x00ff, B:80:0x010e, B:82:0x0111, B:84:0x0126, B:79:0x0106, B:89:0x012f, B:92:0x013a, B:96:0x0144, B:98:0x0153, B:100:0x015a, B:103:0x0168, B:105:0x0170, B:116:0x019d, B:106:0x0177, B:107:0x017b, B:109:0x0181, B:112:0x0191, B:114:0x0195, B:95:0x0142, B:90:0x0137, B:64:0x00d4), top: B:127:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] A00(android.net.Uri r9, X.DE9 r10, java.lang.Integer r11, java.lang.String r12, byte[] r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE9.A00(android.net.Uri, X.DE9, java.lang.Integer, java.lang.String, byte[], int, boolean):byte[]");
    }

    public final DE8 A01(Uri uri, String str) {
        DE8 de8;
        if (str == null || uri == null) {
            AbstractC3426CMt.A02("DashChunkMemoryCache", "Invalid input is given for getDashChunkData");
        } else {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            Uri uriBuild = builderBuildUpon.build();
            AtomicReference<LruCache<String, DEB>> atomicReference = this.A02;
            synchronized (atomicReference) {
                LruCache<String, DEB> lruCache = atomicReference.get();
                if (lruCache == null) {
                    return null;
                }
                DEB deb = lruCache.get(str);
                if (deb != null) {
                    DEB deb2 = deb;
                    C7384Etj.A0X(uriBuild);
                    synchronized (deb2) {
                        de8 = deb2.A00.get(new EuH(uriBuild));
                    }
                    if (de8 != null) {
                        return de8;
                    }
                }
            }
        }
        return null;
    }

    public final void A02(String str, Uri uri) {
        if (str != null) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            Uri uriBuild = builderBuildUpon.build();
            AtomicReference<LruCache<String, DEB>> atomicReference = this.A02;
            synchronized (atomicReference) {
                LruCache<String, DEB> lruCache = atomicReference.get();
                if (lruCache == null) {
                    return;
                }
                DEB deb = lruCache.get(str);
                if (deb != null) {
                    C7384Etj.A0X(uriBuild);
                    synchronized (deb) {
                        EuH euH = new EuH(uriBuild);
                        if (deb.A04.A03 && deb.A01.contains(euH)) {
                            Queue<EuH> queue = deb.A02;
                            if (queue.remove(euH)) {
                                queue.add(euH);
                            }
                        }
                    }
                }
            }
        }
    }

    public DE9(Object obj, int i, boolean z) {
        this.A03 = z;
        this.A00 = obj;
        this.A01 = BV4.A13(i * 6);
    }
}
