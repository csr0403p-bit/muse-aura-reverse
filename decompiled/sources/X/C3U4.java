package X;

import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* renamed from: X.3U4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3U4 {
    public static BRg A03(BRg bRg, float f) {
        return A0C(bRg, 0.0f, 0.0f, 0.0f, f);
    }

    public static BRg A04(BRg bRg, float f) {
        return A0C(bRg, 0.0f, f, 0.0f, 0.0f);
    }

    public static BRg A05(BRg bRg, float f) {
        return A0C(A0B(bRg, f, 0.0f), AuraDimensKt.SpacingXsmall, 0.0f, 0.0f, 0.0f);
    }

    public static BRg A06(BRg bRg, float f) {
        return A0B(bRg, 0.0f, f);
    }

    public static BRg A07(BRg bRg, float f) {
        return A0B(bRg, f, 0.0f);
    }

    public static BRg A0A(BRg bRg, float f, float f2) {
        return A0C(bRg, 0.0f, f, 0.0f, f2);
    }

    public static final BRg A0C(BRg bRg, float f, float f2, float f3, float f4) {
        return bRg.then(new C3UK(new C2285BSl(f, f2, f3, f4, 0), f, f2, f3, f4, true));
    }

    public static final BRg A0D(BRg bRg, final C3TQ c3tq) {
        final C3bS c3bS = new C3bS(c3tq, 2);
        return bRg.then(new Ab8<C3U1>(c3tq, c3bS) { // from class: X.3U2
            public final C3TQ A00;
            public final G0U<ASF, Unit> A01;

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                C3TQ c3tq2 = this.A00;
                C3U1 c3u1 = new C3U1();
                c3u1.A00 = c3tq2;
                return c3u1;
            }

            @Override // X.Ab8
            public final boolean equals(Object obj) {
                C3U2 c3u2;
                if (!(obj instanceof C3U2) || (c3u2 = (C3U2) obj) == null) {
                    return false;
                }
                return C7384Etj.areEqual(this.A00, c3u2.A00);
            }

            @Override // X.Ab8
            public final int hashCode() {
                return this.A00.hashCode();
            }

            @Override // X.Ab8
            public final void inspectableProperties(ASF asf) {
                this.A01.invoke(asf);
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                ((C3U1) abstractC1439Aj8).A00 = this.A00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A00 = c3tq;
                this.A01 = c3bS;
            }
        });
    }

    public static final float A00(C3TQ c3tq, EnumC1820Arj enumC1820Arj) {
        return enumC1820Arj == EnumC1820Arj.A02 ? ((C1DP) c3tq).A01 : c3tq.A5k(enumC1820Arj);
    }

    public static final float A01(C3TQ c3tq, EnumC1820Arj enumC1820Arj) {
        return enumC1820Arj == EnumC1820Arj.A02 ? ((C1DP) c3tq).A02 : c3tq.A5n(enumC1820Arj);
    }

    public static BRg A02(BRg bRg) {
        return A0B(bRg, 16.0f, 12.0f);
    }

    public static BRg A08(BRg bRg, float f) {
        return A0B(bRg, f, 8.0f);
    }

    public static final BRg A09(BRg bRg, final float f) {
        return bRg.then(new C3UK(new G0U() { // from class: X.3U5
            @Override // X.G0U
            public final Object invoke(Object obj) {
                float f2 = f;
                ASF asf = (ASF) obj;
                asf.A01 = "padding";
                asf.A00 = new C1DG(f2);
                return Unit.INSTANCE;
            }
        }, f, f, f, f, true));
    }

    public static final BRg A0B(BRg bRg, final float f, final float f2) {
        return bRg.then(new C3UK(new G0U() { // from class: X.3UF
            @Override // X.G0U
            public final Object invoke(Object obj) {
                float f3 = f;
                float f4 = f2;
                ASF asf = (ASF) obj;
                asf.A01 = "padding";
                BHD bhd = asf.A02;
                bhd.A01("horizontal", new C1DG(f3));
                bhd.A01("vertical", new C1DG(f4));
                return Unit.INSTANCE;
            }
        }, f, f2, f, f2, true));
    }
}
