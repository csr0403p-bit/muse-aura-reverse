package com.facebook.aura.vds.compose.segmentedtabs;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C2VU;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSegmentedTabsKt {

    /* renamed from: com.facebook.aura.vds.compose.segmentedtabs.AuraSegmentedTabsKt$AuraTogglePillSegmentedTab$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraIconSize $iconSize;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ AuraTab $tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraTab auraTab, boolean z, BRg bRg, AuraIconSize auraIconSize, int i, int i2) {
            super(2);
            this.$tab = auraTab;
            this.$selected = z;
            this.$modifier = bRg;
            this.$iconSize = auraIconSize;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSegmentedTabsKt.AuraTogglePillSegmentedTab(this.$tab, this.$selected, this.$modifier, this.$iconSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: AuraSegmentedTab-x3qM97A, reason: not valid java name */
    public static final void m2608AuraSegmentedTabx3qM97A(AuraTab auraTab, boolean z, AuraIconSize auraIconSize, B6A b6a, B6A b6a2, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        long j;
        B6A b6a3 = b6a;
        B6A b6a4 = b6a2;
        AuraIconSize auraIconSize2 = auraIconSize;
        bfm.AgG(2055375495);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraTab, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(auraIconSize2));
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, b6a3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, b6a4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                auraIconSize2 = AuraIconSize.TINY;
            }
            String strA0g = null;
            if (i4 != 0) {
                b6a3 = null;
            }
            if (i5 != 0) {
                b6a4 = null;
            }
            if (z) {
                bfm.AgE(-1657140822);
                if (b6a3 == null) {
                    j = AnonymousClass003.A0c(bfm, -469096974).primaryText;
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                } else {
                    bbiA0M = AnonymousClass002.A0M(bfm, -469098152);
                    j = b6a3.A00;
                }
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-1657080248);
                if (b6a4 == null) {
                    j = AnonymousClass003.A0c(bfm, -469094958).primaryText;
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                } else {
                    bfm.AgE(-469096198);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                    j = b6a4.A00;
                }
                BBI.A0R(bbiA0M, false);
            }
            if (auraTab instanceof TextTab) {
                bfm.AgE(-1656991805);
                TextTab textTab = (TextTab) auraTab;
                String strA01 = AbstractC2271BQs.A01(bfm, textTab.getResId());
                C1822Arm c1822Arm = textTab.textStyle;
                if (c1822Arm == null) {
                    c1822Arm = AnonymousClass006.A0k(bfm, -469088648).subheadlineMedium;
                } else {
                    bfm.AgE(-469089826);
                }
                BBI.A0R(bbiA0M, false);
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else if (auraTab instanceof StringTab) {
                bfm.AgE(-1656782214);
                AuraTextKt.m2639AuraTextUY9GdpU(((StringTab) auraTab).string, null, j, C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                if (!(auraTab instanceof IconTab)) {
                    if (auraTab instanceof IconTextTab) {
                        bfm.AgE(-1656368333);
                        C9m9 c9m9A01 = AcQ.A01(C2VU.A00, AuraDimensKt.SpacingMicro);
                        C1AC c1ac = C2VU.A04;
                        BS0 bs0 = BRg.A00;
                        InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A01, bfm, c1ac, 48);
                        int iA0J = AnonymousClass003.A0J(bbiA0M);
                        AKQ akqA04 = BBI.A04(bbiA0M);
                        BRg bRgA01 = AxM.A01(bfm, bs0);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbiA0M.A0V != null) {
                            AnonymousClass005.A0n(bfm, bbiA0M, function0);
                            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                            IconTextTab iconTextTab = (IconTextTab) auraTab;
                            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, iconTextTab.iconResId, 0), auraIconSize2, null, j, null, bfm, (AVy.$stable << 3) | 3072 | (iA05 & 896), 33);
                            AuraTextKt.m2639AuraTextUY9GdpU(iconTextTab.string, null, j, C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                            BBI.A0R(bbiA0M, true);
                        }
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    if (!(auraTab instanceof TextCounter)) {
                        throw AnonymousClass003.A0k(bfm, bbiA0M, -469092600);
                    }
                    bfm.AgE(-1655823322);
                    C9m9 c9m9A012 = AcQ.A01(C2VU.A00, 8.0f);
                    C1AC c1ac2 = C2VU.A04;
                    BS0 bs02 = BRg.A00;
                    InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A012, bfm, c1ac2);
                    long j2 = bbiA0M.A06;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    AKQ akqA042 = BBI.A04(bbiA0M);
                    BRg bRgA012 = AxM.A01(bfm, bs02);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbiA0M.A0V != null) {
                        AnonymousClass005.A0n(bfm, bbiA0M, function02);
                        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                        BPg.A02(bfm, interfaceC1380AiAA0b, g0v);
                        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                        G0V g0vA19 = AnonymousClass004.A19(bfm, akqA042, g0v2, i6);
                        G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                        G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                        TextCounter textCounter = (TextCounter) auraTab;
                        long j3 = j;
                        AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, textCounter.getResId()), null, j3, C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                        BRg bRgA0P = C06G.A0P(bfm, AnonymousClass001.A0S(bs02), C1D8.A00);
                        InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                        int iA0D = AnonymousClass001.A0D(bbiA0M);
                        AKQ akqA043 = BBI.A04(bbiA0M);
                        BRg bRgA013 = AxM.A01(bfm, bRgA0P);
                        AnonymousClass005.A0n(bfm, bbiA0M, function02);
                        BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                        BPg.A02(bfm, akqA043, g0v2);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA013, g0vA0u);
                        AuraTextKt.m2639AuraTextUY9GdpU(String.valueOf(textCounter.count), null, j3, AnonymousClass002.A0f(bfm).footnoteEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                        BBI.A0R(bbiA0M, true);
                        BBI.A0R(bbiA0M, true);
                    }
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                bfm.AgE(-1656618875);
                IconTab iconTab = (IconTab) auraTab;
                AVy aVyA00 = BOf.A00(bfm, iconTab.getResId(), 0);
                Integer num = iconTab.contentDescriptionId;
                if (num == null) {
                    bfm.AgE(-1656506377);
                } else {
                    strA0g = AnonymousClass003.A0g(bfm, num, -1656506376);
                }
                BBI.A0R(bbiA0M, false);
                AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize2, strA0g, j, null, bfm, (AVy.$stable << 3) | (iA05 & 896), 33);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraSegmentedTabsKt$AuraSegmentedTab$4(auraTab, z, auraIconSize2, b6a3, b6a4, i, i2);
        }
    }

    public static final void AuraTogglePillSegmentedTab(AuraTab auraTab, boolean z, BRg bRg, AuraIconSize auraIconSize, BFM bfm, int i, int i2) {
        AuraIconSize auraIconSize2 = auraIconSize;
        bfm.AgG(-651612297);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraTab, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(auraIconSize2));
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                auraIconSize2 = AuraIconSize.TINY;
            }
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            m2608AuraSegmentedTabx3qM97A(auraTab, z, auraIconSize2, null, null, bfm, (iA05 & 126) | ((iA05 >> 3) & 896), 24);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraTab, z, bRg, auraIconSize2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017e  */
    /* renamed from: AuraToggleSegmentedTabs-wDTT_x8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2609AuraToggleSegmentedTabswDTT_x8(X.G0V<? super com.facebook.aura.vds.compose.segmentedtabs.AuraTab, ? super java.lang.Integer, kotlin.Unit> r46, X.AHD<? extends com.facebook.aura.vds.compose.segmentedtabs.AuraTab> r47, int r48, X.BRg r49, long r50, long r52, float r54, float r55, float r56, com.facebook.aura.vds.compose.icons.AuraIconSize r57, X.InterfaceC1072AWd r58, X.BFM r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.segmentedtabs.AuraSegmentedTabsKt.m2609AuraToggleSegmentedTabswDTT_x8(X.G0V, X.AHD, int, X.BRg, long, long, float, float, float, com.facebook.aura.vds.compose.icons.AuraIconSize, X.AWd, X.BFM, int, int, int):void");
    }
}
