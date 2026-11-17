package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQI implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List<FQJ> A03 = Collections.synchronizedList(BV4.A0y());

    private void A00() {
        List<FQJ> list = this.A03;
        synchronized (list) {
            for (FQJ fqj : list) {
                if (fqj != null) {
                    fqj.AVx();
                }
            }
        }
    }

    private void A01(int i) {
        List<FQJ> list = this.A03;
        synchronized (list) {
            for (FQJ fqj : list) {
                if (fqj != null) {
                    fqj.AVy(i);
                }
            }
        }
    }

    private void A02(int i) {
        List<FQJ> list = this.A03;
        synchronized (list) {
            for (FQJ fqj : list) {
                if (fqj != null) {
                    fqj.AVz(i);
                }
            }
        }
    }

    private boolean A03() {
        C8497Ff4 c8497Ff4A00 = AbstractC8508FfF.A00(this.A02);
        if (c8497Ff4A00 == null) {
            return false;
        }
        C8496Ff3 c8496Ff3 = c8497Ff4A00.A00;
        boolean zA0C = c8496Ff3.A0C(8);
        int i = c8496Ff3.A04(8).A00;
        boolean z = this.A00;
        if (zA0C) {
            if (z) {
                A01(i);
                return true;
            }
            this.A00 = true;
            A02(i);
        } else if (z) {
            this.A00 = false;
            A00();
            return true;
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int stableInsetBottom;
        if (Build.VERSION.SDK_INT < 30 || !A03()) {
            Rect rectA0X = AbstractC7607F5u.A0X();
            View view = this.A02;
            view.getWindowVisibleDisplayFrame(rectA0X);
            Object systemService = view.getContext().getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            if (view.getRootWindowInsets() != null) {
                defaultDisplay.getRealSize(point);
                stableInsetBottom = point.y - view.getRootWindowInsets().getStableInsetBottom();
            } else {
                defaultDisplay.getSize(point);
                stableInsetBottom = point.y;
            }
            int i = stableInsetBottom - rectA0X.bottom;
            boolean z = this.A00;
            int i2 = this.A01;
            if (!z) {
                if (i > i2) {
                    this.A00 = true;
                    A02(i);
                    return;
                }
                return;
            }
            if (i > i2) {
                A01(i);
            } else if (i < i2) {
                this.A00 = false;
                A00();
            }
        }
    }

    public FQI(View view, boolean z) {
        this.A02 = view;
        this.A00 = z;
        float f = 100.0f * C60Q.A0B(view.getContext()).density;
        this.A01 = (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
