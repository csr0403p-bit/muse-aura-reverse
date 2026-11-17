package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultU64 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public long returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultU64 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(0L, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(long j, UniffiRustCallStatus.ByValue byValue) {
            super(j, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(long j, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this(AbstractC7609F5w.A0K(i, j), AbstractC7609F5w.A0f(byValue, i));
        }
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultU64 uniffiForeignFutureResultU64) {
        C7384Etj.A0Y(uniffiForeignFutureResultU64, 0);
        this.returnValue = uniffiForeignFutureResultU64.returnValue;
        this.callStatus = uniffiForeignFutureResultU64.callStatus;
    }

    public UniffiForeignFutureResultU64() {
        this(0L, new UniffiRustCallStatus.ByValue());
    }

    public UniffiForeignFutureResultU64(long j, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = j;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultU64(long j, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this(AbstractC7609F5w.A0K(i, j), AbstractC7609F5w.A0f(byValue, i));
    }
}
