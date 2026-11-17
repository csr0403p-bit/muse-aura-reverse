package X;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Fwf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9002Fwf implements InterfaceC9020Fwx {
    public static final C8993FwW<Duration> A08 = new C8993FwW<>(C8988FwQ.A00, C79.A00, "MindfulnessSession", null);
    public static final Map<Integer, String> A09;
    public static final Map<String, Integer> A0A;
    public final int A00;
    public final C9086FyD A01;
    public final String A02;
    public final String A03;
    public final Instant A04;
    public final Instant A05;
    public final ZoneOffset A06;
    public final ZoneOffset A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9002Fwf) {
                C9002Fwf c9002Fwf = (C9002Fwf) obj;
                if (this.A00 != c9002Fwf.A00 || !C7384Etj.areEqual(this.A03, c9002Fwf.A03) || !C7384Etj.areEqual(this.A02, c9002Fwf.A02) || !this.A05.equals(c9002Fwf.A05) || !C7384Etj.areEqual(this.A07, c9002Fwf.A07) || !this.A04.equals(c9002Fwf.A04) || !C7384Etj.areEqual(this.A06, c9002Fwf.A06) || !this.A01.equals(c9002Fwf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Map<String, Integer> mapA0D = AGH.A0D(C3cG.A0r("breathing", BV4.A0X()), AnonymousClass002.A0p("meditation", 1), C3cG.A0r("movement", BV4.A0Z()), AnonymousClass002.A0p("music", 3), C3cG.A0r("unguided", 5), AnonymousClass002.A0p("unknown", 0));
        A0A = mapA0D;
        A09 = AbstractC8873Frm.A00(mapA0D);
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A04;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A06;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A05;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A07;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A04, ((((((this.A00 * 31) + BV7.A0I(this.A03)) * 31) + BV7.A0I(this.A02)) * 31) + C60R.A01(this.A07)) * 31) + C8j4.A0E(this.A06, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MindfulnessSessionRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A05);
        AbstractC7608F5v.A1P(sbA0x, this.A07);
        AbstractC7608F5v.A1S(sbA0x, this.A04);
        sbA0x.append(this.A06);
        sbA0x.append(", mindfulnessSessionType=");
        sbA0x.append(this.A00);
        sbA0x.append(", title=");
        sbA0x.append(this.A03);
        sbA0x.append(", notes=");
        sbA0x.append(this.A02);
        sbA0x.append(", metadata=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C9002Fwf(C9086FyD c9086FyD, String str, String str2, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, int i) {
        this.A05 = instant;
        this.A07 = zoneOffset;
        this.A04 = instant2;
        this.A06 = zoneOffset2;
        this.A01 = c9086FyD;
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
    }
}
