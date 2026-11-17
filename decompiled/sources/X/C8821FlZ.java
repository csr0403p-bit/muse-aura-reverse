package X;

/* renamed from: X.FlZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8821FlZ extends AbstractC8825Fld {
    public final float A00;

    public C8821FlZ(float f) {
        super(false, false);
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8821FlZ) && Float.compare(this.A00, ((C8821FlZ) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return FGI.A0F("RelativeHorizontalTo(dx=", ')', this.A00);
    }
}
