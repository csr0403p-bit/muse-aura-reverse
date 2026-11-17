package X;

import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.C3l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3210C3l {
    public static final Set<String> A00 = C60O.A13();

    public static synchronized void A00(C3g c3g, String str) {
        Set<String> set = A00;
        if (!set.contains(str)) {
            BV4.A1L("Prepending SoSource ", str, ": ", c3g.toString(), "SoLoader");
            if (!(c3g instanceof C3216C3y)) {
                ReentrantReadWriteLock reentrantReadWriteLock = ETi.A0A;
                BV4.A1T(reentrantReadWriteLock);
                try {
                    if (!ETi.A0A()) {
                        throw C3cG.A0Q("SoLoader.init() not called yet");
                    }
                    c3g.A08(ETi.A00());
                    C3g[] c3gArr = new C3g[ETi.A0E.length + 1];
                    c3gArr[0] = c3g;
                    System.arraycopy(ETi.A0E, 0, c3gArr, 1, ETi.A0E.length);
                    ETi.A0E = c3gArr;
                    ETi.A09.getAndIncrement();
                    C35.A00(AnonymousClass007.A0a("Prepended to SO sources: ", c3g));
                } finally {
                    BV4.A1Q(reentrantReadWriteLock);
                }
            }
            set.add(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[Catch: all -> 0x026b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:8:0x0067, B:47:0x0100, B:53:0x012d, B:73:0x01a2, B:106:0x023d, B:49:0x010c, B:126:0x026a, B:125:0x0267, B:10:0x006e, B:36:0x00be, B:37:0x00bf, B:39:0x00c9, B:41:0x00cd, B:54:0x0132, B:55:0x0146, B:57:0x014c, B:59:0x015c, B:61:0x0164, B:63:0x0174, B:65:0x017c, B:67:0x0184, B:70:0x018c, B:71:0x0195, B:74:0x01a7, B:76:0x01ad, B:77:0x01b4, B:78:0x01b8, B:80:0x01be, B:82:0x01ca, B:96:0x021a, B:99:0x0225, B:104:0x0233, B:103:0x0230, B:105:0x0234, B:120:0x025a, B:121:0x0260, B:42:0x00db, B:44:0x00e7, B:46:0x00f0, B:48:0x0104, B:83:0x01cf, B:84:0x01d3, B:86:0x01d9, B:88:0x01f1, B:90:0x01fd, B:92:0x0203, B:93:0x0209, B:95:0x020d, B:97:0x021e, B:98:0x0224, B:101:0x022b, B:123:0x0262), top: B:137:0x0067, outer: #5, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean A04(java.io.File r21, java.io.File r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3210C3l.A04(java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static void A01(File file) throws IOException {
        file.mkdirs();
        if (file.exists() && !file.isDirectory()) {
            throw BV8.A0j(file, "path points to a non-directory ");
        }
        if (!file.exists()) {
            throw BV4.A0K(AnonymousClass001.A0v(" does not exist", C3cG.A0f(file, "directory ")));
        }
        file.setWritable(true);
    }

    public static void A02(File file, Set<String> set) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!set.contains(file2.getName())) {
                    try {
                        C2D.A03(file2);
                    } catch (IOException e) {
                        Log.e("sosource.ModuleDirectory", AnonymousClass007.A0a("Could not delete ", file2), e);
                    }
                }
            }
        }
    }

    public static boolean A03(File file) {
        String parent;
        String[] strArr;
        ApplicationInfo applicationInfoA01 = ETi.A01();
        String strA00 = AbstractC3212C3n.A00(file);
        if (strA00 == null || (parent = file.getCanonicalFile().getParent()) == null || !parent.equals(BV4.A0G(applicationInfoA01.sourceDir).getParent())) {
            return false;
        }
        return strA00.equals("base") || ((strArr = applicationInfoA01.splitNames) != null && Arrays.binarySearch(strArr, strA00) >= 0);
    }
}
