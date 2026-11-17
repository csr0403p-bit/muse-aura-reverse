package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultU16 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public short returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultU16 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super((short) 0, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(short s, UniffiRustCallStatus.ByValue byValue) {
            super(s, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(short s, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this((i & 1) != 0 ? (short) 0 : s, AbstractC7609F5w.A0g(byValue, i));
        }
    }

    public UniffiForeignFutureResultU16() {
        this((short) 0, new UniffiRustCallStatus.ByValue());
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultU16 uniffiForeignFutureResultU16) {
        C7384Etj.A0Y(uniffiForeignFutureResultU16, 0);
        this.returnValue = uniffiForeignFutureResultU16.returnValue;
        this.callStatus = uniffiForeignFutureResultU16.callStatus;
    }

    public UniffiForeignFutureResultU16(short s, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = s;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultU16(short s, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this((i & 1) != 0 ? (short) 0 : s, AbstractC7609F5w.A0g(byValue, i));
    }
}
