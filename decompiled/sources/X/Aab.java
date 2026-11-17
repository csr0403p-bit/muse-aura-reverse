package X;

/* loaded from: classes4.dex */
public final class Aab<T> extends AbstractC1114Aad<T> {
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Aab) {
                AbstractC1114Aad abstractC1114Aad = (AbstractC1114Aad) obj;
                if (!C7384Etj.areEqual(abstractC1114Aad.A01, this.A01) || !abstractC1114Aad.A00.equals(this.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, C60R.A01(this.A01) * 31 * 31);
    }
}
