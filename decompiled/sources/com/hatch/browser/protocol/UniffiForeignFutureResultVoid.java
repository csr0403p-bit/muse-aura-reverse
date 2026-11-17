package com.hatch.browser.protocol;

import X.C06H;
import X.C7384Etj;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultVoid extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;

    public final class UniffiByValue extends UniffiForeignFutureResultVoid implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(new UniffiRustCallStatus.ByValue());
        }

        public /* synthetic */ UniffiByValue(UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this((i & 1) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(UniffiRustCallStatus.ByValue byValue) {
            super(byValue);
            C7384Etj.A0Y(byValue, 0);
        }
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultVoid uniffiForeignFutureResultVoid) {
        C7384Etj.A0Y(uniffiForeignFutureResultVoid, 0);
        this.callStatus = uniffiForeignFutureResultVoid.callStatus;
    }

    public UniffiForeignFutureResultVoid() {
        this(new UniffiRustCallStatus.ByValue());
    }

    public /* synthetic */ UniffiForeignFutureResultVoid(UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this((i & 1) != 0 ? new UniffiRustCallStatus.ByValue() : byValue);
    }

    public UniffiForeignFutureResultVoid(UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        this.callStatus = byValue;
    }
}
