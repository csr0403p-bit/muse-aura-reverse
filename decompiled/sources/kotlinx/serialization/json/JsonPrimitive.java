package kotlinx.serialization.json;

import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonPrimitiveSerializer.class)
/* loaded from: classes3.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final C9hr<JsonPrimitive> serializer() {
            return JsonPrimitiveSerializer.A01;
        }
    }

    public abstract String A00();

    public abstract boolean A01();

    public String toString() {
        return A00();
    }
}
