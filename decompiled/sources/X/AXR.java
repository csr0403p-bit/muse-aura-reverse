package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class AXR implements C3TG {
    public final C3Tr A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.C3Tr
    public final Object AIX() {
        return this.A00.AIX();
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        return this.A00.AQM(i);
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        return this.A00.AQO(i);
    }

    @Override // X.C3TG
    public final AZE AQW(long j) {
        int i;
        C1065ATt c1065ATt;
        long j2;
        long j3;
        Integer num = this.A02;
        Integer num2 = C79.A00;
        Integer num3 = this.A01;
        Integer num4 = C79.A01;
        C3Tr c3Tr = this.A00;
        if (num == num2) {
            int iA00 = Constraints.A00(j);
            int iAQO = num3 == num4 ? c3Tr.AQO(iA00) : c3Tr.AQq(iA00);
            i = Constraints.A09(j) ? iA00 : 32767;
            c1065ATt = new C1065ATt();
            j2 = iAQO << 32;
            j3 = i;
        } else {
            int iA01 = Constraints.A01(j);
            int iAQM = num3 == num4 ? c3Tr.AQM(iA01) : c3Tr.AQo(iA01);
            i = Constraints.A0A(j) ? iA01 : 32767;
            c1065ATt = new C1065ATt();
            j2 = i << 32;
            j3 = iAQM;
        }
        c1065ATt.A0W(AnonymousClass002.A0G(j3, j2));
        return c1065ATt;
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        return this.A00.AQo(i);
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        return this.A00.AQq(i);
    }

    public AXR(C3Tr c3Tr, Integer num, Integer num2) {
        this.A00 = c3Tr;
        this.A01 = num;
        this.A02 = num2;
    }
}
