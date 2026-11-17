package X;

/* loaded from: classes5.dex */
public final class EC6<V> {
    public final V A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.whatsapp.wapurpose.WaPurposeEnforcedObject<*>");
                if (!this.A00.equals(((EC6) obj).A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + 2;
    }

    public final String toString() {
        return "***";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EC6(Object obj) {
        this.A00 = obj;
    }
}
