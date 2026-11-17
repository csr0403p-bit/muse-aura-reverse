package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class BkB {
    public final List<C2770Bkg> A00;
    public final List<C2770Bkg> A01;
    public final List<C2770Bkg> A02;

    public BkB(List list, List list2, List list3) {
        this.A01 = Collections.unmodifiableList(list2);
        this.A00 = Collections.unmodifiableList(list);
        this.A02 = Collections.unmodifiableList(list3);
    }
}
