package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1SA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1SA {
    public static final void A00(BFM bfm, Alignment alignment, BRg bRg, C1423Ais c1423Ais, final AVy aVy, ARL arl, final String str, float f, final int i, final int i2) {
        BBI bbi;
        BRg bRgA01;
        final Alignment alignment2 = alignment;
        final BRg bRg2 = bRg;
        final C1423Ais c1423Ais2 = c1423Ais;
        final ARL arl2 = arl;
        final float f2 = f;
        bfm.AgG(1142754848);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aVy, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, alignment2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, arl2);
        }
        int i6 = i2 & 32;
        int iA09 = 196608;
        if (i6 != 0) {
            iA05 |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f2);
            iA05 |= iA09;
        }
        int i7 = i2 & 64;
        int iA0j = 1572864;
        if (i7 != 0) {
            iA05 |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, c1423Ais2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                alignment2 = C2VU.A09;
            }
            if (i5 != 0) {
                arl2 = B18.A02;
            }
            if (i6 != 0) {
                f2 = 1.0f;
            }
            C1423Ais c1423Ais3 = i7 == 0 ? c1423Ais2 : null;
            if (str != null) {
                bfm.AgE(1899222916);
                BS0 bs0 = BRg.A00;
                boolean zA1I = AnonymousClass004.A1I(iA05);
                Object objAaT = bfm.AaT();
                if (zA1I || objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: X.1SB
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
                            AbstractC1564Ale.A08(interfaceC0857A6e, str);
                            AbstractC1564Ale.A06(interfaceC0857A6e, 5);
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                bRgA01 = ARD.A01(bs0, (G0U) objAaT, false);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1899381698);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                bRgA01 = BRg.A00;
            }
            BRg bRgThen = C11U.A00(bRg2.then(bRgA01)).then(new AYN(alignment2, c1423Ais3, aVy, arl2, f2));
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = new InterfaceC1380AiA() { // from class: X.3Tk
                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i8) {
                        return AXQ.A00(c3tf, this, list, i8);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i8) {
                        return AXQ.A01(c3tf, this, list, i8);
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        return AnonymousClass002.A0X(axy, new C3bM(0), Constraints.A03(j), Constraints.A02(j));
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i8) {
                        return AXQ.A02(c3tf, this, list, i8);
                    }

                    @Override // X.InterfaceC1380AiA
                    public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i8) {
                        return AXQ.A03(c3tf, this, list, i8);
                    }
                };
                bfm.Ai0(objAaT2);
            }
            int iA0J = AnonymousClass003.A0J(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AKQ akqA04 = BBI.A04(bbi);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, objAaT2, akqA04);
            AnonymousClass003.A0n(bfm, bRgA012);
            AnonymousClass002.A0w(bfm, iA0J);
            BBI.A0R(bbi, true);
            c1423Ais2 = c1423Ais3;
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.1S9
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AVy aVy2 = aVy;
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    Alignment alignment3 = alignment2;
                    ARL arl3 = arl2;
                    float f3 = f2;
                    C1423Ais c1423Ais4 = c1423Ais2;
                    int i8 = i;
                    C1SA.A00((BFM) obj, alignment3, bRg3, c1423Ais4, aVy2, arl3, str2, f3, AnonymousClass011.A00(i8), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.BFM r14, androidx.compose.ui.Alignment r15, X.BRg r16, X.InterfaceC2178B0w r17, X.ARL r18, java.lang.String r19, int r20, int r21) {
        /*
            r7 = r15
            r0 = r21 & 8
            if (r0 == 0) goto L7
            androidx.compose.ui.Alignment r7 = X.C2VU.A09
        L7:
            r13 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4 = 1
            r6 = r14
            r5 = r17
            boolean r0 = r14.A65(r5)
            java.lang.Object r10 = r14.AaT()
            if (r0 != 0) goto L1c
            java.lang.Object r0 = X.C78N.A00
            if (r10 != r0) goto L3c
        L1c:
            r0 = r5
            X.B1T r0 = (X.B1T) r0
            android.graphics.Bitmap r1 = r0.A00
            int r0 = r1.getWidth()
            int r3 = r1.getHeight()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r0 = X.AnonymousClass002.A0G(r2, r0)
            X.2ad r10 = new X.2ad
            r10.<init>(r5, r0)
            r10.A00 = r4
            r14.Ai0(r10)
        L3c:
            X.AVy r10 = (X.AVy) r10
            r0 = 8
            r1 = r20
            int r0 = X.AnonymousClass003.A06(r1, r0)
            int r14 = X.AnonymousClass001.A0A(r1, r0)
            r15 = 0
            r8 = r16
            r11 = r18
            r12 = r19
            A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1SA.A01(X.BFM, androidx.compose.ui.Alignment, X.BRg, X.B0w, X.ARL, java.lang.String, int, int):void");
    }

    public static void A02(BFM bfm, BRg bRg, AVy aVy, float f) {
        A00(bfm, null, C10G.A07(bRg, f), null, aVy, null, null, 0.0f, AVy.$stable | 432, 120);
    }
}
