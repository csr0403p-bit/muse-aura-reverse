package X;

import java.util.List;

/* renamed from: X.9VN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VN extends C06G {
    public final C9Vi A00;
    public final Double A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List<C9Vj> A0G;
    public final List<C9VY> A0H;
    public final List<C9Ve> A0I;
    public final List<C9VY> A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List<C2259BIl> A0P;
    public final List<C07589Wt> A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VN) {
                C9VN c9vn = (C9VN) obj;
                if (!C7384Etj.areEqual(this.A0N, c9vn.A0N) || !C7384Etj.areEqual(this.A0D, c9vn.A0D) || !C7384Etj.areEqual(this.A0C, c9vn.A0C) || !C7384Etj.areEqual(this.A0M, c9vn.A0M) || !C7384Etj.areEqual(this.A05, c9vn.A05) || !C7384Etj.areEqual(this.A01, c9vn.A01) || !C7384Etj.areEqual(this.A04, c9vn.A04) || this.A03 != c9vn.A03 || this.A02 != c9vn.A02 || !C7384Etj.areEqual(this.A09, c9vn.A09) || this.A0L != c9vn.A0L || this.A0K != c9vn.A0K || !C7384Etj.areEqual(this.A0E, c9vn.A0E) || !C7384Etj.areEqual(this.A0A, c9vn.A0A) || !C7384Etj.areEqual(this.A0B, c9vn.A0B) || !C7384Etj.areEqual(this.A0F, c9vn.A0F) || !C7384Etj.areEqual(this.A00, c9vn.A00) || !C7384Etj.areEqual(this.A08, c9vn.A08) || !C7384Etj.areEqual(this.A07, c9vn.A07) || !C7384Etj.areEqual(this.A06, c9vn.A06) || !C7384Etj.areEqual(this.A0G, c9vn.A0G) || !C7384Etj.areEqual(this.A0J, c9vn.A0J) || !C7384Etj.areEqual(this.A0H, c9vn.A0H) || !C7384Etj.areEqual(this.A0Q, c9vn.A0Q) || !C7384Etj.areEqual(this.A0I, c9vn.A0I) || !C7384Etj.areEqual(this.A0O, c9vn.A0O) || !C7384Etj.areEqual(this.A0P, c9vn.A0P)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0G = ((((((((((((AnonymousClass006.A0G(this.A0N) * 31) + AnonymousClass006.A0G(this.A0D)) * 31) + AnonymousClass006.A0G(this.A0C)) * 31) + AnonymousClass006.A0G(this.A0M)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A04)) * 31;
        Integer num = this.A03;
        int iA00 = (iA0G + (num == null ? 0 : C9Vg.A00(num))) * 31;
        Integer num2 = this.A02;
        return AnonymousClass005.A0G(this.A0P, (AnonymousClass005.A0F(this.A0I, AnonymousClass005.A0F(this.A0Q, AnonymousClass005.A0F(this.A0H, AnonymousClass005.A0F(this.A0J, AnonymousClass005.A0F(this.A0G, (((((((((((((((C0KA.A01(C0KA.A01((((iA00 + (num2 == null ? 0 : C9VO.A00(num2))) * 31) + AnonymousClass006.A0G(this.A09)) * 31, this.A0L), this.A0K) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0G(this.A0B)) * 31) + AnonymousClass006.A0G(this.A0F)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass006.A0G(this.A06)) * 31))))) + AnonymousClass005.A0H(this.A0O)) * 31);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;LX/9Vg;LX/9VO;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/9Vi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<LX/9Vj;>;Ljava/util/List<LX/9VY;>;Ljava/util/List<LX/9VY;>;Ljava/util/List<LX/9Wt;>;Ljava/util/List<LX/9Ve;>;Ljava/lang/String;Ljava/util/List<LX/BIl;>;)V */
    public C9VN(C9Vi c9Vi, Double d, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, List list2, List list3, List list4, List list5, List list6, boolean z, boolean z2) {
        this.A0N = str;
        this.A0D = str2;
        this.A0C = str3;
        this.A0M = str4;
        this.A05 = str5;
        this.A01 = d;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = num3;
        this.A09 = str6;
        this.A0L = z;
        this.A0K = z2;
        this.A0E = str7;
        this.A0A = str8;
        this.A0B = str9;
        this.A0F = str10;
        this.A00 = c9Vi;
        this.A08 = str11;
        this.A07 = str12;
        this.A06 = str13;
        this.A0G = list;
        this.A0J = list2;
        this.A0H = list3;
        this.A0Q = list4;
        this.A0I = list5;
        this.A0O = str14;
        this.A0P = list6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9VN() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, false, false);
    }
}
