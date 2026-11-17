package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.FjA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8709FjA implements InterfaceC8790FkU, InterfaceC8793FkY, InterfaceC8792FkW {
    public boolean A00;
    public final C8659FiK A01;
    public final Path A02 = AbstractC7607F5u.A0V();
    public final C8735Fja A03 = new C8735Fja();
    public final AbstractC8724FjP<?, PointF> A04;
    public final AbstractC8724FjP<?, PointF> A05;
    public final C8745Fjk A06;
    public final String A07;

    @Override // X.InterfaceC8793FkY
    public final void AX2() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    @Override // X.InterfaceC8698Fiy
    public final void AdB(List<InterfaceC8698Fiy> list, List<InterfaceC8698Fiy> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC8698Fiy interfaceC8698Fiy = list.get(i);
            if (interfaceC8698Fiy instanceof C8723FjO) {
                C8723FjO c8723FjO = (C8723FjO) interfaceC8698Fiy;
                if (c8723FjO.A03 == C79.A00) {
                    this.A03.A00.add(c8723FjO);
                    c8723FjO.A04.add(this);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/Fii<TT;>;)V */
    @Override // X.InterfaceC8663FiO
    public final void A41(C8682Fii c8682Fii, Object obj) {
        AbstractC8724FjP<?, PointF> abstractC8724FjP;
        if (obj == InterfaceC8702Fj2.A03) {
            abstractC8724FjP = this.A05;
        } else if (obj != InterfaceC8702Fj2.A04) {
            return;
        } else {
            abstractC8724FjP = this.A04;
        }
        abstractC8724FjP.A0A(c8682Fii);
    }

    @Override // X.InterfaceC8790FkU
    public final Path AId() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            C8745Fjk c8745Fjk = this.A06;
            if (!c8745Fjk.A03) {
                PointF pointFA06 = this.A05.A06();
                float f = pointFA06.x / 2.0f;
                float f2 = pointFA06.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                path.reset();
                if (c8745Fjk.A04) {
                    float f5 = -f2;
                    path.moveTo(0.0f, f5);
                    float f6 = 0.0f - f3;
                    float f7 = -f;
                    float f8 = 0.0f - f4;
                    path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    path.cubicTo(f10, f2, f, f9, f, 0.0f);
                    path.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    path.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = 0.0f - f4;
                    path.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    path.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = 0.0f - f3;
                    float f16 = -f;
                    path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
                }
                PointF pointFA062 = this.A04.A06();
                path.offset(pointFA062.x, pointFA062.y);
                path.close();
                this.A03.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    @Override // X.InterfaceC8698Fiy
    public final String getName() {
        return this.A07;
    }

    public C8709FjA(C8659FiK c8659FiK, C8745Fjk c8745Fjk, AbstractC8671FiX abstractC8671FiX) {
        this.A07 = c8745Fjk.A02;
        this.A01 = c8659FiK;
        C8716FjH c8716FjH = new C8716FjH(c8745Fjk.A00.A00);
        this.A05 = c8716FjH;
        AbstractC8724FjP<PointF, PointF> abstractC8724FjPA7a = c8745Fjk.A01.A7a();
        this.A04 = abstractC8724FjPA7a;
        this.A06 = c8745Fjk;
        abstractC8671FiX.A07(c8716FjH);
        abstractC8671FiX.A07(abstractC8724FjPA7a);
        c8716FjH.A09(this);
        abstractC8724FjPA7a.A09(this);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FiV;ILjava/util/List<LX/FiV;>;LX/FiV;)V */
    @Override // X.InterfaceC8663FiO
    public final void AbZ(C8669FiV c8669FiV, C8669FiV c8669FiV2, List list, int i) {
        AbstractC8699Fiz.A02(this, c8669FiV, c8669FiV2, list, i);
    }
}
