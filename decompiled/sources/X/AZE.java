package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public abstract class AZE implements C3Tw {
    public int A00;
    public int A01;
    public long A03 = 0 << 32;
    public long A04 = AZF.A00;
    public long A02 = 0;

    public void A0a(GraphicsLayer graphicsLayer, float f, long j) {
        A0b(null, f, j);
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    public abstract void A0b(G0U g0u, float f, long j);

    public static AbstractC1383AiD A00(C1455AjO c1455AjO) {
        AbstractC1383AiD abstractC1383AiDA0l = c1455AjO.A0K.A0F.A0f.A04.A0l();
        C7384Etj.A0X(abstractC1383AiDA0l);
        return abstractC1383AiDA0l;
    }

    private final void A02() {
        long j = this.A03;
        long j2 = this.A04;
        this.A01 = ATD.A04((int) (j >> 32), Constraints.A03(j2), Constraints.A01(j2));
        this.A00 = ATD.A04((int) (j & 4294967295L), Constraints.A02(j2), Constraints.A00(j2));
        this.A02 = (((r3 - r8) / 2) << 32) | (4294967295L & ((r0 - r2) / 2));
    }

    public final void A0W(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            A02();
        }
    }

    public final void A0X(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A02();
        }
    }

    public int A0Y() {
        return (int) (this.A03 & 4294967295L);
    }

    public int A0Z() {
        return (int) (this.A03 >> 32);
    }

    public /* synthetic */ Object AIX() {
        return null;
    }

    public static AbstractC1383AiD A01(AbstractC1387AiH abstractC1387AiH) {
        AbstractC1383AiD abstractC1383AiDA0l = abstractC1387AiH.A0l();
        C7384Etj.A0X(abstractC1383AiDA0l);
        return abstractC1383AiDA0l;
    }

    public static boolean A03(AbstractC1387AiH abstractC1387AiH) {
        return abstractC1387AiH.A0j().isAttached;
    }
}
