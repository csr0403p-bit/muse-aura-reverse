package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Gdw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9691Gdw extends C06G {
    public boolean A00;
    public final long A01 = System.currentTimeMillis();
    public final EnumC10621Hzf A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;
    public final List<String> A06;
    public final List<String> A07;
    public final Map<String, String> A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9691Gdw) {
                C9691Gdw c9691Gdw = (C9691Gdw) obj;
                if (!C7384Etj.areEqual(this.A03, c9691Gdw.A03) || !C7384Etj.areEqual(this.A06, c9691Gdw.A06) || !C7384Etj.areEqual(this.A07, c9691Gdw.A07) || this.A02 != c9691Gdw.A02 || this.A09 != c9691Gdw.A09 || !C7384Etj.areEqual(this.A08, c9691Gdw.A08) || !C7384Etj.areEqual(this.A04, c9691Gdw.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0F(this.A02, (((AnonymousClass001.A0G(this.A03) + AnonymousClass006.A0D(this.A06)) * 31) + AnonymousClass006.A0D(this.A07)) * 31), this.A09) + AnonymousClass006.A0D(this.A08)) * 31) + AnonymousClass005.A0H(this.A04);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;LX/Hzf;ZLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)V */
    public C9691Gdw(EnumC10621Hzf enumC10621Hzf, String str, String str2, List list, List list2, Map map, boolean z) {
        this.A03 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A02 = enumC10621Hzf;
        this.A09 = z;
        this.A08 = map;
        this.A04 = str2;
        this.A05 = AbstractC0878AGe.A0P(list2 == null ? C0881AGi.A00 : list2, list == null ? C0881AGi.A00 : list);
    }
}
