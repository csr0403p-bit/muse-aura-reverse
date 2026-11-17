package kotlinx.serialization.json;

import X.C9hr;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonNullSerializer.class)
/* loaded from: classes4.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull A00 = new JsonNull();

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String A00() {
        return HatchCcvLoggingKt.NO_POSTAL_FIELD;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean A01() {
        return false;
    }

    public final C9hr<JsonNull> serializer() {
        return JsonNullSerializer.A01;
    }
}
