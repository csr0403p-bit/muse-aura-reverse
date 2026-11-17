package X;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.9r8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9r8 extends C9sM {
    public boolean A00;
    public String A01;

    @Override // X.C9sM, X.C9sN
    public final void A07(String str, JsonElement jsonElement) {
        C9iZ c9iZ;
        C7384Etj.A0Y(jsonElement, 1);
        if (!this.A00) {
            Map<String, JsonElement> map = ((C9sM) this).A00;
            String str2 = this.A01;
            if (str2 == null) {
                C7384Etj.A0b("tag");
                throw F60.createAndThrow();
            }
            map.put(str2, jsonElement);
            this.A00 = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.A01 = ((JsonPrimitive) jsonElement).A00();
            this.A00 = false;
            return;
        }
        if (jsonElement instanceof JsonObject) {
            c9iZ = JsonObjectSerializer.A00;
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            c9iZ = JsonArraySerializer.A00;
        }
        throw C9rA.A04(c9iZ);
    }
}
