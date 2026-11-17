package X;

/* renamed from: X.EDw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6541EDw implements InterfaceC6544EDz {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // X.InterfaceC6544EDz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C6531EDd AKe(int r11) {
        /*
            r10 = this;
            r2 = 2097152(0x200000, double:1.0361308E-317)
            switch(r11) {
                case 269765033: goto L23;
                case 713759422: goto L13;
                case 1643085664: goto L13;
                case 1684905197: goto L8;
                default: goto L6;
            }
        L6:
            r5 = 0
            return r5
        L8:
            X.EE3 r5 = new X.EE3
            r5.<init>()
            r0 = 20971520(0x1400000, double:1.03613076E-316)
            r5.A00 = r0
            goto L37
        L13:
            X.EE3 r5 = new X.EE3
            r5.<init>()
            r0 = 10485760(0xa00000, double:5.180654E-317)
            r5.A00 = r0
            r0 = 5242880(0x500000, double:2.590327E-317)
            r5.A01 = r0
            goto L35
        L23:
            X.EE3 r5 = new X.EE3
            r5.<init>()
            r0 = 512000(0x7d000, double:2.529616E-318)
            r5.A00 = r0
            r0 = 256000(0x3e800, double:1.26481E-318)
            r5.A01 = r0
            r2 = 102400(0x19000, double:5.05923E-319)
        L35:
            r5.A02 = r2
        L37:
            long r6 = r5.A00
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            long r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            long r1 = r5.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            java.lang.String r0 = "Should set at least some max size limit"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L52:
            long r8 = r5.A01
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L5b
            r5.A01 = r6
            r8 = r6
        L5b:
            long r10 = r5.A02
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L62
            r10 = r8
        L62:
            X.EDd r5 = new X.EDd
            r5.<init>(r6, r8, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6541EDw.AKe(int):X.EDd");
    }

    @Override // X.InterfaceC6544EDz
    public final C6533EDj AKs(int i) {
        long j = 604800;
        switch (i) {
            case 157877869:
            case 1377433890:
            case 1672668047:
                j = 259200;
                break;
            case 269765033:
                j = 31449600;
                break;
            case 594169501:
                j = 86400;
                break;
            case 713759422:
            case 1643085664:
                break;
            case 1684905197:
                j = 5184000;
                break;
            default:
                return null;
        }
        return new C6533EDj(j);
    }
}
