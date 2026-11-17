package com.facebook.aura.analytics.hatch;

import X.AIW;
import X.AbstractC3358CGz;
import X.C06H;
import X.C0924AIa;
import X.C22I;
import X.C3Em;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.analytics.timespent.navigation.AuraNavigationLogger;
import com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl;

/* loaded from: classes.dex */
public final class HatchTimeSpentLogger implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final C3Em<HatchNavigationLogEvent> _debugEvents;
    public static final C22I<HatchNavigationLogEvent> debugEvents;

    public final class Companion {
        public final HatchTimeSpentLogger getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchTimeSpentLogger) abstractC3358CGz.A03(HatchTimeSpentLogger.class, HatchTimeSpentLogger$Companion$getInstance$1.INSTANCE);
        }

        public final C22I<HatchNavigationLogEvent> getDebugEvents() {
            return HatchTimeSpentLogger.debugEvents;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void reportNavigation(HatchModule hatchModule, HatchModule hatchModule2, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype) {
        C7384Etj.A0Y(hatchModule2, 1);
        _debugEvents.AhV(new HatchNavigationLogEvent(hatchModule != null ? hatchModule.getModuleName() : null, hatchModule2.getModuleName(), hatchClickPoint != null ? hatchClickPoint.getValue() : null, hatchEventSubtype != null ? hatchEventSubtype.getValue() : null, SystemClock.elapsedRealtime()));
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(NavigationLoggerImpl.DEVICE_TYPE_KEY, HatchFormFactor.Companion.getDevice().getValue());
        String identifier = HatchDeviceLocale.INSTANCE.getIdentifier();
        if (identifier != null) {
            c0924AIa.put("device_locale", identifier);
        }
        if (hatchClickPoint != null) {
            c0924AIa.put(NavigationLoggerImpl.CLICK_POINT_KEY, hatchClickPoint.getValue());
        }
        if (hatchEventSubtype != null) {
            c0924AIa.put(NavigationLoggerImpl.EVENT_SUBTYPE_KEY, hatchEventSubtype.getValue());
        }
        AuraNavigationLogger.instance.reportNavigationEventForComposable(hatchModule2.getModuleName(), hatchModule2.getModuleClassName(), hatchModule2.hashCode(), AIW.A0K(c0924AIa));
    }

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 32);
        _debugEvents = c9290GCr;
        debugEvents = new C3pd(c9290GCr);
    }

    public static /* synthetic */ void reportNavigation$default(HatchTimeSpentLogger hatchTimeSpentLogger, HatchModule hatchModule, HatchModule hatchModule2, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchClickPoint = null;
        }
        if ((i & 8) != 0) {
            hatchEventSubtype = null;
        }
        hatchTimeSpentLogger.reportNavigation(hatchModule, hatchModule2, hatchClickPoint, hatchEventSubtype);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public /* synthetic */ HatchTimeSpentLogger(C06H c06h) {
    }

    public HatchTimeSpentLogger() {
    }
}
