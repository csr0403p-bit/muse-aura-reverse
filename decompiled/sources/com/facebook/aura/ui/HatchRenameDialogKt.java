package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC7559F3s;
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
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0Hi;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchRenameDialogKt {

    /* renamed from: com.facebook.aura.ui.HatchRenameDialogKt$HatchRenameDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $textField;

        /* renamed from: com.facebook.aura.ui.HatchRenameDialogKt$HatchRenameDialog$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04091 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $placeholder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04091(String str) {
                super(2);
                this.$placeholder = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AnonymousClass006.A17(bfm, this.$placeholder, C06G.A08(bfm));
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, String str, boolean z, int i, G0U<? super String, Unit> g0u, String str2) {
            super(2);
            this.$textField = g0v;
            this.$currentName = str;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$onNameChange = g0u;
            this.$placeholder = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$textField != null) {
                    bfm.AgE(-927721070);
                    AnonymousClass001.A1H(bfm, this.$textField, 0);
                } else {
                    bfm.AgE(-927657954);
                    AuraTextInputKt.AuraTextInput(this.$currentName, null, AnonymousClass003.A0U(C10G.A02), B1V.A00(bfm, new C04091(this.$placeholder), 967941343), null, null, null, null, this.$singleLine, this.$maxLines, 0, null, null, null, null, false, false, false, false, null, this.$onNameChange, bfm, 3456, 0, 0, 1047794);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchRenameDialogKt$HatchRenameDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ boolean $clearFocusOnConfirm;
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ String $saveText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, String str2, String str3, boolean z, Function0<Unit> function02) {
            super(2);
            this.$cancelText = str;
            this.$onCancel = function0;
            this.$currentName = str2;
            this.$saveText = str3;
            this.$clearFocusOnConfirm = z;
            this.$onConfirm = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
                BS0 bs0 = BRg.A00;
                BRg bRgA09 = C3U4.A09(C10G.A02, 16.0f);
                C9m9 c9m9A00 = AcQ.A00(12.0f);
                String str = this.$cancelText;
                Function0<Unit> function0 = this.$onCancel;
                String str2 = this.$currentName;
                String str3 = this.$saveText;
                boolean z = this.$clearFocusOnConfirm;
                Function0<Unit> function02 = this.$onConfirm;
                InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(c9m9A00, bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0Q, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                boolean z2 = false;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, c90m.AiP(bs0, 1.0f, true), auraButtonStyles.secondary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201317);
                AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                if (AnonymousClass002.A0l(str2).length() > 0) {
                    z2 = true;
                }
                boolean zA1O = AnonymousClass003.A1O(bfm, c0HiA0Z, function02, bfm.A66(z));
                Object objAaT = bfm.AaT();
                if (zA1O || objAaT == C78N.A00) {
                    objAaT = new HatchRenameDialogKt$HatchRenameDialog$2$1$1$1(z, c0HiA0Z, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str3, null, bRgAiP, auraLabelButtonStylePrimaryAlt, null, null, false, false, z2, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134200805);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchRenameDialogKt$HatchRenameDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ boolean $clearFocusOnConfirm;
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ String $saveText;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $textField;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, String str3, String str4, String str5, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, int i, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z2, Function0<Unit> function03, int i2, int i3, int i4) {
            super(2);
            this.$currentName = str;
            this.$title = str2;
            this.$placeholder = str3;
            this.$saveText = str4;
            this.$cancelText = str5;
            this.$onNameChange = g0u;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$singleLine = z;
            this.$maxLines = i;
            this.$textField = g0v;
            this.$clearFocusOnConfirm = z2;
            this.$onCancel = function03;
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
            HatchRenameDialogKt.HatchRenameDialog(this.$currentName, this.$title, this.$placeholder, this.$saveText, this.$cancelText, this.$onNameChange, this.$onConfirm, this.$onDismiss, this.$modifier, this.$singleLine, this.$maxLines, this.$textField, this.$clearFocusOnConfirm, this.$onCancel, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchRenameDialog(java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BRg r52, boolean r53, int r54, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, X.BFM r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchRenameDialogKt.HatchRenameDialog(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, int, X.G0V, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }
}
