package X;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.crudolib.json.JsonParserIOException;
import com.facebook.crudolib.netfb.FbApiException;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.CEw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3331CEw {
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public final void A00() {
        String str;
        if (this.A0E) {
            throw new FbApiException(EnumC2377BWn.API_EC_DOMAIN, this.A08, this.A07, this.A00);
        }
        if (this.A0C) {
            Integer num = this.A02;
            throw new FbApiException(EnumC2377BWn.API_EC_DOMAIN, this.A03, null, num == null ? 0 : num.intValue());
        }
        if (this.A0D) {
            if (this.A0F && (str = this.A0A) != null) {
                throw new FbApiException(EnumC2377BWn.GRAPHQL_KERROR_DOMAIN, str, null, this.A01);
            }
            String str2 = this.A0B;
            if (str2 == null) {
                throw new FbApiException(EnumC2377BWn.API_EC_DOMAIN, null, null, 1);
            }
            throw new FbApiException(EnumC2377BWn.API_EC_DOMAIN, str2, this.A09, this.A05, this.A04, this.A06, this.A01);
        }
    }

    public final boolean A01(JsonReader jsonReader, String str) throws IOException {
        String strA00;
        Integer numValueOf;
        if (!this.A0D) {
            if ("error_code".equals(str)) {
                int iNextInt = 1;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    iNextInt = jsonReader.nextInt();
                }
                this.A00 = iNextInt;
                this.A0E = true;
            } else if ("error_msg".equals(str)) {
                this.A08 = CDJ.A00(jsonReader);
            } else if ("error_data".equals(str)) {
                this.A07 = CDJ.A00(jsonReader);
            } else if ("error".equals(str)) {
                if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    try {
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(jsonReader.nextInt());
                        }
                        this.A02 = numValueOf;
                    } catch (NumberFormatException e) {
                        CFK.A08("FbApiErrorParser", "failed to parse api error response", e);
                        this.A02 = 0;
                    }
                    this.A0C = true;
                } else {
                    this.A0D = true;
                    jsonReader.beginObject();
                }
            } else {
                if (!C60N.A00(78).equals(str)) {
                    return false;
                }
                this.A03 = CDJ.A00(jsonReader);
            }
            return true;
        }
        if (AuraDeeplinkRouteMapper.CODE_PARAM.equals(str)) {
            int iNextInt2 = 1;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                iNextInt2 = jsonReader.nextInt();
            }
            this.A01 = iNextInt2;
            this.A0F = true;
            return true;
        }
        if (HatchWebPageParserKt.DESCRIPTION.equals(str)) {
            this.A0A = CDJ.A00(jsonReader);
            return true;
        }
        if (ReplyAttributionSerializer.TYPE_MESSAGE.equals(str)) {
            this.A0B = CDJ.A00(jsonReader);
            return true;
        }
        if (!"error_data".equals(str)) {
            if ("error_user_title".equals(str)) {
                this.A05 = CDJ.A00(jsonReader);
                return true;
            }
            if ("error_user_msg".equals(str)) {
                this.A04 = CDJ.A00(jsonReader);
                return true;
            }
            if (!"fbtrace_id".equals(str)) {
                return false;
            }
            this.A06 = CDJ.A00(jsonReader);
            return true;
        }
        JsonToken jsonTokenPeek = jsonReader.peek();
        JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
        if (jsonTokenPeek == jsonToken) {
            JsonToken jsonTokenPeek2 = jsonReader.peek();
            if (jsonTokenPeek2 == JsonToken.NULL) {
                jsonReader.nextNull();
                strA00 = null;
            } else {
                if (jsonTokenPeek2 != jsonToken) {
                    throw new JsonParserIOException(AnonymousClass006.A0y(jsonTokenPeek2, ", got token: ", C3cG.A0f(jsonToken, "Expected token: ")));
                }
                StringWriter stringWriter = new StringWriter();
                CDJ.A01(jsonReader, new JsonWriter(stringWriter), CDJ.A00);
                strA00 = stringWriter.toString();
            }
        } else {
            strA00 = CDJ.A00(jsonReader);
        }
        this.A09 = strA00;
        return true;
    }
}
