package X;

import android.R;
import android.app.Activity;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DBF implements DBA {
    public final G0U<String, Unit> A02;
    public final AtomicReference<ViewOnAttachStateChangeListenerC8438Fe2> A01 = BV4.A15();
    public final AtomicReference<Boolean> A00 = BV4.A16(false);

    /* JADX WARN: Multi-variable type inference failed */
    public DBF(G0U<? super String, Unit> g0u) {
        this.A02 = g0u;
    }

    @Override // X.DBA
    public final void onActivityResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        if (viewFindViewById != null) {
            this.A01.set(ViewOnAttachStateChangeListenerC8438Fe2.A00(viewFindViewById, new DBG(this)));
        }
    }

    @Override // X.DBA
    public final void uninstall() {
        this.A00.set(AnonymousClass001.A0i());
        ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = (ViewOnAttachStateChangeListenerC8438Fe2) C8j3.A10(this.A01);
        if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
            if (!C3cH.A1K()) {
                C60O.A02().post(new DBH(viewOnAttachStateChangeListenerC8438Fe2, this));
            } else {
                try {
                    viewOnAttachStateChangeListenerC8438Fe2.A01();
                } catch (IllegalStateException unused) {
                }
            }
        }
    }
}
