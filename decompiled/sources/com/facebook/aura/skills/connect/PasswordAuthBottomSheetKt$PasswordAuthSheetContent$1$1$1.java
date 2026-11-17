package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PasswordAuthBottomSheetKt$PasswordAuthSheetContent$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $username$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$username$delegate.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordAuthBottomSheetKt$PasswordAuthSheetContent$1$1$1(MutableState<String> mutableState) {
        super(1);
        this.$username$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
