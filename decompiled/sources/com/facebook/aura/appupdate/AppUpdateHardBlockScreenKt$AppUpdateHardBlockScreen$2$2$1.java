package com.facebook.aura.appupdate;

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
public final class AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$2$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $continueButtonText;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ String $updateButtonText;

    /* renamed from: com.facebook.aura.appupdate.AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Function0<Unit> function0) {
            super(0);
            this.$context = context;
            this.$onDismiss = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppUpdateChecker.INSTANCE.openUpdate(this.$context);
            this.$onDismiss.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.appupdate.AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$2$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            AppUpdateChecker.INSTANCE.snoozeHardBlock();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppUpdateChecker.INSTANCE.snoozeHardBlock();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        String str = this.$updateButtonText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$onDismiss);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(str, null, null, true, false, "app-update-button", anonymousClass1, null, bs0, i);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$continueButtonText, null, null, true, false, "app-update-continue-button", AnonymousClass2.INSTANCE, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$2$2$1(String str, String str2, Context context, Function0<Unit> function0) {
        super(1);
        this.$updateButtonText = str;
        this.$continueButtonText = str2;
        this.$context = context;
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
