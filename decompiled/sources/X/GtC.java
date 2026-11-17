package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public final class GtC implements Cloneable {
    public int A00;
    public Gu6 A01;
    public C10308GuJ A02;
    public C10317GuX A03;
    public boolean A04;
    public final ReentrantLock A05;
    public final C10316GuW A06;

    public static C10317GuX A00(GtC gtC) {
        C10317GuX c10317GuX = gtC.A03;
        if (c10317GuX != null) {
            return c10317GuX;
        }
        C10317GuX c10317GuX2 = new C10317GuX(null, C10317GuX.A03);
        gtC.A03 = c10317GuX2;
        return c10317GuX2;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new GtC(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GtC(GtC gtC) {
        this.A04 = false;
        this.A05 = new ReentrantLock();
        this.A06 = new C10316GuW(0);
        Gu6 gu6 = gtC.A01;
        this.A01 = new Gu6(gu6.initialCapacity, gu6.maxSize);
        C10308GuJ c10308GuJ = gtC.A02;
        this.A02 = new C10308GuJ(c10308GuJ.A01, c10308GuJ.A00);
        this.A04 = gtC.A04;
        this.A00 = gtC.A00;
        C10317GuX c10317GuX = C10317GuX.A03;
        C10317GuX c10317GuXA00 = A00(gtC);
        C10317GuX c10317GuX2 = c10317GuXA00.A02;
        ArrayList<Consumer<C10322Guc>> arrayList = c10317GuXA00.A00;
        C10317GuX c10317GuX3 = new C10317GuX(arrayList == null ? null : BV4.A0t(arrayList), c10317GuX2);
        Map<String, Map<String, C10322Guc>> map = c10317GuXA00.A01;
        if (!map.isEmpty()) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                HashMap mapA0v = BV4.A0v(((Map) entryA0l.getValue()).size());
                Iterator itA0n2 = AnonymousClass002.A0n((Map) entryA0l.getValue());
                while (itA0n2.hasNext()) {
                    Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
                    mapA0v.put(entryA0l2.getKey(), ((C10322Guc) entryA0l2.getValue()).clone());
                }
                c10317GuX3.A01.put(entryA0l.getKey(), mapA0v);
            }
        }
        this.A03 = c10317GuX3;
    }

    public GtC(C10316GuW c10316GuW) {
        this.A04 = false;
        this.A05 = new ReentrantLock();
        this.A06 = c10316GuW;
        this.A02 = C10308GuJ.A02;
        this.A01 = new Gu6(0, 0);
        this.A00 = 512;
    }
}
