package com.facebook.aura.app;

import X.AnonymousClass003;
import X.C06H;
import X.C60P;
import X.C79;
import X.CAJ;
import X.CAL;
import X.CCR;
import X.CLb;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.aura.startup.entrypathinstrumentation.HatchEntryPathInstrumentation;

/* loaded from: classes5.dex */
public final class AuraAppComponentFactory extends CAL {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        CCR.A01 = SystemClock.uptimeMillis();
    }

    @Override // X.CAL, android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        boolean zA1Y = C60P.A1Y(classLoader, str);
        CAJ caj = HatchEntryPathInstrumentation.instance;
        CLb cLbClassify = caj.A03.classify(str, intent, classLoader, zA1Y);
        if (cLbClassify != null) {
            cLbClassify.A00(caj.A06);
        }
        CAJ.A02(intent, caj, C79.A00, str);
        CAJ.A01(intent, caj);
        caj.A06.AQF("intentFlags", CAJ.A00(intent, caj.A01));
        return super.instantiateActivity(classLoader, str, intent);
    }

    @Override // X.CAL, android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        AnonymousClass003.A0u(classLoader, str);
        CAJ caj = HatchEntryPathInstrumentation.instance;
        CLb cLbClassify = caj.A04.classify(str, intent, null, false);
        if (cLbClassify != null) {
            cLbClassify.A00(caj.A06);
        }
        CAJ.A01(intent, caj);
        caj.A06.AQF("intentFlags", CAJ.A00(intent, caj.A02));
        CAJ.A02(intent, caj, C79.A0C, str);
        return super.instantiateReceiver(classLoader, str, intent);
    }

    @Override // X.CAL, android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        AnonymousClass003.A0u(classLoader, str);
        CAJ caj = HatchEntryPathInstrumentation.instance;
        CLb cLbClassify = caj.A05.classify(str, intent, null, false);
        if (cLbClassify != null) {
            cLbClassify.A00(caj.A06);
        }
        CAJ.A01(intent, caj);
        CAJ.A02(intent, caj, C79.A01, str);
        return super.instantiateService(classLoader, str, intent);
    }
}
