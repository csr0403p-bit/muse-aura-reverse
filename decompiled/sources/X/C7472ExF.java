package X;

import android.webkit.MimeTypeMap;
import java.io.File;

/* renamed from: X.ExF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7472ExF {
    public final File A00;
    public final String A01;
    public final String A02;

    public C7472ExF(File file, String str) {
        int iA0B;
        String str2 = "application/octet-stream";
        if (str != null && (iA0B = BV6.A0B(str)) >= 0) {
            String strA0g = BV4.A0g(iA0B, str);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strA0g);
            if (mimeTypeFromExtension != null) {
                str2 = mimeTypeFromExtension;
            } else if ("json".equalsIgnoreCase(strA0g)) {
                mimeTypeFromExtension = "application/json";
                str2 = mimeTypeFromExtension;
            }
        }
        this.A01 = str2;
        this.A00 = file;
        this.A02 = str;
    }
}
