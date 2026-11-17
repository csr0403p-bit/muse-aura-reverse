package com.hatch.browser.protocol;

import X.BV4;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.HwO;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@Structure.FieldOrder({"capacity", "len", "data"})
/* loaded from: classes6.dex */
public class RustBuffer extends Structure {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long capacity;
    public Pointer data;
    public long len;

    public final class ByReference extends RustBuffer implements Structure.ByReference {
        public static final int $stable = 8;
    }

    public final class ByValue extends RustBuffer implements Structure.ByValue {
        public static final int $stable = 8;
    }

    public final class Companion {
        public final void free$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(ByValue byValue) {
            C7384Etj.A0Y(byValue, 0);
            UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
            UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
            UniffiLib.INSTANCE.ffi_hatch_browser_protocol_rustbuffer_free(byValue, uniffiRustCallStatus);
            Hatch_browser_protocolKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        }

        /* renamed from: alloc-VKZWuLQ$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk, reason: not valid java name */
        public final ByValue m3724xff5f08c4(long j) {
            UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
            UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
            ByValue byValueFfi_hatch_browser_protocol_rustbuffer_alloc = UniffiLib.INSTANCE.ffi_hatch_browser_protocol_rustbuffer_alloc(j, uniffiRustCallStatus);
            Hatch_browser_protocolKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
            if (byValueFfi_hatch_browser_protocol_rustbuffer_alloc.data != null) {
                return byValueFfi_hatch_browser_protocol_rustbuffer_alloc;
            }
            throw BV4.A0c(C60O.A0r("RustBuffer.alloc() returned null data pointer (size=", HwO.A00(j)));
        }

        /* renamed from: create-twO9MuI$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk, reason: not valid java name */
        public final ByValue m3725xc5044f11(long j, long j2, Pointer pointer) {
            ByValue byValue = new ByValue();
            byValue.capacity = j;
            byValue.len = j2;
            byValue.data = pointer;
            return byValue;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final void setValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(RustBuffer rustBuffer) {
        C7384Etj.A0Y(rustBuffer, 0);
        this.capacity = rustBuffer.capacity;
        this.len = rustBuffer.len;
        this.data = rustBuffer.data;
    }

    public final ByteBuffer asByteBuffer() {
        ByteBuffer byteBuffer;
        Pointer pointer = this.data;
        if (pointer == null || (byteBuffer = pointer.getByteBuffer(0L, this.len)) == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }
}
