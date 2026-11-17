package X;

import com.facebook.aura.commands.photos.PhotoUploadWorkerKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;

/* loaded from: classes5.dex */
public final class EKE {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public EKL A0B;
    public BzB A0C;
    public BzB A0D;
    public EnumC6619EKm A0E;
    public Boolean A0F;
    public Integer A0G;
    public Integer A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public final int A0M;
    public final int A0N;
    public final String A0O;
    public static final String A0Q = C7384Etj.A0I("WorkSpec");
    public static final BpS<List<EKM>, List<EKN>> A0P = new F5L(10);

    public EKE(EKL ekl, BzB bzB, BzB bzB2, EnumC6619EKm enumC6619EKm, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 2);
        C7384Etj.A0Y(str3, 3);
        this.A0O = str;
        this.A0E = enumC6619EKm;
        this.A0K = str2;
        this.A0I = str3;
        this.A0C = bzB;
        this.A0D = bzB2;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A0B = ekl;
        this.A02 = i;
        this.A0G = num;
        this.A03 = j4;
        this.A07 = j5;
        this.A08 = j6;
        this.A0A = j7;
        this.A0L = z;
        this.A0H = num2;
        this.A01 = i2;
        this.A0M = i3;
        this.A09 = j8;
        this.A00 = i4;
        this.A0N = i5;
        this.A0J = str4;
        this.A0F = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EKE) {
                EKE eke = (EKE) obj;
                if (!this.A0O.equals(eke.A0O) || this.A0E != eke.A0E || !this.A0K.equals(eke.A0K) || !this.A0I.equals(eke.A0I) || !this.A0C.equals(eke.A0C) || !this.A0D.equals(eke.A0D) || this.A05 != eke.A05 || this.A06 != eke.A06 || this.A04 != eke.A04 || !this.A0B.equals(eke.A0B) || this.A02 != eke.A02 || this.A0G != eke.A0G || this.A03 != eke.A03 || this.A07 != eke.A07 || this.A08 != eke.A08 || this.A0A != eke.A0A || this.A0L != eke.A0L || this.A0H != eke.A0H || this.A01 != eke.A01 || this.A0M != eke.A0M || this.A09 != eke.A09 || this.A00 != eke.A00 || this.A0N != eke.A0N || !C7384Etj.areEqual(this.A0J, eke.A0J) || !C7384Etj.areEqual(this.A0F, eke.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A01() {
        /*
            r20 = this;
            r0 = r20
            X.EKm r2 = r0.A0E
            X.EKm r1 = X.EnumC6619EKm.A04
            if (r2 != r1) goto Le
            int r1 = r0.A02
            r19 = 1
            if (r1 > 0) goto L10
        Le:
            r19 = 0
        L10:
            int r5 = r0.A02
            java.lang.Integer r4 = r0.A0G
            long r7 = r0.A03
            long r9 = r0.A07
            int r6 = r0.A01
            long r15 = r0.A06
            r2 = 0
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r20 = 0
            if (r1 == 0) goto L26
            r20 = 1
        L26:
            long r11 = r0.A05
            long r13 = r0.A04
            long r0 = r0.A09
            r17 = r0
            long r0 = A00(r4, r5, r6, r7, r9, r11, r13, r15, r17, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKE.A01():long");
    }

    public final int hashCode() {
        int iA0F = (AnonymousClass005.A0F(this.A0B, AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A06, AnonymousClass006.A06(this.A05, AnonymousClass005.A0F(this.A0D, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0I(this.A0I, AnonymousClass005.A0I(this.A0K, AnonymousClass005.A0F(this.A0E, AnonymousClass001.A0G(this.A0O)))))))))) + this.A02) * 31;
        int iIntValue = this.A0G.intValue();
        int iA01 = C0KA.A01(AnonymousClass006.A06(this.A0A, AnonymousClass006.A06(this.A08, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A03, (iA0F + (1 != iIntValue ? "EXPONENTIAL" : "LINEAR").hashCode() + iIntValue) * 31)))), this.A0L);
        int iIntValue2 = this.A0H.intValue();
        return ((((((AnonymousClass006.A06(this.A09, (((((iA01 + (1 != iIntValue2 ? "RUN_AS_NON_EXPEDITED_WORK_REQUEST" : "DROP_WORK_REQUEST").hashCode() + iIntValue2) * 31) + this.A01) * 31) + this.A0M) * 31) + this.A00) * 31) + this.A0N) * 31) + AnonymousClass006.A0G(this.A0J)) * 31) + C3cH.A02(this.A0F);
    }

    public final String toString() {
        return FGI.A0U("{WorkSpec: ", this.A0O, "}");
    }

    public static final long A00(Integer num, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        if (j6 != LinkEncryptedPairingKt.LINK_COUNTER_MAX && z2) {
            if (i2 == 0) {
                return j6;
            }
            long j7 = 900000 + j2;
            return j6 >= j7 ? j6 : j7;
        }
        if (z) {
            long jScalb = num == C79.A01 ? j * i : (long) Math.scalb(j, i - 1);
            return (jScalb > PhotoUploadWorkerKt.SHORT_BACKOFF_MS ? PhotoUploadWorkerKt.SHORT_BACKOFF_MS : jScalb) + j2;
        }
        if (!z2) {
            return j2 != -1 ? j2 + j3 : LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
        return (j4 == j5 || i2 != 0) ? j8 : j8 + (j5 - j4);
    }
}
