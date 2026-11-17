package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C0fG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ Function0<Unit> $onContinue;
    public final /* synthetic */ Function0<Unit> $onCopyKey;
    public final /* synthetic */ String $recoveryKey;

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ C0fG $clipboardManager;
        public final /* synthetic */ Function0<Unit> $onCopyKey;
        public final /* synthetic */ String $recoveryKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0fG c0fG, String str, Function0<Unit> function0) {
            super(0);
            this.$clipboardManager = c0fG;
            this.$recoveryKey = str;
            this.$onCopyKey = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C0fG.A00(this.$clipboardManager, this.$recoveryKey);
            this.$onCopyKey.invoke();
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clipboardManager, this.$recoveryKey, this.$onCopyKey);
        BS0 bs0 = BRg.A00;
        int i = AuraHaptics.BUTTON_TAP;
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120f2e, null, null, null, true, false, null, anonymousClass1, null, null, bs0, i);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120f2c, null, null, null, true, false, null, this.$onContinue, null, null, bs0, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetContentKt$PauseHatchSaveRecoveryKeyPage$1$1$1(Function0<Unit> function0, C0fG c0fG, String str, Function0<Unit> function02) {
        super(1);
        this.$onContinue = function0;
        this.$clipboardManager = c0fG;
        this.$recoveryKey = str;
        this.$onCopyKey = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
