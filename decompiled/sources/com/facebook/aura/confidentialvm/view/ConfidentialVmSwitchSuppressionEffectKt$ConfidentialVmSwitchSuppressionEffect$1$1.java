package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isSuppressed;
    public final /* synthetic */ ConfidentialVmMigrationDoneViewModel $migrationDone;
    public final /* synthetic */ ConfidentialVmSwitchResumeViewModel $switchResume;
    public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel $transferResume;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$1$1(ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel, boolean z, ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel) {
        super(0);
        this.$switchResume = confidentialVmSwitchResumeViewModel;
        this.$isSuppressed = z;
        this.$transferResume = confidentialVmDataTransferResumeViewModel;
        this.$migrationDone = confidentialVmMigrationDoneViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$switchResume.onSuppressionChanged(this.$isSuppressed);
        this.$transferResume.onSuppressionChanged(this.$isSuppressed);
        this.$migrationDone.onSuppressionChanged(this.$isSuppressed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
