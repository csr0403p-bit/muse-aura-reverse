package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ActivationLoadingScreenKt$ActivationLoadingScreen$rageShakeHandler$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ MutableState<String> $screenshotUri$delegate;
    public final /* synthetic */ MutableState<Boolean> $showBugReport$delegate;
    public final /* synthetic */ MutableState<String> $submissionId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationLoadingScreenKt$ActivationLoadingScreen$rageShakeHandler$1$1(MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        super(2);
        this.$showBugReport$delegate = mutableState;
        this.$submissionId$delegate = mutableState2;
        this.$screenshotUri$delegate = mutableState3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (!MutableState.A0A((MutableState) this.$showBugReport$delegate)) {
            this.$submissionId$delegate.Af8(str);
            this.$screenshotUri$delegate.Af8(str2);
            MutableState.A09(true, this.$showBugReport$delegate);
        }
    }
}
