package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;

/* loaded from: classes5.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InstallException(int r7) {
        /*
            r6 = this;
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.util.Map r2 = X.AbstractC3057Bti.A00
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L3d
            java.util.Map r1 = X.AbstractC3057Bti.A01
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L3d
            java.lang.String r3 = X.C60O.A0p(r4, r2)
            java.lang.String r2 = X.C60O.A0p(r4, r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            java.lang.String r0 = ")"
            java.lang.String r0 = X.FGI.A0d(r3, r1, r2, r0)
        L28:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r5, r0, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r7, r1)
            r6.<init>(r0)
            if (r7 == 0) goto L40
            return
        L3d:
            java.lang.String r0 = ""
            goto L28
        L40:
            java.lang.String r0 = "errorCode should not be 0."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
