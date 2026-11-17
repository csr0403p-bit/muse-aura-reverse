package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.activation.model.AuraConfirmNameViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraConfirmNameScreenKt$ConfirmNameBottomButtons$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onContinue;
    public final /* synthetic */ Function0<Unit> $onLogOut;
    public final /* synthetic */ AuraConfirmNameViewModel.UiState $uiState;

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$ConfirmNameBottomButtons$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onContinue = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraConfirmNameScreenKt.logConfirmNameClick(HatchComponent.CONTINUE_BUTTON);
            this.$onContinue.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$ConfirmNameBottomButtons$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onLogOut;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(0);
            this.$onLogOut = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraConfirmNameScreenKt.logConfirmNameClick(HatchComponent.LOGOUT_BUTTON);
            this.$onLogOut.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        AuraConfirmNameViewModel.UiState uiState = this.$uiState;
        boolean z = uiState.isContinueEnabled;
        boolean z2 = uiState.isSaving;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onContinue);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f12022f, (Object[]) null, (Drawable) null, z, z2, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, anonymousClass1, (String) null, bs0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120702, null, null, !this.$uiState.isSaving, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$onLogOut), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraConfirmNameScreenKt$ConfirmNameBottomButtons$1$1(AuraConfirmNameViewModel.UiState uiState, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$uiState = uiState;
        this.$onContinue = function0;
        this.$onLogOut = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
