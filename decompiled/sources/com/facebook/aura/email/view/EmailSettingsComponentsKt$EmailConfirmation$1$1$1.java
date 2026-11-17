package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSettingsComponentsKt$EmailConfirmation$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ String $confirmLabel;
    public final /* synthetic */ Function0<Unit> $onConfirm;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailConfirmation$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02) {
            super(0);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onConfirm.invoke();
            this.$onDismiss.invoke();
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
        String str = this.$confirmLabel;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onConfirm, this.$onDismiss);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismiss, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsComponentsKt$EmailConfirmation$1$1$1(String str, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$confirmLabel = str;
        this.$cancelLabel = str2;
        this.$onDismiss = function0;
        this.$onConfirm = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
