package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.crudolib.json.JsonParserIOException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* renamed from: X.CGj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3353CGj implements CGg {
    public final /* synthetic */ C4031CkX A00;
    public final /* synthetic */ C3354CGm A01;

    @Override // X.CGg
    public final void onFailure(IOException iOException) {
        C7384Etj.A0Y(iOException, 0);
        Ck7.A05.set(false);
    }

    public C3353CGj(C4031CkX c4031CkX, C3354CGm c3354CGm) {
        this.A01 = c3354CGm;
        this.A00 = c4031CkX;
    }

    @Override // X.CGg
    public final void onSuccess(InterfaceC3352CGi interfaceC3352CGi) throws IOException {
        String str;
        C3354CGm c3354CGm = this.A01;
        JsonReader jsonReader = new JsonReader(new InputStreamReader(((C3351CGh) interfaceC3352CGi).A00.A01, StandardCharsets.UTF_8));
        try {
            jsonReader.beginObject();
            C3331CEw c3331CEw = new C3331CEw();
            String strA00 = null;
            long jNextLong = -1;
            int iNextInt = -1;
            while (jsonReader.hasNext() && jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                if ("key_id".equals(strNextName)) {
                    iNextInt = -1;
                    if (jsonReader.peek() != JsonToken.NULL) {
                        iNextInt = jsonReader.nextInt();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if ("public_key".equals(strNextName)) {
                    strA00 = CDJ.A00(jsonReader);
                } else if ("seconds_to_live".equals(strNextName)) {
                    jNextLong = -1;
                    if (jsonReader.peek() != JsonToken.NULL) {
                        jNextLong = jsonReader.nextLong();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (!c3331CEw.A01(jsonReader, strNextName)) {
                    jsonReader.skipValue();
                }
            }
            c3331CEw.A00();
            jsonReader.endObject();
            if (iNextInt == -1 || strA00 == null || jNextLong == -1) {
                throw BV4.A0K("Missing key fields in response.");
            }
            CGk cGk = new CGk(iNextInt, strA00, jNextLong);
            Ck7 ck7 = c3354CGm.A00;
            int i = cGk.A00;
            if (i >= 0 && (str = cGk.A03) != null && str.length() != 0) {
                BzK bzKA02 = BzK.A02(ck7.A01.A00);
                bzKA02.AYo("encryption_key_id", i);
                bzKA02.AYr("encryption_key_public_key", str);
                bzKA02.AYp("encryption_key_expiration_timestamp_ms", cGk.A01);
                bzKA02.AYr("encryption_key_state", 1 - cGk.A02.intValue() != 0 ? "ENCRYPTION_WITH_TAGGING" : "PLAINTEXT_WITH_TAGGING");
                bzKA02.A0B(0);
            }
            Ck7.A05.set(false);
        } catch (IllegalStateException e) {
            throw new JsonParserIOException(e);
        }
    }
}
