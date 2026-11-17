package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FLZ implements FD8, Dg5 {
    public Hky A00;
    public C7928FLa A01;
    public C7928FLa A02;
    public Integer A03;
    public final Context A04;
    public final C7729FCg A05;
    public final C7933FLf A06;
    public final List<FDF> A07;

    @Override // X.FD8
    public final void A3u(FDF fdf) {
        C7384Etj.A0Y(fdf, 0);
        this.A07.add(fdf);
    }

    public final void A00() {
        Integer num = this.A03;
        Integer num2 = C79.A01;
        if (num != num2) {
            this.A03 = num2;
            Hky hky = num == C79.A00 ? Hky.A03 : Hky.A02;
            FD3.A03.A04(this);
            C7928FLa c7928FLa = this.A02;
            if (c7928FLa != null) {
                c7928FLa.A00(hky);
            } else {
                this.A00 = hky;
            }
        }
    }

    @Override // X.FD8
    public final Context ACP() {
        return this.A04;
    }

    @Override // X.FD8
    public final FBB ACs() {
        FBB fbbA02 = this.A05.A02();
        C7384Etj.A0U(fbbA02);
        return fbbA02;
    }

    @Override // X.FD8
    public final Integer AE2() {
        FHL fhl = this.A06.A02;
        if (fhl != null) {
            return Integer.valueOf(fhl.AK5());
        }
        return null;
    }

    @Override // X.FD8
    public final String AK4() {
        return this.A06.A08;
    }

    @Override // X.Dg5
    public final /* bridge */ void onCreate(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final void onDestroy(C1HY c1hy) {
        Iterator<Integer> it = this.A06.A09.iterator();
        while (it.hasNext()) {
            int iA03 = C60Q.A03(it);
            synchronized (Hi4.A01) {
                Hi4.A00.delete(iA03);
            }
        }
        this.A05.A03();
        Iterator<FDF> it2 = this.A07.iterator();
        while (it2.hasNext()) {
            it2.next().AVc(this);
        }
    }

    @Override // X.Dg5
    public final /* bridge */ void onPause(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onResume(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onStart(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onStop(C1HY c1hy) {
    }

    public FLZ(Context context, SparseArray sparseArray, C7933FLf c7933FLf, FBD fbd, Integer num) {
        this.A04 = context;
        this.A06 = c7933FLf;
        this.A03 = num;
        BloksParseResult bloksParseResult = c7933FLf.A03;
        Map map = Collections.EMPTY_MAP;
        new SparseArray();
        this.A05 = new C7729FCg(context, sparseArray, bloksParseResult, fbd, map, c7933FLf.A0B);
        this.A07 = C3cG.A0h();
    }
}
