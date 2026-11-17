package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1518AkS;
import X.G0U;
import X.InterfaceC1497Ak4;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$autoFocus$2$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ AutoFocusRequest $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$autoFocus$2$1(AutoFocusRequest autoFocusRequest, boolean z, C1518AkS c1518AkS) {
        super(1);
        this.$request = autoFocusRequest;
        this.$enabled = z;
        this.$focusRequester = c1518AkS;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AutoFocusRequest autoFocusRequest = this.$request;
        autoFocusRequest.isPlaced = true;
        if (!this.$enabled || autoFocusRequest.isDone) {
            return;
        }
        autoFocusRequest.isDone = true;
        C1518AkS.A00(this.$focusRequester);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
