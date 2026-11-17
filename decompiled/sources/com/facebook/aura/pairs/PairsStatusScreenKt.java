package com.facebook.aura.pairs;

import X.AKQ;
import X.AYD;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsRole;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.pairs.PairsStatusEffect;
import com.facebook.aura.pairs.PairsStatusUiState;
import com.facebook.aura.pairs.PairsStatusViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsStatusScreenKt {

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusActions$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ PairsStatusUiState.Loaded $state;
        public final /* synthetic */ PairsStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PairsStatusUiState.Loaded loaded, PairsStatusViewModel pairsStatusViewModel, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, int i) {
            super(2);
            this.$state = loaded;
            this.$viewModel = pairsStatusViewModel;
            this.$log = connectionsLogContext;
            this.$onRemove = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusActions(this.$state, this.$viewModel, this.$log, this.$onRemove, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusAvatar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsContact $contact;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsContact pairsContact, BRg bRg, int i, int i2) {
            super(2);
            this.$contact = pairsContact;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusAvatar(this.$contact, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C129912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PairsStatusUiState.Loaded $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129912(PairsStatusUiState.Loaded loaded, BRg bRg, int i, int i2) {
            super(2);
            this.$state = loaded;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusContent(this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$3, reason: invalid class name and case insensitive filesystem */
    public final class C129923 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $fromHub;
        public final /* synthetic */ PairsStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129923(PairsStatusViewModel pairsStatusViewModel, boolean z, int i) {
            super(2);
            this.$viewModel = pairsStatusViewModel;
            this.$fromHub = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusEffects(this.$viewModel, this.$fromHub, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusPromptDetails$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PairsStatusUiState.Loaded $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PairsStatusUiState.Loaded loaded, int i) {
            super(2);
            this.$state = loaded;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusPromptDetails(this.$state, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C129932 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<PairsStatusUiState> $uiState$delegate;
        public final /* synthetic */ PairsStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C129932(ConnectionsLogContext connectionsLogContext, PairsStatusViewModel pairsStatusViewModel, C1BO<? extends PairsStatusUiState> c1bo) {
            super(3);
            this.$log = connectionsLogContext;
            this.$viewModel = pairsStatusViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            PairsStatusUiState value = this.$uiState$delegate.getValue();
            if (C7384Etj.areEqual(value, PairsStatusUiState.Loading.INSTANCE)) {
                bfm.AgE(1163010730);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (C7384Etj.areEqual(value, PairsStatusUiState.Unavailable.INSTANCE)) {
                bfm.AgE(1163012984);
                PairsComponentsKt.PairsMessage(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d9e), PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_UNAVAILABLE_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60), null, bfm, 0, 4);
            } else if (C7384Etj.areEqual(value, PairsStatusUiState.Failed.INSTANCE)) {
                bfm.AgE(1163020586);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d75);
                BRg bRgA0G = C60R.A0G(bfm, HatchComponent.CONNECTIONS_ERROR_STATE, this.$log, ConnectionsLogContext.$stable);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                ConnectionsLogContext connectionsLogContext = this.$log;
                PairsStatusViewModel pairsStatusViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new PairsStatusScreenKt$PairsStatusScreen$2$1$1(connectionsLogContext, pairsStatusViewModel);
                    bfm.Ai0(objAaT);
                }
                PairsComponentsKt.PairsMessage(strA01, bRgA0G, (Function0) objAaT, bfm, 0, 0);
            } else {
                if (!(value instanceof PairsStatusUiState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, 1163009652);
                }
                bfm.AgE(1163031811);
                PairsStatusUiState.Loaded loaded = (PairsStatusUiState.Loaded) value;
                PairsStatusScreenKt.PairsStatusContent(loaded, PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, PairsAnalytics.INSTANCE.pairingStatus$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(loaded.kind), null, loaded.kind.name(), bfm, ConnectionsLogContext.$stable | 48, 20), bfm, PairsStatusUiState.Loaded.$stable, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsStatusSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(PairsStatusSheetKey pairsStatusSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = pairsStatusSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusSecondaryButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C129941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129941(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsStatusScreenKt.PairsStatusSecondaryButton(this.$text, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsStatusKind.values().length];
            try {
                AnonymousClass002.A13(PairsStatusKind.WAITING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsStatusKind.PROMPT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PairsStatusKind.VERIFIED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PairsStatusKind.GONE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PairsStatusKind.UNREACHABLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PairsStatusKind.EXPIRED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PairsStatusKind.IDENTITY_CHANGED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PairsStatusKind.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PairsStatusAvatar(PairsContact pairsContact, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1835667874);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsContact, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, 72.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            PairsImageRef pairsImageRef = pairsContact.photo;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).card;
            int i4 = PairsImageRef.$stable;
            PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsImageRef, 72.0f, null, j, bfm, i4 | 48, 4);
            PairsComponentsKt.m1663PairsMuseAvataruFdPcIQ(pairsContact.avatar, 32.0f, C1DI.A02(AYD.A01(c0z7.A4C(C2VU.A07, BRg.A00), 4.5f, 0.0f), C1D8.A00(8.0f), 1.0f, auraTheme.getColors(bfm, 6).avatarBorder), bfm, i4 | 48, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pairsContact, bRg2, i, i2);
        }
    }

    public static final void PairsStatusContent(PairsStatusUiState.Loaded loaded, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        BRg bRgA0Q = bRg;
        bfm.AgG(1247011734);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            PairsContact pairsContact = loaded.snapshot.contact;
            if (pairsContact == null || (str = pairsContact.displayName) == null) {
                str = "";
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(AnonymousClass007.A0H(bfm, bRgA0Q, c1062ATq), 20.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            if (pairsContact != null) {
                bfm.AgE(1286211462);
                PairsStatusAvatar(pairsContact, null, bfm, PairsContact.$stable, 2);
            } else {
                bfm.AgE(1217874646);
            }
            BBI.A0R(bbi, false);
            int i4 = PairsStatusUiState.Loaded.$stable;
            int i5 = iA05 & 14;
            String strStatusTitle = statusTitle(loaded, str, bfm, i4 | i5);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 12.0f, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PairsStatusScreenKt$PairsStatusContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strStatusTitle, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            int i6 = i4 | i5;
            String strStatusMessage = statusMessage(loaded, str, bfm, i6);
            if (strStatusMessage == null) {
                bfm.AgE(1218288557);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strStatusMessage, C3U4.A0C(c1062ATq, 0.0f, 4.0f, 0.0f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1218288558).bodyRegular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            }
            BBI.A0R(bbi, false);
            if (loaded.kind == PairsStatusKind.PROMPT) {
                bfm.AgE(1286235339);
                PairsStatusPromptDetails(loaded, bfm, i6);
            } else {
                bfm.AgE(1218619638);
            }
            BBI.A0R(bbi, false);
            if (loaded.kind == PairsStatusKind.WAITING) {
                bfm.AgE(1218669362);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(C3U4.A0C(bs0, 0.0f, 24.0f, 0.0f, 0.0f), 24.0f), null, 0L, bfm, 6, 6);
            } else {
                bfm.AgE(1218734710);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129912(loaded, bRgA0Q, i, i2);
        }
    }

    public static final void PairsStatusScreen(PairsStatusSheetKey pairsStatusSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA07;
        String str;
        String strA0t;
        PairsStatusSnapshot pairsStatusSnapshot;
        PairsContact pairsContact;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pairsStatusSheetKey, 0);
        bfm.AgG(-836797487);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, pairsStatusSheetKey) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str2 = ((CH0) abstractC3358CGzA0h).A01;
            String str3 = pairsStatusSheetKey.generationId;
            String strA0d = FGI.A0d("pairs-status:", str2, ":", str3);
            PairsStatusViewModel.Factory factory = new PairsStatusViewModel.Factory(abstractC3358CGzA0h, str3, pairsStatusSheetKey.role, pairsStatusSheetKey.fromHub);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PairsStatusViewModel pairsStatusViewModel = (PairsStatusViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), PairsStatusViewModel.class, strA0d);
            C1BO c1boA02 = C2CK.A02(bfm, pairsStatusViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            B1U b1uA00 = null;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_PAIRING_STATUS, bfm, 6);
            PairsStatusEffects(pairsStatusViewModel, pairsStatusSheetKey.fromHub, bfm, PairsStatusViewModel.$stable);
            PairsStatusUiState pairsStatusUiState = (PairsStatusUiState) c1boA02.getValue();
            PairsStatusUiState.Loaded loaded = pairsStatusUiState instanceof PairsStatusUiState.Loaded ? (PairsStatusUiState.Loaded) pairsStatusUiState : null;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "pairs-status");
            boolean z = pairsStatusSheetKey.fromHub;
            if (loaded == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, -1042930336);
            } else {
                bfm.AgE(-1042930335);
                b1uA00 = B1V.A00(bfm, new PairsStatusScreenKt$PairsStatusScreen$1$1(loaded, pairsStatusViewModel, connectionsLogContextRememberConnectionsLogContext, mutableState), 1470786816);
                bbiA07 = C3cG.A07(bfm);
            }
            PairsComponentsKt.PairsSheet(bRgA00, null, z, null, null, true, null, b1uA00, B1V.A00(bfm, new C129932(connectionsLogContextRememberConnectionsLogContext, pairsStatusViewModel, c1boA02), -2126161732), bfm, 100859904, 90);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1041495221);
                if (loaded == null || (pairsStatusSnapshot = loaded.snapshot) == null || (pairsContact = pairsStatusSnapshot.contact) == null || (str = pairsContact.displayName) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    bfm.AgE(-1041315297);
                    strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d83);
                } else {
                    bfm.AgE(-1041196319);
                    strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120d82);
                }
                BBI.A0R(bbiA07, false);
                PairsConfirmation pairsConfirmationA0S = C60R.A0S(bfm, strA0t, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d81), R.string._name_removed__res_0x7f120d80);
                boolean zA1M = AnonymousClass003.A1M(bfm, connectionsLogContextRememberConnectionsLogContext, pairsStatusViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == obj) {
                    objAaT2 = new PairsStatusScreenKt$PairsStatusScreen$3$1(connectionsLogContextRememberConnectionsLogContext, pairsStatusViewModel, mutableState);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean zA67 = bfm.A67(connectionsLogContextRememberConnectionsLogContext);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == obj) {
                    objAaT3 = new PairsStatusScreenKt$PairsStatusScreen$4$1(connectionsLogContextRememberConnectionsLogContext, mutableState);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == obj) {
                    objAaT4 = new PairsStatusScreenKt$PairsStatusScreen$5$1(mutableState);
                    bfm.Ai0(objAaT4);
                }
                PairsComponentsKt.PairsConfirmationDialog(pairsConfirmationA0S, function0, function02, (Function0) objAaT4, null, bfm, PairsConfirmation.$stable | 3072, 16);
            } else {
                bfm.AgE(-1040413135);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(pairsStatusSheetKey, bRg2, i, i2);
        }
    }

    public static final void PairsStatusSecondaryButton(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1373101119);
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
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, AnonymousClass001.A0R(bRg2), AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, (iA0d << 9) & 57344, 0, 134201317);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129941(str, function0, bRg2, i, i2);
        }
    }

    public static final String statusMessage(PairsStatusUiState.Loaded loaded, String str, BFM bfm, int i) {
        int i2;
        int i3;
        String strA01;
        Object[] objArr;
        switch (loaded.kind.ordinal()) {
            case 0:
            case 2:
            case 7:
                AnonymousClass003.A0l(bfm, 408792479);
                return null;
            case 1:
                bfm.AgE(-125395337);
                i2 = R.string._name_removed__res_0x7f120d92;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 3:
                bfm.AgE(-125391634);
                PairsStatusSnapshot pairsStatusSnapshot = loaded.snapshot;
                if (pairsStatusSnapshot.role == PairsRole.RECEIVER && !pairsStatusSnapshot.getCanRetryAccept()) {
                    bfm.AgE(-125388340);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d72);
                    AnonymousClass001.A1D(bfm);
                    AnonymousClass001.A1D(bfm);
                    return strA01;
                }
                if (str.length() == 0) {
                    bfm.AgE(-125385329);
                    i3 = R.string._name_removed__res_0x7f120d9a;
                    objArr = new Object[]{HatchAppName.value};
                    strA01 = AbstractC2271BQs.A02(bfm, objArr, i3);
                    AnonymousClass001.A1D(bfm);
                    AnonymousClass001.A1D(bfm);
                    return strA01;
                }
                bfm.AgE(-125382067);
                i3 = R.string._name_removed__res_0x7f120d99;
                objArr = new Object[]{str, HatchAppName.value};
                strA01 = AbstractC2271BQs.A02(bfm, objArr, i3);
                AnonymousClass001.A1D(bfm);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 4:
                bfm.AgE(-125378089);
                i2 = R.string._name_removed__res_0x7f120d96;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 5:
                bfm.AgE(-125374392);
                if (str.length() == 0) {
                    bfm.AgE(408376987);
                    i3 = R.string._name_removed__res_0x7f120d67;
                    objArr = new Object[]{HatchAppName.value};
                    strA01 = AbstractC2271BQs.A02(bfm, objArr, i3);
                    AnonymousClass001.A1D(bfm);
                    AnonymousClass001.A1D(bfm);
                    return strA01;
                }
                bfm.AgE(408487037);
                i3 = R.string._name_removed__res_0x7f120d66;
                objArr = new Object[]{str, HatchAppName.value};
                strA01 = AbstractC2271BQs.A02(bfm, objArr, i3);
                AnonymousClass001.A1D(bfm);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 6:
                bfm.AgE(-125365536);
                strA01 = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120d9e);
                AnonymousClass001.A1D(bfm);
                return strA01;
            default:
                throw AnonymousClass005.A0k(bfm, -125395905);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177 A[PHI: r19
  0x0177: PHI (r19v4 boolean) = (r19v1 boolean), (r19v5 boolean) binds: [B:54:0x010c, B:52:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PairsStatusActions(com.facebook.aura.pairs.PairsStatusUiState.Loaded r19, com.facebook.aura.pairs.PairsStatusViewModel r20, com.facebook.aura.pairs.ConnectionsLogContext r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, X.BFM r23, int r24) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsStatusScreenKt.PairsStatusActions(com.facebook.aura.pairs.PairsStatusUiState$Loaded, com.facebook.aura.pairs.PairsStatusViewModel, com.facebook.aura.pairs.ConnectionsLogContext, kotlin.jvm.functions.Function0, X.BFM, int):void");
    }

    public static final void PairsStatusEffects(PairsStatusViewModel pairsStatusViewModel, boolean z, BFM bfm, int i) {
        String strA0e;
        bfm.AgG(972108912);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsStatusViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass003.A1C(iA05), (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pairsStatusViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == obj) {
                objAaT2 = new PairsStatusScreenKt$PairsStatusEffects$1$1(pairsStatusViewModel, z, auraNavigatorA0b, mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, pairsStatusViewModel, auraNavigatorA0b);
            PairsStatusEffect.Leave leave = (PairsStatusEffect.Leave) mutableState.getValue();
            if (leave == null) {
                bfm.AgE(-867091918);
            } else {
                bfm.AgE(-867091917);
                Integer num = leave.toast;
                if (num == null) {
                    AnonymousClass003.A0l(bfm, -1284016737);
                    strA0e = null;
                } else {
                    int iIntValue = num.intValue();
                    if (iIntValue == R.string._name_removed__res_0x7f120d94) {
                        bfm.AgE(789865863);
                        strA0e = AnonymousClass001.A0t(bfm, leave.toastName, iIntValue);
                        AnonymousClass001.A1D(bfm);
                    } else {
                        bfm.AgE(789867765);
                        strA0e = AnonymousClass003.A0e(bfm, iIntValue);
                    }
                }
                boolean zA65 = bfm.A65(strA0e);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new PairsStatusScreenKt$PairsStatusEffects$2$1$1(strA0e, mutableState, null);
                    bfm.Ai0(objAaT3);
                }
                AnonymousClass001.A18(bfm, objAaT3, leave);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129923(pairsStatusViewModel, z, i);
        }
    }

    public static final void PairsStatusPromptDetails(PairsStatusUiState.Loaded loaded, BFM bfm, int i) {
        bfm.AgG(2090015516);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            PairsContact pairsContact = loaded.snapshot.contact;
            if (pairsContact == null || !pairsContact.attested) {
                bfm.AgE(-488143066);
            } else {
                bfm.AgE(-488522785);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d98);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C1b8.A03(C3U4.A04(BRg.A00, 12.0f), C1D8.A00(12.0f), auraTheme.getColors(bfm, 6).card), 10.0f, 4.0f), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(loaded, i);
        }
    }

    public static final /* synthetic */ PairsStatusUiState access$PairsStatusScreen$lambda$0(C1BO c1bo) {
        return (PairsStatusUiState) c1bo.getValue();
    }

    public static final String statusTitle(PairsStatusUiState.Loaded loaded, String str, BFM bfm, int i) {
        int i2;
        int i3;
        bfm.AgE(261231306);
        int length = str.length();
        String strA01 = length == 0 ? AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da0) : str;
        BBI bbiA07 = C3cG.A07(bfm);
        switch (loaded.kind.ordinal()) {
            case 0:
                bfm.AgE(261235844);
                PairsContact pairsContact = loaded.snapshot.contact;
                if (pairsContact != null && pairsContact.getHasConfirmedLocally()) {
                    bfm.AgE(261238349);
                    if (length == 0) {
                        bfm.AgE(261239441);
                        strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d9c);
                    } else {
                        bfm.AgE(261242255);
                        strA01 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120d9b);
                    }
                    BBI.A0R(bbiA07, false);
                    BBI.A0R(bbiA07, false);
                    BBI.A0R(bbiA07, false);
                    return strA01;
                }
                if (length == 0) {
                    bfm.AgE(261245280);
                    i3 = R.string._name_removed__res_0x7f120da2;
                    strA01 = AbstractC2271BQs.A01(bfm, i3);
                    BBI.A0R(bbiA07, false);
                    BBI.A0R(bbiA07, false);
                    return strA01;
                }
                bfm.AgE(261247521);
                i2 = R.string._name_removed__res_0x7f120da1;
                strA01 = AnonymousClass001.A0t(bfm, str, i2);
                BBI.A0R(bbiA07, false);
                BBI.A0R(bbiA07, false);
                return strA01;
            case 1:
                bfm.AgE(261250847);
                if (length == 0) {
                    bfm.AgE(261251398);
                    i3 = R.string._name_removed__res_0x7f120d91;
                    strA01 = AbstractC2271BQs.A01(bfm, i3);
                    BBI.A0R(bbiA07, false);
                    BBI.A0R(bbiA07, false);
                    return strA01;
                }
                bfm.AgE(261253668);
                i2 = R.string._name_removed__res_0x7f120d8f;
                strA01 = AnonymousClass001.A0t(bfm, str, i2);
                BBI.A0R(bbiA07, false);
                BBI.A0R(bbiA07, false);
                return strA01;
            case 2:
                bfm.AgE(261256829);
                if (length == 0) {
                    bfm.AgE(261257381);
                    i3 = R.string._name_removed__res_0x7f120d95;
                    strA01 = AbstractC2271BQs.A01(bfm, i3);
                    BBI.A0R(bbiA07, false);
                    BBI.A0R(bbiA07, false);
                    return strA01;
                }
                bfm.AgE(261259619);
                i2 = R.string._name_removed__res_0x7f120d94;
                strA01 = AnonymousClass001.A0t(bfm, str, i2);
                BBI.A0R(bbiA07, false);
                BBI.A0R(bbiA07, false);
                return strA01;
            case 3:
            case 4:
            case 5:
            case 6:
                bfm.AgE(261268306);
                BBI.A0R(bbiA07, false);
                return strA01;
            case 7:
                bfm.AgE(261262275);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d97);
                BBI.A0R(bbiA07, false);
                return strA01;
            default:
                throw AnonymousClass003.A0k(bfm, bbiA07, 261234613);
        }
    }
}
