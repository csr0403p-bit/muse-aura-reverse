package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV7;
import X.C3cG;
import X.C7384Etj;
import X.CU7;
import X.F60;
import X.FGI;
import X.G0U;
import X.GAo;
import X.Hm1;
import X.HoC;
import X.Hqw;
import X.HtJ;
import X.HzP;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiCleaner;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.protocol.CommandRequest;
import com.hatch.browser.protocol.FfiConverterTypeCommandRequest;
import com.hatch.browser.protocol.FfiConverterTypePageCloseReceipt;
import com.hatch.browser.protocol.FfiConverterTypePageCloseRequest;
import com.hatch.browser.protocol.FfiConverterTypePagePrepareRequest;
import com.hatch.browser.protocol.FfiConverterTypeReportView;
import com.hatch.browser.protocol.PageCloseReceipt;
import com.hatch.browser.protocol.PageCloseRequest;
import com.hatch.browser.protocol.PagePrepareRequest;
import com.hatch.browser.protocol.ReportView;
import com.hatch.browser.protocol.RustBuffer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class Hatch_browser_core_uniffiKt {
    public static final int IDX_CALLBACK_FREE = 0;
    public static final int UNIFFI_CALLBACK_ERROR = 1;
    public static final int UNIFFI_CALLBACK_SUCCESS = 0;
    public static final int UNIFFI_CALLBACK_UNEXPECTED_ERROR = 2;
    public static final byte UNIFFI_CALL_ERROR = 1;
    public static final byte UNIFFI_CALL_SUCCESS = 0;
    public static final byte UNIFFI_CALL_UNEXPECTED_ERROR = 2;
    public static final long UNIFFI_HANDLEMAP_DELTA = 2;
    public static final long UNIFFI_HANDLEMAP_INITIAL = 1;
    public static final byte UNIFFI_RUST_FUTURE_POLL_READY = 0;
    public static final byte UNIFFI_RUST_FUTURE_POLL_WAKE = 1;
    public static final UniffiHandleMap<Hm1<Byte>> uniffiContinuationHandleMap = new UniffiHandleMap<>();
    public static final UniffiHandleMap<HoC> uniffiForeignFutureHandleMap = new UniffiHandleMap<>();

    @DebugMetadata(c = "com.hatch.browser.core.Hatch_browser_core_uniffiKt", f = "hatch_browser_core_uniffi.kt", l = {9852}, m = "uniffiRustCallAsync", v = 2)
    /* renamed from: com.hatch.browser.core.Hatch_browser_core_uniffiKt$uniffiRustCallAsync$1, reason: invalid class name */
    public final class AnonymousClass1<T, F, E extends Exception> extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Hatch_browser_core_uniffiKt.uniffiRustCallAsync(0L, null, null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final PageCloseReceipt decodePageCloseReceipt(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        FfiConverterTypePageCloseReceipt ffiConverterTypePageCloseReceipt = FfiConverterTypePageCloseReceipt.INSTANCE;
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_receipt = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_receipt(FfiConverterByteArray.INSTANCE.lower((Object) bArr), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return (PageCloseReceipt) ffiConverterTypePageCloseReceipt.lift(byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_receipt);
    }

    public static final PageCloseRequest decodePageCloseRequest(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        FfiConverterTypePageCloseRequest ffiConverterTypePageCloseRequest = FfiConverterTypePageCloseRequest.INSTANCE;
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_request = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_request(FfiConverterByteArray.INSTANCE.lower((Object) bArr), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return (PageCloseRequest) ffiConverterTypePageCloseRequest.lift(byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_close_request);
    }

    public static final PagePrepareRequest decodePagePrepare(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        FfiConverterTypePagePrepareRequest ffiConverterTypePagePrepareRequest = FfiConverterTypePagePrepareRequest.INSTANCE;
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_prepare = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_decode_page_prepare(FfiConverterByteArray.INSTANCE.lower((Object) bArr), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return (PagePrepareRequest) ffiConverterTypePagePrepareRequest.lift(byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_page_prepare);
    }

    public static final ReportView decodeReport(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        FfiConverterTypeReportView ffiConverterTypeReportView = FfiConverterTypeReportView.INSTANCE;
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_report = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_decode_report(FfiConverterByteArray.INSTANCE.lower((Object) bArr), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return (ReportView) ffiConverterTypeReportView.lift(byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_report);
    }

    public static final CommandRequest decodeRequest(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        FfiConverterTypeCommandRequest ffiConverterTypeCommandRequest = FfiConverterTypeCommandRequest.INSTANCE;
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_request = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_decode_request(FfiConverterByteArray.INSTANCE.lower((Object) bArr), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return (CommandRequest) ffiConverterTypeCommandRequest.lift(byValueUniffi_hatch_browser_core_uniffi_fn_func_decode_request);
    }

    public static final <T extends Disposable, R> R use(T t, G0U<? super T, ? extends R> g0u) {
        C7384Etj.A0Y(g0u, 1);
        try {
            R rInvoke = g0u.invoke(t);
            if (t != null) {
                try {
                    t.destroy();
                } catch (Throwable unused) {
                }
            }
            return rInvoke;
        } catch (Throwable th) {
            if (t != null) {
                try {
                    t.destroy();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static final UniffiCleaner create(UniffiCleaner.Companion companion) throws ClassNotFoundException {
        try {
            Class.forName("java.lang.ref.Cleaner");
            return new JavaLangRefCleaner();
        } catch (ClassNotFoundException unused) {
            return new UniffiJnaCleaner();
        }
    }

    public static final synchronized String findLibraryName(String str) {
        String property;
        property = System.getProperty(FGI.A0U("uniffi.component.", str, ".libraryOverride"));
        if (property == null) {
            property = "hatch_browser_core_uniffi";
        }
        return property;
    }

    public static final UniffiHandleMap<Hm1<Byte>> getUniffiContinuationHandleMap() {
        return uniffiContinuationHandleMap;
    }

    public static final UniffiHandleMap<HoC> getUniffiForeignFutureHandleMap() {
        return uniffiForeignFutureHandleMap;
    }

    public static final <E extends Exception> void uniffiCheckCallStatus(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, UniffiRustCallStatus uniffiRustCallStatus) {
        if (AnonymousClass002.A1M(uniffiRustCallStatus.code)) {
            return;
        }
        if (BV7.A1Q(uniffiRustCallStatus.code)) {
            throw uniffiRustCallStatusErrorHandler.lift(uniffiRustCallStatus.error_buf);
        }
        if (!AnonymousClass002.A1Q(uniffiRustCallStatus.code, 2)) {
            throw new InternalException(AnonymousClass001.A0v(".code", C3cG.A0f(uniffiRustCallStatus, "Unknown rust call status: ")));
        }
        RustBuffer.ByValue byValue = uniffiRustCallStatus.error_buf;
        if (byValue.len <= 0) {
            throw new InternalException("Rust panic");
        }
        throw new InternalException(FfiConverterString.INSTANCE.lift(byValue));
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_hatch_browser_core_uniffi_uniffi_contract_version()) {
            throw BV4.A0c("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        int i = IntegrityCheckingUniffiLib.$stable;
        int i2 = UniffiLib.$stable;
    }

    public static final int uniffiForeignFutureHandleCount() {
        return uniffiForeignFutureHandleMap.map.size();
    }

    public static final <U> U uniffiRustCall(G0U<? super UniffiRustCallStatus, ? extends U> g0u) {
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        U uInvoke = g0u.invoke(uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return uInvoke;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:18:0x006e, B:19:0x0071, B:15:0x0042, B:21:0x0079), top: B:28:0x006e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, F, E extends java.lang.Exception> java.lang.Object uniffiRustCallAsync(long r8, X.G0W<? super java.lang.Long, ? super com.hatch.browser.core.UniffiRustFutureContinuationCallback, ? super java.lang.Long, kotlin.Unit> r10, X.G0V<? super java.lang.Long, ? super com.hatch.browser.core.UniffiRustCallStatus, ? extends F> r11, X.G0U<? super java.lang.Long, kotlin.Unit> r12, X.G0U<? super F, ? extends T> r13, com.hatch.browser.core.UniffiRustCallStatusErrorHandler<E> r14, X.HtJ<? super T> r15) {
        /*
            boolean r0 = r15 instanceof com.hatch.browser.core.Hatch_browser_core_uniffiKt.AnonymousClass1
            if (r0 == 0) goto L34
            r6 = r15
            com.hatch.browser.core.Hatch_browser_core_uniffiKt$uniffiRustCallAsync$1 r6 = (com.hatch.browser.core.Hatch_browser_core_uniffiKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r5 = 1
            if (r1 == 0) goto L3f
            if (r1 != r5) goto L3a
            long r8 = r6.J$0
            java.lang.Object r14 = r6.L$4
            com.hatch.browser.core.UniffiRustCallStatusErrorHandler r14 = (com.hatch.browser.core.UniffiRustCallStatusErrorHandler) r14
            java.lang.Object r13 = r6.L$3
            X.G0U r13 = (X.G0U) r13
            java.lang.Object r12 = r6.L$2
            X.G0U r12 = (X.G0U) r12
            java.lang.Object r11 = r6.L$1
            X.G0V r11 = (X.G0V) r11
            java.lang.Object r10 = r6.L$0
            X.G0W r10 = (X.G0W) r10
            goto L6e
        L34:
            com.hatch.browser.core.Hatch_browser_core_uniffiKt$uniffiRustCallAsync$1 r6 = new com.hatch.browser.core.Hatch_browser_core_uniffiKt$uniffiRustCallAsync$1
            r6.<init>(r15)
            goto L12
        L3a:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L3f:
            X.Hwg.A00(r0)
        L42:
            r6.L$0 = r10     // Catch: java.lang.Throwable -> L96
            r6.L$1 = r11     // Catch: java.lang.Throwable -> L96
            r6.L$2 = r12     // Catch: java.lang.Throwable -> L96
            r6.L$3 = r13     // Catch: java.lang.Throwable -> L96
            r6.L$4 = r14     // Catch: java.lang.Throwable -> L96
            r6.J$0 = r8     // Catch: java.lang.Throwable -> L96
            r6.label = r5     // Catch: java.lang.Throwable -> L96
            X.GBL r4 = X.C7Bm.A04(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Long r3 = X.C3cG.A0S(r8)     // Catch: java.lang.Throwable -> L96
            com.hatch.browser.core.uniffiRustFutureContinuationCallbackImpl r2 = com.hatch.browser.core.uniffiRustFutureContinuationCallbackImpl.INSTANCE     // Catch: java.lang.Throwable -> L96
            com.hatch.browser.core.UniffiHandleMap<X.Hm1<java.lang.Byte>> r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiContinuationHandleMap     // Catch: java.lang.Throwable -> L96
            long r0 = r0.insert(r4)     // Catch: java.lang.Throwable -> L96
            java.lang.Long r0 = X.C3cG.A0S(r0)     // Catch: java.lang.Throwable -> L96
            r10.invoke(r3, r2, r0)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r4.A0F()     // Catch: java.lang.Throwable -> L96
            if (r0 != r7) goto L71
            goto L8d
        L6e:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L96
        L71:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L96
            byte r0 = r0.byteValue()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L96
            java.lang.Long r0 = X.C3cG.A0S(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r11.invoke(r0, r1)     // Catch: java.lang.Throwable -> L96
            uniffiCheckCallStatus(r14, r1)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r13.invoke(r0)     // Catch: java.lang.Throwable -> L96
            goto L8e
        L8d:
            return r7
        L8e:
            java.lang.Long r0 = X.C3cG.A0S(r8)
            r12.invoke(r0)
            return r1
        L96:
            r1 = move-exception
            java.lang.Long r0 = X.C3cG.A0S(r8)
            r12.invoke(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(long, X.G0W, X.G0V, X.G0U, X.G0U, com.hatch.browser.core.UniffiRustCallStatusErrorHandler, X.HtJ):java.lang.Object");
    }

    public static final byte[] encodePageCloseReceipt(PageCloseReceipt pageCloseReceipt) {
        FfiConverterByteArray ffiConverterByteArrayA0U = AbstractC7608F5v.A0U(pageCloseReceipt);
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_receipt = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_receipt(FfiConverterTypePageCloseReceipt.INSTANCE.lower((Object) pageCloseReceipt), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return AbstractC7607F5u.A1Y(ffiConverterByteArrayA0U, byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_receipt);
    }

    public static final byte[] encodePageCloseRequest(PageCloseRequest pageCloseRequest) {
        FfiConverterByteArray ffiConverterByteArrayA0U = AbstractC7608F5v.A0U(pageCloseRequest);
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_request = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_request(FfiConverterTypePageCloseRequest.INSTANCE.lower((Object) pageCloseRequest), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return AbstractC7607F5u.A1Y(ffiConverterByteArrayA0U, byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_page_close_request);
    }

    public static final byte[] encodeRequest(CommandRequest commandRequest) {
        FfiConverterByteArray ffiConverterByteArrayA0U = AbstractC7608F5v.A0U(commandRequest);
        ApiExceptionExternalErrorHandler apiExceptionExternalErrorHandler = ApiExceptionExternalErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        RustBuffer.ByValue byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_request = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_func_encode_request(FfiConverterTypeCommandRequest.INSTANCE.lower((Object) commandRequest), uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(apiExceptionExternalErrorHandler, uniffiRustCallStatusA0x);
        return AbstractC7607F5u.A1Y(ffiConverterByteArrayA0U, byValueUniffi_hatch_browser_core_uniffi_fn_func_encode_request);
    }

    public static final void uniffiCheckApiChecksums(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_close_receipt() & 65535) != 31563) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_close_request() & 65535) != 378) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_decode_page_prepare() & 65535) != 36507) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_decode_report() & 65535) != 17341) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_decode_request() & 65535) != 56530) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_encode_page_close_receipt() & 65535) != 6615) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_encode_page_close_request() & 65535) != 24380) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_func_encode_request() & 65535) != 2902) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserblocklistfilter_info() & 65535) != 30144) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_close() & 65535) != 10903) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_execute() & 65535) != 29880) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_begin_shutdown() & 65535) != 52203) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocked_policy_inventory() & 65535) != 13311) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocked_policy_site() & 65535) != 45244) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_blocklist_info() & 65535) != 64259) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_cancel() & 65535) != 46696) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_clear_blocklist_filter() & 65535) != 15363) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_create_task_page_group() & 65535) != 44794) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_blocked_policy() & 65535) != 32148) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_enhanced_policy() & 65535) != 56814) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_header_policy() & 65535) != 8656) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enable_navigation_consent() & 65535) != 3568) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enhanced_policy_inventory() & 65535) != 28646) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_enhanced_site_allowed() & 65535) != 529) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_header_policy_inventory() & 65535) != 60368) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_header_policy_rules() & 65535) != 16294) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_identity() & 65535) != 46074) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_navigation_inventory() & 65535) != 34173) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_prescreen_url() & 65535) != 34495) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_request_headers() & 65535) != 26997) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_screen_navigation() & 65535) != 37762) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_blocked_policy() & 65535) != 61669) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_blocklist_filter() & 65535) != 6816) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_enhanced_policy() & 65535) != 41317) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_header_policy() & 65535) != 38041) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_set_navigation_policy() & 65535) != 50047) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browsercore_use_blocklist_filter() & 65535) != 63389) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostauthority_authorize() & 65535) != 52324) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostblocklist_check() & 65535) != 9232) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostdownloads_publish() & 65535) != 37424) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_stage() & 65535) != 52201) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_read() & 65535) != 12113) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostfiles_release() & 65535) != 32305) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostnativecontrols_allow() & 65535) != 50242) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostpageclose_close_page() & 65535) != 11468) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_browserhostpdf_print() & 65535) != 57669) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_await_settlement() & 65535) != 50561) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_central_blackhole_sideband() & 65535) != 55272) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode() & 65535) != 46171) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode_compact() & 65535) != 34485) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_encode_native_facts() & 65535) != 52048) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_failure_diagnostics() & 65535) != 34473) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_inspect() & 65535) != 20548) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_commandreport_navigation_sideband() & 65535) != 37757) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_close() & 65535) != 50023) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_connect() & 65535) != 4559) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_execute() & 65535) != 48558) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_begin_reconnect() & 65535) != 49441) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_lifecycle_reference() & 65535) != 6440) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_reference() & 65535) != 19226) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_remove() & 65535) != 56710) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_task() & 65535) != 62952) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_page_update_state() & 65535) != 2471) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pageclosure_await_settlement() & 65535) != 53086) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pageclosure_inspect() & 65535) != 41891) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pageremoval_await_settlement() & 65535) != 55634) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pendingcommand_await_report() & 65535) != 62666) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pendingpageconnection_await_reference() & 65535) != 6728) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_pendingshutdown_await_settlement() & 65535) != 40114) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_add_page() & 65535) != 58944) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_decide_site_access() & 65535) != 30976) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_pages() & 65535) != 23176) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_retire() & 65535) != 43242) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_task() & 65535) != 40275) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroup_update_control() & 65535) != 40147) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_method_taskpagegroupretirement_await_settlement() & 65535) != 56607) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_constructor_browserblocklistfilter_open() & 65535) != 61468) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_constructor_browsercore_create() & 65535) != 25621) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_constructor_pageaccess_browser_endpoint() & 65535) != 36109) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if ((integrityCheckingUniffiLib.uniffi_hatch_browser_core_uniffi_checksum_constructor_pageaccess_page_endpoint() & 65535) != 48245) {
            throw BV4.A0c("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final <U, E extends Exception> U uniffiRustCallWithError(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, G0U<? super UniffiRustCallStatus, ? extends U> g0u) {
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        U uInvoke = g0u.invoke(uniffiRustCallStatusA0x);
        uniffiCheckCallStatus(uniffiRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return uInvoke;
    }

    public static final <T> void uniffiTraitInterfaceCall(UniffiRustCallStatus uniffiRustCallStatus, Function0<? extends T> function0, G0U<? super T, Unit> g0u) {
        String strA00;
        AnonymousClass003.A0u(uniffiRustCallStatus, function0);
        C7384Etj.A0Y(g0u, 2);
        try {
            g0u.invoke(function0.invoke());
        } catch (Exception e) {
            try {
                strA00 = CU7.A00(e);
            } catch (Throwable unused) {
                strA00 = "";
            }
            uniffiRustCallStatus.code = (byte) 2;
            uniffiRustCallStatus.error_buf = FfiConverterString.INSTANCE.lower(strA00);
        }
    }

    public static final <T> void uniffiTraitInterfaceCallAsync(G0U<? super HtJ<? super T>, ? extends Object> g0u, G0U<? super T, Unit> g0u2, G0U<? super UniffiRustCallStatus.ByValue, Unit> g0u3, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        AnonymousClass005.A14(g0u, g0u2, g0u3, uniffiForeignFutureDroppedCallbackStruct);
        GAo.A03(uniffiForeignFutureDroppedCallbackStruct, new Hatch_browser_core_uniffiKt$uniffiTraitInterfaceCallAsync$job$1(g0u, g0u3, g0u2, null), Hqw.A00);
    }

    public static final /* synthetic */ <T, E extends Throwable> void uniffiTraitInterfaceCallAsyncWithError(G0U<? super HtJ<? super T>, ? extends Object> g0u, G0U<? super T, Unit> g0u2, G0U<? super UniffiRustCallStatus.ByValue, Unit> g0u3, G0U<? super E, RustBuffer.ByValue> g0u4, UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public static final /* synthetic */ <T, E extends Throwable> void uniffiTraitInterfaceCallWithError(UniffiRustCallStatus uniffiRustCallStatus, Function0<? extends T> function0, G0U<? super T, Unit> g0u, G0U<? super E, RustBuffer.ByValue> g0u2) {
        AnonymousClass003.A0x(function0, g0u);
        try {
            g0u.invoke(function0.invoke());
        } catch (Exception unused) {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }
    }
}
