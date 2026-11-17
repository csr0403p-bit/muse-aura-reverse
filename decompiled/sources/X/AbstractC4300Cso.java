package X;

import android.credentials.Credential;
import android.os.Bundle;

/* renamed from: X.Cso, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4300Cso {
    public final Bundle A00;
    public final String A01;

    public AbstractC4300Cso(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public static final AbstractC4300Cso A00(Credential credential) {
        String type = credential.getType();
        C7384Etj.A0U(type);
        Bundle data = credential.getData();
        C7384Etj.A0U(data);
        return A01(data, type);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[Catch: FrameworkClassParsingException -> 0x00d2, TryCatch #3 {FrameworkClassParsingException -> 0x00d2, blocks: (B:2:0x0000, B:3:0x0004, B:4:0x0007, B:5:0x000c, B:6:0x000d, B:8:0x0015, B:10:0x0022, B:12:0x0033, B:13:0x0039, B:14:0x003a, B:16:0x0047, B:17:0x004e, B:18:0x0054, B:20:0x005c, B:22:0x0064, B:24:0x006f, B:25:0x0076, B:26:0x0080, B:28:0x0088, B:30:0x00a5, B:31:0x00ab, B:32:0x00ac, B:33:0x00b3, B:35:0x00bb, B:36:0x00ca), top: B:49:0x0000, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC4300Cso A01(android.os.Bundle r4, java.lang.String r5) throws androidx.credentials.internal.FrameworkClassParsingException, androidx.credentials.exceptions.NoCredentialException {
        /*
            int r0 = r5.hashCode()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            switch(r0) {
                case -1678407252: goto Ld;
                case -1072734346: goto L54;
                case -543568185: goto L80;
                case -95037569: goto Lb3;
                default: goto L7;
            }     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        L7:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        Lc:
            throw r2     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        Ld:
            java.lang.String r2 = "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"
            boolean r0 = r5.equals(r2)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L7
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.C7384Etj.A0X(r1)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            boolean r0 = r1 instanceof byte[]     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L3a
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            java.lang.String r0 = X.BV4.A0o(r1)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.CvG r3 = new X.CvG     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            boolean r0 = X.AbstractC4343Ctl.A00(r0)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 != 0) goto Le5
            java.lang.String r0 = "credentialJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        L39:
            throw r0     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        L3a:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.CvG r3 = new X.CvG     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            boolean r0 = X.AbstractC4343Ctl.A00(r1)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 != 0) goto Le5
            java.lang.String r0 = "credentialJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)     // Catch: java.lang.Exception -> L4e androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto L39
        L4e:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Lc
        L54:
            java.lang.String r1 = "androidx.credentials.TYPE_RESTORE_CREDENTIAL"
            boolean r0 = r5.equals(r1)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L7
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE"
            java.lang.String r0 = r4.getString(r0)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L76
            X.CvJ r3 = new X.CvJ     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r3.<init>(r1, r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            boolean r0 = X.AbstractC4343Ctl.A00(r0)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 != 0) goto Le5
            java.lang.String r0 = "authenticationResponseJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r2 = X.C60O.A0i(r0)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Lc
        L76:
            java.lang.String r1 = "The device does not contain a restore credential."
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            androidx.credentials.exceptions.NoCredentialException r2 = new androidx.credentials.exceptions.NoCredentialException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r2.<init>(r0, r1)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Lc
        L80:
            java.lang.String r2 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r5.equals(r2)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L7
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_ID"
            java.lang.String r1 = r4.getString(r0)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.C7384Etj.A0X(r1)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.CvI r3 = new X.CvI     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            int r0 = r0.length()     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 > 0) goto Le5
            java.lang.String r0 = "password should not be empty"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            throw r0     // Catch: java.lang.Exception -> Lac androidx.credentials.internal.FrameworkClassParsingException -> Ld2
        Lac:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Lc
        Lb3:
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r5.equals(r0)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            if (r0 == 0) goto L7
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> Lca androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.C7384Etj.A0X(r0)     // Catch: java.lang.Exception -> Lca androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            X.Ct0 r3 = new X.Ct0     // Catch: java.lang.Exception -> Lca androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> Lca androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Ld1
        Lca:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> Ld2
            goto Lc
        Ld1:
            return r3
        Ld2:
            X.CvF r3 = new X.CvF
            r3.<init>(r5, r4)
            int r0 = r5.length()
            if (r0 > 0) goto Le5
            java.lang.String r0 = "type should not be empty"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC4300Cso.A01(android.os.Bundle, java.lang.String):X.Cso");
    }
}
