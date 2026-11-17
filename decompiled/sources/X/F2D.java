package X;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class F2D implements F2R {
    public final String A00;
    public final HashMap<String, File> A01 = BV4.A0u();

    public static boolean A00(String str, String str2) {
        HashMap<String, F2R> map = FileProvider.A05;
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            if (str.charAt(i) == '/') {
                str = BV4.A0j(str, i);
            }
        }
        int length2 = str2.length();
        if (length2 > 0) {
            int i2 = length2 - 1;
            if (str2.charAt(i2) == '/') {
                str2 = BV4.A0j(str2, i2);
            }
        }
        return str.startsWith(FGI.A0E(str2, '/'));
    }

    public F2D(String str) {
        this.A00 = str;
    }

    @Override // X.F2R
    public final File AFc(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            throw BV5.A0O(uri, "Unable to find path from root: ");
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(BV4.A0g(iIndexOf, encodedPath));
        File file = this.A01.get(strDecode);
        if (file == null) {
            throw BV5.A0O(uri, "Unable to find configured root for ");
        }
        File fileA0O = C3cG.A0O(file, strDecode2);
        try {
            File canonicalFile = fileA0O.getCanonicalFile();
            if (A00(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw BV5.A0O(fileA0O, "Failed to resolve canonical path for ");
        }
    }
}
