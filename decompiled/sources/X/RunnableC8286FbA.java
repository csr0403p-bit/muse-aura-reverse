package X;

import android.view.Menu;
import android.view.Window;

/* renamed from: X.FbA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8286FbA implements Runnable {
    public static final String __redex_internal_original_name = "ToolbarActionBar$1";
    public final /* synthetic */ C8256Fac A00;

    public RunnableC8286FbA(C8256Fac c8256Fac) {
        this.A00 = c8256Fac;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8249FaR c8249FaR;
        C8256Fac c8256Fac = this.A00;
        Menu menuA00 = C8256Fac.A00(c8256Fac);
        if (menuA00 instanceof C8249FaR) {
            c8249FaR = (C8249FaR) menuA00;
            if (c8249FaR != null) {
                c8249FaR.A07();
            }
        } else {
            c8249FaR = null;
        }
        try {
            menuA00.clear();
            Window.Callback callback = c8256Fac.A04;
            if (!callback.onCreatePanelMenu(0, menuA00) || !callback.onPreparePanel(0, null, menuA00)) {
                menuA00.clear();
            }
        } finally {
            if (c8249FaR != null) {
                c8249FaR.A06();
            }
        }
    }
}
