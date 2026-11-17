package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isInBugReport;
    public final /* synthetic */ boolean $isInSettings;
    public final /* synthetic */ StorageRecoveryViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$1$1(StorageRecoveryViewModel storageRecoveryViewModel, boolean z, boolean z2) {
        super(0);
        this.$viewModel = storageRecoveryViewModel;
        this.$isInSettings = z;
        this.$isInBugReport = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r3 = this;
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r2 = r3.$viewModel
            boolean r0 = r3.$isInSettings
            if (r0 != 0) goto Lb
            boolean r1 = r3.$isInBugReport
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.onSettingsVisibilityChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.globaleffects.StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$1$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
