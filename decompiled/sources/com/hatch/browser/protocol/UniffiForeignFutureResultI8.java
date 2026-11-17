package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultI8 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public byte returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultI8 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super((byte) 0, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(byte b, UniffiRustCallStatus.ByValue byValue) {
            super(b, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(byte b, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this((i & 1) != 0 ? (byte) 0 : b, AbstractC7609F5w.A0g(byValue, i));
        }
    }

    public UniffiForeignFutureResultI8() {
        this((byte) 0, new UniffiRustCallStatus.ByValue());
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultI8 uniffiForeignFutureResultI8) {
        C7384Etj.A0Y(uniffiForeignFutureResultI8, 0);
        this.returnValue = uniffiForeignFutureResultI8.returnValue;
        this.callStatus = uniffiForeignFutureResultI8.callStatus;
    }

    public UniffiForeignFutureResultI8(byte b, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = b;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultI8(byte b, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this((i & 1) != 0 ? (byte) 0 : b, AbstractC7609F5w.A0g(byValue, i));
    }
}
