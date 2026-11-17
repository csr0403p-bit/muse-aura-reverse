package X;

import android.webkit.MimeTypeMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7aj, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7aj {
    public static final MimeTypeMap A00;
    public static final Map<String, String> A01;
    public static final Map<String, String> A02;

    static {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        C7384Etj.A0U(singleton);
        A00 = singleton;
        HashMap map = new HashMap(2);
        map.put("image/heif", "heif");
        map.put("image/heic", "heic");
        A02 = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap(2);
        map2.put("heif", "image/heif");
        map2.put("heic", "image/heic");
        A01 = Collections.unmodifiableMap(map2);
    }
}
