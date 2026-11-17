package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HyC implements GOU {
    public final long A00;
    public final String A01;
    public final C10574Huh A02;
    public final String A03;
    public final String A04;

    public HyC(String str, String str2, long j, String str3) {
        C7384Etj.A0Y(str, 0);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = str3;
        this.A02 = new C10574Huh((int) (j / 10000), str3);
    }

    @Override // X.GOU
    public final String AJ2() {
        return this.A03;
    }

    @Override // X.GOU
    public final long AJ3() {
        return this.A00;
    }

    @Override // X.GOU
    public final String AJ4() {
        return this.A01;
    }

    @Override // X.GOU
    public final C10574Huh AJI() {
        return this.A02;
    }

    @Override // X.GOU
    public final String AKi() {
        return this.A04;
    }

    @Override // X.GOU
    public final List<GPO> ALF() {
        return null;
    }
}
