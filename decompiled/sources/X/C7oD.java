package X;

@Deprecated
/* renamed from: X.7oD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oD extends C77m {
    public C7oE A00;
    public final C8ee<?> A01;
    public final C7n1 A02;
    public final C7n1 A03;
    public final C7oK A04;

    public C7oD(int i) {
    }

    public C7oD() {
        C7mP c7mP;
        Integer num;
        this.A00 = (C7oE) C5246DeB.A00(32781);
        this.A01 = (C8ee) C5246DeB.A00(81921);
        AbstractC5053DRd abstractC5053DRd = (AbstractC5053DRd) C5246DeB.A00(65562);
        final C7oK c7oK = (C7oK) C5246DeB.A00(32782);
        this.A04 = c7oK;
        int i = (int) abstractC5053DRd.getLong(C7oG.A00);
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw C60O.A0i(FGI.A0H("Unknown value ", i));
                        }
                        num = C79.A0K;
                    } else {
                        num = C79.A0C;
                    }
                } else {
                    num = C79.A01;
                }
            } else {
                num = C79.A00;
            }
            c7mP = new C7mP();
            c7mP.A00 = num;
        } catch (IllegalArgumentException unused) {
            Integer num2 = C7mP.A01;
            c7mP = new C7mP();
            c7mP.A00 = num2;
        }
        C7mY c7mY = new C7mY(c7oK) { // from class: X.7oF
            public final C7oK A00;

            @Override // X.C7mY
            public final void Ab1(String str) {
            }

            {
                this.A00 = c7oK;
            }

            @Override // X.C7mY
            public final void report(String str, String str2, Throwable th) {
            }
        };
        this.A03 = new C7mG(c7mP, c7mY);
        this.A02 = new C7mH(c7mP, c7mY);
    }
}
