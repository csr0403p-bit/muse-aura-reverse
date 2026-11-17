package X;

import android.view.View;

/* loaded from: classes6.dex */
public abstract class FHi<T extends View, U> extends FGT<T> implements InterfaceC7830FGl<T> {
    public FDW A00;
    public final long A01;
    public final boolean A02;

    public static Integer A00(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, int i) {
        FDW fdwA0C = fdw.A0C(i);
        if (fdwA0C != null) {
            return Integer.valueOf(HlW.A00(fdwA0C, interfaceC10557Hsn, 0));
        }
        return null;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ FEZ AIs() {
        return this instanceof FEX ? FEY.A00 : this instanceof C7787FEs ? ((C7787FEs) this).A02 : Hnn.A00;
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ int AY3() {
        return 3;
    }

    public FHi(FBB fbb, FDW fdw) {
        this.A01 = fdw.A04;
        this.A00 = fdw;
        this.A02 = !FBA.A0A(fbb);
        C7834FGp[] c7834FGpArr = {new C7834FGp(new FHj(fbb, this), fdw), new C7834FGp(new C7850FHk(fbb, this), this.A00)};
        int i = 0;
        do {
            A0U(c7834FGpArr[i]);
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC7830FGl
    public final /* synthetic */ Class AIr() {
        return getClass();
    }
}
