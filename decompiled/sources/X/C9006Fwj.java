package X;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* renamed from: X.Fwj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9006Fwj implements InterfaceC9010Fwn<C8875Fro> {
    public final C9086FyD A00;
    public final Instant A01;
    public final Instant A02;
    public final ZoneOffset A03;
    public final ZoneOffset A04;
    public final List<C8875Fro> A05;
    public static final C8993FwW<Double> A06 = C8992FwV.A00(C79.A01, "StepsCadenceSeries", "rate");
    public static final C8993FwW<Double> A08 = C8992FwV.A00(C79.A0C, "StepsCadenceSeries", "rate");
    public static final C8993FwW<Double> A07 = C8992FwV.A00(C79.A0K, "StepsCadenceSeries", "rate");

    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List<LX/Fro;>;LX/FyD;)V */
    public C9006Fwj(C9086FyD c9086FyD, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List list) {
        C7384Etj.A0Y(list, 4);
        this.A02 = instant;
        this.A04 = zoneOffset;
        this.A01 = instant2;
        this.A03 = zoneOffset2;
        this.A05 = list;
        this.A00 = c9086FyD;
        if (instant.isAfter(instant2)) {
            throw C60O.A0i("startTime must not be after endTime.");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9006Fwj) {
                C9006Fwj c9006Fwj = (C9006Fwj) obj;
                if (!this.A02.equals(c9006Fwj.A02) || !C7384Etj.areEqual(this.A04, c9006Fwj.A04) || !this.A01.equals(c9006Fwj.A01) || !C7384Etj.areEqual(this.A03, c9006Fwj.A03) || !this.A05.equals(c9006Fwj.A05) || !this.A00.equals(c9006Fwj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A03;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.InterfaceC9010Fwn
    public final List<C8875Fro> AJw() {
        return this.A05;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A05, (AnonymousClass005.A0F(this.A01, (AnonymousClass005.A0E(this.A02) + C60R.A01(this.A04)) * 31) + C8j4.A0E(this.A03, 0)) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StepsCadenceRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A02);
        AbstractC7608F5v.A1P(sbA0x, this.A04);
        AbstractC7608F5v.A1S(sbA0x, this.A01);
        sbA0x.append(this.A03);
        sbA0x.append(", samples=");
        AbstractC7608F5v.A1Q(sbA0x, this.A05);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
