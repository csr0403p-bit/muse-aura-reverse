package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class EKM {
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final EKL A0B;
    public final BzB A0C;
    public final EnumC6619EKm A0D;
    public final String A0E;
    public final String A0F;
    public final List<BzB> A0G;
    public final List<String> A0H;

    public EKM(EKL ekl, BzB bzB, EnumC6619EKm enumC6619EKm, Integer num, String str, String str2, List list, List list2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(list, 15);
        C7384Etj.A0Y(str2, 16);
        C7384Etj.A0Y(list2, 17);
        this.A0E = str;
        this.A0D = enumC6619EKm;
        this.A0C = bzB;
        this.A08 = j;
        this.A09 = j2;
        this.A07 = j3;
        this.A0B = ekl;
        this.A05 = i;
        this.A03 = num;
        this.A01 = j4;
        this.A02 = j5;
        this.A00 = i2;
        this.A04 = i3;
        this.A0A = j6;
        this.A06 = i4;
        this.A0H = list;
        this.A0F = str2;
        this.A0G = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EKM) {
                EKM ekm = (EKM) obj;
                if (!this.A0E.equals(ekm.A0E) || this.A0D != ekm.A0D || !this.A0C.equals(ekm.A0C) || this.A08 != ekm.A08 || this.A09 != ekm.A09 || this.A07 != ekm.A07 || !this.A0B.equals(ekm.A0B) || this.A05 != ekm.A05 || this.A03 != ekm.A03 || this.A01 != ekm.A01 || this.A02 != ekm.A02 || this.A00 != ekm.A00 || this.A04 != ekm.A04 || this.A0A != ekm.A0A || this.A06 != ekm.A06 || !this.A0H.equals(ekm.A0H) || !this.A0F.equals(ekm.A0F) || !this.A0G.equals(ekm.A0G)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0F = (AnonymousClass005.A0F(this.A0B, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A09, AnonymousClass006.A06(this.A08, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A0D, AnonymousClass001.A0G(this.A0E))))))) + this.A05) * 31;
        int iIntValue = this.A03.intValue();
        return AnonymousClass005.A0G(this.A0G, AnonymousClass005.A0I(this.A0F, AnonymousClass005.A0F(this.A0H, (AnonymousClass006.A06(this.A0A, (((AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A01, (iA0F + (iIntValue != 0 ? "LINEAR" : "EXPONENTIAL").hashCode() + iIntValue) * 31)) + this.A00) * 31) + this.A04) * 31) + this.A06) * 31)));
    }

    public final String toString() {
        String str = this.A0E;
        EnumC6619EKm enumC6619EKm = this.A0D;
        BzB bzB = this.A0C;
        long j = this.A08;
        long j2 = this.A09;
        long j3 = this.A07;
        EKL ekl = this.A0B;
        int i = this.A05;
        Integer num = this.A03;
        long j4 = this.A01;
        long j5 = this.A02;
        int i2 = this.A00;
        int i3 = this.A04;
        long j6 = this.A0A;
        int i4 = this.A06;
        List<String> list = this.A0H;
        String str2 = this.A0F;
        List<BzB> list2 = this.A0G;
        StringBuilder sbA0x = C3cI.A0x("WorkInfoPojo(id=", str);
        sbA0x.append(", state=");
        sbA0x.append(enumC6619EKm);
        sbA0x.append(", output=");
        sbA0x.append(bzB);
        sbA0x.append(", initialDelay=");
        sbA0x.append(j);
        sbA0x.append(", intervalDuration=");
        sbA0x.append(j2);
        sbA0x.append(", flexDuration=");
        sbA0x.append(j3);
        sbA0x.append(", constraints=");
        sbA0x.append(ekl);
        sbA0x.append(", runAttemptCount=");
        sbA0x.append(i);
        sbA0x.append(", backoffPolicy=");
        sbA0x.append(num.intValue() != 0 ? "LINEAR" : "EXPONENTIAL");
        sbA0x.append(", backoffDelayDuration=");
        sbA0x.append(j4);
        sbA0x.append(", lastEnqueueTime=");
        sbA0x.append(j5);
        sbA0x.append(", periodCount=");
        sbA0x.append(i2);
        sbA0x.append(", generation=");
        sbA0x.append(i3);
        sbA0x.append(", nextScheduleTimeOverride=");
        sbA0x.append(j6);
        sbA0x.append(", stopReason=");
        sbA0x.append(i4);
        sbA0x.append(", tags=");
        sbA0x.append(list);
        sbA0x.append(", workerClassName=");
        sbA0x.append(str2);
        return C3cJ.A0L(list2, C8j2.A00(4), sbA0x);
    }
}
