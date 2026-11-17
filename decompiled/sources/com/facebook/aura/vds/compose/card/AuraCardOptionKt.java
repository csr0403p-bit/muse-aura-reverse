package com.facebook.aura.vds.compose.card;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC1564Ale;
import X.AbstractC2022Awb;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.controls.AuraCheckboxKt;
import com.facebook.aura.vds.compose.controls.AuraRadioKt;
import com.facebook.aura.vds.compose.controls.AuraSwitchKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.icons.AuraIconToggleButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconToggleButtonSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class AuraCardOptionKt {

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ AuraCardStyle $style;
        public final /* synthetic */ AuraCardType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AuraCardType auraCardType, boolean z, AuraCardStyle auraCardStyle, Function0<Unit> function0) {
            super(2);
            this.$modifier = bRg;
            this.$type = auraCardType;
            this.$enabled = z;
            this.$style = auraCardStyle;
            this.$onClick = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r37, int r38) {
            /*
                r36 = this;
                r1 = r38
                r0 = r38 & 3
                r4 = 1
                r14 = 0
                boolean r0 = X.AnonymousClass003.A16(r0)
                r2 = r37
                boolean r0 = X.AnonymousClass001.A1b(r0, r2, r1)
                if (r0 == 0) goto Lcc
                r1 = r36
                X.BRg r3 = r1.$modifier
                java.lang.Object r0 = r2.AaT()
                java.lang.Object r6 = X.C78N.A00
                if (r0 != r6) goto L23
                com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$1$1$1 r0 = com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$1$1$1.INSTANCE
                r2.Ai0(r0)
            L23:
                X.G0U r0 = (X.G0U) r0
                X.BRg r10 = X.AbstractC2022Awb.A00(r3, r0)
                com.facebook.aura.vds.compose.card.AuraCardType r3 = r1.$type
                com.facebook.aura.vds.compose.card.AuraCardType$Button r3 = (com.facebook.aura.vds.compose.card.AuraCardType.Button) r3
                boolean r0 = r3.enabled
                if (r0 == 0) goto L37
                boolean r0 = r1.$enabled
                r16 = 1
                if (r0 != 0) goto L39
            L37:
                r16 = 0
            L39:
                com.facebook.aura.vds.compose.button.AuraButtonSize r12 = com.facebook.aura.vds.compose.button.AuraButtonSize.SMALL
                com.facebook.aura.vds.compose.button.AuraButtonStyle r3 = r3.buttonStyle
                r7 = 0
                if (r3 != 0) goto Lb3
                r0 = -1252248762(0xffffffffb55c3346, float:-8.2031E-7)
                X.BBI r3 = X.AnonymousClass002.A0M(r2, r0)
            L47:
                r0 = 375247487(0x165dd27f, float:1.7918659E-25)
                r2.AgE(r0)
                com.facebook.aura.vds.compose.card.AuraCardStyle r0 = r1.$style
                com.facebook.aura.vds.compose.button.AuraLabelButtonStyle r11 = r0.buttonStyle(r2, r14)
            L53:
                X.BBI.A0R(r3, r14)
                com.facebook.aura.vds.compose.card.AuraCardType r0 = r1.$type
                com.facebook.aura.vds.compose.card.AuraCardType$Button r0 = (com.facebook.aura.vds.compose.card.AuraCardType.Button) r0
                java.lang.String r8 = r0.buttonText
                com.facebook.aura.vds.compose.button.AuraButtonAccessibility r4 = new com.facebook.aura.vds.compose.button.AuraButtonAccessibility
                r4.<init>(r14, r7)
                boolean r3 = r0.loading
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.$onClick
                boolean r5 = r2.A65(r0)
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.$onClick
                java.lang.Object r1 = r2.AaT()
                if (r5 != 0) goto L73
                if (r1 != r6) goto L7b
            L73:
                com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$1$2$1 r1 = new com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$1$2$1
                r1.<init>(r0)
                r2.Ai0(r1)
            L7b:
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                int r0 = com.facebook.aura.vds.compose.button.AuraButtonAccessibility.$stable
                int r37 = r0 << 6
                r38 = 130005445(0x7bfb9c5, float:2.8847671E-34)
                r35 = 196608(0x30000, float:2.75506E-40)
                r9 = r7
                r13 = r7
                r15 = r14
                r18 = r14
                r19 = r7
                r20 = r7
                r21 = r1
                r22 = r7
                r23 = r7
                r24 = r7
                r25 = r7
                r26 = r7
                r27 = r7
                r28 = r7
                r29 = r4
                r30 = r14
                r31 = r14
                r32 = r14
                r33 = r14
                r34 = r2
                r36 = r14
                r17 = r3
                com.facebook.aura.vds.compose.button.AuraButtonKt.m2408AuraButtonnL3aKkM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                return
            Lb3:
                r0 = 375246875(0x165dd01b, float:1.7917904E-25)
                r2.AgE(r0)
                com.facebook.aura.vds.compose.button.AuraLabelButtonStyle r11 = com.facebook.aura.vds.compose.button.AuraButtonKt.toStyle(r3, r7, r2, r14, r4)
                r3 = r2
                X.BBI r3 = (X.BBI) r3
                X.BBI.A0R(r3, r14)
                if (r11 == 0) goto L47
                r0 = 375246340(0x165dce04, float:1.7917245E-25)
                r2.AgE(r0)
                goto L53
            Lcc:
                r2.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.card.AuraCardOptionKt.AnonymousClass1.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$AuraCardOption$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<Boolean, Unit> $onChange;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ AuraCardStyle $style;
        public final /* synthetic */ AuraCardType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(AuraCardStyle auraCardStyle, AuraCardType auraCardType, Function0<Unit> function0, Boolean bool, G0U<? super Boolean, Unit> g0u, boolean z, int i, int i2) {
            super(2);
            this.$style = auraCardStyle;
            this.$type = auraCardType;
            this.$onClick = function0;
            this.$checked = bool;
            this.$onChange = g0u;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            AuraCardOptionKt.AuraCardOption(this.$style, this.$type, this.$onClick, this.$checked, this.$onChange, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$ModeInverter$1, reason: invalid class name and case insensitive filesystem */
    public final class C142751 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142751(boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$enabled = z;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraCardOptionKt.ModeInverter(this.$enabled, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$getSemantics$1, reason: invalid class name and case insensitive filesystem */
    public final class C142761 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public final /* synthetic */ AuraCardType $type;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
            AbstractC1564Ale.A07(interfaceC0857A6e, AnonymousClass005.A0X(((AuraCardType.Button) this.$type).buttonText));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142761(AuraCardType auraCardType) {
            super(1);
            this.$type = auraCardType;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            invoke2(interfaceC0857A6e);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$getSemantics$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public final /* synthetic */ AuraCardType $type;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
            AbstractC1564Ale.A08(interfaceC0857A6e, ((AuraCardType.IconButton) this.$type).contentDescription);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraCardType auraCardType) {
            super(1);
            this.$type = auraCardType;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            invoke2(interfaceC0857A6e);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$getSemantics$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public final /* synthetic */ AuraCardType $type;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
            String str = ((AuraCardType.ChevronNavigation) this.$type).contentDescription;
            if (str != null) {
                AbstractC1564Ale.A08(interfaceC0857A6e, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraCardType auraCardType) {
            super(1);
            this.$type = auraCardType;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            invoke2(interfaceC0857A6e);
            return Unit.INSTANCE;
        }
    }

    public static final G0U<InterfaceC0857A6e, Unit> getSemantics(AuraCardType auraCardType) {
        G0U<InterfaceC0857A6e, Unit> anonymousClass3;
        C7384Etj.A0Y(auraCardType, 0);
        if (auraCardType instanceof AuraCardType.Button) {
            anonymousClass3 = new C142761(auraCardType);
        } else if (auraCardType instanceof AuraCardType.IconButton) {
            anonymousClass3 = new AnonymousClass2(auraCardType);
        } else {
            if (!(auraCardType instanceof AuraCardType.ChevronNavigation)) {
                return AnonymousClass4.INSTANCE;
            }
            anonymousClass3 = new AnonymousClass3(auraCardType);
        }
        return anonymousClass3;
    }

    public static final void AuraCardOption(AuraCardStyle auraCardStyle, AuraCardType auraCardType, Function0<Unit> function0, Boolean bool, G0U<? super Boolean, Unit> g0u, boolean z, BFM bfm, int i, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        boolean z2;
        Boolean bool2 = bool;
        boolean zA1a = AnonymousClass002.A1a(auraCardStyle, auraCardType);
        bfm.AgG(-1249459865);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraCardStyle) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraCardType, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bool2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bool2 = null;
            }
            BRg bRgA00 = ARD.A00(BRg.A00, getSemantics(auraCardType));
            if ((auraCardType instanceof AuraCardType.None) || auraCardType.equals(AuraCardType.Clickable.INSTANCE) || (auraCardType instanceof AuraCardType.TextInput)) {
                bfm.AgE(1823074393);
            } else if (auraCardType instanceof AuraCardType.Button) {
                bfm.AgE(1823124055);
                ModeInverter(auraCardStyle.buttonModeInverted(), B1V.A00(bfm, new AnonymousClass1(bRgA00, auraCardType, z, auraCardStyle, function0), 1435025746), bfm, 48);
            } else if (auraCardType instanceof AuraCardType.ChevronNavigation) {
                bfm.AgE(1823711660);
                AuraIconKt.m2567AuraIconFHprtrg(bRgA00, AbstractC8407FdO.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24), AuraIconSize.TINY, ((AuraCardType.ChevronNavigation) auraCardType).contentDescription, ColorExtKt.m2544applyContentAlphaek8zF_U(C06G.A09(bfm), bfm, 0), null, bfm, AnonymousClass001.A03(), 32);
            } else if (auraCardType instanceof AuraCardType.ExternalNavigation) {
                bfm.AgE(1824124797);
                AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.arrow_diagonal_right_up_20);
                AuraIconSize auraIconSize = AuraIconSize.TINY;
                long jM2544applyContentAlphaek8zF_U = z ? ColorExtKt.m2544applyContentAlphaek8zF_U(AnonymousClass003.A0c(bfm, 1824318888).tertiaryText, bfm, 0) : AnonymousClass003.A0c(bfm, 1824406866).secondaryIcon.disabled;
                AnonymousClass001.A1D(bfm);
                AuraIconKt.m2567AuraIconFHprtrg(bRgA00, aVyA00, auraIconSize, null, jM2544applyContentAlphaek8zF_U, null, bfm, AnonymousClass001.A03(), 40);
            } else if (auraCardType instanceof AuraCardType.Toggle) {
                Object objA0p = AnonymousClass001.A0p(bfm, 1824530060);
                Object obj = C78N.A00;
                if (objA0p == obj) {
                    objA0p = AuraCardOptionKt$AuraCardOption$2$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                BRg bRgA002 = AbstractC2022Awb.A00(bRgA00, (G0U) objA0p);
                boolean zA1b = AnonymousClass002.A1b(bool2, zA1a);
                z2 = (57344 & iA0d) == 16384;
                Object objAaT = bfm.AaT();
                if (z2 || objAaT == obj) {
                    objAaT = new AuraCardOptionKt$AuraCardOption$3$1(g0u);
                    bfm.Ai0(objAaT);
                }
                AuraSwitchKt.AuraSwitch(bRgA002, z, zA1b, (G0U) objAaT, null, null, null, bfm, (iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            } else if (auraCardType instanceof AuraCardType.Radio) {
                Object objA0p2 = AnonymousClass001.A0p(bfm, 1824796815);
                Object obj2 = C78N.A00;
                if (objA0p2 == obj2) {
                    objA0p2 = AuraCardOptionKt$AuraCardOption$4$1.INSTANCE;
                    bfm.Ai0(objA0p2);
                }
                BRg bRgA003 = AbstractC2022Awb.A00(bRgA00, (G0U) objA0p2);
                boolean zA1b2 = AnonymousClass002.A1b(bool2, zA1a);
                z2 = (57344 & iA0d) == 16384;
                Object objAaT2 = bfm.AaT();
                if (z2 || objAaT2 == obj2) {
                    objAaT2 = new AuraCardOptionKt$AuraCardOption$5$1(g0u);
                    bfm.Ai0(objAaT2);
                }
                AuraRadioKt.m2530AuraRadioV9fs2A(bRgA003, z, zA1b2, (G0U) objAaT2, null, 0L, bfm, (iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48);
            } else if (auraCardType instanceof AuraCardType.Checkbox) {
                bfm.AgE(1825072033);
                boolean zA1b3 = AnonymousClass002.A1b(bool2, zA1a);
                B6A b6a = ((AuraCardType.Checkbox) auraCardType).checkedTint;
                z2 = (57344 & iA0d) == 16384;
                Object objAaT3 = bfm.AaT();
                if (z2 || objAaT3 == C78N.A00) {
                    objAaT3 = new AuraCardOptionKt$AuraCardOption$6$1(g0u);
                    bfm.Ai0(objAaT3);
                }
                AuraCheckboxKt.m2528AuraCheckboxO7ixnI(bRgA00, z, zA1b3, AuraRadioKt.withSelectionHaptic((G0U) objAaT3, bfm, 0), null, 0L, b6a, bfm, (iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48);
            } else if (auraCardType instanceof AuraCardType.IconButton) {
                bfm.AgE(1825371710);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.MEDIUM;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                AuraCardType.IconButton iconButton = (AuraCardType.IconButton) auraCardType;
                AVy aVy = iconButton.painter;
                String str = iconButton.contentDescription;
                z2 = (iA0d & 896) == 256;
                Object objAaT4 = bfm.AaT();
                if (z2 || objAaT4 == C78N.A00) {
                    objAaT4 = new AuraCardOptionKt$AuraCardOption$7$1(function0);
                    bfm.Ai0(objAaT4);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA00, aVy, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, str, (Function0) objAaT4, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16160);
            } else if (auraCardType instanceof AuraCardType.IconToggleButton) {
                bfm.AgE(1825770401);
                AuraIconToggleButtonSize auraIconToggleButtonSize = AuraIconToggleButtonSize.MEDIUM;
                AVy aVy2 = ((AuraCardType.IconToggleButton) auraCardType).painter;
                boolean zA1b4 = AnonymousClass002.A1b(bool2, zA1a);
                z2 = (57344 & iA0d) == 16384;
                Object objAaT5 = bfm.AaT();
                if (z2 || objAaT5 == C78N.A00) {
                    objAaT5 = new AuraCardOptionKt$AuraCardOption$8$1(g0u);
                    bfm.Ai0(objAaT5);
                }
                AuraIconToggleButtonKt.AuraIconToggleButton(bRgA00, zA1b4, null, null, null, (G0U) objAaT5, aVy2, auraIconToggleButtonSize, z, null, bfm, AnonymousClass001.A09(iA0d << 9, (AVy.$stable << 18) | 12582912), 540);
            } else {
                if (!(auraCardType instanceof AuraCardType.Image)) {
                    throw AnonymousClass005.A0k(bfm, 1859924256);
                }
                bfm.AgE(1826082974);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA00);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                AuraCardType.Image image = (AuraCardType.Image) auraCardType;
                AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(image.source, image.contentDescription, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 12);
                BBI.A0R(bbi, zA1a);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass10(auraCardStyle, auraCardType, function0, bool2, g0u, z, i, i2);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardOptionKt$getSemantics$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        }
    }

    public static final void ModeInverter(boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-1180015918);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            bfm.AgE(-123927026);
            AuraThemeMode auraThemeMode = !z ? AuraThemeMode.DEFAULT : AnonymousClass002.A0c(bfm).isLight ? AuraThemeMode.DARK : AuraThemeMode.LIGHT;
            AnonymousClass002.A19(bfm);
            AnonymousClass002.A0x(bfm, auraThemeMode, g0v, (iA0n << 3) & 896);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142751(z, g0v, i);
        }
    }
}
