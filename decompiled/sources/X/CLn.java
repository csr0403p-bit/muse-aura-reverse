package X;

import android.util.Base64;
import java.util.List;

/* loaded from: classes5.dex */
public final class CLn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List<List<byte[]>> A06;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/util/List<[B>;>;Ljava/lang/String;Ljava/lang/String;)V */
    public CLn(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.A01 = str;
        str2.getClass();
        this.A02 = str2;
        this.A03 = str3;
        list.getClass();
        this.A06 = list;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = FGI.A0m(str, "-", str2, "-", str3, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        StringBuilder sbA0x = C60O.A0x("FontRequest {mProviderAuthority: ");
        sbA0x.append(this.A01);
        sbA0x.append(", mProviderPackage: ");
        sbA0x.append(this.A02);
        sbA0x.append(", mQuery: ");
        sbA0x.append(this.A03);
        sbA0x.append(", mSystemFont: ");
        sbA0x.append(this.A04);
        sbA0x.append(", mVariationSettings: ");
        sbA0x.append(this.A05);
        sbA0x.append(", mCertificates:");
        BV4.A1O(sbA0w, sbA0x);
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.A06;
            if (i >= list.size()) {
                sbA0w.append("}");
                return AnonymousClass001.A0v(FGI.A0H("mCertificatesArray: ", 0), sbA0w);
            }
            sbA0w.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sbA0w.append(" \"");
                sbA0w.append(Base64.encodeToString(list2.get(i2), 0));
                sbA0w.append("\"");
            }
            sbA0w.append(" ]");
            i++;
        }
    }
}
