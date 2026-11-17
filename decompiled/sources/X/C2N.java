package X;

import android.os.Build;
import android.os.SystemProperties;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class C2N {
    public static final Map<String, String> A00 = new C7144EhA(0);

    public static JSONObject A00() {
        Map<Integer, Integer> mapA00;
        JSONObject jSONObjectA18 = BV4.A18();
        if (Build.VERSION.SDK_INT >= 31) {
            mapA00 = C2O.A00();
        } else {
            try {
                mapA00 = (Map) BV5.A0d("getAllExtensionVersions", SdkExtensions.class);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C2Q.A00().AT9("SdkExtVer", e, null);
                mapA00 = null;
            }
        }
        if (mapA00 != null) {
            Iterator itA0n = AnonymousClass002.A0n(mapA00);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                try {
                    jSONObjectA18.put(entry.getKey().toString(), entry.getValue().toString());
                } catch (JSONException e2) {
                    C2Q.A00().AT9("SdkExtVer", e2, null);
                }
            }
        }
        if (jSONObjectA18.length() == 0) {
            jSONObjectA18 = BV4.A18();
            try {
                Iterator itA0n2 = AnonymousClass002.A0n(A00);
                while (itA0n2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) itA0n2.next();
                    String str = SystemProperties.get((String) entry2.getValue(), "");
                    if (!TextUtils.isEmpty(str)) {
                        jSONObjectA18.put((String) entry2.getKey(), str);
                    }
                }
            } catch (JSONException e3) {
                C2Q.A00().AT9("SdkExtVerSysProp", e3, null);
            }
        }
        return jSONObjectA18;
    }
}
