package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class AIM {
    public static final <E> List<E> A18(List<E> list) {
        C7384Etj.A0Y(list, 0);
        AII aii = (AII) list;
        AII.A06(aii);
        aii.isReadOnly = true;
        return aii.length <= 0 ? AII.A00 : aii;
    }

    public static final <E> List<E> A17() {
        AII aii = new AII();
        aii.backing = (E[]) new Object[10];
        return aii;
    }
}
