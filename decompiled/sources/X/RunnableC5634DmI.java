package X;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.debug.tracer.Tracer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DmI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5634DmI implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$refreshPlayer$reinstatePlayer$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C6078DvI A02;
    public final /* synthetic */ C5627DmA A03;
    public final /* synthetic */ DmR A04;

    public RunnableC5634DmI(ViewGroup viewGroup, C6078DvI c6078DvI, C5627DmA c5627DmA, DmR dmR, int i) {
        this.A01 = viewGroup;
        this.A03 = c5627DmA;
        this.A04 = dmR;
        this.A00 = i;
        this.A02 = c6078DvI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            C5627DmA c5627DmA = this.A03;
            C5720DoF c5720DoF = c5627DmA.A04;
            if (c5720DoF != null) {
                c5720DoF.A00();
            }
            View view = c5627DmA.A02;
            if (view != null && view.getParent() != viewGroup) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.hashCode();
                }
                viewGroup.hashCode();
            }
            View view2 = c5627DmA.A02;
            if (view2 != null && view2.getParent() == viewGroup) {
                C5627DmA.A03(c5627DmA);
            }
            Tracer.A01("GrootBaseTextureViewControllerImpl.onDetachPlayerView");
            Tracer.A00();
            if (c5627DmA.A0s) {
                c5627DmA.A03 = null;
            }
        }
        C5627DmA c5627DmA2 = this.A03;
        CopyOnWriteArraySet<InterfaceC5756Dor> copyOnWriteArraySet = c5627DmA2.A07.A0I.A00;
        ArrayList arrayListA0t = BV4.A0t(copyOnWriteArraySet);
        copyOnWriteArraySet.clear();
        boolean z = c5627DmA2.A07.A0i;
        float f = c5627DmA2.A07.A0Z;
        C5625Dm8 c5625Dm8 = c5627DmA2.A07;
        C5875DrB c5875DrB = c5627DmA2.A0P;
        Looper looper = c5627DmA2.A0G;
        c5627DmA2.A07 = new C5625Dm8(c5627DmA2.A0F, looper, c5627DmA2.A0O, new C5628DmC(c5627DmA2), c5875DrB, c5627DmA2.A0Q, c5627DmA2.A0R);
        Iterator it = arrayListA0t.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof C5628DmC) && !(next instanceof C5932DsR)) {
                c5627DmA2.A07.A0I.A00.add(next);
            }
        }
        c5627DmA2.AfD(this.A04);
        if (viewGroup != null) {
            c5627DmA2.A4t(viewGroup, null);
        }
        int i = this.A00;
        if (i > -1) {
            c5627DmA2.AcN(i, "");
        }
        if (z) {
            C5625Dm8 c5625Dm82 = c5627DmA2.A07;
            Boolean boolValueOf = Boolean.valueOf(z);
            C5625Dm8.A0A(c5625Dm82, "setLooping: %s", boolValueOf);
            BV6.A0z(c5625Dm82.A0F, c5625Dm82, boolValueOf, 19);
        }
        c5627DmA2.A07.A0G("player_recovery", C8j2.A00(21), "groot_player_recovery_restore_volume", f);
        C5627DmA.A02(c5627DmA2);
        BV4.A09(looper).post(new RunnableC5804Dpo(c5625Dm8));
    }
}
