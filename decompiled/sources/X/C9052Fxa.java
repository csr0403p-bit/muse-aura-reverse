package X;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fxa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9052Fxa implements InterfaceC9020Fwx {
    public static final C8993FwW<C9082Fy9> A08;
    public static final C8993FwW<C9082Fy9> A09;
    public static final C8993FwW<C9082Fy9> A0A;
    public static final Map<Integer, String> A0B;
    public static final Map<String, Integer> A0C;
    public static final C9087FyE A0D;
    public static final C9087FyE A0E;
    public final int A00;
    public final C9086FyD A01;
    public final C9087FyE A02;
    public final Instant A03;
    public final Instant A04;
    public final ZoneOffset A05;
    public final ZoneOffset A06;
    public final List<C9085FyC> A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9052Fxa) {
                C9052Fxa c9052Fxa = (C9052Fxa) obj;
                if (!this.A04.equals(c9052Fxa.A04) || !this.A03.equals(c9052Fxa.A03) || !C7384Etj.areEqual(this.A06, c9052Fxa.A06) || !C7384Etj.areEqual(this.A05, c9052Fxa.A05) || !C7384Etj.areEqual(this.A02, c9052Fxa.A02) || this.A00 != c9052Fxa.A00 || !this.A07.equals(c9052Fxa.A07) || !this.A01.equals(c9052Fxa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9110Fyb enumC9110Fyb = EnumC9110Fyb.A02;
        A0E = new C9087FyE(enumC9110Fyb, 0.0d);
        A0D = new C9087FyE(enumC9110Fyb, 100.0d);
        Integer num = C79.A01;
        C9146FzF c9146FzF = C9082Fy9.A02;
        A08 = C8993FwW.A02(num, "SkinTemperature", "temperatureDelta", new C8838Fqo(c9146FzF, 9));
        A0A = C8993FwW.A00(C79.A0C, c9146FzF, "SkinTemperature", "temperatureDelta", 11);
        A09 = C8993FwW.A00(C79.A0K, c9146FzF, "SkinTemperature", "temperatureDelta", 10);
        Map<String, Integer> mapA0m = C3cH.A0m("wrist", 3, C3cG.A0r("finger", BV4.A0W()), C3cG.A0r("toe", BV4.A0X()));
        A0C = mapA0m;
        A0B = AbstractC8873Frm.A00(mapA0m);
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A03;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A05;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A04;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A06;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A07, (((((((AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A04)) + C60R.A01(this.A06)) * 31) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A02, 0)) * 31) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SkinTemperatureRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A04);
        AbstractC7608F5v.A1P(sbA0x, this.A06);
        AbstractC7608F5v.A1S(sbA0x, this.A03);
        sbA0x.append(this.A05);
        sbA0x.append(", deltas=");
        sbA0x.append(this.A07);
        sbA0x.append(", baseline=");
        sbA0x.append(this.A02);
        sbA0x.append(", measurementLocation=");
        AbstractC7608F5v.A1N(sbA0x, this.A00);
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;LX/FyD;Ljava/util/List<LX/FyC;>;LX/FyE;I)V */
    public C9052Fxa(C9086FyD c9086FyD, C9087FyE c9087FyE, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List list, int i) {
        this.A04 = instant;
        this.A06 = zoneOffset;
        this.A03 = instant2;
        this.A05 = zoneOffset2;
        this.A01 = c9086FyD;
        this.A07 = list;
        this.A02 = c9087FyE;
        this.A00 = i;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (c9087FyE != null) {
            AbstractC8873Frm.A01(c9087FyE, A0E, "temperature");
            AbstractC8873Frm.A02(c9087FyE, A0D, "temperature");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant3 = ((C9085FyC) next).A01;
            do {
                Object next2 = it.next();
                Instant instant4 = ((C9085FyC) next2).A01;
                if (instant3.compareTo(instant4) > 0) {
                    next = next2;
                    instant3 = instant4;
                }
            } while (it.hasNext());
        }
        if (((C9085FyC) next).A01.isBefore(this.A04)) {
            throw C60O.A0i("deltas can not be out of parent time range.");
        }
        Iterator<C9085FyC> it2 = this.A07.iterator();
        if (!it2.hasNext()) {
            throw C8j3.A1D();
        }
        C9085FyC next3 = it2.next();
        if (it2.hasNext()) {
            Instant instant5 = next3.A01;
            do {
                C9085FyC next4 = it2.next();
                Instant instant6 = next4.A01;
                if (instant5.compareTo(instant6) < 0) {
                    next3 = next4;
                    instant5 = instant6;
                }
            } while (it2.hasNext());
        }
        if (!next3.A01.isBefore(this.A03)) {
            throw C60O.A0i("deltas can not be out of parent time range.");
        }
    }
}
