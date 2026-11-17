package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MessengerPinSheetKt$MessengerPinSheet$3$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasSubmitted$delegate;
    public final /* synthetic */ boolean $isVerifying;
    public final /* synthetic */ MutableState<String> $pin$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        int length;
        C7384Etj.A0Y(str, 0);
        if (this.$isVerifying || (length = str.length()) > 6) {
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return;
            }
        }
        if (length < 6) {
            MutableState.A09(false, this.$hasSubmitted$delegate);
        }
        this.$pin$delegate.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerPinSheetKt$MessengerPinSheet$3$1$2$1(boolean z, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$isVerifying = z;
        this.$hasSubmitted$delegate = mutableState;
        this.$pin$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
