package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class FS5 {
    public final void A01(RecyclerView recyclerView, int i) {
        InputMethodManager inputMethodManager;
        FTN ftn;
        View viewA03;
        if (this instanceof C7879FIs) {
            if (i == 0) {
                recyclerView.A11(this);
            }
            return;
        }
        if (this instanceof FZ6) {
            FZ6 fz6 = (FZ6) this;
            if (i == 0) {
                recyclerView.announceForAccessibility(fz6.A00.getText());
                return;
            }
            return;
        }
        if (this instanceof C7794FFa) {
            C7794FFa c7794FFa = (C7794FFa) this;
            if (i == 0) {
                View viewA0w = c7794FFa.A01.A0w(c7794FFa.A00);
                if (viewA0w != null) {
                    viewA0w.requestFocus();
                }
                c7794FFa.A02.A11(c7794FFa);
                return;
            }
            return;
        }
        if (this instanceof F8W) {
            F8W f8w = (F8W) this;
            boolean z = true;
            if (i != 1) {
                if (i != 0 || (ftn = recyclerView.A0H) == null || (viewA03 = f8w.A02.A03(ftn)) == null) {
                    return;
                }
                int iA05 = RecyclerView.A05(viewA03);
                if (iA05 == f8w.A00 && !f8w.A01) {
                    return;
                }
                F8W.A00(f8w.A03, f8w.A04, iA05, f8w.A01);
                f8w.A00 = iA05;
                z = false;
            }
            f8w.A01 = z;
            return;
        }
        if (this instanceof FK5) {
            FK5 fk5 = (FK5) this;
            if (fk5.A04) {
                return;
            }
            if (i == 0) {
                FK6 fk6 = new FK6(recyclerView, fk5);
                fk5.A01 = fk6;
                recyclerView.postDelayed(fk6, 1500L);
                return;
            }
            recyclerView.removeCallbacks(fk5.A01);
            if (fk5.A02) {
                return;
            }
            ValueAnimator valueAnimator = fk5.A00;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fk5.A00.cancel();
            }
            FK4 fk4 = fk5.A03;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fk4.A00, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new FK7(recyclerView, fk4));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            fk5.A02 = true;
            return;
        }
        if (this instanceof FSL) {
            FSL fsl = (FSL) this;
            if (i == 0 && fsl.A00) {
                fsl.A00 = false;
                fsl.A01.A04();
                return;
            }
            return;
        }
        if (this instanceof I0J) {
            I0J i0j = (I0J) this;
            switch (i0j.$t) {
                case 1:
                    if (i == 1 && (inputMethodManager = (InputMethodManager) ((FBB) i0j.A00).A00.getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
                        break;
                    }
                    break;
                case 3:
                    if (i == 2 || i == 1) {
                        C7636F7t c7636F7t = (C7636F7t) i0j.A00;
                        RecyclerView recyclerView2 = c7636F7t.A00;
                        recyclerView2.A11(i0j);
                        recyclerView2.A0I = null;
                        c7636F7t.A01.A05(recyclerView2);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FS5.A02(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
