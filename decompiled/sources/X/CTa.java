package X;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.zzam;

/* loaded from: classes5.dex */
public abstract class CTa<T> {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final CSE<T> A03 = new CSE<>();

    public final void A00(zzam zzamVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzamVar);
            StringBuilder sbA0r = BV5.A0r(strValueOf2, BV5.A04(strValueOf) + 14);
            sbA0r.append("Failing ");
            sbA0r.append(strValueOf);
            BV8.A1P(sbA0r, " with ", strValueOf2, "MessengerIpcClient");
        }
        this.A03.A00.A0F(zzamVar);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        boolean z = !(this instanceof C3546CTf);
        StringBuilder sbA0p = BV4.A0p(55);
        sbA0p.append("Request { what=");
        sbA0p.append(i);
        sbA0p.append(" id=");
        sbA0p.append(i2);
        sbA0p.append(" oneWay=");
        sbA0p.append(z);
        return BV7.A11(sbA0p);
    }

    public CTa(Bundle bundle, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }
}
