package com.facebook.aura.partners.voice.screen;

import X.AFs;
import X.AFz;
import X.AGI;
import X.AHD;
import X.AHH;
import X.AKQ;
import X.AVy;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0CD;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1518AkS;
import X.C1805ArO;
import X.C1BO;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SavedVoiceSelectionKt {
    public static final int DELETE_VOICE = 2;
    public static final int RENAME_VOICE = 1;

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$AppVoicesHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
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
            SavedVoiceSelectionKt.AppVoicesHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$CreateVoiceRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$previewViewModel = voiceControlsViewModel;
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
            SavedVoiceSelectionKt.CreateVoiceRow(this.$settingsViewModel, this.$previewViewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$RenameSavedVoiceDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C131712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ MutableState<C1805ArO> $name$delegate;

        /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$RenameSavedVoiceDialog$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $hint;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str) {
                super(2);
                this.$hint = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AnonymousClass006.A17(bfm, this.$hint, C06G.A08(bfm));
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131712(C1518AkS c1518AkS, MutableState<C1805ArO> mutableState) {
            super(2);
            this.$focusRequester = c1518AkS;
            this.$name$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12069f);
                C1805ArO value = this.$name$delegate.getValue();
                BRg bRgA00 = BHJ.A00(AbstractC1754Apr.A00(C10G.A02), this.$focusRequester);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(strA01), 933069268);
                boolean zA65 = bfm.A65(this.$name$delegate);
                MutableState<C1805ArO> mutableState = this.$name$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SavedVoiceSelectionKt$RenameSavedVoiceDialog$2$2$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraTextInputKt.AuraTextInput(bRgA00, value, null, b1uA00, null, null, null, null, true, 0, null, null, null, null, false, false, false, false, null, (G0U) objAaT, bfm, 100666368, 0, 524020);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$RenameSavedVoiceDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ MutableState<C1805ArO> $name$delegate;
        public final /* synthetic */ G0U<String, Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $saveLabel;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, MutableState<C1805ArO> mutableState, G0U<? super String, Unit> g0u, String str2, Function0<Unit> function0) {
            super(2);
            this.$saveLabel = str;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$savedVoice = savedVoiceOption;
            this.$name$delegate = mutableState;
            this.$onConfirm = g0u;
            this.$cancelLabel = str2;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onConfirm, AnonymousClass001.A1R(bfm, this.$name$delegate, AnonymousClass001.A1R(bfm, this.$savedVoice, AnonymousClass001.A1T(bfm, this.$settingsViewModel, bfm.A65(this.$saveLabel)))))));
                String str = this.$saveLabel;
                VoiceSettingsListViewModel voiceSettingsListViewModel = this.$settingsViewModel;
                SavedVoiceOption savedVoiceOption = this.$savedVoice;
                String str2 = this.$cancelLabel;
                Function0<Unit> function0 = this.$onDismiss;
                MutableState<C1805ArO> mutableState = this.$name$delegate;
                G0U<String, Unit> g0u = this.$onConfirm;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new SavedVoiceSelectionKt$RenameSavedVoiceDialog$3$1$1(str, voiceSettingsListViewModel, savedVoiceOption, str2, function0, mutableState, g0u);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$RenameSavedVoiceDialog$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(SavedVoiceOption savedVoiceOption, VoiceSettingsListViewModel voiceSettingsListViewModel, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$savedVoice = savedVoiceOption;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$onDismiss = function0;
            this.$onConfirm = g0u;
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
            SavedVoiceSelectionKt.RenameSavedVoiceDialog(this.$savedVoice, this.$settingsViewModel, this.$onDismiss, this.$onConfirm, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceContextMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C131722 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ boolean $canDelete;
        public final /* synthetic */ String $deleteLabel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $renameLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131722(String str, boolean z, boolean z2, String str2) {
            super(2);
            this.$renameLabel = str;
            this.$enabled = z;
            this.$canDelete = z2;
            this.$deleteLabel = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(1562735563);
            String str = this.$renameLabel;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.textformat_outline_24_wght400, 0);
            boolean z = this.$enabled;
            boolean z2 = true;
            BS0 bs0 = BRg.A00;
            AuraContextMenuItem auraContextMenuItem = new AuraContextMenuItem(1, str, null, aVyA00, null, null, false, false, false, z, false, bs0, 1, 1);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            if (!this.$enabled || !this.$canDelete) {
                z2 = false;
            }
            AHH ahhA0E = AGI.A0E(auraContextMenuItem, new AuraContextMenuItem(2, this.$deleteLabel, null, aVyA002, null, null, false, false, false, z2, true, bs0, 1, 1));
            AnonymousClass001.A1D(bfm);
            return ahhA0E;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceContextMenu$3, reason: invalid class name and case insensitive filesystem */
    public final class C131733 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canDelete;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onAction;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131733(boolean z, boolean z2, boolean z3, Function0<Unit> function0, G0U<? super Integer, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$expanded = z;
            this.$enabled = z2;
            this.$canDelete = z3;
            this.$onDismiss = function0;
            this.$onAction = g0u;
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
            SavedVoiceSelectionKt.SavedVoiceContextMenu(this.$expanded, this.$enabled, this.$canDelete, this.$onDismiss, this.$onAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceDialogs$2, reason: invalid class name and case insensitive filesystem */
    public final class C131742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $deleteEnabled;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131742(boolean z, VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, Function0<Unit> function0) {
            super(2);
            this.$deleteEnabled = z;
            this.$previewViewModel = voiceControlsViewModel;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$savedVoice = savedVoiceOption;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA0r = AnonymousClass001.A0r(bfm);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12068a);
                boolean zA1P = AnonymousClass003.A1P(bfm, this.$onDismiss, strA0r, AnonymousClass001.A1R(bfm, this.$savedVoice, AnonymousClass001.A1T(bfm, this.$settingsViewModel, AnonymousClass001.A1T(bfm, this.$previewViewModel, AnonymousClass001.A1U(bfm, this.$deleteEnabled, bfm.A65(strA01))))));
                boolean z = this.$deleteEnabled;
                Function0<Unit> function0 = this.$onDismiss;
                VoiceControlsViewModel voiceControlsViewModel = this.$previewViewModel;
                VoiceSettingsListViewModel voiceSettingsListViewModel = this.$settingsViewModel;
                SavedVoiceOption savedVoiceOption = this.$savedVoice;
                Object objAaT = bfm.AaT();
                if (zA1P || objAaT == C78N.A00) {
                    objAaT = new SavedVoiceSelectionKt$SavedVoiceDialogs$2$1$1(strA01, z, strA0r, function0, voiceControlsViewModel, voiceSettingsListViewModel, savedVoiceOption);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceDialogs$3, reason: invalid class name and case insensitive filesystem */
    public final class C131753 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $action;
        public final /* synthetic */ boolean $deleteEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131753(Integer num, SavedVoiceOption savedVoiceOption, boolean z, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$action = num;
            this.$savedVoice = savedVoiceOption;
            this.$deleteEnabled = z;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$previewViewModel = voiceControlsViewModel;
            this.$onDismiss = function0;
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
            SavedVoiceSelectionKt.SavedVoiceDialogs(this.$action, this.$savedVoice, this.$deleteEnabled, this.$settingsViewModel, this.$previewViewModel, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceSelectionRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C131763 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131763(SavedVoiceOption savedVoiceOption, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$savedVoice = savedVoiceOption;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$previewViewModel = voiceControlsViewModel;
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
            SavedVoiceSelectionKt.SavedVoiceSelectionRow(this.$savedVoice, this.$settingsViewModel, this.$previewViewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$savedVoiceSection$4, reason: invalid class name and case insensitive filesystem */
    public final class C131784 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ int $rowCount;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
        public final /* synthetic */ AHD<SavedVoiceOption> $voices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131784(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, AHD<SavedVoiceOption> ahd, int i) {
            super(3);
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$previewViewModel = voiceControlsViewModel;
            this.$voices = ahd;
            this.$rowCount = i;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                SavedVoiceSelectionKt.CreateVoiceRow(this.$settingsViewModel, this.$previewViewModel, C1b8.A01(C11U.A03(C06G.A0M(bfm, C10G.A02), HatchSectionKt.hatchSectionRowShape(this.$voices.size(), this.$rowCount, bfm, 0)), C06G.A0J(bfm, AuraColorsKt.LocalAuraColors)), bfm, VoiceSettingsListViewModel.$stable | (VoiceControlsViewModel.$stable << 3), 0);
            } else {
                bfm.Afo();
            }
        }
    }

    public static final void AppVoicesHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1244323310);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraSectionHeaderKt.AuraSectionHeader(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120688), null, bRg2, bfm, ((iA0d << 6) & 896) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void savedVoiceSection(C0CD c0cd, final AHD<SavedVoiceOption> ahd, final VoiceSettingsListViewModel voiceSettingsListViewModel, final VoiceControlsViewModel voiceControlsViewModel, boolean z) {
        C7384Etj.A0Y(c0cd, 0);
        AnonymousClass005.A11(ahd, voiceSettingsListViewModel, voiceControlsViewModel, 1);
        if (!ahd.isEmpty() || z) {
            final int size = ahd.size() + (z ? 1 : 0);
            c0cd.APJ("my_voices_header", "voice_section_header", ComposableSingletons$SavedVoiceSelectionKt.lambda$2014753616);
            final C131771 c131771 = C131771.INSTANCE;
            c0cd.APL(c131771 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$savedVoiceSection$$inlined$itemsIndexed$1
                public final Object invoke(int i) {
                    return AnonymousClass006.A0n(Integer.valueOf(i), ahd, c131771, i);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$savedVoiceSection$$inlined$itemsIndexed$2
                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    ahd.get(AnonymousClass001.A0F(num));
                    return "saved_voice_row";
                }

                public final Object invoke(int i) {
                    ahd.get(i);
                    return "saved_voice_row";
                }
            }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$savedVoiceSection$$inlined$itemsIndexed$3
                public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                    int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                    if ((i2 & 48) == 0) {
                        iA0d |= AnonymousClass004.A0E(bfm, i);
                    }
                    if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                        bfm.Afo();
                        return;
                    }
                    SavedVoiceOption savedVoiceOption = (SavedVoiceOption) ahd.get(i);
                    bfm.AgE(-42846020);
                    BRg bRgA01 = C1b8.A01(C11U.A03(C06G.A0M(bfm, C10G.A02), HatchSectionKt.hatchSectionRowShape(i, size, bfm, ((iA0d & 126) >> 3) & 14)), C06G.A0J(bfm, AuraColorsKt.LocalAuraColors));
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
                    SavedVoiceSelectionKt.SavedVoiceSelectionRow(savedVoiceOption, voiceSettingsListViewModel, voiceControlsViewModel, null, bfm, (VoiceControlsViewModel.$stable << 6) | (VoiceSettingsListViewModel.$stable << 3), 8);
                    if (i < size - 1) {
                        bfm.AgE(-954407849);
                        VoiceSelectionRowKt.VoiceRowDivider(c0z7, null, bfm, 6, 1);
                    } else {
                        bfm.AgE(-954374214);
                    }
                    AnonymousClass002.A0z(bbi, false, true);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                    invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                    return Unit.INSTANCE;
                }
            }, 2039820996, true), ahd.size());
            if (z) {
                c0cd.APJ("create_voice", "create_voice_row", B1V.A01(new C131784(voiceSettingsListViewModel, voiceControlsViewModel, ahd, size), -1296960066, true));
            }
            c0cd.APJ("voice_sections_spacer", "voice_section_spacer", ComposableSingletons$SavedVoiceSelectionKt.f221lambda$1531781127);
        }
    }

    public static final void CreateVoiceRow(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1984521998);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceSettingsListViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(voiceControlsViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(voiceControlsViewModel))) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceSettingsListViewModel)));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new SavedVoiceSelectionKt$CreateVoiceRow$createVoice$1$1(voiceControlsViewModel, voiceSettingsListViewModel);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0V(bRg2, AuraDimensKt.SpacingXHugePlus), new C1YD(0), null, VoiceCreationActionKt.rememberVoiceCreationAction((Function0) objAaT, bfm, 0), true);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA04, f, f, AuraDimensKt.SpacingMedium, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0D);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0);
            AuraIconSize auraIconSize = AuraIconSize.MEDIUM;
            long jA0D = C06G.A0D(bfm);
            BS0 bs0 = BRg.A00;
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C10G.A07(bs0, AuraDimensKt.SpacingXlarge), AuraDimensKt.SpacingMicro), aVyA00, auraIconSize, null, jA0D, null, bfm, AnonymousClass001.A04(), 32);
            C01N.A09(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120689), AnonymousClass001.A0O(c90m, bs0, true), C06G.A0D(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceSettingsListViewModel, voiceControlsViewModel, bRg2, i, i2);
        }
    }

    public static final void RenameSavedVoiceDialog(SavedVoiceOption savedVoiceOption, VoiceSettingsListViewModel voiceSettingsListViewModel, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(655498458);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, savedVoiceOption) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(voiceSettingsListViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = {savedVoiceOption.getRowId()};
            AFs<C1805ArO, Object> aFs = C1805ArO.A03;
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new SavedVoiceSelectionKt$RenameSavedVoiceDialog$name$2$1(savedVoiceOption);
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA00 = AFz.A00(bfm, aFs, (Function0) objAaT, objArr);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objAaT2, obj);
            String rowId = savedVoiceOption.getRowId();
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new SavedVoiceSelectionKt$RenameSavedVoiceDialog$1$1(c1518AkS, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, rowId);
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a1), (String) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C131712(c1518AkS, mutableStateA00), 768073576), (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass3(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206a0), voiceSettingsListViewModel, savedVoiceOption, mutableStateA00, g0u, AnonymousClass001.A0r(bfm), function0), -1237417303), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0d >> 12) & 14) | 221184 | (3670016 & (iA0d << 12)), 0, 1932);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(savedVoiceOption, voiceSettingsListViewModel, function0, g0u, bRg2, i, i2);
        }
    }

    public static final void SavedVoiceContextMenu(boolean z, boolean z2, boolean z3, Function0<Unit> function0, G0U<? super Integer, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(821312275);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z3);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0n |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0n, 74898), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12069c);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12068a);
            boolean z4 = (57344 & iA0n) == 16384;
            Object objAaT = bfm.AaT();
            if (z4 || objAaT == C78N.A00) {
                objAaT = new SavedVoiceSelectionKt$SavedVoiceContextMenu$1$1(g0u);
                bfm.Ai0(objAaT);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRg2, (G0U) objAaT, function0, z, null, 0L, null, false, new C131722(strA01, z2, z3, strA012), false, null, null, null, false, bfm, AnonymousClass003.A09(iA0n >> 3, (iA0n >> 15) & 14, iA0n), 0, 16112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131733(z, z2, z3, function0, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SavedVoiceDialogs(java.lang.Integer r23, com.facebook.aura.partners.voice.api.SavedVoiceOption r24, boolean r25, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r26, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, X.BRg r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt.SavedVoiceDialogs(java.lang.Integer, com.facebook.aura.partners.voice.api.SavedVoiceOption, boolean, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SavedVoiceSelectionRow(com.facebook.aura.partners.voice.api.SavedVoiceOption r40, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r41, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r42, X.BRg r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt.SavedVoiceSelectionRow(com.facebook.aura.partners.voice.api.SavedVoiceOption, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel, com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel, X.BRg, X.BFM, int, int):void");
    }

    public static final /* synthetic */ C1805ArO access$RenameSavedVoiceDialog$lambda$1(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }

    public static final /* synthetic */ VoiceSettingsListViewModel.UiState access$SavedVoiceSelectionRow$lambda$0(C1BO c1bo) {
        return (VoiceSettingsListViewModel.UiState) c1bo.getValue();
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$savedVoiceSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C131771 extends AbstractC7559F3s implements G0V<Integer, SavedVoiceOption, Object> {
        public static final C131771 INSTANCE = new C131771();

        public C131771() {
            super(2);
        }

        public final Object invoke(int i, SavedVoiceOption savedVoiceOption) {
            C7384Etj.A0Y(savedVoiceOption, 1);
            return savedVoiceOption.getRowId();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, SavedVoiceOption savedVoiceOption) {
            AnonymousClass005.A0w(num);
            SavedVoiceOption savedVoiceOption2 = savedVoiceOption;
            C7384Etj.A0Y(savedVoiceOption2, 1);
            return savedVoiceOption2.getRowId();
        }
    }
}
