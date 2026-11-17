package X;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.EhP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7154EhP {
    public Map<InterfaceC7015EeM<EfF<InterfaceC7064EfB>>, InterfaceC7015EeM<Void>> A00;
    public Map<InterfaceC7015EeM<EfF<InterfaceC7064EfB>>, InterfaceC7015EeM<EfF<InterfaceC7064EfB>>> A01;
    public Map<InterfaceC7015EeM<EfF<InterfaceC7064EfB>>, InterfaceC7015EeM<EfF<InterfaceC7064EfB>>> A02;
    public final InterfaceC7005EeA<Boolean> A03;
    public final BXh A04;
    public final C7155EhQ A05;
    public final AbstractC6692EUz A06;
    public final C7037Eej A07;
    public final InterfaceC7006EeD A08;
    public final Set A09;
    public final F0C A0A;
    public final F0C A0B;
    public final F0C A0C;
    public final F0C A0D;
    public final F0C A0E;
    public final F0C A0F;
    public final F0C A0G;
    public final F0C A0H;
    public final F0C A0I;
    public final F0C A0J;
    public final F0C A0K;
    public final F0C A0L;
    public final F0C A0M;
    public final F0C A0N;
    public final F0C A0O;
    public final F0C A0P;
    public final F0C A0Q;
    public final F0C A0R;
    public final boolean A0S;
    public final ContentResolver A0T;
    public final boolean A0U;

    public final InterfaceC7015EeM<EfF<InterfaceC7064EfB>> A05(InterfaceC7015EeM<C6988Edo> interfaceC7015EeM) {
        C7384Etj.A0Y(interfaceC7015EeM, 0);
        C7267Ejs.A00();
        C7155EhQ c7155EhQ = this.A05;
        C6524EBy c6524EBy = c7155EhQ.A0F;
        Executor executor = ((C7120Ega) c7155EhQ.A0B).A01;
        InterfaceC7068EfO interfaceC7068EfO = c7155EhQ.A0D;
        Eh5 eh5 = c7155EhQ.A0E;
        BXh bXh = c7155EhQ.A0A;
        boolean z = c7155EhQ.A0H;
        return A01(this, new C7041Een(AbstractC7180Ehp.A00, c7155EhQ.A09, bXh, interfaceC7068EfO, eh5, c6524EBy, interfaceC7015EeM, executor, z));
    }

    public static final C7104EgI A00(C7154EhP c7154EhP, InterfaceC7015EeM interfaceC7015EeM) {
        if (c7154EhP.A0U) {
            C7267Ejs.A00();
            C7155EhQ c7155EhQ = c7154EhP.A05;
            InterfaceC7005EeA interfaceC7005EeA = c7155EhQ.A03;
            DV5 dv5 = c7155EhQ.A06;
            interfaceC7015EeM = new C7048Eeu(interfaceC7005EeA, dv5, new C7055Ef1(interfaceC7005EeA, dv5, interfaceC7015EeM));
        }
        C7155EhQ c7155EhQ2 = c7154EhP.A05;
        InterfaceC7121Egb interfaceC7121Egb = c7155EhQ2.A08;
        DV5 dv52 = c7155EhQ2.A06;
        return new C7104EgI(dv52, c7155EhQ2.A0C, new C7047Eet(dv52, interfaceC7121Egb, interfaceC7015EeM));
    }

    public static final InterfaceC7015EeM A01(C7154EhP c7154EhP, InterfaceC7015EeM interfaceC7015EeM) {
        C7155EhQ c7155EhQ = c7154EhP.A05;
        InterfaceC7121Egb<CCV, InterfaceC7064EfB> interfaceC7121Egb = c7155EhQ.A07;
        DV5 dv5 = c7155EhQ.A06;
        return new EfK(dv5, interfaceC7121Egb, new C7036Eei(new C7105EgJ(dv5, c7155EhQ.A0C, new C7049Eev(dv5, interfaceC7121Egb, interfaceC7015EeM)), c7154EhP.A07));
    }

    public static final InterfaceC7015EeM A02(C7154EhP c7154EhP, InterfaceC7015EeM interfaceC7015EeM) {
        C7155EhQ c7155EhQ = c7154EhP.A05;
        Executor executor = ((C7120Ega) c7155EhQ.A0B).A02;
        return A03(c7154EhP, interfaceC7015EeM, new InterfaceC7013EeK[]{new C6985Edl(c7155EhQ.A00, c7155EhQ.A0G, executor)});
    }

    public final InterfaceC7015EeM<Void> A06(C7183Eht c7183Eht) {
        F0C f0c;
        CVn.A02(BV7.A1S(c7183Eht.A0D.mValue, EnumC7058Ef5.ENCODED_MEMORY_CACHE.mValue));
        int i = c7183Eht.A03;
        if (i == 0) {
            Set set = this.A09;
            if (set != null && C7384Etj.areEqual(this.A03.get(), AnonymousClass001.A0i())) {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw BV4.A0a("getCustomNetworkEncodedImagePrefetchSequence");
                }
            }
            f0c = this.A0Q;
        } else {
            if (i != 2 && i != 3) {
                Uri uri = c7183Eht.A04;
                C7384Etj.A0U(uri);
                String strA0o = C60O.A0o(uri);
                if (strA0o.length() > 30) {
                    strA0o = FGI.A0M(BV4.A0j(strA0o, 30), "...");
                }
                throw C60Q.A0U("Unsupported uri scheme for encoded image fetch! Uri is: ", strA0o);
            }
            f0c = this.A0J;
        }
        return (InterfaceC7015EeM) f0c.getValue();
    }

    public C7154EhP(ContentResolver contentResolver, InterfaceC7005EeA interfaceC7005EeA, BXh bXh, C7155EhQ c7155EhQ, AbstractC6692EUz abstractC6692EUz, C7037Eej c7037Eej, InterfaceC7006EeD interfaceC7006EeD, Set set, boolean z, boolean z2) {
        AnonymousClass003.A0v(contentResolver, abstractC6692EUz);
        AnonymousClass002.A1F(bXh, 5, interfaceC7006EeD);
        this.A0T = contentResolver;
        this.A05 = c7155EhQ;
        this.A06 = abstractC6692EUz;
        this.A0S = z;
        this.A07 = c7037Eej;
        this.A04 = bXh;
        this.A0U = z2;
        this.A08 = interfaceC7006EeD;
        this.A09 = set;
        this.A03 = interfaceC7005EeA;
        this.A02 = C3cG.A0j();
        this.A00 = C3cG.A0j();
        this.A01 = C3cG.A0j();
        this.A0O = new C5322DgG(null, new EWq(this, 28));
        this.A0I = C5322DgG.A00(this, 22);
        this.A0G = C5322DgG.A00(this, 20);
        this.A0P = C5322DgG.A00(this, 29);
        this.A0C = C5322DgG.A00(this, 16);
        this.A0Q = C5322DgG.A00(this, 30);
        this.A0D = C5322DgG.A00(this, 17);
        this.A0J = C5322DgG.A00(this, 23);
        this.A0B = C5322DgG.A00(this, 15);
        this.A0A = C5322DgG.A00(this, 14);
        this.A0K = C5322DgG.A00(this, 24);
        this.A0N = C5322DgG.A00(this, 27);
        this.A0H = C5322DgG.A00(this, 21);
        this.A0M = C5322DgG.A00(this, 26);
        this.A0R = C5322DgG.A00(this, 31);
        this.A0L = C5322DgG.A00(this, 25);
        this.A0F = C5322DgG.A00(this, 19);
        this.A0E = C5322DgG.A00(this, 18);
    }

    public static final InterfaceC7015EeM A03(C7154EhP c7154EhP, InterfaceC7015EeM interfaceC7015EeM, InterfaceC7013EeK[] interfaceC7013EeKArr) {
        C7062Ef9 c7062Ef9 = new C7062Ef9(A00(c7154EhP, interfaceC7015EeM));
        C7155EhQ c7155EhQ = c7154EhP.A05;
        InterfaceC7006EeD interfaceC7006EeD = c7154EhP.A08;
        return c7154EhP.A05(new C7059Ef6(c7155EhQ.A00(new C7014EeL((InterfaceC7013EeK[]) Arrays.copyOf(interfaceC7013EeKArr, interfaceC7013EeKArr.length)), interfaceC7006EeD, true), new C7076Efa(c7155EhQ.A00(c7062Ef9, interfaceC7006EeD, true), ((C7120Ega) c7155EhQ.A0B).A03)));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC7015EeM A04(X.C7154EhP r8, X.C7183Eht r9) {
        /*
            X.C7267Ejs.A00()
            java.lang.String r6 = " custom factories"
            java.lang.String r5 = "> "
            java.lang.String r7 = "Unsupported uri scheme! Uri is: <"
            r4 = 0
            android.net.Uri r2 = r9.A04
            X.C7384Etj.A0U(r2)
            int r0 = r9.A03
            if (r0 == 0) goto L69
            switch(r0) {
                case 2: goto La1;
                case 3: goto L94;
                case 4: goto La8;
                case 5: goto L66;
                case 6: goto L63;
                case 7: goto L60;
                case 8: goto L5d;
                default: goto L16;
            }
        L16:
            java.util.Set r3 = r8.A09
            if (r3 == 0) goto L2e
            java.util.Iterator r1 = r3.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            r1.next()
            java.lang.String r0 = "getCustomDecodedImageSequence"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L2e:
            java.lang.String r2 = X.C60O.A0o(r2)
            int r1 = r2.length()
            r0 = 30
            if (r1 <= r0) goto L44
            java.lang.String r1 = X.BV4.A0j(r2, r0)
            java.lang.String r0 = "..."
            java.lang.String r2 = X.FGI.A0M(r1, r0)
        L44:
            if (r3 == 0) goto L4e
            int r0 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L4e:
            java.lang.StringBuilder r0 = X.C3cI.A0x(r7, r2)
            r0.append(r5)
            r0.append(r4)
            java.lang.IllegalArgumentException r0 = X.C8j3.A0w(r6, r0)
            throw r0
        L5d:
            X.F0C r0 = r8.A0R
            goto L9a
        L60:
            X.F0C r0 = r8.A0E
            goto L9a
        L63:
            X.F0C r0 = r8.A0L
            goto L9a
        L66:
            X.F0C r0 = r8.A0F
            goto L9a
        L69:
            java.util.Set r2 = r8.A09
            if (r2 == 0) goto L91
            X.EeA<java.lang.Boolean> r0 = r8.A03
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r0 = X.AnonymousClass001.A0i()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L91
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L91
            r1.next()
            java.lang.String r0 = "getCustomNetworkDecodedImageSequence"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L91:
            X.F0C r0 = r8.A0P
            goto L9a
        L94:
            boolean r0 = r9.A0K
            if (r0 != 0) goto La5
            X.F0C r0 = r8.A0K
        L9a:
            java.lang.Object r0 = r0.getValue()
            X.EeM r0 = (X.InterfaceC7015EeM) r0
            return r0
        La1:
            boolean r0 = r9.A0K
            if (r0 == 0) goto Lbd
        La5:
            X.F0C r0 = r8.A0M
            goto L9a
        La8:
            boolean r0 = r9.A0K
            if (r0 != 0) goto La5
            android.content.ContentResolver r0 = r8.A0T
            java.lang.String r1 = r0.getType(r2)
            if (r1 == 0) goto Lc0
            java.lang.String r0 = "video/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Lc0
        Lbd:
            X.F0C r0 = r8.A0N
            goto L9a
        Lc0:
            X.F0C r0 = r8.A0H
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7154EhP.A04(X.EhP, X.Eht):X.EeM");
    }
}
