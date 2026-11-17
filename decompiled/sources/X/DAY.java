package X;

import android.app.Activity;
import android.os.Trace;
import com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class DAY {
    public abstract List<DAu> getStrategies();

    public abstract DAu getStrategyForActivityResume(Activity activity);

    public abstract DAu getStrategyForBackgroundStart();

    public abstract DAu getStrategyForNavigation(String str);

    public final void onActivityResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        Iterator<DAu> it = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies.iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    public final void onInitialNavigation(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator<DAu> it = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies.iterator();
        while (it.hasNext()) {
            it.next().ATc(str);
        }
    }

    public final void setStrategyPicked(DAu dAu) {
        DAt dAt;
        C7384Etj.A0Y(dAu, 0);
        Iterator<DAu> it = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies.iterator();
        while (it.hasNext()) {
            DAu next = it.next();
            boolean z = next == dAu;
            DAZ daz = (DAZ) next;
            synchronized (daz.A03) {
                daz.A01 = z;
                dAt = daz.A00;
            }
            if (z) {
                if (dAt != null && dAt.A04) {
                    daz.A02().AMN().endStart(dAt.A03, dAt.A02, dAt.A00, FGI.A0M("StartupDoneStrategy|", daz.getName()), dAt.A01);
                }
            } else if (!daz.A04.getAndSet(true)) {
                daz.A02.A8z();
                daz.A04();
            }
        }
    }

    public final void onAppStartBegin(int i, int i2) {
        Iterator<DAu> it = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies.iterator();
        while (it.hasNext()) {
            DAZ daz = (DAZ) it.next();
            AbstractC3136BzG.A00("onAppStartBegin");
            try {
                C3412CLd c3412CLd = daz.A02;
                CLc cLc = c3412CLd.A00.get();
                if (cLc == null || i != cLc.A00) {
                    daz.A04.set(false);
                    c3412CLd.A9w(i);
                    synchronized (daz.A03) {
                        daz.A00 = null;
                        daz.A01 = false;
                    }
                }
                daz.A03();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void onAppStartEnd() {
        boolean z;
        Iterator<DAu> it = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies.iterator();
        while (it.hasNext()) {
            DAZ daz = (DAZ) it.next();
            synchronized (daz.A03) {
                z = daz.A01;
            }
            if (!daz.A04.getAndSet(true)) {
                if (!z) {
                    daz.A02.A8z();
                }
                daz.A04();
            }
        }
    }

    public final void onBackgroundStartComplete() {
        List<DAu> list = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<DAu> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = arrayListA0h.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw BV4.A0a("onBackgroundStartComplete");
        }
    }

    public final void setStrategyPicked(DAu dAu, String str, long j, short s) {
        DAt dAt;
        boolean zA1Y = C60P.A1Y(dAu, str);
        for (DAu dAu2 : ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) this).strategies) {
            boolean zA1Z = AnonymousClass002.A1Z(dAu2, dAu);
            DAZ daz = (DAZ) dAu2;
            synchronized (daz.A03) {
                daz.A01 = zA1Z;
                dAt = daz.A00;
            }
            if (zA1Z) {
                if (dAt != null && dAt.A04) {
                    daz.A02().AMN().endStart(s, str, j, FGI.A0M("StartupDoneStrategy|", daz.getName()), dAt.A01);
                }
            } else if (!daz.A04.getAndSet(zA1Y)) {
                daz.A02.A8z();
                daz.A04();
            }
        }
    }
}
