package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EW4 {
    public final Context A00;
    public final EWH A01;
    public final EWD A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List<String> A09;
    public final List<String> A0A;
    public final Map<String, Object> A0B;
    public final Map<String, String> A0C;
    public final boolean A0D;
    public final String A0E;
    public final String A0F;

    public EW4(Context context, EWH ewh, EWD ewd, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Map map, Map map2, boolean z) {
        AnonymousClass002.A1B(str, 2, str2);
        AnonymousClass002.A1F(str6, 8, map);
        this.A00 = context;
        this.A02 = ewd;
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A0E = str4;
        this.A0F = str5;
        this.A0A = list;
        this.A06 = str6;
        this.A0B = map;
        this.A0C = map2;
        this.A01 = ewh;
        this.A05 = str7;
        this.A09 = list2;
        this.A0D = z;
        this.A03 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EW4) {
                EW4 ew4 = (EW4) obj;
                if (!this.A00.equals(ew4.A00) || !this.A02.equals(ew4.A02) || !this.A07.equals(ew4.A07) || !this.A08.equals(ew4.A08) || !C7384Etj.areEqual(this.A04, ew4.A04) || !C7384Etj.areEqual(this.A0E, ew4.A0E) || !C7384Etj.areEqual(this.A0F, ew4.A0F) || !C7384Etj.areEqual(this.A0A, ew4.A0A) || !this.A06.equals(ew4.A06) || !this.A0B.equals(ew4.A0B) || !C7384Etj.areEqual(this.A0C, ew4.A0C) || !this.A01.equals(ew4.A01) || !C7384Etj.areEqual(this.A05, ew4.A05) || !C7384Etj.areEqual(this.A09, ew4.A09) || this.A0D != ew4.A0D || !C7384Etj.areEqual(this.A03, ew4.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C0KA.A01((((AnonymousClass005.A0F(this.A01, (AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0I(this.A06, (((((((AnonymousClass005.A0I(this.A08, AnonymousClass005.A0I(this.A07, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A00)))) + AnonymousClass006.A0G(this.A04)) * 31) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0G(this.A0F)) * 31) + AnonymousClass006.A0D(this.A0A)) * 31)) + AnonymousClass006.A0D(this.A0C)) * 31) + AnonymousClass006.A0G(this.A05)) * 31) + AnonymousClass006.A0D(this.A09)) * 31, this.A0D) * 31 * 31) + C3cH.A02(this.A03);
    }

    public final String toString() {
        Context context = this.A00;
        EWD ewd = this.A02;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A04;
        String str4 = this.A0E;
        String str5 = this.A0F;
        List<String> list = this.A0A;
        String str6 = this.A06;
        Map<String, Object> map = this.A0B;
        Map<String, String> map2 = this.A0C;
        EWH ewh = this.A01;
        String str7 = this.A05;
        List<String> list2 = this.A09;
        boolean z = this.A0D;
        Long l = this.A03;
        StringBuilder sbA0f = C3cG.A0f(context, "PttGenerationParams(context=");
        sbA0f.append(", pttManager=");
        sbA0f.append(ewd);
        sbA0f.append(", paymentType=");
        sbA0f.append(str);
        sbA0f.append(AbstractC7606F5t.A00(22));
        sbA0f.append(str2);
        sbA0f.append(", authTicketClientId=");
        sbA0f.append(str3);
        sbA0f.append(", certificate=");
        sbA0f.append(str4);
        sbA0f.append(", encryptionKeyId=");
        sbA0f.append(str5);
        sbA0f.append(", encryptionKeyTrustChain=");
        sbA0f.append(list);
        sbA0f.append(C60N.A00(10));
        sbA0f.append(str6);
        sbA0f.append(", payload=");
        sbA0f.append(map);
        sbA0f.append(", sensitiveKeyMap=");
        sbA0f.append(map2);
        sbA0f.append(", pttObserver=");
        sbA0f.append(ewh);
        sbA0f.append(", authTicketType=");
        sbA0f.append(str7);
        sbA0f.append(C8j2.A00(27));
        sbA0f.append(list2);
        sbA0f.append(", enableTrustedDeviceSignal=");
        sbA0f.append(z);
        sbA0f.append(", extraSigningFingerprints=");
        sbA0f.append((Object) null);
        sbA0f.append(", customSignatureCallback=");
        sbA0f.append((Object) null);
        return C3cJ.A0L(l, C8j2.A00(39), sbA0f);
    }
}
