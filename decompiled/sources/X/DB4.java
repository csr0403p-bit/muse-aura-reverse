package X;

import android.R;
import android.app.Activity;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DB4 extends DAZ {
    public final AtomicReference<ViewOnAttachStateChangeListenerC8438Fe2> A00 = BV4.A15();
    public final F18<DK9> A01;
    public final F18<DBB> A02;
    public final F18<DBE> A03;

    @Override // X.DAZ
    public final void A03() {
    }

    @Override // X.DAu
    public final void onActivityResumed(Activity activity) {
        String strA0Y;
        String str;
        C7384Etj.A0Y(activity, 0);
        if (this.A04.get()) {
            return;
        }
        if (activity.getWindow() == null) {
            CFK.A05(FGI.A0M("StartupDoneStrategy|", getName()), "Can't install draw listener: No activity or window");
            strA0Y = C3cI.A0Y(activity);
            str = "onResumeNoWindow";
        } else {
            View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
            if (viewFindViewById != null) {
                DAZ.A00(this, "onResumeNoDraw", null, (short) 2, false);
                this.A00.set(ViewOnAttachStateChangeListenerC8438Fe2.A00(viewFindViewById, new DB5(activity, this)));
                return;
            } else {
                String strA0M = FGI.A0M("StartupDoneStrategy|", getName());
                strA0Y = C3cI.A0Y(activity);
                CFK.A03(strA0Y, strA0M, "Can't install draw listener: No content view, invoker=%s");
                str = "onResumeNoView";
            }
        }
        DAZ.A00(this, str, strA0Y, (short) 2, true);
    }

    @Override // X.DAZ
    public final void A04() {
        ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = (ViewOnAttachStateChangeListenerC8438Fe2) C8j3.A10(this.A00);
        if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
            try {
                viewOnAttachStateChangeListenerC8438Fe2.A01();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // X.DAu
    public final String getName() {
        return "lifecycle";
    }

    public DB4(F18 f18, F18 f182, F18 f183) {
        this.A01 = f18;
        this.A02 = f182;
        this.A03 = f183;
    }
}
