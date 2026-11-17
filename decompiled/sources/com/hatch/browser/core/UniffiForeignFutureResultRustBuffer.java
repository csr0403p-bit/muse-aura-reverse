package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultRustBuffer extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public RustBuffer.ByValue returnValue;

    /* JADX WARN: Multi-variable type inference failed */
    public UniffiForeignFutureResultRustBuffer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultRustBuffer uniffiForeignFutureResultRustBuffer) {
        C7384Etj.A0Y(uniffiForeignFutureResultRustBuffer, 0);
        this.returnValue = uniffiForeignFutureResultRustBuffer.returnValue;
        this.callStatus = uniffiForeignFutureResultRustBuffer.callStatus;
    }

    public final class UniffiByValue extends UniffiForeignFutureResultRustBuffer implements Structure.ByValue {
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public UniffiByValue() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2) {
            super(byValue, byValue2);
            AnonymousClass003.A0u(byValue, byValue2);
        }

        public /* synthetic */ UniffiByValue(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i, C06H c06h) {
            this((i & 1) != 0 ? new RustBuffer.ByValue() : byValue, AbstractC7609F5w.A0f(byValue2, i));
        }
    }

    public UniffiForeignFutureResultRustBuffer(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2) {
        AnonymousClass003.A0u(byValue, byValue2);
        this.returnValue = byValue;
        this.callStatus = byValue2;
    }

    public /* synthetic */ UniffiForeignFutureResultRustBuffer(RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i, C06H c06h) {
        this((i & 1) != 0 ? new RustBuffer.ByValue() : byValue, AbstractC7609F5w.A0f(byValue2, i));
    }
}
