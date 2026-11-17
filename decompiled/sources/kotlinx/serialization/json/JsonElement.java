package kotlinx.serialization.json;

import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonElementSerializer.class)
/* loaded from: classes2.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final C9hr<JsonElement> serializer() {
            return JsonElementSerializer.A00;
        }
    }
}
