package X;

import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;

/* renamed from: X.Eww, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7465Eww {
    public static final Uri A00;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.content.ContentResolver r9, android.net.Uri r10) {
        /*
            r6 = r10
            r3 = 1
            X.C7384Etj.A0Y(r10, r3)
            r5 = r9
            java.lang.String r2 = r9.getType(r10)
            java.lang.String r1 = r10.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            r10 = 0
            if (r0 == 0) goto La3
            if (r2 == 0) goto L23
            java.lang.String r0 = "video/"
            boolean r0 = r2.startsWith(r0)
            r4 = 1
            if (r0 == r3) goto L24
        L23:
            r4 = 0
        L24:
            java.lang.String r1 = "com.android.providers.media.documents"
            java.lang.String r0 = r6.getAuthority()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L84
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r6)
            java.lang.String r0 = "Required value was null."
            if (r2 == 0) goto L9e
            if (r4 == 0) goto L81
            android.net.Uri r6 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
        L3c:
            X.C7384Etj.A0V(r6)
            java.lang.String r1 = "_id"
            java.lang.String r0 = "=?"
            java.lang.String r8 = X.FGI.A0M(r1, r0)
            java.lang.String r0 = ":"
            java.util.List r2 = X.BV7.A14(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L7e
            java.util.ListIterator r1 = X.C3cG.A0n(r2)
        L57:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L7e
            int r0 = X.BV7.A0M(r1)
            if (r0 == 0) goto L57
            java.util.List r0 = X.BV8.A1A(r2, r1)
        L67:
            java.lang.String[] r0 = X.BV4.A1b(r0)
            r0 = r0[r3]
            java.lang.String[] r9 = new java.lang.String[]{r0}
        L71:
            java.lang.String r1 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)
            if (r2 == 0) goto Lb4
            goto L87
        L7e:
            X.AGi r0 = X.C0881AGi.A00
            goto L67
        L81:
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L3c
        L84:
            r8 = r10
            r9 = r10
            goto L71
        L87:
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L99
            if (r0 != r3) goto Lb4
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L99
            r0 = -1
            if (r1 == r0) goto Lb4
            java.lang.String r10 = r2.getString(r1)     // Catch: java.lang.Throwable -> L99
            goto Lb4
        L99:
            r0 = move-exception
            r2.close()
            throw r0
        L9e:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        La3:
            java.lang.String r1 = r6.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb9
            java.lang.String r0 = r6.getPath()
            return r0
        Lb4:
            if (r2 == 0) goto Lb9
            r2.close()
        Lb9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7465Eww.A00(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    static {
        Uri uriWithAppendedPath = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
        C7384Etj.A0U(uriWithAppendedPath);
        A00 = uriWithAppendedPath;
    }

    public static final boolean A01(Uri uri) {
        String scheme = uri != null ? uri.getScheme() : null;
        return "https".equals(scheme) || AuraDeeplinkHandlerActivity.HTTP.equals(scheme);
    }
}
