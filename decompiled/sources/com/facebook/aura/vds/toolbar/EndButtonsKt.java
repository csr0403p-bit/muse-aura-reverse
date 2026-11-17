package com.facebook.aura.vds.toolbar;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C0v5;
import X.C1515AkP;
import X.C15N;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EndButtonsKt {

    /* renamed from: com.facebook.aura.vds.toolbar.EndButtonsKt$EndButtons$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<AuraToolbarAgent.EndButtonConfig> $endButtonsList;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $shouldAddEndPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, AHD<AuraToolbarAgent.EndButtonConfig> ahd, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$endButtonsList = ahd;
            this.$shouldAddEndPadding = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EndButtonsKt.EndButtons(this.$modifier, this.$endButtonsList, this.$shouldAddEndPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EndButtons(BRg bRg, AHD<AuraToolbarAgent.EndButtonConfig> ahd, boolean z, BFM bfm, int i, int i2) {
        String strA00;
        AKH<AuraColors> akh;
        long j;
        AuraLabelButtonStyle style;
        BRg bRgA0Q = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(ahd, 1);
        bfm.AgG(-1986223829);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRgA0Q) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgThen = C3U4.A0C(bs0, AuraDimensKt.SpacingNano, 0.0f, 0.0f, 0.0f).then(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00, bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                if (ahd.isEmpty()) {
                    bfm.AgE(1112202417);
                    NavIconKt.ButtonPlaceHolder(C3U4.A0C(bs0, AuraDimensKt.SpacingLarge, 0.0f, AuraDimensKt.SpacingXsmallPlusNano, 0.0f), bfm, 0, 0);
                } else {
                    Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1109174895);
                    int i5 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            AuraToolbarAgent.EndButtonConfig endButtonConfig = (AuraToolbarAgent.EndButtonConfig) next;
                            Integer num = endButtonConfig.contentDescriptionRes;
                            if (num == null) {
                                bfm.AgE(2059990853);
                                BBI.A0R(bbi, false);
                                strA00 = null;
                            } else {
                                bfm.AgE(2059990854);
                                strA00 = C15N.A00(bfm, num.intValue());
                                BBI.A0R(bbi, false);
                            }
                            if (endButtonConfig.usePrimaryColorStyle) {
                                bfm.AgE(2060098827);
                                akh = AuraColorsKt.LocalAuraColors;
                                j = AnonymousClass001.A0f(bfm, akh).accent;
                                BBI.A0R(bbi, false);
                            } else {
                                bfm.AgE(2060157944);
                                akh = AuraColorsKt.LocalAuraColors;
                                j = AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground;
                                BBI.A0R(bbi, false);
                            }
                            BRg bRgA0C = C3U4.A0C(bs0, AuraDimensKt.SpacingLarge, 0.0f, (z2 && i5 == ahd.size() - 1) ? AuraDimensKt.SpacingXsmallPlusNano : 0.0f, 0.0f);
                            boolean zA65 = bfm.A65(strA00);
                            Object objAaT = bfm.AaT();
                            if (zA65 || objAaT == C78N.A00) {
                                objAaT = new EndButtonsKt$EndButtons$1$1$modifier$1$1(strA00);
                                bfm.Ai0(objAaT);
                            }
                            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0C, objAaT, false);
                            if (endButtonConfig.addCircleBackground) {
                                bRgA0Y = bRgA0Y.then(C3U4.A09(C1b8.A03(bs0, C1D8.A00, j), AuraDimensKt.SpacingXsmall));
                            }
                            Integer num2 = endButtonConfig.icon;
                            Integer num3 = endButtonConfig.stringRes;
                            if (num2 != null) {
                                if (num3 != null) {
                                    String strA0g = AnonymousClass003.A0g(bfm, num3, 2061091354);
                                    if (endButtonConfig.usePrimaryColorStyle) {
                                        bfm.AgE(-1873170549);
                                        style = AuraButtonKt.toStyle(AuraButtonStyle.PRIMARY_ALT, null, bfm, 6, 1);
                                        BBI.A0R(bbi, false);
                                    } else {
                                        bfm.AgE(-1873168661);
                                        style = AuraButtonKt.toStyle(AuraButtonStyle.SECONDARY, null, bfm, 6, 1);
                                        BBI.A0R(bbi, false);
                                    }
                                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0g, null, null, style, AuraButtonSize.SMALL, B1V.A00(bfm, new EndButtonsKt$EndButtons$1$1$1(num2), -1465838401), false, false, false, false, false, null, null, endButtonConfig.listener, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1769472, 0, 0, 134201229);
                                } else {
                                    bfm.AgE(2061693095);
                                    AVy aVyA00 = AbstractC8407FdO.A00(bfm, num2.intValue());
                                    AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
                                    AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                                    AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                                    if (strA00 == null) {
                                        strA00 = "";
                                    }
                                    B6A b6aA0P = null;
                                    Function0<Unit> function02 = endButtonConfig.listener;
                                    if (endButtonConfig.addCircleBackground) {
                                        b6aA0P = AnonymousClass006.A0P(bbi, AnonymousClass006.A0i(bfm, akh, 2062161040).secondaryIcon.enabled);
                                    } else {
                                        bfm.AgE(2062243995);
                                        BBI.A0R(bbi, false);
                                    }
                                    AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA0Y, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA00, function02, null, false, b6aA0P, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 15136);
                                }
                            } else if (num3 != null) {
                                bfm.AgE(2062319977);
                                long j2 = endButtonConfig.usePrimaryColorStyle ? AnonymousClass006.A0i(bfm, akh, 2062381698).primaryText : AnonymousClass006.A0i(bfm, akh, 2062449216).secondaryText;
                                BBI.A0R(bbi, false);
                                AuraTextKt.m2639AuraTextUY9GdpU(C15N.A00(bfm, num3.intValue()), C1b8.A01(C0v5.A04(bRgA0Y, new C1YD(0), null, endButtonConfig.listener, true), j), j2, C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                            } else {
                                bfm.AgE(2062957120);
                            }
                            BBI.A0R(bbi, false);
                            i5 = i6;
                        }
                    }
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRgA0Q, ahd, z2, i, i2);
        }
    }
}
