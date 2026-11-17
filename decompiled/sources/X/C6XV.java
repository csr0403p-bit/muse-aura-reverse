package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.6XV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XV implements InterfaceC1180Adj {
    public final MutableState<Boolean> A02;
    public final MutableState<Boolean> A03;
    public final MutableState<Boolean> A04;
    public final G0U<Float, Float> A05;
    public final C3Q0 A01 = new C3Q0() { // from class: X.6XW
        @Override // X.C3Q0
        public final float AcG(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            C6XV c6xv = this.A00;
            float fA02 = AnonymousClass001.A02(c6xv.A05.invoke(Float.valueOf(f)));
            MutableState.A09(AnonymousClass002.A1N((fA02 > 0.0f ? 1 : (fA02 == 0.0f ? 0 : -1))), c6xv.A03);
            MutableState.A09(fA02 < 0.0f, c6xv.A02);
            return fA02;
        }
    };
    public final C5WW A00 = new C5WW();

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC1180Adj
    public final Object AcF(C3UY c3uy, HtJ htJ, G0V g0v) {
        return C3cG.A0U(Hxb.A00(new C07268if(g0v, this, c3uy, null, 1), htJ));
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return AnonymousClass001.A02(this.A05.invoke(Float.valueOf(f)));
    }

    @Override // X.InterfaceC1180Adj
    public final /* synthetic */ boolean ADN() {
        return true;
    }

    @Override // X.InterfaceC1180Adj
    public final /* synthetic */ boolean ADO() {
        return true;
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return MutableState.A0A((MutableState) this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6XV(G0U<? super Float, Float> g0u) {
        this.A05 = g0u;
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE ageA01 = AGF.A01();
        this.A04 = C3cG.A08(ageA01, boolA0h);
        this.A03 = C3cG.A08(ageA01, boolA0h);
        this.A02 = C3cG.A08(ageA01, boolA0h);
    }
}
