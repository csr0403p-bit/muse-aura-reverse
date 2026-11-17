package X;

/* renamed from: X.ChH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3935ChH extends AbstractC3931ChD {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3931ChD) {
                Integer num = this.A00;
                C3935ChH c3935ChH = (C3935ChH) ((AbstractC3931ChD) obj);
                Integer num2 = c3935ChH.A00;
                if (num != null ? num.equals(num2) : num2 == null) {
                    String str = this.A09;
                    String str2 = c3935ChH.A09;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.A05;
                        String str4 = c3935ChH.A05;
                        if (str3 != null ? str3.equals(str4) : str4 == null) {
                            String str5 = this.A03;
                            String str6 = c3935ChH.A03;
                            if (str5 != null ? str5.equals(str6) : str6 == null) {
                                String str7 = this.A0B;
                                String str8 = c3935ChH.A0B;
                                if (str7 != null ? str7.equals(str8) : str8 == null) {
                                    String str9 = this.A0A;
                                    String str10 = c3935ChH.A0A;
                                    if (str9 != null ? str9.equals(str10) : str10 == null) {
                                        String str11 = this.A07;
                                        String str12 = c3935ChH.A07;
                                        if (str11 != null ? str11.equals(str12) : str12 == null) {
                                            String str13 = this.A04;
                                            String str14 = c3935ChH.A04;
                                            if (str13 != null ? str13.equals(str14) : str14 == null) {
                                                String str15 = this.A06;
                                                String str16 = c3935ChH.A06;
                                                if (str15 != null ? str15.equals(str16) : str16 == null) {
                                                    String str17 = this.A02;
                                                    String str18 = c3935ChH.A02;
                                                    if (str17 != null ? str17.equals(str18) : str18 == null) {
                                                        String str19 = this.A08;
                                                        String str20 = c3935ChH.A08;
                                                        if (str19 != null ? str19.equals(str20) : str20 == null) {
                                                            String str21 = this.A01;
                                                            String str22 = c3935ChH.A01;
                                                            if (str21 == null) {
                                                                if (str22 == null) {
                                                                }
                                                            } else if (str21.equals(str22)) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        return ((((((((((((((((((((((AnonymousClass006.A0D(this.A00) ^ 1000003) * 1000003) ^ AnonymousClass006.A0G(this.A09)) * 1000003) ^ AnonymousClass006.A0G(this.A05)) * 1000003) ^ AnonymousClass006.A0G(this.A03)) * 1000003) ^ AnonymousClass006.A0G(this.A0B)) * 1000003) ^ AnonymousClass006.A0G(this.A0A)) * 1000003) ^ AnonymousClass006.A0G(this.A07)) * 1000003) ^ AnonymousClass006.A0G(this.A04)) * 1000003) ^ AnonymousClass006.A0G(this.A06)) * 1000003) ^ AnonymousClass006.A0G(this.A02)) * 1000003) ^ AnonymousClass006.A0G(this.A08)) * 1000003) ^ AnonymousClass005.A0H(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AndroidClientInfo{sdkVersion=");
        sbA0x.append(this.A00);
        sbA0x.append(", model=");
        sbA0x.append(this.A09);
        sbA0x.append(", hardware=");
        sbA0x.append(this.A05);
        sbA0x.append(", device=");
        sbA0x.append(this.A03);
        sbA0x.append(", product=");
        sbA0x.append(this.A0B);
        sbA0x.append(", osBuild=");
        sbA0x.append(this.A0A);
        sbA0x.append(", manufacturer=");
        sbA0x.append(this.A07);
        sbA0x.append(", fingerprint=");
        sbA0x.append(this.A04);
        sbA0x.append(", locale=");
        sbA0x.append(this.A06);
        sbA0x.append(", country=");
        sbA0x.append(this.A02);
        sbA0x.append(", mccMnc=");
        sbA0x.append(this.A08);
        sbA0x.append(", applicationBuild=");
        sbA0x.append(this.A01);
        return BV7.A11(sbA0x);
    }

    public C3935ChH(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A00 = num;
        this.A09 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A04 = str7;
        this.A06 = str8;
        this.A02 = str9;
        this.A08 = str10;
        this.A01 = str11;
    }
}
