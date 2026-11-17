package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EPa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6679EPa implements EQ5 {
    @Override // X.EQ5
    public final EPY AhF(Cursor cursor, EPM epm, EPi ePi) {
        throw new TransformerException("LiteProvider not used in Instagram Lite.");
    }

    @Override // X.EQ5
    public final C6683EPv AhH(Cursor cursor, EnumC7407Eul enumC7407Eul) {
        throw C8j3.A18("Not implemented");
    }

    @Override // X.EQ5
    public final EPY AhG(Cursor cursor, EPi ePi) {
        try {
            String string = cursor.getString(C60P.A1Y(cursor, ePi) ? 1 : 0);
            if (string == null || string.length() == 0) {
                return null;
            }
            JSONObject jSONObjectA19 = BV4.A19(string);
            return new EPY(C7384Etj.A0L(jSONObjectA19.getJSONObject("profile"), ErrorReportingConstants.USER_ID_KEY), C7384Etj.A0L(jSONObjectA19, NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM), "INSTAGRAM_LITE", new C7144EhA(10), EPM.A0E, ePi);
        } catch (JSONException e) {
            throw new TransformerException(e);
        }
    }
}
