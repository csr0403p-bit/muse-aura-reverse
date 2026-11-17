package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BYs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC2390BYs {
    public static /* synthetic */ List A00(Object obj) {
        ArrayList arrayListA11 = C60O.A11(1);
        arrayListA11.add(BV6.A0n(new Object[]{obj}, 0));
        return Collections.unmodifiableList(arrayListA11);
    }

    public static void A01(BfD bfD, BgX bgX) {
        bfD.A0U(A00(bgX.A01()));
    }
}
