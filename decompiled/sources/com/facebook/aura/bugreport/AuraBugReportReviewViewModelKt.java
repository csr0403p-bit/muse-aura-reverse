package com.facebook.aura.bugreport;

/* loaded from: classes.dex */
public abstract class AuraBugReportReviewViewModelKt {
    public static final String DIAGNOSTIC_MIME_TYPE = "text/plain";
    public static final String INCLUDE_LOGS_KEY = "include_logs";
    public static final long MAX_PREVIEW_BYTES = 5242880;
    public static final String TAG = "AuraBugReportReviewViewModel";

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String queryContentDisplayName(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "_display_name"
            r4 = 0
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Exception -> L3a
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L3a
            r2 = r6
            r5 = r4
            r6 = r4
            android.database.Cursor r2 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L39
            int r1 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 < 0) goto L2d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2d
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2d
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r4
        L2e:
            r2.close()     // Catch: java.lang.Exception -> L3a
            return r1
        L32:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.lang.Exception -> L3a
            throw r0     // Catch: java.lang.Exception -> L3a
        L39:
            return r4
        L3a:
            r2 = move-exception
            java.lang.String r1 = "Failed to read the display name of a content URI"
            java.lang.String r0 = "AuraBugReportReviewViewModel"
            X.CFK.A0A(r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportReviewViewModelKt.queryContentDisplayName(android.content.Context, android.net.Uri):java.lang.String");
    }
}
