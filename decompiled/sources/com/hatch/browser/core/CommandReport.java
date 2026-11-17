package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C06H;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.HtJ;
import com.hatch.browser.core.UniffiCleaner;
import com.hatch.browser.protocol.FfiConverterTypeReportView;
import com.hatch.browser.protocol.FfiConverterTypeSettlementReceipt;
import com.hatch.browser.protocol.ReportEncodingOptions;
import com.hatch.browser.protocol.ReportView;
import com.hatch.browser.protocol.RustBuffer;
import com.hatch.browser.protocol.SettlementReceipt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class CommandReport implements AutoCloseable, Disposable, CommandReportInterface {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AtomicLong callCounter;
    public final UniffiCleaner.Cleanable cleanable;
    public final long handle;
    public final AtomicBoolean wasDestroyed;

    public final class UniffiCleanAction implements Runnable {
        public final long handle;

        @Override // java.lang.Runnable
        public void run() {
            if (this.handle != 0) {
                UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
                UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_commandreport(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    public static final SettlementReceipt awaitSettlement$lambda$4(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        return (SettlementReceipt) FfiConverterTypeSettlementReceipt.INSTANCE.lift(byValue);
    }

    public static final ReportView inspect$lambda$4(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        return (ReportView) FfiConverterTypeReportView.INSTANCE.lift(byValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        X.AbstractC7610F5x.A1D(r7, (X.AbstractC7607F5u.A0P(r7) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r7) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> R callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U<? super java.lang.Long, ? extends R> r8) {
        /*
            r7 = this;
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
        L4:
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.get()
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L43
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L3e
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r0 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = X.G0U.A00(r8, r0)     // Catch: java.lang.Throwable -> L33
            long r1 = X.AbstractC7607F5u.A0P(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r7, r0)
            return r3
        L33:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r7, r0)
            throw r3
        L3e:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L43:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        destroy();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        X.AbstractC7610F5x.A1D(r9, (X.AbstractC7607F5u.A0P(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object awaitSettlement$suspendImpl(com.hatch.browser.core.CommandReport r9, X.HtJ<? super com.hatch.browser.protocol.SettlementReceipt> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5b
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            long r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_await_settlement(r1)     // Catch: java.lang.Throwable -> L4b
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda8 r5 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda8
            r5.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda9 r6 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda9
            r6.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda10 r7 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda10
            r7.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda11 r8 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda11
            r8.<init>()
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r9 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.awaitSettlement$suspendImpl(com.hatch.browser.core.CommandReport, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        X.AbstractC7610F5x.A1D(r9, (X.AbstractC7607F5u.A0P(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object encode$suspendImpl(com.hatch.browser.core.CommandReport r9, X.HtJ<? super byte[]> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5b
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            long r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode(r1)     // Catch: java.lang.Throwable -> L4b
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda12 r5 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda12
            r5.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda13 r6 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda13
            r6.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda14 r7 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda14
            r7.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda15 r8 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda15
            r8.<init>()
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r9 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.encode$suspendImpl(com.hatch.browser.core.CommandReport, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        X.AbstractC7610F5x.A1D(r8, (X.AbstractC7607F5u.A0P(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object encodeCompact$suspendImpl(com.hatch.browser.core.CommandReport r8, com.hatch.browser.protocol.ReportEncodingOptions r9, X.HtJ<? super byte[]> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L61
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L5c
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L0
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L51
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L51
            com.hatch.browser.protocol.FfiConverterTypeReportEncodingOptions r0 = com.hatch.browser.protocol.FfiConverterTypeReportEncodingOptions.INSTANCE     // Catch: java.lang.Throwable -> L51
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L51
            long r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode_compact(r1, r0)     // Catch: java.lang.Throwable -> L51
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda0 r5 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda0
            r5.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda1 r6 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda1
            r6.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda2 r7 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda2
            r7.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda3 r8 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda3
            r8.<init>()
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r9 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L51:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            throw r3
        L5c:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.encodeCompact$suspendImpl(com.hatch.browser.core.CommandReport, com.hatch.browser.protocol.ReportEncodingOptions, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        X.AbstractC7610F5x.A1D(r9, (X.AbstractC7607F5u.A0P(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object inspect$suspendImpl(com.hatch.browser.core.CommandReport r9, X.HtJ<? super com.hatch.browser.protocol.ReportView> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5b
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            long r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_inspect(r1)     // Catch: java.lang.Throwable -> L4b
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda4 r5 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda4
            r5.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda5 r6 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda5
            r6.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda6 r7 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda6
            r7.<init>()
            com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda7 r8 = new com.hatch.browser.core.CommandReport$$ExternalSyntheticLambda7
            r8.<init>()
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r9 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r9)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r9, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.inspect$suspendImpl(com.hatch.browser.core.CommandReport, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1D(r8, (X.AbstractC7607F5u.A0P(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.CommandReportInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] centralBlackholeSideband() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterOptionalByteArray r5 = com.hatch.browser.core.FfiConverterOptionalByteArray.INSTANCE
        L2:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_central_blackhole_sideband(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            byte[] r0 = (byte[]) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.centralBlackholeSideband():byte[]");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        if (C3cI.A1W(this.wasDestroyed)) {
            AbstractC7610F5x.A1D(this, (AbstractC7607F5u.A0P(this) > 0L ? 1 : (AbstractC7607F5u.A0P(this) == 0L ? 0 : -1)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        X.AbstractC7610F5x.A1D(r15, (X.AbstractC7607F5u.A0P(r15) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r15) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.CommandReportInterface
    /* renamed from: encodeNativeFacts-Qn1smSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] mo3227encodeNativeFactsQn1smSk(com.hatch.browser.protocol.ReleaseReason r16, int r17) {
        /*
            r15 = this;
            r3 = r16
            com.hatch.browser.core.FfiConverterByteArray r4 = X.AbstractC7608F5v.A0U(r3)
        L6:
            java.util.concurrent.atomic.AtomicLong r0 = r15.callCounter
            long r1 = r0.get()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L5e
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L59
            java.util.concurrent.atomic.AtomicLong r0 = r15.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L6
            long r10 = r15.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r1 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiRustCallStatus r14 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiLib r9 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.protocol.FfiConverterTypeReleaseReason r0 = com.hatch.browser.protocol.FfiConverterTypeReleaseReason.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.protocol.RustBuffer$ByValue r12 = r0.lower(r3)     // Catch: java.lang.Throwable -> L4e
            int r13 = X.BV6.A02(r17)     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.RustBuffer$ByValue r3 = r9.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_encode_native_facts(r10, r12, r13, r14)     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r1, r14)     // Catch: java.lang.Throwable -> L4e
            long r1 = X.AbstractC7607F5u.A0P(r15)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r15, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r4, r3)
            return r0
        L4e:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r15)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r15, r0)
            throw r3
        L59:
            java.lang.IllegalStateException r0 = X.FGI.A03(r15)
            throw r0
        L5e:
            java.lang.IllegalStateException r0 = X.FGI.A02(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.mo3227encodeNativeFactsQn1smSk(com.hatch.browser.protocol.ReleaseReason, int):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1D(r8, (X.AbstractC7607F5u.A0P(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.CommandReportInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String failureDiagnostics() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterOptionalString r5 = com.hatch.browser.core.FfiConverterOptionalString.INSTANCE
        L2:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_failure_diagnostics(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.failureDiagnostics():java.lang.String");
    }

    public final UniffiCleaner.Cleanable getCleanable() {
        return this.cleanable;
    }

    public final long getHandle() {
        return this.handle;
    }

    public final boolean getUniffiIsDestroyed() {
        return this.wasDestroyed.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1D(r8, (X.AbstractC7607F5u.A0P(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0P(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.CommandReportInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] navigationSideband() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterOptionalByteArray r5 = com.hatch.browser.core.FfiConverterOptionalByteArray.INSTANCE
        L2:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_commandreport_navigation_sideband(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            byte[] r0 = (byte[]) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0P(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1D(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.CommandReport.navigationSideband():byte[]");
    }

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw AbstractC7608F5v.A0V();
        }
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        long jUniffi_hatch_browser_core_uniffi_fn_clone_commandreport = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_commandreport(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_commandreport;
    }

    public CommandReport(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    public static final Unit awaitSettlement$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit encode$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit encodeCompact$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit inspect$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    @Override // com.hatch.browser.core.CommandReportInterface
    public Object awaitSettlement(HtJ<? super SettlementReceipt> htJ) {
        return awaitSettlement$suspendImpl(this, htJ);
    }

    @Override // com.hatch.browser.core.CommandReportInterface
    public Object encode(HtJ<? super byte[]> htJ) {
        return encode$suspendImpl(this, htJ);
    }

    @Override // com.hatch.browser.core.CommandReportInterface
    public Object encodeCompact(ReportEncodingOptions reportEncodingOptions, HtJ<? super byte[]> htJ) {
        return encodeCompact$suspendImpl(this, reportEncodingOptions, htJ);
    }

    @Override // com.hatch.browser.core.CommandReportInterface
    public Object inspect(HtJ<? super ReportView> htJ) {
        return inspect$suspendImpl(this, htJ);
    }

    public CommandReport(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
