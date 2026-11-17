package X;

import android.os.Trace;
import androidx.compose.ui.unit.Constraints;
import java.util.PriorityQueue;
import kotlin.Unit;

/* renamed from: X.Af7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1229Af7 {
    public int A01;
    public C1227Af5 A03;
    public G0U<? super Ac4, Unit> A04;
    public final AfB A05 = new AfB();
    public int A02 = -1;
    public int A00 = -1;

    /* JADX WARN: Incorrect types in method signature: (IJZLX/G0U<-LX/Ac6;Lkotlin/Unit;>;)LX/Ac3; */
    public final Ac3 A00(G0U g0u, int i, long j, boolean z) {
        boolean z2;
        C1227Af5 c1227Af5 = this.A03;
        if (c1227Af5 == null) {
            return C1233AfN.A00;
        }
        AfB afB = this.A05;
        AfG afG = c1227Af5.A02;
        boolean z3 = afG instanceof InterfaceC1234AfO;
        C1230Af8 c1230Af8 = new C1230Af8(c1227Af5, afB, z3 ? (InterfaceC1234AfO) afG : null, g0u, i);
        c1230Af8.A06 = new Constraints(j);
        if (z3) {
            RunnableC1704Aoj runnableC1704Aoj = (RunnableC1704Aoj) ((InterfaceC1234AfO) afG);
            PriorityQueue<AfM> priorityQueue = runnableC1704Aoj.A04;
            if (z) {
                z2 = true;
                priorityQueue.add(new AfM(c1230Af8, 1));
                if (!runnableC1704Aoj.A00) {
                    runnableC1704Aoj.A00 = z2;
                    runnableC1704Aoj.A03.post(runnableC1704Aoj);
                }
            } else {
                priorityQueue.add(new AfM(c1230Af8, 0));
                if (!runnableC1704Aoj.A00) {
                    z2 = true;
                    runnableC1704Aoj.A00 = z2;
                    runnableC1704Aoj.A03.post(runnableC1704Aoj);
                }
            }
        } else {
            afG.AcB(c1230Af8);
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return c1230Af8;
    }
}
