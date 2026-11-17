package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class GOM extends GOR {
    public final C9537GNt A00;

    @Override // X.GOU
    public final String AJ2() {
        String str;
        GON gonA00 = this.A00.A00();
        return (gonA00 == null || (str = gonA00.A02) == null) ? "" : str;
    }

    @Override // X.GOU
    public final long AJ3() {
        GON gonA00 = this.A00.A00();
        if (gonA00 != null) {
            return gonA00.A00;
        }
        return 0L;
    }

    @Override // X.GOU
    public final String AJ4() {
        String str;
        GON gonA00 = this.A00.A00();
        return (gonA00 == null || (str = gonA00.A03) == null) ? "" : str;
    }

    @Override // X.GOU
    public final String AKi() {
        String str = this.A00.A00;
        C7384Etj.A0U(str);
        return str;
    }

    @Override // X.GOU
    public final List<GPO> ALF() {
        return null;
    }

    public GOM(C9537GNt c9537GNt) {
        this.A00 = c9537GNt;
    }

    @Override // X.GOU
    public final C10574Huh AJI() {
        return new C10574Huh((int) (AJ3() / 10000), AJ4());
    }
}
