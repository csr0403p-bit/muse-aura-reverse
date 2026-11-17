package X;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* renamed from: X.Fxs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9070Fxs implements InterfaceC9020Fwx {
    public final int A00;
    public final C9086FyD A01;
    public final String A02;
    public final String A03;
    public final Instant A04;
    public final Instant A05;
    public final ZoneOffset A06;
    public final ZoneOffset A07;
    public final List<HiS> A08;
    public final boolean A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9070Fxs) {
                C9070Fxs c9070Fxs = (C9070Fxs) obj;
                if (!this.A05.equals(c9070Fxs.A05) || !C7384Etj.areEqual(this.A07, c9070Fxs.A07) || !this.A04.equals(c9070Fxs.A04) || !C7384Etj.areEqual(this.A06, c9070Fxs.A06) || this.A09 != c9070Fxs.A09 || !this.A08.equals(c9070Fxs.A08) || !C7384Etj.areEqual(this.A03, c9070Fxs.A03) || !C7384Etj.areEqual(this.A02, c9070Fxs.A02) || this.A00 != c9070Fxs.A00 || !this.A01.equals(c9070Fxs.A01)) {
                }
            }
            return false;
        }
        return true;
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
        int iA0F = (((((AnonymousClass005.A0F(this.A08, C0KA.A01((AnonymousClass005.A0F(this.A04, (AnonymousClass005.A0E(this.A05) + C60R.A01(this.A07)) * 31) + C60R.A01(this.A06)) * 31, this.A09)) + BV7.A0I(this.A03)) * 31) + BV7.A0I(this.A02)) * 31) + this.A00) * 31;
        String str = this.A0A;
        return AnonymousClass005.A0G(this.A01, (iA0F + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlannedExerciseSessionRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A05);
        AbstractC7608F5v.A1P(sbA0x, this.A07);
        AbstractC7608F5v.A1S(sbA0x, this.A04);
        sbA0x.append(this.A06);
        sbA0x.append(", hasExplicitTime=");
        sbA0x.append(this.A09);
        sbA0x.append(", title=");
        sbA0x.append(this.A03);
        sbA0x.append(", notes=");
        sbA0x.append(this.A02);
        sbA0x.append(", exerciseType=");
        sbA0x.append(this.A00);
        sbA0x.append(", completedExerciseSessionId=");
        sbA0x.append(this.A0A);
        sbA0x.append(", metadata=");
        sbA0x.append(this.A01);
        sbA0x.append(", blocks=");
        return AnonymousClass007.A0Z(this.A08, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;LX/FyD;ZILjava/lang/String;Ljava/util/List<LX/HiS;>;Ljava/lang/String;Ljava/lang/String;)V */
    public C9070Fxs(C9086FyD c9086FyD, String str, String str2, String str3, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, List list, int i, boolean z) {
        this.A05 = instant;
        this.A07 = zoneOffset;
        this.A04 = instant2;
        this.A06 = zoneOffset2;
        this.A01 = c9086FyD;
        this.A09 = z;
        this.A00 = i;
        this.A0A = str;
        this.A08 = list;
        this.A03 = str2;
        this.A02 = str3;
        if (!instant.isBefore(instant2)) {
            throw C60O.A0i("Failed requirement.");
        }
    }
}
