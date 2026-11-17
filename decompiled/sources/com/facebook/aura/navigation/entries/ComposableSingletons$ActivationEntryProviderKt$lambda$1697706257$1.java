package com.facebook.aura.navigation.entries;

import X.AKH;
import X.AKL;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C22I;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.activation.data.HatchTosMetadata;
import com.facebook.aura.activation.data.HatchUpsellCell;
import com.facebook.aura.activation.model.AuraActivationViewModel;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.activation.model.AuraInviteCodeViewModel;
import com.facebook.aura.activation.model.AuraNdaViewModel;
import com.facebook.aura.activation.view.AuraActivationScreenKt;
import com.facebook.aura.activation.view.AuraUserStateOverlayKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1 extends AbstractC7559F3s implements G0W<ActivationScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1 INSTANCE = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1();

    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1() {
        super(3);
    }

    public static final /* synthetic */ AuraActivationViewModel.UiState access$invoke$lambda$0(C1BO c1bo) {
        return (AuraActivationViewModel.UiState) c1bo.getValue();
    }

    public final void invoke(ActivationScreenKey activationScreenKey, BFM bfm, int i) {
        String str;
        BBI bbiA0M;
        boolean z = false;
        C7384Etj.A0Y(activationScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        Context contextA0O = AnonymousClass003.A0O(bfm);
        View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
        AuraActivationViewModel.Factory factory = new AuraActivationViewModel.Factory(abstractC3358CGzA0g);
        AKH<Activity> akh = AKL.A00;
        Object objA6v = bfm.A6v(akh);
        C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ComponentActivity componentActivity = (ComponentActivity) objA6v;
        AuraActivationViewModel auraActivationViewModel = (AuraActivationViewModel) C3cH.A0H(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(AuraActivationViewModel.class));
        C1BO c1boA02 = C2CK.A02(bfm, auraActivationViewModel.uiState);
        Boolean boolValueOf = Boolean.valueOf(activationScreenKey.wearablesStepRequested);
        boolean zA1M = AnonymousClass003.A1M(bfm, auraActivationViewModel, activationScreenKey);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$1$1(auraActivationViewModel, activationScreenKey);
            bfm.Ai0(objAaT);
        }
        AnonymousClass001.A17(bfm, objAaT, boolValueOf);
        ActivationState activationState = ((AuraActivationViewModel.UiState) c1boA02.getValue()).activationState;
        boolean zA1O = C3cH.A1O(bfm, c1boA02, abstractC3358CGzA0g, auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA1O || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$2$1(abstractC3358CGzA0g, auraNavigatorA0b, c1boA02, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, activationState);
        AuraDisclosureViewModel.Factory factory2 = new AuraDisclosureViewModel.Factory(abstractC3358CGzA0g);
        ComponentActivity componentActivityA0A = C3cH.A0A(bfm, akh);
        AuraDisclosureViewModel auraDisclosureViewModel = (AuraDisclosureViewModel) C3cH.A0H(factory2, componentActivityA0A, AnonymousClass003.A0Z(componentActivityA0A), C3cG.A0x(AuraDisclosureViewModel.class));
        C1BO c1boA022 = C2CK.A02(bfm, auraDisclosureViewModel.uiState);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120243);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120249);
        Unit unit = Unit.INSTANCE;
        boolean zA1O2 = AnonymousClass003.A1O(bfm, view, strA01, bfm.A67(auraDisclosureViewModel));
        Object objAaT3 = bfm.AaT();
        if (zA1O2 || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$3$1(auraDisclosureViewModel, view, strA01, null);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A18(bfm, objAaT3, unit);
        AuraNdaViewModel.Factory factory3 = new AuraNdaViewModel.Factory(abstractC3358CGzA0g);
        ComponentActivity componentActivityA0A2 = C3cH.A0A(bfm, akh);
        AuraNdaViewModel auraNdaViewModel = (AuraNdaViewModel) C3cH.A0H(factory3, componentActivityA0A2, AnonymousClass003.A0Z(componentActivityA0A2), C3cG.A0x(AuraNdaViewModel.class));
        C1BO c1boA023 = C2CK.A02(bfm, auraNdaViewModel.uiState);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12055f);
        boolean zA1O3 = AnonymousClass003.A1O(bfm, view, strA013, bfm.A67(auraNdaViewModel));
        Object objAaT4 = bfm.AaT();
        if (zA1O3 || objAaT4 == C78N.A00) {
            objAaT4 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$4$1(auraNdaViewModel, view, strA013, null);
            bfm.Ai0(objAaT4);
        }
        C78e.A06(bfm, unit, (G0V) objAaT4);
        AuraInviteCodeViewModel.Factory factory4 = new AuraInviteCodeViewModel.Factory(abstractC3358CGzA0g);
        ComponentActivity componentActivityA0A3 = C3cH.A0A(bfm, akh);
        AuraInviteCodeViewModel auraInviteCodeViewModel = (AuraInviteCodeViewModel) C3cH.A0G(factory4, componentActivityA0A3, AnonymousClass003.A0Z(componentActivityA0A3), AuraInviteCodeViewModel.class);
        C1BO c1boA024 = C2CK.A02(bfm, auraInviteCodeViewModel.uiState);
        Object objAaT5 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT5 == obj) {
            objAaT5 = contextA0O.getSharedPreferences("hatch_debug_overlay_prefs", 0);
            bfm.Ai0(objAaT5);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) objAaT5;
        Object objAaT6 = bfm.AaT();
        if (objAaT6 == obj) {
            objAaT6 = AnonymousClass005.A0S(bfm, sharedPreferences.getBoolean("hatch_user_state_overlay_enabled", false));
        }
        MutableState mutableState = (MutableState) objAaT6;
        boolean zA67 = bfm.A67(sharedPreferences);
        Object objAaT7 = bfm.AaT();
        if (zA67 || objAaT7 == obj) {
            objAaT7 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$5$1(sharedPreferences, mutableState);
            bfm.Ai0(objAaT7);
        }
        AnonymousClass001.A17(bfm, objAaT7, unit);
        if (!((AuraActivationViewModel.UiState) c1boA02.getValue()).isVerifyingCachedTosRequired && ((AuraActivationViewModel.UiState) c1boA02.getValue()).activationState != ActivationState.FULLY_ACTIVATED) {
            bbiA0M = AnonymousClass002.A0M(bfm, -1162679503);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            boolean zA672 = bfm.A67(auraActivationViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA672 || objAaT8 == obj) {
                objAaT8 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$1$1(auraActivationViewModel);
                bfm.Ai0(objAaT8);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT8;
            boolean zA673 = bfm.A67(auraActivationViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA673 || objAaT9 == obj) {
                objAaT9 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$2$1(auraActivationViewModel);
                bfm.Ai0(objAaT9);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT9;
            boolean zA674 = bfm.A67(auraActivationViewModel);
            Object objAaT10 = bfm.AaT();
            if (zA674 || objAaT10 == obj) {
                objAaT10 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$3$1(auraActivationViewModel);
                bfm.Ai0(objAaT10);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT10;
            AuraNdaViewModel.UiState uiState = (AuraNdaViewModel.UiState) c1boA023.getValue();
            boolean zA675 = bfm.A67(auraNdaViewModel);
            Object objAaT11 = bfm.AaT();
            if (zA675 || objAaT11 == obj) {
                objAaT11 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$4$1(auraNdaViewModel);
                bfm.Ai0(objAaT11);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT11;
            boolean zA676 = bfm.A67(auraNdaViewModel);
            Object objAaT12 = bfm.AaT();
            if (zA676 || objAaT12 == obj) {
                objAaT12 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$5$1(auraNdaViewModel);
                bfm.Ai0(objAaT12);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT12;
            boolean zA677 = bfm.A67(auraNdaViewModel);
            Object objAaT13 = bfm.AaT();
            if (zA677 || objAaT13 == obj) {
                objAaT13 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$6$1(auraNdaViewModel);
                bfm.Ai0(objAaT13);
            }
            InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT13;
            AuraInviteCodeViewModel.UiState uiState2 = (AuraInviteCodeViewModel.UiState) c1boA024.getValue();
            boolean zA678 = bfm.A67(auraInviteCodeViewModel);
            Object objAaT14 = bfm.AaT();
            if (zA678 || objAaT14 == obj) {
                objAaT14 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$7$1(auraInviteCodeViewModel);
                bfm.Ai0(objAaT14);
            }
            InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT14;
            boolean zA679 = bfm.A67(auraInviteCodeViewModel);
            Object objAaT15 = bfm.AaT();
            if (zA679 || objAaT15 == obj) {
                objAaT15 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$8$1(auraInviteCodeViewModel);
                bfm.Ai0(objAaT15);
            }
            InterfaceC7353EnQ interfaceC7353EnQ8 = (InterfaceC7353EnQ) objAaT15;
            boolean zA6710 = bfm.A67(auraInviteCodeViewModel);
            Object objAaT16 = bfm.AaT();
            if (zA6710 || objAaT16 == obj) {
                objAaT16 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$9$1(auraInviteCodeViewModel);
                bfm.Ai0(objAaT16);
            }
            InterfaceC7353EnQ interfaceC7353EnQ9 = (InterfaceC7353EnQ) objAaT16;
            boolean zA6711 = bfm.A67(auraActivationViewModel);
            Object objAaT17 = bfm.AaT();
            if (zA6711 || objAaT17 == obj) {
                objAaT17 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$10$1(auraActivationViewModel);
                bfm.Ai0(objAaT17);
            }
            InterfaceC7353EnQ interfaceC7353EnQ10 = (InterfaceC7353EnQ) objAaT17;
            boolean zA6712 = bfm.A67(auraActivationViewModel);
            Object objAaT18 = bfm.AaT();
            if (zA6712 || objAaT18 == obj) {
                objAaT18 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$11$1(auraActivationViewModel);
                bfm.Ai0(objAaT18);
            }
            InterfaceC7353EnQ interfaceC7353EnQ11 = (InterfaceC7353EnQ) objAaT18;
            boolean z2 = activationScreenKey.wearablesAllowSkip;
            String str2 = activationScreenKey.wearablesWakeWord;
            boolean z3 = activationScreenKey.wearablesPhoneProviderLinked;
            String str3 = activationScreenKey.wearablesSetupSessionId;
            boolean z4 = ((AuraDisclosureViewModel.UiState) c1boA022.getValue()).isLoading;
            boolean z5 = ((AuraDisclosureViewModel.UiState) c1boA022.getValue()).isFetchingMetadata;
            HatchTosMetadata hatchTosMetadata = ((AuraDisclosureViewModel.UiState) c1boA022.getValue()).tosMetadata;
            HatchUpsellCell hatchUpsellCell = ((AuraDisclosureViewModel.UiState) c1boA022.getValue()).upsellCell;
            boolean zA6713 = bfm.A67(auraActivationViewModel);
            Object objAaT19 = bfm.AaT();
            if (zA6713 || objAaT19 == obj) {
                objAaT19 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$12$1(auraActivationViewModel);
                bfm.Ai0(objAaT19);
            }
            InterfaceC7353EnQ interfaceC7353EnQ12 = (InterfaceC7353EnQ) objAaT19;
            boolean zA6714 = bfm.A67(auraActivationViewModel);
            Object objAaT20 = bfm.AaT();
            if (zA6714 || objAaT20 == obj) {
                objAaT20 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$13$1(auraActivationViewModel);
                bfm.Ai0(objAaT20);
            }
            InterfaceC7353EnQ interfaceC7353EnQ13 = (InterfaceC7353EnQ) objAaT20;
            boolean zA6715 = bfm.A67(auraActivationViewModel);
            Object objAaT21 = bfm.AaT();
            if (zA6715 || objAaT21 == obj) {
                objAaT21 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$14$1(auraActivationViewModel);
                bfm.Ai0(objAaT21);
            }
            InterfaceC7353EnQ interfaceC7353EnQ14 = (InterfaceC7353EnQ) objAaT21;
            boolean zA6716 = bfm.A67(auraActivationViewModel);
            Object objAaT22 = bfm.AaT();
            if (zA6716 || objAaT22 == obj) {
                objAaT22 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$15$1(auraActivationViewModel);
                bfm.Ai0(objAaT22);
            }
            InterfaceC7353EnQ interfaceC7353EnQ15 = (InterfaceC7353EnQ) objAaT22;
            boolean zA6717 = bfm.A67(auraActivationViewModel);
            Object objAaT23 = bfm.AaT();
            if (zA6717 || objAaT23 == obj) {
                objAaT23 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$16$1(auraActivationViewModel);
                bfm.Ai0(objAaT23);
            }
            InterfaceC7353EnQ interfaceC7353EnQ16 = (InterfaceC7353EnQ) objAaT23;
            boolean zA6718 = bfm.A67(auraActivationViewModel);
            Object objAaT24 = bfm.AaT();
            if (zA6718 || objAaT24 == obj) {
                objAaT24 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$17$1(auraActivationViewModel);
                bfm.Ai0(objAaT24);
            }
            InterfaceC7353EnQ interfaceC7353EnQ17 = (InterfaceC7353EnQ) objAaT24;
            boolean zA6719 = bfm.A67(auraActivationViewModel);
            Object objAaT25 = bfm.AaT();
            if (zA6719 || objAaT25 == obj) {
                objAaT25 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$18$1(auraActivationViewModel);
                bfm.Ai0(objAaT25);
            }
            InterfaceC7353EnQ interfaceC7353EnQ18 = (InterfaceC7353EnQ) objAaT25;
            AuraActivationViewModel.UiState uiState3 = (AuraActivationViewModel.UiState) c1boA02.getValue();
            C22I<AuraActivationViewModel.ViewEffect> c22i = auraActivationViewModel.viewEffect;
            boolean zA6720 = bfm.A67(auraActivationViewModel);
            Object objAaT26 = bfm.AaT();
            if (zA6720 || objAaT26 == obj) {
                objAaT26 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$19$1(auraActivationViewModel);
                bfm.Ai0(objAaT26);
            }
            InterfaceC7353EnQ interfaceC7353EnQ19 = (InterfaceC7353EnQ) objAaT26;
            Function0 function02 = (Function0) interfaceC7353EnQ;
            Function0 function03 = (Function0) interfaceC7353EnQ2;
            boolean zA6721 = bfm.A67(auraNavigatorA0b);
            Object objAaT27 = bfm.AaT();
            if (zA6721 || objAaT27 == obj) {
                objAaT27 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$20$1(auraNavigatorA0b);
                bfm.Ai0(objAaT27);
            }
            Function0 function04 = (Function0) objAaT27;
            Function0 function05 = (Function0) interfaceC7353EnQ3;
            Object objAaT28 = bfm.AaT();
            if (objAaT28 == obj) {
                objAaT28 = ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$21$1.INSTANCE;
                bfm.Ai0(objAaT28);
            }
            Function0 function06 = (Function0) objAaT28;
            boolean zA1N = AnonymousClass003.A1N(bfm, auraDisclosureViewModel, strA012);
            Object objAaT29 = bfm.AaT();
            if (zA1N || objAaT29 == obj) {
                objAaT29 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$22$1(auraDisclosureViewModel, strA012);
                bfm.Ai0(objAaT29);
            }
            Function0 function07 = (Function0) objAaT29;
            G0U g0u = (G0U) interfaceC7353EnQ4;
            G0U g0u2 = (G0U) interfaceC7353EnQ5;
            Function0 function08 = (Function0) interfaceC7353EnQ6;
            Function0 function09 = (Function0) interfaceC7353EnQ10;
            Function0 function010 = (Function0) interfaceC7353EnQ11;
            G0V g0v = (G0V) interfaceC7353EnQ14;
            G0U g0u3 = (G0U) interfaceC7353EnQ15;
            Function0 function011 = (Function0) interfaceC7353EnQ16;
            Function0 function012 = (Function0) interfaceC7353EnQ17;
            Function0 function013 = (Function0) interfaceC7353EnQ18;
            boolean zA6722 = bfm.A67(abstractC3358CGzA0g);
            Object objAaT30 = bfm.AaT();
            if (zA6722 || objAaT30 == obj) {
                objAaT30 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$23$1(abstractC3358CGzA0g);
                bfm.Ai0(objAaT30);
            }
            Function0 function014 = (Function0) objAaT30;
            Function0 function015 = (Function0) interfaceC7353EnQ12;
            boolean zA6723 = bfm.A67(auraActivationViewModel);
            Object objAaT31 = bfm.AaT();
            if (zA6723 || objAaT31 == obj) {
                objAaT31 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$24$1(auraActivationViewModel);
                bfm.Ai0(objAaT31);
            }
            Function0 function016 = (Function0) objAaT31;
            Function0 function017 = (Function0) interfaceC7353EnQ13;
            boolean zA6724 = bfm.A67(auraActivationViewModel);
            Object objAaT32 = bfm.AaT();
            if (zA6724 || objAaT32 == obj) {
                objAaT32 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$25$1(auraActivationViewModel);
                bfm.Ai0(objAaT32);
            }
            Function0 function018 = (Function0) objAaT32;
            boolean zA6725 = bfm.A67(auraNavigatorA0b);
            Object objAaT33 = bfm.AaT();
            if (zA6725 || objAaT33 == obj) {
                objAaT33 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$26$1(auraNavigatorA0b);
                bfm.Ai0(objAaT33);
            }
            AuraActivationScreenKt.AuraActivationScreen(function02, function03, function04, function05, function06, function07, uiState, g0u, g0u2, function08, function09, function010, z2, hatchUpsellCell, g0v, g0u3, function011, function012, function013, null, str2, z3, str3, z4, z5, hatchTosMetadata, function014, function015, function016, function017, function018, uiState3, c22i, (Function0) objAaT33, uiState2, (G0U) interfaceC7353EnQ7, (Function0) interfaceC7353EnQ8, (Function0) interfaceC7353EnQ19, (G0V) interfaceC7353EnQ9, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 0, 0, 0, 524288, 0);
            if (MutableState.A0A(mutableState) && HatchUtil.INSTANCE.isViewerEmployee()) {
                boolean zA1Y = AnonymousClass001.A1Y(abstractC3358CGzA0g, bfm, 241279986);
                Object objAaT34 = bfm.AaT();
                if (zA1Y || objAaT34 == obj) {
                    objAaT34 = AuraViewerDataProvider.Companion.getInstance(abstractC3358CGzA0g);
                    bfm.Ai0(objAaT34);
                }
                AuraUserData auraUserData = (AuraUserData) C1BO.A07(bfm, ((AuraViewerDataProvider) objAaT34).userData);
                boolean zA6726 = bfm.A67(sharedPreferences);
                Object objAaT35 = bfm.AaT();
                if (zA6726 || objAaT35 == obj) {
                    objAaT35 = new ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$27$1(sharedPreferences);
                    bfm.Ai0(objAaT35);
                }
                Function0 function019 = (Function0) objAaT35;
                Object objAaT36 = bfm.AaT();
                if (objAaT36 == obj) {
                    objAaT36 = ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$28$1.INSTANCE;
                    bfm.Ai0(objAaT36);
                }
                AuraUserStateOverlayKt.AuraUserStateOverlay(auraUserData, abstractC3358CGzA0g, function019, (Function0) objAaT36, C3U4.A09(c0z7.A4C(C2VU.A0D, bs0), 8.0f), bfm, 3072, 0);
            } else {
                bfm.AgE(241869079);
            }
            BBI.A0R(bbiA0M, false);
            z = true;
        } else {
            bfm.AgE(-1162953388);
            if (((AuraActivationViewModel.UiState) c1boA02.getValue()).isVerifyingCachedTosRequired) {
                str = "activation entry: verifying cached TOS";
            } else {
                str = "activation entry: fully activated handoff";
            }
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(str, null, null, bfm, 0, 6);
            bbiA0M = (BBI) bfm;
        }
        BBI.A0R(bbiA0M, z);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ActivationScreenKey activationScreenKey, BFM bfm, Integer num) {
        invoke(activationScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
