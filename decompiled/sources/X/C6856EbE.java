package X;

import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.EbE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6856EbE {
    public final ProxySelector A00;
    public final List<C6872EbU> A01;
    public final List<EnumC6905Ec1> A02;
    public final SocketFactory A03;
    public final HostnameVerifier A04;
    public final SSLSocketFactory A05;
    public final Eb3 A06;
    public final C6787EZw A07;
    public final DWp A08;
    public final C6854EbC A09;

    public final boolean A00(C6856EbE c6856EbE) {
        return this.A08.equals(c6856EbE.A08) && this.A06.equals(c6856EbE.A06) && C7384Etj.areEqual(this.A02, c6856EbE.A02) && C7384Etj.areEqual(this.A01, c6856EbE.A01) && this.A00.equals(c6856EbE.A00) && C7384Etj.areEqual(this.A05, c6856EbE.A05) && C7384Etj.areEqual(this.A04, c6856EbE.A04) && C7384Etj.areEqual(this.A07, c6856EbE.A07) && this.A09.A00 == c6856EbE.A09.A00;
    }

    public C6856EbE(String str, ProxySelector proxySelector, List list, List list2, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, Eb3 eb3, C6787EZw c6787EZw, DWp dWp, int i) {
        C7384Etj.A0Y(list, 9);
        C7384Etj.A0Y(list2, 10);
        this.A08 = dWp;
        this.A03 = socketFactory;
        this.A05 = sSLSocketFactory;
        this.A04 = hostnameVerifier;
        this.A07 = c6787EZw;
        this.A06 = eb3;
        this.A00 = proxySelector;
        C6855EbD c6855EbD = new C6855EbD();
        String str2 = sSLSocketFactory != null ? "https" : AuraDeeplinkHandlerActivity.HTTP;
        String str3 = AuraDeeplinkHandlerActivity.HTTP;
        if (!str2.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP)) {
            str3 = "https";
            if (!str2.equalsIgnoreCase("https")) {
                throw C7384Etj.A0D(str2, "unexpected scheme: ");
            }
        }
        c6855EbD.A05 = str3;
        String strA00 = AbstractC6557EEt.A00(C6854EbC.A01(str, 0, str.length(), false));
        if (strA00 == null) {
            throw C7384Etj.A0D(str, "unexpected host: ");
        }
        c6855EbD.A04 = strA00;
        if (1 > i || i >= 65536) {
            throw C7384Etj.A0D(Integer.valueOf(i), "unexpected port: ");
        }
        c6855EbD.A00 = i;
        this.A09 = c6855EbD.A00();
        byte[] bArr = AbstractC6843Eav.A06;
        this.A02 = BV5.A13(list);
        this.A01 = BV5.A13(list2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6856EbE) {
            C6856EbE c6856EbE = (C6856EbE) obj;
            if (C7384Etj.areEqual(this.A09, c6856EbE.A09) && A00(c6856EbE)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A08, BV8.A09(this.A09)))))) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A07);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Address{");
        C6854EbC c6854EbC = this.A09;
        sbA0x.append(c6854EbC.A02);
        sbA0x.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        sbA0x.append(c6854EbC.A00);
        C8j3.A1K(sbA0x);
        sbA0x.append(AnonymousClass006.A0y(this.A00, "proxySelector=", C60O.A0w()));
        return C8j3.A15(sbA0x);
    }
}
