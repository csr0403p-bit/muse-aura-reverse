package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultF64 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public double returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultF64 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(0.0d, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(double d, UniffiRustCallStatus.ByValue byValue) {
            super(d, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(double d, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this((i & 1) != 0 ? 0.0d : d, AbstractC7609F5w.A0g(byValue, i));
        }
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultF64 uniffiForeignFutureResultF64) {
        C7384Etj.A0Y(uniffiForeignFutureResultF64, 0);
        this.returnValue = uniffiForeignFutureResultF64.returnValue;
        this.callStatus = uniffiForeignFutureResultF64.callStatus;
    }

    public UniffiForeignFutureResultF64() {
        this(0.0d, new UniffiRustCallStatus.ByValue());
    }

    public UniffiForeignFutureResultF64(double d, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = d;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultF64(double d, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this((i & 1) != 0 ? 0.0d : d, AbstractC7609F5w.A0g(byValue, i));
    }
}
