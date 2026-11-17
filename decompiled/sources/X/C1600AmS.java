package X;

/* renamed from: X.AmS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1600AmS implements B9F {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1600AmS) && this.A00 == ((C1600AmS) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C8j4.A0w("AndroidFontResolveInterceptor(fontWeightAdjustment=", this.A00);
    }

    public C1600AmS(int i) {
        this.A00 = i;
    }
}
