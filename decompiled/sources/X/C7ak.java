package X;

import java.util.Map;

/* renamed from: X.7ak, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7ak {
    public static final Map<String, String> A00 = AnonymousClass007.A0d("glb", "model/gltf-binary", C3cG.A0r("mkv", "video/x-matroska"));

    public static final String A00(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length() - 1;
        int iA09 = C7BY.A09(str, '.', length);
        if (iA09 < 0 || iA09 == length) {
            return null;
        }
        String strA0g = C60Q.A0g(str.substring(iA09 + 1));
        String strA0p = C60O.A0p(strA0g, C7aj.A01);
        if (strA0p != null) {
            return strA0p;
        }
        String mimeTypeFromExtension = C7aj.A00.getMimeTypeFromExtension(strA0g);
        return mimeTypeFromExtension == null ? C60O.A0p(strA0g, A00) : mimeTypeFromExtension;
    }
}
