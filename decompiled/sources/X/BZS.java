package X;

/* loaded from: classes5.dex */
public abstract class BZS {
    public final float A00 = 0.6f;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof BZS) && BV5.A1T(this, (BZS) obj) && Float.compare(0.6f, 0.6f) == 0);
    }

    public final int hashCode() {
        return BV7.A0E(getClass(), Float.valueOf(0.6f), null);
    }
}
