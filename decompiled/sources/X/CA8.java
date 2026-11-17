package X;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes5.dex */
public final class CA8 {
    public final ConcurrentHashMap A00 = C60O.A1C();
    public static final CA9 A02 = new CA9("LibraryVersion", "");
    public static final CA8 A01 = new CA8();

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r5 = "LibraryVersion"
            java.lang.String r8 = "Failed to get app version for libraryName: "
            java.lang.String r0 = "Please provide a valid libraryName"
            X.CRy.A07(r10, r0)
            java.util.concurrent.ConcurrentHashMap r6 = r9.A00
            boolean r0 = r6.containsKey(r10)
            if (r0 == 0) goto L16
            java.lang.String r0 = X.BV4.A0h(r10, r6)
            return r0
        L16:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r4 = 0
            java.lang.String r1 = "/%s.properties"
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L9e
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L9e
            java.lang.Class<X.CA8> r0 = X.CA8.class
            java.io.InputStream r7 = r0.getResourceAsStream(r1)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L9e
            if (r7 == 0) goto L53
            r2.load(r7)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            java.lang.String r0 = "version"
            java.lang.String r4 = r2.getProperty(r0, r4)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            X.CA9 r3 = X.CA8.A02     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            java.lang.String r0 = " version is "
            java.lang.String r1 = X.FGI.A0U(r10, r0, r4)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            if (r0 == 0) goto L8c
            java.lang.String r0 = r3.A01     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.concat(r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
        L4f:
            android.util.Log.v(r5, r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            goto L8c
        L53:
            X.CA9 r3 = X.CA8.A02     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            java.lang.String r1 = X.FGI.A0M(r8, r10)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            if (r0 == 0) goto L8c
            java.lang.String r0 = r3.A01     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.concat(r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
        L68:
            android.util.Log.w(r5, r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> La0
            goto L8c
        L6c:
            r2 = move-exception
            r9 = r4
            r4 = r7
            goto L72
        L70:
            r2 = move-exception
            r9 = r4
        L72:
            X.CA9 r3 = X.CA8.A02     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = X.FGI.A0M(r8, r10)     // Catch: java.lang.Throwable -> L9e
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L8a
            java.lang.String r0 = r3.A01     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.concat(r1)     // Catch: java.lang.Throwable -> L9e
        L87:
            android.util.Log.e(r5, r1, r2)     // Catch: java.lang.Throwable -> L9e
        L8a:
            r7 = r4
            r4 = r9
        L8c:
            if (r7 == 0) goto L91
            r7.close()     // Catch: java.io.IOException -> L91
        L91:
            if (r4 != 0) goto L9a
            java.lang.String r0 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r3.A00(r5, r0)
            java.lang.String r4 = "UNKNOWN"
        L9a:
            r6.put(r10, r4)
            return r4
        L9e:
            r0 = move-exception
            goto La2
        La0:
            r0 = move-exception
            r4 = r7
        La2:
            if (r4 == 0) goto La7
            r4.close()     // Catch: java.io.IOException -> La7
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CA8.A00(java.lang.String):java.lang.String");
    }
}
