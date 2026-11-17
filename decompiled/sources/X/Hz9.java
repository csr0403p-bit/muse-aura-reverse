package X;

import com.google.common.base.Charsets;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Hz9 extends AbstractC10579HwA {
    public final int A00;
    public final long A01;
    public final C10529Hpr A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List<String> A0A;
    public final boolean A0B;

    public /* synthetic */ Hz9(Integer num, String str, String str2, String str3, String str4, int i) throws IOException {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.A01 = System.currentTimeMillis();
        C10529Hpr c10529Hpr = new C10529Hpr();
        c10529Hpr.A01 = str2;
        c10529Hpr.A00 = str2;
        this.A02 = c10529Hpr;
        this.A00 = 7;
        this.A04 = "";
        this.A05 = str3 == null ? AnonymousClass007.A0a("IAC_", AbstractC7535F0i.A00()) : str3;
        this.A07 = str4 == null ? "mock.renewal.info.jws.string" : str4;
        this.A06 = C60O.A0o(BV4.A18().put("productId", str).put("purchaseToken", this.A07).put("obfuscatedProfileId", str2).put("obfuscatedAccountId", str2));
        this.A0A = Collections.singletonList(str);
        this.A03 = num;
        AbstractC4591CzW abstractC4591CzW = AbstractC4591CzW.A01;
        Charset charset = Charsets.UTF_8;
        C7384Etj.A0V(charset);
        String strA00 = abstractC4591CzW.A00("iacSignature".getBytes(charset));
        C7384Etj.A0U(strA00);
        this.A08 = strA00;
        this.A0B = true;
        this.A09 = str;
    }
}
