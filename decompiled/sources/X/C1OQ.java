package X;

/* renamed from: X.1OQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OQ implements C1Ny {
    public final int A00;
    public final C1Ny A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1OQ) {
                C1OQ c1oq = (C1OQ) obj;
                if (!this.A01.equals(c1oq.A01) || this.A00 != c1oq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1Ny
    public final int ACy(AXN axn) {
        if ((this.A00 & 32) != 0) {
            return this.A01.ACy(axn);
        }
        return 0;
    }

    @Override // X.C1Ny
    public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
        if ((this.A00 & (enumC1820Arj == EnumC1820Arj.A02 ? 8 : 2)) != 0) {
            return this.A01.AH1(axn, enumC1820Arj);
        }
        return 0;
    }

    @Override // X.C1Ny
    public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
        if ((this.A00 & (enumC1820Arj == EnumC1820Arj.A02 ? 4 : 1)) != 0) {
            return this.A01.AJo(axn, enumC1820Arj);
        }
        return 0;
    }

    @Override // X.C1Ny
    public final int ALn(AXN axn) {
        if ((this.A00 & 16) != 0) {
            return this.A01.ALn(axn);
        }
        return 0;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.A01);
        sb.append(" only ");
        int i = this.A00;
        StringBuilder sb2 = new StringBuilder();
        if ((i & 9) == 9) {
            A00(sb2, "Start");
        }
        if ((i & 10) == 10) {
            A00(sb2, "Left");
        }
        if ((i & 16) == 16) {
            A00(sb2, "Top");
        }
        if ((i & 6) == 6) {
            A00(sb2, "End");
        }
        if ((i & 5) == 5) {
            A00(sb2, "Right");
        }
        if ((i & 32) == 32) {
            A00(sb2, "Bottom");
        }
        sb.append((Object) FGI.A0N("WindowInsetsSides(", sb2.toString(), ')'));
        sb.append(')');
        return sb.toString();
    }

    public C1OQ(C1Ny c1Ny, int i) {
        this.A01 = c1Ny;
        this.A00 = i;
    }

    public static final void A00(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
