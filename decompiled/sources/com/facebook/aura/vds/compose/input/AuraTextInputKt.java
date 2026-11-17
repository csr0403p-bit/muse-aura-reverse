package com.facebook.aura.vds.compose.input;

import X.AKH;
import X.ARD;
import X.AXZ;
import X.AbstractC1874Aso;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AuJ;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0Hi;
import X.C0dy;
import X.C10384HaO;
import X.C10G;
import X.C1326AhD;
import X.C1517AkR;
import X.C17j;
import X.C17n;
import X.C17s;
import X.C17y;
import X.C17z;
import X.C1805ArO;
import X.C1822Arm;
import X.C19Y;
import X.C19h;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1DM;
import X.C2257BGr;
import X.C2AA;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1072AWd;
import X.InterfaceC1829Art;
import android.view.KeyEvent;
import androidx.compose.material.TextFieldColors;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraContentColorKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraTextInputKt {
    public static final C1D3 InputShape = C1D8.A00(26.0f);
    public static final float BorderWidth = 1.0f;
    public static final BRg TextInputModifier = AnonymousClass001.A0U(C10G.A01(C2VU.A04, ARD.A01(BRg.A00, AuraTextInputKt$TextInputModifier$1.INSTANCE, false), false), 1.0f);

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$2$2, reason: invalid class name and collision with other inner class name */
        public final class C04262 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
            public final /* synthetic */ AuraColorsTextInput $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ InterfaceC1072AWd $interactionSource;
            public final /* synthetic */ boolean $isCompact;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ String $label;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
            public final /* synthetic */ C1DM $shape;
            public final /* synthetic */ boolean $singleLine;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
            public final /* synthetic */ String $value;
            public final /* synthetic */ C19h $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04262(String str, boolean z, boolean z2, C19h c19h, InterfaceC1072AWd interfaceC1072AWd, boolean z3, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, AuraColorsTextInput auraColorsTextInput, boolean z4, C1DM c1dm) {
                super(3);
                this.$value = str;
                this.$enabled = z;
                this.$singleLine = z2;
                this.$visualTransformation = c19h;
                this.$interactionSource = interfaceC1072AWd;
                this.$isError = z3;
                this.$label = str2;
                this.$placeholder = g0v;
                this.$leadingIcon = g0v2;
                this.$trailingIcon = g0v3;
                this.$colors = auraColorsTextInput;
                this.$isCompact = z4;
                this.$shape = c1dm;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
                invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
                int iA0T = i;
                C7384Etj.A0Y(g0v, 0);
                if ((i & 6) == 0) {
                    iA0T = i | AnonymousClass004.A0T(bfm, g0v);
                }
                if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                    AuraTextInputKt.TextInputDecorationBox(this.$value, g0v, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$isCompact, this.$shape, bfm, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, boolean z, InterfaceC1072AWd interfaceC1072AWd, AuraColorsTextInput auraColorsTextInput, C1DM c1dm, String str, G0U<? super String, Unit> g0u, boolean z2, boolean z3, C1822Arm c1822Arm, AuJ auJ, C2257BGr c2257BGr, boolean z4, int i, int i2, C19h c19h, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, boolean z5) {
            super(2);
            this.$modifier = bRg;
            this.$isError = z;
            this.$interactionSource = interfaceC1072AWd;
            this.$colors = auraColorsTextInput;
            this.$shape = c1dm;
            this.$value = str;
            this.$onChange = g0u;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$style = c1822Arm;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$singleLine = z4;
            this.$maxLines = i;
            this.$minLines = i2;
            this.$visualTransformation = c19h;
            this.$label = str2;
            this.$placeholder = g0v;
            this.$leadingIcon = g0v2;
            this.$trailingIcon = g0v3;
            this.$isCompact = z5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgThen = AnonymousClass001.A0R(this.$modifier).then(AuraTextInputKt.borderModifier(this.$isError, this.$interactionSource, this.$colors, this.$shape, bfm, 0)).then(AuraTextInputKt.TextInputModifier).then(AuraTextInputKt.escapeFocusModifier(AnonymousClass001.A0Z(bfm)));
                C1326AhD c1326AhD = new C1326AhD(this.$colors.cursorColor);
                String str = this.$value;
                boolean zA65 = bfm.A65(this.$onChange);
                G0U<String, Unit> g0u = this.$onChange;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraTextInputKt$AuraTextInput$2$1$1(g0u);
                    bfm.Ai0(objAaT);
                }
                boolean z = this.$enabled;
                boolean z2 = this.$readOnly;
                C1822Arm c1822Arm = this.$style;
                AuJ auJ = this.$keyboardOptions;
                C2257BGr c2257BGr = this.$keyboardActions;
                boolean z3 = this.$singleLine;
                int i2 = this.$maxLines;
                int i3 = this.$minLines;
                C19h c19h = this.$visualTransformation;
                InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
                AbstractC1874Aso.A03(interfaceC1072AWd, c2257BGr, auJ, bfm, bRgThen, c1326AhD, c1822Arm, c19h, str, (G0U) objAaT, null, B1V.A00(bfm, new C04262(this.$value, z, z3, c19h, interfaceC1072AWd, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$isCompact, this.$shape), -435008979), i2, i3, 0, 196608, 4096, z, z2, z3);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, AuJ auJ, C2257BGr c2257BGr, C19h c19h, C1822Arm c1822Arm, boolean z, int i, int i2, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, AuraColorsTextInput auraColorsTextInput, InterfaceC1072AWd interfaceC1072AWd, boolean z2, boolean z3, boolean z4, boolean z5, C1DM c1dm, G0U<? super String, Unit> g0u, int i3, int i4, int i5, int i6) {
            super(2);
            this.$value = str;
            this.$label = str2;
            this.$modifier = bRg;
            this.$placeholder = g0v;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$visualTransformation = c19h;
            this.$textStyle = c1822Arm;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$minLines = i2;
            this.$leadingIcon = g0v2;
            this.$trailingIcon = g0v3;
            this.$colors = auraColorsTextInput;
            this.$interactionSource = interfaceC1072AWd;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$isError = z4;
            this.$isCompact = z5;
            this.$shape = c1dm;
            this.$onChange = g0u;
            this.$$changed = i3;
            this.$$changed1 = i4;
            this.$$changed2 = i5;
            this.$$default = i6;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputKt.AuraTextInput(this.$value, this.$label, this.$modifier, this.$placeholder, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$textStyle, this.$singleLine, this.$maxLines, this.$minLines, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$interactionSource, this.$enabled, this.$readOnly, this.$isError, this.$isCompact, this.$shape, this.$onChange, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ C1805ArO $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$5$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
            public final /* synthetic */ AuraColorsTextInput $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ InterfaceC1072AWd $interactionSource;
            public final /* synthetic */ boolean $isCompact;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ String $label;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
            public final /* synthetic */ C1DM $shape;
            public final /* synthetic */ boolean $singleLine;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
            public final /* synthetic */ C1805ArO $value;
            public final /* synthetic */ C19h $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(C1805ArO c1805ArO, boolean z, boolean z2, C19h c19h, InterfaceC1072AWd interfaceC1072AWd, boolean z3, String str, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, AuraColorsTextInput auraColorsTextInput, boolean z4, C1DM c1dm) {
                super(3);
                this.$value = c1805ArO;
                this.$enabled = z;
                this.$singleLine = z2;
                this.$visualTransformation = c19h;
                this.$interactionSource = interfaceC1072AWd;
                this.$isError = z3;
                this.$label = str;
                this.$placeholder = g0v;
                this.$leadingIcon = g0v2;
                this.$trailingIcon = g0v3;
                this.$colors = auraColorsTextInput;
                this.$isCompact = z4;
                this.$shape = c1dm;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
                invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
                int iA0T = i;
                C7384Etj.A0Y(g0v, 0);
                if ((i & 6) == 0) {
                    iA0T = i | AnonymousClass004.A0T(bfm, g0v);
                }
                if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
                    AuraTextInputKt.TextInputDecorationBox(this.$value.A01.A00, g0v, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$isCompact, this.$shape, bfm, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(BRg bRg, boolean z, InterfaceC1072AWd interfaceC1072AWd, AuraColorsTextInput auraColorsTextInput, C1DM c1dm, C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, boolean z2, boolean z3, C1822Arm c1822Arm, AuJ auJ, C2257BGr c2257BGr, boolean z4, int i, C19h c19h, String str, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, boolean z5) {
            super(2);
            this.$modifier = bRg;
            this.$isError = z;
            this.$interactionSource = interfaceC1072AWd;
            this.$colors = auraColorsTextInput;
            this.$shape = c1dm;
            this.$value = c1805ArO;
            this.$onChange = g0u;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$style = c1822Arm;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$singleLine = z4;
            this.$maxLines = i;
            this.$visualTransformation = c19h;
            this.$label = str;
            this.$placeholder = g0v;
            this.$leadingIcon = g0v2;
            this.$trailingIcon = g0v3;
            this.$isCompact = z5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgThen = AnonymousClass001.A0R(this.$modifier).then(AuraTextInputKt.borderModifier(this.$isError, this.$interactionSource, this.$colors, this.$shape, bfm, 0)).then(AuraTextInputKt.TextInputModifier).then(AuraTextInputKt.escapeFocusModifier(AnonymousClass001.A0Z(bfm)));
                C1326AhD c1326AhD = new C1326AhD(this.$colors.cursorColor);
                C1805ArO c1805ArO = this.$value;
                boolean zA65 = bfm.A65(this.$onChange);
                G0U<C1805ArO, Unit> g0u = this.$onChange;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraTextInputKt$AuraTextInput$5$1$1(g0u);
                    bfm.Ai0(objAaT);
                }
                boolean z = this.$enabled;
                boolean z2 = this.$readOnly;
                C1822Arm c1822Arm = this.$style;
                AuJ auJ = this.$keyboardOptions;
                C2257BGr c2257BGr = this.$keyboardActions;
                boolean z3 = this.$singleLine;
                int i2 = this.$maxLines;
                C19h c19h = this.$visualTransformation;
                InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
                AbstractC1874Aso.A02(interfaceC1072AWd, c2257BGr, auJ, bfm, bRgThen, c1326AhD, c1822Arm, c1805ArO, c19h, (G0U) objAaT, null, B1V.A00(bfm, new AnonymousClass2(this.$value, z, z3, c19h, interfaceC1072AWd, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$isCompact, this.$shape), 373930717), i2, 1, 0, 196614, 4096, z, z2, z3);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$AuraTextInput$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C1805ArO, Unit> $onChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ C1805ArO $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(BRg bRg, C1805ArO c1805ArO, String str, G0V<? super BFM, ? super Integer, Unit> g0v, AuJ auJ, C2257BGr c2257BGr, C19h c19h, C1822Arm c1822Arm, boolean z, int i, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, AuraColorsTextInput auraColorsTextInput, InterfaceC1072AWd interfaceC1072AWd, boolean z2, boolean z3, boolean z4, boolean z5, C1DM c1dm, G0U<? super C1805ArO, Unit> g0u, int i2, int i3, int i4) {
            super(2);
            this.$modifier = bRg;
            this.$value = c1805ArO;
            this.$label = str;
            this.$placeholder = g0v;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$visualTransformation = c19h;
            this.$textStyle = c1822Arm;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$leadingIcon = g0v2;
            this.$trailingIcon = g0v3;
            this.$colors = auraColorsTextInput;
            this.$interactionSource = interfaceC1072AWd;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$isError = z4;
            this.$isCompact = z5;
            this.$shape = c1dm;
            this.$onChange = g0u;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputKt.AuraTextInput(this.$modifier, this.$value, this.$label, this.$placeholder, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$textStyle, this.$singleLine, this.$maxLines, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$interactionSource, this.$enabled, this.$readOnly, this.$isError, this.$isCompact, this.$shape, this.$onChange, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$Placeholder$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$placeholder = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$placeholder, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$Placeholder$2, reason: invalid class name and case insensitive filesystem */
    public final class C142922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142922(boolean z, AuraColorsTextInput auraColorsTextInput, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$enabled = z;
            this.$colors = auraColorsTextInput;
            this.$placeholder = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputKt.Placeholder(this.$enabled, this.$colors, this.$placeholder, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$TextInputDecorationBox$1, reason: invalid class name and case insensitive filesystem */
    public final class C142931 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142931(String str) {
            super(2);
            this.$label = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraTextInputDefaults.INSTANCE.LabelText(this.$label, bfm, 48);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$TextInputDecorationBox$2, reason: invalid class name and case insensitive filesystem */
    public final class C142942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;

        /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$TextInputDecorationBox$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
                super(2);
                this.$placeholder = g0v;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    AnonymousClass001.A1H(bfm, this.$placeholder, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142942(boolean z, AuraColorsTextInput auraColorsTextInput, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$enabled = z;
            this.$colors = auraColorsTextInput;
            this.$placeholder = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraTextInputKt.Placeholder(this.$enabled, this.$colors, B1V.A00(bfm, new AnonymousClass1(this.$placeholder), -1726420625), bfm, 384);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$TextInputDecorationBox$3, reason: invalid class name and case insensitive filesystem */
    public final class C142953 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $innerTextField;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142953(String str, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z, boolean z2, C19h c19h, InterfaceC1072AWd interfaceC1072AWd, boolean z3, String str2, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, G0V<? super BFM, ? super Integer, Unit> g0v4, AuraColorsTextInput auraColorsTextInput, boolean z4, C1DM c1dm, int i, int i2) {
            super(2);
            this.$value = str;
            this.$innerTextField = g0v;
            this.$enabled = z;
            this.$singleLine = z2;
            this.$visualTransformation = c19h;
            this.$interactionSource = interfaceC1072AWd;
            this.$isError = z3;
            this.$label = str2;
            this.$placeholder = g0v2;
            this.$leadingIcon = g0v3;
            this.$trailingIcon = g0v4;
            this.$colors = auraColorsTextInput;
            this.$isCompact = z4;
            this.$shape = c1dm;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputKt.TextInputDecorationBox(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$isCompact, this.$shape, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputKt$escapeFocusModifier$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class C142961 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
        public final /* synthetic */ C0Hi $focusManager;

        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m2590invokeZmokQxo(KeyEvent keyEvent) {
            C0Hi c0Hi;
            int i;
            C7384Etj.A0Y(keyEvent, 0);
            boolean z = false;
            if (AnonymousClass002.A1M((C8j4.A0N(keyEvent) > C10384HaO.A0c ? 1 : (C8j4.A0N(keyEvent) == C10384HaO.A0c ? 0 : -1)))) {
                if (keyEvent.isShiftPressed()) {
                    c0Hi = this.$focusManager;
                    i = 2;
                } else if (keyEvent.isCtrlPressed()) {
                    c0Hi = this.$focusManager;
                    i = 1;
                }
                ((C1517AkR) c0Hi).AQv(i, true);
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142961(C0Hi c0Hi) {
            super(1);
            this.$focusManager = c0Hi;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
            return m2590invokeZmokQxo(c2aa.A00);
        }
    }

    public static final BRg escapeFocusModifier(C0Hi c0Hi) {
        return AXZ.A00(BRg.A00, new C142961(c0Hi));
    }

    public static final C1D3 getInputShape() {
        return InputShape;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    public static final C1822Arm resolveTextInputStyle(C1822Arm c1822Arm, AuraColorsTextInput auraColorsTextInput, boolean z, BFM bfm, int i) {
        int iA1P;
        C1822Arm c1822Arm2 = c1822Arm;
        C7384Etj.A0Y(auraColorsTextInput, 1);
        if (c1822Arm == null) {
            bfm.AgE(-1662952914);
            c1822Arm2 = (C1822Arm) bfm.A6v(C17y.A00);
            iA1P = AnonymousClass001.A1V(bfm);
        } else {
            iA1P = AnonymousClass004.A1P(bfm, -1662953782);
        }
        InterfaceC1829Art interfaceC1829Art = c1822Arm2.A02.A0D;
        long jADn = interfaceC1829Art.ADn() == B6A.A07 ? auraColorsTextInput.textColor : interfaceC1829Art.ADn();
        if (!z) {
            jADn = HxS.A04(HDi.A0O[(int) (jADn & 63)], B6A.A03(jADn), B6A.A02(jADn), B6A.A01(jADn), 0.3f);
        }
        return C1822Arm.A00(null, c1822Arm2, null, null, null, null, null, null, null, null, iA1P, iA1P, iA1P, 16777214, jADn, 0L, 0L, 0L);
    }

    public static final TextFieldColors textFieldColors(AuraColorsTextInput auraColorsTextInput, BFM bfm, int i) {
        long jAdaptiveFill;
        long j = auraColorsTextInput.textColor;
        long j2 = auraColorsTextInput.cursorColor;
        long j3 = auraColorsTextInput.placeholderColor;
        long j4 = auraColorsTextInput.focusedBorderColor;
        long j5 = auraColorsTextInput.unfocusedBorderColor;
        long j6 = auraColorsTextInput.errorBorderColor;
        long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.3f);
        long jA042 = HxS.A04(HDi.A0O[(int) (j3 & 63)], B6A.A03(j3), B6A.A02(j3), B6A.A01(j3), 0.3f);
        long jA043 = HxS.A04(HDi.A0O[(int) (j5 & 63)], B6A.A03(j5), B6A.A02(j5), B6A.A01(j5), 0.3f);
        B6A b6a = auraColorsTextInput.backgroundColor;
        if (b6a == null) {
            jAdaptiveFill = AuraAdaptiveColorsKt.adaptiveFill(AnonymousClass003.A0c(bfm, -932714633), bfm, AuraColors.$stable);
            AnonymousClass002.A19(bfm);
        } else {
            AnonymousClass004.A1A(bfm, -932715966);
            jAdaptiveFill = b6a.A00;
        }
        AKH<C17s> akh = C17n.A00;
        long jA00 = C17s.A00(bfm, akh);
        long jA01 = C17s.A01(bfm, akh);
        long jA044 = HxS.A04(HDi.A0O[(int) (jA01 & 63)], B6A.A03(jA01), B6A.A02(jA01), B6A.A01(jA01), 0.54f);
        long jA045 = HxS.A04(HDi.A0O[(int) (jA044 & 63)], B6A.A03(jA044), B6A.A02(jA044), B6A.A01(jA044), C17j.A00(bfm, 0.38f, 0.38f));
        long jA012 = C17s.A01(bfm, akh);
        long jA046 = HxS.A04(HDi.A0O[(int) (jA012 & 63)], B6A.A03(jA012), B6A.A02(jA012), B6A.A01(jA012), 0.54f);
        long jA047 = HxS.A04(HDi.A0O[(int) (jA046 & 63)], B6A.A03(jA046), B6A.A02(jA046), B6A.A01(jA046), C17j.A00(bfm, 0.38f, 0.38f));
        long jA002 = C17s.A00(bfm, akh);
        long jA02 = C17s.A02(bfm, akh);
        long jA048 = HxS.A04(HDi.A0O[(int) (jA02 & 63)], B6A.A03(jA02), B6A.A02(jA02), B6A.A01(jA02), C17j.A00(bfm, 1.0f, 0.87f));
        long jA013 = C17s.A01(bfm, akh);
        long jA049 = HxS.A04(HDi.A0O[(int) (jA013 & 63)], B6A.A03(jA013), B6A.A02(jA013), B6A.A01(jA013), C17j.A00(bfm, 0.74f, 0.6f));
        return new C19Y(j, jA04, j2, jA00, j4, j5, j6, jA043, jA044, jA045, jA044, jA046, jA047, jA002, jAdaptiveFill, jA048, jA049, HxS.A04(HDi.A0O[(int) (jA049 & 63)], B6A.A03(jA049), B6A.A02(jA049), B6A.A01(jA049), C17j.A00(bfm, 0.38f, 0.38f)), C17s.A00(bfm, akh), j3, jA042);
    }

    public static final void Placeholder(boolean z, AuraColorsTextInput auraColorsTextInput, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-138769073);
        int iA0e = (i & 48) == 0 ? AnonymousClass004.A0e(bfm, auraColorsTextInput) | i : i;
        if ((i & 384) == 0) {
            iA0e |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0e & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0e)) {
            AuraContentColorKt.m2857ProvideAuraContentColorIv8Zu3U(auraColorsTextInput.placeholderColor, B1V.A00(bfm, new AnonymousClass1(g0v), -1395376787), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142922(z, auraColorsTextInput, g0v, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextInputDecorationBox(java.lang.String r33, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r34, boolean r35, boolean r36, X.C19h r37, X.InterfaceC1072AWd r38, boolean r39, java.lang.String r40, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r41, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r42, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r43, com.facebook.aura.vds.compose.theme.AuraColorsTextInput r44, boolean r45, X.C1DM r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputKt.TextInputDecorationBox(java.lang.String, X.G0V, boolean, boolean, X.19h, X.AWd, boolean, java.lang.String, X.G0V, X.G0V, X.G0V, com.facebook.aura.vds.compose.theme.AuraColorsTextInput, boolean, X.1DM, X.BFM, int, int):void");
    }

    public static final BRg borderModifier(boolean z, C0dy c0dy, AuraColorsTextInput auraColorsTextInput, C1DM c1dm, BFM bfm, int i) {
        BRg bRgA02;
        long j;
        bfm.AgE(-1226057025);
        C1BO<Boolean> c1boA00 = C17z.A00(c0dy, bfm, (i >> 3) & 14);
        if (z) {
            j = auraColorsTextInput.errorBorderColor;
        } else {
            if (!C1BO.A0F(c1boA00)) {
                bRgA02 = BRg.A00;
                AnonymousClass002.A19(bfm);
                return bRgA02;
            }
            j = auraColorsTextInput.focusedBorderColor;
        }
        bRgA02 = C1DI.A02(BRg.A00, c1dm, BorderWidth, j);
        AnonymousClass002.A19(bfm);
        return bRgA02;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTextInput(java.lang.String r61, java.lang.String r62, X.BRg r63, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r64, X.AuJ r65, X.C2257BGr r66, X.C19h r67, X.C1822Arm r68, boolean r69, int r70, int r71, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r72, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r73, com.facebook.aura.vds.compose.theme.AuraColorsTextInput r74, X.InterfaceC1072AWd r75, boolean r76, boolean r77, boolean r78, boolean r79, X.C1DM r80, X.G0U<? super java.lang.String, kotlin.Unit> r81, X.BFM r82, int r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputKt.AuraTextInput(java.lang.String, java.lang.String, X.BRg, X.G0V, X.AuJ, X.BGr, X.19h, X.Arm, boolean, int, int, X.G0V, X.G0V, com.facebook.aura.vds.compose.theme.AuraColorsTextInput, X.AWd, boolean, boolean, boolean, boolean, X.1DM, X.G0U, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTextInput(X.BRg r59, X.C1805ArO r60, java.lang.String r61, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r62, X.AuJ r63, X.C2257BGr r64, X.C19h r65, X.C1822Arm r66, boolean r67, int r68, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r69, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r70, com.facebook.aura.vds.compose.theme.AuraColorsTextInput r71, X.InterfaceC1072AWd r72, boolean r73, boolean r74, boolean r75, boolean r76, X.C1DM r77, X.G0U<? super X.C1805ArO, kotlin.Unit> r78, X.BFM r79, int r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputKt.AuraTextInput(X.BRg, X.ArO, java.lang.String, X.G0V, X.AuJ, X.BGr, X.19h, X.Arm, boolean, int, X.G0V, X.G0V, com.facebook.aura.vds.compose.theme.AuraColorsTextInput, X.AWd, boolean, boolean, boolean, boolean, X.1DM, X.G0U, X.BFM, int, int, int):void");
    }
}
