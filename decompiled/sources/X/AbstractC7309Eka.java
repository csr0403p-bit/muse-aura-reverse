package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Eka, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7309Eka {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final F0C A06;
    public static final AtomicInteger A05 = BV4.A13(0);
    public static final AtomicInteger A04 = BV4.A13(0);
    public static final AtomicInteger A03 = BV4.A13(0);
    public static final ConcurrentHashMap A02 = C60O.A1C();

    static {
        C5322DgG c5322DgGA01 = C5322DgG.A01((Function0) C6724EXi.A00(9));
        A06 = c5322DgGA01;
        RunnableC7310Ekb runnableC7310Ekb = RunnableC7310Ekb.A00;
        A00 = runnableC7310Ekb;
        RunnableC7308EkZ runnableC7308EkZ = RunnableC7308EkZ.A00;
        A01 = runnableC7308EkZ;
        ((Handler) c5322DgGA01.getValue()).post(runnableC7310Ekb);
        ((Handler) A06.getValue()).post(runnableC7308EkZ);
    }

    public static final void A00(C7315Ekg c7315Ekg, int i) {
        int i2 = c7315Ekg.A00;
        float f = i2 * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        C7307EkY c7307EkY = c7315Ekg.A01;
        int i4 = c7307EkY.A00;
        int iA04 = ATD.A04(i4 + i, i3, i2);
        if (iA04 == i4 || iA04 == c7307EkY.A00 || !c7307EkY.A01) {
            return;
        }
        c7307EkY.A00 = ATD.A04(iA04, 1, c7307EkY.A05);
        C7307EkY.A00(c7307EkY).A03(c7307EkY.A00);
    }
}
