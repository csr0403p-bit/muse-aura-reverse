package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Fia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8674Fia implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8694Fiu, InterfaceC8789FkT, InterfaceC8792FkW {
    public C8673FiZ A00;
    public final Matrix A01 = BV4.A08();
    public final Path A02 = AbstractC7607F5u.A0V();
    public final C8659FiK A03;
    public final AbstractC8724FjP<Float, Float> A04;
    public final AbstractC8724FjP<Float, Float> A05;
    public final C8701Fj1 A06;
    public final AbstractC8671FiX A07;
    public final String A08;
    public final boolean A09;

    @Override // X.InterfaceC8789FkT
    public final void A2r(ListIterator<InterfaceC8698Fiy> listIterator) {
        if (this.A00 != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayListA0h = C3cG.A0h();
        while (listIterator.hasPrevious()) {
            arrayListA0h.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayListA0h);
        this.A00 = new C8673FiZ(this.A03, null, this.A07, "Repeater", arrayListA0h, this.A09);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        AbstractC8724FjP<Float, Float> abstractC8724FjP;
        if (this.A06.A04(c8682Fii, obj)) {
            return;
        }
        if (obj == InterfaceC8702Fj2.A0N) {
            abstractC8724FjP = this.A04;
        } else if (obj != InterfaceC8702Fj2.A0O) {
            return;
        } else {
            abstractC8724FjP = this.A05;
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    @Override // X.InterfaceC8694Fiu
    public final void A9E(Canvas canvas, Matrix matrix, int i) {
        float fA02 = AbstractC8724FjP.A02(this.A04);
        float fA022 = AbstractC8724FjP.A02(this.A05);
        C8701Fj1 c8701Fj1 = this.A06;
        float fA023 = AbstractC8724FjP.A02(c8701Fj1.A06) / 100.0f;
        float fA024 = AbstractC8724FjP.A02(c8701Fj1.A01) / 100.0f;
        int i2 = (int) fA02;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.A01;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c8701Fj1.A01(f + fA022));
            PointF pointF = AbstractC8699Fiz.A00;
            this.A00.A9E(canvas, matrix2, (int) (i * AbstractC7607F5u.A01(fA024, fA023, f / fA02)));
        }
    }

    @Override // X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        this.A00.AD3(matrix, rectF, z);
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        Path pathAId = this.A00.AId();
        Path path = this.A02;
        path.reset();
        float fA02 = AbstractC8724FjP.A02(this.A04);
        float fA022 = AbstractC8724FjP.A02(this.A05);
        int i = (int) fA02;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(i + fA022));
            path.addPath(pathAId, matrix);
        }
    }

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A03.invalidateSelf();
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        this.A00.AdB(list, list2);
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A08;
    }

    public C8674Fia(C8659FiK c8659FiK, C8684Fik c8684Fik, AbstractC8671FiX abstractC8671FiX) {
        this.A03 = c8659FiK;
        this.A07 = abstractC8671FiX;
        this.A08 = c8684Fik.A03;
        this.A09 = c8684Fik.A04;
        C8720FjL c8720FjLA01 = C8720FjL.A01(c8684Fik.A00);
        this.A04 = c8720FjLA01;
        abstractC8671FiX.A07(c8720FjLA01);
        c8720FjLA01.A09(this);
        C8720FjL c8720FjLA012 = C8720FjL.A01(c8684Fik.A01);
        this.A05 = c8720FjLA012;
        abstractC8671FiX.A07(c8720FjLA012);
        c8720FjLA012.A09(this);
        C8701Fj1 c8701Fj1 = new C8701Fj1(c8684Fik.A02);
        this.A06 = c8701Fj1;
        c8701Fj1.A03(abstractC8671FiX);
        c8701Fj1.A02(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
        for (int i2 = 0; i2 < this.A00.A04.size(); i2++) {
            InterfaceC8698Fiy interfaceC8698Fiy = this.A00.A04.get(i2);
            if (interfaceC8698Fiy instanceof InterfaceC8792FkW) {
                AbstractC8699Fiz.A02((InterfaceC8792FkW) interfaceC8698Fiy, c8669FiV, c8669FiV2, list, i);
            }
        }
    }
}
