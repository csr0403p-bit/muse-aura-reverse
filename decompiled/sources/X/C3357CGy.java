package X;

import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.authlite.api.store.UserSessionCookie;
import java.util.List;
import java.util.Set;

/* renamed from: X.CGy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3357CGy extends C06G {
    public String A00;
    public List<UserSessionCookie> A01;
    public Set<String> A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public static CH0 A0y(AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore, Object obj) {
        auraMetaFRLSecureTokenStore.setMetaAccessToken(null);
        CH0 ch0 = (CH0) obj;
        String str = ch0.A01;
        String str2 = CH0.A01(ch0).A06;
        String str3 = CH0.A01(ch0).A07;
        String str4 = CH0.A01(ch0).A05;
        return AbstractC3358CGz.A00(CH0.A01(ch0).A03, str, null, str2, str3, str4, CH0.A01(ch0).A00, CH0.A01(ch0).A01, CH0.A01(ch0).A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3357CGy) {
                C3357CGy c3357CGy = (C3357CGy) obj;
                if (!C7384Etj.areEqual(this.A08, c3357CGy.A08) || !C7384Etj.areEqual(this.A04, c3357CGy.A04) || !C7384Etj.areEqual(this.A06, c3357CGy.A06) || !C7384Etj.areEqual(this.A07, c3357CGy.A07) || !C7384Etj.areEqual(this.A05, c3357CGy.A05) || !C7384Etj.areEqual(this.A03, c3357CGy.A03) || !C7384Etj.areEqual(this.A01, c3357CGy.A01) || !C7384Etj.areEqual(this.A02, c3357CGy.A02) || !C7384Etj.areEqual(this.A00, c3357CGy.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static String A0z(Object obj) {
        return CH0.A01((CH0) obj).A04;
    }

    public final int hashCode() {
        return ((((((((((((((AnonymousClass001.A0G(this.A08) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass005.A0H(this.A00);
    }

    public final String toString() {
        String str = this.A08;
        String str2 = this.A04;
        String str3 = this.A06;
        String str4 = this.A07;
        String str5 = this.A05;
        Boolean bool = this.A03;
        List<UserSessionCookie> list = this.A01;
        Set<String> set = this.A02;
        String str6 = this.A00;
        StringBuilder sbA0x = C3cI.A0x("UserSessionData(userId=", str);
        sbA0x.append(", accessToken=");
        sbA0x.append(str2);
        sbA0x.append(", secret=");
        sbA0x.append(str3);
        sbA0x.append(", sessionKey=");
        sbA0x.append(str4);
        sbA0x.append(", analyticsClaim=");
        sbA0x.append(str5);
        sbA0x.append(", confirmed=");
        sbA0x.append(bool);
        sbA0x.append(", userSessionCookies=");
        sbA0x.append(list);
        sbA0x.append(", serializedUserSessionCookies=");
        sbA0x.append(set);
        return C3cJ.A0N(", username=", str6, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List<Lcom/facebook/authlite/api/store/UserSessionCookie;>;Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/String;)V */
    public C3357CGy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, Set set) {
        this.A08 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A05 = str5;
        this.A03 = bool;
        this.A01 = list;
        this.A02 = set;
        this.A00 = str6;
    }
}
