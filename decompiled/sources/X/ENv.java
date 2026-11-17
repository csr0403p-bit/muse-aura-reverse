package X;

import android.database.Cursor;
import java.util.Iterator;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public final class ENv implements EO7 {
    public final EP0 A00;

    @Override // X.EO7
    public final ENw AhJ(Cursor cursor, EP1 ep1) throws FXAccessException {
        Object next;
        C7384Etj.A0Y(cursor, 0);
        String strA00 = EO2.A00(cursor, "credential_source");
        String strA002 = EO2.A00(cursor, "user_data_json");
        int columnIndex = cursor.getColumnIndex("generic_data_json");
        String string = (columnIndex == -1 || cursor.isNull(columnIndex)) ? null : cursor.getString(columnIndex);
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        String string2 = (columnIndex2 == -1 || cursor.isNull(columnIndex2)) ? null : cursor.getString(columnIndex2);
        Iterator<E> it = EP1.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((EP1) next).name().equals(strA00)) {
                break;
            }
        }
        EP1 ep12 = (EP1) next;
        if (ep12 != null) {
            return ENt.A00.A01(strA002, string, string2, this.A00, ep12, null);
        }
        throw new FXAccessException("Invalid credential_source value in cursor", ENz.A08);
    }

    public ENv(EP0 ep0) {
        this.A00 = ep0;
    }
}
