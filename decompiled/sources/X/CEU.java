package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CEU {
    public final List A00;
    public final List A01;

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.A00, this.A01);
    }

    public /* synthetic */ CEU(List list, List list2) {
        this.A00 = BV4.A0t(list);
        this.A01 = BV4.A0t(list2);
    }
}
