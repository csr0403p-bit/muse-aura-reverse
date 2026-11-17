package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isFromChat;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4$1$1(boolean z, MutableState<Boolean> mutableState) {
        super(0);
        this.$isFromChat = z;
        this.$isPasswordVisible$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.addLoginPasswordRevealTapped(this.$isFromChat, !MutableState.A0A((MutableState) this.$isPasswordVisible$delegate));
        MutableState.A09(!MutableState.A0A((MutableState) r1), this.$isPasswordVisible$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
