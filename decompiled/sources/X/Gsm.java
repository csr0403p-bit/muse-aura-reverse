package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;

/* loaded from: classes6.dex */
public abstract class Gsm extends AbstractC10245Gsg {
    public boolean A02;
    public int A01 = 0;
    public int A00 = 0;
    public final ArrayList<AbstractC10245Gsg> A03 = C3cG.A0h();
    public final List<AbstractC10245Gsg> A04 = C3cG.A0h();

    @Override // X.AbstractC10245Gsg
    public final void A01() {
        Iterator<AbstractC10245Gsg> it = this.A03.iterator();
        while (it.hasNext()) {
            it.next().A01();
        }
    }

    public final void A06() {
        ArrayList<AbstractC10245Gsg> arrayList = this.A03;
        this.A01 = arrayList.size();
        this.A00 = 0;
        Iterator<AbstractC10245Gsg> it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00 += it.next().A00();
        }
        List<AbstractC10245Gsg> list = this.A04;
        list.clear();
        list.addAll(arrayList);
        list.sort(Comparator.comparingInt(new ToIntFunction() { // from class: X.Gsp
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((AbstractC10245Gsg) obj).A00();
            }
        }));
        Iterator<AbstractC10245Gsg> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (it2.next().A02()) {
                this.A02 = true;
                return;
            }
        }
    }
}
