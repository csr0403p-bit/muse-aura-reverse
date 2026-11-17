package com.facebook.aura.vds.compose.ext;

import X.BFM;
import X.C1j7;
import X.C1jT;
import X.C7384Etj;
import X.C78N;
import X.C7Je;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceBitmap;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceUri;

/* loaded from: classes.dex */
public abstract class AuraDrawableSourceKt {
    public static final AuraDrawableSourceUri auraDrawableSource(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        return auraDrawableSource(rememberUri(str, bfm, i & 14), bfm, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri rememberUri(java.lang.String r3, X.BFM r4, int r5) {
        /*
            int r0 = X.AnonymousClass006.A0E(r3, r5)
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Lf
            boolean r0 = r4.A65(r3)
            if (r0 != 0) goto L14
        Lf:
            r0 = r5 & 6
            r1 = 0
            if (r0 != r2) goto L15
        L14:
            r1 = 1
        L15:
            java.lang.Object r0 = r4.AaT()
            if (r1 != 0) goto L1f
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L26
        L1f:
            android.net.Uri r0 = X.C7Je.A01(r3)
            r4.Ai0(r0)
        L26:
            android.net.Uri r0 = (android.net.Uri) r0
            X.C7384Etj.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.AuraDrawableSourceKt.rememberUri(java.lang.String, X.BFM, int):android.net.Uri");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.vds.compose.common.AuraDrawableSourceResource auraDrawableSource(int r3, X.BFM r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r4.A63(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r4.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L25
        L1d:
            com.facebook.aura.vds.compose.common.AuraDrawableSourceResource r1 = new com.facebook.aura.vds.compose.common.AuraDrawableSourceResource
            r1.<init>(r3)
            r4.Ai0(r1)
        L25:
            com.facebook.aura.vds.compose.common.AuraDrawableSourceResource r1 = (com.facebook.aura.vds.compose.common.AuraDrawableSourceResource) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.ext.AuraDrawableSourceKt.auraDrawableSource(int, X.BFM, int):com.facebook.aura.vds.compose.common.AuraDrawableSourceResource");
    }

    public static final AuraDrawableSourceUri auraDrawableSource(Uri uri, BFM bfm, int i) {
        C7384Etj.A0Y(uri, 0);
        boolean zA65 = bfm.A65(uri.toString());
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AuraDrawableSourceUri(uri);
            bfm.Ai0(objAaT);
        }
        return (AuraDrawableSourceUri) objAaT;
    }

    public static final AuraDrawableSourceBitmap auraDrawableSource(Bitmap bitmap, BFM bfm, int i) {
        C7384Etj.A0Y(bitmap, 0);
        boolean zA65 = bfm.A65(bitmap);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AuraDrawableSourceBitmap(bitmap);
            bfm.Ai0(objAaT);
        }
        return (AuraDrawableSourceBitmap) objAaT;
    }

    public static final AuraDrawableSourceUri auraDrawableSource(C1jT c1jT, BFM bfm, int i) {
        C7384Etj.A0Y(c1jT, 0);
        Uri uriA01 = C7Je.A01(((C1j7) c1jT).A00.A02);
        C7384Etj.A0U(uriA01);
        return auraDrawableSource(uriA01, bfm, 0);
    }
}
