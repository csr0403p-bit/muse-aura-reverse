package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CK5 {
    public CK4 A00;
    public final Context A01;
    public final IntentFilter A02;
    public final CJT A03;
    public final Set A04;

    public CK5(Context context) {
        CJT cjt = new CJT("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.A04 = C60O.A13();
        this.A00 = null;
        this.A03 = cjt;
        this.A02 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
    }

    public static final void A00(CK5 ck5) {
        CK4 ck4;
        Set set = ck5.A04;
        if (!set.isEmpty() && ck5.A00 == null) {
            CK4 ck42 = new CK4(ck5);
            ck5.A00 = ck42;
            int i = Build.VERSION.SDK_INT;
            Context context = ck5.A01;
            IntentFilter intentFilter = ck5.A02;
            if (i >= 33) {
                context.registerReceiver(ck42, intentFilter, 2);
            } else {
                context.registerReceiver(ck42, intentFilter);
            }
        }
        if (!set.isEmpty() || (ck4 = ck5.A00) == null) {
            return;
        }
        ck5.A01.unregisterReceiver(ck4);
        ck5.A00 = null;
    }
}
