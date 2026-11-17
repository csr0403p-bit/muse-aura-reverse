package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public abstract class EJB {
    public static final void A00(String str, int i) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(FGI.A0H("Error code: ", i));
        if (str != null) {
            sbA0w.append(FGI.A0M(", message: ", str));
        }
        throw new SQLException(sbA0w.toString());
    }
}
