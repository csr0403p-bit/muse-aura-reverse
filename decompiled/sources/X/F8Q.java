package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class F8Q {
    public static final ViewGroup.MarginLayoutParams A0B;
    public FF2 A00;
    public final FF9 A01;
    public final F8P A02;
    public final C7848FHg A03;
    public final FBB A04;
    public final FDW A05;
    public volatile FTA A06;
    public volatile FSF A07;
    public volatile FK4 A08;
    public volatile Integer A09;
    public volatile List<Rect> A0A;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A0B = marginLayoutParams;
    }

    public F8Q(F8P f8p, C7848FHg c7848FHg, FBB fbb, FDW fdw, int i) {
        this.A02 = f8p;
        this.A03 = c7848FHg;
        this.A05 = fdw;
        this.A04 = fbb;
        this.A01 = new FF9(fbb, fdw, i);
    }

    public static final void A00(F8Q f8q, int i, int i2, boolean z) {
        if (!AbstractC8162FXe.A03()) {
            throw BV4.A0c("Cannot doScrollBy off the main thread!");
        }
        F8P f8p = f8q.A02;
        RecyclerView recyclerView = f8p.A07;
        if (recyclerView == null) {
            f8p.A01 = i;
            f8p.A02 = i2;
            f8p.A0A = z;
        } else if (z) {
            recyclerView.A0v(i, i2, false);
        } else {
            recyclerView.scrollBy(i, i2);
        }
    }

    public final void A01(int i, boolean z) {
        if (!AbstractC8162FXe.A03()) {
            throw BV4.A0c("Cannot doScrollTo off the main thread!");
        }
        if (i < 0) {
            FFI.A02("Ignoring SetIndex with negative index ", i);
            return;
        }
        F8P f8p = this.A02;
        if (f8p.A07 == null) {
            f8p.A00 = i;
            f8p.A09 = z;
            return;
        }
        FSF fsf = f8p.A0D;
        if (z && fsf != null) {
            FEn.A03(f8p.A07, fsf, i, true);
            return;
        }
        FEn.A02(f8p.A07, i, z);
        if (z) {
            return;
        }
        FDW fdw = this.A05;
        HsM hsMA0D = fdw.A0D(51);
        HsM hsMA0D2 = fdw.A0D(97);
        if (hsMA0D == null && hsMA0D2 == null) {
            return;
        }
        F8W.A00(this.A04, fdw, i, false);
    }
}
