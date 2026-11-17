package X;

import android.net.Uri;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;

/* renamed from: X.Cjz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4018Cjz {
    public String A00;
    public String A01;
    public String A02;
    public final C4030CkL A03;
    public final C3341CFl A04;
    public final C9g A05;

    public final void A00() {
        String str;
        C3341CFl c3341CFl;
        String str2 = this.A00;
        if (str2 == null) {
            throw C60O.A0i("Must set method");
        }
        if (this.A01 == null || (str = this.A02) == null) {
            throw C60O.A0i("Must set tier and uriPath (maybe you should be using a helper like FbGraphQLRequestBuilder?)");
        }
        if (str.startsWith("method/")) {
            String strSubstring = str.substring(7);
            c3341CFl = this.A04;
            C3341CFl.A00(c3341CFl, strSubstring, AgeCheckFunnelLogging.KEY_METHOD);
        } else {
            c3341CFl = this.A04;
            C3341CFl.A00(c3341CFl, str2, AgeCheckFunnelLogging.KEY_METHOD);
        }
        C4030CkL c4030CkL = this.A03;
        String string = new Uri.Builder().scheme("https").authority(this.A05.facebookAuthority(this.A01)).path(this.A02).build().toString();
        CYD cyd = c4030CkL.A02;
        C7384Etj.A0Y(string, 0);
        cyd.A05 = string;
        c3341CFl.A03 = false;
        C3345CFq c3345CFq = new C3345CFq(c3341CFl);
        cyd.A00("Content-Encoding", "gzip");
        CG4 cg4 = new CG4();
        cg4.A00 = c3345CFq;
        cyd.A04 = "POST";
        cyd.A00 = cg4;
        C4027CkG c4027CkG = c4030CkL.A01;
        C4019Ck1 c4019Ck1 = new C4019Ck1(c4030CkL.A00);
        C4035Ckb c4035Ckb = c4027CkG.A00;
        c4035Ckb.A00.A02.execute(new Ck0(c4019Ck1, c4035Ckb));
    }

    public C4018Cjz(C4030CkL c4030CkL, C9g c9g, C3339CFj c3339CFj) {
        this.A03 = c4030CkL;
        this.A05 = c9g;
        this.A04 = c3339CFj.A03();
    }
}
