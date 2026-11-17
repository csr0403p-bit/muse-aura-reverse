package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NativeLoginAccountUiModel $account;
    public final /* synthetic */ MutableState<NativeLoginAccountUiModel> $accountToRemove$delegate;
    public final /* synthetic */ Function0<Unit> $hideThenReportChoice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$1$1$1$1$1(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, MutableState<NativeLoginAccountUiModel> mutableState) {
        super(0);
        this.$account = nativeLoginAccountUiModel;
        this.$hideThenReportChoice = function0;
        this.$accountToRemove$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$accountToRemove$delegate.getValue() == null) {
            this.$accountToRemove$delegate.Af8(this.$account);
            this.$hideThenReportChoice.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
