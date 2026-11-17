package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.Fj9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8708Fj9 implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8792FkW {
    public boolean A00;
    public final C8659FiK A01;
    public final Path A02 = AbstractC7607F5u.A0V();
    public final C8735Fja A03 = new C8735Fja();
    public final C8700Fj0 A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // X.InterfaceC8698Fiy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AdB(java.util.List<X.InterfaceC8698Fiy> r7, java.util.List<X.InterfaceC8698Fiy> r8) {
        /*
            r6 = this;
            r5 = 0
            r4 = 0
        L2:
            int r0 = r7.size()
            if (r4 >= r0) goto L39
            java.lang.Object r3 = r7.get(r4)
            X.Fiy r3 = (X.InterfaceC8698Fiy) r3
            boolean r0 = r3 instanceof X.C8723FjO
            if (r0 == 0) goto L2a
            r2 = r3
            X.FjO r2 = (X.C8723FjO) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L2a
            X.Fja r0 = r6.A03
            java.util.List<X.FjO> r0 = r0.A00
            r0.add(r2)
            java.util.List<X.FkY> r0 = r2.A04
            r0.add(r6)
        L27:
            int r4 = r4 + 1
            goto L2
        L2a:
            boolean r0 = r3 instanceof X.C8740Fjf
            if (r0 == 0) goto L27
            if (r5 != 0) goto L35
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L35:
            r5.add(r3)
            goto L27
        L39:
            X.Fj0 r0 = r6.A04
            r0.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8708Fj9.AdB(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        if (obj == InterfaceC8702Fj2.A02) {
            this.A04.A0A(c8682Fii);
        }
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        if (this.A00 && ((AbstractC8724FjP) this.A04).A03 == null) {
            return this.A02;
        }
        Path path = this.A02;
        path.reset();
        if (!this.A06) {
            Path pathA06 = this.A04.A06();
            if (pathA06 == null) {
                return path;
            }
            path.set(pathA06);
            path.setFillType(Path.FillType.EVEN_ODD);
            this.A03.A00(path);
        }
        this.A00 = true;
        return path;
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A05;
    }

    public C8708Fj9(C8659FiK c8659FiK, C8741Fjg c8741Fjg, AbstractC8671FiX abstractC8671FiX) {
        this.A05 = c8741Fjg.A01;
        this.A06 = c8741Fjg.A02;
        this.A01 = c8659FiK;
        C8700Fj0 c8700Fj0 = new C8700Fj0(c8741Fjg.A00.A00);
        this.A04 = c8700Fj0;
        abstractC8671FiX.A07(c8700Fj0);
        c8700Fj0.A09(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
