package X;

/* renamed from: X.Fla, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8822Fla extends AbstractC8825Fld {
    public final float A00;

    public C8822Fla(float f) {
        super(false, false);
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8822Fla) && Float.compare(this.A00, ((C8822Fla) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("RelativeVerticalTo(dy=", ')', this.A00);
    }
}
