package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ATj {
    public final C1060ATi<C1889At7> A00;
    public final MutableState A01;

    /* JADX WARN: Multi-variable type inference failed */
    public ATj() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    public static final void A00(ATj aTj) {
        Snapshot snapshotA03 = Snapshot.A03();
        G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            MutableState mutableState = aTj.A01;
            C1889At7 c1889At7 = (C1889At7) mutableState.getValue();
            if (c1889At7 != null) {
                C1060ATi<C1889At7> c1060ATi = aTj.A00;
                SnapshotStateList<C1889At7> snapshotStateList = c1060ATi.A00;
                snapshotStateList.clear();
                while (true) {
                    SnapshotStateList<C1889At7> snapshotStateList2 = c1060ATi.A01;
                    if (snapshotStateList2.size() + snapshotStateList.size() <= 99) {
                        snapshotStateList2.add(c1889At7);
                        break;
                    } else {
                        if (snapshotStateList2.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        snapshotStateList2.remove(0);
                    }
                }
            }
            mutableState.Af8(null);
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
        }
    }

    public /* synthetic */ ATj(C1889At7 c1889At7, C1060ATi c1060ATi, C06H c06h, int i) {
        C0881AGi c0881AGi = C0881AGi.A00;
        this.A00 = new C1060ATi<>(c0881AGi, c0881AGi);
        this.A01 = AbstractC1798ArH.A06(null);
    }
}
