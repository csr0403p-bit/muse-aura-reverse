package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CFI {
    public static final CFI A00 = new CFI();

    private final void A00(JsonReader jsonReader, C3340CFk c3340CFk, String str) throws IOException {
        Object objValueOf;
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NUMBER) {
                objValueOf = Double.valueOf(jsonReader.nextDouble());
            } else if (jsonTokenPeek == JsonToken.STRING) {
                objValueOf = jsonReader.nextString();
            } else if (jsonTokenPeek == JsonToken.BOOLEAN) {
                objValueOf = Boolean.valueOf(jsonReader.nextBoolean());
            } else if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
                jsonReader.beginObject();
                C3341CFl c3341CFlA03 = c3340CFk.A01.A03();
                c3340CFk.A0C(c3341CFlA03);
                A01(jsonReader, c3341CFlA03, this);
            } else if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                C3340CFk c3340CFkA02 = c3340CFk.A01.A02();
                c3340CFk.A0C(c3340CFkA02);
                A00(jsonReader, c3340CFkA02, str);
            } else {
                jsonReader.skipValue();
                Object[] objArr = {str, jsonTokenPeek.name()};
                if (CFL.A01()) {
                    CFK.A07(CFI.class.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Ignoring extra array field in %s, unsupported type %s", objArr));
                }
            }
            C3340CFk.A00(c3340CFk, objValueOf);
        }
        jsonReader.endArray();
    }

    public static final void A01(JsonReader jsonReader, C3341CFl c3341CFl, CFI cfi) throws IOException {
        Object objValueOf;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NUMBER) {
                objValueOf = Double.valueOf(jsonReader.nextDouble());
            } else if (jsonTokenPeek == JsonToken.STRING) {
                objValueOf = jsonReader.nextString();
            } else if (jsonTokenPeek == JsonToken.BOOLEAN) {
                objValueOf = Boolean.valueOf(jsonReader.nextBoolean());
            } else if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
                jsonReader.beginObject();
                C7384Etj.A0X(strNextName);
                A01(jsonReader, C3339CFj.A01(c3341CFl, strNextName), cfi);
            } else if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                C7384Etj.A0X(strNextName);
                cfi.A00(jsonReader, C3339CFj.A00(c3341CFl, strNextName), strNextName);
            } else {
                jsonReader.skipValue();
            }
            C3341CFl.A00(c3341CFl, objValueOf, strNextName);
        }
        jsonReader.endObject();
    }
}
