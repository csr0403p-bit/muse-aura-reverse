package X;

import android.os.SystemClock;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.Br0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2988Br0 extends DXV {
    public int A00;
    public final DXW A01;
    public final Map<Long, Dlw> A02 = new HashMap(0, 0.75f);
    public final PriorityQueue<Br1> A03 = new PriorityQueue<>();

    @Override // X.DXV
    public final synchronized String toString() {
        return String.format(Locale.US, "HeroPlayerPoolPriorityCache contains %d players, max capacity %d ", Integer.valueOf(this.A02.size()), Integer.valueOf(this.A00));
    }

    public static Br1 A00(C2988Br0 c2988Br0, Long l) {
        PriorityQueue<Br1> priorityQueue = c2988Br0.A03;
        if (!priorityQueue.isEmpty() && !c2988Br0.A02.isEmpty()) {
            Iterator<Br1> it = priorityQueue.iterator();
            while (it.hasNext()) {
                Br1 next = it.next();
                if (next.A02.equals(l)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static void A02(C2988Br0 c2988Br0) {
        Map<Long, Dlw> map = c2988Br0.A02;
        int size = map.size();
        PriorityQueue<Br1> priorityQueue = c2988Br0.A03;
        if (size != priorityQueue.size()) {
            priorityQueue.clear();
            c2988Br0.A01.A04("reset priority", -1L);
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Long l = (Long) C3cH.A0l(itA0n).getKey();
                EnumC2378BWr enumC2378BWr = EnumC2378BWr.IN_PLAY;
                Br1 br1 = new Br1();
                br1.A02 = l;
                br1.A01 = enumC2378BWr;
                br1.A00 = SystemClock.elapsedRealtime();
                priorityQueue.add(br1);
            }
        }
    }

    public C2988Br0(DXW dxw, int i) {
        this.A00 = i;
        this.A01 = dxw;
    }

    public static void A01(EnumC2378BWr enumC2378BWr, Dlw dlw, DXW dxw, String str, boolean z) {
        dlw.AaA(z);
        StringBuilder sbA0x = C60O.A0x("removed player priority: ");
        Object obj = enumC2378BWr;
        if (enumC2378BWr == null) {
            obj = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(obj);
        sbA0x.append(" evicted: ");
        sbA0x.append(z);
        dxw.A04(C60P.A1M(" reason: ", str, sbA0x), dlw.A20);
    }
}
