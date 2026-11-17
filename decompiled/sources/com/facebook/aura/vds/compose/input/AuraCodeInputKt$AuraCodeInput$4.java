package com.facebook.aura.vds.compose.input;

import X.AKQ;
import X.AOW;
import X.AT5;
import X.AbstractC1874Aso;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1326AhD;
import X.C1515AkP;
import X.C1518AkS;
import X.C1805ArO;
import X.C1809ArT;
import X.C1822Arm;
import X.C19h;
import X.C7384Etj;
import X.C78N;
import X.C9xg;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $activeIndex;
    public final /* synthetic */ float $cellSpacing;
    public final /* synthetic */ String $codeValue;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ CodeFieldEditor $editor;
    public final /* synthetic */ int $effectiveKeyboardType;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
    public final /* synthetic */ int $keyboardCapitalization;
    public final /* synthetic */ int $length;
    public final /* synthetic */ boolean $masked;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onValueChange;
    public final /* synthetic */ AT5<Float, AOW> $shakeOffset;
    public final /* synthetic */ String $stateDescription;
    public final /* synthetic */ C1805ArO $textFieldValue;
    public final /* synthetic */ C19h $visualTransformation;

    /* renamed from: com.facebook.aura.vds.compose.input.AuraCodeInputKt$AuraCodeInput$4$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ int $activeIndex;
        public final /* synthetic */ float $cellSpacing;
        public final /* synthetic */ String $codeValue;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
        public final /* synthetic */ int $length;
        public final /* synthetic */ boolean $masked;
        public final /* synthetic */ AT5<Float, AOW> $shakeOffset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f, AT5<Float, AOW> at5, boolean z, int i, String str, boolean z2, int i2, boolean z3, MutableState<Boolean> mutableState) {
            super(3);
            this.$cellSpacing = f;
            this.$shakeOffset = at5;
            this.$enabled = z;
            this.$length = i;
            this.$codeValue = str;
            this.$masked = z2;
            this.$activeIndex = i2;
            this.$isError = z3;
            this.$isFocused$delegate = mutableState;
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
                float f = this.$cellSpacing;
                AT5<Float, AOW> at5 = this.$shakeOffset;
                boolean z = this.$enabled;
                int i2 = this.$length;
                String str = this.$codeValue;
                boolean z2 = this.$masked;
                int i3 = this.$activeIndex;
                boolean z3 = this.$isError;
                MutableState<Boolean> mutableState = this.$isFocused$delegate;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                AnonymousClass003.A13(bfm, g0v, iA0T);
                AnonymousClass003.A0m(bfm, Am0.A0A.A04(EnumC1820Arj.A02), new AuraCodeInputKt$AuraCodeInput$4$4$1$1(f, at5, z, i2, str, z2, i3, z3, mutableState), 126590772);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCodeInputKt$AuraCodeInput$4(int i, int i2, BRg bRg, C1518AkS c1518AkS, String str, String str2, C1805ArO c1805ArO, G0U<? super String, Unit> g0u, int i3, boolean z, C19h c19h, MutableState<Boolean> mutableState, CodeFieldEditor codeFieldEditor, float f, AT5<Float, AOW> at5, String str3, boolean z2, int i4, boolean z3) {
        super(2);
        this.$keyboardCapitalization = i;
        this.$effectiveKeyboardType = i2;
        this.$modifier = bRg;
        this.$focusRequester = c1518AkS;
        this.$contentDescription = str;
        this.$stateDescription = str2;
        this.$textFieldValue = c1805ArO;
        this.$onValueChange = g0u;
        this.$length = i3;
        this.$enabled = z;
        this.$visualTransformation = c19h;
        this.$isFocused$delegate = mutableState;
        this.$editor = codeFieldEditor;
        this.$cellSpacing = f;
        this.$shakeOffset = at5;
        this.$codeValue = str3;
        this.$masked = z2;
        this.$activeIndex = i4;
        this.$isError = z3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuJ auJ = new AuJ(null, this.$keyboardCapitalization, this.$effectiveKeyboardType, -1);
            C1822Arm c1822Arm = C1822Arm.A03;
            long j = B6A.A06;
            long j2 = C1809ArT.A01;
            C1822Arm c1822Arm2 = new C1822Arm(null, null, null, 0, 0, j, j2, j2, B6A.A07, j2);
            C1326AhD c1326AhD = new C1326AhD(j);
            BRg bRgA00 = BHJ.A00(this.$modifier, this.$focusRequester);
            MutableState<Boolean> mutableState = this.$isFocused$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new AuraCodeInputKt$AuraCodeInput$4$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA002 = C9xg.A00(bRgA00, (G0U) objAaT);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$stateDescription, bfm.A65(this.$contentDescription));
            String str = this.$contentDescription;
            String str2 = this.$stateDescription;
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == obj) {
                objAaT2 = new AuraCodeInputKt$AuraCodeInput$4$2$1(str, str2);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA002, objAaT2, false);
            C1805ArO c1805ArO = this.$textFieldValue;
            boolean zA1a = AnonymousClass001.A1a(bfm.A65(this.$onValueChange), bfm, this.$length);
            G0U<String, Unit> g0u = this.$onValueChange;
            CodeFieldEditor codeFieldEditor = this.$editor;
            int i2 = this.$length;
            Object objAaT3 = bfm.AaT();
            if (zA1a || objAaT3 == obj) {
                objAaT3 = new AuraCodeInputKt$AuraCodeInput$4$3$1(g0u, codeFieldEditor, i2);
                bfm.Ai0(objAaT3);
            }
            boolean z = this.$enabled;
            AbstractC1874Aso.A02(null, null, auJ, bfm, bRgA0Y, c1326AhD, c1822Arm2, c1805ArO, this.$visualTransformation, (G0U) objAaT3, null, B1V.A00(bfm, new AnonymousClass4(this.$cellSpacing, this.$shakeOffset, z, this.$length, this.$codeValue, this.$masked, this.$activeIndex, this.$isError, this.$isFocused$delegate), 504120430), 0, 0, 100859904, 221184, 13968, z, false, true);
            return;
        }
        bfm.Afo();
    }
}
