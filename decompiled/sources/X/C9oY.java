package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: X.9oY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9oY {
    public static final C9iZ A00 = C9e4.A00("kotlinx.serialization.json.JsonUnquotedLiteral", C07779iq.A01);

    public static final long A00(JsonPrimitive jsonPrimitive) {
        C7384Etj.A0Y(jsonPrimitive, 0);
        C9sW c9sW = new C9sW(jsonPrimitive.A00());
        long jA09 = c9sW.A09();
        if (c9sW.A05() == 10) {
            return jA09;
        }
        int i = ((C9sS) c9sW).A00;
        int i2 = i - 1;
        CharSequence charSequenceA0A = c9sW.A0A();
        c9sW.A0N(FGI.A0U("Expected input to contain a single valid number, but got '", (i == charSequenceA0A.length() || i2 < 0) ? "EOF" : String.valueOf(charSequenceA0A.charAt(i2)), "' after it"), "", i2);
        throw F60.createAndThrow();
    }

    public static final Boolean A01(JsonPrimitive jsonPrimitive) {
        C7384Etj.A0Y(jsonPrimitive, 0);
        String strA00 = jsonPrimitive.A00();
        C7384Etj.A0Y(strA00, 0);
        if (strA00.equalsIgnoreCase("true")) {
            return true;
        }
        return strA00.equalsIgnoreCase("false") ? false : null;
    }

    public static final Integer A02(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        C7384Etj.A0Y(jsonPrimitive, 0);
        try {
            lValueOf = Long.valueOf(A00(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        if (AuraImpressionTimeTracker.UNKNOWN_TIME > jLongValue || jLongValue > 2147483647L) {
            return null;
        }
        return Integer.valueOf((int) jLongValue);
    }

    public static final String A04(JsonPrimitive jsonPrimitive) {
        C7384Etj.A0Y(jsonPrimitive, 0);
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.A00();
    }

    public static final JsonObject A05(JsonElement jsonElement) {
        JsonObject jsonObject;
        C7384Etj.A0Y(jsonElement, 0);
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null) {
            return jsonObject;
        }
        A09("JsonObject", jsonElement);
        throw F60.createAndThrow();
    }

    public static final JsonPrimitive A08(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        C7384Etj.A0Y(jsonElement, 0);
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null) {
            return jsonPrimitive;
        }
        A09("JsonPrimitive", jsonElement);
        throw F60.createAndThrow();
    }

    public static final JsonPrimitive A06(Number number) {
        return number == null ? JsonNull.A00 : new JsonLiteral(number, null, false);
    }

    public static final JsonPrimitive A07(String str) {
        return str == null ? JsonNull.A00 : new JsonLiteral(str, null, true);
    }

    public static final void A09(String str, JsonElement jsonElement) {
        StringBuilder sbA0x = C60O.A0x("Element ");
        C8j5.A0o(sbA0x, jsonElement);
        throw C60O.A0i(C60P.A1M(" is not a ", str, sbA0x));
    }

    public static final Long A03(JsonPrimitive jsonPrimitive) {
        try {
            return Long.valueOf(A00(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }
}
