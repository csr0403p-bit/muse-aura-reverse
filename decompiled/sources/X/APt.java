package X;

/* loaded from: classes4.dex */
public abstract class APt {
    public static final APt A00;
    public static final APt A01;

    static {
        C9jH c9jH = C9jH.A00;
        A00 = new AQJ(new C1012APv(null, null, null, null, c9jH, false));
        A01 = new AQJ(new C1012APv(null, null, null, null, c9jH, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AQJ A00(X.APt r8) {
        /*
            r7 = this;
            X.AQJ r8 = (X.AQJ) r8
            X.APv r2 = r8.A00
            X.APw r4 = r2.A01
            if (r4 != 0) goto Lf
            r0 = r7
            X.AQJ r0 = (X.AQJ) r0
            X.APv r0 = r0.A00
            X.APw r4 = r0.A01
        Lf:
            X.APx r6 = r2.A03
            if (r6 != 0) goto L1a
            r0 = r7
            X.AQJ r0 = (X.AQJ) r0
            X.APv r0 = r0.A00
            X.APx r6 = r0.A03
        L1a:
            X.APy r3 = r2.A00
            if (r3 != 0) goto L25
            r0 = r7
            X.AQJ r0 = (X.AQJ) r0
            X.APv r0 = r0.A00
            X.APy r3 = r0.A00
        L25:
            X.APz r5 = r2.A02
            if (r5 != 0) goto L30
            r0 = r7
            X.AQJ r0 = (X.AQJ) r0
            X.APv r0 = r0.A00
            X.APz r5 = r0.A02
        L30:
            boolean r0 = r2.A05
            if (r0 != 0) goto L3e
            r0 = r7
            X.AQJ r0 = (X.AQJ) r0
            X.APv r0 = r0.A00
            boolean r0 = r0.A05
            r8 = 0
            if (r0 == 0) goto L3f
        L3e:
            r8 = 1
        L3f:
            X.AQJ r7 = (X.AQJ) r7
            X.APv r0 = r7.A00
            java.util.Map r1 = r0.A04
            java.util.Map r0 = r2.A04
            java.util.LinkedHashMap r7 = X.AGH.A02(r1, r0)
            X.APv r2 = new X.APv
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AQJ r0 = new X.AQJ
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APt.A00(X.APt):X.AQJ");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof APt) && C7384Etj.areEqual(((AQJ) ((APt) obj)).A00, ((AQJ) this).A00);
    }

    public final int hashCode() {
        return ((AQJ) this).A00.hashCode();
    }

    public final String toString() {
        if (equals(A00)) {
            return "ExitTransition.None";
        }
        if (equals(A01)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C1012APv c1012APv = ((AQJ) this).A00;
        StringBuilder sbA0x = C60O.A0x("ExitTransition: \nFade - ");
        C1013APw c1013APw = c1012APv.A01;
        sbA0x.append(c1013APw != null ? c1013APw.toString() : null);
        sbA0x.append(",\nSlide - ");
        C1014APx c1014APx = c1012APv.A03;
        sbA0x.append(c1014APx != null ? c1014APx.toString() : null);
        sbA0x.append(",\nShrink - ");
        C1015APy c1015APy = c1012APv.A00;
        sbA0x.append(c1015APy != null ? c1015APy.toString() : null);
        sbA0x.append(",\nScale - ");
        C1016APz c1016APz = c1012APv.A02;
        sbA0x.append(c1016APz != null ? c1016APz.toString() : null);
        sbA0x.append(",\nKeepUntilTransitionsFinished - ");
        sbA0x.append(c1012APv.A05);
        return sbA0x.toString();
    }
}
