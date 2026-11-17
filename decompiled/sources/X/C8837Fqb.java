package X;

import android.os.Process;

/* renamed from: X.Fqb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8837Fqb extends C06G {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Throwable A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8837Fqb) {
                C8837Fqb c8837Fqb = (C8837Fqb) obj;
                if (this.A03 != c8837Fqb.A03 || this.A00 != c8837Fqb.A00 || !C7384Etj.areEqual(this.A04, c8837Fqb.A04) || !C7384Etj.areEqual(this.A05, c8837Fqb.A05) || this.A01 != c8837Fqb.A01 || this.A02 != c8837Fqb.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A02, (((AnonymousClass005.A0I(this.A04, (AnonymousClass005.A07(this.A03) + this.A00) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + this.A01) * 31);
    }

    public /* synthetic */ C8837Fqb(String str, Throwable th, int i, long j) {
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        C7384Etj.A0Y(str, 2);
        this.A03 = j;
        this.A00 = i;
        this.A04 = str;
        this.A05 = th;
        this.A01 = iMyPid;
        this.A02 = id;
    }
}
