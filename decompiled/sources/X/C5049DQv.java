package X;

/* renamed from: X.DQv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5049DQv extends C06G {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5049DQv) {
                C5049DQv c5049DQv = (C5049DQv) obj;
                if (!C7384Etj.areEqual(this.A02, c5049DQv.A02) || this.A01 != c5049DQv.A01 || this.A00 != c5049DQv.A00 || !C7384Etj.areEqual(this.A03, c5049DQv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A03, (C60R.A00(this.A01, AnonymousClass001.A0G(this.A02)) + this.A00) * 31);
    }

    public C5049DQv(String str, long j, int i, String str2) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = str2;
    }
}
