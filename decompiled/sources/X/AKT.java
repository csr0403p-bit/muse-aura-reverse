package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AKT {
    /* JADX WARN: Incorrect types in method signature: (LX/2Jb;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, C2Jb c2Jb, G0V g0v, int i) {
        bfm.AgG(-1162003659);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c2Jb) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AKQ akq = c2Jb.A00;
            ArrayList arrayListA11 = C60O.A11(akq.size());
            Iterator itA0n = AnonymousClass002.A0n(akq);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                arrayListA11.add(((AKP) entry.getValue()).Ah2((AKN) entry.getKey()));
            }
            AKJ[] akjArr = (AKJ[]) arrayListA11.toArray(new AKJ[0]);
            A02(bfm, g0v, (AKJ[]) Arrays.copyOf(akjArr, akjArr.length), iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3bZ(c2Jb, g0v, i, 3);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AKJ<*>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.BFM r10, X.AKJ r11, X.G0V r12, int r13) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r10.AgG(r0)
            r3 = r10
            X.BBI r3 = (X.BBI) r3
            X.AKQ r2 = X.BBI.A04(r3)
            java.lang.Object r5 = X.BBL.A02
            r4 = 201(0xc9, float:2.82E-43)
            r1 = 0
            r0 = 0
            X.BBI.A0P(r3, r5, r0, r4, r1)
            java.lang.Object r4 = r3.AaT()
            java.lang.Object r0 = X.C78N.A00
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 == 0) goto Ld7
            r4 = 0
        L23:
            X.AKN<T> r7 = r11.A01
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.C7384Etj.A0Z(r7, r0)
            X.AKP r6 = r7.A03(r11, r4)
            boolean r9 = X.C7384Etj.areEqual(r6, r4)
            if (r9 != 0) goto L37
            r3.Ai0(r6)
        L37:
            boolean r0 = r3.A0M
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L93
            boolean r0 = r11.A00
            if (r0 != 0) goto L47
            boolean r0 = r2.containsKey(r7)
            if (r0 != 0) goto L4b
        L47:
            X.AJu r2 = r2.AYs(r7, r6)
        L4b:
            r3.A0S = r5
        L4d:
            X.AKU r4 = r3.A0Z
            boolean r0 = r3.A0P
            r4.A00(r0)
            r3.A0P = r8
            r3.A0C = r2
            java.lang.Object r5 = X.BBL.A00
            r0 = 202(0xca, float:2.83E-43)
            X.BBI.A0P(r3, r5, r2, r0, r1)
            int r0 = r13 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.invoke(r10, r0)
            r2 = 0
            X.BBI.A0R(r3, r1)
            X.BBI.A0R(r3, r1)
            int[] r1 = r4.A01
            int r0 = r4.A00
            int r0 = r0 + (-1)
            r4.A00 = r0
            r0 = r1[r0]
            if (r0 == 0) goto L7e
            r2 = 1
        L7e:
            r3.A0P = r2
            r0 = 0
            r3.A0C = r0
            X.BBb r2 = r10.AAc()
            if (r2 == 0) goto L92
            r1 = 12
            X.BTH r0 = new X.BTH
            r0.<init>(r11, r12, r13, r1)
            r2.A06 = r0
        L92:
            return
        L93:
            X.BBQ r4 = r3.A0F
            int r0 = r4.A01
            java.lang.Object r4 = r4.A06(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            X.C7384Etj.A0Z(r4, r0)
            X.AKQ r4 = (X.AKQ) r4
            boolean r0 = r3.AKh()
            if (r0 == 0) goto Laa
            if (r9 != 0) goto Lb6
        Laa:
            boolean r0 = r11.A00
            if (r0 != 0) goto Ld2
            boolean r0 = r2.containsKey(r7)
            if (r0 == 0) goto Ld2
            if (r9 == 0) goto Lcd
        Lb6:
            boolean r0 = r3.A0P
            if (r0 != 0) goto Lcd
        Lba:
            r2 = r4
        Lbb:
            boolean r0 = r3.A0Q
            if (r0 != 0) goto Lc2
            if (r4 != r2) goto Lc2
            r5 = 0
        Lc2:
            r8 = r5
            if (r5 == 0) goto L4d
            boolean r0 = r3.A0M
            if (r0 != 0) goto L4d
            X.BBI.A0N(r3, r2)
            goto L4d
        Lcd:
            boolean r0 = r3.A0P
            if (r0 == 0) goto Lba
            goto Lbb
        Ld2:
            X.AJu r2 = r2.AYs(r7, r6)
            goto Lbb
        Ld7:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            X.C7384Etj.A0Z(r4, r0)
            X.AKP r4 = (X.AKP) r4
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AKT.A01(X.BFM, X.AKJ, X.G0V, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: ([LX/AKJ<*>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A02(BFM bfm, G0V g0v, AKJ[] akjArr, int i) {
        AKQ akqA05;
        bfm.AgG(415205898);
        BBI bbi = (BBI) bfm;
        AKQ akqA04 = BBI.A04(bbi);
        BBI.A0P(bbi, BBL.A02, null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (bbi.A0M) {
            akqA05 = BBI.A05(bbi, akqA04, AKO.A03(akqA04, C0967AJu.A00, akjArr));
            bbi.A0S = true;
        } else {
            BBQ bbq = bbi.A0F;
            Object objA08 = bbq.A08(bbq.A01, 0);
            C7384Etj.A0Z(objA08, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            AKQ akq = (AKQ) objA08;
            BBQ bbq2 = bbi.A0F;
            Object objA082 = bbq2.A08(bbq2.A01, 1);
            C7384Etj.A0Z(objA082, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            AKQ akq2 = (AKQ) objA082;
            C0967AJu c0967AJuA03 = AKO.A03(akqA04, akq2, akjArr);
            if (bbi.AKh() && !bbi.A0Q && C7384Etj.areEqual(akq2, c0967AJuA03)) {
                bbi.A02 += bbi.A0F.A02();
                akqA05 = akq;
            } else {
                akqA05 = BBI.A05(bbi, akqA04, c0967AJuA03);
                if (!bbi.A0Q && akqA05.equals(akq)) {
                    z = false;
                }
                z2 = z;
                if (z && !bbi.A0M) {
                    BBI.A0N(bbi, akqA05);
                }
            }
        }
        AKU aku = bbi.A0Z;
        aku.A00(bbi.A0P ? 1 : 0);
        bbi.A0P = z2;
        bbi.A0C = akqA05;
        BBI.A0P(bbi, BBL.A00, akqA05, 202, 0);
        g0v.invoke(bfm, Integer.valueOf((i >> 3) & 14));
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, false);
        int[] iArr = aku.A01;
        int i2 = aku.A00 - 1;
        aku.A00 = i2;
        bbi.A0P = iArr[i2] != 0;
        bbi.A0C = null;
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTH(akjArr, g0v, i, 13);
        }
    }
}
