package X;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CfH implements InterfaceC3829CfI {
    public static final CfH A01;
    public static final String A02;
    public static final Set<Ce6> A03;
    public final String A00;

    static {
        String strA00 = A00("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        A02 = strA00;
        A00("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        A00("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        A03 = Collections.unmodifiableSet(BV5.A0v(new Ce6[]{new Ce6("proto"), new Ce6("json")}));
        A01 = new CfH(strA00);
    }

    public CfH(String str) {
        this.A00 = str;
    }

    public static String A00(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = length - length2;
        if (i < 0 || i > 1) {
            throw C60O.A0i("Invalid input received");
        }
        StringBuilder sbA0p = BV4.A0p(length + length2);
        for (int i2 = 0; i2 < length; i2++) {
            BV6.A1M(str, sbA0p, i2);
            if (length2 > i2) {
                BV6.A1M(str2, sbA0p, i2);
            }
        }
        return sbA0p.toString();
    }
}
