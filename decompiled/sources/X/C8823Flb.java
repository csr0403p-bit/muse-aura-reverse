package X;

/* renamed from: X.Flb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8823Flb extends AbstractC8825Fld {
    public final float A00;

    public C8823Flb(float f) {
        super(false, false);
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8823Flb) && Float.compare(this.A00, ((C8823Flb) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("VerticalTo(y=", ')', this.A00);
    }
}
