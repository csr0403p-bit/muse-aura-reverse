package com.facebook.aura.partners.voice.screen;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceSelectionRowKt {
    public static final float VoicePreviewTouchTarget = 48.0f;
    public static final float VoiceRowTextInset = (AuraDimensKt.SpacingMicro + 48.0f) + AuraDimensKt.SpacingNano;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionRowKt$VoicePreviewButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isLoading = z;
            this.$isPlaying = z2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionRowKt.VoicePreviewButton(this.$isLoading, this.$isPlaying, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionRowKt$VoiceRowDivider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InterfaceC05151eP $this_VoiceRowDivider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC05151eP interfaceC05151eP, BRg bRg, int i, int i2) {
            super(2);
            this.$this_VoiceRowDivider = interfaceC05151eP;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionRowKt.VoiceRowDivider(this.$this_VoiceRowDivider, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionRowKt$VoiceSelectionRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<BHP> $accessibilityActions;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isMutating;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ Function0<Unit> $onPreviewClick;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selectionEnabled;
        public final /* synthetic */ VoiceOption $voice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceOption voiceOption, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z4, boolean z5, Function0<Unit> function03, AHD<BHP> ahd, int i, int i2, int i3) {
            super(2);
            this.$voice = voiceOption;
            this.$isLoading = z;
            this.$isPlaying = z2;
            this.$isSelected = z3;
            this.$onPreviewClick = function0;
            this.$onSelect = function02;
            this.$modifier = bRg;
            this.$isMutating = z4;
            this.$selectionEnabled = z5;
            this.$onLongClick = function03;
            this.$accessibilityActions = ahd;
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
            VoiceSelectionRowKt.VoiceSelectionRow(this.$voice, this.$isLoading, this.$isPlaying, this.$isSelected, this.$onPreviewClick, this.$onSelect, this.$modifier, this.$isMutating, this.$selectionEnabled, this.$onLongClick, this.$accessibilityActions, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final void VoiceRowDivider(InterfaceC05151eP interfaceC05151eP, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(interfaceC05151eP, 0);
        bfm.AgG(-2025676564);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        int i3 = i2 & 1;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraRowDivider(C3U4.A0C(AnonymousClass001.A0R(interfaceC05151eP.A4C(C2VU.A08, bRg)), VoiceRowTextInset, 0.0f, C06G.A00(bfm), 0.0f), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(interfaceC05151eP, bRg, i, i2);
        }
    }

    public static final void VoicePreviewButton(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2096572748);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = R.string._name_removed__res_0x7f120687;
            if (z2) {
                i4 = R.string._name_removed__res_0x7f120686;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            float f = VoicePreviewTouchTarget;
            BRg bRgA04 = C0v5.A04(C10G.A09(bRg2, f, f), new C1YD(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceSelectionRowKt$VoicePreviewButton$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(567786081);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            } else {
                bfm.AgE(567836890);
                int i5 = R.drawable.mediaplay_filled_24_wght400;
                if (z2) {
                    i5 = R.drawable.mediapause_filled_24_wght400;
                }
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i5, 0), AuraIconSize.SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, z2, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceSelectionRow(com.facebook.aura.partners.voice.api.VoiceOption r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BRg r52, boolean r53, boolean r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, X.AHD<X.BHP> r56, X.BFM r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionRowKt.VoiceSelectionRow(com.facebook.aura.partners.voice.api.VoiceOption, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, kotlin.jvm.functions.Function0, X.AHD, X.BFM, int, int, int):void");
    }
}
