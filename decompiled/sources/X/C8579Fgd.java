package X;

import android.app.Application;
import androidx.fragment.app.Fragment;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;

/* renamed from: X.Fgd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8579Fgd extends C8578Fgc {
    public final /* synthetic */ C8580Fge A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8579Fgd(C8580Fge c8580Fge) {
        super(c8580Fge.A02, c8580Fge.A03, new C8838Fqo(c8580Fge, 19), c8580Fge.A01);
        this.A00 = c8580Fge;
    }

    @Override // X.C8578Fgc, X.AbstractC8601Fh5
    public final void A01(Fragment fragment, AbstractC8571FgQ abstractC8571FgQ) {
        AnonymousClass003.A0u(abstractC8571FgQ, fragment);
        super.A01(fragment, abstractC8571FgQ);
        C8580Fge c8580Fge = this.A00;
        if (fragment.equals(c8580Fge.A02)) {
            C8579Fgd c8579Fgd = c8580Fge.A06;
            if (c8579Fgd.A01) {
                c8579Fgd.A01 = false;
                AbstractC8571FgQ abstractC8571FgQ2 = c8579Fgd.A04;
                abstractC8571FgQ2.A0o(c8579Fgd);
                abstractC8571FgQ2.A0E.remove(c8579Fgd);
            }
            ActivityLifecycleTracker activityLifecycleTracker = c8580Fge.A04;
            if (activityLifecycleTracker != null && activityLifecycleTracker.A00) {
                activityLifecycleTracker.A00 = false;
                Application application = activityLifecycleTracker.A01.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleTracker);
                }
                activityLifecycleTracker.A02.clear();
            }
            C8578Fgc c8578Fgc = c8580Fge.A05;
            if (c8578Fgc == null || !c8578Fgc.A01) {
                return;
            }
            c8578Fgc.A01 = false;
            AbstractC8571FgQ abstractC8571FgQ3 = c8578Fgc.A04;
            abstractC8571FgQ3.A0o(c8578Fgc);
            abstractC8571FgQ3.A0E.remove(c8578Fgc);
        }
    }
}
