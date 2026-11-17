package X;

import android.util.Pair;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class F4B extends AbstractC7260Ejk {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F4B(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    @Override // X.AbstractC7260Ejk
    public final void onCancellationRequested() {
        Pair pair;
        boolean zRemove;
        ArrayList arrayList;
        C7185Ehv c7185Ehv;
        ArrayList arrayListA03;
        ArrayList arrayListA01;
        Object obj;
        switch (this.$t) {
            case 0:
                ((AtomicBoolean) this.A01).set(true);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                AbstractRunnableC7002Ee4 abstractRunnableC7002Ee4 = (AbstractRunnableC7002Ee4) this.A01;
                if (abstractRunnableC7002Ee4.A00.compareAndSet(0, 2)) {
                    abstractRunnableC7002Ee4.A01();
                    return;
                }
                return;
            case 5:
                C7186Ehw c7186Ehw = (C7186Ehw) this.A00;
                synchronized (c7186Ehw) {
                    AbstractCollection abstractCollection = c7186Ehw.A06;
                    pair = (Pair) this.A01;
                    zRemove = abstractCollection.remove(pair);
                    arrayList = null;
                    if (!zRemove) {
                        c7185Ehv = null;
                        arrayListA03 = null;
                    } else if (abstractCollection.isEmpty()) {
                        c7185Ehv = c7186Ehw.A02;
                        arrayListA03 = null;
                    } else {
                        ArrayList arrayListA02 = C7186Ehw.A02(c7186Ehw);
                        arrayListA03 = C7186Ehw.A03(c7186Ehw);
                        arrayListA01 = C7186Ehw.A01(c7186Ehw);
                        c7185Ehv = null;
                        arrayList = arrayListA02;
                    }
                    arrayListA01 = null;
                }
                C7185Ehv.A01(arrayList);
                C7185Ehv.A02(arrayListA03);
                C7185Ehv.A00(arrayListA01);
                if (c7185Ehv != null) {
                    c7185Ehv.A03();
                }
                if (zRemove) {
                    obj = pair.first;
                    break;
                } else {
                    return;
                }
            case 6:
                C7022EeT c7022EeT = (C7022EeT) this.A00;
                c7022EeT.A01.A03();
                c7022EeT.A00 = true;
                obj = this.A01;
                break;
            case 7:
                AbstractRunnableC7002Ee4 abstractRunnableC7002Ee42 = (AbstractRunnableC7002Ee4) this.A00;
                if (abstractRunnableC7002Ee42.A00.compareAndSet(0, 2)) {
                    abstractRunnableC7002Ee42.A01();
                }
                C7037Eej c7037Eej = ((C7036Eei) this.A01).A01;
                synchronized (c7037Eej) {
                    c7037Eej.A00.remove(abstractRunnableC7002Ee42);
                }
                return;
        }
        ((InterfaceC7028EeZ) obj).AS7();
    }

    @Override // X.AbstractC7260Ejk
    public final void onIsIntermediateResultExpectedChanged() {
        switch (this.$t) {
            case 5:
                C7185Ehv.A00(C7186Ehw.A01((C7186Ehw) this.A00));
                break;
            case 6:
                C7022EeT c7022EeT = (C7022EeT) this.A00;
                if (c7022EeT.A02.AOc()) {
                    C7051Eex.A02(c7022EeT.A01);
                    break;
                }
                break;
        }
    }

    @Override // X.AbstractC7260Ejk
    public final void onIsPrefetchChanged() {
        if (5 - this.$t == 0) {
            C7185Ehv.A01(C7186Ehw.A02((C7186Ehw) this.A00));
        }
    }

    @Override // X.AbstractC7260Ejk
    public final void onPriorityChanged() {
        if (5 - this.$t == 0) {
            C7185Ehv.A02(C7186Ehw.A03((C7186Ehw) this.A00));
        }
    }
}
