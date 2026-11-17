package X;

import android.net.Uri;
import android.util.LruCache;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class B15 {
    public static G0U<? super String, ? extends Uri> A00 = new BUU(20);
    public static final F0C A02 = AbstractC5321DgF.A02(C79.A00, new BUV(4));
    public static final B1C A01 = new B1C("emptySource()");
    public static final B1C A03 = new B1C("forUri(null)");

    public static final Ejq A00(Uri uri) {
        return uri == null ? A03 : A02(uri, null);
    }

    public static final Ejq A01(String str) {
        LruCache lruCache;
        Uri uri;
        Uri uriInvoke = null;
        if (str != null) {
            F0C f0c = A02;
            LruCache lruCache2 = (LruCache) f0c.getValue();
            if (lruCache2 != null && (uri = (Uri) lruCache2.get(str)) != null) {
                return A02(uri, null);
            }
            uriInvoke = A00.invoke(str);
            if (uriInvoke != null && (lruCache = (LruCache) f0c.getValue()) != null) {
                lruCache.put(str, uriInvoke);
            }
        }
        return A00(uriInvoke);
    }

    public static final Ejq A02(Uri uri, Map<String, ? extends Object> map) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (map != null) {
            c0924AIaA0u.putAll(map);
        }
        c0924AIaA0u.put("uri_source", uri);
        return new C7506EyQ(AIW.A0K(c0924AIaA0u), uri);
    }
}
