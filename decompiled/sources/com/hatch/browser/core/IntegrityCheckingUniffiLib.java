package com.hatch.browser.core;

import com.sun.jna.Native;

/* loaded from: classes6.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_hatch_browser_core_uniffi_uniffi_contract_version();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_constructor_browserblocklistfilter_open();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_constructor_browsercore_create();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_constructor_pageaccess_browser_endpoint();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_constructor_pageaccess_page_endpoint();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_close_receipt();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_close_request();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_prepare();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_decode_report();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_decode_request();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_encode_page_close_receipt();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_encode_page_close_request();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_func_encode_request();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserblocklistfilter_info();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_close();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_execute();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_shutdown();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocked_policy_inventory();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocked_policy_site();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocklist_info();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_cancel();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_clear_blocklist_filter();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_create_task_page_group();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_blocked_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_enhanced_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_header_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_navigation_consent();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enhanced_policy_inventory();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enhanced_site_allowed();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_header_policy_inventory();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_header_policy_rules();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_identity();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_navigation_inventory();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_prescreen_url();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_request_headers();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_screen_navigation();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_blocked_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_blocklist_filter();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_enhanced_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_header_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_navigation_policy();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_use_blocklist_filter();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostauthority_authorize();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostblocklist_check();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostdownloads_publish();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_read();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_release();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_stage();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostnativecontrols_allow();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostpageclose_close_page();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_browserhostpdf_print();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_await_settlement();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_central_blackhole_sideband();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode_compact();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode_native_facts();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_failure_diagnostics();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_inspect();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_navigation_sideband();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_close();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_connect();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_execute();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_reconnect();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_lifecycle_reference();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_reference();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_remove();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_task();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_page_update_state();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pageclosure_await_settlement();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pageclosure_inspect();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pageremoval_await_settlement();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pendingcommand_await_report();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pendingpageconnection_await_reference();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_pendingshutdown_await_settlement();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_add_page();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_decide_site_access();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_pages();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_retire();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_task();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_update_control();

    public final native int uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroupretirement_await_settlement();

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, Hatch_browser_core_uniffiKt.findLibraryName("hatch_browser_core_uniffi"));
        Hatch_browser_core_uniffiKt.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
        Hatch_browser_core_uniffiKt.uniffiCheckApiChecksums(integrityCheckingUniffiLib);
    }

    public final void ensureInitialized$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
    }
}
