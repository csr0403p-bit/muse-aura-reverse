package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class BLS {
    public static final BG3 A00(List<BG3> list) {
        Integer numValueOf = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            numValueOf = Integer.valueOf(numValueOf.intValue() | list.get(i).A00);
        }
        return new BG3(numValueOf.intValue());
    }
}
