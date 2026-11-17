package X;

import android.net.Uri;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Ehs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7182Ehs {
    public final InterfaceC7005EeA A00;
    public final InterfaceC7005EeA<Boolean> A01;
    public final InterfaceC7005EeA<Boolean> A02;
    public final DV5 A03;
    public final InterfaceC7121Egb<CCV, InterfaceC7064EfB> A04;
    public final InterfaceC7121Egb A05;
    public final C7110EgO A06;
    public final C7154EhP A07;
    public final InterfaceC7250EjU A08;
    public final AtomicLong A09;
    public final InterfaceC7005EeA<Boolean> A0A;
    public final InterfaceC7251EjV A0B;
    public final C7037Eej A0C;
    public static final CancellationException A0E = new CancellationException("Prefetching is not enabled");
    public static final CancellationException A0D = new CancellationException("ImageRequest is null");
    public static final CancellationException A0F = new CancellationException("Modified URL is null");

    /* JADX WARN: Incorrect types in method signature: (LX/EeM<Ljava/lang/Void;>;LX/Eht;LX/Ef5;Ljava/lang/Object;LX/EiK;LX/EjU;Ljava/util/Map<Ljava/lang/String;*>;Ljava/lang/String;)LX/Ej0<Ljava/lang/Void;>; */
    public static final AbstractC7206EiO A00(EnumC7203EiK enumC7203EiK, C7182Ehs c7182Ehs, InterfaceC7015EeM interfaceC7015EeM, EnumC7058Ef5 enumC7058Ef5, C7183Eht c7183Eht, Object obj, String str, Map map) throws NumberFormatException {
        EnumC7058Ef5 enumC7058Ef52 = enumC7058Ef5;
        C7183Eht c7183EhtA01 = c7183Eht;
        InterfaceC7250EjU interfaceC7250EjU = c7183EhtA01.A0B;
        C7194Ei6 c7194Ei6 = new C7194Ei6(c7182Ehs.A0B, interfaceC7250EjU == null ? c7182Ehs.A08 : new C7193Ei5(c7182Ehs.A08, interfaceC7250EjU));
        Uri uri = c7183EhtA01.A04;
        C7384Etj.A0U(uri);
        if (!uri.equals(uri)) {
            C7184Ehu c7184EhuA00 = C7184Ehu.A00(c7183EhtA01);
            c7184EhuA00.A02 = uri;
            c7183EhtA01 = c7184EhuA00.A01();
        }
        try {
            EnumC7058Ef5 enumC7058Ef53 = c7183EhtA01.A0D;
            if (enumC7058Ef53.mValue > enumC7058Ef5.mValue) {
                enumC7058Ef52 = enumC7058Ef53;
            }
            C7266Ejr c7266Ejr = new C7266Ejr(enumC7203EiK, c7182Ehs.A06, c7194Ei6, enumC7058Ef52, c7183EhtA01, obj, String.valueOf(c7182Ehs.A09.getAndIncrement()), true, false);
            c7266Ejr.putExtras(map);
            c7266Ejr.putExtra("prefetch_destination", str);
            C7384Etj.A0Y(interfaceC7015EeM, 0);
            return new C7257Ejg(c7194Ei6, interfaceC7015EeM, c7266Ejr);
        } catch (Exception e) {
            C7207EiP c7207EiP = new C7207EiP();
            c7207EiP.A07(e, null);
            return c7207EiP;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/EeM<LX/EfF<TT;>;>;LX/Eht;LX/Ef5;Ljava/lang/Object;LX/EjU;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;*>;)LX/Ej0<LX/EfF<TT;>;>; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:11:0x002b, B:14:0x0034, B:16:0x0042, B:19:0x004c), top: B:24:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC7206EiO A01(X.C7182Ehs r11, X.InterfaceC7250EjU r12, X.InterfaceC7015EeM r13, X.EnumC7058Ef5 r14, X.C7183Eht r15, java.lang.Object r16, java.util.Map r17) {
        /*
            r5 = r14
            X.C7267Ejs.A00()
            r9 = 0
            r6 = r15
            X.EjU r1 = r15.A0B
            X.EjU r0 = r11.A08
            if (r12 != 0) goto L1f
            if (r1 == 0) goto L17
            X.EjU[] r1 = new X.InterfaceC7250EjU[]{r0, r1}
        L12:
            X.Ei5 r0 = new X.Ei5
            r0.<init>(r1)
        L17:
            X.EjV r1 = r11.A0B
            X.Ei6 r4 = new X.Ei6
            r4.<init>(r1, r0)
            goto L2b
        L1f:
            if (r1 != 0) goto L26
            X.EjU[] r1 = new X.InterfaceC7250EjU[]{r0, r12}
            goto L12
        L26:
            X.EjU[] r1 = new X.InterfaceC7250EjU[]{r0, r12, r1}
            goto L12
        L2b:
            X.Ef5 r2 = r15.A0D     // Catch: java.lang.Exception -> L68
            int r1 = r2.mValue     // Catch: java.lang.Exception -> L68
            int r0 = r14.mValue     // Catch: java.lang.Exception -> L68
            if (r1 <= r0) goto L34
            r5 = r2
        L34:
            java.util.concurrent.atomic.AtomicLong r0 = r11.A09     // Catch: java.lang.Exception -> L68
            long r0 = r0.getAndIncrement()     // Catch: java.lang.Exception -> L68
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L68
            boolean r0 = r15.A0M     // Catch: java.lang.Exception -> L68
            if (r0 != 0) goto L4b
            android.net.Uri r0 = r15.A04     // Catch: java.lang.Exception -> L68
            boolean r0 = X.AbstractC7465Eww.A01(r0)     // Catch: java.lang.Exception -> L68
            r10 = 0
            if (r0 != 0) goto L4c
        L4b:
            r10 = 1
        L4c:
            X.EiK r2 = r15.A07     // Catch: java.lang.Exception -> L68
            X.EgO r3 = r11.A06     // Catch: java.lang.Exception -> L68
            X.Ejr r1 = new X.Ejr     // Catch: java.lang.Exception -> L68
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L68
            r0 = r17
            r1.putExtras(r0)     // Catch: java.lang.Exception -> L68
            X.C7267Ejs.A00()     // Catch: java.lang.Exception -> L68
            X.EiN r0 = new X.EiN     // Catch: java.lang.Exception -> L68
            r0.<init>(r4, r13, r1)     // Catch: java.lang.Exception -> L68
            X.C7267Ejs.A00()     // Catch: java.lang.Exception -> L68
            return r0
        L68:
            r2 = move-exception
            X.EiP r1 = new X.EiP
            r1.<init>()
            r0 = 0
            r1.A07(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7182Ehs.A01(X.Ehs, X.EjU, X.EeM, X.Ef5, X.Eht, java.lang.Object, java.util.Map):X.EiO");
    }

    public static final void A02(C7182Ehs c7182Ehs, C7183Eht c7183Eht) {
        C7117EgX c7117EgX;
        InterfaceC7005EeA interfaceC7005EeA = c7182Ehs.A00;
        if (interfaceC7005EeA == null || (c7117EgX = (C7117EgX) interfaceC7005EeA.get()) == null) {
            return;
        }
        CCV encodedCacheKey = c7182Ehs.A03.getEncodedCacheKey(c7183Eht, null);
        ((C7081Efh) c7117EgX.A02.getValue()).A00(encodedCacheKey);
        ((C7081Efh) c7117EgX.A04.getValue()).A00(encodedCacheKey);
        Iterator itA0i = C3cG.A0i((AbstractMap) C7384Etj.A0G(c7117EgX.A00));
        while (itA0i.hasNext()) {
            ((C7081Efh) BV7.A0s(itA0i)).A00(encodedCacheKey);
        }
    }

    public final InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> A03(C7183Eht c7183Eht, Object obj) {
        try {
            C7154EhP c7154EhP = this.A07;
            C7267Ejs.A00();
            return A01(this, null, C7154EhP.A04(c7154EhP, c7183Eht), EnumC7058Ef5.FULL_FETCH, c7183Eht, obj, null);
        } catch (Exception e) {
            C7207EiP c7207EiP = new C7207EiP();
            c7207EiP.A07(e, null);
            return c7207EiP;
        }
    }

    public C7182Ehs(InterfaceC7005EeA interfaceC7005EeA, InterfaceC7005EeA interfaceC7005EeA2, InterfaceC7005EeA interfaceC7005EeA3, InterfaceC7005EeA interfaceC7005EeA4, DV5 dv5, InterfaceC7121Egb interfaceC7121Egb, InterfaceC7121Egb interfaceC7121Egb2, C7110EgO c7110EgO, C7154EhP c7154EhP, C7037Eej c7037Eej, Set set, Set set2) {
        AnonymousClass005.A14(c7154EhP, set, set2, interfaceC7005EeA);
        C7384Etj.A0Y(dv5, 7);
        this.A07 = c7154EhP;
        this.A01 = interfaceC7005EeA;
        this.A00 = interfaceC7005EeA2;
        this.A08 = new C7193Ei5((Set<? extends InterfaceC7250EjU>) set);
        this.A0B = new C7192Ei4(set2);
        this.A09 = new AtomicLong();
        this.A04 = interfaceC7121Egb;
        this.A05 = interfaceC7121Egb2;
        this.A03 = dv5;
        this.A0C = c7037Eej;
        this.A02 = interfaceC7005EeA3;
        this.A0A = interfaceC7005EeA4;
        this.A06 = c7110EgO;
    }
}
