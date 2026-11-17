package X;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6x1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6x1 {
    public static final Map<String, String> A01;
    public final List<C6x0> A00;

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(CachingHatchHttpClientKt.CACHE_CONTROL_HEADER, "private, max-age=31536000")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        key.getClass();
        Object value = entry.getValue();
        value.getClass();
        if (map.put(key, value) != null) {
            throw C60O.A0i(AnonymousClass007.A0a("duplicate key: ", key));
        }
        A01 = Collections.unmodifiableMap(map);
    }

    public final WebResourceResponse A00(Uri uri) {
        C6x2 c6x2;
        WebResourceResponse webResourceResponseHandle;
        for (C6x0 c6x0 : this.A00) {
            if (!uri.getScheme().equals(AuraDeeplinkHandlerActivity.HTTP) && (uri.getScheme().equals(AuraDeeplinkHandlerActivity.HTTP) || uri.getScheme().equals("https"))) {
                if (uri.getAuthority().equals(c6x0.A01)) {
                    String path = uri.getPath();
                    String str = c6x0.A02;
                    if (path.startsWith(str) && (c6x2 = c6x0.A00) != null && (webResourceResponseHandle = c6x2.handle(uri.getPath().replaceFirst(str, ""))) != null) {
                        return webResourceResponseHandle;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public C6x1(List<C6x0> list) {
        this.A00 = list;
    }
}
