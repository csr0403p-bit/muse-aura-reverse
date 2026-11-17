package X;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.google.common.base.Ascii;
import java.util.Locale;

/* renamed from: X.Hkk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC10473Hkk implements Runnable {
    public static final String __redex_internal_original_name = "NetworkTypeObserver$ListenerHolder$$ExternalSyntheticLambda0";
    public final /* synthetic */ HuD A00;

    @Override // java.lang.Runnable
    public final void run() {
        String country;
        TelephonyManager telephonyManager;
        HuD huD = this.A00;
        InterfaceC10592Hxg interfaceC10592Hxg = huD.A00.get();
        if (interfaceC10592Hxg != null) {
            int iA04 = huD.A02.A04();
            C10387HaS c10387HaS = ((C10567Htx) interfaceC10592Hxg).A00;
            C10387HaS c10387HaS2 = C10387HaS.A0E;
            synchronized (c10387HaS) {
                if (c10387HaS.A00 != iA04 || c10387HaS.A07 == null) {
                    c10387HaS.A00 = iA04;
                    if (iA04 != 1 && iA04 != 0 && iA04 != 8) {
                        if (c10387HaS.A07 == null) {
                            Context context = c10387HaS.A09;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(HatchLinkOrderSheetKt.PHONE)) != null) {
                                country = telephonyManager.getNetworkCountryIso();
                                if (TextUtils.isEmpty(country)) {
                                }
                                c10387HaS.A07 = Ascii.toUpperCase(country);
                            }
                            country = Locale.getDefault().getCountry();
                            c10387HaS.A07 = Ascii.toUpperCase(country);
                        }
                        long jA00 = C10387HaS.A00(c10387HaS, iA04);
                        c10387HaS.A02 = jA00;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        C10387HaS.A01(c10387HaS, c10387HaS.A01 > 0 ? (int) (jElapsedRealtime - c10387HaS.A04) : 0, c10387HaS.A03, jA00);
                        c10387HaS.A04 = jElapsedRealtime;
                        c10387HaS.A03 = 0L;
                        c10387HaS.A05 = 0L;
                        c10387HaS.A06 = 0L;
                        C5339Dga c5339Dga = c10387HaS.A0A;
                        c5339Dga.A04.clear();
                        c5339Dga.A00 = -1;
                        c5339Dga.A01 = 0;
                        c5339Dga.A02 = 0;
                    }
                }
            }
        }
    }

    public /* synthetic */ RunnableC10473Hkk(HuD huD) {
        this.A00 = huD;
    }
}
