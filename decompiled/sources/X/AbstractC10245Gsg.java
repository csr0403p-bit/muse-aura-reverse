package X;

/* renamed from: X.Gsg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10245Gsg {
    private final boolean A04(Gt3 gt3, GtD gtD) {
        if (this instanceof AbstractC10243Gse) {
            return ((AbstractC10243Gse) this).A06(gt3, gtD);
        }
        if (this instanceof AbstractC10299GuA) {
            return ((AbstractC10299GuA) this).A06(gtD);
        }
        if (this instanceof C10250Gsn) {
            Gsm gsm = (Gsm) this;
            for (int i = 0; i < gsm.A01; i++) {
                if (gsm.A04.get(i).A04(gt3, gtD)) {
                    return true;
                }
            }
            return false;
        }
        if (!(this instanceof C10251Gso)) {
            return false;
        }
        Gsm gsm2 = (Gsm) this;
        for (int i2 = 0; i2 < gsm2.A01; i2++) {
            if (!gsm2.A04.get(i2).A04(gt3, gtD)) {
                return false;
            }
        }
        return true;
    }

    public final int A00() {
        if (this instanceof C10309GuK) {
            return 1;
        }
        if (this instanceof C10258Gsx) {
            return ((AbstractC10243Gse) this).A02.A00() * 3;
        }
        if ((this instanceof C10247Gsi) || (this instanceof C10246Gsh) || (this instanceof C10248Gsj)) {
            return ((AbstractC10243Gse) this).A02.A00() + 2;
        }
        if (this instanceof Gsl) {
            return ((Gsl) this).A00;
        }
        if (this instanceof C10260Gsz) {
            return ((AbstractC10243Gse) this).A02.A00() * 10;
        }
        if (this instanceof C10249Gsk) {
            return ((AbstractC10243Gse) this).A02.A00() * 8;
        }
        if (this instanceof C10272Gtc) {
            return 8;
        }
        if (this instanceof C10271Gtb) {
            return 1;
        }
        if (this instanceof C10269GtY) {
            return 6;
        }
        if (this instanceof C10298Gu7) {
            return 4;
        }
        if (this instanceof C10289Gtt) {
            return 1;
        }
        if (this instanceof C10274Gte) {
            return 8;
        }
        if ((this instanceof C10275Gtf) || (this instanceof C10276Gtg)) {
            return 7;
        }
        if (this instanceof C10273Gtd) {
            return 8;
        }
        if (this instanceof GtE) {
            return -1;
        }
        if (this instanceof C10300GuB) {
            return 1;
        }
        if (this instanceof C10257Gsw) {
            return 2;
        }
        if ((this instanceof C10290Gtu) || (this instanceof C10267GtW)) {
            return 10;
        }
        if ((this instanceof Gu4) || (this instanceof GtR)) {
            return 8;
        }
        if (this instanceof GtZ) {
            return 4;
        }
        if (this instanceof C10288Gts) {
            return 3;
        }
        if (this instanceof C10270Gta) {
            return 4;
        }
        if (this instanceof C10265GtT) {
            return 6;
        }
        if (this instanceof C10282Gtm) {
            return 3;
        }
        if (this instanceof GtA) {
            return 6;
        }
        if (this instanceof C10296Gu2) {
            return 2;
        }
        if (this instanceof C10255Gsu) {
            return 10;
        }
        if (this instanceof Gsm) {
            return ((Gsm) this).A00;
        }
        return 5;
    }

    public void A01() {
    }

    public final boolean A02() {
        if (this instanceof AbstractC10243Gse) {
            return ((AbstractC10243Gse) this).A00;
        }
        if (this instanceof AbstractC10299GuA) {
            return true;
        }
        if (this instanceof Gsm) {
            return ((Gsm) this).A02;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r1 == null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0022, code lost:
    
        r1 = r1.A0E();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x036c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Gt3, X.Gt4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.Gt3] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.Gt4] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.Gt3 r8, X.Gt3 r9) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10245Gsg.A03(X.Gt3, X.Gt3):boolean");
    }

    public final boolean A05(Gt3 gt3, Gt4 gt4) {
        if (gt4 instanceof Gt3) {
            return A03(gt3, (Gt3) gt4);
        }
        if ((gt4 instanceof GtD) && A02()) {
            return A04(gt3, (GtD) gt4);
        }
        return false;
    }
}
