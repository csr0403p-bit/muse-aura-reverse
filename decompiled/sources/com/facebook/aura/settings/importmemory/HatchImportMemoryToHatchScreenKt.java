package com.facebook.aura.settings.importmemory;

import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0fG;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7OQ;
import X.C7OU;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HpR;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchImportMemoryToHatchScreenKt {
    public static final String TAG = "HatchImportMemoryToHatchScreen";

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$AddMemoryCta$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSending;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddMemory;
        public final /* synthetic */ String $pastedText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$pastedText = str;
            this.$isSending = z;
            this.$onAddMemory = function0;
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
            HatchImportMemoryToHatchScreenKt.AddMemoryCta(this.$pastedText, this.$isSending, this.$onAddMemory, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$CannedPromptCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C136292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136292(BRg bRg, int i, int i2) {
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
            HatchImportMemoryToHatchScreenKt.CannedPromptCard(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$ChatUploadStatusRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$leadingIcon = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImportMemoryToHatchScreenKt.ChatUploadStatusRow(this.$text, this.$modifier, this.$leadingIcon, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C136302 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $openZipPicker;
        public final /* synthetic */ C1BO<HatchImportMemoryToHatchUiState> $uiState$delegate;
        public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136302(HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, Function0<Unit> function0, C1BO<HatchImportMemoryToHatchUiState> c1bo) {
            super(4);
            this.$viewModel = hatchImportMemoryToHatchViewModel;
            this.$openZipPicker = function0;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1978invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1978invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f05);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f0f);
            String str = this.$uiState$delegate.getValue().pastedText;
            HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchImportMemoryToHatchViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$1$1(hatchImportMemoryToHatchViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
            ChatUploadState chatUploadState = this.$uiState$delegate.getValue().chatUploadState;
            ChatUploadError chatUploadError = this.$uiState$delegate.getValue().chatUploadError;
            boolean z = this.$uiState$delegate.getValue().isSending;
            boolean zA1N = AnonymousClass003.A1N(bfm, this.$viewModel, strA012);
            HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel2 = this.$viewModel;
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$2$1(hatchImportMemoryToHatchViewModel2, strA012);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$openZipPicker, bfm.A67(this.$viewModel));
            HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel3 = this.$viewModel;
            Function0<Unit> function02 = this.$openZipPicker;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$3$1(hatchImportMemoryToHatchViewModel3, function02);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, this.$viewModel, strA01);
            HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel4 = this.$viewModel;
            Object objAaT4 = bfm.AaT();
            if (zA1N2 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$4$1(hatchImportMemoryToHatchViewModel4, strA01);
                bfm.Ai0(objAaT4);
            }
            HatchImportMemoryToHatchScreenKt.m1976ImportMemoryScrollableContentLJWHXA8(str, g0u, chatUploadState, chatUploadError, z, function0, function03, (Function0) objAaT4, f, f2, AbstractC1754Apr.A00(C10G.A01), bfm, (iA04 << 24) & 2113929216, 0, 0);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C136313 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136313(Function0<Unit> function0, HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchImportMemoryToHatchViewModel;
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
            HatchImportMemoryToHatchScreenKt.HatchImportMemoryToHatchScreen(this.$onBack, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$ImportChatsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C136322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ChatUploadError $chatUploadError;
        public final /* synthetic */ ChatUploadState $chatUploadState;
        public final /* synthetic */ boolean $isSending;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddChats;
        public final /* synthetic */ Function0<Unit> $onSummarizeChats;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136322(ChatUploadState chatUploadState, ChatUploadError chatUploadError, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$chatUploadState = chatUploadState;
            this.$chatUploadError = chatUploadError;
            this.$isSending = z;
            this.$onAddChats = function0;
            this.$onSummarizeChats = function02;
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
            HatchImportMemoryToHatchScreenKt.ImportChatsSection(this.$chatUploadState, this.$chatUploadError, this.$isSending, this.$onAddChats, this.$onSummarizeChats, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$PasteTextField$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(3);
            this.$value = str;
            this.$placeholder = str2;
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
                if (this.$value.length() == 0) {
                    C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -140854404).bodyRegular;
                    AuraTextKt.m2639AuraTextUY9GdpU(this.$placeholder, null, AnonymousClass002.A0c(bfm).textInput.placeholderColor, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(-140673426);
                }
                AnonymousClass001.A1D(bfm);
                AnonymousClass003.A13(bfm, g0v, iA0T);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt$PasteTextField$2, reason: invalid class name and case insensitive filesystem */
    public final class C136332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onValueChange;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136332(String str, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$value = str;
            this.$onValueChange = g0u;
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
            HatchImportMemoryToHatchScreenKt.PasteTextField(this.$value, this.$onValueChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatUploadError.values().length];
            try {
                AnonymousClass002.A13(ChatUploadError.PICKER_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ChatUploadError.READ_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ChatUploadError.TOO_LARGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ChatUploadError.UPLOAD_FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AddMemoryCta(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(377367114);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef9);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BS0 bs0 = BRg.A00;
            boolean z2 = (C7BY.A0j(str) || z) ? false : true;
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchImportMemoryToHatchScreenKt$AddMemoryCta$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z2, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d >> 3) & 14, 0, 134199749);
            C01N.A05(bfm, bs0);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f08);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, function0, bRg2, i, i2);
        }
    }

    public static final void CannedPromptCard(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1703237324);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C0fG c0fG = (C0fG) bfm.A6v(Am0.A02);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f0c);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).background;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C11U.A01(bRg2.then(c1062ATq), 16.0f);
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgA01, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A09(bs0, AuraDimensKt.SpacingMedium), jA06, c1822ArmA0B, null, null, null, false, 0, 6, 2, null, null, null, bfm, 805306368, 6, 14832);
            C3Ue.A04(C1b8.A02(c0z7.A4C(C2VU.A06, C10G.A04(c1062ATq, 64.0f)), C1EQ.A01(Arrays.asList(new B6A(B6A.A06), new B6A(j)), 0.0f, Float.POSITIVE_INFINITY), c1dm), bfm, 0);
            BRg bRgA09 = C3U4.A09(c0z7.A4C(C2VU.A07, bs0), 6.0f);
            boolean zA1N = AnonymousClass003.A1N(bfm, c0fG, strA01);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchImportMemoryToHatchScreenKt$CannedPromptCard$1$1$1(c0fG, strA01);
                bfm.Ai0(objAaT);
            }
            AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs((Function0) objAaT, bRgA09, false, 8.0f, 12.0f, 0.0f, false, ComposableSingletons$HatchImportMemoryToHatchScreenKt.f259lambda$113438092, bfm, 12610944, 96);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136292(bRg2, i, i2);
        }
    }

    public static final void ChatUploadStatusRow(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1119104074);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C11U.A01(AnonymousClass001.A0R(bRg2), 16.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C1b8.A01(bRgA01, auraTheme.getColors(bfm, 6).background), AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchImportMemoryToHatchScreenKt$ChatUploadStatusRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, BRg.A00, false), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 5, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, g0v, i, i2);
        }
    }

    public static final void HatchImportMemoryToHatchScreen(Function0<Unit> function0, HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, hatchImportMemoryToHatchViewModel);
        bfm.AgG(-1641279859);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchImportMemoryToHatchViewModel, bfm, i) ? 1 : 0);
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
            C1BO c1boA02 = C2CK.A02(bfm, hatchImportMemoryToHatchViewModel.uiState);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HpR hpR = new HpR();
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, contextA0H, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchImportMemoryToHatchViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$zipPickerLauncher$1$1(hatchImportMemoryToHatchViewModel, contextA0H);
                bfm.Ai0(objAaT);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT);
            boolean zA65 = bfm.A65(c7ouA00) | (i4 == 32 || ((iA0T & 64) != 0 && bfm.A65(hatchImportMemoryToHatchViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$openZipPicker$1$1(c7ouA00, hatchImportMemoryToHatchViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            Unit unit = Unit.INSTANCE;
            boolean zA1T2 = AnonymousClass004.A1T(bfm, contextA0H, auraNavigatorA0b, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchImportMemoryToHatchViewModel)));
            Object objAaT3 = bfm.AaT();
            if (zA1T2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$1$1(hatchImportMemoryToHatchViewModel, contextA0H, auraNavigatorA0b, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, unit);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f0e), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.IMPORT_MEMORY_TO_HATCH), zA1b, B1V.A00(bfm, new C136302(hatchImportMemoryToHatchViewModel, function02, c1boA02), -184014872), bfm, AnonymousClass001.A05(iA0T << 18, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), zA1b ? 1 : 0, (HatchBackClickAnalytics.$stable << 21) | 805306368, 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136313(function0, hatchImportMemoryToHatchViewModel, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ImportChatsSection(com.facebook.aura.settings.importmemory.ChatUploadState r50, com.facebook.aura.settings.importmemory.ChatUploadError r51, boolean r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, X.BRg r55, X.BFM r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt.ImportChatsSection(com.facebook.aura.settings.importmemory.ChatUploadState, com.facebook.aura.settings.importmemory.ChatUploadError, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void PasteTextField(String str, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1989160849);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f0b);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AbstractC1874Aso.A03(null, null, null, bfm, C3U4.A09(C1b8.A01(C11U.A01(C1DI.A02(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 240.0f), C1D8.A00(16.0f), 1.0f, auraTheme.getColors(bfm, 6).textInput.unfocusedBorderColor), 16.0f), AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable)), AuraDimensKt.SpacingMedium), new C1326AhD(auraTheme.getColors(bfm, 6).textInput.cursorColor), C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C3cH.A06(bfm, auraTheme), 0L, 0L, 0L), null, str, g0u, null, B1V.A00(bfm, new AnonymousClass1(str, strA01), 979341812), 10, 0, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 196608, 15832, false, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136332(str, g0u, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ HatchImportMemoryToHatchUiState access$HatchImportMemoryToHatchScreen$lambda$0(C1BO c1bo) {
        return (HatchImportMemoryToHatchUiState) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* renamed from: ImportMemoryScrollableContent-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1976ImportMemoryScrollableContentLJWHXA8(java.lang.String r52, X.G0U<? super java.lang.String, kotlin.Unit> r53, com.facebook.aura.settings.importmemory.ChatUploadState r54, com.facebook.aura.settings.importmemory.ChatUploadError r55, boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, float r60, float r61, X.BRg r62, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt.m1976ImportMemoryScrollableContentLJWHXA8(java.lang.String, X.G0U, com.facebook.aura.settings.importmemory.ChatUploadState, com.facebook.aura.settings.importmemory.ChatUploadError, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, float, X.BRg, X.BFM, int, int, int):void");
    }
}
