package X;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class BN1 {
    public final Locale A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BN1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C7384Etj.areEqual(this.A00.toLanguageTag(), ((BN1) obj).A00.toLanguageTag());
    }

    public final int hashCode() {
        return this.A00.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.A00.toLanguageTag();
    }

    public BN1(Locale locale) {
        this.A00 = locale;
    }
}
