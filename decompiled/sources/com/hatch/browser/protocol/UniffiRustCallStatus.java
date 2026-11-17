package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.BV7;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Structure;

@Structure.FieldOrder({AuraDeeplinkRouteMapper.CODE_PARAM, "error_buf"})
/* loaded from: classes6.dex */
public class UniffiRustCallStatus extends Structure {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public byte code;
    public RustBuffer.ByValue error_buf = new RustBuffer.ByValue();

    public final class ByValue extends UniffiRustCallStatus implements Structure.ByValue {
        public static final int $stable = 8;
    }

    public final class Companion {
        public final ByValue create(byte b, RustBuffer.ByValue byValue) {
            C7384Etj.A0Y(byValue, 1);
            ByValue byValue2 = new ByValue();
            byValue2.code = b;
            byValue2.error_buf = byValue;
            return byValue2;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final boolean isError() {
        return BV7.A1Q(this.code);
    }

    public final boolean isPanic() {
        return AnonymousClass002.A1Q(this.code, 2);
    }

    public final boolean isSuccess() {
        return AnonymousClass002.A1M(this.code);
    }
}
