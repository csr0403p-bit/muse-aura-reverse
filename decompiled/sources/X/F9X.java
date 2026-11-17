package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class F9X {
    public final Aei A00;
    public final Map<String, Object> A01;
    public final Map<String, Object> A02;
    public final Map<String, FDG> A03;
    public final Map<String, F96> A04;
    public final Map<String, Object> A05;
    public final Map<String, C7616F6s> A06;
    public final Map<String, FDW> A07;
    public final Map<String, F8L> A08;
    public final Map A09;
    public final Map<String, Object> A0A;

    public final F9X A03(Map map) {
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return this;
        }
        return new F9X(this.A00, AbstractC7609F5w.A0z(this.A09, map), this.A06, this.A0A, this.A05, this.A04, this.A03, this.A07, this.A08, this.A02, this.A01);
    }

    public final F9X A04(Map<String, ? extends Object> map) {
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return this;
        }
        HashMap mapA0z = AbstractC7609F5w.A0z(this.A0A, map);
        return new F9X(this.A00, this.A09, this.A06, mapA0z, this.A05, this.A04, this.A03, this.A07, this.A08, this.A02, this.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F9X() {
        C9jH c9jH = C9jH.A00;
        this(new Aeh(6), c9jH, c9jH, c9jH, c9jH, c9jH, c9jH, c9jH, c9jH, c9jH, c9jH);
    }

    public static F9X A00(F9X f9x, Map map) {
        return new F9X(f9x.A00, f9x.A09, f9x.A06, f9x.A0A, f9x.A05, f9x.A04, f9x.A03, f9x.A07, f9x.A08, map, f9x.A01);
    }

    public final F9X A01(int i) {
        Aei aei = this.A00;
        if (aei.A04(i)) {
            return this;
        }
        Aeh aeh = new Aeh(aei.A01 + 1);
        aeh.A06(aei);
        aeh.A07(i);
        return new F9X(aeh, this.A09, this.A06, this.A0A, this.A05, this.A04, this.A03, this.A07, this.A08, this.A02, this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map, java.util.Map<java.lang.String, X.F8L>] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, X.F96>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map, java.util.Map<java.lang.String, X.FDG>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.F9X A02(X.F9T r22) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9X.A02(X.F9T):X.F9X");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F9X)) {
            return false;
        }
        F9X f9x = (F9X) obj;
        return this.A06 == f9x.A06 && this.A05 == f9x.A05 && this.A09 == f9x.A09 && this.A0A.equals(f9x.A0A) && this.A04.equals(f9x.A04) && this.A03.equals(f9x.A03) && this.A07 == f9x.A07 && this.A08 == f9x.A08 && this.A02 == f9x.A02 && this.A00 == f9x.A00 && this.A01 == f9x.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A06, this.A0A, this.A05, this.A04, this.A03, this.A07, this.A08, this.A02, this.A00, this.A01});
    }

    public final String toString() {
        Map map = this.A09;
        Map<String, C7616F6s> map2 = this.A06;
        Map<String, Object> map3 = this.A0A;
        Map<String, Object> map4 = this.A05;
        Map<String, F96> map5 = this.A04;
        Map<String, FDG> map6 = this.A03;
        Map<String, FDW> map7 = this.A07;
        Map<String, F8L> map8 = this.A08;
        Map<String, Object> map9 = this.A02;
        Aei aei = this.A00;
        Map<String, Object> map10 = this.A01;
        StringBuilder sbA0f = C3cG.A0f(map, "BloksTreeResourcesState(variableDefinitions=");
        sbA0f.append(", payloads=");
        sbA0f.append(map2);
        sbA0f.append(BV3.A00(22));
        sbA0f.append(map3);
        sbA0f.append(", parameters=");
        sbA0f.append(map4);
        sbA0f.append(", hoistedComponentQueryPayloads=");
        sbA0f.append(map5);
        sbA0f.append(", functionTable=");
        sbA0f.append(map6);
        sbA0f.append(", templates=");
        sbA0f.append(map7);
        sbA0f.append(", values=");
        sbA0f.append(map8);
        sbA0f.append(", dataModuleSnapshots=");
        sbA0f.append(map9);
        sbA0f.append(", processedResources=");
        sbA0f.append(aei);
        return C3cJ.A0L(map10, ", constantsTable=", sbA0f);
    }

    public F9X(Aei aei, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10) {
        this.A09 = map;
        this.A06 = map2;
        this.A0A = map3;
        this.A05 = map4;
        this.A04 = map5;
        this.A03 = map6;
        this.A07 = map7;
        this.A08 = map8;
        this.A02 = map9;
        this.A00 = aei;
        this.A01 = map10;
    }
}
