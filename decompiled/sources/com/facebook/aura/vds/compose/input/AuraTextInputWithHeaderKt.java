package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.AuJ;
import X.BFM;
import X.BRg;
import X.C1805ArO;
import X.C1822Arm;
import X.C19h;
import X.C1DM;
import X.C2257BGr;
import X.G0U;
import X.G0V;
import X.Hw8;
import X.InterfaceC1072AWd;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraTextInputWithHeaderKt {

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt$AuraTextInputWithHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ Hw8 $contentType;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ String $header;
        public final /* synthetic */ AuraTextInputHeaderStyle $headerStyle;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
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
        public AnonymousClass3(C1805ArO c1805ArO, BRg bRg, String str, AuraTextInputHeaderStyle auraTextInputHeaderStyle, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, AuJ auJ, C2257BGr c2257BGr, Hw8 hw8, C19h c19h, C1822Arm c1822Arm, boolean z, int i, G0V<? super BFM, ? super Integer, Unit> g0v3, G0V<? super BFM, ? super Integer, Unit> g0v4, AuraColorsTextInput auraColorsTextInput, InterfaceC1072AWd interfaceC1072AWd, boolean z2, boolean z3, boolean z4, C1DM c1dm, G0U<? super C1805ArO, Unit> g0u, int i2, int i3, int i4, int i5) {
            super(2);
            this.$value = c1805ArO;
            this.$modifier = bRg;
            this.$header = str;
            this.$headerStyle = auraTextInputHeaderStyle;
            this.$footer = g0v;
            this.$placeholder = g0v2;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$contentType = hw8;
            this.$visualTransformation = c19h;
            this.$textStyle = c1822Arm;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$leadingIcon = g0v3;
            this.$trailingIcon = g0v4;
            this.$colors = auraColorsTextInput;
            this.$interactionSource = interfaceC1072AWd;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$isError = z4;
            this.$shape = c1dm;
            this.$onChange = g0u;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$changed2 = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputWithHeaderKt.AuraTextInputWithHeader(this.$value, this.$modifier, this.$header, this.$headerStyle, this.$footer, this.$placeholder, this.$keyboardOptions, this.$keyboardActions, this.$contentType, this.$visualTransformation, this.$textStyle, this.$singleLine, this.$maxLines, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$interactionSource, this.$enabled, this.$readOnly, this.$isError, this.$shape, this.$onChange, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt$AuraTextInputWithHeader$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColorsTextInput $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ String $header;
        public final /* synthetic */ AuraTextInputHeaderStyle $headerStyle;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ C2257BGr $keyboardActions;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
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
        public AnonymousClass6(String str, BRg bRg, String str2, AuraTextInputHeaderStyle auraTextInputHeaderStyle, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, AuJ auJ, C2257BGr c2257BGr, C19h c19h, C1822Arm c1822Arm, boolean z, int i, G0V<? super BFM, ? super Integer, Unit> g0v3, G0V<? super BFM, ? super Integer, Unit> g0v4, AuraColorsTextInput auraColorsTextInput, InterfaceC1072AWd interfaceC1072AWd, boolean z2, boolean z3, boolean z4, C1DM c1dm, G0U<? super String, Unit> g0u, int i2, int i3, int i4, int i5) {
            super(2);
            this.$value = str;
            this.$modifier = bRg;
            this.$header = str2;
            this.$headerStyle = auraTextInputHeaderStyle;
            this.$footer = g0v;
            this.$placeholder = g0v2;
            this.$keyboardOptions = auJ;
            this.$keyboardActions = c2257BGr;
            this.$visualTransformation = c19h;
            this.$textStyle = c1822Arm;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$leadingIcon = g0v3;
            this.$trailingIcon = g0v4;
            this.$colors = auraColorsTextInput;
            this.$interactionSource = interfaceC1072AWd;
            this.$enabled = z2;
            this.$readOnly = z3;
            this.$isError = z4;
            this.$shape = c1dm;
            this.$onChange = g0u;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$changed2 = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputWithHeaderKt.AuraTextInputWithHeader(this.$value, this.$modifier, this.$header, this.$headerStyle, this.$footer, this.$placeholder, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$textStyle, this.$singleLine, this.$maxLines, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$interactionSource, this.$enabled, this.$readOnly, this.$isError, this.$shape, this.$onChange, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTextInputWithHeader(X.C1805ArO r56, X.BRg r57, java.lang.String r58, com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle r59, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r60, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, X.AuJ r62, X.C2257BGr r63, X.Hw8 r64, X.C19h r65, X.C1822Arm r66, boolean r67, int r68, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r69, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r70, com.facebook.aura.vds.compose.theme.AuraColorsTextInput r71, X.InterfaceC1072AWd r72, boolean r73, boolean r74, boolean r75, X.C1DM r76, X.G0U<? super X.C1805ArO, kotlin.Unit> r77, X.BFM r78, int r79, int r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt.AuraTextInputWithHeader(X.ArO, X.BRg, java.lang.String, com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle, X.G0V, X.G0V, X.AuJ, X.BGr, X.Hw8, X.19h, X.Arm, boolean, int, X.G0V, X.G0V, com.facebook.aura.vds.compose.theme.AuraColorsTextInput, X.AWd, boolean, boolean, boolean, X.1DM, X.G0U, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTextInputWithHeader(java.lang.String r56, X.BRg r57, java.lang.String r58, com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle r59, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r60, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, X.AuJ r62, X.C2257BGr r63, X.C19h r64, X.C1822Arm r65, boolean r66, int r67, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r69, com.facebook.aura.vds.compose.theme.AuraColorsTextInput r70, X.InterfaceC1072AWd r71, boolean r72, boolean r73, boolean r74, X.C1DM r75, X.G0U<? super java.lang.String, kotlin.Unit> r76, X.BFM r77, int r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt.AuraTextInputWithHeader(java.lang.String, X.BRg, java.lang.String, com.facebook.aura.vds.compose.input.AuraTextInputHeaderStyle, X.G0V, X.G0V, X.AuJ, X.BGr, X.19h, X.Arm, boolean, int, X.G0V, X.G0V, com.facebook.aura.vds.compose.theme.AuraColorsTextInput, X.AWd, boolean, boolean, boolean, X.1DM, X.G0U, X.BFM, int, int, int, int):void");
    }
}
