package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AMg {
    public static final Object A00 = C3cG.A0T();

    public static final <T> int A00(SnapshotStateList<T> snapshotStateList) {
        return ((AMi) BDh.A08(snapshotStateList.A00)).A01;
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(FGI.A0Q("index (", ") is out of bound of [0, ", ')', i, i2));
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AMi<TT;>;ILX/AHc<+TT;>;Z)Z */
    public static final boolean A02(InterfaceC0900AHc interfaceC0900AHc, AMi aMi, int i, boolean z) {
        boolean z2;
        synchronized (A00) {
            int i2 = aMi.A00;
            if (i2 == i) {
                aMi.A02 = interfaceC0900AHc;
                z2 = true;
                if (z) {
                    aMi.A01++;
                }
                aMi.A00 = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final <T> boolean A03(SnapshotStateList<T> snapshotStateList, G0U<? super List<T>, Boolean> g0u) {
        int i;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Boolean boolInvoke;
        Snapshot snapshotA00;
        boolean zA0s;
        do {
            synchronized (A00) {
                AMi aMiA0L = C8j5.A0L(snapshotStateList);
                i = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            AHV ahvA5a = interfaceC0900AHc.A5a();
            boolInvoke = g0u.invoke(ahvA5a);
            InterfaceC0900AHc interfaceC0900AHcA0U = ahvA5a.A0U();
            if (C7384Etj.areEqual(interfaceC0900AHcA0U, interfaceC0900AHc)) {
                break;
            }
            AN8 an8 = snapshotStateList.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA0s = C8j5.A0s(interfaceC0900AHcA0U, snapshotA00, snapshotStateList, an8, i);
            }
            BDh.A0G(snapshotA00, snapshotStateList);
        } while (!zA0s);
        return AnonymousClass001.A1X(boolInvoke);
    }
}
