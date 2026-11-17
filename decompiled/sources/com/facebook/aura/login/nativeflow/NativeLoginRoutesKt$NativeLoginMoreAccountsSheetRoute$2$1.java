package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$2$1 extends AbstractC7559F3s implements G0U<NativeLoginAccountUiModel, Unit> {
    public final /* synthetic */ Function0<Boolean> $close;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        if (AnonymousClass003.A1Y(this.$close)) {
            this.$viewModel.onAccountSelected(nativeLoginAccountUiModel);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$2$1(Function0<Boolean> function0, NativeLoginViewModel nativeLoginViewModel) {
        super(1);
        this.$close = function0;
        this.$viewModel = nativeLoginViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        invoke2(nativeLoginAccountUiModel);
        return Unit.INSTANCE;
    }
}
