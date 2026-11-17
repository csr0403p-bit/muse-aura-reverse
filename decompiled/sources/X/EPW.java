package X;

import android.database.Cursor;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EPW implements EQ5 {
    @Override // X.EQ5
    public final EPY AhG(Cursor cursor, EPi ePi) {
        AnonymousClass003.A0u(cursor, ePi);
        int columnIndex = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex2 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex3 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new TransformerException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            throw null;
        }
        int columnIndex4 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex5 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        return new EPY(string, string2, "BARCELONA", new C7144EhA(cursor, columnIndex3, columnIndex4, columnIndex5), EPM.A0M, ePi);
    }

    @Override // X.EQ5
    public final EPY AhF(Cursor cursor, EPM epm, EPi ePi) {
        AnonymousClass003.A0v(cursor, ePi);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObjectA19 = BV4.A19(string);
            String string2 = jSONObjectA19.has("userId") ? jSONObjectA19.getString("userId") : "";
            C7384Etj.A0X(string2);
            String string3 = jSONObjectA19.has("accessToken") ? jSONObjectA19.getString("accessToken") : "";
            C7384Etj.A0X(string3);
            return new EPY(string2, string3, "BARCELONA", new C7144EhA(jSONObjectA19), EPM.A0M, ePi);
        } catch (JSONException e) {
            throw new TransformerException(e);
        }
    }

    @Override // X.EQ5
    public final C6683EPv AhH(Cursor cursor, EnumC7407Eul enumC7407Eul) {
        throw C8j3.A18("Not implemented");
    }
}
