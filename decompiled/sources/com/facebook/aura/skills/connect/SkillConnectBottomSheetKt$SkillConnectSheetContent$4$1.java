package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComponent $connectComponent;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C1BO<SkillConnectUiState> $linkedAccountsUiState$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onConnectSuccess;
    public final /* synthetic */ Function0<Unit> $onConsentAccepted;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ String $sourceSessionId;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$4$1$1", f = "SkillConnectBottomSheet.kt", l = {FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 183}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<SkillConnectUiState> $linkedAccountsUiState$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onConnectSuccess;
        public final /* synthetic */ Function0<Unit> $onConsentAccepted;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ String $sourceSessionId;
        public final /* synthetic */ SkillConnectViewModel $viewModel;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkillConnectViewModel skillConnectViewModel, Function0<Unit> function0, Skill skill, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str, Context context, AuraNavigator auraNavigator, Function0<Unit> function02, Function0<Unit> function03, C1BO<SkillConnectUiState> c1bo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = skillConnectViewModel;
            this.$onDismiss = function0;
            this.$skill = skill;
            this.$origin = hatchSkillOAuthOrigin;
            this.$sourceSessionId = str;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$onConsentAccepted = function02;
            this.$onConnectSuccess = function03;
            this.$linkedAccountsUiState$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$viewModel, this.$onDismiss, this.$skill, this.$origin, this.$sourceSessionId, this.$context, this.$navigator, this.$onConsentAccepted, this.$onConnectSuccess, this.$linkedAccountsUiState$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objResolveConnectAction = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objResolveConnectAction);
                SkillConnectViewModel skillConnectViewModel = this.$viewModel;
                this.label = 1;
                objResolveConnectAction = skillConnectViewModel.resolveConnectAction(this);
                if (objResolveConnectAction == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objResolveConnectAction);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objResolveConnectAction);
            }
            SkillConnectAction skillConnectAction = (SkillConnectAction) objResolveConnectAction;
            if (skillConnectAction == null) {
                this.$onDismiss.invoke();
            } else {
                Skill skill = this.$skill;
                SkillConnectUiState value = this.$linkedAccountsUiState$delegate.getValue();
                SkillConnectViewModel skillConnectViewModel2 = this.$viewModel;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                String str = this.$sourceSessionId;
                Context context = this.$context;
                AuraNavigator auraNavigator = this.$navigator;
                Function0<Unit> function0 = this.$onConsentAccepted;
                Function0<Unit> function02 = this.$onConnectSuccess;
                Function0<Unit> function03 = this.$onDismiss;
                this.L$0 = null;
                this.label = 2;
                if (SkillConnectBottomSheetKt.handleSkillConnectAction(skillConnectAction, skill, value, skillConnectViewModel2, hatchSkillOAuthOrigin, str, context, auraNavigator, function0, function02, function03, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$4$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Skill skill, C3UX c3ux, SkillConnectViewModel skillConnectViewModel, Function0<Unit> function0, String str, Context context, AuraNavigator auraNavigator, Function0<Unit> function02, Function0<Unit> function03, C1BO<SkillConnectUiState> c1bo) {
        super(0);
        this.$origin = hatchSkillOAuthOrigin;
        this.$connectComponent = hatchComponent;
        this.$skill = skill;
        this.$coroutineScope = c3ux;
        this.$viewModel = skillConnectViewModel;
        this.$onDismiss = function0;
        this.$sourceSessionId = str;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$onConsentAccepted = function02;
        this.$onConnectSuccess = function03;
        this.$linkedAccountsUiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$origin, this.$connectComponent, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
        HatchConnectorQplLogger.INSTANCE.markConsentAccepted();
        AnonymousClass001.A1J(new AnonymousClass1(this.$viewModel, this.$onDismiss, this.$skill, this.$origin, this.$sourceSessionId, this.$context, this.$navigator, this.$onConsentAccepted, this.$onConnectSuccess, this.$linkedAccountsUiState$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
