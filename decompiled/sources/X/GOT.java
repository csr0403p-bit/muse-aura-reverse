package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GOT {
    public final ArrayList A00;

    public GOT(JSONArray jSONArray) {
        ArrayList arrayListA0h = C3cG.A0h();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayListA0h.add(new GOS(jSONObjectOptJSONObject));
                }
            }
        }
        this.A00 = arrayListA0h;
    }
}
