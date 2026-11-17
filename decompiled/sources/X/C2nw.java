package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.2nw, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2nw {
    public final Map<String, JsonElement> A00 = new LinkedHashMap();

    public final void A01(String str, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(jsonElement, 1);
        this.A00.put(str, jsonElement);
    }

    public final JsonObject A00() {
        return new JsonObject(this.A00);
    }
}
