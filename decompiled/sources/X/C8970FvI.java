package X;

import java.util.List;

/* renamed from: X.FvI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8970FvI {
    public final String A00;
    public final String A01;
    public final List<C8964Fuh> A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8970FvI) {
                C8970FvI c8970FvI = (C8970FvI) obj;
                if (!this.A01.equals(c8970FvI.A01) || !this.A00.equals(c8970FvI.A00) || !this.A03.equals(c8970FvI.A03) || !this.A02.equals(c8970FvI.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0I(this.A03, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A01))));
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A00;
        String str3 = this.A03;
        List<C8964Fuh> list = this.A02;
        StringBuilder sbA0x = C3cI.A0x("MetaHealthStatisticsResult(metricName=", str);
        sbA0x.append(", aggregation=");
        sbA0x.append(str2);
        sbA0x.append(", unit=");
        sbA0x.append(str3);
        return C3cJ.A0L(list, ", buckets=", sbA0x);
    }

    public C8970FvI(String str, String str2, String str3, List<C8964Fuh> list) {
        AnonymousClass003.A0u(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A02 = list;
    }
}
