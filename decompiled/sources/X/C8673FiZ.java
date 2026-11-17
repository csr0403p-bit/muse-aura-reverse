package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FiZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8673FiZ implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8663FiO, InterfaceC8694Fiu {
    public C8701Fj1 A00;
    public List<InterfaceC8790FkU> A01;
    public final Matrix A02;
    public final String A03;
    public final List<InterfaceC8698Fiy> A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final C8659FiK A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8673FiZ(C6837Eap c6837Eap, C8659FiK c8659FiK, C8679Fif c8679Fif, AbstractC8671FiX abstractC8671FiX) {
        C8728FjT c8728FjT;
        String str = c8679Fif.A00;
        boolean z = c8679Fif.A02;
        List<InterfaceC8696Fiw> list = c8679Fif.A01;
        ArrayList arrayListA0t = C60Q.A0t(list);
        for (int i = 0; i < list.size(); i++) {
            InterfaceC8698Fiy interfaceC8698FiyAgv = list.get(i).Agv(c6837Eap, c8659FiK, abstractC8671FiX);
            if (interfaceC8698FiyAgv != null) {
                arrayListA0t.add(interfaceC8698FiyAgv);
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                c8728FjT = null;
                break;
            }
            InterfaceC8696Fiw interfaceC8696Fiw = list.get(i2);
            if (interfaceC8696Fiw instanceof C8728FjT) {
                c8728FjT = (C8728FjT) interfaceC8696Fiw;
                break;
            }
            i2++;
        }
        this(c8659FiK, c8728FjT, abstractC8671FiX, str, arrayListA0t, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC8790FkU> A00() {
        if (this.A01 == null) {
            this.A01 = C3cG.A0h();
            int i = 0;
            while (true) {
                List<InterfaceC8698Fiy> list = this.A04;
                if (i >= list.size()) {
                    break;
                }
                InterfaceC8698Fiy interfaceC8698Fiy = list.get(i);
                if (interfaceC8698Fiy instanceof InterfaceC8790FkU) {
                    this.A01.add(interfaceC8698Fiy);
                }
                i++;
            }
        }
        return this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        C8701Fj1 c8701Fj1 = this.A00;
        if (c8701Fj1 != null) {
            c8701Fj1.A04(c8682Fii, obj);
        }
    }

    @Override // X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.A0A) {
            return;
        }
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        C8701Fj1 c8701Fj1 = this.A00;
        if (c8701Fj1 != null) {
            matrix2.preConcat(c8701Fj1.A00());
            i = (int) (((((c8701Fj1.A02 == null ? 100 : AnonymousClass001.A0F(r0.A06())) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.A09.A0L) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                List<InterfaceC8698Fiy> list = this.A04;
                if (i2 >= list.size()) {
                    break;
                }
                if (!(list.get(i2) instanceof InterfaceC8694Fiu) || (i3 = i3 + 1) < 2) {
                    i2++;
                } else if (i != 255) {
                    z = true;
                    RectF rectF = this.A07;
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    AD3(matrix2, rectF, true);
                    Paint paint = this.A05;
                    paint.setAlpha(i);
                    canvas.saveLayer(rectF, paint);
                    i = 255;
                }
            }
            z = false;
        } else {
            z = false;
        }
        List<InterfaceC8698Fiy> list2 = this.A04;
        for (int iA0J = AbstractC7607F5u.A0J(list2, 1); iA0J >= 0; iA0J--) {
            InterfaceC8698Fiy interfaceC8698Fiy = list2.get(iA0J);
            if (interfaceC8698Fiy instanceof InterfaceC8694Fiu) {
                ((InterfaceC8694Fiu) interfaceC8698Fiy).A9E(canvas, matrix2, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        C8701Fj1 c8701Fj1 = this.A00;
        if (c8701Fj1 != null) {
            matrix2.preConcat(c8701Fj1.A00());
        }
        RectF rectF2 = this.A08;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<InterfaceC8698Fiy> list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC8698Fiy interfaceC8698Fiy = list.get(size);
            if (interfaceC8698Fiy instanceof InterfaceC8694Fiu) {
                ((InterfaceC8694Fiu) interfaceC8698Fiy).AD3(matrix2, rectF2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        Matrix matrix = this.A02;
        matrix.reset();
        C8701Fj1 c8701Fj1 = this.A00;
        if (c8701Fj1 != null) {
            matrix.set(c8701Fj1.A00());
        }
        Path path = this.A06;
        path.reset();
        if (!this.A0A) {
            List<InterfaceC8698Fiy> list = this.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC8698Fiy interfaceC8698Fiy = list.get(size);
                if (interfaceC8698Fiy instanceof InterfaceC8790FkU) {
                    path.addPath(((InterfaceC8790FkU) interfaceC8698Fiy).AId(), matrix);
                }
            }
        }
        return path;
    }

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A09.invalidateSelf();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        String str = this.A03;
        if (!c8669FiV.A02(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            C8669FiV c8669FiV3 = new C8669FiV(c8669FiV2);
            c8669FiV3.A01.add(str);
            c8669FiV2 = c8669FiV3;
            if (c8669FiV.A01(str, i)) {
                C8669FiV c8669FiV4 = new C8669FiV(c8669FiV3);
                c8669FiV4.A00 = this;
                list.add(c8669FiV4);
            }
        }
        if (!c8669FiV.A03(str, i)) {
            return;
        }
        int iA00 = i + c8669FiV.A00(str, i);
        int i2 = 0;
        while (true) {
            List<InterfaceC8698Fiy> list2 = this.A04;
            if (i2 >= list2.size()) {
                return;
            }
            InterfaceC8698Fiy interfaceC8698Fiy = list2.get(i2);
            if (interfaceC8698Fiy instanceof InterfaceC8663FiO) {
                ((InterfaceC8663FiO) interfaceC8698Fiy).AbZ(c8669FiV, c8669FiV2, list, iA00);
            }
            i2++;
        }
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A03;
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        int size = list.size();
        List<InterfaceC8698Fiy> list3 = this.A04;
        ArrayList arrayListA11 = C60O.A11(size + list3.size());
        arrayListA11.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            InterfaceC8698Fiy interfaceC8698Fiy = list3.get(size2);
            interfaceC8698Fiy.AdB(arrayListA11, list3.subList(0, size2));
            arrayListA11.add(interfaceC8698Fiy);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiK;LX/FiX;Ljava/lang/String;ZLjava/util/List<LX/Fiy;>;LX/FjT;)V */
    public C8673FiZ(C8659FiK c8659FiK, C8728FjT c8728FjT, AbstractC8671FiX abstractC8671FiX, String str, List list, boolean z) {
        this.A05 = new HrG();
        this.A07 = AbstractC7607F5u.A0Y();
        this.A02 = BV4.A08();
        this.A06 = AbstractC7607F5u.A0V();
        this.A08 = AbstractC7607F5u.A0Y();
        this.A03 = str;
        this.A09 = c8659FiK;
        this.A0A = z;
        this.A04 = list;
        if (c8728FjT != null) {
            C8701Fj1 c8701Fj1 = new C8701Fj1(c8728FjT);
            this.A00 = c8701Fj1;
            c8701Fj1.A03(abstractC8671FiX);
            this.A00.A02(this);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof InterfaceC8789FkT) {
                arrayListA0h.add(obj);
            }
        }
        int size2 = arrayListA0h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((InterfaceC8789FkT) arrayListA0h.get(size2)).A2r(list.listIterator(list.size()));
            }
        }
    }
}
