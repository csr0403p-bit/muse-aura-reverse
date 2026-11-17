package X;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public abstract class CXS {
    public static boolean A00(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        return TextUtils.isEmpty(uri.getScheme()) || "file".equals(uri.getScheme()) || "content".equals(uri.getScheme()) || "android.resource".equals(uri.getScheme());
    }
}
