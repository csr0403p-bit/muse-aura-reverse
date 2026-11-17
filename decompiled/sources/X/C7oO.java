package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7oO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oO {
    public static final List<String> A01 = Collections.unmodifiableList(Arrays.asList("scheme", "authority", "path", "query"));
    public final Map<String, C7oP> A00;

    public static C7oO A00(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                HashMap map = new HashMap();
                Iterator<String> it = A01.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (jSONObject.has(strA0j)) {
                        map.put(strA0j, C7oP.A00(jSONObject.get(strA0j)));
                    }
                }
                if (!map.isEmpty()) {
                    return new C7oO(map);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public C7oO(Map<String, C7oP> map) {
        this.A00 = map;
    }
}
