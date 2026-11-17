package X;

import android.health.connect.datatypes.Record;

/* renamed from: X.FxR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9045FxR {
    public static final Class<? extends Record> A00(C9uG<? extends InterfaceC9011Fwo> c9uG) {
        Class<? extends Record> cls;
        C7384Etj.A0Y(c9uG, 0);
        if ((!AbstractC8873Frm.A06() || (cls = AbstractC9049FxX.A03.get(c9uG)) == null) && ((!AbstractC8873Frm.A05() || (cls = AbstractC9049FxX.A02.get(c9uG)) == null) && ((!AbstractC8873Frm.A04() || (cls = AbstractC9049FxX.A01.get(c9uG)) == null) && (cls = AbstractC9049FxX.A00.get(c9uG)) == null))) {
            throw BV5.A0O(c9uG, "Unsupported record type ");
        }
        return cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC9011Fwo r14) {
        /*
            Method dump skipped, instructions count: 3324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9045FxR.A01(X.Fwo):void");
    }
}
