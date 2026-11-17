package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C5322DgG;
import X.F0C;
import com.hatch.browser.core.ForeignBytes;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.Hatch_browser_protocolKt;
import com.hatch.browser.protocol.RustBuffer;
import com.sun.jna.Native;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class UniffiLib {
    public static final int $stable = 0;
    public static final F0C CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_f32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_f64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_i16(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_i32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_i64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_i8(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_u16(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_u32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_u64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_u8(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_cancel_void(long j);

    public final native float ffi_hatch_browser_core_uniffi_rust_future_complete_f32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_hatch_browser_core_uniffi_rust_future_complete_f64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_hatch_browser_core_uniffi_rust_future_complete_i16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_core_uniffi_rust_future_complete_i32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_hatch_browser_core_uniffi_rust_future_complete_i64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_hatch_browser_core_uniffi_rust_future_complete_i8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_core_uniffi_rust_future_complete_u16(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_core_uniffi_rust_future_complete_u32(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_hatch_browser_core_uniffi_rust_future_complete_u64(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_hatch_browser_core_uniffi_rust_future_complete_u8(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_complete_void(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_f32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_f64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_i16(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_i32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_i64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_i8(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_rust_buffer(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_u16(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_u32(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_u64(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_u8(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_free_void(long j);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_f32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_f64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_i16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_i32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_i64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_i8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_rust_buffer(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_u16(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_u32(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_u64(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_u8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_hatch_browser_core_uniffi_rust_future_poll_void(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_hatch_browser_core_uniffi_rustbuffer_alloc(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_hatch_browser_core_uniffi_rustbuffer_free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_core_uniffi_rustbuffer_from_bytes(ForeignBytes.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_hatch_browser_core_uniffi_rustbuffer_reserve(RustBuffer.ByValue byValue, long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserblocklistfilter(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browsercore(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostauthority(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostblocklist(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostdownloads(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostfiles(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostnativecontrols(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostpageclose(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_browserhostpdf(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_commandreport(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_page(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pageaccess(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pageclosure(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pageremoval(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pendingcommand(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pendingpageconnection(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_pendingshutdown(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_taskpagegroup(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_clone_taskpagegroupretirement(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_constructor_browserblocklistfilter_open(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_constructor_browsercore_create(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_constructor_pageaccess_browser_endpoint(RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_constructor_pageaccess_page_endpoint(RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserblocklistfilter(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browsercore(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostauthority(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostblocklist(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostdownloads(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostfiles(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostnativecontrols(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostpageclose(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_browserhostpdf(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_commandreport(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_page(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pageaccess(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pageclosure(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pageremoval(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pendingcommand(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pendingpageconnection(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_pendingshutdown(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_taskpagegroup(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_free_taskpagegroupretirement(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_receipt(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_request(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_decode_page_prepare(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_decode_report(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_decode_request(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_receipt(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_request(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_func_encode_request(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostauthority(UniffiVTableCallbackInterfaceBrowserHostAuthority uniffiVTableCallbackInterfaceBrowserHostAuthority);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostblocklist(UniffiVTableCallbackInterfaceBrowserHostBlocklist uniffiVTableCallbackInterfaceBrowserHostBlocklist);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostdownloads(UniffiVTableCallbackInterfaceBrowserHostDownloads uniffiVTableCallbackInterfaceBrowserHostDownloads);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostfiles(UniffiVTableCallbackInterfaceBrowserHostFiles uniffiVTableCallbackInterfaceBrowserHostFiles);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostnativecontrols(UniffiVTableCallbackInterfaceBrowserHostNativeControls uniffiVTableCallbackInterfaceBrowserHostNativeControls);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpageclose(UniffiVTableCallbackInterfaceBrowserHostPageClose uniffiVTableCallbackInterfaceBrowserHostPageClose);

    public final native void uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpdf(UniffiVTableCallbackInterfaceBrowserHostPdf uniffiVTableCallbackInterfaceBrowserHostPdf);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browserblocklistfilter_info(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_close(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_execute(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_shutdown(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocked_policy_inventory(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocked_policy_site(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocklist_info(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_cancel(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_clear_blocklist_filter(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browsercore_create_task_page_group(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_blocked_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_enhanced_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_header_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_navigation_consent(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enhanced_policy_inventory(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enhanced_site_allowed(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_header_policy_inventory(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_header_policy_rules(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_identity(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_navigation_inventory(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_prescreen_url(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_request_headers(long j, RustBuffer.ByValue byValue, byte b, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browsercore_screen_navigation(long j, RustBuffer.ByValue byValue, byte b);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_blocked_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_blocklist_filter(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_enhanced_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_header_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_navigation_policy(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browsercore_use_blocklist_filter(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostauthority_authorize(long j, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostblocklist_check(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostdownloads_publish(long j, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostfiles_read(long j, RustBuffer.ByValue byValue);

    public final native void uniffi_hatch_browser_core_uniffi_fn_method_browserhostfiles_release(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostfiles_stage(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostnativecontrols_allow(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostpageclose_close_page(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_browserhostpdf_print(long j, RustBuffer.ByValue byValue);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_commandreport_await_settlement(long j);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_commandreport_central_blackhole_sideband(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode_compact(long j, RustBuffer.ByValue byValue);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode_native_facts(long j, RustBuffer.ByValue byValue, int i, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_commandreport_failure_diagnostics(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_commandreport_inspect(long j);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_commandreport_navigation_sideband(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_page_begin_close(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_page_begin_connect(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_page_begin_execute(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_page_begin_reconnect(long j, long j2, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_page_lifecycle_reference(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_page_reference(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_page_remove(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_page_task(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_page_update_state(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pageclosure_await_settlement(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pageclosure_inspect(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pageremoval_await_settlement(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pendingcommand_await_report(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pendingpageconnection_await_reference(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_pendingshutdown_await_settlement(long j);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_add_page(long j, long j2, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_decide_site_access(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_pages(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_retire(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_task(long j, UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_update_control(long j, RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroupretirement_await_settlement(long j);

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C5322DgG.A01(new Function0() { // from class: com.hatch.browser.core.UniffiLib$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = UniffiLib.$stable;
                return Hatch_browser_core_uniffiKt.create(UniffiCleaner.Companion);
            }
        });
        Native.register((Class<?>) UniffiLib.class, Hatch_browser_core_uniffiKt.findLibraryName("hatch_browser_core_uniffi"));
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostauthority(uniffiCallbackInterfaceBrowserHostAuthority.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostblocklist(uniffiCallbackInterfaceBrowserHostBlocklist.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostdownloads(uniffiCallbackInterfaceBrowserHostDownloads.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostfiles(uniffiCallbackInterfaceBrowserHostFiles.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostnativecontrols(uniffiCallbackInterfaceBrowserHostNativeControls.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpageclose(uniffiCallbackInterfaceBrowserHostPageClose.vtable);
        uniffiLib.uniffi_hatch_browser_core_uniffi_fn_init_callback_vtable_browserhostpdf(uniffiCallbackInterfaceBrowserHostPdf.vtable);
        Hatch_browser_protocolKt.uniffiEnsureInitialized();
    }

    public final void ensureInitialized$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
    }

    public final UniffiCleaner getCLEANER$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return AbstractC7609F5w.A0e();
    }
}
