package com.facebook.aura.partners.voice.screen;

import X.AKO;
import X.AKQ;
import X.ANR;
import X.ARD;
import X.AVy;
import X.AbstractC1564Ale;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0ob;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C19f;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C31t;
import X.C3TQ;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C90l;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.DelayedVisibilityKt;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchVoiceOptionsWidgetKt {
    public static final int VOICE_CARD_SPEAKERS_PER_ROW = 4;
    public static final float VOICE_CARD_SPEAKER_SIZE = 48.0f;
    public static final float VOICE_GLYPH_SIZE = 22.0f;
    public static final int VOICE_SPEAKERS_PER_ROW = 3;
    public static final long VOICE_SPEAKER_SPINNER_DELAY_MS = 200;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceChooseButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraButtonSize $size;
        public final /* synthetic */ VoiceOptionsWidgetState $state;
        public final /* synthetic */ AuraLabelButtonStyle $style;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceOptionsWidgetState voiceOptionsWidgetState, String str, AuraButtonSize auraButtonSize, AuraLabelButtonStyle auraLabelButtonStyle, BRg bRg, int i, int i2) {
            super(2);
            this.$state = voiceOptionsWidgetState;
            this.$text = str;
            this.$size = auraButtonSize;
            this.$style = auraLabelButtonStyle;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceChooseButton(this.$state, this.$text, this.$size, this.$style, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $previewFallback;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ VoiceOptionsWidgetState $state;
        public final /* synthetic */ boolean $switchVoice;
        public final /* synthetic */ VoiceControlsViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            B1U b1uA00;
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
            VoiceOptionsWidgetState voiceOptionsWidgetState = this.$state;
            VoiceControlsViewModel voiceControlsViewModel = this.$viewModel;
            boolean z = this.$switchVoice;
            String str = this.$previewFallback;
            HatchScreen hatchScreen = this.$screen;
            BRg bRgA0C = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            VoiceOptionsWidgetData voiceOptionsWidgetData = voiceOptionsWidgetState.data;
            VoiceControlsViewModel.WidgetUiState widgetUiState = voiceOptionsWidgetState.uiState;
            VoiceControlsViewModel.UiState.Loaded loaded = widgetUiState.loaded;
            if (!voiceOptionsWidgetState.getShowsChooseButton()) {
                bRgA0C = C3U4.A0C(bRgA0C, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall);
            }
            VoiceOptionData voiceOptionData = widgetUiState.pendingVoice;
            String str2 = voiceOptionData != null ? voiceOptionData.voiceId : null;
            String str3 = voiceOptionsWidgetState.confirmedVoiceId;
            if (voiceOptionsWidgetState.getPickedFromBrowseAll()) {
                str3 = null;
            }
            boolean z2 = voiceOptionsWidgetState.acceptsSelection;
            float f = HatchVoiceOptionsWidgetKt.VOICE_CARD_SPEAKER_SIZE;
            float f2 = HatchVoiceOptionsWidgetKt.VOICE_GLYPH_SIZE;
            if (voiceOptionsWidgetState.getShowsBrowseAll()) {
                bfm.AgE(1819710985);
                b1uA00 = B1V.A00(bfm, new HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$2(voiceOptionsWidgetState), -1616413546);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1820009298);
                BBI.A0R(bbi, false);
                b1uA00 = null;
            }
            boolean zA1H = AnonymousClass003.A1H(bfm, hatchScreen, AnonymousClass004.A1W(bfm, str, z, bfm.A67(voiceControlsViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1H || objAaT == C78N.A00) {
                objAaT = new HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$3$1(voiceControlsViewModel, z, str, hatchScreen);
                BBI.A0O(bbi, objAaT);
            }
            String str4 = str2;
            HatchVoiceOptionsWidgetKt.m1744VoiceOptionSpeakersDepgYg8(voiceOptionsWidgetData, loaded, str4, str3, z2, (G0U) objAaT, bRgA0C, f, f2, R.drawable.mediaplay_filled_24_wght500, 0, 4, 0.0f, b1uA00, bfm, 113246208 | VoiceOptionsWidgetData.$stable | (VoiceControlsViewModel.UiState.Loaded.$stable << 3), 432, 1024);
            if (voiceOptionsWidgetState.getShowsChooseButton()) {
                bfm.AgE(1820097679);
                HatchVoiceOptionsWidgetKt.VoiceChooseButton(voiceOptionsWidgetState, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a9), AuraButtonSize.SMALL, HatchVoiceOptionsWidgetKt.voiceCardButtonStyle(bfm, 0), null, bfm, 384, 16);
            } else {
                bfm.AgE(1820321592);
            }
            AnonymousClass003.A0q(bbi);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceOptionsWidgetState voiceOptionsWidgetState, VoiceControlsViewModel voiceControlsViewModel, boolean z, String str, HatchScreen hatchScreen) {
            super(3);
            this.$state = voiceOptionsWidgetState;
            this.$viewModel = voiceControlsViewModel;
            this.$switchVoice = z;
            this.$previewFallback = str;
            this.$screen = hatchScreen;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$2, reason: invalid class name and case insensitive filesystem */
    public final class C131662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceOptionsWidgetState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131662(VoiceOptionsWidgetState voiceOptionsWidgetState, BRg bRg, int i, int i2) {
            super(2);
            this.$state = voiceOptionsWidgetState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceOptionCardsLayout(this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionsContainer$2, reason: invalid class name and case insensitive filesystem */
    public final class C131672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceOptionsWidgetState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131672(VoiceOptionsWidgetState voiceOptionsWidgetState, C3TQ c3tq, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$state = voiceOptionsWidgetState;
            this.$contentPadding = c3tq;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceOptionsContainer(this.$state, this.$contentPadding, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C131682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131682(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceOptionsHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionsPreviewEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C131692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $acceptsSelection;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ boolean $isLoaded;
        public final /* synthetic */ VoiceControlsViewModel $viewModel;
        public final /* synthetic */ List<String> $voiceIds;
        public final /* synthetic */ String $widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131692(VoiceControlsViewModel voiceControlsViewModel, boolean z, boolean z2, List<String> list, String str, String str2, int i) {
            super(2);
            this.$viewModel = voiceControlsViewModel;
            this.$isLoaded = z;
            this.$acceptsSelection = z2;
            this.$voiceIds = list;
            this.$widgetId = str;
            this.$hostMessageId = str2;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceOptionsPreviewEffect(this.$viewModel, this.$isLoaded, this.$acceptsSelection, this.$voiceIds, this.$widgetId, this.$hostMessageId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionsViewAll$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBrowseAll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onBrowseAll = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetKt.VoiceOptionsViewAll(this.$enabled, this.$onBrowseAll, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$voiceOptionSpeakerInteraction$1, reason: invalid class name and case insensitive filesystem */
    public final class C131701 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public final /* synthetic */ Function0<Unit> $onPreview;
        public final /* synthetic */ String $previewActionLabel;
        public final /* synthetic */ VoiceOptionSpeakerState $state;
        public final /* synthetic */ String $stateDescription;

        /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$voiceOptionSpeakerInteraction$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03001 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ Function0<Unit> $onPreview;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03001(Function0<Unit> function0) {
                super(0);
                this.$onPreview = function0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.$onPreview.invoke();
                return AnonymousClass001.A0i();
            }
        }

        /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$voiceOptionSpeakerInteraction$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ Function0<Unit> $onPreview;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function0<Unit> function0) {
                super(0);
                this.$onPreview = function0;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.$onPreview.invoke();
                return AnonymousClass001.A0i();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
            C7384Etj.A0Y(interfaceC0857A6e, 0);
            AbstractC1564Ale.A06(interfaceC0857A6e, this.$state.selectionEnabled ? 3 : 0);
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$state.label);
            VoiceOptionSpeakerState voiceOptionSpeakerState = this.$state;
            if (voiceOptionSpeakerState.selectionEnabled) {
                AbstractC1564Ale.A0E(interfaceC0857A6e, voiceOptionSpeakerState.highlighted);
            }
            if (!this.$state.locked) {
                AbstractC1564Ale.A0A(interfaceC0857A6e, this.$previewActionLabel, new C03001(this.$onPreview));
            } else {
                AbstractC1564Ale.A02(interfaceC0857A6e);
            }
            String str = this.$stateDescription;
            if (str != null) {
                AbstractC1564Ale.A09(interfaceC0857A6e, str);
                if (this.$state.chosen) {
                    AbstractC1564Ale.A04(interfaceC0857A6e);
                }
            }
            VoiceOptionSpeakerState voiceOptionSpeakerState2 = this.$state;
            if (voiceOptionSpeakerState2.selectionEnabled && voiceOptionSpeakerState2.highlighted && (!voiceOptionSpeakerState2.locked)) {
                AbstractC1564Ale.A0C(interfaceC0857A6e, Collections.singletonList(new BHP(this.$previewActionLabel, new AnonymousClass2(this.$onPreview))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131701(VoiceOptionSpeakerState voiceOptionSpeakerState, String str, String str2, Function0<Unit> function0) {
            super(1);
            this.$state = voiceOptionSpeakerState;
            this.$previewActionLabel = str;
            this.$stateDescription = str2;
            this.$onPreview = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            invoke2(interfaceC0857A6e);
            return Unit.INSTANCE;
        }
    }

    public static final void VoiceOptionsPreviewEffect(VoiceControlsViewModel voiceControlsViewModel, boolean z, boolean z2, List<String> list, String str, String str2, BFM bfm, int i) {
        AnonymousClass003.A0w(voiceControlsViewModel, list);
        AnonymousClass002.A1D(str, 4, str2);
        bfm.AgG(1261094932);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(list, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str2);
        }
        boolean z3 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12089c);
            Object[] objArr = {voiceControlsViewModel, Boolean.valueOf(z), Boolean.valueOf(z2), list, str, str2, strA01};
            boolean zA1D = AnonymousClass003.A1D(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsViewModel))) | AnonymousClass003.A1C(iA05) | AnonymousClass007.A1H(iA05) | AnonymousClass005.A1L(iA05);
            if ((iA05 & 7168) != 2048 && ((iA05 & 4096) == 0 || !bfm.A67(list))) {
                z3 = false;
            }
            boolean zA1W = AnonymousClass002.A1W(bfm, strA01, zA1D, z3);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchVoiceOptionsWidgetKt$VoiceOptionsPreviewEffect$1$1(z2, voiceControlsViewModel, z, str2, str, list, strA01);
                BBI.A0T(bfm, objAaT);
            }
            C78e.A07(bfm, (G0U) objAaT, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131692(voiceControlsViewModel, z, z2, list, str, str2, i);
        }
    }

    public static final String voiceChoiceLabel(VoiceOptionsWidgetData voiceOptionsWidgetData, VoiceOptionData voiceOptionData, BFM bfm, int i) {
        C7384Etj.A0Y(voiceOptionsWidgetData, 0);
        if (voiceOptionData == null) {
            AnonymousClass003.A0l(bfm, 1642308465);
        } else {
            bfm.AgE(1642308466);
            String strVoiceOptionLabel = voiceOptionLabel(voiceOptionData, voiceOptionsWidgetData.options.indexOf(voiceOptionData) + 1, bfm, VoiceOptionData.$stable);
            AnonymousClass001.A1D(bfm);
            if (strVoiceOptionLabel != null) {
                return strVoiceOptionLabel;
            }
        }
        return "";
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceOptionGlyph.values().length];
            try {
                AnonymousClass002.A13(VoiceOptionGlyph.SPINNER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceOptionGlyph.CHECK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceOptionGlyph.PAUSE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VoiceOptionGlyph.PLAY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149 A[PHI: r21
  0x0149: PHI (r21v3 java.lang.String) = (r21v5 java.lang.String), (r21v6 java.lang.String) binds: [B:64:0x0147, B:62:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* renamed from: HatchVoiceOptionsWidget-IkByU14, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1740HatchVoiceOptionsWidgetIkByU14(com.facebook.aura.model.HatchWidget r34, com.facebook.aura.model.VoiceOptionsWidgetData r35, long r36, X.C1DM r38, java.lang.String r39, com.facebook.aura.model.WidgetStateMutationHost r40, boolean r41, X.BRg r42, X.G0U<? super java.lang.String, kotlin.Unit> r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt.m1740HatchVoiceOptionsWidgetIkByU14(com.facebook.aura.model.HatchWidget, com.facebook.aura.model.VoiceOptionsWidgetData, long, X.1DM, java.lang.String, com.facebook.aura.model.WidgetStateMutationHost, boolean, X.BRg, X.G0U, X.BFM, int, int):void");
    }

    public static final void VoiceChooseButton(VoiceOptionsWidgetState voiceOptionsWidgetState, String str, AuraButtonSize auraButtonSize, AuraLabelButtonStyle auraLabelButtonStyle, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(24217229);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceOptionsWidgetState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, auraButtonSize);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, auraLabelButtonStyle);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceOptionData voiceOptionData = voiceOptionsWidgetState.uiState.pendingVoice;
            String strVoiceChoiceLabel = voiceChoiceLabel(voiceOptionsWidgetState.data, voiceOptionData, bfm, VoiceOptionsWidgetData.$stable | (VoiceOptionData.$stable << 3));
            String strA0t = AnonymousClass001.A0t(bfm, strVoiceChoiceLabel, R.string._name_removed__res_0x7f12089e);
            BBI bbi = (BBI) bfm;
            HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(AKO.A09(LocalIsPrimaryThreadKt.LocalIsPrimaryThread, bbi));
            boolean z2 = voiceOptionsWidgetState.uiState.canChooseVoice;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA67 = bfm.A67(voiceOptionData);
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(voiceOptionsWidgetState))) {
                z = false;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, strA0t, AnonymousClass003.A1H(bfm, hatchScreenChatScreen, AnonymousClass002.A1W(bfm, strVoiceChoiceLabel, zA67, z)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchVoiceOptionsWidgetKt$VoiceChooseButton$1$1(voiceOptionData, voiceOptionsWidgetState, strVoiceChoiceLabel, hatchScreenChatScreen, strA0t);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0R, auraLabelButtonStyle, auraButtonSize, null, false, false, z2, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, AnonymousClass001.A08(iA05 << 9, AnonymousClass001.A0B(iA05 << 3, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0, 0, 134200773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceOptionsWidgetState, str, auraButtonSize, auraLabelButtonStyle, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceOptionCardsLayout(com.facebook.aura.partners.voice.screen.VoiceOptionsWidgetState r16, X.BRg r17, X.BFM r18, int r19, int r20) {
        /*
            r3 = r17
            r0 = 1560059915(0x5cfca00b, float:5.68861306E17)
            r12 = r18
            r12.AgG(r0)
            r2 = r19
            r0 = r19 & 6
            r8 = r16
            if (r0 != 0) goto La8
            boolean r0 = X.AnonymousClass004.A1X(r8, r12, r2)
            int r4 = X.AnonymousClass002.A05(r0)
            r4 = r4 | r19
        L1c:
            r1 = r20
            r6 = r20 & 2
            if (r6 == 0) goto L9d
            r4 = r4 | 48
        L24:
            r5 = r4 & 19
            r0 = 18
            r14 = 0
            r7 = 1
            boolean r0 = X.AnonymousClass002.A1P(r5, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r12, r4)
            if (r0 == 0) goto L99
            if (r6 == 0) goto L38
            X.BS0 r3 = X.BRg.A00
        L38:
            r0 = 2131888284(0x7f12089c, float:1.9411199E38)
            java.lang.String r19 = X.AbstractC2271BQs.A01(r12, r0)
            X.AKH<java.lang.Boolean> r5 = com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt.LocalIsPrimaryThread
            r0 = r12
            X.BBI r0 = (X.BBI) r0
            boolean r0 = X.AKO.A09(r5, r0)
            com.facebook.aura.analytics.hatch.HatchScreen r20 = com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt.chatScreen(r0)
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r6 = r8.viewModel
            com.facebook.aura.model.VoiceOptionsWidgetData r0 = r8.data
            boolean r0 = r0.switchVoice
            if (r0 == 0) goto L5a
            boolean r0 = r8.acceptsSelection
            r18 = 1
            if (r0 != 0) goto L5c
        L5a:
            r18 = 0
        L5c:
            float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
            X.1DP r9 = new X.1DP
            r9.<init>(r0, r0, r0, r0)
            X.3TH r0 = X.C2VU.A02
            X.BRg r5 = X.C10G.A00(r0, r3, r14)
            r0 = 0
            X.BRg r7 = com.facebook.aura.conversation.view.HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(r5, r0, r12, r14, r7)
            r5 = 1134559232(0x43a00000, float:320.0)
            r0 = 2143289344(0x7fc00000, float:NaN)
            X.BRg r10 = X.C10G.A0D(r7, r0, r5)
            com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1 r15 = new com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r0 = -1950265804(0xffffffff8bc14e34, float:-7.445856E-32)
            X.B1U r11 = X.B1V.A00(r12, r15, r0)
            r0 = r4 & 14
            r13 = r0 | 3072(0xc00, float:4.305E-42)
            VoiceOptionsContainer(r8, r9, r10, r11, r12, r13, r14)
        L8b:
            X.BBb r4 = r12.AAc()
            if (r4 == 0) goto L98
            com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$2 r0 = new com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$2
            r0.<init>(r8, r3, r2, r1)
            r4.A06 = r0
        L98:
            return
        L99:
            r12.Afo()
            goto L8b
        L9d:
            r0 = r19 & 48
            if (r0 != 0) goto L24
            int r0 = X.AnonymousClass004.A0e(r12, r3)
            r4 = r4 | r0
            goto L24
        La8:
            r4 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt.VoiceOptionCardsLayout(com.facebook.aura.partners.voice.screen.VoiceOptionsWidgetState, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: VoiceOptionGlyphContent-DzVHIIc, reason: not valid java name */
    public static final void m1741VoiceOptionGlyphContentDzVHIIc(VoiceOptionGlyph voiceOptionGlyph, float f, int i, BRg bRg, BFM bfm, int i2, int i3) {
        int i4;
        Integer numValueOf;
        BRg bRg2 = bRg;
        bfm.AgG(1717516242);
        int iA08 = (i2 & 6) == 0 ? AnonymousClass005.A08(bfm, voiceOptionGlyph) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA08 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i2 & 384) == 0) {
            iA08 |= AnonymousClass004.A0F(bfm, i);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA08 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            long j = C3cH.A0W(bfm).primaryIcon.enabled;
            int iOrdinal = voiceOptionGlyph.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 3) {
                    i4 = R.drawable.checkmark_outline_24;
                } else if (iOrdinal == 2) {
                    i4 = R.drawable.mediapause_filled_24_wght400;
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    numValueOf = Integer.valueOf(i);
                    bfm.AgE(581526858);
                    AuraIconKt.m2568AuraIconFyETyZw(bRg2, BOf.A00(bfm, numValueOf.intValue(), 0), f, null, j, null, bfm, ((iA08 >> 9) & 14) | 3072 | (AVy.$stable << 3) | ((iA08 << 3) & 896), 32);
                }
                numValueOf = Integer.valueOf(i4);
                bfm.AgE(581526858);
                AuraIconKt.m2568AuraIconFyETyZw(bRg2, BOf.A00(bfm, numValueOf.intValue(), 0), f, null, j, null, bfm, ((iA08 >> 9) & 14) | 3072 | (AVy.$stable << 3) | ((iA08 << 3) & 896), 32);
            } else {
                bfm.AgE(581446382);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bRg2, f), null, j, bfm, 0, 2);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchVoiceOptionsWidgetKt$VoiceOptionGlyphContent$1(voiceOptionGlyph, f, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* renamed from: VoiceOptionSpeaker-KhTvWYU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1742VoiceOptionSpeakerKhTvWYU(com.facebook.aura.partners.voice.screen.VoiceOptionSpeakerState r40, float r41, float r42, int r43, int r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BRg r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt.m1742VoiceOptionSpeakerKhTvWYU(com.facebook.aura.partners.voice.screen.VoiceOptionSpeakerState, float, float, int, int, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: VoiceOptionSpeakerControl-o3XDK20, reason: not valid java name */
    public static final void m1743VoiceOptionSpeakerControlo3XDK20(VoiceOptionSpeakerState voiceOptionSpeakerState, float f, float f2, int i, BRg bRg, BFM bfm, int i2, int i3) {
        long j;
        int iA1V;
        BRg bRg2 = bRg;
        bfm.AgG(1880948265);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, voiceOptionSpeakerState) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (voiceOptionSpeakerState.highlighted) {
                j = C3cI.A0K(bfm, -589940684).primaryText;
                iA1V = AnonymousClass001.A1V(bfm);
            } else {
                boolean zA1P = AnonymousClass004.A1P(bfm, -589939948);
                j = B6A.A06;
                iA1V = zA1P;
            }
            C1BO c1boA00 = C19f.A00(null, bfm, 384, 10, j);
            VoiceOptionGlyph voiceOptionGlyph = (DelayedVisibilityKt.rememberDelayedVisible(voiceOptionSpeakerState.loading, 200L, bfm, 48, iA1V) && voiceOptionSpeakerState.loading) ? VoiceOptionGlyph.SPINNER : voiceOptionSpeakerState.playing ? VoiceOptionGlyph.PAUSE : voiceOptionSpeakerState.chosen ? VoiceOptionGlyph.CHECK : VoiceOptionGlyph.PLAY;
            BRg bRgA07 = C10G.A07(bRg2, f);
            long j2 = AuraTheme.INSTANCE.getColors(bfm, 6).secondaryButtonBackground;
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA02 = C1DI.A02(C1b8.A03(bRgA07, c1d3, j2), c1d3, 2.0f, VoiceOptionSpeakerControl_o3XDK20$lambda$0(c1boA00));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            ANR.A02(bfm, C2VU.A09, bRgA02, voiceOptionGlyph, "speakerGlyph", (G0U) objAaT, null, B1V.A00(bfm, new HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$2(f2, i), -174206809), 1600896, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$3(voiceOptionSpeakerState, f, f2, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /* renamed from: VoiceOptionSpeakers-DepgYg8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1744VoiceOptionSpeakersDepgYg8(com.facebook.aura.model.VoiceOptionsWidgetData r37, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.Loaded r38, java.lang.String r39, java.lang.String r40, boolean r41, X.G0U<? super com.facebook.aura.model.VoiceOptionData, kotlin.Unit> r42, X.BRg r43, float r44, float r45, int r46, int r47, int r48, float r49, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r50, X.BFM r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt.m1744VoiceOptionSpeakersDepgYg8(com.facebook.aura.model.VoiceOptionsWidgetData, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Loaded, java.lang.String, java.lang.String, boolean, X.G0U, X.BRg, float, float, int, int, int, float, X.G0W, X.BFM, int, int, int):void");
    }

    public static final void VoiceOptionsContainer(VoiceOptionsWidgetState voiceOptionsWidgetState, C3TQ c3tq, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(1053121637);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceOptionsWidgetState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c3tq);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(C3U4.A0D(C1b8.A03(bRg2, voiceOptionsWidgetState.containerShape, voiceOptionsWidgetState.containerBackgroundColor), c3tq), HatchOrigin.CHAT, HatchSurface.VOICE_MODE, null, HatchInteractionEnumsKt.chatScreen(AKO.A09(LocalIsPrimaryThreadKt.LocalIsPrimaryThread, bbi)), HatchComponent.VOICE_OPTIONS_WIDGET, null, null, null, 500L, 0.0f, null, null, null);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            VoiceControlsViewModel.UiState.Loaded loaded = voiceOptionsWidgetState.uiState.loaded;
            if ((loaded == null || (str = loaded.onboardingLine) == null || C7BY.A0j(str)) && ((str = voiceOptionsWidgetState.widget.displayText) == null || C7BY.A0j(str))) {
                str = null;
            }
            VoiceOptionsHeader(str, null, bfm, 0, 2);
            AnonymousClass004.A1B(bbi, c90l, bfm, g0w, ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131672(voiceOptionsWidgetState, c3tq, bRg2, g0w, i, i2);
        }
    }

    public static final void VoiceOptionsHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-862148144);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str != null) {
                bfm.AgE(-350825088);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
                long jA06 = C3cH.A06(bfm, auraTheme);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchVoiceOptionsWidgetKt$VoiceOptionsHeader$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRg2, (G0U) objAaT, false), jA06, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            } else {
                bfm.AgE(-350619310);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131682(str, bRg2, i, i2);
        }
    }

    public static final void VoiceOptionsViewAll(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(914822092);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12089f);
            C1BO c1boA01 = C31t.A01(null, bfm, z ? 1.0f : 0.4f, 3072, 22);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchVoiceOptionsWidgetKt$VoiceOptionsViewAll$1$1(c1boA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0W(bRgA0P, objAaT), C3cG.A0A(0), null, function0, z);
            boolean zA652 = bfm.A65(strA01) | AnonymousClass003.A1B(iA0n) | AnonymousClass003.A1C(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchVoiceOptionsWidgetKt$VoiceOptionsViewAll$2$1(strA01, z, function0);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA04, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingMicroPlusNano), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0D);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrowupright_outline_24_wght500, 0);
            BRg bRgA07 = C10G.A07(BRg.A00, VOICE_CARD_SPEAKER_SIZE);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2568AuraIconFyETyZw(C10G.A02(C2VU.A09, C1DI.A02(bRgA07, C1D8.A00, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), false), aVyA00, VOICE_GLYPH_SIZE, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, (AVy.$stable << 3) | 3456, 32);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(z, function0, bRgA0P, i, i2);
        }
    }

    public static final AuraLabelButtonStyle voiceCardButtonStyle(BFM bfm, int i) {
        AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        long j = auraTheme.getColors(bfm, 6).secondaryButtonBackground;
        long jA06 = C3cH.A06(bfm, auraTheme);
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        AuraButtonCorner auraButtonCorner = AuraButtonCorner.PILL;
        long j2 = B6A.A07;
        return auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j, jA06, auraButtonCorner, list, null, false, j2, j2, j2, jA06, jA06, 0.0f, null);
    }

    public static final String voiceOptionLabel(VoiceOptionData voiceOptionData, int i, BFM bfm, int i2) {
        String strA0t = voiceOptionData.label;
        if (strA0t == null) {
            bfm.AgE(-499942157);
            strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(i), R.string._name_removed__res_0x7f120898);
        } else {
            bfm.AgE(-499942653);
        }
        AnonymousClass002.A19(bfm);
        return strA0t;
    }

    public static final BRg voiceOptionSpeakerInteraction(BRg bRg, VoiceOptionSpeakerState voiceOptionSpeakerState, String str, String str2, Function0<Unit> function0) {
        BRg bRgA05;
        if (voiceOptionSpeakerState.selectionEnabled) {
            bRgA05 = C0ob.A00(BRg.A00, C3cG.A0A(3), function0, voiceOptionSpeakerState.highlighted, !voiceOptionSpeakerState.locked);
        } else {
            bRgA05 = C0v5.A05(BRg.A00, str2, function0, !voiceOptionSpeakerState.locked);
        }
        return ARD.A00(bRg.then(bRgA05), new C131701(voiceOptionSpeakerState, str2, str, function0));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> voiceOptionsBrowseAllAction(com.facebook.aura.partners.voice.screen.VoiceOptionsWidgetState r8, X.BFM r9, int r10) {
        /*
            X.AKH<com.facebook.aura.navigation.AuraNavigator> r0 = com.facebook.aura.navigation.AuraNavigatorKt.LocalNavigator
            r6 = r9
            X.BBI r6 = (X.BBI) r6
            com.facebook.aura.navigation.AuraNavigator r5 = X.AKO.A05(r0, r6)
            X.AKH<java.lang.String> r0 = com.facebook.aura.conversation.view.richcontent.LocalConversationSessionIdKt.LocalConversationSessionId
            java.lang.Object r4 = X.AKO.A07(r0, r6)
            java.lang.String r4 = (java.lang.String) r4
            X.AKH<java.lang.Boolean> r0 = com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt.LocalIsPrimaryThread
            boolean r0 = X.AKO.A09(r0, r6)
            com.facebook.aura.analytics.hatch.HatchScreen r3 = com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt.chatScreen(r0)
            boolean r7 = r9.A67(r5)
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L2c
            boolean r0 = r9.A67(r8)
            if (r0 != 0) goto L31
        L2c:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r2) goto L32
        L31:
            r0 = 1
        L32:
            r0 = r0 | r7
            boolean r0 = X.AnonymousClass003.A1H(r9, r3, r0)
            boolean r1 = X.AnonymousClass001.A1R(r9, r4, r0)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L45
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L4d
        L45:
            com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$voiceOptionsBrowseAllAction$1$1 r0 = new com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$voiceOptionsBrowseAllAction$1$1
            r0.<init>(r5, r8, r3, r4)
            X.BBI.A0O(r6, r0)
        L4d:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt.voiceOptionsBrowseAllAction(com.facebook.aura.partners.voice.screen.VoiceOptionsWidgetState, X.BFM, int):kotlin.jvm.functions.Function0");
    }

    public static final long VoiceOptionSpeakerControl_o3XDK20$lambda$0(C1BO<B6A> c1bo) {
        return c1bo.getValue().A00;
    }
}
