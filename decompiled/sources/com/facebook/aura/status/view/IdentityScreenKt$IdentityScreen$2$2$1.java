package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.status.viewmodel.IdentityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdentityScreenKt$IdentityScreen$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdentityViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityScreenKt$IdentityScreen$2$2$1(IdentityViewModel identityViewModel) {
        super(0);
        this.$viewModel = identityViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.refresh();
    }
}
