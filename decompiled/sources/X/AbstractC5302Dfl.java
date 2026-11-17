package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* renamed from: X.Dfl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5302Dfl {
    public static final Map<String, String> A00;
    public static final CopyOnWriteArraySet<Logger> A01 = new CopyOnWriteArraySet<>();

    static {
        String name;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Package r0 = C6859EbH.class.getPackage();
        if (r0 != null && (name = r0.getName()) != null) {
            linkedHashMapA0j.put(name, "OkHttp");
        }
        linkedHashMapA0j.put(C6859EbH.class.getName(), "okhttp.OkHttpClient");
        linkedHashMapA0j.put(EGW.class.getName(), "okhttp.Http2");
        linkedHashMapA0j.put(C6920EcT.class.getName(), "okhttp.TaskRunner");
        linkedHashMapA0j.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        A00 = AGH.A0A(linkedHashMapA0j);
    }
}
