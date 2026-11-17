package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import libraries.accessv2.src.model.FXAccessException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ENy implements EO7 {
    public final EP0 A00;

    @Override // X.EO7
    public final ENw AhJ(Cursor cursor, EP1 ep1) throws JSONException, FXAccessException {
        C7384Etj.A0Y(cursor, 0);
        JSONObject jSONObjectA19 = BV4.A19(EO2.A00(cursor, BrowserOperationCatalogKt.VALUE));
        String string = jSONObjectA19.getJSONObject("profile").getString(ErrorReportingConstants.USER_ID_KEY);
        String string2 = jSONObjectA19.getString(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
        if (ep1 == null) {
            throw new FXAccessException("credentialSource is required for legacy lite transformers", ENz.A09);
        }
        C7384Etj.A0X(string);
        C7384Etj.A0X(string2);
        return new ENw(null, string, string2, this.A00, ep1, null, null);
    }

    public ENy(EP0 ep0) {
        this.A00 = ep0;
    }
}
