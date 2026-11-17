package X;

import java.util.List;

/* renamed from: X.Cfr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3862Cfr extends Ch9 {
    public final long A00;
    public final long A01;
    public final AbstractC3929ChB A02;
    public final BYl A03;
    public final Integer A04;
    public final String A05;
    public final List<AbstractC3928ChA> A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Ch9) {
                C3862Cfr c3862Cfr = (C3862Cfr) ((Ch9) obj);
                if (this.A00 == c3862Cfr.A00 && this.A01 == c3862Cfr.A01) {
                    AbstractC3929ChB abstractC3929ChB = this.A02;
                    AbstractC3929ChB abstractC3929ChB2 = c3862Cfr.A02;
                    if (abstractC3929ChB != null ? abstractC3929ChB.equals(abstractC3929ChB2) : abstractC3929ChB2 == null) {
                        Integer num = this.A04;
                        Integer num2 = c3862Cfr.A04;
                        if (num != null ? num.equals(num2) : num2 == null) {
                            String str = this.A05;
                            String str2 = c3862Cfr.A05;
                            if (str != null ? str.equals(str2) : str2 == null) {
                                List<AbstractC3928ChA> list = this.A06;
                                List<AbstractC3928ChA> list2 = c3862Cfr.A06;
                                if (list != null ? list.equals(list2) : list2 == null) {
                                    BYl bYl = this.A03;
                                    BYl bYl2 = c3862Cfr.A03;
                                    if (bYl == null) {
                                        if (bYl2 == null) {
                                        }
                                    } else if (bYl.equals(bYl2)) {
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.A01;
        int iA0D = (((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ AnonymousClass006.A0D(this.A02)) * 1000003) ^ AnonymousClass006.A0D(this.A04)) * 1000003) ^ AnonymousClass006.A0G(this.A05)) * 1000003;
        List<AbstractC3928ChA> list = this.A06;
        return ((iA0D ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ C3cH.A02(this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LogRequest{requestTimeMs=");
        sbA0x.append(this.A00);
        sbA0x.append(", requestUptimeMs=");
        sbA0x.append(this.A01);
        sbA0x.append(", clientInfo=");
        sbA0x.append(this.A02);
        sbA0x.append(", logSource=");
        sbA0x.append(this.A04);
        sbA0x.append(", logSourceName=");
        sbA0x.append(this.A05);
        sbA0x.append(", logEvents=");
        sbA0x.append(this.A06);
        sbA0x.append(", qosTier=");
        return BV8.A0v(this.A03, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (JJLX/ChB;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List<LX/ChA;>;LX/BYl;)V */
    public C3862Cfr(AbstractC3929ChB abstractC3929ChB, BYl bYl, Integer num, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = abstractC3929ChB;
        this.A04 = num;
        this.A05 = str;
        this.A06 = list;
        this.A03 = bYl;
    }
}
