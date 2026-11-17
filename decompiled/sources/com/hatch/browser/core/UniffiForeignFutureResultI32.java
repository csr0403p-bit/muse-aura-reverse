package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultI32 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public int returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultI32 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(0, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(int i, UniffiRustCallStatus.ByValue byValue) {
            super(i, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(int i, UniffiRustCallStatus.ByValue byValue, int i2, C06H c06h) {
            this(C3cI.A00(i2, i), AbstractC7609F5w.A0f(byValue, i2));
        }
    }

    public UniffiForeignFutureResultI32() {
        this(0, new UniffiRustCallStatus.ByValue());
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultI32 uniffiForeignFutureResultI32) {
        C7384Etj.A0Y(uniffiForeignFutureResultI32, 0);
        this.returnValue = uniffiForeignFutureResultI32.returnValue;
        this.callStatus = uniffiForeignFutureResultI32.callStatus;
    }

    public UniffiForeignFutureResultI32(int i, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = i;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultI32(int i, UniffiRustCallStatus.ByValue byValue, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), AbstractC7609F5w.A0f(byValue, i2));
    }
}
