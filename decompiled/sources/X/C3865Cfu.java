package X;

import java.util.Arrays;

/* renamed from: X.Cfu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3865Cfu extends AbstractC3928ChA {
    public final long A00;
    public final long A01;
    public final long A02;
    public final AbstractC2457Bbk A03;
    public final Integer A04;
    public final String A05;
    public final byte[] A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3928ChA) {
                C3865Cfu c3865Cfu = (C3865Cfu) ((AbstractC3928ChA) obj);
                if (this.A00 == c3865Cfu.A00) {
                    Integer num = this.A04;
                    Integer num2 = c3865Cfu.A04;
                    if (num != null ? num.equals(num2) : num2 == null) {
                        if (this.A01 == c3865Cfu.A01 && Arrays.equals(this.A06, c3865Cfu.A06)) {
                            String str = this.A05;
                            String str2 = c3865Cfu.A05;
                            if (str != null ? str.equals(str2) : str2 == null) {
                                if (this.A02 == c3865Cfu.A02) {
                                    AbstractC2457Bbk abstractC2457Bbk = this.A03;
                                    AbstractC2457Bbk abstractC2457Bbk2 = c3865Cfu.A03;
                                    if (abstractC2457Bbk == null) {
                                        if (abstractC2457Bbk2 == null) {
                                        }
                                    } else if (abstractC2457Bbk.equals(abstractC2457Bbk2)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int iA0D = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A04)) * 1000003;
        long j2 = this.A01;
        int iHashCode = (((((iA0D ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.A06)) * 1000003) ^ AnonymousClass006.A0G(this.A05)) * 1000003;
        long j3 = this.A02;
        return ((iHashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ C3cH.A02(this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LogEvent{eventTimeMs=");
        sbA0x.append(this.A00);
        sbA0x.append(", eventCode=");
        sbA0x.append(this.A04);
        sbA0x.append(", eventUptimeMs=");
        sbA0x.append(this.A01);
        sbA0x.append(", sourceExtension=");
        sbA0x.append(Arrays.toString(this.A06));
        sbA0x.append(", sourceExtensionJsonProto3=");
        sbA0x.append(this.A05);
        sbA0x.append(", timezoneOffsetSeconds=");
        sbA0x.append(this.A02);
        sbA0x.append(", networkConnectionInfo=");
        return BV8.A0v(this.A03, sbA0x);
    }

    public C3865Cfu(AbstractC2457Bbk abstractC2457Bbk, Integer num, String str, byte[] bArr, long j, long j2, long j3) {
        this.A00 = j;
        this.A04 = num;
        this.A01 = j2;
        this.A06 = bArr;
        this.A05 = str;
        this.A02 = j3;
        this.A03 = abstractC2457Bbk;
    }
}
