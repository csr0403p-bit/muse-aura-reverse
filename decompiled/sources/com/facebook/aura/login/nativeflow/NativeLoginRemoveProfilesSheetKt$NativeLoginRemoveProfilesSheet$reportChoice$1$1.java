package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$reportChoice$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<NativeLoginAccountUiModel> $accountToRemove$delegate;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onRemove;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$reportChoice$1$1(G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, MutableState<NativeLoginAccountUiModel> mutableState) {
        super(0);
        this.$onRemove = g0u;
        this.$onDismiss = function0;
        this.$accountToRemove$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NativeLoginAccountUiModel value = this.$accountToRemove$delegate.getValue();
        if (value != null) {
            this.$onRemove.invoke(value);
        } else {
            this.$onDismiss.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
