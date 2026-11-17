package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Fj7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8706Fj7 implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8792FkW {
    public boolean A00;
    public final C8659FiK A04;
    public final AbstractC8724FjP<?, Float> A05;
    public final AbstractC8724FjP<?, Float> A06;
    public final AbstractC8724FjP<?, Float> A07;
    public final AbstractC8724FjP<?, Float> A08;
    public final AbstractC8724FjP<?, Float> A09;
    public final AbstractC8724FjP<?, PointF> A0A;
    public final AbstractC8724FjP<?, Float> A0B;
    public final boolean A0C;
    public final Integer A0F;
    public final String A0G;
    public final boolean A0H;
    public final Path A02 = AbstractC7607F5u.A0V();
    public final Path A01 = AbstractC7607F5u.A0V();
    public final PathMeasure A03 = new PathMeasure();
    public final float[] A0D = new float[2];
    public final C8735Fja A0E = new C8735Fja();

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A00 = false;
        this.A04.invalidateSelf();
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC8698Fiy interfaceC8698Fiy = list.get(i);
            if (interfaceC8698Fiy instanceof C8723FjO) {
                C8723FjO c8723FjO = (C8723FjO) interfaceC8698Fiy;
                if (c8723FjO.A03 == C79.A00) {
                    this.A0E.A00.add(c8723FjO);
                    c8723FjO.A04.add(this);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        AbstractC8724FjP abstractC8724FjP;
        if (obj == InterfaceC8702Fj2.A0L) {
            abstractC8724FjP = this.A09;
        } else if (obj == InterfaceC8702Fj2.A0M) {
            abstractC8724FjP = this.A0B;
        } else if (obj == InterfaceC8702Fj2.A04) {
            abstractC8724FjP = this.A0A;
        } else if (obj != InterfaceC8702Fj2.A0H || (abstractC8724FjP = this.A05) == null) {
            if (obj == InterfaceC8702Fj2.A0J) {
                abstractC8724FjP = this.A07;
            } else if (obj != InterfaceC8702Fj2.A0I || (abstractC8724FjP = this.A06) == null) {
                if (obj != InterfaceC8702Fj2.A0K) {
                    return;
                } else {
                    abstractC8724FjP = this.A08;
                }
            }
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01ef  */
    @Override // X.InterfaceC8790FkU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path AId() {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8706Fj7.AId():android.graphics.Path");
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A0G;
    }

    public C8706Fj7(C8659FiK c8659FiK, C8732FjX c8732FjX, AbstractC8671FiX abstractC8671FiX) {
        C8720FjL c8720FjLA01;
        this.A04 = c8659FiK;
        this.A0G = c8732FjX.A08;
        Integer num = c8732FjX.A07;
        this.A0F = num;
        this.A0H = c8732FjX.A09;
        this.A0C = c8732FjX.A0A;
        C8720FjL c8720FjLA012 = C8720FjL.A01(c8732FjX.A04);
        this.A09 = c8720FjLA012;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjPA7a = c8732FjX.A06.A7a();
        this.A0A = abstractC8724FjPA7a;
        C8720FjL c8720FjLA013 = C8720FjL.A01(c8732FjX.A05);
        this.A0B = c8720FjLA013;
        C8720FjL c8720FjLA014 = C8720FjL.A01(c8732FjX.A02);
        this.A07 = c8720FjLA014;
        C8720FjL c8720FjLA015 = C8720FjL.A01(c8732FjX.A03);
        this.A08 = c8720FjLA015;
        Integer num2 = C79.A00;
        if (num == num2) {
            this.A05 = C8720FjL.A01(c8732FjX.A00);
            c8720FjLA01 = C8720FjL.A01(c8732FjX.A01);
        } else {
            c8720FjLA01 = null;
            this.A05 = null;
        }
        this.A06 = c8720FjLA01;
        abstractC8671FiX.A07(c8720FjLA012);
        abstractC8671FiX.A07(abstractC8724FjPA7a);
        abstractC8671FiX.A07(c8720FjLA013);
        abstractC8671FiX.A07(c8720FjLA014);
        abstractC8671FiX.A07(c8720FjLA015);
        if (num == num2) {
            abstractC8671FiX.A07(this.A05);
            abstractC8671FiX.A07(this.A06);
        }
        c8720FjLA012.A09(this);
        abstractC8724FjPA7a.A09(this);
        c8720FjLA013.A09(this);
        c8720FjLA014.A09(this);
        c8720FjLA015.A09(this);
        if (num == num2) {
            this.A05.A09(this);
            this.A06.A09(this);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
