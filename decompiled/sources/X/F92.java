package X;

/* loaded from: classes6.dex */
public final class F92 {
    public final int A00;
    public final C7648F8p A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F92) {
                F92 f92 = (F92) obj;
                if (!this.A02.equals(f92.A02) || this.A00 != f92.A00 || !C7384Etj.areEqual(this.A01, f92.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass001.A0G(this.A02) + this.A00) * 31) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        String str = this.A02;
        int i = this.A00;
        C7648F8p c7648F8p = this.A01;
        StringBuilder sbA0x = C3cI.A0x("AsyncComponentContainerTargetInfo(serverId=", str);
        sbA0x.append(", clientId=");
        sbA0x.append(i);
        return C3cJ.A0L(c7648F8p, ", keyPath=", sbA0x);
    }

    public F92(C7648F8p c7648F8p, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = c7648F8p;
    }
}
