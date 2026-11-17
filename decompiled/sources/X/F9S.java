package X;

import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F9S {
    public final HsM A00;
    public final HsM A01;
    public final HsM A02;
    public final HsM A03;
    public final String A04;
    public final Map<String, F92> A05;
    public final Set<String> A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9S) {
                F9S f9s = (F9S) obj;
                if (!this.A04.equals(f9s.A04) || !this.A00.equals(f9s.A00) || !C7384Etj.areEqual(this.A03, f9s.A03) || !C7384Etj.areEqual(this.A02, f9s.A02) || !C7384Etj.areEqual(this.A06, f9s.A06) || !C7384Etj.areEqual(this.A05, f9s.A05) || !C7384Etj.areEqual(this.A01, f9s.A01) || this.A07 != f9s.A07 || this.A08 != f9s.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A01((((((((((AnonymousClass005.A0F(this.A00, AnonymousClass001.A0G(this.A04)) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A06)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + C3cH.A02(this.A01)) * 31, this.A07), this.A08);
    }

    public final String toString() {
        String str = this.A04;
        HsM hsM = this.A00;
        HsM hsM2 = this.A03;
        HsM hsM3 = this.A02;
        Set<String> set = this.A06;
        Map<String, F92> map = this.A05;
        HsM hsM4 = this.A01;
        boolean z = this.A07;
        boolean z2 = this.A08;
        StringBuilder sbA0x = C3cI.A0x("ScopedBloksComponentQueryDefinition(id=", str);
        sbA0x.append(", appIdExpression=");
        sbA0x.append(hsM);
        sbA0x.append(", paramsExpression=");
        sbA0x.append(hsM2);
        sbA0x.append(", clientParamsExpression=");
        sbA0x.append(hsM3);
        sbA0x.append(", dependencies=");
        sbA0x.append(set);
        sbA0x.append(", targets=");
        sbA0x.append(map);
        sbA0x.append(", cacheTTLExpression=");
        sbA0x.append(hsM4);
        sbA0x.append(", isDiskCacheEnabled=");
        sbA0x.append(z);
        return C8j5.A0W(", isScoped=", sbA0x, z2);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/HsM;LX/HsM;LX/HsM;Ljava/util/Set<Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;LX/F92;>;LX/HsM;ZZ)V */
    public F9S(HsM hsM, HsM hsM2, HsM hsM3, HsM hsM4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = hsM;
        this.A03 = hsM2;
        this.A02 = hsM3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = hsM4;
        this.A07 = z;
        this.A08 = z2;
    }
}
