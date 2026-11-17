package X;

import android.content.Context;
import android.os.Trace;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class C4E {
    public static final List A05 = C60O.A11(2);
    public final Context A00;
    public final Object A01 = C3cG.A0T();
    public final Map<String, Integer> A02 = BV4.A0u();
    public final C4G A03;
    public final File A04;

    public static final void A00(C4E c4e, File file, String str) {
        File[] fileArrListFiles;
        synchronized (c4e.A01) {
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file2 : fileArrListFiles2) {
                    if (file2.getName().endsWith("_attach.txt")) {
                        Properties properties = new Properties();
                        try {
                            FileReader fileReader = new FileReader(file2);
                            try {
                                properties.load(fileReader);
                                fileReader.close();
                                Iterator<String> it = properties.stringPropertyNames().iterator();
                                while (it.hasNext()) {
                                    String property = properties.getProperty(it.next());
                                    try {
                                        Map<String, Integer> map = c4e.A02;
                                        if (map.get(property) != null && map.get(property).intValue() == 1) {
                                            File file3 = new File(property);
                                            if (!file3.getPath().startsWith("/system/")) {
                                                file3.delete();
                                            }
                                        }
                                        Integer num = map.get(property);
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            if (iIntValue == 1) {
                                                map.remove(property);
                                            } else {
                                                map.put(property, Integer.valueOf(iIntValue - 1));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileReader.close();
                                } catch (Throwable th3) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                }
                                throw th2;
                            }
                        } catch (IllegalArgumentException e) {
                            C2Q.A00().AT9("DelAttachments", e, null);
                            CFK.A06(C9Y.TAG, "malformed Unicode present in input, ignoring it.");
                        }
                    }
                    C3194C2s c3194C2sA00 = C3194C2s.A00(str);
                    synchronized (c3194C2sA00.A03) {
                        try {
                            BeS.A03(c3194C2sA00.A02, "Did you call FixedLengthFiles.init()?");
                            if (file2.length() != c3194C2sA00.A01 || (fileArrListFiles = c3194C2sA00.A02.listFiles()) == null || fileArrListFiles.length >= c3194C2sA00.A00 || !file2.renameTo(new File(c3194C2sA00.A02, FGI.A0M(UUID.randomUUID().toString(), "_prop.txt")))) {
                                file2.delete();
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                file.delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: IOException -> 0x0050, TRY_LEAVE, TryCatch #0 {IOException -> 0x0050, blocks: (B:11:0x0042, B:13:0x004c), top: B:18:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C4E r12, java.lang.String r13, int r14, long r15) {
        /*
            java.io.File r1 = r12.A04
            java.lang.String r0 = "reports"
            java.io.File r2 = X.C3cG.A0O(r1, r0)
            r1 = 0
            X.F5F r0 = new X.F5F
            r0.<init>(r13, r1)
            java.io.File[] r6 = r2.listFiles(r0)
            if (r6 == 0) goto L6d
            java.util.HashMap r4 = X.BV4.A0u()
            int r5 = r6.length
            r3 = 0
        L1a:
            if (r3 >= r5) goto L2c
            r2 = r6[r3]
            long r0 = r2.lastModified()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            int r3 = r3 + 1
            goto L1a
        L2c:
            r1 = 4
            X.F4m r0 = new X.F4m
            r0.<init>(r4, r1)
            java.util.Arrays.sort(r6, r0)
            long r10 = java.lang.System.currentTimeMillis()
            r4 = 0
        L3a:
            if (r4 >= r5) goto L6d
            r7 = r6[r4]
            int r0 = r5 - r14
            if (r4 < r0) goto L4c
            long r8 = r7.lastModified()     // Catch: java.io.IOException -> L50
            long r1 = r10 - r15
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6a
        L4c:
            r12.A04(r7)     // Catch: java.io.IOException -> L50
            goto L6a
        L50:
            r3 = move-exception
            X.C4r r2 = X.C2Q.A00()
            java.lang.String r1 = "DeleteTooManyReports"
            r0 = 0
            r2.AT9(r1, r3, r0)
            java.lang.String r0 = r7.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r3}
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot delete report dir: %s"
            X.CFK.A0H(r1, r0, r2)
        L6a:
            int r4 = r4 + 1
            goto L3a
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E.A01(X.C4E, java.lang.String, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(java.io.File r6, java.io.FileFilter r7, java.util.List<X.C4F> r8, java.util.Set<java.lang.String> r9, boolean r10) {
        /*
            java.lang.String r0 = "buildFiles"
            X.AbstractC3191C2p.A00(r0)
            java.io.File[] r6 = r6.listFiles(r7)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L4b
            int r5 = r6.length     // Catch: java.lang.Throwable -> L4f
            r4 = 0
        Ld:
            if (r4 >= r5) goto L4b
            r2 = r6[r4]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r2.getCanonicalPath()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L4f
            boolean r0 = r2.isDirectory()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L34
            boolean r0 = r9.contains(r1)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L48
            r9.add(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "reports"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L2f
            r0 = 0
            if (r10 == 0) goto L30
        L2f:
            r0 = 1
        L30:
            A02(r2, r7, r8, r9, r0)     // Catch: java.lang.Throwable -> L4f
            goto L48
        L34:
            X.C4F r0 = new X.C4F     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r2, r10)     // Catch: java.lang.Throwable -> L4f
            r8.add(r0)     // Catch: java.lang.Throwable -> L4f
            goto L48
        L3d:
            r3 = move-exception
            X.C4r r2 = X.C2Q.A00()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "GlobalCleanBuildFile"
            r0 = 0
            r2.AT9(r1, r3, r0)     // Catch: java.lang.Throwable -> L4f
        L48:
            int r4 = r4 + 1
            goto Ld
        L4b:
            android.os.Trace.endSection()
            return
        L4f:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E.A02(java.io.File, java.io.FileFilter, java.util.List, java.util.Set, boolean):void");
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;>; */
    public final void A03() {
        int iIndexOf;
        FileReader fileReader;
        AbstractC3191C2p.A00("updateRefCounts");
        HashMap mapA0u = BV4.A0u();
        try {
            ArrayList arrayListA0h = C3cG.A0h();
            HashSet hashSetA13 = C60O.A13();
            synchronized (this.A01) {
                A02(this.A04, new F5D(2), arrayListA0h, hashSetA13, false);
                Map<String, Integer> map = this.A02;
                map.clear();
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    C4F c4f = (C4F) it.next();
                    Properties properties = new Properties();
                    try {
                        fileReader = new FileReader(c4f.A00);
                    } catch (IllegalArgumentException e) {
                        C2Q.A00().AT9("MalformUnicode", e, null);
                        CFK.A06(C9Y.TAG, "malformed Unicode present in input, ignoring it.");
                    }
                    try {
                        properties.load(fileReader);
                        fileReader.close();
                        Iterator<String> it2 = properties.stringPropertyNames().iterator();
                        while (it2.hasNext()) {
                            String property = properties.getProperty(it2.next());
                            if (property != null) {
                                if (c4f.A01) {
                                    File file = c4f.A00;
                                    int iIndexOf2 = property.indexOf("sess_");
                                    if (iIndexOf2 >= 0 && (iIndexOf = property.indexOf(47, iIndexOf2)) >= 0) {
                                        String strSubstring = property.substring(iIndexOf2, iIndexOf);
                                        Set hashSet = (Set) mapA0u.get(strSubstring);
                                        if (hashSet == null) {
                                            hashSet = new HashSet();
                                            mapA0u.put(strSubstring, hashSet);
                                        }
                                        hashSet.add(file.getCanonicalPath());
                                    }
                                }
                                Integer num = map.get(property);
                                if (num == null) {
                                    map.put(property, 1);
                                } else {
                                    map.put(property, Integer.valueOf(num.intValue() + 1));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            fileReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void A04(File file) {
        synchronized (C4E.class) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                it.next();
            }
            A00(this, file, "reports");
        }
    }

    public C4E(Context context, C4G c4g, File file) {
        this.A00 = context;
        this.A04 = file;
        this.A03 = c4g;
    }
}
