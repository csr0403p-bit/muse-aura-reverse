package com.facebook.aura.utils;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onOpenSettings;
    public final /* synthetic */ String $openSettingsText;

    /* renamed from: com.facebook.aura.utils.HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Context context) {
            super(0);
            this.$onDismiss = function0;
            this.$onOpenSettings = function02;
            this.$context = context;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onDismiss.invoke();
            Function0<Unit> function0 = this.$onOpenSettings;
            if (function0 != null) {
                function0.invoke();
            } else {
                HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        String str = this.$openSettingsText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDismiss, this.$onOpenSettings, this.$context);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, null, null, true, false, null, anonymousClass1, null, bs0, i);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$cancelText, null, null, true, false, null, this.$onCancel, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$1$1$1(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Context context) {
        super(1);
        this.$openSettingsText = str;
        this.$cancelText = str2;
        this.$onCancel = function0;
        this.$onDismiss = function02;
        this.$onOpenSettings = function03;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
