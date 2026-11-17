package X;

import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class CZI {
    public final C8ee<?> A00;

    public CZI(C8ee<?> c8ee) {
        C7384Etj.A0Y(c8ee, 0);
        this.A00 = c8ee;
    }

    public static final void A01(String str, String str2, CZI czi) {
        Eu1 eu1AcquireEvent = czi.A00.acquireEvent("attribution_sdk_debug");
        if (eu1AcquireEvent.isSampled()) {
            eu1AcquireEvent.A3y("log_level", str2);
            eu1AcquireEvent.A3y(ReplyAttributionSerializer.TYPE_MESSAGE, str);
            eu1AcquireEvent.APu();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/util/List<+LX/CZ9;>;Ljava/lang/Throwable;)Ljava/lang/String; */
    public static final String A00(String str, String str2, Throwable th, List list) throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        jSONObjectA18.put("event_name", str);
        if (str2 != null) {
            jSONObjectA18.put(ReplyAttributionSerializer.TYPE_MESSAGE, str2);
        }
        if (list != null) {
            jSONObjectA18.put("event_types", list);
        }
        if (th != null) {
            jSONObjectA18.put("exception", th.toString());
        }
        return C60O.A0o(jSONObjectA18);
    }
}
