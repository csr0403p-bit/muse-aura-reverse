package X;

import java.util.Set;

/* loaded from: classes5.dex */
public final class DWs {
    public final Set A00;
    public final boolean A01;

    public DWs() {
        this.A00 = CO7.A02;
        this.A01 = false;
    }

    public final DWt A00(boolean z) {
        return new DWt(new DWu(DWx.A00, new DX0(), this.A00), Boolean.valueOf(z));
    }

    public DWs(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }
}
