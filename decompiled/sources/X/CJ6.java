package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CJ6 {
    public static CJ6 A08;
    public CJ7 A00;
    public final Context A01;
    public final IntentFilter A02;
    public final CJQ A03;
    public final Set A04;
    public final Handler A05;
    public final CJ2 A06;
    public final Set A07;

    public final synchronized void A00(CIz cIz) {
        CJ7 cj7;
        this.A03.A03("registerListener", BV4.A1W());
        if (cIz == null) {
            throw BV4.A0a("Registered Play Core listener should not be null.");
        }
        Set set = this.A04;
        set.add(cIz);
        if (!set.isEmpty() && this.A00 == null) {
            CJ7 cj72 = new CJ7(this);
            this.A00 = cj72;
            int i = Build.VERSION.SDK_INT;
            Context context = this.A01;
            IntentFilter intentFilter = this.A02;
            if (i >= 33) {
                context.registerReceiver(cj72, intentFilter, 2);
            } else {
                context.registerReceiver(cj72, intentFilter);
            }
        }
        if (set.isEmpty() && (cj7 = this.A00) != null) {
            this.A01.unregisterReceiver(cj7);
            this.A00 = null;
        }
    }

    public final synchronized void A01(CJN cjn) {
        Iterator it = new LinkedHashSet(this.A07).iterator();
        while (it.hasNext()) {
            ((InterfaceC3390CIx) it.next()).onStateUpdate(cjn);
        }
        Iterator it2 = BV4.A0x(this.A04).iterator();
        while (it2.hasNext()) {
            ((CIz) it2.next()).onStateUpdate(cjn);
        }
    }

    public CJ6(Context context, CJ2 cj2) {
        CJQ cjq = new CJQ("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.A04 = C60O.A13();
        this.A00 = null;
        this.A03 = cjq;
        this.A02 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
        this.A05 = C60O.A02();
        this.A07 = C3cG.A0k();
        this.A06 = cj2;
    }
}
