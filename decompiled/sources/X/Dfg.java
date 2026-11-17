package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes5.dex */
public final class Dfg {
    public final SharedPreferences.Editor A00;
    public final String A01;

    public Dfg(Context context, String str) {
        this.A01 = str;
        this.A00 = BV4.A07(context.getApplicationContext(), "hpke_key_storage").edit();
    }
}
