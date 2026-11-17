package X;

import java.util.Map;

/* renamed from: X.CfL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3832CfL extends AbstractC3834CfN {
    public final long A00;
    public final long A01;
    public final C3853Cfi A02;
    public final Integer A03;
    public final String A04;
    public final Map<String, String> A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3834CfN) {
                C3832CfL c3832CfL = (C3832CfL) ((AbstractC3834CfN) obj);
                if (this.A04.equals(c3832CfL.A04)) {
                    Integer num = this.A03;
                    Integer num2 = c3832CfL.A03;
                    if (num != null ? num.equals(num2) : num2 == null) {
                        if (!this.A02.equals(c3832CfL.A02) || this.A00 != c3832CfL.A00 || this.A01 != c3832CfL.A01 || !this.A05.equals(c3832CfL.A05)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA08 = BV6.A08(this.A02, (((this.A04.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A03)) * 1000003);
        long j = this.A00;
        int i = (iA08 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.A01;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.A05.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EventInternal{transportName=");
        sbA0x.append(this.A04);
        sbA0x.append(", code=");
        sbA0x.append(this.A03);
        sbA0x.append(", encodedPayload=");
        sbA0x.append(this.A02);
        sbA0x.append(", eventMillis=");
        sbA0x.append(this.A00);
        sbA0x.append(C8j2.A00(45));
        sbA0x.append(this.A01);
        sbA0x.append(", autoMetadata=");
        return BV8.A0v(this.A05, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Integer;LX/Cfi;JJLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public C3832CfL(C3853Cfi c3853Cfi, Integer num, String str, Map map, long j, long j2) {
        this.A04 = str;
        this.A03 = num;
        this.A02 = c3853Cfi;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = map;
    }
}
