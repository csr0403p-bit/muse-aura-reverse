package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.sun.jna.Structure;

@Structure.FieldOrder({"returnValue", "callStatus"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureResultF32 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public float returnValue;

    public final class UniffiByValue extends UniffiForeignFutureResultF32 implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(0.0f, new UniffiRustCallStatus.ByValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(float f, UniffiRustCallStatus.ByValue byValue) {
            super(f, byValue);
            C7384Etj.A0Y(byValue, 1);
        }

        public /* synthetic */ UniffiByValue(float f, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
            this((i & 1) != 0 ? 0.0f : f, AbstractC7609F5w.A0f(byValue, i));
        }
    }

    public UniffiForeignFutureResultF32() {
        this(0.0f, new UniffiRustCallStatus.ByValue());
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureResultF32 uniffiForeignFutureResultF32) {
        C7384Etj.A0Y(uniffiForeignFutureResultF32, 0);
        this.returnValue = uniffiForeignFutureResultF32.returnValue;
        this.callStatus = uniffiForeignFutureResultF32.callStatus;
    }

    public UniffiForeignFutureResultF32(float f, UniffiRustCallStatus.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        this.returnValue = f;
        this.callStatus = byValue;
    }

    public /* synthetic */ UniffiForeignFutureResultF32(float f, UniffiRustCallStatus.ByValue byValue, int i, C06H c06h) {
        this((i & 1) != 0 ? 0.0f : f, AbstractC7609F5w.A0f(byValue, i));
    }
}
