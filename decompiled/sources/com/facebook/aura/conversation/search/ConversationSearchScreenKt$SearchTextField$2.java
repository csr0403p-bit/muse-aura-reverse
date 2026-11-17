package com.facebook.aura.conversation.search;

import X.AKQ;
import X.ASZ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C1515AkP;
import X.C1518AkS;
import X.C1805ArO;
import X.C1822Arm;
import X.C1YD;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ String $clearContentDescription;
    public final /* synthetic */ InterfaceC1072AWd $clickInteractionSource;
    public final /* synthetic */ InterfaceC1072AWd $fieldInteractionSource;
    public final /* synthetic */ MutableState<C1805ArO> $fieldValue$delegate;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $isCompact;
    public final /* synthetic */ MutableState<Boolean> $isTextFieldPositioned$delegate;
    public final /* synthetic */ Integer $leadingIconRes;
    public final /* synthetic */ Function0<Unit> $onClear;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ String $query;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ String $resolvedPlaceholder;
    public final /* synthetic */ C1822Arm $resolvedTextStyle;
    public final /* synthetic */ long $searchIconColor;
    public final /* synthetic */ AuraColorsTextInput $transparentColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$2(C1518AkS c1518AkS, Integer num, String str, C1822Arm c1822Arm, AuraColorsTextInput auraColorsTextInput, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2, G0U<? super String, Unit> g0u, Function0<Unit> function0, InterfaceC1072AWd interfaceC1072AWd2, String str2, MutableState<C1805ArO> mutableState, MutableState<Boolean> mutableState2, long j, String str3, Function0<Unit> function02) {
        super(3);
        this.$focusRequester = c1518AkS;
        this.$leadingIconRes = num;
        this.$query = str;
        this.$resolvedTextStyle = c1822Arm;
        this.$transparentColors = auraColorsTextInput;
        this.$fieldInteractionSource = interfaceC1072AWd;
        this.$readOnly = z;
        this.$isCompact = z2;
        this.$onQueryChange = g0u;
        this.$onClick = function0;
        this.$clickInteractionSource = interfaceC1072AWd2;
        this.$resolvedPlaceholder = str2;
        this.$fieldValue$delegate = mutableState;
        this.$isTextFieldPositioned$delegate = mutableState2;
        this.$searchIconColor = j;
        this.$clearContentDescription = str3;
        this.$onClear = function02;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        B1U b1uA00;
        boolean z;
        B1U b1uA002;
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            C1518AkS c1518AkS = this.$focusRequester;
            Integer num = this.$leadingIconRes;
            String str = this.$query;
            C1822Arm c1822Arm = this.$resolvedTextStyle;
            AuraColorsTextInput auraColorsTextInput = this.$transparentColors;
            InterfaceC1072AWd interfaceC1072AWd = this.$fieldInteractionSource;
            boolean z2 = this.$readOnly;
            boolean z3 = this.$isCompact;
            G0U<String, Unit> g0u = this.$onQueryChange;
            Function0<Unit> function0 = this.$onClick;
            InterfaceC1072AWd interfaceC1072AWd2 = this.$clickInteractionSource;
            String str2 = this.$resolvedPlaceholder;
            MutableState<C1805ArO> mutableState = this.$fieldValue$delegate;
            MutableState<Boolean> mutableState2 = this.$isTextFieldPositioned$delegate;
            long j = this.$searchIconColor;
            String str3 = this.$clearContentDescription;
            Function0<Unit> function02 = this.$onClear;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
            C1805ArO value = mutableState.getValue();
            BRg bRgA00 = BHJ.A00(bs0, c1518AkS);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ConversationSearchScreenKt$SearchTextField$2$1$1$1(mutableState2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA002 = ASZ.A00(bRgA00, (G0U) objAaT);
            if (num == null) {
                bfm.AgE(1442779820);
                BBI.A0R(bbi, false);
                b1uA00 = null;
            } else {
                bfm.AgE(1442779821);
                b1uA00 = B1V.A00(bfm, new ConversationSearchScreenKt$SearchTextField$2$1$2$1(num.intValue(), j), -1595323146);
                BBI.A0R(bbi, false);
            }
            if (str.length() > 0) {
                bfm.AgE(1443192152);
                z = true;
                b1uA002 = B1V.A00(bfm, new ConversationSearchScreenKt$SearchTextField$2$1$3(str3, function02, g0u, j), -979931231);
                BBI.A0R(bbi, false);
            } else {
                z = true;
                bfm.AgE(1444032469);
                BBI.A0R(bbi, false);
                b1uA002 = null;
            }
            B1U b1uA003 = B1V.A00(bfm, new ConversationSearchScreenKt$SearchTextField$2$1$4(str2, c1822Arm), -489352909);
            boolean zA1K = AnonymousClass003.A1K(bfm, str, g0u);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                objAaT2 = new ConversationSearchScreenKt$SearchTextField$2$1$5$1(str, g0u, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraTextInputKt.AuraTextInput(bRgA002, value, null, b1uA003, null, null, null, c1822Arm, z, 0, b1uA00, b1uA002, auraColorsTextInput, interfaceC1072AWd, false, z2, false, z3, null, (G0U) objAaT2, bfm, 100666368, 3072, 344692);
            if (function0 != null) {
                bfm.AgE(1444118928);
                BRg bRgA012 = C0v5.A01(null, interfaceC1072AWd2, c0z7.AQJ(bs0), new C1YD(0), null, function0, z);
                boolean zA65 = bfm.A65(str2);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new ConversationSearchScreenKt$SearchTextField$2$1$6$1(str2);
                    bfm.Ai0(objAaT3);
                }
                C3Ue.A04(AnonymousClass001.A0Y(bRgA012, objAaT3, false), bfm, 0);
            } else {
                bfm.AgE(1444529275);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
            return;
        }
        bfm.Afo();
    }
}
