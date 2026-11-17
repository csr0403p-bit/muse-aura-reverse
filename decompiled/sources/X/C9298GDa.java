package X;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.GDa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9298GDa extends AbstractC9300GDc {
    public static final Class<?> A00 = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: INVOKE (r2 I:java.lang.Object) = (r3v0 ?? I:java.lang.Object), (r5 I:long) STATIC call: X.GGb.A00(java.lang.Object, long):java.lang.Object A[MD:(java.lang.Object, long):java.lang.Object (m)] (LINE:3), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    public static <L> List<L> A00(Object obj, long j, int i) {
        ?? A002;
        GDY gdy;
        List<L> listA11;
        List<L> list = (List) AbstractC9365GGb.A00(obj, A002);
        if (list.isEmpty()) {
            if (list instanceof Hl2) {
                Hl2 hl2 = GDY.A01;
                listA11 = new GDY(C60O.A11(j));
            } else {
                listA11 = C60O.A11(j);
            }
            C9400GHp.A06(obj, A002, listA11);
            return listA11;
        }
        if (BV6.A1Y(A00, list)) {
            gdy = C60O.A11(list.size() + j);
        } else {
            if (!(list instanceof HwJ)) {
                return list;
            }
            Hl2 hl22 = GDY.A01;
            gdy = new GDY(C60O.A11(list.size() + j));
        }
        ((AbstractCollection) gdy).addAll(list);
        C9400GHp.A06(obj, A002, gdy);
        return (List<L>) gdy;
    }
}
