package com.hatch.browser.protocol;

import com.hatch.browser.protocol.ForeignBytes;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Native;

/* loaded from: classes6.dex */
public final class UniffiLib {
    public static final int $stable = 0;
    public static final UniffiLib INSTANCE = new UniffiLib();

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_f32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_f64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_i16(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_i32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_i64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_i8(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_u16(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_u32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_u64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_u8(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_cancel_void(long j);

    public final native float ffi_hatch_browser_protocol_rust_future_complete_f32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_hatch_browser_protocol_rust_future_complete_f64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_hatch_browser_protocol_rust_future_complete_i16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_protocol_rust_future_complete_i32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_hatch_browser_protocol_rust_future_complete_i64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_hatch_browser_protocol_rust_future_complete_i8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_protocol_rust_future_complete_rust_buffer(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_protocol_rust_future_complete_u16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_protocol_rust_future_complete_u32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_hatch_browser_protocol_rust_future_complete_u64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_protocol_rust_future_complete_u8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_protocol_rust_future_complete_void(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_protocol_rust_future_free_f32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_f64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_i16(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_i32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_i64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_i8(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_rust_buffer(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_u16(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_u32(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_u64(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_u8(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_free_void(long j);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_f32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_f64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_i16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_i32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_i64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_i8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_rust_buffer(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_u16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_u32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_u64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_u8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_protocol_rust_future_poll_void(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_hatch_browser_protocol_rustbuffer_alloc(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_protocol_rustbuffer_free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_protocol_rustbuffer_from_bytes(ForeignBytes.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_protocol_rustbuffer_reserve(RustBuffer.ByValue byValue, long j, UniffiRustCallStatus uniffiRustCallStatus);

    static {
        Native.register((Class<?>) UniffiLib.class, Hatch_browser_protocolKt.findLibraryName("hatch_browser_protocol"));
    }

    public final void ensureInitialized$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
    }
}
