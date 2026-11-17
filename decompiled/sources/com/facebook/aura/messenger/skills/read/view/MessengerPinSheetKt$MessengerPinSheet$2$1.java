package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.messenger.skills.read.model.PinError;

/* loaded from: classes.dex */
public final class MessengerPinSheetKt$MessengerPinSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $hasSubmitted$delegate;
    public final /* synthetic */ boolean $isConnectivityError;
    public final /* synthetic */ MutableState<String> $pin$delegate;
    public final /* synthetic */ PinError $pinError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerPinSheetKt$MessengerPinSheet$2$1(PinError pinError, boolean z, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$pinError = pinError;
        this.$isConnectivityError = z;
        this.$pin$delegate = mutableState;
        this.$hasSubmitted$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$pinError != null || this.$isConnectivityError) {
            this.$pin$delegate.Af8("");
            MutableState.A09(false, this.$hasSubmitted$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt$MessengerPinSheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
