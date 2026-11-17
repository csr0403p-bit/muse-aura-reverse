package com.facebook.aura.file.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.file.spreadsheet.SpreadsheetSheet;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SpreadsheetContentViewKt {

    /* renamed from: com.facebook.aura.file.view.SpreadsheetContentViewKt$SpreadsheetEmptyContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpreadsheetContentViewKt.SpreadsheetEmptyContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: SpreadsheetContent-HYR8e34, reason: not valid java name */
    public static final void m929SpreadsheetContentHYR8e34(AHD<SpreadsheetSheet> ahd, boolean z, ExternalFileSource externalFileSource, String str, BRg bRg, float f, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> spreadsheetContentViewKt$SpreadsheetContent$5;
        BRg bRg2;
        C1822Arm c1822Arm;
        AKH<AuraColors> akh;
        long jA0I;
        long j;
        float f2;
        BRg bRgA01;
        boolean z2 = z;
        ExternalFileSource externalFileSource2 = externalFileSource;
        BRg bRg3 = bRg;
        float f3 = f;
        String str2 = str;
        C7384Etj.A0Y(ahd, 0);
        bfm.AgG(525425042);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, externalFileSource2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg3);
        }
        int i7 = i2 & 32;
        int iA09 = 196608;
        if (i7 != 0) {
            iA0T |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f3);
            iA0T |= iA09;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 74899, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                z2 = false;
            }
            if (i4 != 0) {
                externalFileSource2 = null;
            }
            if (i5 != 0) {
                str2 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            }
            if (i6 != 0) {
                bRg3 = BRg.A00;
            }
            if (i7 != 0) {
                f3 = 0.0f;
            }
            float fAuraLayoutHeight = AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.8f;
            boolean zA1K = AnonymousClass004.A1K(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new SpreadsheetContentViewKt$SpreadsheetContent$1$1(externalFileSource2);
                bfm.Ai0(objAaT);
            }
            int i8 = iA0T >> 6;
            C78e.A05(bfm, externalFileSource2, (G0U) objAaT);
            if (!ahd.isEmpty()) {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 2077508272);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = AnonymousClass002.A0O(bfm, 0);
                }
                C00r c00r = (C00r) objAaT2;
                SpreadsheetSheet spreadsheetSheet = (SpreadsheetSheet) ahd.get(c00r.AGd());
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA04 = C10G.A04(bRg3.then(c1062ATq), fAuraLayoutHeight);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                long j2 = bbiA0M.A06;
                int i9 = (int) (j2 ^ (j2 >>> 32));
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRgA04);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function0);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i9);
                    G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                    C90l c90l = C90l.A00;
                    if (ahd.size() > 1) {
                        bfm.AgE(674178914);
                        BS0 bs0 = BRg.A00;
                        BRg bRgA013 = AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, 1), c1062ATq, true);
                        float f4 = AuraDimensKt.SpacingMedium;
                        float f5 = AuraDimensKt.SpacingXsmall;
                        BRg bRgA0B = C3U4.A0B(bRgA013, f4, f5);
                        InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f5, 0);
                        int iA0D = AnonymousClass001.A0D(bbiA0M);
                        AKQ akqA042 = BBI.A04(bbiA0M);
                        BRg bRgA014 = AxM.A01(bfm, bRgA0B);
                        AnonymousClass005.A0n(bfm, bbiA0M, function0);
                        BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
                        BPg.A02(bfm, akqA042, g0v2);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA014, g0vA0u);
                        Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1475778558);
                        int i10 = 0;
                        while (itA0w.hasNext()) {
                            Object next = itA0w.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC0885AGm.A14();
                            } else {
                                boolean zA1Q = AnonymousClass002.A1Q(i10, c00r.AGd());
                                String str3 = ((SpreadsheetSheet) next).name;
                                if (zA1Q) {
                                    c1822Arm = AnonymousClass006.A0k(bfm, -446091669).footnoteEmphasized;
                                    BBI.A0R(bbiA0M, false);
                                    bfm.AgE(-446086780);
                                    akh = AuraColorsKt.LocalAuraColors;
                                    jA0I = C06G.A0L(bfm, akh);
                                } else {
                                    c1822Arm = AnonymousClass006.A0k(bfm, -446089656).footnoteRegular;
                                    BBI.A0R(bbiA0M, false);
                                    bfm.AgE(-446085690);
                                    akh = AuraColorsKt.LocalAuraColors;
                                    jA0I = C06G.A0I(bfm, akh);
                                }
                                BBI.A0R(bbiA0M, false);
                                BRg bRgA015 = C11U.A01(bs0, 8.0f);
                                if (zA1Q) {
                                    j = AnonymousClass006.A0i(bfm, akh, -943578048).primaryText;
                                    f2 = 0.1f;
                                } else {
                                    j = AnonymousClass006.A0i(bfm, akh, -943467843).secondaryText;
                                    f2 = 0.05f;
                                }
                                long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f2);
                                BBI.A0R(bbiA0M, false);
                                BRg bRgA016 = C1b8.A01(bRgA015, jA04);
                                if (zA1Q) {
                                    bfm.AgE(-942921561);
                                    BBI.A0R(bbiA0M, false);
                                    bRgA01 = bs0;
                                } else {
                                    bfm.AgE(-943256299);
                                    InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj);
                                    boolean zA63 = bfm.A63(i10);
                                    Object objAaT3 = bfm.AaT();
                                    if (zA63 || objAaT3 == obj) {
                                        objAaT3 = new SpreadsheetContentViewKt$SpreadsheetContent$4$1$1$2$1(i10, c00r);
                                        bfm.Ai0(objAaT3);
                                    }
                                    bRgA01 = C0v5.A01(null, interfaceC1072AWd, bs0, null, null, (Function0) objAaT3, true);
                                    BBI.A0R(bbiA0M, false);
                                }
                                AuraTextKt.m2639AuraTextUY9GdpU(str3, C3U4.A0B(bRgA016.then(bRgA01), AuraDimensKt.SpacingSmall, f5), jA0I, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                                i10 = i11;
                            }
                        }
                        BBI.A0R(bbiA0M, false);
                        BBI.A0R(bbiA0M, true);
                    } else {
                        bfm.AgE(675874118);
                    }
                    BBI.A0R(bbiA0M, false);
                    if (spreadsheetSheet.rows.isEmpty()) {
                        bfm.AgE(675934847);
                        bRg2 = null;
                        SpreadsheetEmptyContent(null, bfm, 0, 1);
                    } else {
                        bRg2 = null;
                        bfm.AgE(676052988);
                        FileViewerZoomKt.ZoomableContainer(AnonymousClass001.A0N(c90l, c1062ATq, true), 0.0f, B1V.A00(bfm, new SpreadsheetContentViewKt$SpreadsheetContent$4$2(AbstractC1103AYp.A00(0, bfm, 0, 1), f3, spreadsheetSheet), 611385768), bfm, 384, 2);
                    }
                    BBI.A0R(bbiA0M, false);
                    if (!z2 || externalFileSource2 == null) {
                        bfm.AgE(678611046);
                    } else {
                        bfm.AgE(678427495);
                        OpenExternallyCardKt.OpenExternallyCard(externalFileSource2, str2, bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ef), bfm, i8 & 126, 4);
                    }
                    BBI.A0R(bbiA0M, false);
                    BBI.A0R(bbiA0M, true);
                }
                throw F60.createAndThrow();
            }
            bfm.AgE(2077175766);
            InterfaceC1380AiA interfaceC1380AiAA0U2 = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA017 = AxM.A01(bfm, bRg3);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U2, akqA043, bRgA017, iA0J);
                SpreadsheetEmptyContent(null, bfm, 0, 1);
                if (!z2 || externalFileSource2 == null) {
                    bfm.AgE(-1955227231);
                } else {
                    bfm.AgE(-1955422314);
                    OpenExternallyCardKt.OpenExternallyCard(externalFileSource2, str2, (BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ef), bfm, i8 & 126, 4);
                }
                AnonymousClass002.A0z(bbi, false, true);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    spreadsheetContentViewKt$SpreadsheetContent$5 = new SpreadsheetContentViewKt$SpreadsheetContent$3(ahd, z2, externalFileSource2, str2, bRg3, f3, i, i2);
                    bBbAAc.A06 = spreadsheetContentViewKt$SpreadsheetContent$5;
                }
                return;
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            spreadsheetContentViewKt$SpreadsheetContent$5 = new SpreadsheetContentViewKt$SpreadsheetContent$5(ahd, z2, externalFileSource2, str2, bRg3, f3, i, i2);
            bBbAAc.A06 = spreadsheetContentViewKt$SpreadsheetContent$5;
        }
    }

    public static final void SpreadsheetEmptyContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-7309516);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium), 150.0f);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e9), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }
}
