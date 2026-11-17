package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* renamed from: X.GnX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10001GnX extends AbstractC10020Gns {
    public Gr0 A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public C10001GnX A04;
    public final C10001GnX A05;

    private final void A00(StringBuilder sb) {
        char c;
        C10001GnX c10001GnX = this.A05;
        if (c10001GnX != null) {
            c10001GnX.A00(sb);
        }
        int i = super.A02;
        if (i == 2) {
            sb.append('{');
            String str = this.A01;
            char c2 = '?';
            if (str != null) {
                c2 = '\"';
                sb.append('\"');
                sb.append(str);
            }
            sb.append(c2);
            c = '}';
        } else {
            if (i != 1) {
                sb.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                return;
            }
            sb.append('[');
            int i2 = super.A00;
            if (i2 < 0) {
                i2 = 0;
            }
            sb.append(i2);
            c = ']';
        }
        sb.append(c);
    }

    public final EnumC9834GiY A04() {
        if (!this.A03) {
            this.A03 = true;
            return super.A02 == 2 ? EnumC9834GiY.START_OBJECT : EnumC9834GiY.START_ARRAY;
        }
        if (!this.A02 || super.A02 != 2) {
            return null;
        }
        this.A02 = false;
        return EnumC9834GiY.FIELD_NAME;
    }

    public final C10001GnX A05(Gr0 gr0, boolean z) {
        C10001GnX c10001GnX = this.A04;
        if (c10001GnX == null) {
            C10001GnX c10001GnX2 = new C10001GnX(gr0, this, 1, z);
            this.A04 = c10001GnX2;
            return c10001GnX2;
        }
        ((AbstractC10020Gns) c10001GnX).A02 = 1;
        c10001GnX.A00 = gr0;
        ((AbstractC10020Gns) c10001GnX).A00 = -1;
        c10001GnX.A01 = null;
        c10001GnX.A03 = z;
        c10001GnX.A02 = false;
        return c10001GnX;
    }

    public final C10001GnX A06(Gr0 gr0, boolean z) {
        C10001GnX c10001GnX = this.A04;
        if (c10001GnX == null) {
            C10001GnX c10001GnX2 = new C10001GnX(gr0, this, 2, z);
            this.A04 = c10001GnX2;
            return c10001GnX2;
        }
        ((AbstractC10020Gns) c10001GnX).A02 = 2;
        c10001GnX.A00 = gr0;
        ((AbstractC10020Gns) c10001GnX).A00 = -1;
        c10001GnX.A01 = null;
        c10001GnX.A03 = z;
        c10001GnX.A02 = false;
        return c10001GnX;
    }

    public final void A07() {
        if (super.A02 != 2) {
            super.A00++;
        }
    }

    @Override // X.AbstractC10020Gns
    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(64);
        A00(sbA0p);
        return sbA0p.toString();
    }

    public C10001GnX(Gr0 gr0, C10001GnX c10001GnX, int i, boolean z) {
        super.A02 = i;
        this.A05 = c10001GnX;
        super.A01 = c10001GnX == null ? 0 : ((AbstractC10020Gns) c10001GnX).A01 + 1;
        this.A00 = gr0;
        super.A00 = -1;
        this.A03 = z;
        this.A02 = false;
    }
}
