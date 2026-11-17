package X;

/* loaded from: classes5.dex */
public final class E3V extends AbstractC6411E4n {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E3V e3v = (E3V) obj;
                if (!C6xC.A00(this.A00, e3v.A00) || !C6xC.A00(this.A01, e3v.A01) || !C6xC.A00(this.A02, e3v.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public E3V(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A02, AnonymousClass005.A0I(this.A00, BV8.A0B(this.A01)));
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0h(super.A00, ": domain=", this.A01, ", description=", this.A00);
    }
}
