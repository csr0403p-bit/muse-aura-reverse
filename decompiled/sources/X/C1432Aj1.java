package X;

import android.graphics.Rect;
import kotlin.Unit;

/* renamed from: X.Aj1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1432Aj1 extends AbstractC1439Aj8 implements Dg3, InterfaceC1451AjK, C1Z2, InterfaceC1413Aii {
    public float A00;
    public long A01;
    public C2LD A02;
    public C1HY A03;
    public BL5 A04;
    public G0U A05;
    public HoC A06;
    public InterfaceC1435Aj4 A07;
    public EnumC10573Huf A08;
    public final Rect A09;
    public final C1434Aj3 A0A;
    public final G0U<C2LD, Unit> A0B;

    public C1432Aj1(EnumC10573Huf enumC10573Huf, G0U g0u, float f, long j) {
        AnonymousClass002.A1E(enumC10573Huf, 3, g0u);
        this.A01 = j;
        this.A00 = f;
        this.A08 = enumC10573Huf;
        this.A05 = g0u;
        if (enumC10573Huf == EnumC10573Huf.A03 || enumC10573Huf == EnumC10573Huf.A04) {
            throw C60O.A0i("onVisible modifier cannot start with the INITIALIZED or DESTROYED lifecycle state.");
        }
        this.A0A = new C1434Aj3(this);
        this.A0B = new C2326BUa(this, 25);
        this.A09 = new Rect();
    }

    public static final void A00(C2LD c2ld, C1432Aj1 c1432Aj1, float f) {
        HoC hoC;
        c1432Aj1.A02 = c2ld;
        C1HY c1hy = c1432Aj1.A03;
        if (c1hy == null) {
            C7384Etj.A0b("lifecycleOwner");
            throw F60.createAndThrow();
        }
        if (C8j3.A0m(c1hy).A00(c1432Aj1.A08)) {
            long j = c2ld.A02;
            float fA00 = c2ld.A00(C8j3.A0G(j), (int) j);
            if ((fA00 > f || fA00 == 1.0f) && (hoC = c1432Aj1.A06) == null && c1432Aj1.A04 == null) {
                long j2 = c1432Aj1.A01;
                if (j2 == 0) {
                    c1432Aj1.A04 = (BL5) c1432Aj1.A05.invoke(BPc.A00);
                } else {
                    c1432Aj1.A06 = C3cI.A15(hoC);
                    c1432Aj1.A06 = AnonymousClass001.A11(new BU3(c1432Aj1, null, 12, j2), c1432Aj1.getCoroutineScope());
                }
            }
            if (fA00 < f || fA00 == 0.0f) {
                c1432Aj1.A06 = C3cI.A15(c1432Aj1.A06);
                A01(c1432Aj1);
            }
        }
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C2LD c2ld;
        C7384Etj.A0Y(enumC3085Bxl, 1);
        switch (enumC3085Bxl.ordinal()) {
            case 0:
            case 1:
            case 2:
                if (enumC3085Bxl.A01() == this.A08 && (c2ld = this.A02) != null) {
                    A00(c2ld, this, this.A00);
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
                if (enumC3085Bxl.A01().compareTo(this.A08) <= -1) {
                    this.A06 = C3cI.A15(this.A06);
                    A01(this);
                    break;
                }
                break;
        }
    }

    public static final void A01(C1432Aj1 c1432Aj1) {
        BL5 bl5 = c1432Aj1.A04;
        if (bl5 != null) {
            c1432Aj1.A04 = null;
            bl5.A00.invoke();
        }
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        C1HY c1hy = (C1HY) ARZ.A01(AIC.A00, this);
        C7384Etj.A0Y(c1hy, 0);
        this.A03 = c1hy;
        c1hy.getLifecycle().A04(this);
        InterfaceC1435Aj4 interfaceC1435Aj4 = this.A07;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        this.A07 = AbstractC1462AjV.A01(this, this.A0B, 0L, 0L);
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A06 = C3cI.A15(this.A06);
        this.A02 = null;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        A01(this);
        InterfaceC1435Aj4 interfaceC1435Aj4 = this.A07;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        this.A07 = null;
        C1HY c1hy = this.A03;
        if (c1hy != null) {
            c1hy.getLifecycle().A05(this);
        } else {
            C7384Etj.A0b("lifecycleOwner");
            throw F60.createAndThrow();
        }
    }
}
