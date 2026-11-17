package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.B0k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2171B0k extends AbstractC2175B0t {
    public float A00;
    public float A01;
    public float A02;
    public float A05;
    public float A06;
    public InterfaceC1068ATy A08;
    public G0U<? super AbstractC2175B0t, Unit> A0B;
    public float[] A0F;
    public final List<AbstractC2175B0t> A0G = C3cG.A0h();
    public boolean A0E = true;
    public long A07 = B6A.A07;
    public List<? extends AbstractC8825Fld> A0A = AbstractC2176B0u.A00;
    public boolean A0C = true;
    public final G0U<AbstractC2175B0t, Unit> A0H = BUX.A00(this, 21);
    public String A09 = "";
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public boolean A0D = true;

    private final void A00(long j) {
        if (!this.A0E || j == 16) {
            return;
        }
        long j2 = this.A07;
        if (j2 != 16) {
            List<AbstractC8825Fld> list = AbstractC2176B0u.A00;
            if (B6A.A03(j2) == B6A.A03(j) && B6A.A02(j2) == B6A.A02(j) && B6A.A01(j2) == B6A.A01(j)) {
                return;
            }
            this.A0E = false;
            j = B6A.A07;
        }
        this.A07 = j;
    }

    private final void A01(C1EQ c1eq) {
        if (!this.A0E || c1eq == null) {
            return;
        }
        if (c1eq instanceof C1326AhD) {
            A00(((C1326AhD) c1eq).A00);
        } else {
            this.A0E = false;
            this.A07 = B6A.A07;
        }
    }

    public static final void A02(C2171B0k c2171B0k, AbstractC2175B0t abstractC2175B0t) {
        if (abstractC2175B0t instanceof C2173B0m) {
            C2173B0m c2173B0m = (C2173B0m) abstractC2175B0t;
            c2171B0k.A01(c2173B0m.A09);
            c2171B0k.A01(c2173B0m.A0A);
        } else if (abstractC2175B0t instanceof C2171B0k) {
            C2171B0k c2171B0k2 = (C2171B0k) abstractC2175B0t;
            if (c2171B0k2.A0E && c2171B0k.A0E) {
                c2171B0k.A00(c2171B0k2.A07);
            } else {
                c2171B0k.A0E = false;
                c2171B0k.A07 = B6A.A07;
            }
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VGroup: ");
        sbA0x.append(this.A09);
        List<AbstractC2175B0t> list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2175B0t abstractC2175B0t = list.get(i);
            sbA0x.append("\t");
            sbA0x.append(abstractC2175B0t.toString());
            sbA0x.append(PairsDiscretionDocument.TERMINATOR);
        }
        return sbA0x.toString();
    }
}
