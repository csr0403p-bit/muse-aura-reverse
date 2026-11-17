package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Brc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3001Brc {
    public static final Object A00(CSA csa, HtJ htJ) {
        if (!csa.A0B()) {
            GBL gblA03 = C7Bm.A03(htJ);
            csa.A09(new F4W(gblA03, 3), ExecutorC3002Brd.A00);
            return gblA03.A0F();
        }
        Exception excA07 = csa.A07();
        if (excA07 != null) {
            throw excA07;
        }
        if (((CSC) csa).A05) {
            throw new CancellationException(AnonymousClass001.A0v(" was cancelled normally.", C3cG.A0f(csa, "Task ")));
        }
        return csa.A08();
    }
}
