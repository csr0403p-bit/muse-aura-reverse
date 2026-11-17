package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$2$1 extends AbstractC7559F3s implements G0U<NativeLoginAccountUiModel, Unit> {
    public final /* synthetic */ MutableState<String> $pickedAccountId$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        this.$pickedAccountId$delegate.Af8(nativeLoginAccountUiModel.id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTosDisclosureKt$NativeLoginTosDisclosure$2$1(MutableState<String> mutableState) {
        super(1);
        this.$pickedAccountId$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        invoke2(nativeLoginAccountUiModel);
        return Unit.INSTANCE;
    }
}
