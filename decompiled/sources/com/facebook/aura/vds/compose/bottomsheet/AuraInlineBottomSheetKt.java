package com.facebook.aura.vds.compose.bottomsheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BA3;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C1110AYw;
import X.C1DG;
import X.G0V;
import X.G0W;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraInlineBottomSheetKt {

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt$AuraInlineBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ AuraSheetState $sheetState;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraSheetState auraSheetState, AuraContainer.AuraBottomSheet auraBottomSheet, BRg bRg, C1110AYw c1110AYw, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, boolean z, AuraThemeMode auraThemeMode, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2) {
            super(3);
            this.$sheetState = auraSheetState;
            this.$type = auraBottomSheet;
            this.$modifier = bRg;
            this.$scrollState = c1110AYw;
            this.$header = auraBottomSheetHeaderConfig;
            this.$footer = g0v;
            this.$background = g0w;
            this.$onDismissRequest = function0;
            this.$fillHeight = z;
            this.$modeOverride = auraThemeMode;
            this.$content = g0w2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                AuraBottomSheetContentKt.AuraBottomSheetContent(this.$type, this.$modifier, this.$scrollState, this.$header, this.$footer, this.$background, this.$onDismissRequest, this.$sheetState.dismissible, false, this.$fillHeight, this.$modeOverride, this.$content, bfm, 0, 0, 256);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt$AuraInlineBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ boolean $hideScrim;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ boolean $preventKeyboardResize;
        public final /* synthetic */ BA3 $properties;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ AuraSheetState $sheetState;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraContainer.AuraBottomSheet auraBottomSheet, BRg bRg, Function0<Unit> function0, AuraSheetState auraSheetState, C1110AYw c1110AYw, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, BA3 ba3, AuraThemeMode auraThemeMode, boolean z, boolean z2, boolean z3, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, int i, int i2, int i3) {
            super(2);
            this.$type = auraBottomSheet;
            this.$modifier = bRg;
            this.$onDismissRequest = function0;
            this.$sheetState = auraSheetState;
            this.$scrollState = c1110AYw;
            this.$header = auraBottomSheetHeaderConfig;
            this.$footer = g0v;
            this.$background = g0w;
            this.$properties = ba3;
            this.$modeOverride = auraThemeMode;
            this.$hideScrim = z;
            this.$preventKeyboardResize = z2;
            this.$fillHeight = z3;
            this.$content = g0w2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(this.$type, this.$modifier, this.$onDismissRequest, this.$sheetState, this.$scrollState, this.$header, this.$footer, this.$background, this.$properties, this.$modeOverride, this.$hideScrim, this.$preventKeyboardResize, this.$fillHeight, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    @kotlin.Deprecated(message = "Use this only for extremely simple inline bottom sheets. For most bottom sheets, prefer to define them as standalone screens that are navigated to using the navigation framework and configured using [AuraBottomSheetContent].")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraInlineBottomSheet(com.facebook.aura.vds.compose.theme.AuraContainer.AuraBottomSheet r55, X.BRg r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState r58, X.C1110AYw r59, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig r60, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r61, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r62, X.BA3 r63, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r64, boolean r65, boolean r66, boolean r67, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, X.BFM r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt.AuraInlineBottomSheet(com.facebook.aura.vds.compose.theme.AuraContainer$AuraBottomSheet, X.BRg, kotlin.jvm.functions.Function0, com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState, X.AYw, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig, X.G0V, X.G0W, X.BA3, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, boolean, boolean, boolean, X.G0W, X.BFM, int, int, int):void");
    }
}
