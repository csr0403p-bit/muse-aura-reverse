package X;

import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BBI implements BFM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public C1143Abw A07;
    public Ab2<AKQ> A08;
    public AbstractC2249BCu A09;
    public AbstractC2249BCu A0A;
    public BBd A0B;
    public AKQ A0C;
    public AKQ A0D;
    public InterfaceC2246BCr A0E;
    public BBQ A0F;
    public BBW A0G;
    public BBJ A0H;
    public C2232BCc A0I;
    public BCW A0J;
    public InterfaceC1656Anf A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public int[] A0T;
    public BCR A0U;
    public final InterfaceC1370Ahw<?> A0V;
    public final BBV A0W;
    public final BBG A0X;
    public final AKU A0Y;
    public final AKU A0Z;
    public final BBW A0a;
    public final BBR A0b;
    public final ArrayList<BBb> A0c;
    public final ArrayList<BBd> A0d;
    public final List<C2233BCd> A0e;
    public final Set<InterfaceC1559AlZ> A0f;
    public final C78T A0g;
    public final C2243BCo A0h;
    public final BCX A0i;
    public final AKU A0j;
    public final BFB A0k;

    public static final Integer A06(BBV bbv, BBQ bbq, int i, int i2) {
        Integer numA06;
        C2231BCb c2231BCb;
        InterfaceC1560Ala interfaceC1560Ala;
        while (true) {
            InterfaceC1559AlZ interfaceC1559AlZ = null;
            if (i >= i2) {
                return null;
            }
            int[] iArr = bbq.A0C;
            int i3 = i * 5;
            int i4 = iArr[i3 + 3] + i;
            if ((iArr[i3 + 1] & 134217728) != 0 && iArr[i * 5] == 206 && C7384Etj.areEqual(BBQ.A00(bbq, iArr, i), BBL.A04)) {
                Object objA08 = bbq.A08(i, 0);
                if ((objA08 instanceof InterfaceC1560Ala) && (interfaceC1560Ala = (InterfaceC1560Ala) objA08) != null) {
                    interfaceC1559AlZ = ((BAU) interfaceC1560Ala).A01;
                }
                if ((interfaceC1559AlZ instanceof C2231BCb) && (c2231BCb = (C2231BCb) interfaceC1559AlZ) != null && c2231BCb.A00.equals(bbv)) {
                    return Integer.valueOf(i);
                }
            }
            if ((iArr[(i * 5) + 1] & 67108864) != 0 && (numA06 = A06(bbv, bbq, i + 1, i4)) != null) {
                return numA06;
            }
            i = i4;
        }
    }

    public static final void A0I(BBI bbi) {
        bbi.A0B = null;
        bbi.A03 = 0;
        bbi.A02 = 0;
        bbi.A06 = 0L;
        bbi.A0O = false;
        BBR bbr = bbi.A0b;
        bbr.A08 = false;
        bbr.A0A.A00 = 0;
        bbr.A05 = 0;
        bbr.A07 = true;
        bbr.A03 = 0;
        bbr.A0B.clear();
        bbr.A04 = -1;
        bbr.A01 = -1;
        bbr.A02 = -1;
        bbr.A00 = 0;
        bbi.A0c.clear();
        bbi.A0T = null;
        bbi.A07 = null;
    }

    @Override // X.BFM
    public final void AAb() {
        A0R(this, false);
        BBb bBbA0V = A0V();
        if (bBbA0V != null) {
            int i = bBbA0V.A01;
            if ((i & 1) != 0) {
                bBbA0V.A01 = i | 2;
            }
        }
    }

    @Override // X.BFM
    public final boolean AfS(int i, boolean z) {
        BBb bBbA0V;
        if ((i & 1) != 0 || (!this.A0M && !this.A0Q)) {
            return z || !AKh();
        }
        InterfaceC2246BCr interfaceC2246BCr = this.A0E;
        if (interfaceC2246BCr != null && (bBbA0V = A0V()) != null && interfaceC2246BCr.AfV()) {
            int i2 = bBbA0V.A01;
            if ((i2 & 512) == 0) {
                int i3 = i2 | 1;
                bBbA0V.A01 = i3;
                int i4 = i3 & (-129);
                if (this.A0Q) {
                    i4 = i3 | 128;
                }
                bBbA0V.A01 = i4;
                bBbA0V.A01 = i4 | 256;
                BBe bBe = this.A0b.A06.A00;
                bBe.A02(BBf.A00);
                BCJ.A00(bBe, bBbA0V, 0);
                this.A0W.A0R(bBbA0V);
            }
        }
    }

    @Override // X.BFM
    public final void Afy() {
        A0P(this, null, null, -127, 0);
    }

    @Override // X.BFM
    public final void Ag8(int i, Object obj) {
        A0P(this, obj, null, i, 0);
    }

    @Override // X.BFM
    public final void AgB() {
        A0P(this, null, null, 125, 1);
        this.A0O = true;
    }

    @Override // X.BFM
    public final void AgF(int i) {
        A0P(this, null, null, i, 0);
    }

    @Override // X.BFM
    public final void AgI() {
        A0P(this, null, null, 125, 2);
        this.A0O = true;
    }

    public static final int A00(BBI bbi, int i) {
        int i2;
        int iA02;
        if (i < 0) {
            C1143Abw c1143Abw = bbi.A07;
            i2 = 0;
            if (c1143Abw != null && (iA02 = c1143Abw.A02(i)) >= 0) {
                return c1143Abw.A03[iA02];
            }
        } else {
            int[] iArr = bbi.A0T;
            if (iArr == null || (i2 = iArr[i]) < 0) {
                return bbi.A0F.A0C[(i * 5) + 1] & 67108863;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[PHI: r7
  0x00b0: PHI (r7v3 boolean) = (r7v1 boolean), (r7v4 boolean) binds: [B:39:0x00ca, B:32:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(X.BBI r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A01(X.BBI, int, int, int, boolean):int");
    }

    public static final C2229BBz A02(BBI bbi, int i) {
        BBQ bbq = bbi.A0F;
        int[] iArr = bbq.A0C;
        int i2 = i * 5;
        int i3 = iArr[i2];
        Object objA00 = BBQ.A00(bbq, iArr, i);
        ArrayList arrayList = null;
        if (i3 != 126665345 || !(objA00 instanceof BCO)) {
            return null;
        }
        if ((iArr[i2 + 1] & 67108864) != 0) {
            ArrayList arrayListA0h = C3cG.A0h();
            A0Q(bbi, arrayListA0h, i);
            if (!arrayListA0h.isEmpty()) {
                arrayList = arrayListA0h;
            }
        }
        BBQ bbq2 = bbi.A0F;
        Object objA002 = BBQ.A00(bbq2, bbq2.A0C, i);
        C7384Etj.A0Z(objA002, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        BCO bco = (BCO) objA002;
        BBQ bbq3 = bbi.A0F;
        Object objA08 = bbq3.A08(i, 0);
        BCR bcrA03 = bbq3.A03(i);
        int i4 = bbq3.A0C[i2 + 3] + i;
        ArrayList arrayListA0h2 = C3cG.A0h();
        List<C2233BCd> list = bbi.A0e;
        int iA00 = BBY.A00(list, i);
        if (iA00 < 0) {
            iA00 = -(iA00 + 1);
        }
        while (iA00 < list.size()) {
            C2233BCd c2233BCd = list.get(iA00);
            if (c2233BCd.A00 >= i4) {
                break;
            }
            arrayListA0h2.add(new HxE(c2233BCd.A02, c2233BCd.A01));
            iA00++;
        }
        return new C2229BBz(bcrA03, bbi.A0X, bco, bbi.A03(i), bbi.A0a, objA08, arrayListA0h2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[ADDED_TO_REGION, LOOP:1: B:22:0x0066->B:32:0x008f, LOOP_START, PHI: r2 r8
  0x0066: PHI (r2v1 X.BBQ) = (r2v0 X.BBQ), (r2v2 X.BBQ) binds: [B:21:0x0064, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:21:0x0064, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AKQ A03(int r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0M
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            r4 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L60
            boolean r0 = r7.A0S
            if (r0 == 0) goto L60
            X.BBJ r5 = r7.A0H
            int r2 = r5.A08
        L10:
            if (r2 <= 0) goto L60
            int[] r1 = r5.A0G
            int r0 = X.BBJ.A02(r5, r2)
            int r0 = r0 * 5
            r0 = r1[r0]
            if (r0 != r4) goto L57
            java.lang.Object r1 = r5.A0N(r2)
            java.lang.Object r0 = X.BBL.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L57
            X.BBJ r6 = r7.A0H
            int r5 = X.BBJ.A02(r6, r2)
            int[] r1 = r6.A0G
            int r0 = r5 * 5
            int r0 = r0 + 1
            r4 = r1[r0]
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r4
            if (r0 == 0) goto L54
            java.lang.Object[] r2 = r6.A0H
            int r1 = X.BBJ.A03(r6, r1, r5)
            int r0 = r4 >> 29
            int r0 = java.lang.Integer.bitCount(r0)
            int r1 = r1 + r0
            r0 = r2[r1]
        L4c:
            X.C7384Etj.A0Z(r0, r3)
            X.AKQ r0 = (X.AKQ) r0
        L51:
            r7.A0C = r0
            return r0
        L54:
            java.lang.Object r0 = X.C78N.A00
            goto L4c
        L57:
            X.BBJ r5 = r7.A0H
            int[] r0 = r5.A0G
            int r2 = X.BBJ.A04(r5, r0, r2)
            goto L10
        L60:
            X.BBQ r2 = r7.A0F
            int r0 = r2.A09
            if (r0 <= 0) goto L9a
        L66:
            if (r8 <= 0) goto L9a
            int[] r1 = r2.A0C
            int r0 = r8 * 5
            r0 = r1[r0]
            if (r0 != r4) goto L8f
            java.lang.Object r1 = X.BBQ.A00(r2, r1, r8)
            java.lang.Object r0 = X.BBL.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L8f
            X.Ab2<X.AKQ> r0 = r7.A08
            if (r0 == 0) goto L88
            java.lang.Object r0 = r0.A04(r8)
            X.AKQ r0 = (X.AKQ) r0
            if (r0 != 0) goto L51
        L88:
            X.BBQ r0 = r7.A0F
            java.lang.Object r0 = r0.A06(r8)
            goto L4c
        L8f:
            X.BBQ r2 = r7.A0F
            int[] r1 = r2.A0C
            int r0 = r8 * 5
            int r0 = r0 + 2
            r8 = r1[r0]
            goto L66
        L9a:
            X.AKQ r0 = r7.A0D
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A03(int):X.AKQ");
    }

    public static final AKQ A04(BBI bbi) {
        AKQ akq = bbi.A0C;
        return akq == null ? bbi.A03(bbi.A0F.A05) : akq;
    }

    public static final C0967AJu A05(BBI bbi, AKQ akq, AKQ akq2) {
        C0967AJu c0967AJu = (C0967AJu) akq;
        C0969AJw c0969AJw = new C0969AJw(c0967AJu);
        c0969AJw.A00 = c0967AJu;
        c0969AJw.putAll(akq2);
        C0967AJu c0967AJuA00 = C0969AJw.A00(c0969AJw);
        A0P(bbi, BBL.A03, null, HatchWidgetWebViewKt.HTTP_NO_CONTENT, 0);
        bbi.A07();
        A0O(bbi, c0967AJuA00);
        bbi.A07();
        A0O(bbi, akq2);
        A0R(bbi, false);
        return c0967AJuA00;
    }

    private final Object A07() {
        if (!this.A0M) {
            Object objA05 = this.A0F.A05();
            if (!this.A0Q || (objA05 instanceof InterfaceC2245BCq)) {
                return objA05;
            }
        } else if (this.A0O) {
            BBL.A01("A call to createNode(), emitNode() or useNode() expected");
            throw F60.createAndThrow();
        }
        return C78N.A00;
    }

    private final void A08() {
        BBW bbw = new BBW();
        if (this.A0R) {
            bbw.A06 = new HashMap();
        }
        if (this.A0W.A0W()) {
            bbw.A04 = Ab2.A01();
        }
        this.A0G = bbw;
        BBJ bbjA02 = bbw.A02();
        bbjA02.A0c(true);
        this.A0H = bbjA02;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e9 A[EDGE_INSN: B:165:0x02e9->B:151:0x02e9 BREAK  A[LOOP:0: B:10:0x004b->B:167:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09() {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A09():void");
    }

    private final void A0A() {
        A0B(this.A0F.A01);
        BBR bbr = this.A0b;
        BBR.A02(bbr, false);
        bbr.A04();
        bbr.A06.A00.A02(BCB.A00);
        int i = bbr.A05;
        BBQ bbq = bbr.A09.A0F;
        bbr.A05 = i + bbq.A0C[(bbq.A01 * 5) + 3];
    }

    private final void A0B(int i) {
        boolean zA0F = this.A0F.A0F(i);
        if (zA0F) {
            BBR bbr = this.A0b;
            BBR.A01(bbr);
            Object objA07 = this.A0F.A07(i);
            BBR.A01(bbr);
            bbr.A0B.add(objA07);
        }
        A01(this, i, i, 0, zA0F);
        BBR bbr2 = this.A0b;
        BBR.A01(bbr2);
        if (zA0F) {
            bbr2.A03();
        }
    }

    private final void A0C(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        A0C(this.A0F.A0C[(i * 5) + 2], i2);
        BBQ bbq = this.A0F;
        if (bbq.A0F(i)) {
            BBR bbr = this.A0b;
            Object objA07 = bbq.A07(i);
            BBR.A01(bbr);
            bbr.A0B.add(objA07);
        }
    }

    private final void A0E(int i, int i2, int i3) {
        BBQ bbq = this.A0F;
        int i4 = i;
        int i5 = i2;
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                i4 = i3;
            } else {
                int[] iArr = bbq.A0C;
                int i6 = iArr[(i * 5) + 2];
                if (i6 == i2) {
                    i4 = i2;
                } else {
                    int i7 = iArr[(i2 * 5) + 2];
                    if (i7 != i) {
                        if (i6 == i7) {
                            i4 = i6;
                        } else {
                            int i8 = i;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = iArr[(i8 * 5) + 2];
                                i9++;
                            }
                            int i10 = i2;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i3) {
                                i10 = iArr[(i10 * 5) + 2];
                                i11++;
                            }
                            int i12 = i9 - i11;
                            for (int i13 = 0; i13 < i12; i13++) {
                                i4 = iArr[(i4 * 5) + 2];
                            }
                            int i14 = i11 - i9;
                            for (int i15 = 0; i15 < i14; i15++) {
                                i5 = iArr[(i5 * 5) + 2];
                            }
                            while (i4 != i5) {
                                i4 = iArr[(i4 * 5) + 2];
                                i5 = iArr[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            }
        }
        while (i > 0 && i != i4) {
            if (bbq.A0F(i)) {
                this.A0b.A03();
            }
            i = bbq.A0C[(i * 5) + 2];
        }
        A0C(i2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0203 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:8:0x0031, B:10:0x005e, B:11:0x0064, B:13:0x0068, B:15:0x0070, B:16:0x007f, B:18:0x008b, B:20:0x008f, B:21:0x0098, B:23:0x00a1, B:25:0x00a9, B:26:0x00b0, B:27:0x00b3, B:30:0x00c8, B:31:0x00cb, B:88:0x01ed, B:90:0x0203, B:91:0x0214, B:93:0x021d, B:96:0x0227, B:108:0x025f, B:99:0x0233, B:102:0x0248, B:107:0x0259, B:32:0x00d1, B:41:0x00fe, B:42:0x010c, B:35:0x00d7, B:38:0x00dd, B:40:0x00e5, B:43:0x0111, B:45:0x0119, B:46:0x0126, B:48:0x0132, B:49:0x0138, B:62:0x016c, B:64:0x0174, B:65:0x017f, B:66:0x0185, B:71:0x01a2, B:82:0x01c6, B:84:0x01ce, B:85:0x01d6, B:86:0x01db, B:87:0x01e3, B:77:0x01b4, B:79:0x01b8, B:80:0x01be, B:81:0x01c1, B:69:0x0199, B:57:0x014d, B:59:0x0151, B:60:0x0158, B:61:0x0167), top: B:118:0x0031, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:8:0x0031, B:10:0x005e, B:11:0x0064, B:13:0x0068, B:15:0x0070, B:16:0x007f, B:18:0x008b, B:20:0x008f, B:21:0x0098, B:23:0x00a1, B:25:0x00a9, B:26:0x00b0, B:27:0x00b3, B:30:0x00c8, B:31:0x00cb, B:88:0x01ed, B:90:0x0203, B:91:0x0214, B:93:0x021d, B:96:0x0227, B:108:0x025f, B:99:0x0233, B:102:0x0248, B:107:0x0259, B:32:0x00d1, B:41:0x00fe, B:42:0x010c, B:35:0x00d7, B:38:0x00dd, B:40:0x00e5, B:43:0x0111, B:45:0x0119, B:46:0x0126, B:48:0x0132, B:49:0x0138, B:62:0x016c, B:64:0x0174, B:65:0x017f, B:66:0x0185, B:71:0x01a2, B:82:0x01c6, B:84:0x01ce, B:85:0x01d6, B:86:0x01db, B:87:0x01e3, B:77:0x01b4, B:79:0x01b8, B:80:0x01be, B:81:0x01c1, B:69:0x0199, B:57:0x014d, B:59:0x0151, B:60:0x0158, B:61:0x0167), top: B:118:0x0031, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.C0918AHu r16, X.BBI r17, X.G0V r18) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A0F(X.AHu, X.BBI, X.G0V):void");
    }

    /* JADX WARN: Incorrect return type in method signature: <R:Ljava/lang/Object;>(LX/BCN;LX/BCN;Ljava/lang/Integer;Ljava/util/List<+LX/HxE<LX/BBb;+Ljava/lang/Object;>;>;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x001f, B:13:0x002c, B:14:0x0030, B:16:0x0034, B:19:0x003c, B:21:0x0048, B:23:0x004e, B:24:0x0052, B:25:0x0053, B:27:0x0059, B:20:0x0044), top: B:33:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.BCN r6, X.BCN r7, X.BBI r8, java.lang.Integer r9, java.util.List r10, kotlin.jvm.functions.Function0 r11) {
        /*
            boolean r4 = r8.A0N
            int r3 = r8.A03
            r0 = 1
            r8.A0N = r0     // Catch: java.lang.Throwable -> L61
            r5 = 0
            r8.A03 = r5     // Catch: java.lang.Throwable -> L61
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L61
        Le:
            if (r5 >= r2) goto L25
            java.lang.Object r0 = r10.get(r5)     // Catch: java.lang.Throwable -> L61
            X.HxE r0 = (X.HxE) r0     // Catch: java.lang.Throwable -> L61
            A r1 = r0.first     // Catch: java.lang.Throwable -> L61
            X.BBb r1 = (X.BBb) r1     // Catch: java.lang.Throwable -> L61
            B r0 = r0.second     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L1f
            r0 = 0
        L1f:
            r8.A0a(r1, r0)     // Catch: java.lang.Throwable -> L61
            int r5 = r5 + 1
            goto Le
        L25:
            if (r6 == 0) goto L59
            if (r9 == 0) goto L2a
            goto L2c
        L2a:
            r1 = -1
            goto L30
        L2c:
            int r1 = r9.intValue()     // Catch: java.lang.Throwable -> L61
        L30:
            X.BBG r6 = (X.BBG) r6     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L53
            boolean r0 = r7.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L53
            if (r1 < 0) goto L53
            X.BBG r7 = (X.BBG) r7     // Catch: java.lang.Throwable -> L61
            r6.A03 = r7     // Catch: java.lang.Throwable -> L61
            r6.A00 = r1     // Catch: java.lang.Throwable -> L61
            r2 = 0
            r1 = 0
            java.lang.Object r0 = r11.invoke()     // Catch: java.lang.Throwable -> L4d
            r6.A03 = r1     // Catch: java.lang.Throwable -> L61
            r6.A00 = r2     // Catch: java.lang.Throwable -> L61
            goto L57
        L4d:
            r0 = move-exception
            r6.A03 = r1     // Catch: java.lang.Throwable -> L61
            r6.A00 = r2     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L53:
            java.lang.Object r0 = r11.invoke()     // Catch: java.lang.Throwable -> L61
        L57:
            if (r0 != 0) goto L5c
        L59:
            r11.invoke()     // Catch: java.lang.Throwable -> L61
        L5c:
            r8.A0N = r4
            r8.A03 = r3
            return
        L61:
            r0 = move-exception
            r8.A0N = r4
            r8.A03 = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A0G(X.BCN, X.BCN, X.BBI, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):void");
    }

    public static final void A0J(BBI bbi) {
        if (bbi.A0H.A0F) {
            bbi.A08();
        } else {
            BBL.A01("Check failed");
            throw F60.createAndThrow();
        }
    }

    public static final void A0K(BBI bbi) {
        BBQ bbq = bbi.A0F;
        int i = bbq.A05;
        bbi.A02 = i >= 0 ? bbq.A0C[(i * 5) + 1] & 67108863 : 0;
        bbq.A0B();
    }

    public static final void A0N(BBI bbi, AKQ akq) {
        Ab2<AKQ> ab2A01 = bbi.A08;
        if (ab2A01 == null) {
            ab2A01 = Ab2.A01();
            bbi.A08 = ab2A01;
        }
        ab2A01.A0B(bbi.A0F.A01, akq);
    }

    public static final void A0O(BBI bbi, Object obj) {
        int[] iArr;
        int i;
        AbstractC2227BBx[] abstractC2227BBxArr;
        int i2;
        if (bbi.A0M) {
            bbi.A0H.A0a(obj);
            return;
        }
        BBQ bbq = bbi.A0F;
        if (!bbq.A07) {
            BBR bbr = bbi.A0b;
            BCR bcrA03 = bbq.A03(bbq.A05);
            BBe bBe = bbr.A06.A00;
            bBe.A02(C2214BBj.A00);
            BCJ.A01(bBe, bcrA03, obj, 0, 1);
            return;
        }
        int i3 = bbq.A02;
        int[] iArr2 = bbq.A0C;
        int i4 = bbq.A05;
        int i5 = i4 * 5;
        int iBitCount = (i3 - (iArr2[i5 + 4] + Integer.bitCount(iArr2[i5 + 1] >> 28))) - 1;
        BBR bbr2 = bbi.A0b;
        if (bbr2.A09.A0F.A05 - bbr2.A05 < 0) {
            BCR bcrA032 = bbq.A03(i4);
            BBe bBe2 = bbr2.A06.A00;
            bBe2.A02(BBk.A00);
            BCJ.A01(bBe2, obj, bcrA032, 0, 1);
            iArr = bBe2.A03;
            i = bBe2.A00;
            abstractC2227BBxArr = bBe2.A04;
            i2 = bBe2.A02 - 1;
        } else {
            BBR.A02(bbr2, true);
            BBe bBe3 = bbr2.A06.A00;
            bBe3.A02(C2216BBm.A00);
            BCJ.A00(bBe3, obj, 0);
            iArr = bBe3.A03;
            i = bBe3.A00;
            abstractC2227BBxArr = bBe3.A04;
            i2 = bBe3.A02 - 1;
        }
        iArr[i - abstractC2227BBxArr[i2].A00] = iBitCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0P(X.BBI r26, java.lang.Object r27, java.lang.Object r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A0P(X.BBI, java.lang.Object, java.lang.Object, int, int):void");
    }

    public static final void A0Q(BBI bbi, List<C2229BBz> list, int i) {
        int[] iArr = bbi.A0F.A0C;
        int i2 = iArr[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if ((iArr[(i3 * 5) + 1] & 134217728) != 0) {
                C2229BBz c2229BBzA02 = A02(bbi, i3);
                if (c2229BBzA02 != null) {
                    list.add(c2229BBzA02);
                }
            } else if ((iArr[(i3 * 5) + 1] & 67108864) != 0) {
                A0Q(bbi, list, i3);
            }
            iArr = bbi.A0F.A0C;
            i3 += iArr[(i3 * 5) + 3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0R(X.BBI r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A0R(X.BBI, boolean):void");
    }

    private final void A0S(BBd bBd, boolean z) {
        this.A0d.add(this.A0B);
        this.A0B = bBd;
        AKU aku = this.A0Y;
        aku.A00(this.A02);
        aku.A00(this.A04);
        aku.A00(this.A03);
        if (z) {
            this.A03 = 0;
        }
        this.A02 = 0;
        this.A04 = 0;
    }

    public static void A0T(Object obj, Object obj2) {
        A0O((BBI) obj, obj2);
    }

    private final void A0U(boolean z, Object obj) {
        if (z) {
            BBQ bbq = this.A0F;
            if (bbq.A04 <= 0) {
                if ((bbq.A0C[(bbq.A01 * 5) + 1] & 1073741824) == 0) {
                    throw C60O.A0i("Expected a node group");
                }
                bbq.A0C();
                return;
            }
            return;
        }
        if (obj != null && this.A0F.A04() != obj) {
            BBR bbr = this.A0b;
            BBR.A02(bbr, false);
            BBe bBe = bbr.A06.A00;
            bBe.A02(BC4.A00);
            BCJ.A00(bBe, obj, 0);
        }
        this.A0F.A0C();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0Z(X.C0918AHu<java.lang.Object, java.lang.Object> r16) {
        /*
            r15 = this;
            java.util.List<X.BCd> r11 = r15.A0e
            int r4 = X.AnonymousClass002.A0E(r11)
        L6:
            r0 = -1
            if (r0 >= r4) goto L34
            java.lang.Object r3 = r11.get(r4)
            X.BCd r3 = (X.C2233BCd) r3
            X.BBb r0 = r3.A02
            X.B1X r0 = r0.A04
            if (r0 == 0) goto L30
            X.BCR r2 = X.BCV.A00(r0)
            int r1 = r2.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            if (r0 == 0) goto L30
            int r1 = r3.A00
            int r0 = r2.A00
            if (r1 == r0) goto L2d
            int r0 = r2.A00
            r3.A00 = r0
        L2d:
            int r4 = r4 + (-1)
            goto L6
        L30:
            r11.remove(r4)
            goto L2d
        L34:
            r0 = r16
            java.lang.Object[] r12 = r0.A04
            java.lang.Object[] r10 = r0.A05
            long[] r9 = r0.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L9a
            r7 = 0
        L42:
            r15 = r9[r7]
            r3 = -1
            long r3 = r3 ^ r15
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r15
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L95
            int r0 = r7 - r8
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L5f:
            if (r4 >= r5) goto L93
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8f
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r12[r0]
            r2 = r10[r0]
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.C7384Etj.A0Z(r3, r0)
            X.BBb r3 = (X.BBb) r3
            X.B1X r0 = r3.A04
            if (r0 == 0) goto L8f
            X.BCR r0 = X.BCV.A00(r0)
            int r1 = r0.A00
            X.BCt r0 = X.C2248BCt.A00
            if (r2 != r0) goto L87
            r2 = 0
        L87:
            X.BCd r0 = new X.BCd
            r0.<init>(r3, r2, r1)
            r11.add(r0)
        L8f:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L5f
        L93:
            if (r5 != r6) goto L9a
        L95:
            if (r7 == r8) goto L9a
            int r7 = r7 + 1
            goto L42
        L9a:
            java.util.Comparator<X.BCd> r0 = X.BBY.A00
            X.AbstractC06907md.A04(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A0Z(X.AHu):void");
    }

    public final BBb A0V() {
        ArrayList<BBb> arrayList = this.A0c;
        if (this.A00 == 0 && (!arrayList.isEmpty())) {
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final BFB A0W() {
        if (this.A0W.A0Z()) {
            return this.A0k;
        }
        return null;
    }

    public final List<AH3> A0X() {
        BBV bbv = this.A0W;
        BBG bbg = bbv instanceof BBH ? null : ((BBM) bbv).A07.A0X;
        if (bbg == null) {
            bbg = null;
        }
        if (bbg != null) {
            ApK apK = bbg.A0G;
            BBQ bbqA01 = BCA.A01(apK).A01();
            try {
                Integer numA06 = A06(bbv, bbqA01, 0, bbqA01.A09);
                if (numA06 != null) {
                    bbqA01 = BCA.A01(apK).A01();
                    ArrayList arrayListA00 = BBZ.A00(bbqA01, numA06.intValue());
                    bbqA01.A09();
                    return AbstractC0878AGe.A0P(bbg.A0F.A0X(), arrayListA00);
                }
            } finally {
                bbqA01.A09();
            }
        }
        return C0881AGi.A00;
    }

    public final void A0Y() {
        if (this.A0N || this.A05 != 0) {
            throw C60O.A0i("Cannot disable reuse from root if it was caused by other groups");
        }
        this.A05 = -1;
        this.A0Q = false;
    }

    public final boolean A0a(BBb bBb, Object obj) {
        B1X b1x = bBb.A04;
        if (b1x == null) {
            return false;
        }
        BBQ bbq = this.A0F;
        int iA00 = bbq.A0B.A00(BCV.A00(b1x));
        if (!this.A0N || iA00 < bbq.A01) {
            return false;
        }
        List<C2233BCd> list = this.A0e;
        int iA002 = BBY.A00(list, iA00);
        C0917AHt c0917AHt = null;
        if (iA002 < 0) {
            int i = -(iA002 + 1);
            if (!(obj instanceof BCS)) {
                obj = null;
            }
            list.add(i, new C2233BCd(bBb, obj, iA00));
        } else {
            C2233BCd c2233BCd = list.get(iA002);
            if (obj instanceof BCS) {
                Object obj2 = c2233BCd.A01;
                if (obj2 == null) {
                    c2233BCd.A01 = obj;
                } else if (obj2 instanceof C0917AHt) {
                    ((C0917AHt) obj2).A0B(obj);
                } else {
                    C0917AHt<Object> c0917AHt2 = HsU.A00;
                    c0917AHt = new C0917AHt(2);
                    c0917AHt.A04[C0917AHt.A01(c0917AHt, obj2)] = obj2;
                    c0917AHt.A04[C0917AHt.A01(c0917AHt, obj)] = obj;
                    c2233BCd.A01 = c0917AHt;
                }
            } else {
                c2233BCd.A01 = c0917AHt;
            }
        }
        return true;
    }

    @Override // X.BFM
    public final <V, T> void A4P(V v, G0V<? super T, ? super V, Unit> g0v) {
        if (this.A0M) {
            BBe bBe = this.A0J.A00;
            bBe.A02(BC5.A00);
            BCJ.A00(bBe, v, 0);
            C7384Etj.A0Z(g0v, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            C0862A6j.A02(g0v, 2);
            BCJ.A00(bBe, g0v, 1);
            return;
        }
        BBR bbr = this.A0b;
        BBR.A00(bbr);
        BBe bBe2 = bbr.A06.A00;
        bBe2.A02(BC5.A00);
        C7384Etj.A0Z(g0v, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        C0862A6j.A02(g0v, 2);
        BCJ.A01(bBe2, v, g0v, 0, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // X.BFM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BBM A5U() {
        /*
            r10 = this;
            java.lang.Object r2 = X.BBL.A04
            r1 = 206(0xce, float:2.89E-43)
            r3 = 0
            r0 = 0
            r6 = r10
            A0P(r10, r2, r0, r1, r3)
            boolean r0 = r10.A0M
            if (r0 == 0) goto L15
            X.BBJ r1 = r10.A0H
            int r0 = r1.A08
            X.BBJ.A0A(r1, r0)
        L15:
            java.lang.Object r2 = r10.A07()
            boolean r0 = r2 instanceof X.InterfaceC1560Ala
            if (r0 == 0) goto L21
            X.Ala r2 = (X.InterfaceC1560Ala) r2
            if (r2 != 0) goto L42
        L21:
            long r7 = r10.A06
            boolean r9 = r10.A0L
            boolean r10 = r10.A0R
            X.BBG r0 = r6.A0X
            X.BCo r5 = r0.A0E
            X.BBM r4 = new X.BBM
            r4.<init>(r5, r6, r7, r9, r10)
            X.BCb r1 = new X.BCb
            r1.<init>(r4)
            r0 = -1
            X.BCp r2 = new X.BCp
            r2.<init>()
            r2.A01 = r1
            r2.A00 = r0
            A0O(r6, r2)
        L42:
            X.BAU r2 = (X.BAU) r2
            X.AlZ r1 = r2.A01
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder"
            X.C7384Etj.A0Z(r1, r0)
            X.BCb r1 = (X.C2231BCb) r1
            X.BBM r2 = r1.A00
            X.AKQ r1 = A04(r6)
            androidx.compose.runtime.MutableState r0 = r2.A02
            r0.Af8(r1)
            A0R(r6, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.A5U():X.BBM");
    }

    @Override // X.BFM
    public final <T> void A7w(Function0<? extends T> function0) {
        String str;
        if (this.A0O) {
            this.A0O = false;
            if (this.A0M) {
                int i = this.A0Y.A01[r0.A00 - 1];
                BBJ bbj = this.A0H;
                BCR bcrA0M = bbj.A0M(bbj.A08);
                this.A02++;
                BCW bcw = this.A0J;
                BBe bBe = bcw.A00;
                bBe.A02(C2215BBl.A00);
                BCJ.A00(bBe, function0, 0);
                bBe.A03[bBe.A00 - bBe.A04[bBe.A02 - 1].A00] = i;
                BCJ.A00(bBe, bcrA0M, 1);
                BBe bBe2 = bcw.A01;
                bBe2.A02(C2219BBp.A00);
                bBe2.A03[bBe2.A00 - bBe2.A04[bBe2.A02 - 1].A00] = i;
                BCJ.A00(bBe2, bcrA0M, 0);
                return;
            }
            str = "createNode() can only be called when inserting";
        } else {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        }
        BBL.A01(str);
        throw F60.createAndThrow();
    }

    @Override // X.BFM
    public final BBb AAc() {
        BCR bcrA03;
        ArrayList<BBb> arrayList = this.A0c;
        BBb bBb = null;
        BBb bBbRemove = arrayList.isEmpty() ^ true ? arrayList.remove(arrayList.size() - 1) : null;
        if (bBbRemove != null) {
            int i = bBbRemove.A01 & (-9);
            bBbRemove.A01 = i;
            int i2 = this.A01;
            AeA<Object> aeA = bBbRemove.A02;
            if (aeA != null && (i & 16) == 0) {
                int[] iArr = aeA.A02;
                long[] jArr = aeA.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    if (i4 != 8) {
                                        break;
                                    }
                                } else {
                                    if ((255 & j) < 128 && iArr[(i3 << 3) + i5] != i2) {
                                        BTF btf = new BTF(aeA, bBbRemove, i2, 2);
                                        BBR bbr = this.A0b;
                                        BBG bbg = this.A0X;
                                        BBe bBe = bbr.A06.A00;
                                        bBe.A02(BC1.A00);
                                        BCJ.A01(bBe, btf, bbg, 0, 1);
                                        break loop0;
                                    }
                                    j >>= 8;
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
            int i6 = bBbRemove.A01;
            if ((i6 & 512) != 0) {
                bBbRemove.A01 = i6 & (-513);
                BBe bBe2 = this.A0b.A06.A00;
                bBe2.A02(C2212BBh.A00);
                BCJ.A00(bBe2, bBbRemove, 0);
                i6 = bBbRemove.A01 & (-129);
                bBbRemove.A01 = i6;
                if ((i6 & 1024) != 0) {
                    i6 &= -1025;
                    bBbRemove.A01 = i6;
                    if (this.A05 == this.A0F.A05) {
                        this.A0Q = false;
                        this.A05 = -1;
                    }
                }
            }
            if ((i6 & 16) == 0 && ((i6 & 1) != 0 || this.A0L)) {
                if (bBbRemove.A04 == null) {
                    if (this.A0M) {
                        BBJ bbj = this.A0H;
                        bcrA03 = bbj.A0M(bbj.A08);
                    } else {
                        BBQ bbq = this.A0F;
                        bcrA03 = bbq.A03(bbq.A05);
                    }
                    bBbRemove.A04 = bcrA03;
                }
                bBbRemove.A01 &= -5;
                bBb = bBbRemove;
            }
        }
        A0R(this, false);
        return bBb;
    }

    @Override // X.BFM
    public final boolean AKh() {
        BBb bBbA0V;
        return (this.A0M || this.A0Q || this.A0P || (bBbA0V = A0V()) == null || (bBbA0V.A01 & 8) != 0) ? false : true;
    }

    @Override // X.BFM
    public final Object APR(Object obj, Object obj2) {
        BBQ bbq = this.A0F;
        int i = bbq.A01;
        Object objA01 = BBY.A01(i < bbq.A00 ? BBQ.A00(bbq, bbq.A0C, i) : null, obj, obj2);
        return objA01 == null ? new BCG(obj, obj2) : objA01;
    }

    @Override // X.BFM
    public final void AZp(Function0<Unit> function0) {
        BBe bBe = this.A0b.A06.A00;
        bBe.A02(C2223BBt.A00);
        BCJ.A00(bBe, function0, 0);
    }

    @Override // X.BFM
    public final Object AaT() {
        if (!this.A0M) {
            Object objA05 = this.A0F.A05();
            if (!this.A0Q || (objA05 instanceof InterfaceC2245BCq)) {
                return objA05 instanceof InterfaceC1560Ala ? ((BAU) ((InterfaceC1560Ala) objA05)).A01 : objA05;
            }
        } else if (this.A0O) {
            BBL.A01("A call to createNode(), emitNode() or useNode() expected");
            throw F60.createAndThrow();
        }
        return C78N.A00;
    }

    @Override // X.BFM
    public final void Afo() {
        if (this.A02 != 0) {
            BBL.A01("No nodes can be emitted before calling skipAndEndGroup");
            throw F60.createAndThrow();
        }
        if (this.A0M) {
            return;
        }
        BBb bBbA0V = A0V();
        if (bBbA0V != null) {
            int i = bBbA0V.A01;
            if ((i & 128) == 0) {
                bBbA0V.A01 = i | 16;
            }
        }
        if (this.A0e.isEmpty()) {
            A0K(this);
        } else {
            A09();
        }
    }

    @Override // X.BFM
    public final void AgE(int i) {
        int i2;
        int i3;
        if (this.A0B != null) {
            A0P(this, null, null, i, 0);
            return;
        }
        if (this.A0O) {
            BBL.A01("A call to createNode(), emitNode() or useNode() expected");
            throw F60.createAndThrow();
        }
        this.A06 = Long.rotateLeft(Long.rotateLeft(this.A06, 3) ^ i, 3) ^ this.A04;
        this.A04++;
        BBQ bbq = this.A0F;
        if (this.A0M) {
            bbq.A04++;
            BBJ bbj = this.A0H;
            Object obj = C78N.A00;
            BBJ.A0I(bbj, obj, obj, i, false);
            A0S(null, false);
            return;
        }
        if (bbq.A01() == i && ((i3 = bbq.A01) >= bbq.A00 || (bbq.A0C[(i3 * 5) + 1] & 536870912) == 0)) {
            bbq.A0C();
            A0S(null, false);
            return;
        }
        if (bbq.A04 <= 0 && (i2 = bbq.A01) != bbq.A00) {
            int i4 = this.A03;
            A0A();
            this.A0b.A05(i4, bbq.A02());
            BBY.A04(this.A0e, i2, bbq.A01);
        }
        bbq.A04++;
        this.A0M = true;
        this.A0C = null;
        BBJ bbjA02 = this.A0H;
        if (bbjA02.A0F) {
            bbjA02 = this.A0G.A02();
            this.A0H = bbjA02;
            bbjA02.A0T();
            this.A0S = false;
            this.A0C = null;
        }
        bbjA02.A0Q();
        int i5 = bbjA02.A00;
        Object obj2 = C78N.A00;
        BBJ.A0I(bbjA02, obj2, obj2, i, false);
        this.A0U = bbjA02.A0M(i5);
        A0S(null, false);
    }

    @Override // X.BFM
    public final void AgH(int i, Object obj) {
        if (!this.A0M) {
            BBQ bbq = this.A0F;
            if (bbq.A01() == i && !C7384Etj.areEqual(bbq.A04(), obj) && this.A05 < 0) {
                this.A05 = this.A0F.A01;
                this.A0Q = true;
            }
        }
        A0P(this, null, obj, i, 0);
    }

    @Override // X.BFM
    public final void Ai0(Object obj) {
        if (obj instanceof InterfaceC1559AlZ) {
            int i = this.A04 - 1;
            BAU bau = new BAU();
            bau.A01 = (InterfaceC1559AlZ) obj;
            bau.A00 = i;
            if (this.A0M) {
                BBe bBe = this.A0b.A06.A00;
                bBe.A02(C2228BBy.A00);
                BCJ.A00(bBe, bau, 0);
            }
            this.A0f.add(obj);
            obj = bau;
        }
        A0O(this, obj);
    }

    @Override // X.BFM
    public final void AiE() {
        String str;
        if (this.A0O) {
            this.A0O = false;
            if (!this.A0M) {
                BBQ bbq = this.A0F;
                Object objA07 = bbq.A07(bbq.A05);
                BBR bbr = this.A0b;
                BBR.A01(bbr);
                bbr.A0B.add(objA07);
                if (this.A0Q && (objA07 instanceof BKv)) {
                    BBR.A00(bbr);
                    bbr.A06.A00.A02(BCF.A00);
                    return;
                }
                return;
            }
            str = "useNode() called while inserting";
        } else {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        }
        BBL.A01(str);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Incorrect types in method signature: (LX/Ahw<*>;LX/BBV;LX/BBW;Ljava/util/Set<LX/AlZ;>;LX/BCu;LX/BCu;LX/BCo;LX/BBG;)V */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BBI(X.InterfaceC1370Ahw r6, X.AbstractC2249BCu r7, X.AbstractC2249BCu r8, X.BBV r9, X.BBG r10, X.C2243BCo r11, X.BBW r12, java.util.Set r13) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0V = r6
            r5.A0W = r9
            r5.A0a = r12
            r5.A0f = r13
            r5.A09 = r7
            r5.A0A = r8
            r5.A0h = r11
            r5.A0X = r10
            r4 = 1
            java.util.ArrayList r0 = X.C3cG.A0h()
            r5.A0d = r0
            X.AKU r0 = new X.AKU
            r0.<init>()
            r5.A0Y = r0
            java.util.ArrayList r0 = X.C3cG.A0h()
            r5.A0e = r0
            X.AKU r0 = new X.AKU
            r0.<init>()
            r5.A0j = r0
            X.AJu r0 = X.C0967AJu.A00
            r5.A0D = r0
            X.AKU r0 = new X.AKU
            r0.<init>()
            r5.A0Z = r0
            r0 = -1
            r5.A05 = r0
            boolean r3 = r9.A0Y()
            r2 = 0
            if (r3 != 0) goto L4a
            boolean r1 = r9.A0W()
            r0 = 0
            if (r1 == 0) goto L4b
        L4a:
            r0 = 1
        L4b:
            r5.A0R = r0
            X.BCX r0 = new X.BCX
            r0.<init>(r5)
            r5.A0i = r0
            java.util.ArrayList r0 = X.C3cG.A0h()
            r5.A0c = r0
            X.BBQ r0 = r12.A01()
            r0.A09()
            r5.A0F = r0
            X.BBW r1 = new X.BBW
            r1.<init>()
            if (r3 == 0) goto L71
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.A06 = r0
        L71:
            boolean r0 = r9.A0W()
            if (r0 == 0) goto L7d
            X.Ab2 r0 = X.Ab2.A01()
            r1.A04 = r0
        L7d:
            r5.A0G = r1
            X.BBJ r0 = r1.A02()
            r0.A0c(r4)
            r5.A0H = r0
            X.BCu r1 = r5.A09
            boolean r0 = r1 instanceof X.C2232BCc
            if (r0 == 0) goto Ld0
            X.BCc r1 = (X.C2232BCc) r1
            if (r1 == 0) goto Ld0
            X.BBR r0 = new X.BBR
            r0.<init>(r5, r1)
            r5.A0b = r0
            X.BBW r0 = r5.A0G
            X.BBQ r1 = r0.A01()
            X.BCR r0 = r1.A03(r2)     // Catch: java.lang.Throwable -> Lcb
            r1.A09()
            r5.A0U = r0
            X.BCW r0 = new X.BCW
            r0.<init>()
            r5.A0J = r0
            X.BFB r0 = new X.BFB
            r0.<init>(r5)
            r5.A0k = r0
            X.78T r1 = r9.A0T()
            X.BFB r0 = r5.A0W()
            if (r0 != 0) goto Lc2
            X.6ys r0 = X.C6ys.A00
        Lc2:
            X.78T r0 = (X.C78T) r0
            X.78T r0 = r1.plus(r0)
            r5.A0g = r0
            return
        Lcb:
            r0 = move-exception
            r1.A09()
            throw r0
        Ld0:
            java.lang.String r0 = "Inconsistent composition"
            X.BBL.A02(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.<init>(X.Ahw, X.BCu, X.BCu, X.BBV, X.BBG, X.BCo, X.BBW, java.util.Set):void");
    }

    private final void A0D(int i, int i2) {
        int iA00 = A00(this, i);
        if (iA00 != i2) {
            int i3 = i2 - iA00;
            ArrayList<BBd> arrayList = this.A0d;
            int iA0K = C8j3.A0K(arrayList);
            while (i != -1) {
                int iA002 = A00(this, i) + i3;
                A0L(this, i, iA002);
                int i4 = iA0K;
                while (true) {
                    if (-1 < i4) {
                        BBd bBd = arrayList.get(i4);
                        if (bBd != null && bBd.A00(i, iA002)) {
                            iA0K = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                BBQ bbq = this.A0F;
                if (i < 0) {
                    i = bbq.A05;
                } else if (bbq.A0F(i)) {
                    return;
                } else {
                    i = bbq.A0C[(i * 5) + 2];
                }
            }
        }
    }

    public static final void A0H(BBI bbi) {
        A0I(bbi);
        bbi.A0d.clear();
        bbi.A0Y.A00 = 0;
        bbi.A0j.A00 = 0;
        bbi.A0Z.A00 = 0;
        bbi.A08 = null;
        BCW bcw = bbi.A0J;
        bcw.A01.A00();
        bcw.A00.A00();
        bbi.A06 = 0L;
        bbi.A00 = 0;
        bbi.A0O = false;
        bbi.A0M = false;
        bbi.A0Q = false;
        bbi.A0N = false;
        bbi.A05 = -1;
        BBQ bbq = bbi.A0F;
        if (!bbq.A06) {
            bbq.A09();
        }
        if (bbi.A0H.A0F) {
            return;
        }
        bbi.A08();
    }

    public static final void A0L(BBI bbi, int i, int i2) {
        if (A00(bbi, i) != i2) {
            if (i < 0) {
                C1143Abw c1143Abw = bbi.A07;
                if (c1143Abw == null) {
                    c1143Abw = new C1143Abw();
                    C0918AHu c0918AHu = AbstractC0977AKq.A00;
                    C1143Abw.A01(c1143Abw, 6);
                    bbi.A07 = c1143Abw;
                }
                c1143Abw.A04(i, i2);
                return;
            }
            int[] iArr = bbi.A0T;
            if (iArr == null) {
                int i3 = bbi.A0F.A09;
                iArr = new int[i3];
                Arrays.fill(iArr, 0, i3, -1);
                bbi.A0T = iArr;
            }
            iArr[i] = i2;
        }
    }

    public static final void A0M(BBI bbi, BCO bco, AKQ akq, Object obj, boolean z) {
        bbi.Ag8(126665345, bco);
        bbi.A07();
        A0O(bbi, obj);
        long j = bbi.A06;
        try {
            bbi.A06 = 126665345L;
            boolean z2 = false;
            if (bbi.A0M) {
                BBJ bbj = bbi.A0H;
                BBJ.A0A(bbj, bbj.A08);
            }
            if (!bbi.A0M && !C7384Etj.areEqual(bbi.A0F.A04(), akq)) {
                z2 = true;
                A0N(bbi, akq);
            }
            A0P(bbi, BBL.A00, akq, 202, 0);
            bbi.A0C = null;
            if (!bbi.A0M || z) {
                boolean z3 = bbi.A0P;
                bbi.A0P = z2;
                B1U b1uA03 = B1U.A03(new BTC(12, bco, obj), -59194059, true);
                C0862A6j.A02(b1uA03, 2);
                AnonymousClass001.A1H(bbi, b1uA03, 1);
                bbi.A0P = z3;
            } else {
                bbi.A0S = true;
                BBJ bbj2 = bbi.A0H;
                bbi.A0W.A0V(new C2229BBz(bbj2.A0M(BBJ.A04(bbj2, bbj2.A0G, bbj2.A08)), bbi.A0X, bco, A04(bbi), bbi.A0G, obj, C0881AGi.A00, null));
            }
            A0R(bbi, false);
            bbi.A0C = null;
            bbi.A06 = j;
            A0R(bbi, false);
        } catch (Throwable th) {
            try {
                AbstractC0980ALd.A00(th, C2293BSt.A00(bbi, 22));
                throw th;
            } catch (Throwable th2) {
                A0R(bbi, false);
                bbi.A0C = null;
                bbi.A06 = j;
                A0R(bbi, false);
                throw th2;
            }
        }
    }

    @Override // X.BFM
    public final boolean A61(double d) {
        Object objA07 = A07();
        if ((objA07 instanceof Double) && d == ((Number) objA07).doubleValue()) {
            return false;
        }
        A0O(this, Double.valueOf(d));
        return true;
    }

    @Override // X.BFM
    public final boolean A62(float f) {
        Object objA07 = A07();
        if ((objA07 instanceof Float) && f == ((Number) objA07).floatValue()) {
            return false;
        }
        A0O(this, Float.valueOf(f));
        return true;
    }

    @Override // X.BFM
    public final boolean A63(int i) {
        Object objA07 = A07();
        if ((objA07 instanceof Integer) && i == ((Number) objA07).intValue()) {
            return false;
        }
        A0O(this, Integer.valueOf(i));
        return true;
    }

    @Override // X.BFM
    public final boolean A64(long j) {
        Object objA07 = A07();
        if ((objA07 instanceof Long) && j == ((Number) objA07).longValue()) {
            return false;
        }
        A0O(this, Long.valueOf(j));
        return true;
    }

    @Override // X.BFM
    public final boolean A65(Object obj) {
        if (C7384Etj.areEqual(A07(), obj)) {
            return false;
        }
        A0O(this, obj);
        return true;
    }

    @Override // X.BFM
    public final boolean A66(boolean z) {
        Object objA07 = A07();
        if ((objA07 instanceof Boolean) && z == ((Boolean) objA07).booleanValue()) {
            return false;
        }
        A0O(this, Boolean.valueOf(z));
        return true;
    }

    @Override // X.BFM
    public final boolean A67(Object obj) {
        if (A07() == obj) {
            return false;
        }
        A0O(this, obj);
        return true;
    }

    @Override // X.BFM
    public final <T> T A6v(AKN<T> akn) {
        return (T) AKO.A08(akn, A04(this));
    }

    @Override // X.BFM
    public final boolean AEk() {
        BBb bBbA0V;
        return (AKh() && !this.A0P && ((bBbA0V = A0V()) == null || (bBbA0V.A01 & 4) == 0)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.BFM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AgG(int r6) {
        /*
            r5 = this;
            r5.AgE(r6)
            boolean r0 = r5.A0M
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L28
            X.BBG r0 = r5.A0X
            X.C7384Etj.A0Z(r0, r3)
            X.BBb r2 = new X.BBb
            r2.<init>()
            r2.A05 = r0
            java.util.ArrayList<X.BBb> r0 = r5.A0c
            r0.add(r2)
            A0O(r5, r2)
            int r0 = r5.A01
            r2.A00 = r0
            int r0 = r2.A01
            r0 = r0 & (-17)
        L25:
            r2.A01 = r0
        L27:
            return
        L28:
            java.util.List<X.BCd> r1 = r5.A0e
            X.BBQ r0 = r5.A0F
            int r0 = r0.A05
            int r0 = X.BBY.A00(r1, r0)
            if (r0 < 0) goto Lb7
            java.lang.Object r1 = r1.remove(r0)
        L38:
            X.BBQ r0 = r5.A0F
            java.lang.Object r2 = r0.A05()
            java.lang.Object r0 = X.C78N.A00
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto Laf
            X.BBG r0 = r5.A0X
            X.C7384Etj.A0Z(r0, r3)
            X.BBb r2 = new X.BBb
            r2.<init>()
            r2.A05 = r0
            A0O(r5, r2)
        L55:
            r3 = 1
            if (r1 != 0) goto L62
            int r1 = r2.A01
            r0 = r1 & 64
            if (r0 == 0) goto Lad
            r0 = r1 & (-65)
            r2.A01 = r0
        L62:
            r4 = 1
        L63:
            int r1 = r2.A01
            r0 = r1 & (-9)
            if (r4 == 0) goto L6b
            r0 = r1 | 8
        L6b:
            r2.A01 = r0
            java.util.ArrayList<X.BBb> r0 = r5.A0c
            r0.add(r2)
            int r0 = r5.A01
            r2.A00 = r0
            int r0 = r2.A01
            r1 = r0 & (-17)
            r2.A01 = r1
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L27
            r0 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r2.A01 = r0
            r0 = r0 | 512(0x200, float:7.175E-43)
            r2.A01 = r0
            X.BBR r0 = r5.A0b
            X.BCc r0 = r0.A06
            X.BBe r1 = r0.A00
            X.BBi r0 = X.C2213BBi.A00
            r1.A02(r0)
            r0 = 0
            X.BCJ.A00(r1, r2, r0)
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L27
            int r1 = r2.A01
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L27
            r5.A0Q = r3
            X.BBQ r0 = r5.A0F
            int r0 = r0.A05
            r5.A05 = r0
            r0 = r1 | 1024(0x400, float:1.435E-42)
            goto L25
        Lad:
            r4 = 0
            goto L63
        Laf:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.C7384Etj.A0Z(r2, r0)
            X.BBb r2 = (X.BBb) r2
            goto L55
        Lb7:
            r1 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBI.AgG(int):void");
    }

    public BBI() {
    }
}
