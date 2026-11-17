package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C5S implements InterfaceC3235C4s, BWf {
    public static C5S A03;
    public final C3232C4p A00;
    public final C54 A01;
    public final List A02 = C3cG.A0h();

    @Override // X.BWf
    public final void ARj() {
        A00(null, null);
    }

    public final void A00(String str, String str2) {
        String strSubstring = "";
        if (str == null || str.equals("")) {
            str = "empty";
        }
        if (str2 == null || str2.equals("")) {
            str2 = "empty";
        }
        C3264C6k c3264C6k = this.A01.A03;
        BeS.A03(c3264C6k, "Did you call SessionManager.init()?");
        Object obj = c3264C6k.A02;
        synchronized (obj) {
            C3264C6k.A02(c3264C6k, str, 3, 80, false);
            C3264C6k.A00(c3264C6k);
        }
        synchronized (obj) {
            if (str2.length() < 80) {
                C3264C6k.A02(c3264C6k, str2, 85, 80, false);
            } else {
                String strSubstring2 = str2.substring(0, 80);
                strSubstring = str2.substring(80);
                C3264C6k.A02(c3264C6k, strSubstring2, 85, 80, false);
            }
            C3264C6k.A02(c3264C6k, strSubstring, 622, 127, false);
            String str3 = c3264C6k.A00;
            if (str3 != null) {
                C3264C6k.A02(c3264C6k, str3, 1778, 207, false);
            }
            C3264C6k.A00(c3264C6k);
            c3264C6k.A00 = str2;
        }
        C5W c5w = C5V.A04;
        if (c5w != null) {
            c5w.A02 = str2;
            c5w.A00 = SystemClock.uptimeMillis();
        }
        synchronized (C5V.class) {
            if (!str2.equals(C5V.A05)) {
                System.nanoTime();
                C5V.A05 = str2;
                final HashSet hashSetA0x = BV4.A0x(C5V.A01);
                C5V.A03.execute(new Runnable() { // from class: X.BWJ
                    public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet = hashSetA0x;
                        boolean z = C5V.A06;
                        Iterator it = hashSet.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw BV4.A0a("onEndpointChanged");
                        }
                    }
                });
            }
        }
        c3264C6k.A04(SystemClock.uptimeMillis());
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onEndpointChanged");
        }
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A08;
    }

    @Override // X.InterfaceC3235C4s
    public final void start() {
        A03 = this;
        synchronized (C5V.class) {
            C5V.A02.add(this);
        }
    }

    public C5S(C3232C4p c3232C4p, C54 c54) {
        this.A01 = c54;
        this.A00 = c3232C4p;
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }
}
