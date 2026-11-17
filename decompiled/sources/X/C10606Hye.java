package X;

import java.util.List;

/* renamed from: X.Hye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10606Hye extends C06G {
    public final long A00;
    public final Hm8 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List<Hyb> A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10606Hye) {
                C10606Hye c10606Hye = (C10606Hye) obj;
                if (!C7384Etj.areEqual(this.A06, c10606Hye.A06) || !C7384Etj.areEqual(this.A03, c10606Hye.A03) || !C7384Etj.areEqual(this.A04, c10606Hye.A04) || this.A00 != c10606Hye.A00 || !C7384Etj.areEqual(this.A05, c10606Hye.A05) || !C7384Etj.areEqual(this.A02, c10606Hye.A02) || !C7384Etj.areEqual(this.A07, c10606Hye.A07) || !C7384Etj.areEqual(this.A01, c10606Hye.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A07, (AnonymousClass005.A0I(this.A05, C60R.A00(this.A00, AnonymousClass005.A0I(this.A04, (AnonymousClass001.A0G(this.A06) + AnonymousClass006.A0G(this.A03)) * 31))) + AnonymousClass005.A0H(this.A02)) * 31));
    }

    public final String toString() {
        String str = this.A06;
        String str2 = this.A03;
        String str3 = this.A04;
        long j = this.A00;
        String str4 = this.A05;
        String str5 = this.A02;
        List<Hyb> list = this.A07;
        Hm8 hm8 = this.A01;
        StringBuilder sbA0x = C3cI.A0x("IapProductInfo(productId=", str);
        sbA0x.append(", externalProductId=");
        sbA0x.append(str2);
        sbA0x.append(", price=");
        sbA0x.append(str3);
        sbA0x.append(", priceAmountMicros=");
        sbA0x.append(j);
        sbA0x.append(", priceCurrencyCode=");
        sbA0x.append(str4);
        sbA0x.append(", countryCode=");
        sbA0x.append(str5);
        sbA0x.append(", subsOffers=");
        sbA0x.append(list);
        return C3cJ.A0L(hm8, ", developerInfo=", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List<LX/Hyb;>;LX/Hm8;)V */
    public C10606Hye(Hm8 hm8, String str, String str2, String str3, String str4, String str5, List list, long j) {
        AnonymousClass003.A0v(str, str3);
        AnonymousClass002.A1E(str4, 4, list);
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A05 = str4;
        this.A02 = str5;
        this.A07 = list;
        this.A01 = hm8;
    }
}
