package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes4.dex */
public abstract class AYU implements AXN {
    public boolean A00;

    public static final void A01(GraphicsLayer graphicsLayer, AYU ayu, AZE aze, long j) {
        if (ayu.A09() != EnumC1820Arj.A02 && ayu.A07() != 0) {
            j = AnonymousClass002.A0G(AnonymousClass002.A09(j), ((ayu.A07() - aze.A01) - ((int) (j >> 32))) << 32);
        }
        aze.A0a(graphicsLayer, 0.0f, A00(ayu, aze, j));
    }

    public static void A02(AYU ayu, AZE aze) {
        ayu.A0A(aze, 0.0f, 0, 0);
    }

    public static final void A04(AYU ayu, AZE aze, int i, int i2) {
        long jA02;
        long j = (i << 32) | (i2 & 4294967295L);
        if (ayu.A09() == EnumC1820Arj.A02 || ayu.A07() == 0) {
            A03(ayu, aze);
            jA02 = C2ae.A02(j, aze.A02);
        } else {
            A03(ayu, aze);
            jA02 = C2ae.A02((((ayu.A07() - aze.A01) - ((int) (j >> 32))) << 32) | (AnonymousClass002.A09(j) & 4294967295L), aze.A02);
        }
        aze.A0b(null, 0.0f, jA02);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AZE;IIFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    public static final void A05(AYU ayu, AZE aze, G0U g0u, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        aze.A0b(g0u, 0.0f, (ayu.A09() == EnumC1820Arj.A02 || ayu.A07() == 0) ? A00(ayu, aze, j) : A00(ayu, aze, C8j3.A0R((ayu.A07() - aze.A01) - ((int) (j >> 32)), AnonymousClass002.A09(j))));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AZE;JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    public static final void A06(AYU ayu, AZE aze, G0U g0u, long j) {
        if (ayu.A09() != EnumC1820Arj.A02 && ayu.A07() != 0) {
            j = AnonymousClass002.A0G(AnonymousClass002.A09(j), ((ayu.A07() - aze.A01) - ((int) (j >> 32))) << 32);
        }
        aze.A0b(g0u, 0.0f, A00(ayu, aze, j));
    }

    public abstract EnumC1820Arj A09();

    public final void A0A(AZE aze, float f, int i, int i2) {
        A03(this, aze);
        aze.A0b(null, f, C2ae.A02((i2 & 4294967295L) | (i << 32), aze.A02));
    }

    public final void A0C(AZE aze, G0U g0u, int i, int i2) {
        A03(this, aze);
        aze.A0b(g0u, 0.0f, C2ae.A02((i2 & 4294967295L) | (i << 32), aze.A02));
    }

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AEm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(AYU ayu, AZE aze) {
        if (aze instanceof AYV) {
            ((AYV) aze).Ahz(ayu.A00);
        }
    }

    public final int A07() {
        return this instanceof C1465AjY ? ((AZE) ((AndroidComposeView) ((C1465AjY) this).A00).A0n.A0d.A0G).A01 : ((C1426Aiv) this).A00.A0Z();
    }

    public InterfaceC1497Ak4 A08() {
        return ((AndroidComposeView) ((C1465AjY) this).A00).A0n.A0f.A04;
    }

    public static long A00(AYU ayu, AZE aze, long j) {
        A03(ayu, aze);
        return C2ae.A02(j, aze.A02);
    }

    public final void A0B(AZE aze, float f, long j) {
        A03(this, aze);
        aze.A0b(null, f, C2ae.A02(j, aze.A02));
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
