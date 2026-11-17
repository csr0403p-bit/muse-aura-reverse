package X;

import android.database.Cursor;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class EO2 {
    public static String A00(Cursor cursor, String str) throws FXAccessException {
        String string;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex) || (string = cursor.getString(columnIndex)) == null) {
            throw new FXAccessException(FGI.A0U("Required column ", str, " is absent or null in cursor"), ENz.A09);
        }
        return string;
    }
}
