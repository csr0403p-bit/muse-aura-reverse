package com.facebook.aura.conversation.view;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.model.OptionWidgetButtonStyle;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchOptionWidgetKt {
    public static final float OptionWidgetCornerRadius = 8.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchOptionWidgetKt$HatchOptionButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
        public final /* synthetic */ AVy $checkmark;
        public final /* synthetic */ AuraColors $filledColors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AVy aVy, AuraColors auraColors) {
            super(3);
            this.$checkmark = aVy;
            this.$filledColors = auraColors;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
            invoke(iconContext, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(IconContext iconContext, BFM bfm, int i) {
            if (AnonymousClass002.A0B(iconContext, i) == 0) {
                i |= AnonymousClass004.A0d(bfm, iconContext);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                AuraButtonDefaults.INSTANCE.m2407LeadingIconxqIIw2o(iconContext, this.$checkmark, null, new B6A(this.$filledColors.primaryText), bfm, (i & 14) | RuntimeInternals.IOPRIO_BACKGROUND | (AVy.$stable << 3), 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchOptionWidgetKt$HatchOptionButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z) {
            super(2);
            this.$selected = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            BBI bbi;
            boolean z;
            C1822Arm c1822Arm;
            bfm.AgE(-1916121661);
            if (this.$selected) {
                c1822Arm = AnonymousClass006.A0k(bfm, 1148055288).subheadlineEmphasized;
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1230001818);
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
                c1822Arm = null;
            }
            BBI.A0R(bbi, z);
            return c1822Arm;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchOptionWidgetKt$HatchOptionButton$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OptionWidgetButtonStyle $buttonStyle;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isPlaceholder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $option;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, boolean z, boolean z2, OptionWidgetButtonStyle optionWidgetButtonStyle, Function0<Unit> function0, BRg bRg, boolean z3, int i, int i2) {
            super(2);
            this.$option = str;
            this.$selected = z;
            this.$enabled = z2;
            this.$buttonStyle = optionWidgetButtonStyle;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$isPlaceholder = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchOptionWidgetKt.HatchOptionButton(this.$option, this.$selected, this.$enabled, this.$buttonStyle, this.$onClick, this.$modifier, this.$isPlaceholder, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchOptionWidgetKt$HatchOptionButton$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OptionWidgetButtonStyle $buttonStyle;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isPlaceholder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $option;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, boolean z, boolean z2, OptionWidgetButtonStyle optionWidgetButtonStyle, Function0<Unit> function0, BRg bRg, boolean z3, int i, int i2) {
            super(2);
            this.$option = str;
            this.$selected = z;
            this.$enabled = z2;
            this.$buttonStyle = optionWidgetButtonStyle;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$isPlaceholder = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchOptionWidgetKt.HatchOptionButton(this.$option, this.$selected, this.$enabled, this.$buttonStyle, this.$onClick, this.$modifier, this.$isPlaceholder, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchOptionWidgetKt$HatchOptionWidget$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OptionWidgetButtonStyle $buttonStyle;
        public final /* synthetic */ String $customInputPlaceholder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCustomInputClick;
        public final /* synthetic */ G0V<Integer, String, Unit> $onSelectOption;
        public final /* synthetic */ List<String> $options;
        public final /* synthetic */ String $selectedText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<String> list, String str, OptionWidgetButtonStyle optionWidgetButtonStyle, BRg bRg, String str2, G0V<? super Integer, ? super String, Unit> g0v, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$options = list;
            this.$selectedText = str;
            this.$buttonStyle = optionWidgetButtonStyle;
            this.$modifier = bRg;
            this.$customInputPlaceholder = str2;
            this.$onSelectOption = g0v;
            this.$onCustomInputClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchOptionWidgetKt.HatchOptionWidget(this.$options, this.$selectedText, this.$buttonStyle, this.$modifier, this.$customInputPlaceholder, this.$onSelectOption, this.$onCustomInputClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchOptionButton(java.lang.String r47, boolean r48, boolean r49, com.facebook.aura.model.OptionWidgetButtonStyle r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BRg r52, boolean r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchOptionWidgetKt.HatchOptionButton(java.lang.String, boolean, boolean, com.facebook.aura.model.OptionWidgetButtonStyle, kotlin.jvm.functions.Function0, X.BRg, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[PHI: r17
  0x009d: PHI (r17v1 boolean) = (r17v0 boolean), (r17v3 boolean) binds: [B:39:0x0091, B:41:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchOptionWidget(java.util.List<java.lang.String> r33, java.lang.String r34, com.facebook.aura.model.OptionWidgetButtonStyle r35, X.BRg r36, java.lang.String r37, X.G0V<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchOptionWidgetKt.HatchOptionWidget(java.util.List, java.lang.String, com.facebook.aura.model.OptionWidgetButtonStyle, X.BRg, java.lang.String, X.G0V, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void logOptionChipClick(HatchScreen hatchScreen, Map<String, String> map, int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.OPTION_CHIP, null, AnonymousClass006.A11(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), map), null);
    }
}
