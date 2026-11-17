package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"handle", "free"})
/* loaded from: classes6.dex */
public class UniffiForeignFutureDroppedCallbackStruct extends Structure {
    public static final int $stable = 8;
    public UniffiForeignFutureDroppedCallback free;
    public long handle;

    public UniffiForeignFutureDroppedCallbackStruct() {
        this(0L, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        C7384Etj.A0Y(uniffiForeignFutureDroppedCallbackStruct, 0);
        this.handle = uniffiForeignFutureDroppedCallbackStruct.handle;
        this.free = uniffiForeignFutureDroppedCallbackStruct.free;
    }

    public final class UniffiByValue extends UniffiForeignFutureDroppedCallbackStruct implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            super(0L, null);
        }

        public UniffiByValue(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback) {
            super(j, uniffiForeignFutureDroppedCallback);
        }

        public /* synthetic */ UniffiByValue(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback, int i, C06H c06h) {
            super(AbstractC7609F5w.A0K(i, j), (i & 2) != 0 ? null : uniffiForeignFutureDroppedCallback);
        }
    }

    public UniffiForeignFutureDroppedCallbackStruct(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback) {
        this.handle = j;
        this.free = uniffiForeignFutureDroppedCallback;
    }

    public /* synthetic */ UniffiForeignFutureDroppedCallbackStruct(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback, int i, C06H c06h) {
        this(AbstractC7609F5w.A0K(i, j), (i & 2) != 0 ? null : uniffiForeignFutureDroppedCallback);
    }
}
