package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* loaded from: classes5.dex */
public final class ECx {
    public final int A00;
    public final /* synthetic */ EIO A01;

    public ECx(EIO eio, int i) {
        this.A01 = eio;
        this.A00 = i;
    }

    public static final void A00(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean zA1R = BV7.A1R(C7384Etj.A00(str.charAt(i2), 32));
                if (z) {
                    if (!zA1R) {
                        break;
                    } else {
                        length--;
                    }
                } else if (zA1R) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", FGI.A0M("deleting the database file: ", str));
                try {
                    SQLiteDatabase.deleteDatabase(BV4.A0G(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }
}
