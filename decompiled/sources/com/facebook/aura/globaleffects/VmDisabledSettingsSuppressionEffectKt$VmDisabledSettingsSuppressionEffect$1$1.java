package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import com.facebook.aura.vmdisabled.VmDisabledViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VmDisabledSettingsSuppressionEffectKt$VmDisabledSettingsSuppressionEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isInBugReport;
    public final /* synthetic */ boolean $isInSettings;
    public final /* synthetic */ boolean $isInSupport;
    public final /* synthetic */ VmDisabledViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmDisabledSettingsSuppressionEffectKt$VmDisabledSettingsSuppressionEffect$1$1(VmDisabledViewModel vmDisabledViewModel, boolean z, boolean z2, boolean z3) {
        super(0);
        this.$viewModel = vmDisabledViewModel;
        this.$isInSettings = z;
        this.$isInSupport = z2;
        this.$isInBugReport = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r3 = this;
            com.facebook.aura.vmdisabled.VmDisabledViewModel r2 = r3.$viewModel
            boolean r0 = r3.$isInSettings
            if (r0 != 0) goto Lf
            boolean r0 = r3.$isInSupport
            if (r0 != 0) goto Lf
            boolean r1 = r3.$isInBugReport
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r2.onGateSuppressionChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.globaleffects.VmDisabledSettingsSuppressionEffectKt$VmDisabledSettingsSuppressionEffect$1$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
