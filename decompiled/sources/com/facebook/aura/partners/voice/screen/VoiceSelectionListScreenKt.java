package com.facebook.aura.partners.voice.screen;

import X.AFz;
import X.AHD;
import X.AIC;
import X.AKO;
import X.AKQ;
import X.ARD;
import X.ARK;
import X.AVy;
import X.AbstractC1742Apf;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBP;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0881AGi;
import X.C0953AJg;
import X.C0A8;
import X.C0CD;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1EQ;
import X.C1HY;
import X.C1OM;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3P4;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j3;
import X.C8j4;
import X.EnumC10573Huf;
import X.EnumC1820Arj;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.components.reactions.AuraDoubleTakeKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.VoiceCatalogFilterKind;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.partners.voice.api.VoiceCatalogCriteria;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchTabBarPaddingKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class VoiceSelectionListScreenKt {
    public static final String SYSTEM_VOICE_KEY_PREFIX = "system:";
    public static final String SYSTEM_VOICE_ROW_CONTENT_TYPE = "system_voice_row";

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterBar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $clearAllEnabled;
        public final /* synthetic */ AHD<VoiceCatalogFacet> $facets;
        public final /* synthetic */ boolean $facetsEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClearAll;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceSettingsListViewModel voiceSettingsListViewModel, AHD<VoiceCatalogFacet> ahd, Function0<Unit> function0, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$facets = ahd;
            this.$onClearAll = function0;
            this.$facetsEnabled = z;
            this.$clearAllEnabled = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterBar(this.$settingsViewModel, this.$facets, this.$onClearAll, this.$facetsEnabled, this.$clearAllEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterButton$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
        public final /* synthetic */ AVy $chevron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AVy aVy) {
            super(3);
            this.$chevron = aVy;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
            invoke(iconContext, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(IconContext iconContext, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                long jA08 = C06G.A08(bfm);
                AuraIconKt.m2567AuraIconFHprtrg(null, this.$chevron, AuraIconSize.X_TINY, null, HxS.A04(HDi.A0O[(int) (jA08 & 63)], B6A.A03(jA08), B6A.A02(jA08), B6A.A01(jA08), B6A.A00(jA08) * AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha))), null, bfm, AnonymousClass001.A03(), 41);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterButton$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public final /* synthetic */ String $selectedLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(2);
            this.$selectedLabel = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            C1822Arm c1822Arm;
            bfm.AgE(-29430364);
            if (this.$selectedLabel == null) {
                c1822Arm = AnonymousClass006.A0k(bfm, 1782193139).footnoteRegular;
            } else {
                c1822Arm = AnonymousClass006.A0k(bfm, 1782194738).footnoteMedium;
            }
            AnonymousClass006.A1M(bfm);
            return c1822Arm;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterButton$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ VoiceCatalogFacet $facet;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceCatalogFacet voiceCatalogFacet, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$facet = voiceCatalogFacet;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterButton(this.$settingsViewModel, this.$facet, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterFade$1, reason: invalid class name and case insensitive filesystem */
    public final class C132041 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132041(C1110AYw c1110AYw, BRg bRg, int i, int i2) {
            super(2);
            this.$scrollState = c1110AYw;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterFade(this.$scrollState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterFade$2, reason: invalid class name and case insensitive filesystem */
    public final class C132052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132052(C1110AYw c1110AYw, BRg bRg, int i, int i2) {
            super(2);
            this.$scrollState = c1110AYw;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterFade(this.$scrollState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterOptionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C132062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132062(String str, boolean z, Function0<Unit> function0, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$label = str;
            this.$selected = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterOptionRow(this.$label, this.$selected, this.$onClick, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$3, reason: invalid class name and case insensitive filesystem */
    public final class C132073 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ VoiceCatalogFacet $facet;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132073(VoiceCatalogFacet voiceCatalogFacet, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$facet = voiceCatalogFacet;
            this.$enabled = z;
            this.$onSelected = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterOptions(this.$facet, this.$enabled, this.$onSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C132082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceEntryPoint $entryPoint;
        public final /* synthetic */ VoiceCatalogFilterKind $kind;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132082(VoiceCatalogFilterKind voiceCatalogFilterKind, VoiceEntryPoint voiceEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$kind = voiceCatalogFilterKind;
            this.$entryPoint = voiceEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterSheet(this.$kind, this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C132093 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ VoiceCatalogFacet $facet;
        public final /* synthetic */ Function0<Unit> $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132093(VoiceCatalogFacet voiceCatalogFacet, boolean z, Function0<Unit> function0) {
            super(3);
            this.$facet = voiceCatalogFacet;
            this.$enabled = z;
            this.$onClose = function0;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogFilterOptions(this.$facet, this.$enabled, this.$onClose, null, bfm, 0, 8);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceEntryPoint $entryPoint;
        public final /* synthetic */ VoiceCatalogFilterKind $kind;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(VoiceCatalogFilterKind voiceCatalogFilterKind, VoiceEntryPoint voiceEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$kind = voiceCatalogFilterKind;
            this.$entryPoint = voiceEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFilterSheet(this.$kind, this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogFooterMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C132102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132102(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogFooterMessage(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C132112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetryCatalog;
        public final /* synthetic */ VoiceSettingsListViewModel.UiState $settingsState;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132112(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceSettingsListViewModel.UiState uiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$settingsState = uiState;
            this.$onRetryCatalog = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogOverlay(this.$settingsViewModel, this.$settingsState, this.$onRetryCatalog, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogRetryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C132122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132122(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogRetryRow(this.$message, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogRetryState$2, reason: invalid class name and case insensitive filesystem */
    public final class C132132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132132(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogRetryState(this.$message, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogTopFade$1, reason: invalid class name and case insensitive filesystem */
    public final class C132141 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132141(LazyListState lazyListState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$listState = lazyListState;
            this.$visible = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogTopFade(this.$listState, this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogTopFade$2, reason: invalid class name and case insensitive filesystem */
    public final class C132152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132152(LazyListState lazyListState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$listState = lazyListState;
            this.$visible = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogTopFade(this.$listState, this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogTopFade$3, reason: invalid class name and case insensitive filesystem */
    public final class C132163 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132163(LazyListState lazyListState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$listState = lazyListState;
            this.$visible = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceCatalogTopFade(this.$listState, this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListScreen$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C132172 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132172(VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(4);
            this.$previewViewModel = voiceControlsViewModel;
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1793invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1793invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            Object obj = this.$previewViewModel;
            boolean zA67 = bfm.A67(obj);
            VoiceControlsViewModel voiceControlsViewModel = this.$previewViewModel;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$1$1(voiceControlsViewModel);
                bfm.Ai0(objAaT);
            }
            int i2 = VoiceControlsViewModel.$stable;
            C78e.A05(bfm, obj, (G0U) objAaT);
            C1BO c1boA02 = C2CK.A02(bfm, this.$previewViewModel.uiState);
            C1062ATq c1062ATq = C10G.A01;
            VoiceSettingsListViewModel voiceSettingsListViewModel = this.$settingsViewModel;
            VoiceTelemetry voiceTelemetry = voiceSettingsListViewModel.telemetry;
            HatchComponent hatchComponent = HatchComponent.VOICE_SELECTION_PAGE;
            boolean zA672 = bfm.A67(voiceSettingsListViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$2$1(voiceSettingsListViewModel);
                bfm.Ai0(objAaT2);
            }
            BRg bRgVoiceImpression = VoiceTelemetryModifiersKt.voiceImpression(c1062ATq, voiceTelemetry, hatchComponent, null, (Function0) ((InterfaceC7353EnQ) objAaT2), bfm, (VoiceTelemetry.$stable << 3) | 390, 4);
            VoiceSettingsListViewModel voiceSettingsListViewModel2 = this.$settingsViewModel;
            VoiceControlsViewModel voiceControlsViewModel2 = this.$previewViewModel;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgVoiceImpression);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            VoiceSelectionListScreenKt.m1785VoiceSettingsCatalogListnSlTg7c(voiceSettingsListViewModel2, voiceControlsViewModel2, (VoiceControlsViewModel.UiState) c1boA02.getValue(), f, f2, HatchTabBarPaddingKt.m2329hatchTabImePaddingziNgDLE(c1062ATq, f2, bfm, (iA04 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), bfm, AnonymousClass003.A07(iA04 << 9, VoiceSettingsListViewModel.$stable | (i2 << 3)), 0);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C132183 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132183(Function0<Unit> function0, VoiceEntryPoint voiceEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$onBackClick = function0;
            this.$entryPoint = voiceEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceSelectionListScreen(this.$onBackClick, this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListSheet$4, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C132194 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $confirmed$delegate;
        public final /* synthetic */ boolean $imeVisible;
        public final /* synthetic */ Function0<Unit> $onChooseVoice;
        public final /* synthetic */ HatchOrigin $origin;
        public final /* synthetic */ VoiceOption $pickedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ C1BO<VoiceControlsViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ VoiceControlsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C132194(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, HatchOrigin hatchOrigin, boolean z, VoiceOption voiceOption, String str, Function0<Unit> function0, C1BO<? extends VoiceControlsViewModel.UiState> c1bo, MutableState<Boolean> mutableState) {
            super(3);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$viewModel = voiceControlsViewModel;
            this.$origin = hatchOrigin;
            this.$imeVisible = z;
            this.$pickedVoice = voiceOption;
            this.$threadId = str;
            this.$onChooseVoice = function0;
            this.$uiState$delegate = c1bo;
            this.$confirmed$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r39, X.BFM r40, int r41) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.C132194.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListSheet$5, reason: invalid class name and case insensitive filesystem */
    public final class C132205 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchOrigin $origin;
        public final /* synthetic */ String $replyToMessageId;
        public final /* synthetic */ String $sourceHostMessageId;
        public final /* synthetic */ String $sourceWidgetId;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ VoiceControlsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132205(VoiceControlsViewModel voiceControlsViewModel, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = voiceControlsViewModel;
            this.$origin = hatchOrigin;
            this.$threadId = str;
            this.$replyToMessageId = str2;
            this.$sourceWidgetId = str3;
            this.$sourceHostMessageId = str4;
            this.$entryPoint = voiceEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceSelectionListScreenKt.VoiceSelectionListSheet(this.$viewModel, this.$origin, this.$threadId, this.$replyToMessageId, this.$sourceWidgetId, this.$sourceHostMessageId, this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$catalogStatusRows$1, reason: invalid class name and case insensitive filesystem */
    public final class C132221 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132221(VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(3);
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogFooterMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12068f), VoiceSelectionListScreenKt.voiceCatalogStateImpression(BRg.A00, this.$settingsViewModel, VoiceTelemetry.CatalogState.CATALOG_EMPTY, bfm, (VoiceSettingsListViewModel.$stable << 3) | 390), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$catalogStatusRows$2, reason: invalid class name and case insensitive filesystem */
    public final class C132232 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132232(VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(3);
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogFooterMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065e), VoiceSelectionListScreenKt.voiceCatalogStateImpression(BRg.A00, this.$settingsViewModel, VoiceTelemetry.CatalogState.CATALOG_LOADING, bfm, (VoiceSettingsListViewModel.$stable << 3) | 390), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$catalogStatusRows$3, reason: invalid class name and case insensitive filesystem */
    public final class C132243 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetryCatalog;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132243(Function0<Unit> function0, VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(3);
            this.$onRetryCatalog = function0;
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogRetryRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120697), this.$onRetryCatalog, VoiceSelectionListScreenKt.voiceCatalogStateImpression(C3U4.A07(BRg.A00, C8j4.A01(bfm)), this.$settingsViewModel, VoiceTelemetry.CatalogState.CATALOG_ERROR, bfm, (VoiceSettingsListViewModel.$stable << 3) | 384), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$catalogStatusRows$4, reason: invalid class name and case insensitive filesystem */
    public final class C132254 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132254(VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(3);
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogFooterMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065e), VoiceSelectionListScreenKt.voiceCatalogStateImpression(BRg.A00, this.$settingsViewModel, VoiceTelemetry.CatalogState.PAGE_LOADING, bfm, (VoiceSettingsListViewModel.$stable << 3) | 390), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$catalogStatusRows$5, reason: invalid class name and case insensitive filesystem */
    public final class C132265 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetryCatalog;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132265(Function0<Unit> function0, VoiceSettingsListViewModel voiceSettingsListViewModel) {
            super(3);
            this.$onRetryCatalog = function0;
            this.$settingsViewModel = voiceSettingsListViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                VoiceSelectionListScreenKt.VoiceCatalogRetryRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120698), this.$onRetryCatalog, VoiceSelectionListScreenKt.voiceCatalogStateImpression(C3U4.A07(BRg.A00, C8j4.A01(bfm)), this.$settingsViewModel, VoiceTelemetry.CatalogState.PAGE_ERROR, bfm, (VoiceSettingsListViewModel.$stable << 3) | 384), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void VoiceCatalogTopFade(LazyListState lazyListState, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c132163;
        BRg bRg2 = bRg;
        bfm.AgG(36613581);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                boolean zA1B = AnonymousClass003.A1B(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1B || objAaT == C78N.A00) {
                    objAaT = BBP.A0A(new VoiceSelectionListScreenKt$VoiceCatalogTopFade$showTopFade$2$1(lazyListState));
                    BBI.A0T(bfm, objAaT);
                }
                if (C1BO.A0F((C1BO) objAaT)) {
                    long j = C3cH.A0W(bfm).highlight;
                    boolean zA64 = bfm.A64(j);
                    Object objAaT2 = bfm.AaT();
                    if (zA64 || objAaT2 == C78N.A00) {
                        objAaT2 = C1EQ.A01(AnonymousClass004.A17(C60P.A04(j), B6A.A06), 0.0f, Float.POSITIVE_INFINITY);
                        bfm.Ai0(objAaT2);
                    }
                    C01N.A07(bfm, C1b8.A02(C10G.A04(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLarge), (C1EQ) objAaT2, C1OM.A00));
                } else {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c132163 = new C132152(lazyListState, z, bRg2, i, i2);
                    }
                }
            } else {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c132163 = new C132141(lazyListState, z, bRg2, i, i2);
                }
            }
            C3cG.A1D(bBbAAc, c132163);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c132163 = new C132163(lazyListState, z, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c132163);
        }
    }

    public static final void previewCatalogVoice(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, VoiceOption voiceOption, String str) {
        VoiceControlsViewModel.UiState.PreviewState previewState;
        VoiceControlsViewModel.UiState value = voiceControlsViewModel.uiState.getValue();
        if (!(value instanceof VoiceControlsViewModel.UiState.PreviewState) || (previewState = (VoiceControlsViewModel.UiState.PreviewState) value) == null) {
            return;
        }
        voiceSettingsListViewModel.onPreviewVoice(voiceOption, previewState);
        voiceControlsViewModel.togglePreview(voiceOption, str, null, voiceOption.id, voiceSettingsListViewModel.uiState.getValue().isCurrentSavedVoice(voiceOption));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListState rememberVoiceCatalogListState(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r17, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState r18, X.BFM r19, int r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.rememberVoiceCatalogListState(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState, X.BFM, int):androidx.compose.foundation.lazy.LazyListState");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoiceSettingsListViewModel.MutationFailure.values().length];
            try {
                AnonymousClass005.A0v(VoiceSettingsListViewModel.MutationFailure.SELECT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(VoiceSettingsListViewModel.MutationFailure.RENAME, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(VoiceSettingsListViewModel.MutationFailure.DELETE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoiceCatalogFilterKind.values().length];
            try {
                AnonymousClass005.A0v(VoiceCatalogFilterKind.GENDER, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(VoiceCatalogFilterKind.ACCENT, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(VoiceCatalogFilterKind.TONE, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b3  */
    /* renamed from: FilterableVoiceCatalog-3GLzNTs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1781FilterableVoiceCatalog3GLzNTs(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r34, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r35, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState r36, com.facebook.aura.partners.voice.screen.VoiceCatalogRowState r37, float r38, float r39, X.BRg r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.m1781FilterableVoiceCatalog3GLzNTs(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState, com.facebook.aura.partners.voice.screen.VoiceCatalogRowState, float, float, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* renamed from: VoiceCatalogControls-tJlDC5Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1782VoiceCatalogControlstJlDC5Y(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r43, java.lang.String r44, X.G0U<? super java.lang.String, kotlin.Unit> r45, X.AHD<com.facebook.aura.partners.voice.screen.VoiceCatalogFacet> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, boolean r48, boolean r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, float r51, X.BRg r52, X.BFM r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.m1782VoiceCatalogControlstJlDC5Y(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, java.lang.String, X.G0U, X.AHD, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, float, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCatalogFilterBar(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r49, X.AHD<com.facebook.aura.partners.voice.screen.VoiceCatalogFacet> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, boolean r52, boolean r53, X.BRg r54, X.BFM r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.VoiceCatalogFilterBar(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, X.AHD, kotlin.jvm.functions.Function0, boolean, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCatalogFilterButton(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r46, com.facebook.aura.partners.voice.screen.VoiceCatalogFacet r47, boolean r48, X.BRg r49, X.BFM r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.VoiceCatalogFilterButton(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.screen.VoiceCatalogFacet, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void VoiceCatalogFilterOptionRow(String str, boolean z, Function0<Unit> function0, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Q = z2;
        bfm.AgG(59495823);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            BRg bRgA0O = AnonymousClass006.A0O(AnonymousClass001.A0R(bRg2));
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, C8j3.A0k(AuraDimensKt.SpacingSmall), bfm, 3072, 3);
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            C0953AJg c0953AJg = C0953AJg.A03;
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJg, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z3 = (iA0d & 896) == 256;
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = new VoiceSelectionListScreenKt$VoiceCatalogFilterOptionRow$1$1(function0);
                BBI.A0T(bfm, objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0O, auraCardStyleM2500listoAWOtXo, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, zA1Q, false, null, null, 0L, false, null, null, bfm, ((iA0d << 18) & 29360128) | 3072, (iA0d >> 12) & 14, 260720);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132062(str, z, function0, bRg2, zA1Q, i, i2);
        }
    }

    public static final void VoiceCatalogFilterOptions(VoiceCatalogFacet voiceCatalogFacet, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1670837051);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, voiceCatalogFacet) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120691);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRgA0R, f, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingLarge);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0C, auraTheme.getShapes(bfm, 6).card), AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA01, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            boolean zA1Y = AnonymousClass002.A1Y(voiceCatalogFacet.selectedValue);
            int i4 = iA0d & 14;
            int i5 = iA0d & 896;
            boolean zA17 = AnonymousClass003.A17(i4) | AnonymousClass003.A19(i5);
            Object objAaT2 = bfm.AaT();
            if (zA17 || objAaT2 == obj) {
                objAaT2 = new VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$2$1$1(voiceCatalogFacet, function0);
                BBI.A0O(bbi, objAaT2);
            }
            VoiceCatalogFilterOptionRow(strA01, zA1Y, (Function0) objAaT2, null, z, bfm, (iA0d << 9) & 57344, 8);
            bfm.AgE(301715676);
            for (VoiceSettingsListViewModel.CatalogFilterOption catalogFilterOption : voiceCatalogFacet.options) {
                AuraDividerKt.AuraRowDivider(C3U4.A0B(BRg.A00, f, 0.0f), bfm, 0, 0);
                String str = catalogFilterOption.label;
                boolean zAreEqual = C7384Etj.areEqual(catalogFilterOption.value, voiceCatalogFacet.selectedValue);
                boolean z2 = catalogFilterOption.isEnabled;
                boolean zA1T = AnonymousClass001.A1T(bfm, catalogFilterOption, AnonymousClass003.A17(i4)) | AnonymousClass003.A19(i5);
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == obj) {
                    objAaT3 = new VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$2$2$1$1(voiceCatalogFacet, catalogFilterOption, function0);
                    BBI.A0O(bbi, objAaT3);
                }
                VoiceCatalogFilterOptionRow(str, zAreEqual, (Function0) objAaT3, null, z2, bfm, 0, 8);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132073(voiceCatalogFacet, z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoiceCatalogFilterSheet(com.facebook.aura.navigation.key.VoiceCatalogFilterKind r24, com.facebook.aura.navigation.key.VoiceEntryPoint r25, X.BRg r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.VoiceCatalogFilterSheet(com.facebook.aura.navigation.key.VoiceCatalogFilterKind, com.facebook.aura.navigation.key.VoiceEntryPoint, X.BRg, X.BFM, int, int):void");
    }

    public static final void VoiceCatalogFooterMessage(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-506745030);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA02 = C10G.A02(C2VU.A09, C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium), false);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceSelectionListScreenKt$VoiceCatalogFooterMessage$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA02, objAaT, false), jA07, c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132102(str, bRg2, i, i2);
        }
    }

    /* renamed from: VoiceCatalogMessage-uFdPcIQ, reason: not valid java name */
    public static final void m1783VoiceCatalogMessageuFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(370165803);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA02 = C10G.A02(C2VU.A09, C3U4.A04(AnonymousClass001.A0T(bRg2), f), false);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceSelectionListScreenKt$VoiceCatalogMessage$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA02, objAaT, false), jA07, c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new VoiceSelectionListScreenKt$VoiceCatalogMessage$2(str, f, bRg2, i, i2);
        }
    }

    public static final void VoiceCatalogOverlay(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceSettingsListViewModel.UiState uiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1266283551);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceSettingsListViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(uiState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VoiceCatalogCriteria voiceCatalogCriteria = uiState.catalogCriteria;
            if (uiState.isCatalogLoading && uiState.displayedCatalogVoices.isEmpty()) {
                bfm.AgE(-1422736065);
                m1783VoiceCatalogMessageuFdPcIQ(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065e), 0.0f, voiceCatalogStateImpression(bRg2, voiceSettingsListViewModel, VoiceTelemetry.CatalogState.CATALOG_LOADING, bfm, ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 9) & 14) | 384 | (VoiceSettingsListViewModel.$stable << 3)), bfm, 48, 0);
            } else if (uiState.catalogFailure == VoiceSettingsListViewModel.CatalogFailure.INITIAL) {
                bfm.AgE(-1422721726);
                VoiceCatalogRetryState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120697), function0, voiceCatalogStateImpression(bRg2, voiceSettingsListViewModel, VoiceTelemetry.CatalogState.CATALOG_ERROR, bfm, ((iA05 >> 9) & 14) | 384 | (VoiceSettingsListViewModel.$stable << 3) | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), bfm, (iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else if (uiState.showCatalogEmptyMessage) {
                bfm.AgE(-1154282757);
                boolean zIsEmpty = voiceCatalogCriteria.isEmpty();
                int i4 = R.string._name_removed__res_0x7f12069a;
                if (zIsEmpty) {
                    i4 = R.string._name_removed__res_0x7f12068f;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i4);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
                long jA07 = C3cH.A07(bfm, auraTheme);
                BRg bRgVoiceCatalogStateImpression = voiceCatalogStateImpression(bRg2, voiceSettingsListViewModel, voiceCatalogCriteria.isEmpty() ? VoiceTelemetry.CatalogState.CATALOG_EMPTY : VoiceTelemetry.CatalogState.NO_RESULTS, bfm, ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 9) & 14) | (VoiceSettingsListViewModel.$stable << 3));
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = VoiceSelectionListScreenKt$VoiceCatalogOverlay$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRgVoiceCatalogStateImpression, (G0U) objAaT, false), jA07, c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(-1153504223);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132112(voiceSettingsListViewModel, uiState, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* renamed from: VoiceCatalogResults-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1784VoiceCatalogResultsGHTll3U(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r39, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r40, androidx.compose.foundation.lazy.LazyListState r41, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState r42, float r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, com.facebook.aura.partners.voice.screen.VoiceCatalogRowState r45, X.BRg r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.m1784VoiceCatalogResultsGHTll3U(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel, androidx.compose.foundation.lazy.LazyListState, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState, float, kotlin.jvm.functions.Function0, com.facebook.aura.partners.voice.screen.VoiceCatalogRowState, X.BRg, X.BFM, int, int):void");
    }

    public static final void VoiceCatalogRetryRow(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-10540194);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0O = AnonymousClass006.A0O(AnonymousClass001.A0R(bRg2));
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA00 = ARK.A00(BRg.A00);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceSelectionListScreenKt$VoiceCatalogRetryRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA00, objAaT, false), jA07, c1822ArmA0D, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a2), null, null, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0d << 9) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132122(str, function0, bRg2, i, i2);
        }
    }

    public static final void VoiceCatalogRetryState(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-84592555);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA07 = C3U4.A07(bRgA0R, auraTheme.getDimensions(bfm, 6).gutterWidth);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceSelectionListScreenKt$VoiceCatalogRetryState$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bs0, (G0U) objAaT, false), jA07, c1822ArmA0D, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a2), null, null, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0d << 9) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132132(str, function0, bRg2, i, i2);
        }
    }

    public static final void VoiceSelectionListScreen(Function0<Unit> function0, VoiceEntryPoint voiceEntryPoint, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(function0, voiceEntryPoint);
        bfm.AgG(1898254646);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass005.A09(bfm, voiceEntryPoint);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            VoiceSettingsListViewModel.Factory factory = new VoiceSettingsListViewModel.Factory(abstractC3358CGzA06, voiceEntryPoint, zA1a);
            BOD bodA00 = C5wL.A00(bfm);
            String strA00 = AnonymousClass000.A00(1);
            if (bodA00 == null) {
                throw C3cG.A0Q(strA00);
            }
            VoiceSettingsListViewModel voiceSettingsListViewModel = (VoiceSettingsListViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(VoiceSettingsListViewModel.class));
            VoiceControlsViewModel.Factory factory2 = new VoiceControlsViewModel.Factory(abstractC3358CGzA06, C0881AGi.A00, zA1a, false, null, null);
            BOD bodA002 = C5wL.A00(bfm);
            if (bodA002 == null) {
                throw C3cG.A0Q(strA00);
            }
            VoiceControlsViewModel voiceControlsViewModel = (VoiceControlsViewModel) C3cH.A0H(factory2, bodA002, AnonymousClass005.A0Y(bodA002), C3cG.A0x(VoiceControlsViewModel.class));
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(voiceSettingsListViewModel);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceSelectionListScreenKt$VoiceSelectionListScreen$leaveScreen$1$1(voiceSettingsListViewModel, mutableStateA00);
                BBI.A0O(bbi, objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean zA67 = bfm.A67(voiceSettingsListViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceSelectionListScreenKt$VoiceSelectionListScreen$1$1(voiceSettingsListViewModel);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, voiceSettingsListViewModel);
            B81.A00(AnonymousClass002.A1Z(C3P4.A00(bfm, ((C1HY) AKO.A07(AIC.A00, bbi)).getLifecycle()).getValue(), EnumC10573Huf.A05), function02, bfm, 0, 0);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120660), null, function02, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, AuraDimensKt.SpacingSmall, null, null, null, 0, null, null, new HatchBackClickAnalytics(HatchSurface.VOICE_MODE, HatchScreen.VOICE_SELECTION), false, B1V.A00(bfm, new C132172(voiceControlsViewModel, voiceSettingsListViewModel), -2018939951), bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0, (HatchBackClickAnalytics.$stable << 21) | 805306368, 401604524);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132183(function0, voiceEntryPoint, bRg2, i, i2);
        }
    }

    public static final void VoiceSelectionListSheet(VoiceControlsViewModel voiceControlsViewModel, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(voiceControlsViewModel, 0);
        AnonymousClass002.A1E(hatchOrigin, 1, voiceEntryPoint);
        bfm.AgG(-183015693);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchOrigin);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str4);
        }
        if ((i & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0I(bfm, voiceEntryPoint.ordinal());
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA05 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = iA05 & 14;
            boolean z = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$1$1(voiceControlsViewModel);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            VoiceSettingsListViewModel.Factory factory = new VoiceSettingsListViewModel.Factory(abstractC3358CGzA06, voiceEntryPoint, false);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            VoiceSettingsListViewModel voiceSettingsListViewModel = (VoiceSettingsListViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(VoiceSettingsListViewModel.class));
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = VoiceSelectionListScreenKt$VoiceSelectionListSheet$confirmed$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT2, objArr);
            boolean zA67 = bfm.A67(auraNavigatorA05);
            int i5 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1V = AnonymousClass002.A1V(bfm, voiceSettingsListViewModel, zA67, AnonymousClass002.A1Q(i5, 32));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1(auraNavigatorA05, hatchOrigin, voiceSettingsListViewModel);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, voiceSettingsListViewModel);
            C1BO c1boA02 = C2CK.A02(bfm, voiceControlsViewModel.uiState);
            C1BO c1boA022 = C2CK.A02(bfm, voiceSettingsListViewModel.uiState);
            boolean zA01 = AbstractC1742Apf.A01(bfm);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, auraNavigatorA05, AnonymousClass002.A1Q(i5, 32), bfm.A67(voiceSettingsListViewModel));
            Object objAaT4 = bfm.AaT();
            if (zA1V2 || objAaT4 == obj) {
                objAaT4 = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$onDismiss$1$1(hatchOrigin, voiceSettingsListViewModel, auraNavigatorA05);
                BBI.A0O(bbi, objAaT4);
            }
            Function0 function0 = (Function0) objAaT4;
            VoiceOption voiceOption = C8j3.A0q(c1boA022).voiceToChoose;
            if (voiceOption != null) {
                bfm.AgE(-1905619451);
                strA0t = AnonymousClass001.A0t(bfm, voiceOption.name, R.string._name_removed__res_0x7f1206a6);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1905511013);
                BBI.A0R(bbi, false);
                strA0t = "";
            }
            boolean zA1V3 = AnonymousClass002.A1V(bfm, auraNavigatorA05, AnonymousClass002.A1W(bfm, strA0t, AnonymousClass002.A1W(bfm, c1boA022, AnonymousClass002.A1V(bfm, voiceSettingsListViewModel, AnonymousClass004.A1K(iA05), AnonymousClass003.A1K(bfm, mutableState, voiceOption)), AnonymousClass005.A1L(iA05)), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsViewModel))) | AnonymousClass007.A1H(iA05), AnonymousClass004.A1M(iA05));
            Object objAaT5 = bfm.AaT();
            if (zA1V3 || objAaT5 == obj) {
                objAaT5 = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$onChooseVoice$1$1(voiceOption, str, voiceSettingsListViewModel, str3, voiceControlsViewModel, strA0t, str4, str2, auraNavigatorA05, mutableState, c1boA022);
                BBI.A0O(bbi, objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            B81.A00(!MutableState.A0A(mutableState), function0, bfm, 0, 0);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            VoiceTelemetry voiceTelemetry = voiceSettingsListViewModel.telemetry;
            HatchComponent hatchComponent = HatchComponent.VOICE_SELECTION_PAGE;
            boolean zA672 = bfm.A67(voiceSettingsListViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA672 || objAaT6 == obj) {
                objAaT6 = new VoiceSelectionListScreenKt$VoiceSelectionListSheet$3$1(voiceSettingsListViewModel);
                BBI.A0O(bbi, objAaT6);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, VoiceTelemetryModifiersKt.voiceImpression(bRg2, voiceTelemetry, hatchComponent, null, (Function0) ((InterfaceC7353EnQ) objAaT6), bfm, ((iA05 >> 21) & 14) | 384 | (VoiceTelemetry.$stable << 3), 4), null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a5), null, null, new AuraBottomSheetHeaderConfig.AccessoryButton(R.drawable.aura_nav_close_20, R.string._name_removed__res_0x7f1206ed, function0), null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, function0, false, false, true, null, B1V.A00(bfm, new C132194(voiceSettingsListViewModel, voiceControlsViewModel, hatchOrigin, zA01, voiceOption, str, function02, c1boA02, mutableState), 1542730032), bfm, 817889670, 48, 1328);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132205(voiceControlsViewModel, hatchOrigin, str, str2, str3, str4, voiceEntryPoint, bRg2, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0296, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0156 A[EDGE_INSN: B:137:0x0156->B:69:0x0156 BREAK  A[LOOP:1: B:117:0x0265->B:139:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* renamed from: VoiceSettingsCatalogList-nSlTg7c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1785VoiceSettingsCatalogListnSlTg7c(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r27, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r28, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState r29, float r30, float r31, X.BRg r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.m1785VoiceSettingsCatalogListnSlTg7c(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState, float, float, X.BRg, X.BFM, int, int):void");
    }

    public static final void appVoiceSection(C0CD c0cd, final AHD<VoiceOption> ahd, final VoiceCatalogRowState voiceCatalogRowState, final boolean z) {
        final C132211 c132211 = C132211.INSTANCE;
        c0cd.APL(c132211 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$appVoiceSection$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return c132211.invoke(Integer.valueOf(i), ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$appVoiceSection$$inlined$itemsIndexed$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return VoiceSelectionListScreenKt.SYSTEM_VOICE_ROW_CONTENT_TYPE;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return VoiceSelectionListScreenKt.SYSTEM_VOICE_ROW_CONTENT_TYPE;
            }
        }, B1U.A02(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$appVoiceSection$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                boolean z2 = false;
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                VoiceOption voiceOption = (VoiceOption) ahd.get(i);
                bfm.AgE(413636491);
                BRg bRgA01 = C1b8.A01(C11U.A03(C06G.A0M(bfm, C10G.A02), HatchSectionKt.hatchSectionRowShape(i, ahd.size(), bfm, ((iA0d & 126) >> 3) & 14)), C06G.A0J(bfm, AuraColorsKt.LocalAuraColors));
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
                C0z7 c0z7 = C0z7.A00;
                boolean zAreEqual = C7384Etj.areEqual(voiceCatalogRowState.previewLoadingVoiceId, voiceOption.id);
                boolean zAreEqual2 = C7384Etj.areEqual(voiceCatalogRowState.previewPlayingVoiceId, voiceOption.id);
                VoiceCatalogRowState voiceCatalogRowState2 = voiceCatalogRowState;
                if (!voiceCatalogRowState2.hasSelectedSavedVoice && C7384Etj.areEqual(voiceOption.id, voiceCatalogRowState2.selectedVoiceId)) {
                    z2 = true;
                }
                boolean zAreEqual3 = C7384Etj.areEqual(voiceCatalogRowState.savingSelectionRowId, voiceOption.id);
                boolean zA1K = AnonymousClass003.A1K(bfm, voiceCatalogRowState, voiceOption);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new VoiceSelectionListScreenKt$appVoiceSection$3$1$1$1(voiceCatalogRowState, voiceOption);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                boolean zA1K2 = AnonymousClass003.A1K(bfm, voiceCatalogRowState, voiceOption);
                Object objAaT2 = bfm.AaT();
                if (zA1K2 || objAaT2 == C78N.A00) {
                    objAaT2 = new VoiceSelectionListScreenKt$appVoiceSection$3$1$2$1(voiceCatalogRowState, voiceOption);
                    bfm.Ai0(objAaT2);
                }
                VoiceSelectionRowKt.VoiceSelectionRow(voiceOption, zAreEqual, zAreEqual2, z2, function02, (Function0) objAaT2, null, zAreEqual3, z, null, null, bfm, 0, 0, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS);
                if (i < AnonymousClass002.A0E(ahd)) {
                    bfm.AgE(-1967462438);
                    VoiceSelectionRowKt.VoiceRowDivider(c0z7, null, bfm, 6, 1);
                } else {
                    bfm.AgE(-1967428803);
                }
                AnonymousClass003.A0q(bbi);
                BBI.A0R(bbi, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    public static final void catalogStatusRows(C0CD c0cd, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceSettingsListViewModel.UiState uiState, Function0<Unit> function0, boolean z) {
        B1U b1uA02;
        String str;
        if (z && uiState.catalogCriteria.isEmpty() && uiState.showCatalogEmptyMessage) {
            c0cd.APJ("catalog_empty", "catalog_page_status", B1U.A02(new C132221(voiceSettingsListViewModel), 1982391589));
        }
        if (uiState.isCatalogLoading) {
            if (!uiState.displayedCatalogVoices.isEmpty() || z) {
                c0cd.APJ("catalog_loading", "catalog_page_status", B1U.A02(new C132232(voiceSettingsListViewModel), 346005582));
                if (z) {
                    c0cd.APJ("catalog_initial_error", "catalog_page_status", B1U.A02(new C132243(function0, voiceSettingsListViewModel), -338224723));
                }
            }
        } else if (z && uiState.catalogFailure == VoiceSettingsListViewModel.CatalogFailure.INITIAL) {
            c0cd.APJ("catalog_initial_error", "catalog_page_status", B1U.A02(new C132243(function0, voiceSettingsListViewModel), -338224723));
        }
        if (uiState.isCatalogLoadingMore) {
            b1uA02 = B1U.A02(new C132254(voiceSettingsListViewModel), -1022455028);
            str = "catalog_loading_more";
        } else {
            if (uiState.catalogFailure != VoiceSettingsListViewModel.CatalogFailure.LOAD_MORE) {
                return;
            }
            b1uA02 = B1U.A02(new C132265(function0, voiceSettingsListViewModel), -943109117);
            str = "catalog_load_more_error";
        }
        c0cd.APJ(str, "catalog_page_status", b1uA02);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg voiceCatalogStateImpression(X.BRg r12, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r13, com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry.CatalogState r14, X.BFM r15, int r16) {
        /*
            com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry r5 = r13.telemetry
            com.facebook.aura.analytics.hatch.HatchComponent r6 = com.facebook.aura.analytics.hatch.HatchComponent.VOICE_CATALOG_STATE
            r2 = r16
            r0 = r16 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r4 = 0
            r1 = 32
            r9 = r15
            if (r0 <= r1) goto L16
            boolean r0 = r15.A67(r13)
            if (r0 != 0) goto L1b
        L16:
            r0 = r16 & 48
            r3 = 0
            if (r0 != r1) goto L1c
        L1b:
            r3 = 1
        L1c:
            r0 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            r7 = r14
            if (r0 <= r1) goto L2b
            boolean r0 = X.AnonymousClass002.A1U(r15, r14)
            if (r0 != 0) goto L2f
        L2b:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L30
        L2f:
            r4 = 1
        L30:
            r3 = r3 | r4
            java.lang.Object r8 = r15.AaT()
            if (r3 != 0) goto L3b
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L43
        L3b:
            com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$voiceCatalogStateImpression$1$1 r8 = new com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$voiceCatalogStateImpression$1$1
            r8.<init>(r13, r14)
            X.BBI.A0T(r15, r8)
        L43:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r0 = r16 & 14
            r10 = r0 | 384(0x180, float:5.38E-43)
            int r0 = com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry.$stable
            int r0 = r0 << 3
            r10 = r10 | r0
            int r0 = r16 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r0
            r11 = 0
            r4 = r12
            X.BRg r0 = com.facebook.aura.partners.voice.screen.VoiceTelemetryModifiersKt.voiceImpression(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.voiceCatalogStateImpression(X.BRg, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry$CatalogState, X.BFM, int):X.BRg");
    }

    public static final void VoiceCatalogFilterFade(C1110AYw c1110AYw, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c132052;
        bfm.AgG(1100341495);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1110AYw) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = BBP.A0A(new VoiceSelectionListScreenKt$VoiceCatalogFilterFade$showFilterFade$2$1(c1110AYw));
                BBI.A0T(bfm, objAaT);
            }
            if (!C1BO.A0F((C1BO) objAaT)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c132052 = new C132041(c1110AYw, bRg, i, i2);
                    C3cG.A1D(bBbAAc, c132052);
                }
                return;
            }
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, (BBI) bfm);
            long j = C3cH.A0W(bfm).highlight;
            boolean zA1U = AnonymousClass002.A1U(bfm, enumC1820Arj) | bfm.A64(j);
            Object objAaT2 = bfm.AaT();
            if (zA1U || objAaT2 == C78N.A00) {
                B6A[] b6aArr = new B6A[2];
                if (enumC1820Arj == EnumC1820Arj.A02) {
                    b6aArr[0] = C60P.A04(B6A.A06);
                } else {
                    b6aArr[0] = C60P.A04(j);
                    j = B6A.A06;
                }
                b6aArr[1] = C60P.A04(j);
                objAaT2 = C1EQ.A00(Arrays.asList(b6aArr), 0.0f, Float.POSITIVE_INFINITY);
                bfm.Ai0(objAaT2);
            }
            C01N.A07(bfm, C1b8.A02(bRg, (C1EQ) objAaT2, C1OM.A00));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c132052 = new C132052(c1110AYw, bRg, i, i2);
            C3cG.A1D(bBbAAc, c132052);
        }
    }

    public static final /* synthetic */ VoiceControlsViewModel.UiState access$VoiceSelectionListSheet$lambda$5(C1BO c1bo) {
        return (VoiceControlsViewModel.UiState) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<com.facebook.aura.partners.voice.screen.VoiceCatalogFacet> rememberVoiceCatalogFacets(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState r16, X.G0U<? super java.lang.String, kotlin.Unit> r17, X.G0U<? super java.lang.String, kotlin.Unit> r18, X.G0U<? super java.lang.String, kotlin.Unit> r19, X.BFM r20, int r21) {
        /*
            r0 = 2131887763(0x7f120693, float:1.9410142E38)
            r14 = 0
            r10 = r20
            java.lang.String r9 = X.AbstractC2271BQs.A01(r10, r0)
            r0 = 2131887760(0x7f120690, float:1.9410136E38)
            java.lang.String r8 = X.AbstractC2271BQs.A01(r10, r0)
            r0 = 2131887765(0x7f120695, float:1.9410146E38)
            java.lang.String r7 = X.AbstractC2271BQs.A01(r10, r0)
            r2 = r16
            X.AHD<com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFacet> r0 = r2.availableCatalogFacets
            boolean r0 = r10.A65(r0)
            boolean r5 = X.AnonymousClass005.A1T(r10, r9, r8, r7, r0)
            r3 = r21
            r0 = r21 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r4 = 32
            r6 = 0
            r13 = r17
            if (r0 <= r4) goto L37
            boolean r0 = r10.A65(r13)
            if (r0 != 0) goto L3c
        L37:
            r1 = r21 & 48
            r0 = 0
            if (r1 != r4) goto L3d
        L3c:
            r0 = 1
        L3d:
            r5 = r5 | r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            r12 = r18
            if (r0 <= r4) goto L4e
            boolean r0 = r10.A65(r12)
            if (r0 != 0) goto L53
        L4e:
            r1 = r3 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r4) goto L54
        L53:
            r0 = 1
        L54:
            r5 = r5 | r0
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            r11 = r19
            if (r0 <= r1) goto L65
            boolean r0 = r10.A65(r11)
            if (r0 != 0) goto L69
        L65:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != r1) goto L6a
        L69:
            r14 = 1
        L6a:
            r5 = r5 | r14
            java.lang.Object r1 = r10.AaT()
            if (r5 != 0) goto L75
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lcf
        L75:
            X.AHD<com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFacet> r0 = r2.availableCatalogFacets
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r15 = r0.iterator()
        L7f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r14 = r15.next()
            com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFacet r14 = (com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.CatalogFacet) r14
            com.facebook.aura.navigation.key.VoiceCatalogFilterKind r4 = r14.kind
            int[] r0 = com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r4.ordinal()
            r1 = 2
            r0 = 1
            if (r3 == r6) goto Lc0
            if (r3 == r0) goto Lbd
            if (r3 != r1) goto Lc3
            r18 = r7
        L9d:
            X.AHD<com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFilterOption> r2 = r14.options
            java.lang.String r1 = r14.selectedValue
            if (r3 == r6) goto Lba
            r21 = r12
            if (r3 == r0) goto La9
            r21 = r11
        La9:
            com.facebook.aura.partners.voice.screen.VoiceCatalogFacet r0 = new com.facebook.aura.partners.voice.screen.VoiceCatalogFacet
            r19 = r2
            r20 = r1
            r17 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r5.add(r0)
            goto L7f
        Lba:
            r21 = r13
            goto La9
        Lbd:
            r18 = r8
            goto L9d
        Lc0:
            r18 = r9
            goto L9d
        Lc3:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lc8:
            X.AHD r1 = X.AGI.A07(r5)
            r10.Ai0(r1)
        Lcf:
            X.AHD r1 = (X.AHD) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.rememberVoiceCatalogFacets(com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState, X.G0U, X.G0U, X.G0U, X.BFM, int):X.AHD");
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$appVoiceSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C132211 extends AbstractC7559F3s implements G0V<Integer, VoiceOption, Object> {
        public static final C132211 INSTANCE = new C132211();

        public C132211() {
            super(2);
        }

        public final Object invoke(int i, VoiceOption voiceOption) {
            C7384Etj.A0Y(voiceOption, 1);
            return FGI.A0M(VoiceSelectionListScreenKt.SYSTEM_VOICE_KEY_PREFIX, voiceOption.id);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, VoiceOption voiceOption) {
            return invoke(AnonymousClass001.A0F(num), voiceOption);
        }
    }
}
