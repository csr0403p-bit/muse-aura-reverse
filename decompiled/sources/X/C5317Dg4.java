package X;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: X.Dg4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5317Dg4 implements Dg3 {
    public final Dg5 A00;
    public final Dg3 A01;

    public C5317Dg4(Dg5 dg5, Dg3 dg3) {
        C7384Etj.A0Y(dg5, 0);
        this.A00 = dg5;
        this.A01 = dg3;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C7384Etj.A0Y(c1hy, 0);
        C7384Etj.A0Y(enumC3085Bxl, 1);
        switch (enumC3085Bxl.ordinal()) {
            case 0:
                this.A00.onCreate(c1hy);
                break;
            case 1:
                this.A00.onStart(c1hy);
                break;
            case 2:
                this.A00.onResume(c1hy);
                break;
            case 3:
                this.A00.onPause(c1hy);
                break;
            case 4:
                this.A00.onStop(c1hy);
                break;
            case 5:
                this.A00.onDestroy(c1hy);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        Dg3 dg3 = this.A01;
        if (dg3 != null) {
            dg3.onStateChanged(c1hy, enumC3085Bxl);
        }
    }
}
