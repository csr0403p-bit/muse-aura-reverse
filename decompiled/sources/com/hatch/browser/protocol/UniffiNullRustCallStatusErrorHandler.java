package com.hatch.browser.protocol;

import X.C7384Etj;
import com.hatch.browser.protocol.RustBuffer;

/* loaded from: classes6.dex */
public final class UniffiNullRustCallStatusErrorHandler implements UniffiRustCallStatusErrorHandler<InternalException> {
    public static final int $stable = 0;
    public static final UniffiNullRustCallStatusErrorHandler INSTANCE = new UniffiNullRustCallStatusErrorHandler();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.UniffiRustCallStatusErrorHandler
    public InternalException lift(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        RustBuffer.Companion.free$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(byValue);
        return new InternalException("Unexpected CALL_ERROR");
    }
}
