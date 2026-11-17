package X;

import java.util.Comparator;

/* renamed from: X.Dwk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6142Dwk {
    public static final AbstractC6142Dwk A00 = new C6143Dwl();
    public static final AbstractC6142Dwk A02 = new C6144Dwm(-1);
    public static final AbstractC6142Dwk A01 = new C6144Dwm(1);

    public final AbstractC6142Dwk A00(int left, int right) {
        if (this instanceof C6144Dwm) {
            return this;
        }
        int iA00 = AbstractC7532Ezu.A00(left, right);
        return iA00 < 0 ? A02 : iA00 > 0 ? A01 : A00;
    }

    public final <T> AbstractC6142Dwk A01(T left, T right, Comparator<T> comparator) {
        if (this instanceof C6144Dwm) {
            return this;
        }
        int iCompare = comparator.compare(left, right);
        return iCompare < 0 ? A02 : iCompare > 0 ? A01 : A00;
    }

    public final AbstractC6142Dwk A02(boolean left, boolean right) {
        return this instanceof C6144Dwm ? this : left == right ? A00 : left ? A01 : A02;
    }
}
