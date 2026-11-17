package X;

import java.util.Arrays;

/* renamed from: X.AgK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1274AgK implements C2HJ {
    public long A00;
    public final C1273AgJ A01;
    public final C1273AgJ A02;

    @Override // X.C2HJ
    public final void A3p(long j, long j2) {
        this.A01.A01(j, AnonymousClass003.A03(j2));
        this.A02.A01(j, AnonymousClass004.A00(j2));
    }

    @Override // X.C2HJ
    public final void AbS() {
        C1273AgJ c1273AgJ = this.A01;
        BGi[] bGiArr = c1273AgJ.A07;
        Arrays.fill(bGiArr, 0, bGiArr.length, (Object) null);
        c1273AgJ.A00 = 0;
        C1273AgJ c1273AgJ2 = this.A02;
        BGi[] bGiArr2 = c1273AgJ2.A07;
        Arrays.fill(bGiArr2, 0, bGiArr2.length, (Object) null);
        c1273AgJ2.A00 = 0;
        this.A00 = 0L;
    }

    public C1274AgK() {
        Integer num = C79.A00;
        this.A01 = new C1273AgJ(false, num);
        this.A02 = new C1273AgJ(false, num);
    }

    @Override // X.C2HJ
    public final long A5r(long j) {
        float fA03 = AnonymousClass003.A03(j);
        if (fA03 > 0.0f) {
            float fA00 = AnonymousClass004.A00(j);
            if (fA00 > 0.0f) {
                return AnonymousClass005.A0J(this.A01.A00(fA03), this.A02.A00(fA00));
            }
        }
        StringBuilder sbA0x = C60O.A0x("maximumVelocity should be a positive value. You specified=");
        StringBuilder sbA0x2 = C60O.A0x("(");
        sbA0x2.append(AnonymousClass003.A03(j));
        C8j3.A1K(sbA0x2);
        sbA0x2.append(AnonymousClass004.A00(j));
        ASP.A01(C8j3.A14(AnonymousClass001.A0v(") px/sec", sbA0x2), sbA0x));
        throw F60.createAndThrow();
    }
}
