package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class DaM {
    public static final AtomicReferenceFieldUpdater<DaM, Object> A08 = AtomicReferenceFieldUpdater.newUpdater(DaM.class, Object.class, "childFragment");
    public final int A00;
    public final int A01;
    public final DZi A02;
    public final List<AbstractC5134DaO> A03;
    public final Da3 A04;
    public final boolean A05;
    public final boolean A06;
    public volatile String A07;
    public volatile Object childFragment;

    /* JADX WARN: Incorrect types in method signature: (LX/Da3;ILjava/util/List<+LX/DaO;>;LX/DZi;I)V */
    public DaM(DZi dZi, List list, Da3 da3, int i, int i2) {
        boolean z;
        this.A04 = da3;
        this.A00 = i;
        this.A03 = list;
        this.A02 = dZi;
        this.A01 = i2;
        boolean z2 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            for (Object obj : list) {
                if ((obj instanceof C5147Dad) || (obj instanceof C5145Daa) || (obj instanceof C5146Dab)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.A05 = z;
        List<AbstractC5134DaO> list2 = this.A03;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<AbstractC5134DaO> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof C5158Dao) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.A06 = z2;
    }
}
