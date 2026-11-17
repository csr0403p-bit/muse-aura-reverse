package X;

import java.util.PriorityQueue;

/* loaded from: classes5.dex */
public final class BVj implements InterfaceC2361BVo {
    public final PriorityQueue<C2358BVi> A00 = new PriorityQueue<>(10, C2358BVi.A05);

    @Override // X.InterfaceC2361BVo
    public final synchronized void A38(C2358BVi c2358BVi) {
        PriorityQueue<C2358BVi> priorityQueue = this.A00;
        if (priorityQueue.size() < 200) {
            priorityQueue.add(c2358BVi);
        }
    }
}
