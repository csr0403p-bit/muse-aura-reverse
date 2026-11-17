package X;

import java.util.Calendar;

/* renamed from: X.Dre, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5897Dre {
    public static final int A00(int i, int i2, int i3) {
        boolean zA1Y;
        if (-1 <= i && i < 7) {
            synchronized (C5896Drd.A01) {
                zA1Y = AnonymousClass003.A1Y(C5896Drd.A00);
            }
            if (!zA1Y) {
                return i;
            }
        }
        int i4 = Calendar.getInstance().get(11);
        return (i4 >= i2 || i4 <= i3) ? 1 : 3;
    }
}
