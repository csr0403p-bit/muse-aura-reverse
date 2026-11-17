package X;

import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Fwg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9003Fwg implements InterfaceC9020Fwx {
    public static final C8993FwW<Duration> A08 = new C8993FwW<>(C8988FwQ.A00, C79.A00, "SleepSession", null);
    public static final Map<Integer, String> A09;
    public static final Map<String, Integer> A0A;
    public final C9086FyD A00;
    public final String A01;
    public final String A02;
    public final Instant A03;
    public final Instant A04;
    public final ZoneOffset A05;
    public final ZoneOffset A06;
    public final List<C9004Fwh> A07;

    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;LX/FyD;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<LX/Fwh;>;)V */
    public C9003Fwg(C9086FyD c9086FyD, String str, String str2, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List list) {
        C7384Etj.A0Y(list, 7);
        this.A04 = instant;
        this.A06 = zoneOffset;
        this.A03 = instant2;
        this.A05 = zoneOffset2;
        this.A00 = c9086FyD;
        this.A02 = str;
        this.A01 = str2;
        this.A07 = list;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (list.isEmpty()) {
            return;
        }
        List listA0c = AbstractC0878AGe.A0c(list, new C10635I0f(new C8630Fhh(7), 3));
        int iA0E = AnonymousClass002.A0E(listA0c);
        int i = 0;
        while (i < iA0E) {
            Instant instant3 = ((C9004Fwh) listA0c.get(i)).A01;
            i++;
            if (instant3.isAfter(((C9004Fwh) listA0c.get(i)).A02)) {
                throw C60O.A0i("Failed requirement.");
            }
        }
        if (((C9004Fwh) AbstractC0878AGe.A0F(listA0c)).A02.isBefore(this.A04)) {
            throw C60O.A0i("Failed requirement.");
        }
        if (((C9004Fwh) AbstractC0878AGe.A0H(listA0c)).A01.isAfter(this.A03)) {
            throw C60O.A0i("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9003Fwg) {
                C9003Fwg c9003Fwg = (C9003Fwg) obj;
                if (!C7384Etj.areEqual(this.A02, c9003Fwg.A02) || !C7384Etj.areEqual(this.A01, c9003Fwg.A01) || !this.A07.equals(c9003Fwg.A07) || !this.A04.equals(c9003Fwg.A04) || !C7384Etj.areEqual(this.A06, c9003Fwg.A06) || !this.A03.equals(c9003Fwg.A03) || !C7384Etj.areEqual(this.A05, c9003Fwg.A05) || !this.A00.equals(c9003Fwg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Map<String, Integer> mapA0D = AGH.A0D(C3cG.A0r("awake", BV4.A0W()), C3cG.A0r("sleeping", BV4.A0X()), C3cG.A0r("out_of_bed", BV4.A0Y()), C3cG.A0r(AvatarMediaMapperKt.LIGHT, BV4.A0Z()), C3cG.A0r("deep", 5), C3cG.A0r("rem", 6), C3cG.A0r("awake_in_bed", 7), AnonymousClass002.A0p("unknown", 0));
        A0A = mapA0D;
        Set<Map.Entry<String, Integer>> setEntrySet = mapA0D.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            AbstractC7611F5y.A17(linkedHashMapA15, it);
        }
        A09 = linkedHashMapA15;
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
        return this.A00;
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
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A03, (AnonymousClass005.A0F(this.A07, ((BV7.A0I(this.A02) * 31) + BV7.A0I(this.A01)) * 31) + C60R.A01(this.A06)) * 31) + C8j4.A0E(this.A05, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SleepSessionRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A04);
        AbstractC7608F5v.A1P(sbA0x, this.A06);
        AbstractC7608F5v.A1S(sbA0x, this.A03);
        sbA0x.append(this.A05);
        sbA0x.append(", title=");
        sbA0x.append(this.A02);
        sbA0x.append(", notes=");
        sbA0x.append(this.A01);
        sbA0x.append(", stages=");
        AbstractC7608F5v.A1Q(sbA0x, this.A07);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
