package X;

/* loaded from: classes6.dex */
public final class HxG {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HxG) {
                HxG hxG = (HxG) obj;
                if (!C7384Etj.areEqual(this.A00, hxG.A00) || !C7384Etj.areEqual(this.A01, hxG.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public final String toString() {
        return C3cJ.A0N(", errorDescription=", this.A01, C3cG.A0f(this.A00, "BloksAsyncComponentFetchErrorInfo(errorCode="));
    }

    public HxG(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
