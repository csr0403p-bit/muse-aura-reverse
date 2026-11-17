package X;

/* renamed from: X.Hse, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10553Hse extends C06G {
    public final String A00 = "SUCCESS";
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10553Hse) {
                C10553Hse c10553Hse = (C10553Hse) obj;
                if (!C7384Etj.areEqual(this.A01, c10553Hse.A01) || !C7384Etj.areEqual(this.A00, c10553Hse.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C10553Hse(String str) {
        this.A01 = str;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return FGI.A0c("IAPFunnelStepUpdate(step=", this.A01, ", outcome=", this.A00);
    }
}
