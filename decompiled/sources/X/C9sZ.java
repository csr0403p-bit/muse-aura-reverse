package X;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.9sZ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sZ {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9sU;Lkotlinx/serialization/json/JsonElement;LX/9jG<+TT;>;)TT; */
    public static final Object A00(C9jG c9jG, C9sU c9sU, JsonElement jsonElement) {
        InterfaceC07829iw c08089sr;
        if (jsonElement instanceof JsonObject) {
            c08089sr = new C9sI(null, null, c9sU, (JsonObject) jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            c08089sr = new C08079sq(c9sU, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof JsonLiteral) && !jsonElement.equals(JsonNull.A00)) {
                throw new NoWhenBranchMatchedException();
            }
            c08089sr = new C08089sr(null, c9sU, jsonElement);
        }
        return c08089sr.A8b(c9jG);
    }
}
