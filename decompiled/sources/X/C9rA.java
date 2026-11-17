package X;

import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: X.9rA, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9rA {
    public static final CharSequence A00(CharSequence charSequence, int i) {
        StringBuilder sbA0g;
        C7384Etj.A0Y(charSequence, 0);
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            sbA0g = C60O.A0x(".....");
            sbA0g.append(charSequence.subSequence(length, charSequence.length()).toString());
        } else {
            int i2 = i - 30;
            int i3 = i + 30;
            String str = i2 <= 0 ? "" : ".....";
            String str2 = i3 >= charSequence.length() ? "" : ".....";
            sbA0g = C3cG.A0g(str);
            if (i2 < 0) {
                i2 = 0;
            }
            int length2 = charSequence.length();
            if (i3 > length2) {
                i3 = length2;
            }
            sbA0g.append(charSequence.subSequence(i2, i3).toString());
            sbA0g.append(str2);
        }
        return sbA0g.toString();
    }

    public static final JsonDecodingException A02(CharSequence charSequence, String str, int i) {
        C7384Etj.A0Y(charSequence, 2);
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("\nJSON input: ");
        String strA14 = C8j3.A14(A00(charSequence, i), sbA0g);
        if (i >= 0) {
            strA14 = FGI.A0W("Unexpected JSON token at offset ", ": ", strA14, i);
        }
        return new JsonDecodingException(strA14);
    }

    public static String A01(CharSequence charSequence, StringBuilder sb) {
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object) A00(charSequence, -1));
        return sb.toString();
    }

    public static final JsonEncodingException A04(C9iZ c9iZ) {
        StringBuilder sbA0x = C60O.A0x("Value of type '");
        sbA0x.append(c9iZ.AKP());
        sbA0x.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sbA0x.append(c9iZ.AGs());
        return new JsonEncodingException(AnonymousClass001.A0v("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", sbA0x));
    }

    public static final void A05(String str, C9sS c9sS) {
        c9sS.A0N(FGI.A0M("Trailing comma before the end of JSON ", str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.", c9sS.A00 - 1);
        throw F60.createAndThrow();
    }

    public static JsonDecodingException A03(Object obj, String str) {
        return A02(obj.toString(), str, -1);
    }
}
