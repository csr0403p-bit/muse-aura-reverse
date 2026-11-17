package X;

import java.io.FileFilter;

/* renamed from: X.EuA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7387EuA {
    public static final FileFilter A00 = DHM.A00;

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0085: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:44:0x008a (LINE:133), block:B:42:0x0085 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x008a: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:47:0x0091 (LINE:138), block:B:44:0x008a */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e A[Catch: IOException -> 0x0077, TryCatch #2 {IOException -> 0x0077, blocks: (B:32:0x0069, B:34:0x006e, B:36:0x0073), top: B:54:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[Catch: IOException -> 0x0077, TRY_LEAVE, TryCatch #2 {IOException -> 0x0077, blocks: (B:32:0x0069, B:34:0x006e, B:36:0x0073), top: B:54:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[Catch: IOException -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0097, blocks: (B:43:0x0087, B:45:0x008c, B:48:0x0093, B:6:0x0018, B:8:0x001e, B:10:0x002a, B:30:0x005e), top: B:53:0x0009, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.String r9) throws java.lang.Throwable {
        /*
            java.lang.String r3 = "Failed to close CPU info file readers"
            java.lang.String r2 = "CpuInfoHelper"
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            r7 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L57
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L57
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L90
            r6.<init>(r5)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L90
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            java.lang.String r1 = r4.readLine()     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L84
            if (r1 == 0) goto L36
            java.lang.String r0 = "0-[\\d]+$"
            X.7l3 r0 = X.C06827l3.A02(r0)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L84
            boolean r0 = r0.A08(r1)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L84
            if (r0 == 0) goto L36
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L84
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L84
            int r1 = r0 + 1
            goto L37
        L36:
            r1 = -1
        L37:
            r4.close()     // Catch: java.io.IOException -> L41
            r6.close()     // Catch: java.io.IOException -> L41
            r5.close()     // Catch: java.io.IOException -> L41
            goto L49
        L41:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.BzX.A00(r2, r3, r0)
        L49:
            android.os.StrictMode.setThreadPolicy(r8)
            return r1
        L4d:
            r0 = move-exception
            goto L5e
        L4f:
            r1 = move-exception
            goto L8c
        L51:
            r0 = move-exception
            r4 = r7
            goto L5e
        L54:
            r1 = move-exception
            r5 = r7
            goto L91
        L57:
            r0 = move-exception
            r5 = r7
            r4 = r7
            goto L5d
        L5b:
            r0 = move-exception
            r4 = r7
        L5d:
            r6 = r7
        L5e:
            java.lang.String r1 = "Failed to read CPU core information from file"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L84
            X.BzX.A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L6c
            r4.close()     // Catch: java.io.IOException -> L77
        L6c:
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.io.IOException -> L77
        L71:
            if (r5 == 0) goto L7f
            r5.close()     // Catch: java.io.IOException -> L77
            goto L7f
        L77:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.BzX.A00(r2, r3, r0)
        L7f:
            android.os.StrictMode.setThreadPolicy(r8)
            r1 = -1
            return r1
        L84:
            r1 = move-exception
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.io.IOException -> L97
        L8a:
            if (r6 == 0) goto L91
        L8c:
            r6.close()     // Catch: java.io.IOException -> L97
            goto L91
        L90:
            r1 = move-exception
        L91:
            if (r5 == 0) goto L9f
            r5.close()     // Catch: java.io.IOException -> L97
            goto L9f
        L97:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.BzX.A00(r2, r3, r0)
        L9f:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7387EuA.A00(java.lang.String):int");
    }
}
