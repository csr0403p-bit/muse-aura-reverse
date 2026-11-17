package com.facebook.aura.skills.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BFI;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DisconnectConfirmationSheetKey;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isDisconnecting$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ DisconnectConfirmationSheetKey $sheetKey;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;
    public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.skills.view.DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$2$1$1", f = "DisconnectConfirmationSheet.kt", l = {168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.view.DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isDisconnecting$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ DisconnectConfirmationSheetKey $sheetKey;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;
        public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchConnectorLookupViewModel hatchConnectorLookupViewModel, DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Skill skill, AuraNavigator auraNavigator, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = hatchConnectorLookupViewModel;
            this.$sheetKey = disconnectConfirmationSheetKey;
            this.$origin = hatchSkillOAuthOrigin;
            this.$skill = skill;
            this.$navigator = auraNavigator;
            this.$sourceSkillKey = hatchSkillDetailScreenKey;
            this.$isDisconnecting$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$viewModel, this.$sheetKey, this.$origin, this.$skill, this.$navigator, this.$sourceSkillKey, this.$isDisconnecting$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorLookupViewModel hatchConnectorLookupViewModel = this.$viewModel;
                String str = this.$sheetKey.sourceSessionId;
                this.label = 1;
                obj = hatchConnectorLookupViewModel.disconnect(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            HatchConnectorQplLogger hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
            hatchConnectorQplLogger.markDisconnectMutationResponse();
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
            if (zA1X) {
                hatchInteractionLogger.logClick(hatchSkillOAuthOrigin, HatchComponent.SKILL_DISCONNECT_COMPLETED, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
                hatchConnectorQplLogger.endDisconnectSuccess();
                this.$navigator.popAll(BFI.A0F(new AuraNavKey[]{this.$sheetKey, this.$sourceSkillKey}));
            } else {
                hatchInteractionLogger.logClick(hatchSkillOAuthOrigin, HatchComponent.SKILL_DISCONNECT_FAILED, AnonymousClass007.A0d(HatchMetadataKey.FAILURE_REASON.getValue(), "server_error", new HxE(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id)));
                hatchConnectorQplLogger.endDisconnectFail("server_error", null, null);
                MutableState.A09(false, this.$isDisconnecting$delegate);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$2$1(C3UX c3ux, MutableState<Boolean> mutableState, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Skill skill, AuraNavigator auraNavigator, HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
        super(0);
        this.$scope = c3ux;
        this.$isDisconnecting$delegate = mutableState;
        this.$viewModel = hatchConnectorLookupViewModel;
        this.$sheetKey = disconnectConfirmationSheetKey;
        this.$origin = hatchSkillOAuthOrigin;
        this.$skill = skill;
        this.$navigator = auraNavigator;
        this.$sourceSkillKey = hatchSkillDetailScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorQplLogger.INSTANCE.markDisconnectConfirmedAndMutationSent();
        MutableState.A09(true, this.$isDisconnecting$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$viewModel, this.$sheetKey, this.$origin, this.$skill, this.$navigator, this.$sourceSkillKey, this.$isDisconnecting$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
