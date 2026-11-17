package com.facebook.payments.dcp.xapp.controller.productinfo;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.BGK;
import X.C0881AGi;
import X.C10606Hye;
import X.C3cG;
import X.C78U;
import X.C8897FtE;
import X.C9569GPb;
import X.C9574GPi;
import X.EnumC9706GeK;
import X.GOU;
import X.GPP;
import X.GPX;
import X.GPY;
import X.GPZ;
import X.Hkf;
import X.Hkg;
import X.HoJ;
import X.InterfaceC9568GPa;
import X.InterfaceC9570GPc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class DcpProductDetailsLoader {
    public final InterfaceC9568GPa A00;
    public final C9574GPi A01;

    private final InterfaceC9570GPc A00(Hkf hkf, String str, String str2, boolean z) {
        GOU gou = (GOU) AbstractC0878AGe.A0G(hkf.A01);
        if (gou != null) {
            if (hkf.A00.AJk() == EnumC9706GeK.A0H) {
                GPY gpyABx = this.A00.ABx(str);
                return new GPZ(gou, hkf, gpyABx instanceof GPX ? (GPX) gpyABx : null, (gpyABx == null || str2 != null) ? GPP.A00(gou, null, null) : gpyABx, z);
            }
        }
        return new C9569GPb(hkf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.Hkg r5, com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader r6, X.HtJ r7, boolean r8) {
        /*
            r3 = 3
            boolean r0 = r7 instanceof X.C8iR
            if (r0 == 0) goto L3d
            r4 = r7
            X.8iR r4 = (X.C8iR) r4
            int r0 = r4.$t
            if (r0 != r3) goto L3d
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.Hwg.A00(r3)
        L25:
            X.C3cG.A1H(r4)
            return r3
        L29:
            X.Hwg.A00(r3)
            X.GPi r0 = r6.A01
            X.HuC r0 = r0.A00()
            r4.A02 = r8
            r4.A00 = r1
            java.lang.Object r3 = r0.AYx(r5, r4, r8)
            if (r3 != r2) goto L25
            return r2
        L3d:
            X.8iR r4 = new X.8iR
            r4.<init>(r6, r7, r3)
            goto L17
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader.A01(X.Hkg, com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader, X.HtJ, boolean):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hkg;Ljava/util/List<LX/GPR;>;Ljava/lang/String;ZLX/HtJ<-LX/Hkf;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[PHI: r0 r1
  0x00ab: PHI (r0v16 X.Hye) = (r0v12 X.Hye), (r0v18 X.Hye) binds: [B:34:0x0095, B:32:0x008e] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r1v7 X.Hm8) = (r1v4 X.Hm8), (r1v8 X.Hm8) binds: [B:34:0x0095, B:32:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.Hkf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.Hkg r11, java.lang.String r12, java.util.List r13, X.HtJ r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader.A03(X.Hkg, java.lang.String, java.util.List, X.HtJ, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.Hkg r11, X.HtJ<? super X.InterfaceC9570GPc> r12) {
        /*
            r10 = this;
            r8 = r11
            r3 = 8
            boolean r0 = r12 instanceof X.C8912FtU
            r7 = r10
            if (r0 == 0) goto L2e
            r11 = r12
            X.FtU r11 = (X.C8912FtU) r11
            int r0 = r11.$t
            if (r0 != r3) goto L2e
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r11.A00 = r2
        L1a:
            java.lang.Object r1 = r11.A03
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.A00
            r12 = 0
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L34
            if (r0 == r6) goto L93
            if (r0 == r3) goto L93
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.FtU r11 = new X.FtU
            r11.<init>(r10, r12, r3)
            goto L1a
        L34:
            X.Hwg.A00(r1)
            java.util.List<java.lang.String> r1 = r8.A02
            java.util.List<java.lang.String> r0 = r8.A03
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r0, r1)
            java.lang.Object r5 = X.AbstractC0878AGe.A0J(r0)
            java.lang.String r5 = (java.lang.String) r5
            X.GPa r0 = r10.A00
            java.lang.String r4 = r8.A00
            X.C7384Etj.A0Y(r5, r6)
            X.GPY r1 = r0.ABx(r5)
            r9 = 0
            if (r1 == 0) goto L7b
            X.HoJ r0 = r1.AF1()
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.A01
        L5b:
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto L7b
            X.GOU r0 = r1.AEe()
            if (r0 == 0) goto L7b
            X.HoG r3 = X.C9732Gel.A03
            java.util.List r2 = java.util.Collections.singletonList(r0)
            X.AGi r1 = X.C0881AGi.A00
            X.Hkf r0 = new X.Hkf
            r0.<init>(r3, r2, r1)
            X.GPc r2 = r10.A00(r0, r5, r4, r6)
            return r2
        L79:
            r0 = r9
            goto L5b
        L7b:
            r11.A01 = r8
            r11.A02 = r5
            if (r4 == 0) goto L8a
            r11.A00 = r6
            java.lang.Object r1 = A01(r8, r10, r11, r12)
        L87:
            if (r1 != r2) goto L9e
            return r2
        L8a:
            r11.A00 = r3
            X.AGi r10 = X.C0881AGi.A00
            java.lang.Object r1 = r7.A03(r8, r9, r10, r11, r12)
            goto L87
        L93:
            java.lang.Object r5 = r11.A02
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r11.A01
            X.Hkg r8 = (X.Hkg) r8
            X.Hwg.A00(r1)
        L9e:
            X.Hkf r1 = (X.Hkf) r1
            java.lang.String r0 = r8.A00
            X.GPc r2 = r7.A00(r1, r5, r0, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader.A04(X.Hkg, X.HtJ):java.lang.Object");
    }

    public DcpProductDetailsLoader(InterfaceC9568GPa interfaceC9568GPa, C9574GPi c9574GPi) {
        this.A01 = c9574GPi;
        this.A00 = interfaceC9568GPa;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/78U;LX/Hkg;Ljava/util/List<LX/GPX;>;)V */
    private final void A02(Hkg hkg, C78U c78u, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (hkg.A02.isEmpty() && hkg.A03.isEmpty()) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GPX gpx = (GPX) it.next();
            String str = gpx.A02.A03;
            if (str != null) {
                AnonymousClass002.A1J(str, gpx, arrayListA0h);
            }
        }
        c78u.A02(new C8897FtE(AGH.A06(arrayListA0h), this, hkg, null, 6));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/78U;LX/Hkg;Ljava/util/List<LX/GPX;>;)V */
    public final void A05(Hkg hkg, C78U c78u, List list) {
        List listSingletonList;
        List listSingletonList2;
        C10606Hye c10606Hye;
        ArrayList<GPX> arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : list) {
            if (((GPX) obj).A01.A02 != null) {
                arrayListA0h.add(obj);
            } else {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((GPX) it.next()).A02.A03;
            if (str != null) {
                arrayListA0h3.add(str);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0h3);
        ArrayList arrayListA0h4 = C3cG.A0h();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String str2 = ((GPX) it2.next()).A02.A03;
            if (str2 != null) {
                arrayListA0h4.add(str2);
            }
        }
        Set setA03 = BGK.A03(AbstractC0878AGe.A0g(arrayListA0h4), setA0g);
        List<String> list2 = hkg.A02;
        ArrayList arrayListA0h5 = C3cG.A0h();
        Iterator<String> it3 = list2.iterator();
        while (it3.hasNext()) {
            AbstractC7610F5x.A1R(arrayListA0h5, it3, setA03);
        }
        List<String> list3 = hkg.A03;
        ArrayList arrayListA0h6 = C3cG.A0h();
        Iterator<String> it4 = list3.iterator();
        while (it4.hasNext()) {
            AbstractC7610F5x.A1R(arrayListA0h6, it4, setA03);
        }
        GPX gpx = (GPX) AbstractC0878AGe.A0K(list);
        A02(new Hkg((gpx == null || (c10606Hye = gpx.A02) == null) ? null : c10606Hye.A06, arrayListA0h5, arrayListA0h6, null), c78u, arrayListA0h2);
        for (GPX gpx2 : arrayListA0h) {
            C10606Hye c10606Hye2 = gpx2.A02;
            String str3 = c10606Hye2.A03;
            if (str3 != null) {
                if (list2.contains(str3)) {
                    listSingletonList = Collections.singletonList(str3);
                    listSingletonList2 = C0881AGi.A00;
                } else if (list3.contains(str3)) {
                    listSingletonList = C0881AGi.A00;
                    listSingletonList2 = Collections.singletonList(str3);
                }
                String str4 = c10606Hye2.A06;
                HoJ hoJ = gpx2.A01.A02;
                A02(new Hkg(str4, listSingletonList, listSingletonList2, hoJ != null ? hoJ.A01 : null), c78u, Collections.singletonList(gpx2));
            }
        }
    }
}
