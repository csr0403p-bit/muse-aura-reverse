package X;

/* renamed from: X.GQk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9587GQk extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9587GQk) {
                C9587GQk c9587GQk = (C9587GQk) obj;
                if (!C7384Etj.areEqual(this.A00, c9587GQk.A00) || !C7384Etj.areEqual(this.A01, c9587GQk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + AnonymousClass006.A0G(this.A01);
    }

    public C9587GQk(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
