package X;

import android.content.Context;
import java.util.Set;

/* loaded from: classes5.dex */
public final class F37 {
    public Set<String> A00;
    public final Context A01;

    public F37(Context context) {
        C7384Etj.A0Y(context, 0);
        this.A00 = C60O.A13();
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
    }
}
