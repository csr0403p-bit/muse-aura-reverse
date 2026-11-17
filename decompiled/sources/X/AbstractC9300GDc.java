package X;

import java.util.List;

/* renamed from: X.GDc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9300GDc {
    public static final AbstractC9300GDc A00 = new C9298GDa();
    public static final AbstractC9300GDc A01 = new C9299GDb();

    public final <L> List<L> A01(Object obj, long j) {
        if (!(this instanceof C9299GDb)) {
            return C9298GDa.A00(obj, 10, j);
        }
        GDO gdo = (GDO) AbstractC9365GGb.A00(obj, j);
        if (((GDD) gdo).A00) {
            return gdo;
        }
        GDO gdoAQy = gdo.AQy(AbstractC7610F5x.A0P(gdo));
        C9400GHp.A06(obj, j, gdoAQy);
        return gdoAQy;
    }
}
