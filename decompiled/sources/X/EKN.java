package X;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class EKN {
    public final EnumC6619EKm A00;
    public final UUID A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final EKL A07;
    public final BzB A08;
    public final BzB A09;
    public final C6527ECu A0A;
    public final String A0B;
    public final Set<String> A0C;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/UUID;LX/EKm;Ljava/util/Set<Ljava/lang/String;>;LX/BzB;LX/BzB;IILX/EKL;JLX/ECu;JILjava/lang/String;)V */
    public EKN(EKL ekl, BzB bzB, BzB bzB2, C6527ECu c6527ECu, EnumC6619EKm enumC6619EKm, String str, Set set, UUID uuid, int i, int i2, int i3, long j, long j2) {
        C7384Etj.A0Y(bzB2, 4);
        this.A01 = uuid;
        this.A00 = enumC6619EKm;
        this.A0C = set;
        this.A08 = bzB;
        this.A09 = bzB2;
        this.A03 = i;
        this.A02 = i2;
        this.A07 = ekl;
        this.A05 = j;
        this.A0A = c6527ECu;
        this.A06 = j2;
        this.A04 = i3;
        this.A0B = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BV5.A1T(this, obj)) {
            EKN ekn = (EKN) obj;
            if (this.A03 == ekn.A03 && this.A02 == ekn.A02 && this.A01.equals(ekn.A01) && this.A00 == ekn.A00 && this.A08.equals(ekn.A08) && this.A07.equals(ekn.A07) && this.A05 == ekn.A05 && C7384Etj.areEqual(this.A0A, ekn.A0A) && this.A06 == ekn.A06 && this.A04 == ekn.A04 && this.A0B.equals(ekn.A0B) && this.A0C.equals(ekn.A0C)) {
                return this.A09.equals(ekn.A09);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A0B, (AnonymousClass006.A06(this.A06, (AnonymousClass006.A06(this.A05, AnonymousClass005.A0F(this.A07, (((AnonymousClass005.A0F(this.A09, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A08, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01))))) + this.A03) * 31) + this.A02) * 31)) + C60R.A01(this.A0A)) * 31) + this.A04) * 31);
    }

    public final String toString() {
        UUID uuid = this.A01;
        EnumC6619EKm enumC6619EKm = this.A00;
        BzB bzB = this.A08;
        Set<String> set = this.A0C;
        BzB bzB2 = this.A09;
        int i = this.A03;
        int i2 = this.A02;
        EKL ekl = this.A07;
        long j = this.A05;
        C6527ECu c6527ECu = this.A0A;
        long j2 = this.A06;
        int i3 = this.A04;
        String str = this.A0B;
        StringBuilder sbA0f = C3cG.A0f(uuid, "WorkInfo{id='");
        sbA0f.append("', state=");
        sbA0f.append(enumC6619EKm);
        sbA0f.append(", outputData=");
        sbA0f.append(bzB);
        sbA0f.append(", tags=");
        sbA0f.append(set);
        sbA0f.append(C8j2.A00(4));
        sbA0f.append(bzB2);
        sbA0f.append(", runAttemptCount=");
        sbA0f.append(i);
        sbA0f.append(", generation=");
        sbA0f.append(i2);
        sbA0f.append(", constraints=");
        sbA0f.append(ekl);
        sbA0f.append(C8j2.A00(31));
        sbA0f.append(j);
        sbA0f.append(", periodicityInfo=");
        sbA0f.append(c6527ECu);
        sbA0f.append(", nextScheduleTimeMillis=");
        sbA0f.append(j2);
        sbA0f.append("}, stopReason=");
        sbA0f.append(i3);
        return C60P.A1M(", workerClassName=", str, sbA0f);
    }
}
