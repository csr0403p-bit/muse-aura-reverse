package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FTa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8094FTa {
    public int A00 = -1;
    public View A01;
    public FTN A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C8101FTo A07;

    public abstract void A01();

    public abstract void A03(View view, C8101FTo c8101FTo);

    public abstract void A04(C8101FTo c8101FTo, C8097FTd c8097FTd, int i, int i2);

    public final void A00() {
        if (this.A05) {
            this.A05 = false;
            A01();
            this.A03.A13.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            FTN ftn = this.A02;
            if (ftn.A06 == this) {
                ftn.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A02(int i, int i2) {
        int i3;
        Object obj;
        RecyclerView recyclerView = this.A03;
        if (this.A00 == -1 || recyclerView == null) {
            A00();
        }
        if (this.A04 && this.A01 == null && (obj = this.A02) != null) {
            int i4 = this.A00;
            if (obj instanceof FSN) {
                PointF pointFA6k = ((FSN) obj).A6k(i4);
                if (pointFA6k != null) {
                    float f = pointFA6k.x;
                    if (f != 0.0f || pointFA6k.y != 0.0f) {
                        recyclerView.A15(null, (int) Math.signum(f), (int) Math.signum(pointFA6k.y));
                    }
                }
            } else {
                Log.w("RecyclerView", FGI.A0M("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", FSN.class.getCanonicalName()));
            }
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            float f2 = RecyclerView.A1J;
            FTV ftv = AbstractC7607F5u.A0m(view).A00;
            if (ftv != null) {
                i3 = ftv.A05;
                if (i3 == -1) {
                    i3 = ftv.A04;
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.A00) {
                View view2 = this.A01;
                C8101FTo c8101FTo = this.A07;
                A03(view2, c8101FTo);
                c8101FTo.A00(recyclerView);
                A00();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.A01 = null;
            }
        }
        if (this.A05) {
            C8097FTd c8097FTd = recyclerView.A13;
            C8101FTo c8101FTo2 = this.A07;
            A04(c8101FTo2, c8097FTd, i, i2);
            boolean zA1Q = C8j3.A1Q(c8101FTo2.A04);
            c8101FTo2.A00(recyclerView);
            if (zA1Q && this.A05) {
                this.A04 = true;
                recyclerView.A14.A00();
            }
        }
    }

    public AbstractC8094FTa() {
        C8101FTo c8101FTo = new C8101FTo();
        c8101FTo.A04 = -1;
        c8101FTo.A06 = false;
        c8101FTo.A00 = 0;
        c8101FTo.A02 = 0;
        c8101FTo.A03 = 0;
        c8101FTo.A01 = Integer.MIN_VALUE;
        c8101FTo.A05 = null;
        this.A07 = c8101FTo;
    }
}
