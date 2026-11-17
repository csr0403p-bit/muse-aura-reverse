package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC2271BQs;
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
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DE;
import X.C1DI;
import X.C1YD;
import X.C1YL;
import X.C2VU;
import X.C31u;
import X.C3TH;
import X.C3U4;
import X.C7462Ewq;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.settings.MC;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessengerSettingsScreenKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchMessengerSettingsScreenKt.class, "facebookAccountLearnMoreUrl", "getFacebookAccountLearnMoreUrl()Ljava/lang/String;", 1)};
    public static final C31u facebookAccountLearnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.facebook_account_learn_more_url);

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$AddFacebookProfileCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $entityName;
        public final /* synthetic */ Function0<Unit> $onLinked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$entityName = str;
            this.$onLinked = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessengerSettingsScreenKt.AddFacebookProfileCard(this.$entityName, this.$onLinked, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$FacebookAccountLearnMoreText$2, reason: invalid class name and case insensitive filesystem */
    public final class C135432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135432(BRg bRg, int i, int i2) {
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
            HatchMessengerSettingsScreenKt.FacebookAccountLearnMoreText(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $initialIsLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, boolean z, BRg bRg, HatchMessengerViewModel hatchMessengerViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$initialIsLinked = z;
            this.$modifier = bRg;
            this.$viewModel = hatchMessengerViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessengerSettingsScreenKt.HatchMessengerSettingsScreen(this.$onBack, this.$initialIsLinked, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$LinkedFBAccountCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LinkedFBAccountInfo $account;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135442(LinkedFBAccountInfo linkedFBAccountInfo, BRg bRg, int i, int i2) {
            super(2);
            this.$account = linkedFBAccountInfo;
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
            HatchMessengerSettingsScreenKt.LinkedFBAccountCard(this.$account, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConnectedContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isDisconnectMode;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onDisconnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, Function0<Unit> function0, boolean z2, int i, int i2) {
            super(2);
            this.$isDisconnectMode = z;
            this.$onDisconnect = function0;
            this.$isLoading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessengerSettingsScreenKt.MessengerConnectedContent(this.$isDisconnectMode, this.$onDisconnect, this.$isLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConnectedScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchMessengerUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchMessengerUiState hatchMessengerUiState) {
            super(3);
            this.$uiState = hatchMessengerUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                LinkedFBAccountInfo linkedFBAccountInfo = this.$uiState.linkedFBAccount;
                if (linkedFBAccountInfo != null) {
                    bfm.AgE(-1308948646);
                    HatchMessengerSettingsScreenKt.LinkedFBAccountCard(linkedFBAccountInfo, C3U4.A04(BRg.A00, AuraDimensKt.SpacingMedium), bfm, LinkedFBAccountInfo.$stable, 0);
                } else {
                    bfm.AgE(-1308803535);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConnectedScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchMessengerUiState $uiState;
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, HatchMessengerViewModel hatchMessengerViewModel, HatchMessengerUiState hatchMessengerUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchMessengerViewModel;
            this.$uiState = hatchMessengerUiState;
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
            HatchMessengerSettingsScreenKt.MessengerConnectedScreen(this.$onBack, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConsentScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C135453 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $entityName;
        public final /* synthetic */ HatchMessengerUiState $uiState;
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135453(HatchMessengerUiState hatchMessengerUiState, String str, HatchMessengerViewModel hatchMessengerViewModel) {
            super(3);
            this.$uiState = hatchMessengerUiState;
            this.$entityName = str;
            this.$viewModel = hatchMessengerViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C01N.A06(bfm, BRg.A00);
                HatchMessengerUiState hatchMessengerUiState = this.$uiState;
                LinkedFBAccountInfo linkedFBAccountInfo = hatchMessengerUiState.linkedFBAccount;
                if (linkedFBAccountInfo != null) {
                    bfm.AgE(-14329656);
                    HatchMessengerSettingsScreenKt.LinkedFBAccountCard(linkedFBAccountInfo, null, bfm, LinkedFBAccountInfo.$stable, 2);
                    HatchMessengerSettingsScreenKt.FacebookAccountLearnMoreText(null, bfm, 0, 1);
                } else if (hatchMessengerUiState.hasFetchedFBAccounts) {
                    bfm.AgE(-14185382);
                    String str = this.$entityName;
                    boolean zA67 = bfm.A67(this.$viewModel);
                    HatchMessengerViewModel hatchMessengerViewModel = this.$viewModel;
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchMessengerSettingsScreenKt$MessengerConsentScreen$3$1$1(hatchMessengerViewModel);
                        bfm.Ai0(objAaT);
                    }
                    HatchMessengerSettingsScreenKt.AddFacebookProfileCard(str, (Function0) objAaT, bfm, 0);
                } else {
                    bfm.AgE(-13951859);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConsentScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C135464 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchMessengerUiState $uiState;
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135464(Function0<Unit> function0, HatchMessengerViewModel hatchMessengerViewModel, HatchMessengerUiState hatchMessengerUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchMessengerViewModel;
            this.$uiState = hatchMessengerUiState;
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
            HatchMessengerSettingsScreenKt.MessengerConsentScreen(this.$onBack, this.$viewModel, this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerOnboardingContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C135472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MessengerConnectPhase $connectPhase;
        public final /* synthetic */ LinkedFBAccountInfo $linkedFBAccount;
        public final /* synthetic */ Function0<Unit> $onConnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135472(MessengerConnectPhase messengerConnectPhase, Function0<Unit> function0, LinkedFBAccountInfo linkedFBAccountInfo, int i, int i2) {
            super(2);
            this.$connectPhase = messengerConnectPhase;
            this.$onConnect = function0;
            this.$linkedFBAccount = linkedFBAccountInfo;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessengerSettingsScreenKt.MessengerOnboardingContent(this.$connectPhase, this.$onConnect, this.$linkedFBAccount, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchMessengerSettingsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r14, boolean r15, X.BRg r16, com.facebook.aura.settings.HatchMessengerViewModel r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerSettingsScreenKt.HatchMessengerSettingsScreen(kotlin.jvm.functions.Function0, boolean, X.BRg, com.facebook.aura.settings.HatchMessengerViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r0 >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void launchMessengerOrPlayStore(android.content.Context r18, java.lang.String r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerSettingsScreenKt.launchMessengerOrPlayStore(android.content.Context, java.lang.String):void");
    }

    public static final void FacebookAccountLearnMoreText(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(623677547);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String facebookAccountLearnMoreUrl = getFacebookAccountLearnMoreUrl();
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRg2, 0.0f, f, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
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
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c7b), null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (facebookAccountLearnMoreUrl.length() > 0) {
                bfm.AgE(-206496035);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c7a);
                C1822Arm c1822ArmA0S = C06G.A0S(bfm);
                long jA0D = C06G.A0D(bfm);
                BRg bRgA0C2 = C3U4.A0C(BRg.A00, AuraDimensKt.SpacingMicro, 0.0f, 0.0f, 0.0f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchMessengerSettingsScreenKt$FacebookAccountLearnMoreText$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0C2, objAaT, false);
                C1YD c1yd = new C1YD(0);
                boolean zA1J = AnonymousClass003.A1J(bfm, facebookAccountLearnMoreUrl, contextA0H);
                Object objAaT2 = bfm.AaT();
                if (zA1J || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchMessengerSettingsScreenKt$FacebookAccountLearnMoreText$1$2$1(facebookAccountLearnMoreUrl, contextA0H);
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C0v5.A02(bRgA0Y, c1yd, objAaT2, null), jA0D, c1822ArmA0S, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(-206036677);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135432(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LinkedFBAccountCard(com.facebook.aura.settings.LinkedFBAccountInfo r35, X.BRg r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerSettingsScreenKt.LinkedFBAccountCard(com.facebook.aura.settings.LinkedFBAccountInfo, X.BRg, X.BFM, int, int):void");
    }

    public static final void MessengerConnectedContent(boolean z, Function0<Unit> function0, boolean z2, BFM bfm, int i, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        Function0<Unit> function02 = function0;
        bfm.AgG(-1506944864);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z3) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function02);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchMessengerSettingsScreenKt$MessengerConnectedContent$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            if (i5 != 0) {
                z4 = false;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C10G.A02, C06G.A00(bfm), 0.0f);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B2 = C3U4.A0B(bRgA0B, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.app_icon_messenger_squircle), C3U4.A0C(C10G.A07(bs0, 60.0f), 0.0f, 0.0f, 0.0f, f), null, null, false, false, null, false, null, bfm, 384, 504);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ede), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall), C06G.A0C(bfm), C06G.A0U(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            HatchTelegramSettingsScreenKt.StatusIndicator(true, null, false, bfm, 6, 6);
            if (z3) {
                bfm.AgE(1884341632);
                Object[] objArr = new Object[0];
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = HatchMessengerSettingsScreenKt$MessengerConnectedContent$2$showConfirmDialog$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206cd);
                BRg bRgA0C = C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f);
                boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA0N, bfm.A65(strA01), AnonymousClass006.A1W(iA0n));
                Object objAaT3 = bfm.AaT();
                if (zA1W || objAaT3 == obj) {
                    objAaT3 = new HatchMessengerSettingsScreenKt$MessengerConnectedContent$2$1$1(z4, strA01, mutableStateA0N);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C, null, null, null, null, null, null, false, (G0U) objAaT3, bfm, 0, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
                if (MutableState.A0A(mutableStateA0N)) {
                    bfm.AgE(1885075650);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                    String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cf1);
                    String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cf0);
                    B1U b1uA00 = B1V.A00(bfm, new HatchMessengerSettingsScreenKt$MessengerConnectedContent$2$2(function02, strA01, mutableStateA0N, strA012), -272855677);
                    boolean zA65 = bfm.A65(mutableStateA0N);
                    Object objAaT4 = bfm.AaT();
                    if (zA65 || objAaT4 == obj) {
                        objAaT4 = new HatchMessengerSettingsScreenKt$MessengerConnectedContent$2$3$1(mutableStateA0N);
                        bfm.Ai0(objAaT4);
                    }
                    AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, strA014, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT4, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
                } else {
                    bfm.AgE(1885896344);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1885902296);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z3, function02, z4, i, i2);
        }
    }

    public static final void MessengerConnectedScreen(Function0<Unit> function0, HatchMessengerViewModel hatchMessengerViewModel, HatchMessengerUiState hatchMessengerUiState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(970520157);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchMessengerViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchMessengerUiState, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            HatchScreen hatchScreen = HatchScreen.CHANNELS_MESSENGER;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ede);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cf4);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean z = hatchMessengerUiState.showDisconnectDialog;
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cf1);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cf0);
            boolean zA67 = ((iA0T & 896) == 256 || ((iA0T & 512) != 0 && bfm.A67(hatchMessengerUiState))) | bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchMessengerSettingsScreenKt$MessengerConnectedScreen$1$1(contextA0H, hatchMessengerUiState);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z2 = i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchMessengerViewModel));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessengerSettingsScreenKt$MessengerConnectedScreen$2$1(hatchMessengerViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            boolean z3 = i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchMessengerViewModel));
            Object objAaT3 = bfm.AaT();
            if (z3 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchMessengerSettingsScreenKt$MessengerConnectedScreen$3$1(hatchMessengerViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function04 = (Function0) objAaT3;
            boolean z4 = i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchMessengerViewModel));
            Object objAaT4 = bfm.AaT();
            if (z4 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchMessengerSettingsScreenKt$MessengerConnectedScreen$4$1(hatchMessengerViewModel);
                bfm.Ai0(objAaT4);
            }
            ChannelSettingsScreensKt.m1898ChannelConnectedScreenZSrRDQQ(hatchScreen, strA01, strA012, auraButtonSize, z, strA013, strA014, function0, function02, function03, function04, (Function0) objAaT4, ComposableSingletons$HatchMessengerSettingsScreenKt.f237lambda$306314587, bRg2, null, 24.0f, B1V.A00(bfm, new AnonymousClass5(hatchMessengerUiState), 1977535409), false, bfm, ((iA0T << 21) & 29360128) | 3078, (iA0T & 7168) | 1769856, 147456);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(function0, hatchMessengerViewModel, hatchMessengerUiState, bRg2, i, i2);
        }
    }

    public static final void MessengerConsentScreen(Function0<Unit> function0, HatchMessengerViewModel hatchMessengerViewModel, HatchMessengerUiState hatchMessengerUiState, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-628192210);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchMessengerViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchMessengerUiState, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(hatchMessengerUiState.connectPhase, MessengerConnectPhase.CONNECTING);
            String selectedAssistantName = JarvisUtils.INSTANCE.getSelectedAssistantName(AnonymousClass002.A0h(bfm));
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Boolean boolValueOf = Boolean.valueOf(hatchMessengerUiState.showAccountLinkingUpsell);
            boolean z2 = (iA0T & 896) == 256 || ((iA0T & 512) != 0 && bfm.A67(hatchMessengerUiState));
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, z2, i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchMessengerViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1(hatchMessengerUiState, hatchMessengerViewModel, contextA0H);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            if (zA1Z) {
                bfm.AgE(-1300608216);
                i3 = R.string._name_removed__res_0x7f120cef;
            } else {
                bfm.AgE(-1300526748);
                i3 = R.string._name_removed__res_0x7f120cec;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            boolean zA1W = AnonymousClass001.A1W(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ede);
            String strA0t = AnonymousClass001.A0t(bfm, selectedAssistantName, R.string._name_removed__res_0x7f120ce9);
            if (i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchMessengerViewModel))) {
                z = true;
            }
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessengerSettingsScreenKt$MessengerConsentScreen$2$1(hatchMessengerViewModel);
                bfm.Ai0(objAaT2);
            }
            int i6 = iA0T << 12;
            ChannelSettingsScreensKt.m1899ChannelConsentScreenWsuR4So(strA012, strA0t, strA01, zA1Z, function0, (Function0) objAaT2, ComposableSingletons$HatchMessengerSettingsScreenKt.lambda$1087092472, bRg2, null, zA1W, 24.0f, AuraButtonSize.MEDIUM, B1V.A00(bfm, new C135453(hatchMessengerUiState, selectedAssistantName, hatchMessengerViewModel), -856946731), null, bfm, AnonymousClass001.A0C(i6, (57344 & i6) | 1572864), 438, 8960);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135464(function0, hatchMessengerViewModel, hatchMessengerUiState, bRg2, i, i2);
        }
    }

    public static final void MessengerOnboardingContent(MessengerConnectPhase messengerConnectPhase, Function0<Unit> function0, LinkedFBAccountInfo linkedFBAccountInfo, BFM bfm, int i, int i2) {
        String strA0s;
        LinkedFBAccountInfo linkedFBAccountInfo2 = linkedFBAccountInfo;
        boolean zA1a = AnonymousClass002.A1a(messengerConnectPhase, function0);
        bfm.AgG(-704727774);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, messengerConnectPhase) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass003.A05(AnonymousClass004.A1Z(linkedFBAccountInfo2, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                linkedFBAccountInfo2 = null;
            }
            boolean zA1Z = AnonymousClass002.A1Z(messengerConnectPhase, MessengerConnectPhase.CONNECTING);
            String selectedAssistantName = JarvisUtils.INSTANCE.getSelectedAssistantName(AnonymousClass002.A0h(bfm));
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, 20.0f, 0.0f), 0.0f, 24.0f, 0.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.app_icon_messenger_squircle), C10G.A07(bs0, 40.0f), null, null, false, false, null, false, null, bfm, 432, 504);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ede), C3U4.A0C(bs0, 0.0f, 12.0f, 0.0f, AuraDimensKt.SpacingSmall), C06G.A0C(bfm), C06G.A0U(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, selectedAssistantName, R.string._name_removed__res_0x7f120ce9), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 12.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            if (linkedFBAccountInfo2 != null) {
                bfm.AgE(70711574);
                LinkedFBAccountCard(linkedFBAccountInfo2, null, bfm, LinkedFBAccountInfo.$stable | ((iA08 >> 6) & 14), 2);
                FacebookAccountLearnMoreText(null, bfm, 0, zA1a ? 1 : 0);
            } else {
                bfm.AgE(70832660);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
            AuraDividerKt.AuraDivider(c1062ATq, AuraDividerStyle.Secondary.INSTANCE, false, bfm, 54, 4);
            BRg bRgA0C2 = C3U4.A0C(C3U4.A0B(c1062ATq, 20.0f, 0.0f), 0.0f, 12.0f, 0.0f, 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c7c), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 10.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            if (zA1Z) {
                bfm.AgE(-497336183);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120cef);
            } else {
                bfm.AgE(-497246779);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120cec);
            }
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, zA1a ? 1 : 0);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean z = !zA1Z;
            boolean zA1C = AnonymousClass003.A1C(iA08);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchMessengerSettingsScreenKt$MessengerOnboardingContent$1$2$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
            BBI.A0R(bbi, zA1a);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135472(messengerConnectPhase, function0, linkedFBAccountInfo2, i, i2);
        }
    }

    public static final String getFacebookAccountLearnMoreUrl() {
        return (String) C31u.A00(facebookAccountLearnMoreUrl$delegate, $$delegatedProperties);
    }

    public static final void AddFacebookProfileCard(String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1214272904);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C1D8.A00(12.0f);
                bfm.Ai0(objAaT);
            }
            C1DE c1de = (C1DE) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new B6A(4292797417L << 32);
                bfm.Ai0(objAaT2);
            }
            long j = ((B6A) objAaT2).A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(C1DI.A02(C11U.A03(C10G.A02, c1de), c1de, 1.0f, j), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i2);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ce6), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall), C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120ce5), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingXsmall), C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            boolean zA67 = bfm.A67(contextA0H) | AnonymousClass003.A1C(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchMessengerSettingsScreenKt$AddFacebookProfileCard$1$1$1(contextA0H, function0);
                bfm.Ai0(objAaT3);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bs0, null, null, null, null, null, null, true, (G0U) objAaT3, bfm, 12582918, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, i);
        }
    }

    public static final /* synthetic */ HatchMessengerUiState access$HatchMessengerSettingsScreen$lambda$0(C1BO c1bo) {
        return (HatchMessengerUiState) c1bo.getValue();
    }
}
