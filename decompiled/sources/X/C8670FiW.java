package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FiW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8670FiW extends AbstractC8671FiX {
    public boolean A00;
    public AbstractC8724FjP<Float, Float> A01;
    public final Paint A02;
    public final RectF A03;
    public final List<AbstractC8671FiX> A04;
    public final RectF A05;

    /* JADX WARN: Incorrect types in method signature: (LX/FiK;LX/Fib;Ljava/util/List<LX/Fib;>;LX/Eap;)V */
    public C8670FiW(C6837Eap c6837Eap, C8659FiK c8659FiK, C8675Fib c8675Fib, List list) {
        AbstractC8671FiX abstractC8671FiX;
        AbstractC8671FiX c8677Fid;
        String str;
        super(c8659FiK, c8675Fib);
        this.A04 = C3cG.A0h();
        this.A05 = AbstractC7607F5u.A0Y();
        this.A03 = AbstractC7607F5u.A0Y();
        this.A02 = AbstractC7607F5u.A0T();
        this.A00 = true;
        C8689Fip c8689Fip = c8675Fib.A0A;
        if (c8689Fip != null) {
            C8720FjL c8720FjLA01 = C8720FjL.A01(c8689Fip);
            this.A01 = c8720FjLA01;
            A07(c8720FjLA01);
            this.A01.A09(this);
        } else {
            this.A01 = null;
        }
        C1685AoO c1685AoO = new C1685AoO(c6837Eap.A08.size());
        int iA0J = AbstractC7607F5u.A0J(list, 1);
        AbstractC8671FiX abstractC8671FiX2 = null;
        while (true) {
            if (iA0J < 0) {
                for (int i = 0; i < c1685AoO.A00(); i++) {
                    AbstractC8671FiX abstractC8671FiX3 = (AbstractC8671FiX) c1685AoO.A04(c1685AoO.A02(i));
                    if (abstractC8671FiX3 != null && (abstractC8671FiX = (AbstractC8671FiX) c1685AoO.A04(abstractC8671FiX3.A0L.A08)) != null) {
                        abstractC8671FiX3.A05 = abstractC8671FiX;
                    }
                }
                return;
            }
            C8675Fib c8675Fib2 = (C8675Fib) list.get(iA0J);
            int iIntValue = c8675Fib2.A0H.intValue();
            switch (iIntValue) {
                case 0:
                    c8677Fid = new C8670FiW(c6837Eap, c8659FiK, c8675Fib2, c6837Eap.A0C.get(c8675Fib2.A0K));
                    break;
                case 1:
                    c8677Fid = new C10435Hhg(c8659FiK, c8675Fib2);
                    break;
                case 2:
                    c8677Fid = new Htb(c8659FiK, c8675Fib2);
                    break;
                case 3:
                    c8677Fid = new C10523Hoq(c8659FiK, c8675Fib2);
                    break;
                case 4:
                    c8677Fid = new C8677Fid(c6837Eap, c8659FiK, this, c8675Fib2);
                    break;
                case 5:
                    c8677Fid = new C8672FiY(c8659FiK, c8675Fib2);
                    break;
                default:
                    switch (iIntValue) {
                        case 1:
                            str = "SOLID";
                            break;
                        case 2:
                            str = "IMAGE";
                            break;
                        case 3:
                            str = "NULL";
                            break;
                        case 4:
                            str = "SHAPE";
                            break;
                        case 5:
                            str = "TEXT";
                            break;
                        case 6:
                            str = "UNKNOWN";
                            break;
                        default:
                            str = "PRE_COMP";
                            break;
                    }
                    BXP.A00(FGI.A0M("Unknown layer type ", str));
                    continue;
                    iA0J--;
            }
            c1685AoO.A08(c8677Fid.A0L.A07, c8677Fid);
            if (abstractC8671FiX2 != null) {
                abstractC8671FiX2.A04 = c8677Fid;
                abstractC8671FiX2 = null;
            } else {
                this.A04.add(0, c8677Fid);
                int iIntValue2 = c8675Fib2.A0I.intValue();
                if (iIntValue2 == 1 || iIntValue2 == 2) {
                    abstractC8671FiX2 = c8677Fid;
                }
            }
            iA0J--;
        }
    }

    @Override // X.AbstractC8671FiX
    public final void A06(float f) {
        super.A06(f);
        AbstractC8724FjP<Float, Float> abstractC8724FjP = this.A01;
        if (abstractC8724FjP != null) {
            C6837Eap c6837Eap = this.A0J.A0C;
            float f2 = (c6837Eap.A00 - c6837Eap.A03) + 0.01f;
            C6837Eap c6837Eap2 = this.A0L.A09;
            f = ((AbstractC8724FjP.A02(abstractC8724FjP) * c6837Eap2.A01) - c6837Eap2.A03) / f2;
        }
        if (this.A01 == null) {
            C8675Fib c8675Fib = this.A0L;
            float f3 = c8675Fib.A02;
            C6837Eap c6837Eap3 = c8675Fib.A09;
            f -= f3 / (c6837Eap3.A00 - c6837Eap3.A03);
        }
        C8675Fib c8675Fib2 = this.A0L;
        float f4 = c8675Fib2.A03;
        if (f4 != 0.0f && !"__container".equals(c8675Fib2.A0J)) {
            f /= f4;
        }
        List<AbstractC8671FiX> list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).A06(f);
            }
        }
    }

    @Override // X.AbstractC8671FiX
    public final void A09(boolean z) {
        super.A09(z);
        Iterator<AbstractC8671FiX> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().A09(z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.AbstractC8671FiX, X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        super.A41(c8682Fii, obj);
        if (obj == InterfaceC8702Fj2.A0S) {
            if (c8682Fii == null) {
                AbstractC8724FjP<Float, Float> abstractC8724FjP = this.A01;
                if (abstractC8724FjP != null) {
                    abstractC8724FjP.A0A(null);
                    return;
                }
                return;
            }
            C8730FjV c8730FjVA00 = C8730FjV.A00(c8682Fii);
            this.A01 = c8730FjVA00;
            c8730FjVA00.A09(this);
            A07(this.A01);
        }
    }

    @Override // X.AbstractC8671FiX, X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        super.AD3(matrix, rectF, z);
        List<AbstractC8671FiX> list = this.A04;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A05;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            list.get(size).AD3(this.A0A, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
