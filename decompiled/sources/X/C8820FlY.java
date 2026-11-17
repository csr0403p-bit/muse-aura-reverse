package X;

/* renamed from: X.FlY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8820FlY extends AbstractC8825Fld {
    public final float A00;

    public C8820FlY(float f) {
        super(false, false);
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8820FlY) && Float.compare(this.A00, ((C8820FlY) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("HorizontalTo(x=", ')', this.A00);
    }
}
