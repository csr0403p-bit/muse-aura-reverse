package X;

import java.util.Set;

/* loaded from: classes5.dex */
public final class DMW implements DKb {
    public final /* synthetic */ DMV A00;

    @Override // X.DKb
    public final void AU0(int i, int i2, String str, double d) {
    }

    @Override // X.DKb
    public final void AU1(int i, int i2, String str, int i3) {
    }

    @Override // X.DKb
    public final void AU2(int i, int i2, String str, long j) {
    }

    @Override // X.DKb
    public final void AU3(int i, int i2, String str, String str2) {
    }

    @Override // X.DKb
    public final void AU4(int i, int i2, String str, boolean z) {
    }

    @Override // X.DKb
    public final void AU5(int i, int i2, String str, String[] strArr) {
    }

    public DMW(DMV dmv) {
        this.A00 = dmv;
    }

    @Override // X.DKb
    public final void AU6(int i, int i2, long j, long j2, short s) {
        DMV dmv = this.A00;
        if (i == dmv.A01 && i2 == dmv.A00 && BV4.A1V(dmv.A04)) {
            C4983DKa c4983DKa = dmv.A03;
            DMW dmw = dmv.A02;
            C7384Etj.A0Y(dmw, 0);
            Set<DKb> set = c4983DKa.A00;
            synchronized (set) {
                set.remove(dmw);
            }
        }
    }

    @Override // X.DKb
    public final void AU8(int i, int i2, long j) {
    }

    @Override // X.DKb
    public final void AU7(String str, int i, int i2, String str2, long j) {
    }
}
