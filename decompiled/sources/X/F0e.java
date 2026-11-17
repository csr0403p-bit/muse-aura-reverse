package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class F0e implements InterfaceC3984CiY {
    public final G0U<PushInfraMetaData, Unit> A00;
    public final F1O A01;
    public final F0G A02;

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        this.A00.invoke(c3979CiT.A08);
        return c3979CiT;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    @Override // X.InterfaceC3984CiY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AfW(X.C3979CiT r9) {
        /*
            r8 = this;
            r2 = 0
            X.C7384Etj.A0Y(r9, r2)
            com.facebook.pushlite.model.PushInfraMetaData r6 = r9.A08
            java.lang.Long r0 = r6.A00
            boolean r5 = X.AnonymousClass002.A1X(r0)
            java.lang.String r4 = r6.A0A
            boolean r3 = X.AnonymousClass002.A1X(r4)
            java.lang.String r0 = r6.A0B
            boolean r1 = X.AnonymousClass002.A1X(r0)
            java.lang.Long r0 = r6.A02
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r5 != 0) goto L58
            if (r3 != 0) goto L61
            if (r1 != 0) goto L61
            if (r0 != 0) goto L61
            java.lang.Integer r0 = X.C79.A00
        L28:
            int r1 = r0.intValue()
            if (r1 == r2) goto L50
            r0 = 2
            if (r1 == r0) goto L51
            java.lang.String r0 = "push/google_replay"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L50
            X.F1O r5 = r8.A01
            if (r5 == 0) goto L50
            java.lang.String r1 = "gql executor is null"
        L3f:
            java.lang.String r7 = "notif_ack_failure"
            java.util.LinkedHashMap r9 = X.C3cG.A0j()
            java.lang.String r0 = "exception"
            r9.put(r0, r1)
            java.lang.String r8 = ""
            r4 = 0
            X.F1O.A00(r4, r5, r6, r7, r8, r9)
        L50:
            return r2
        L51:
            X.F1O r5 = r8.A01
            if (r5 == 0) goto L50
            java.lang.String r1 = "missing partial iris metadata"
            goto L3f
        L58:
            if (r3 == 0) goto L61
            if (r1 == 0) goto L61
            if (r0 == 0) goto L61
            java.lang.Integer r0 = X.C79.A01
            goto L28
        L61:
            java.lang.Integer r0 = X.C79.A0C
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F0e.AfW(X.CiT):boolean");
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "push_iris_cursor_ack";
    }

    public F0e(F1O f1o, F0G f0g, G0U g0u) {
        this.A02 = f0g;
        this.A01 = f1o;
        this.A00 = g0u;
    }
}
