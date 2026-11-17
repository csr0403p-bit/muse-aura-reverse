package X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FQ1 {
    public Hi1 A00;
    public boolean A01;
    public final Handler A04;
    public final DK9 A05;
    public final C10445Hib A06;
    public final FC1 A07;
    public final C8022FPy A08;
    public final FQ0 A09;
    public final Rect A03 = AbstractC7607F5u.A0X();
    public final Rect A02 = AbstractC7607F5u.A0X();
    public final List<Rect> A0F = C3cG.A0h();
    public final List A0C = C3cG.A0h();
    public final List<C8020FPu<?, ?>> A0D = C3cG.A0h();
    public final Map<String, Set<String>> A0E = BV4.A0u();
    public final List<Rect> A0B = C3cG.A0h();
    public final Runnable A0A = new FQ2(this, new Exception("ViewpointScanner created here"));

    public final void A00() {
        Hi1 hi1 = this.A00;
        if (hi1 != null) {
            hi1.A00();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            this.A05.now();
            if (!this.A0C.isEmpty()) {
                throw BV4.A0S();
            }
            C10445Hib c10445Hib = this.A06;
            List<Rect> list = this.A0B;
            c10445Hib.A00(list);
            FQ0 fq0 = this.A09;
            fq0.A03(list);
            fq0.A04(null);
        }
        this.A01 = false;
    }

    public FQ1(Handler handler, DK9 dk9, C10445Hib c10445Hib, FC1 fc1, C8022FPy c8022FPy, FQ0 fq0) {
        this.A07 = fc1;
        this.A06 = c10445Hib;
        this.A05 = dk9;
        this.A09 = fq0;
        this.A08 = c8022FPy;
        this.A04 = handler;
    }
}
