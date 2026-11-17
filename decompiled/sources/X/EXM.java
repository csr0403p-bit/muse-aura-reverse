package X;

import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.Writer;
import java.util.List;

/* loaded from: classes5.dex */
public final class EXM extends C6733EXr {
    public JsonElement A00;
    public String A01;
    public final List<JsonElement> A02;
    public static final Writer A04 = new EXN();
    public static final JsonPrimitive A03 = new JsonPrimitive(LocalBrowserNodeHandler.CLOSED);

    public EXM() {
        super(A04);
        this.A02 = C3cG.A0h();
        this.A00 = C6714EWu.A00;
    }

    public static void A00(JsonElement jsonElement, EXM exm) {
        if (exm.A01 != null) {
            if (!(jsonElement instanceof C6714EWu) || exm.A04) {
                ((JsonObject) ((JsonElement) BV5.A0e(exm.A02))).add(exm.A01, jsonElement);
            }
            exm.A01 = null;
            return;
        }
        List<JsonElement> list = exm.A02;
        if (list.isEmpty()) {
            exm.A00 = jsonElement;
            return;
        }
        JsonElement jsonElement2 = (JsonElement) BV5.A0e(list);
        if (!(jsonElement2 instanceof JsonArray)) {
            throw BV4.A0T();
        }
        ((JsonArray) jsonElement2).add(jsonElement);
    }
}
