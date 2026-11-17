package X;

/* renamed from: X.E3c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6375E3c extends AbstractC6411E4n {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6375E3c c6375E3c = (C6375E3c) obj;
                if (!super.A00.equals(((AbstractC6411E4n) c6375E3c).A00) || !C6xC.A00(this.A00, c6375E3c.A00) || !C6xC.A00(this.A01, c6375E3c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, (BV8.A0B(super.A00) + BV7.A0I(this.A00)) * 31);
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0U(super.A00, ": url=", this.A01);
    }

    public C6375E3c(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }
}
