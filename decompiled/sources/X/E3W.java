package X;

/* loaded from: classes5.dex */
public final class E3W extends AbstractC6411E4n {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E3W e3w = (E3W) obj;
                if (!C6xC.A00(this.A00, e3w.A00) || !C6xC.A00(this.A01, e3w.A01) || !C6xC.A00(this.A02, e3w.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public E3W(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final int hashCode() {
        int iA0I = AnonymousClass005.A0I(this.A00, BV8.A0B(this.A01));
        String str = this.A02;
        return iA0I + (str != null ? str.hashCode() : 0);
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0k(super.A00, ": language=", this.A01, ", description=", this.A00, ", text=", this.A02);
    }
}
