package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EKL {
    public static final EKL A09 = new EKL(C79.A00);
    public final long A00;
    public final long A01;
    public final C7417EvK A02;
    public final Integer A03;
    public final Set<ELN> A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BV5.A1T(this, obj)) {
            EKL ekl = (EKL) obj;
            if (this.A06 == ekl.A06 && this.A07 == ekl.A07 && this.A05 == ekl.A05 && this.A08 == ekl.A08 && this.A01 == ekl.A01 && this.A00 == ekl.A00 && C7384Etj.areEqual(this.A02.A00, ekl.A02.A00) && this.A03 == ekl.A03) {
                return C7384Etj.areEqual(this.A04, ekl.A04);
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.A03;
        return AnonymousClass005.A0F(this.A04, AnonymousClass006.A06(this.A00, AnonymousClass006.A06(this.A01, ((((((((BV5.A03(num, AbstractC6647ELr.A00(num)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31))) + C60R.A01(this.A02.A00);
    }

    public final String toString() {
        Integer num = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A07;
        boolean z3 = this.A05;
        boolean z4 = this.A08;
        long j = this.A01;
        long j2 = this.A00;
        Set<ELN> set = this.A04;
        StringBuilder sbA0x = C60O.A0x("Constraints{requiredNetworkType=");
        sbA0x.append(num != null ? AbstractC6647ELr.A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", requiresCharging=");
        sbA0x.append(z);
        sbA0x.append(", requiresDeviceIdle=");
        sbA0x.append(z2);
        sbA0x.append(", requiresBatteryNotLow=");
        sbA0x.append(z3);
        sbA0x.append(", requiresStorageNotLow=");
        sbA0x.append(z4);
        sbA0x.append(", contentTriggerUpdateDelayMillis=");
        sbA0x.append(j);
        sbA0x.append(", contentTriggerMaxDelayMillis=");
        sbA0x.append(j2);
        sbA0x.append(", contentUriTriggers=");
        sbA0x.append(set);
        return AnonymousClass001.A0v(", }", sbA0x);
    }

    public EKL(EKL ekl) {
        this.A06 = ekl.A06;
        this.A07 = ekl.A07;
        this.A02 = ekl.A02;
        this.A03 = ekl.A03;
        this.A05 = ekl.A05;
        this.A08 = ekl.A08;
        this.A04 = ekl.A04;
        this.A01 = ekl.A01;
        this.A00 = ekl.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EvK;LX/ELr;ZZZZJJLjava/util/Set<LX/ELN;>;)V */
    public EKL(C7417EvK c7417EvK, Integer num, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        C7384Etj.A0Y(set, 8);
        this.A02 = c7417EvK;
        this.A03 = num;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
        this.A08 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = set;
    }

    public EKL(Integer num) {
        A3q a3q = A3q.A00;
        this.A02 = new C7417EvK(null);
        this.A03 = num;
        this.A06 = false;
        this.A07 = false;
        this.A05 = false;
        this.A08 = false;
        this.A01 = -1L;
        this.A00 = -1L;
        this.A04 = a3q;
    }
}
