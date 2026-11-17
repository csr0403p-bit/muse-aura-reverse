package X;

import android.text.TextUtils;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7m4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7m4<T> {
    public static final C06867ly A04 = new C06867ly(Collections.EMPTY_LIST, C3cG.A0h(), false);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final JSONObject A01() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A03;
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("scheme", str);
            }
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("authority", str2);
            }
            String str3 = this.A00;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("path", str3);
            }
            String str4 = this.A01;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("query", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C7m4(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }

    public static final String A00(C7m4 c7m4) {
        StringBuilder sbA0w = C60O.A0w();
        String str = c7m4.A03;
        if (!TextUtils.isEmpty(str)) {
            sbA0w.append(str);
            sbA0w.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        }
        String str2 = c7m4.A02;
        if (!TextUtils.isEmpty(str2)) {
            sbA0w.append("//");
            sbA0w.append(str2);
        }
        String str3 = c7m4.A00;
        if (!TextUtils.isEmpty(str3)) {
            sbA0w.append(str3);
        }
        String str4 = c7m4.A01;
        if (!TextUtils.isEmpty(str4)) {
            sbA0w.append('?');
            sbA0w.append(str4);
        }
        return sbA0w.toString();
    }
}
