package androidx.compose.foundation.lazy.staggeredgrid;

import X.A4A;
import X.AFs;
import X.AGE;
import X.AGG;
import X.Ab2;
import X.AbstractC0871AFr;
import X.AbstractC0878AGe;
import X.AbstractC1199AeV;
import X.AbstractC1489Ajw;
import X.Ac3;
import X.Acy;
import X.AnonymousClass001;
import X.Av9;
import X.BUQ;
import X.C1057ATe;
import X.C1145Aby;
import X.C1198AeU;
import X.C1200AeW;
import X.C1201AeX;
import X.C1203AeZ;
import X.C1229Af7;
import X.C1qN;
import X.C2279BSf;
import X.C2282BSi;
import X.C2289BSp;
import X.C2295BSv;
import X.C3cG;
import X.C6XV;
import X.InterfaceC1072AWd;
import X.InterfaceC1147Ac5;
import X.InterfaceC1180Adj;
import X.InterfaceC1195AeC;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LazyStaggeredGridState implements InterfaceC1180Adj {
    public static final AFs<LazyStaggeredGridState, Object> A0N = AbstractC0871AFr.A00(new C2279BSf(2), C2282BSi.A00(5));
    public float A00;
    public int A01;
    public C1198AeU A02;
    public InterfaceC1147Ac5 A03;
    public boolean A04;
    public final C1057ATe A05;
    public final C1201AeX A06;
    public final C1200AeW A07;
    public final MutableState A08;
    public final MutableState A09;
    public final MutableState<C1198AeU> A0A;
    public final MutableState<Unit> A0B;
    public final Ab2<Ac3> A0C;
    public final InterfaceC1180Adj A0D;
    public final InterfaceC1072AWd A0E;
    public final Av9 A0F;
    public final C1145Aby A0G;
    public final Acy A0H;
    public final A4A A0I;
    public final C1229Af7 A0J;
    public final C1203AeZ A0K;
    public final MutableState<Unit> A0L;
    public final InterfaceC1195AeC A0M;

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // X.InterfaceC1180Adj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AcF(X.C3UY r7, X.HtJ r8, X.G0V r9) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = r8 instanceof X.C2314BTo
            if (r0 == 0) goto L62
            r5 = r8
            X.BTo r5 = (X.C2314BTo) r5
            int r0 = r5.$t
            if (r0 != r3) goto L62
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L47
            if (r0 != r3) goto L68
            X.Hwg.A00(r1)
        L28:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2b:
            X.Hwg.A00(r1)
            androidx.compose.runtime.MutableState<X.AeU> r0 = r6.A0A
            java.lang.Object r1 = r0.getValue()
            X.AeU r0 = X.AbstractC1199AeV.A00
            if (r1 != r0) goto L52
            X.Av9 r0 = r6.A0F
            r5.A01 = r7
            r5.A02 = r9
            r5.A00 = r2
            java.lang.Object r0 = r0.A00(r5)
            if (r0 != r4) goto L52
            return r4
        L47:
            java.lang.Object r9 = r5.A02
            X.G0V r9 = (X.G0V) r9
            java.lang.Object r7 = r5.A01
            X.3UY r7 = (X.C3UY) r7
            X.Hwg.A00(r1)
        L52:
            X.Adj r1 = r6.A0D
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.AcF(r7, r5, r9)
            if (r0 != r4) goto L28
            return r4
        L62:
            X.BTo r5 = new X.BTo
            r5.<init>(r6, r8, r3)
            goto L17
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.AcF(X.3UY, X.HtJ, X.G0V):java.lang.Object");
    }

    public static final void A00(C1198AeU c1198AeU, float f) {
        List list = c1198AeU.A0B;
        if (list.isEmpty()) {
            return;
        }
        if (f < 0.0f) {
            AbstractC0878AGe.A0H(list);
            throw new NullPointerException("getIndex");
        }
        AbstractC0878AGe.A0F(list);
        throw new NullPointerException("getIndex");
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A0D.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return MutableState.A0A(this.A08);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return MutableState.A0A(this.A09);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A0D.AOz();
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.A07 = new C1200AeW(new BUQ(this, 1), iArr, iArr2);
        C1198AeU c1198AeU = AbstractC1199AeV.A00;
        AGG agg = AGG.A00;
        this.A0A = C3cG.A08(agg, c1198AeU);
        this.A0K = new C1203AeZ(this);
        this.A06 = new C1201AeX();
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A09 = C3cG.A08(age, boolA0h);
        this.A08 = C3cG.A08(age, boolA0h);
        this.A0M = new C2289BSp(this, 2);
        this.A0F = new Av9();
        this.A0G = new C1145Aby();
        C1229Af7 c1229Af7 = new C1229Af7();
        c1229Af7.A04 = null;
        this.A0J = c1229Af7;
        this.A0D = new C6XV(C2295BSv.A00(this, 42));
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A0C = Ab2.A01();
        this.A0E = new C1qN();
        this.A0I = new A4A();
        this.A0H = new Acy();
        Unit unit = Unit.INSTANCE;
        this.A0B = C3cG.A08(agg, unit);
        this.A0L = C3cG.A08(agg, unit);
        this.A05 = new C1057ATe();
    }
}
