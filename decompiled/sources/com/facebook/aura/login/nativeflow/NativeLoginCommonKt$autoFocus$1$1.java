package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1518AkS;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$autoFocus$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ AutoFocusRequest $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$autoFocus$1$1(boolean z, AutoFocusRequest autoFocusRequest, C1518AkS c1518AkS) {
        super(1);
        this.$enabled = z;
        this.$request = autoFocusRequest;
        this.$focusRequester = c1518AkS;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$enabled) {
            AutoFocusRequest autoFocusRequest = this.$request;
            if (autoFocusRequest.isPlaced && !autoFocusRequest.isDone) {
                autoFocusRequest.isDone = true;
                C1518AkS.A00(this.$focusRequester);
            }
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$autoFocus$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
