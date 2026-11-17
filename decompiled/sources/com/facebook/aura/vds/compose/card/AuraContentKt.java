package com.facebook.aura.vds.compose.card;

import X.AKH;
import X.AKQ;
import X.AbstractC2022Awb;
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
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0A8;
import X.C1515AkP;
import X.C1DP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.aura.vds.compose.visualtransformation.BoldToColorAnnotatedStringTransformationKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraContentKt {

    /* renamed from: com.facebook.aura.vds.compose.card.AuraContentKt$AuraContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraCardContent $content;
        public final /* synthetic */ boolean $destructive;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $footerComposable;
        public final /* synthetic */ boolean $hasEndItem;
        public final /* synthetic */ boolean $hasStartItem;
        public final /* synthetic */ boolean $mergeContentDescription;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, AuraCardContent auraCardContent, boolean z, boolean z2, boolean z3, boolean z4, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = auraCardContent;
            this.$destructive = z;
            this.$mergeContentDescription = z2;
            this.$hasStartItem = z3;
            this.$hasEndItem = z4;
            this.$footerComposable = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContentKt.AuraContent(this.$modifier, this.$content, this.$destructive, this.$mergeContentDescription, this.$hasStartItem, this.$hasEndItem, this.$footerComposable, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String contentDescription(AuraCardContent auraCardContent) {
        String string;
        C7384Etj.A0Y(auraCardContent, 0);
        String str = auraCardContent.contentDescription;
        if (str != null && !C7BY.A0j(str)) {
            return auraCardContent.contentDescription;
        }
        ApQ apQ = auraCardContent.title;
        if (apQ == null || (string = apQ.toString()) == null) {
            string = "";
        }
        return FGI.A0M(string, contentDescription(auraCardContent.subtitle));
    }

    public static final void AuraContent(BRg bRg, AuraCardContent auraCardContent, boolean z, boolean z2, boolean z3, boolean z4, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        long j;
        ApQ apQ;
        long j2;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        boolean zA1a = AnonymousClass002.A1a(bRg, auraCardContent);
        bfm.AgG(445009708);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, auraCardContent);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z5);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z6);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z7);
            iA0d |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0w2);
            iA0d |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                z5 = true;
            }
            if (i4 != 0) {
                z6 = false;
            }
            if (i5 != 0) {
                z7 = false;
            }
            if (i6 != 0) {
                g0w2 = null;
            }
            float f = z6 ? AuraDimensKt.SpacingSmall : AuraDimensKt.SpacingNone;
            float f2 = z7 ? AuraDimensKt.SpacingSmall : AuraDimensKt.SpacingNone;
            float f3 = AuraDimensKt.SpacingNone;
            C1DP c1dp = new C1DP(f, f3, f2, f3);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.B1_EMPHASIZED;
            AuraIconAndBodyStyle auraIconAndBodyStyle = AuraIconAndBodyStyle.B2;
            BRg bRgA0D = C3U4.A0D(bRg, c1dp);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j3 = bbi.A06;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0D);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i7);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            bfm.AgE(-897328185);
            BRg bRgA0X = BRg.A00;
            BRg bRgA00 = bRgA0X;
            if (z5) {
                boolean zA1C = AnonymousClass003.A1C(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1C || objAaT == C78N.A00) {
                    objAaT = new AuraContentKt$AuraContent$1$1$1$1(auraCardContent);
                    bfm.Ai0(objAaT);
                }
                bRgA0X = AnonymousClass001.A0X(bRgA0X, objAaT);
            }
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingMicro), bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0X);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            ApQ apQ2 = auraCardContent.title;
            if (apQ2 == null) {
                bfm.AgE(-1979562641);
            } else {
                Object objA0p = AnonymousClass001.A0p(bfm, -1979562640);
                if (objA0p == C78N.A00) {
                    objA0p = AuraContentKt$AuraContent$1$2$1$1$1$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                BRg bRgA002 = AbstractC2022Awb.A00(bRgA00, (G0U) objA0p);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle2 = auraCardContent.titleStyle;
                if (auraIconAndHeadlineStyle2 != null) {
                    auraIconAndHeadlineStyle = auraIconAndHeadlineStyle2;
                }
                boolean z8 = auraCardContent.titleIsHeading;
                if (z && ((apQ = auraCardContent.subtitle) == null || C7BY.A0j(apQ))) {
                    j = AnonymousClass003.A0c(bfm, 218141415).destructiveText;
                } else {
                    bfm.AgE(-1827506984);
                    B6A b6a = auraCardContent.titleColor;
                    if (b6a == null) {
                        j = AnonymousClass003.A0c(bfm, 218144035).primaryText;
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(218142826);
                        BBI.A0R(bbi, false);
                        j = b6a.A00;
                    }
                }
                BBI.A0R(bbi, false);
                AuraIconAndHeadlineKt.m3100AuraIconAndHeadline8Ls536Q(bRgA002, apQ2, auraIconAndHeadlineStyle, z8, null, auraCardContent.textAlign, ColorExtKt.m2544applyContentAlphaek8zF_U(j, bfm, 0), false, auraCardContent.titleMaxLines, 2, auraCardContent.boxedText, auraCardContent.boxedTextColor, auraCardContent.boxedTextStyle, auraCardContent.boxedTextBackgroundColor, auraCardContent.titleInlineContent, null, bfm, 805306368, 0, 32912);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
            if (auraCardContent.subtitle == null || (!C7BY.A0j(r5)) != zA1a) {
                bfm.AgE(-1789549246);
            } else {
                bfm.AgE(-1790341358);
                bfm.AgE(-1027582882);
                if (auraCardContent.subtitleOnUrlClick == null) {
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = AuraContentKt$AuraContent$1$2$2$1$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    bRgA00 = AbstractC2022Awb.A00(bRgA00, (G0U) objAaT2);
                }
                BBI.A0R(bbi, false);
                ApQ apQ3 = auraCardContent.subtitle;
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                ApQ apQM3112rememberBoldToColorAnnotatedStringRPmYEkk = BoldToColorAnnotatedStringTransformationKt.m3112rememberBoldToColorAnnotatedStringRPmYEkk(apQ3, C06G.A0L(bfm, akh), bfm, 0);
                G0U<String, Unit> g0u2 = auraCardContent.subtitleOnUrlClick;
                if (z) {
                    j2 = AnonymousClass006.A0i(bfm, akh, -1027568507).error;
                } else {
                    bfm.AgE(-1789820341);
                    B6A b6a2 = auraCardContent.subtitleColor;
                    if (b6a2 == null) {
                        j2 = AnonymousClass006.A0i(bfm, akh, -1027566163).secondaryText;
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-1027567465);
                        BBI.A0R(bbi, false);
                        j2 = b6a2.A00;
                    }
                }
                BBI.A0R(bbi, false);
                long jM2544applyContentAlphaek8zF_U = ColorExtKt.m2544applyContentAlphaek8zF_U(j2, bfm, 0);
                AuraIconAndBodyStyle auraIconAndBodyStyle2 = auraCardContent.subtitleStyle;
                if (auraIconAndBodyStyle2 == null) {
                    auraIconAndBodyStyle2 = auraIconAndBodyStyle;
                }
                AuraIconAndBodyKt.m3098AuraIconAndBodyJMRm4Jw(apQM3112rememberBoldToColorAnnotatedStringRPmYEkk, auraIconAndBodyStyle2, bRgA00, g0u2, jM2544applyContentAlphaek8zF_U, null, auraCardContent.textAlign, auraCardContent.subtitleMaxLines, 0, 0, null, bfm, 0, 0, 1824);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
            if (g0w2 == null) {
                bfm.AgE(-2045179777);
            } else {
                bfm.AgE(-897257534);
                AnonymousClass001.A1G(c90l, bfm, g0w2, ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, auraCardContent, z, z5, z6, z7, g0w2, i, i2);
        }
    }

    public static final String contentDescription(CharSequence charSequence) {
        if (charSequence != null) {
            return AnonymousClass007.A0a(", ", charSequence);
        }
        return "";
    }
}
