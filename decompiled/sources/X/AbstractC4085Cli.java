package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.Cli, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4085Cli {
    public volatile int A00;
    public volatile String A01 = "";
    public volatile String A02 = "";
    public volatile Function0<Boolean> A03 = C6724EXi.A00(4);
    public volatile boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[PHI: r1 r2
  0x001d: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:7:0x0011, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:7:0x0011, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:11:0x001e, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.tigon.TigonRequestToken A00(X.AbstractC4085Cli r6, com.facebook.tigon.TigonBodyProvider r7, com.facebook.tigon.TigonCallbacks r8, com.facebook.tigon.iface.TigonRequest r9, java.util.concurrent.Executor r10) {
        /*
            monitor-enter(r6)
            java.lang.String r0 = "https.proxyHost"
            java.lang.String r2 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = ""
            if (r2 != 0) goto Lc
            r2 = r5
        Lc:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L89
            r1 = 1
            if (r0 > 0) goto L1d
            r1 = 0
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r2 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L89
            r4 = r5
            if (r2 == 0) goto L21
        L1d:
            r4 = r2
            if (r1 == 0) goto L21
            goto L24
        L21:
            java.lang.String r0 = "http.proxyPort"
            goto L26
        L24:
            java.lang.String r0 = "https.proxyPort"
        L26:
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L46
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L89
        L30:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L89
            if (r0 <= 0) goto L48
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r6.A03     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L89
            r2 = 1
            if (r0 != 0) goto L49
            goto L48
        L46:
            r3 = 0
            goto L30
        L48:
            r2 = 0
        L49:
            java.lang.String r0 = r6.A01     // Catch: java.lang.Throwable -> L89
            boolean r0 = r4.contentEquals(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L62
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L89
            if (r3 != r0) goto L62
            boolean r0 = r6.A04     // Catch: java.lang.Throwable -> L89
            if (r2 != r0) goto L62
            java.lang.String r0 = r6.A02     // Catch: java.lang.Throwable -> L89
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L62
            goto L7c
        L62:
            r6.A01 = r4     // Catch: java.lang.Throwable -> L89
            r6.A00 = r3     // Catch: java.lang.Throwable -> L89
            r6.A02 = r5     // Catch: java.lang.Throwable -> L89
            r6.A04 = r2     // Catch: java.lang.Throwable -> L89
            r0 = r6
            X.DCW r0 = (X.DCW) r0     // Catch: java.lang.Throwable -> L89
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L89
            com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder r0 = r0.A00     // Catch: java.lang.Throwable -> L89
            if (r1 <= 0) goto L79
            r0.setProxyClientIPAddress(r4, r3, r5)     // Catch: java.lang.Throwable -> L89
            goto L7c
        L79:
            r0.setProxyHostAndPort(r4, r3, r2)     // Catch: java.lang.Throwable -> L89
        L7c:
            monitor-exit(r6)
            X.DCW r6 = (X.DCW) r6
            com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder r0 = r6.A00
            com.facebook.tigon.TigonRequestToken r0 = r0.sendRequest(r9, r7, r8, r10)
            X.C7384Etj.A0U(r0)
            return r0
        L89:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC4085Cli.A00(X.Cli, com.facebook.tigon.TigonBodyProvider, com.facebook.tigon.TigonCallbacks, com.facebook.tigon.iface.TigonRequest, java.util.concurrent.Executor):com.facebook.tigon.TigonRequestToken");
    }
}
