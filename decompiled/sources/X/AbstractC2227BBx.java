package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.BBx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2227BBx {
    public final int A00;
    public final int A01;

    public BCR A00(InterfaceC2252BCx interfaceC2252BCx) {
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        String str;
        C0910AHm<InterfaceC1560Ala> c0910AHmRemove;
        BCR bcr;
        int iA0L;
        AlY alY;
        if (this instanceof C2225BBv) {
            C7384Etj.A0Z(interfaceC1370Ahw, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            BCQ bcq = (BCQ) interfaceC2252BCx;
            for (Object obj : (Object[]) bcq.A03.A05[bcq.A01]) {
                interfaceC1370Ahw.A9B(obj);
            }
            return;
        }
        if (this instanceof BC6) {
            BCQ bcq2 = (BCQ) interfaceC2252BCx;
            int i = bcq2.A03.A03[bcq2.A00];
            for (int i2 = 0; i2 < i; i2++) {
                interfaceC1370Ahw.Ahp();
            }
            return;
        }
        if (this instanceof BCB) {
            bbj.A0Y(bbj.A00, new C2296BSw(interfaceC2238BCj, 12));
            bbj.A0d();
            return;
        }
        if (this instanceof BCD) {
            bbj.A0W(0);
            return;
        }
        if (this instanceof BBk) {
            BCQ bcq3 = (BCQ) interfaceC2252BCx;
            BBe bBe = bcq3.A03;
            Object[] objArr = bBe.A05;
            int i3 = bcq3.A01;
            Object obj2 = objArr[i3];
            BCR bcr2 = (BCR) objArr[i3 + 1];
            int i4 = bBe.A03[bcq3.A00];
            if (obj2 instanceof InterfaceC1560Ala) {
                AlX alX = (AlX) interfaceC2238BCj;
                alX.A04.A0G(obj2);
                alX.A02.A0B(obj2);
            }
            Object objA0P = bbj.A0P(obj2, bbj.A0L(bcr2), i4);
            if (objA0P instanceof InterfaceC1560Ala) {
                interfaceC2238BCj.ABp((InterfaceC1560Ala) objA0P);
                return;
            } else {
                if (objA0P instanceof BBb) {
                    ((BBb) objA0P).A02();
                    return;
                }
                return;
            }
        }
        if (this instanceof C2214BBj) {
            BCQ bcq4 = (BCQ) interfaceC2252BCx;
            Object[] objArr2 = bcq4.A03.A05;
            int i5 = bcq4.A01;
            BCR bcr3 = (BCR) objArr2[i5];
            Object obj3 = objArr2[i5 + 1];
            if (obj3 instanceof InterfaceC1560Ala) {
                AlX alX2 = (AlX) interfaceC2238BCj;
                alX2.A04.A0G(obj3);
                alX2.A02.A0B(obj3);
            }
            if (bbj.A06 == 0) {
                int i6 = bbj.A02;
                int i7 = bbj.A03;
                int iA0L2 = bbj.A0L(bcr3);
                int iA03 = BBJ.A03(bbj, bbj.A0G, BBJ.A02(bbj, iA0L2 + 1));
                bbj.A02 = iA03;
                bbj.A03 = iA03;
                BBJ.A0D(bbj, 1, iA0L2);
                if (i6 >= iA03) {
                    i6++;
                    i7++;
                }
                bbj.A0H[iA03] = obj3;
                bbj.A02 = i6;
                bbj.A03 = i7;
                return;
            }
            str = "Can only append a slot if not current inserting";
        } else {
            if (this instanceof BC1) {
                BCQ bcq5 = (BCQ) interfaceC2252BCx;
                Object[] objArr3 = bcq5.A03.A05;
                int i8 = bcq5.A01;
                ((G0U) objArr3[i8]).invoke(objArr3[i8 + 1]);
                return;
            }
            if (this instanceof C2221BBr) {
                BCQ bcq6 = (BCQ) interfaceC2252BCx;
                Object[] objArr4 = bcq6.A03.A05;
                int i9 = bcq6.A01;
                BBW bbw = (BBW) objArr4[i9 + 1];
                BCR bcr4 = (BCR) objArr4[i9];
                bbj.A0Q();
                bbj.A0Z(bbw, bbw.A00(bcr4));
                bbj.A0S();
                return;
            }
            if (this instanceof BC4) {
                BCQ bcq7 = (BCQ) interfaceC2252BCx;
                bbj.A0b(bcq7.A03.A05[bcq7.A01]);
                return;
            }
            if (this instanceof BC3) {
                BCQ bcq8 = (BCQ) interfaceC2252BCx;
                int[] iArr = bcq8.A03.A03;
                int i10 = bcq8.A00;
                interfaceC1370Ahw.Aab(iArr[i10], iArr[i10 + 1]);
                return;
            }
            if (this instanceof BBc) {
                BCQ bcq9 = (BCQ) interfaceC2252BCx;
                int i11 = bcq9.A03.A03[bcq9.A00];
                int i12 = bbj.A08;
                int[] iArr2 = bbj.A0G;
                int iA05 = BBJ.A05(bbj, iArr2, BBJ.A02(bbj, i12));
                int iA032 = BBJ.A03(bbj, iArr2, BBJ.A02(bbj, i12 + 1));
                for (int iMax = Math.max(iA05, iA032 - i11); iMax < iA032; iMax++) {
                    Object obj4 = bbj.A0H[BBJ.A01(bbj, iMax)];
                    if (obj4 instanceof InterfaceC1560Ala) {
                        interfaceC2238BCj.ABp((InterfaceC1560Ala) obj4);
                    } else if (obj4 instanceof BBb) {
                        ((BBb) obj4).A02();
                    }
                }
                str = "Check failed";
                if (AnonymousClass002.A1N(i11)) {
                    int i13 = bbj.A08;
                    int[] iArr3 = bbj.A0G;
                    int iA052 = BBJ.A05(bbj, iArr3, BBJ.A02(bbj, i13));
                    int iA033 = BBJ.A03(bbj, iArr3, BBJ.A02(bbj, i13 + 1)) - i11;
                    if (iA033 >= iA052) {
                        BBJ.A0G(bbj, iA033, i11, i13);
                        int i14 = bbj.A02;
                        if (i14 >= iA052) {
                            bbj.A02 = i14 - i11;
                            return;
                        }
                        return;
                    }
                }
            } else {
                if (this instanceof C2220BBq) {
                    BCQ bcq10 = (BCQ) interfaceC2252BCx;
                    Object[] objArr5 = bcq10.A03.A05;
                    int i15 = bcq10.A01;
                    BCN bcn = (BCN) objArr5[i15];
                    C2229BBz c2229BBz = (C2229BBz) objArr5[i15 + 2];
                    ((BBV) objArr5[i15 + 1]).A0L(interfaceC1370Ahw, BBL.A00(null, bcn, c2229BBz, bbj), c2229BBz);
                    return;
                }
                if (this instanceof BCF) {
                    interfaceC1370Ahw.Abn();
                    return;
                }
                if (this instanceof C2213BBi) {
                    BCQ bcq11 = (BCQ) interfaceC2252BCx;
                    Object obj5 = bcq11.A03.A05[bcq11.A01];
                    AlX alX3 = (AlX) interfaceC2238BCj;
                    AbstractC0915AHr abstractC0915AHr = alX3.A00;
                    if (abstractC0915AHr == null || (alY = (AlY) abstractC0915AHr.A05(obj5)) == null) {
                        return;
                    }
                    ArrayList<C0910AHm<InterfaceC1560Ala>> arrayListA0h = alX3.A06;
                    if (arrayListA0h == null) {
                        arrayListA0h = C3cG.A0h();
                        alX3.A06 = arrayListA0h;
                    }
                    arrayListA0h.add(alX3.A04);
                    alX3.A04 = alY.A00;
                    return;
                }
                if (this instanceof BBf) {
                    BCQ bcq12 = (BCQ) interfaceC2252BCx;
                    Object obj6 = bcq12.A03.A05[bcq12.A01];
                    AlX alX4 = (AlX) interfaceC2238BCj;
                    Set<InterfaceC1559AlZ> set = alX4.A07;
                    if (set != null) {
                        AlY alY2 = new AlY(set);
                        C0918AHu c0918AHuA02 = alX4.A00;
                        if (c0918AHuA02 == null) {
                            c0918AHuA02 = C0918AHu.A02();
                            alX4.A00 = c0918AHuA02;
                        }
                        c0918AHuA02.A0E(obj6, alY2);
                        C0910AHm<InterfaceC1560Ala> c0910AHm = alX4.A04;
                        BAU bau = new BAU();
                        bau.A01 = alY2;
                        bau.A00 = -1;
                        c0910AHm.A0G(bau);
                        return;
                    }
                    return;
                }
                if (this instanceof BC2) {
                    BCQ bcq13 = (BCQ) interfaceC2252BCx;
                    int[] iArr4 = bcq13.A03.A03;
                    int i16 = bcq13.A00;
                    interfaceC1370Ahw.AQt(iArr4[i16], iArr4[i16 + 1], iArr4[i16 + 2]);
                    return;
                }
                if (this instanceof BBT) {
                    BCQ bcq14 = (BCQ) interfaceC2252BCx;
                    int i17 = bcq14.A03.A03[bcq14.A00];
                    if (bbj.A06 == 0) {
                        str = "Parameter offset is out of bounds";
                        if (C8j3.A1Q(i17)) {
                            if (i17 == 0) {
                                return;
                            }
                            int i18 = bbj.A00;
                            int i19 = bbj.A08;
                            int i20 = bbj.A01;
                            int i21 = i18;
                            while (true) {
                                int[] iArr5 = bbj.A0G;
                                if (i17 > 0) {
                                    i21 += iArr5[(BBJ.A02(bbj, i21) * 5) + 3];
                                    if (i21 > i20) {
                                        break;
                                    } else {
                                        i17--;
                                    }
                                } else {
                                    int iA02 = BBJ.A02(bbj, i21);
                                    int i22 = iArr5[(iA02 * 5) + 3];
                                    int iA034 = BBJ.A03(bbj, iArr5, BBJ.A02(bbj, i18));
                                    int iA035 = BBJ.A03(bbj, iArr5, iA02);
                                    int i23 = i21 + i22;
                                    int iA036 = BBJ.A03(bbj, iArr5, BBJ.A02(bbj, i23));
                                    int i24 = iA036 - iA035;
                                    BBJ.A0D(bbj, i24, Math.max(i18 - 1, 0));
                                    BBJ.A09(bbj, i22);
                                    int[] iArr6 = bbj.A0G;
                                    int iA022 = BBJ.A02(bbj, i23) * 5;
                                    AbstractC0903AHf.A03(iArr6, iArr6, BBJ.A02(bbj, i18) * 5, iA022, (i22 * 5) + iA022);
                                    if (i24 > 0) {
                                        Object[] objArr6 = bbj.A0H;
                                        int iA01 = BBJ.A01(bbj, iA035 + i24);
                                        System.arraycopy(objArr6, iA01, objArr6, iA034, BBJ.A01(bbj, iA036 + i24) - iA01);
                                    }
                                    int i25 = iA035 + i24;
                                    int i26 = i25 - iA034;
                                    int i27 = bbj.A0B;
                                    int i28 = bbj.A09;
                                    int length = bbj.A0H.length;
                                    int i29 = bbj.A0A;
                                    int i30 = i18 + i22;
                                    for (int i31 = i18; i31 < i30; i31++) {
                                        int iA023 = BBJ.A02(bbj, i31);
                                        int iA037 = BBJ.A03(bbj, iArr6, iA023) - i26;
                                        int i32 = i27;
                                        if (i29 < iA023) {
                                            i32 = 0;
                                        }
                                        if (iA037 > i32) {
                                            iA037 = -(((length - i28) - iA037) + 1);
                                        }
                                        if (iA037 > i27) {
                                            iA037 = -(((length - i28) - iA037) + 1);
                                        }
                                        iArr6[(iA023 * 5) + 4] = iA037;
                                    }
                                    int i33 = i22 + i23;
                                    int length2 = (bbj.A0G.length / 5) - bbj.A04;
                                    ArrayList<BCR> arrayList = bbj.A0D;
                                    int iA00 = BCA.A00(arrayList, i23, length2);
                                    if (iA00 < 0) {
                                        iA00 = -(iA00 + 1);
                                    }
                                    ArrayList arrayListA0h2 = C3cG.A0h();
                                    if (iA00 >= 0) {
                                        while (iA00 < arrayList.size() && (iA0L = bbj.A0L((bcr = arrayList.get(iA00)))) >= i23 && iA0L < i33) {
                                            arrayListA0h2.add(bcr);
                                            arrayList = bbj.A0D;
                                            arrayList.remove(iA00);
                                        }
                                    }
                                    int i34 = i18 - i23;
                                    int size = arrayListA0h2.size();
                                    for (int i35 = 0; i35 < size; i35++) {
                                        BCR bcr5 = (BCR) arrayListA0h2.get(i35);
                                        int iA0L3 = bbj.A0L(bcr5) + i34;
                                        if (iA0L3 >= bbj.A05) {
                                            bcr5.A00 = -(length2 - iA0L3);
                                        } else {
                                            bcr5.A00 = iA0L3;
                                        }
                                        ArrayList<BCR> arrayList2 = bbj.A0D;
                                        int iA002 = BCA.A00(arrayList2, iA0L3, length2);
                                        if (iA002 < 0) {
                                            iA002 = -(iA002 + 1);
                                        }
                                        arrayList2.add(iA002, bcr5);
                                    }
                                    if (!BBJ.A0J(bbj, i23, i22)) {
                                        BBJ.A0F(bbj, i19, bbj.A01, i18);
                                        if (i24 > 0) {
                                            BBJ.A0G(bbj, i25, i24, i23 - 1);
                                            return;
                                        }
                                        return;
                                    }
                                    str = "Unexpectedly removed anchors";
                                }
                            }
                        }
                    } else {
                        str = "Cannot move a group while inserting";
                    }
                } else {
                    if (this instanceof C2212BBh) {
                        BCQ bcq15 = (BCQ) interfaceC2252BCx;
                        Object obj7 = bcq15.A03.A05[bcq15.A01];
                        AlX alX5 = (AlX) interfaceC2238BCj;
                        C0918AHu<BBb, AlY> c0918AHu = alX5.A00;
                        if (c0918AHu == 0 || c0918AHu.A05(obj7) == null) {
                            return;
                        }
                        ArrayList<C0910AHm<InterfaceC1560Ala>> arrayList3 = alX5.A06;
                        if (arrayList3 != null && (c0910AHmRemove = arrayList3.remove(C8j3.A0K(arrayList3))) != null) {
                            alX5.A04 = c0910AHmRemove;
                        }
                        c0918AHu.A0B(obj7);
                        return;
                    }
                    if (this instanceof BC8) {
                        bbj.A0Y(bbj.A00, new BTC(13, interfaceC2238BCj, bbj));
                        return;
                    }
                    if (!(this instanceof BBU)) {
                        BCQ bcq16 = (BCQ) interfaceC2252BCx;
                        Object[] objArr7 = bcq16.A03.A05;
                        int i36 = bcq16.A01;
                        int i37 = ((B8p) objArr7[i36]).A00;
                        List list = (List) objArr7[i36 + 1];
                        int size2 = list.size();
                        for (int i38 = 0; i38 < size2; i38++) {
                            Object obj8 = list.get(i38);
                            C7384Etj.A0Z(interfaceC1370Ahw, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                            int i39 = i37 + i38;
                            interfaceC1370Ahw.ANj(i39, obj8);
                            interfaceC1370Ahw.ANm(i39, obj8);
                        }
                        return;
                    }
                    BCQ bcq17 = (BCQ) interfaceC2252BCx;
                    Object[] objArr8 = bcq17.A03.A05;
                    int i40 = bcq17.A01;
                    C2229BBz c2229BBz2 = (C2229BBz) objArr8[i40 + 2];
                    C2229BBz c2229BBz3 = (C2229BBz) objArr8[i40 + 3];
                    BBV bbv = (BBV) objArr8[i40 + 1];
                    C2239BCk c2239BCkA0H = (C2239BCk) objArr8[i40];
                    if (c2239BCkA0H == null && (c2239BCkA0H = bbv.A0H(c2229BBz2)) == null) {
                        BBL.A02("Could not resolve state for movable content");
                        throw F60.createAndThrow();
                    }
                    BBW bbwA01 = BCA.A01(c2239BCkA0H.A00);
                    if (bbj.A06 <= 0) {
                        int i41 = bbj.A00;
                        if (bbj.A0G[(BBJ.A02(bbj, i41 + 1) * 5) + 3] == 1) {
                            int i42 = bbj.A02;
                            int i43 = bbj.A03;
                            bbj.A0V(1);
                            bbj.A0U();
                            bbj.A0Q();
                            BBJ bbjA02 = bbwA01.A02();
                            try {
                                List listA06 = BBJ.A06(bbjA02, bbj, 2, false, true, true);
                                bbjA02.A0c(true);
                                bbj.A0S();
                                bbj.A0R();
                                bbj.A00 = i41;
                                bbj.A02 = i42;
                                bbj.A03 = i43;
                                BCN bcn2 = c2229BBz3.A02;
                                C7384Etj.A0Z(bcn2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
                                BBb.A01((InterfaceC2230BCa) bcn2, bbj, listA06);
                                return;
                            } catch (Throwable th) {
                                bbjA02.A0c(false);
                                throw th;
                            }
                        }
                    }
                    str = "Check failed";
                }
            }
        }
        BBL.A01(str);
        throw F60.createAndThrow();
    }

    public AbstractC2227BBx(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        String strA0n = C60O.A0n(this);
        return strA0n == null ? "" : strA0n;
    }
}
