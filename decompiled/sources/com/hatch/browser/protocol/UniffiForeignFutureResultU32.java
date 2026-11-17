package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultU32 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public int returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultU32 implements Structure.ByValue {
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
            this(C3cI.A00(i2, i), AbstractC7609F5w.A0g(byValue, i2));
        }
    }

    public UniffiForeignFutureResultU32() {
        this(0, new UniffiRustCallStatus.ByValue());
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultU32 uniffiForeignFutureResultU32) {
        C7384Etj.A0Y(uniffiForeignFutureResultU32, 0);
        this.returnValue = uniffiForeignFutureResultU32.returnValue;
        this.callStatus = uniffiForeignFutureResultU32.callStatus;
    }

    public UniffiForeignFutureResultU32(int i, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = i;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultU32(int i, UniffiRustCallStatus.ByValue byValue, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), AbstractC7609F5w.A0g(byValue, i2));
    }
}
