package X;

/* renamed from: X.FuV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8954FuV {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8954FuV) {
                C8954FuV c8954FuV = (C8954FuV) obj;
                if (!this.A01.equals(c8954FuV.A01) || !this.A00.equals(c8954FuV.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return FGI.A0c("MetaHealthProvider(id=", this.A01, C8j2.A00(29), this.A00);
    }

    public C8954FuV(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
