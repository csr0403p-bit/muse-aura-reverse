package X;

/* loaded from: classes4.dex */
public final class A7M {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A7M) {
                A7M a7m = (A7M) obj;
                if (!this.A01.equals(a7m.A01) || !this.A00.equals(a7m.A00) || !this.A02.equals(a7m.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A02, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A01)));
    }

    public final String toString() {
        return FGI.A0k("SecretRecord(keyName=", this.A01, ", algorithm=", this.A00, ", secretValue=", this.A02, ")");
    }

    public A7M(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
