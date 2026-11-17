package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.C06H;
import X.C3cI;
import X.C60O;
import com.hatch.browser.core.UniffiCleaner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class Page implements AutoCloseable, Disposable, PageInterface {
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
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_page(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PageClosure beginClose(com.hatch.browser.protocol.PageCloseInvocation r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L5b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.FfiConverterTypePageCloseInvocation r0 = com.hatch.browser.protocol.FfiConverterTypePageCloseInvocation.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L4b
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_page_begin_close(r1, r0, r4)     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L4b
            long r4 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PageClosure r0 = new com.hatch.browser.core.PageClosure
            r0.<init>(r1, r2)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.beginClose(com.hatch.browser.protocol.PageCloseInvocation):com.hatch.browser.core.PageClosure");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PendingPageConnection beginConnect(com.hatch.browser.protocol.Budget r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L5b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.FfiConverterTypeBudget r0 = com.hatch.browser.protocol.FfiConverterTypeBudget.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L4b
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_page_begin_connect(r1, r0, r4)     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L4b
            long r4 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PendingPageConnection r0 = new com.hatch.browser.core.PendingPageConnection
            r0.<init>(r1, r2)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.beginConnect(com.hatch.browser.protocol.Budget):com.hatch.browser.core.PendingPageConnection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PendingCommand beginExecute(com.hatch.browser.protocol.PageCommandInvocation r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L5b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L56
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.FfiConverterTypePageCommandInvocation r0 = com.hatch.browser.protocol.FfiConverterTypePageCommandInvocation.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L4b
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_page_begin_execute(r1, r0, r4)     // Catch: java.lang.Throwable -> L4b
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L4b
            long r4 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PendingCommand r0 = new com.hatch.browser.core.PendingCommand
            r0.<init>(r1, r2)
            return r0
        L4b:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.beginExecute(com.hatch.browser.protocol.PageCommandInvocation):com.hatch.browser.core.PendingCommand");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        X.AbstractC7609F5w.A1E(r7, (X.AbstractC7607F5u.A0Q(r7) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r7) == 0 ? 0 : -1)));
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
            long r1 = X.AbstractC7607F5u.A0Q(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r7, r0)
            return r3
        L33:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r7, r0)
            throw r3
        L3e:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L43:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        X.AbstractC7609F5w.A1E(r9, (X.AbstractC7607F5u.A0Q(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.NotificationAck updateState(com.hatch.browser.protocol.PageStateChange r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            com.hatch.browser.protocol.FfiConverterTypeNotificationAck r6 = com.hatch.browser.protocol.FfiConverterTypeNotificationAck.INSTANCE
        L6:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.get()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L5c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L57
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L6
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.protocol.FfiConverterTypePageStateChange r0 = com.hatch.browser.protocol.FfiConverterTypePageStateChange.INSTANCE     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r10)     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_page_update_state(r1, r0, r4)     // Catch: java.lang.Throwable -> L4c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L4c
            long r1 = X.AbstractC7607F5u.A0Q(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r9, r0)
            java.lang.Object r0 = r6.lift(r3)
            com.hatch.browser.protocol.NotificationAck r0 = (com.hatch.browser.protocol.NotificationAck) r0
            return r0
        L4c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r9, r0)
            throw r3
        L57:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.updateState(com.hatch.browser.protocol.PageStateChange):com.hatch.browser.protocol.NotificationAck");
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        X.AbstractC7609F5w.A1E(r14, (X.AbstractC7607F5u.A0Q(r14) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r14) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PendingPageConnection beginReconnect(com.hatch.browser.core.PageAccess r15, com.hatch.browser.protocol.Budget r16) {
        /*
            r14 = this;
            r3 = r16
            X.AnonymousClass003.A0u(r15, r3)
        L5:
            r5 = r14
            java.util.concurrent.atomic.AtomicLong r0 = r14.callCounter
            long r1 = r0.get()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L63
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L5e
            java.util.concurrent.atomic.AtomicLong r0 = r14.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L5
            long r11 = r14.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.core.UniffiLib r10 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L53
            long r13 = r15.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.protocol.FfiConverterTypeBudget r0 = com.hatch.browser.protocol.FfiConverterTypeBudget.INSTANCE     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.protocol.RustBuffer$ByValue r15 = r0.lower(r3)     // Catch: java.lang.Throwable -> L53
            r16 = r1
            long r3 = r10.uniffi_hatch_browser_core_uniffi_fn_method_page_begin_reconnect(r11, r13, r15, r16)     // Catch: java.lang.Throwable -> L53
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L53
            long r1 = X.AbstractC7607F5u.A0Q(r5)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r5, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PendingPageConnection r0 = new com.hatch.browser.core.PendingPageConnection
            r0.<init>(r1, r3)
            return r0
        L53:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r5)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r5, r0)
            throw r3
        L5e:
            java.lang.IllegalStateException r0 = X.FGI.A03(r14)
            throw r0
        L63:
            java.lang.IllegalStateException r0 = X.FGI.A02(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.beginReconnect(com.hatch.browser.core.PageAccess, com.hatch.browser.protocol.Budget):com.hatch.browser.core.PendingPageConnection");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        if (C3cI.A1W(this.wasDestroyed)) {
            AbstractC7609F5w.A1E(this, (AbstractC7607F5u.A0Q(this) > 0L ? 1 : (AbstractC7607F5u.A0Q(this) == 0L ? 0 : -1)));
        }
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
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.PageReference lifecycleReference() {
        /*
            r8 = this;
            com.hatch.browser.protocol.FfiConverterTypePageReference r5 = com.hatch.browser.protocol.FfiConverterTypePageReference.INSTANCE
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
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_page_lifecycle_reference(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            com.hatch.browser.protocol.PageReference r0 = (com.hatch.browser.protocol.PageReference) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.lifecycleReference():com.hatch.browser.protocol.PageReference");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.PageReference reference() {
        /*
            r8 = this;
            com.hatch.browser.protocol.FfiConverterTypePageReference r5 = com.hatch.browser.protocol.FfiConverterTypePageReference.INSTANCE
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
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_page_reference(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            com.hatch.browser.protocol.PageReference r0 = (com.hatch.browser.protocol.PageReference) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.reference():com.hatch.browser.protocol.PageReference");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PageRemoval remove() {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4c
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r2 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L41
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r4 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L41
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L41
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L41
            long r2 = r0.uniffi_hatch_browser_core_uniffi_fn_method_page_remove(r2, r1)     // Catch: java.lang.Throwable -> L41
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r4, r1)     // Catch: java.lang.Throwable -> L41
            long r4 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PageRemoval r0 = new com.hatch.browser.core.PageRemoval
            r0.<init>(r1, r2)
            return r0
        L41:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L51:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.remove():com.hatch.browser.core.PageRemoval");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7609F5w.A1E(r8, (X.AbstractC7607F5u.A0Q(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0Q(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.PageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.BrowserTaskBinding task() {
        /*
            r8 = this;
            com.hatch.browser.protocol.FfiConverterTypeBrowserTaskBinding r5 = com.hatch.browser.protocol.FfiConverterTypeBrowserTaskBinding.INSTANCE
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
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_page_task(r3, r1)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            com.hatch.browser.protocol.BrowserTaskBinding r0 = (com.hatch.browser.protocol.BrowserTaskBinding) r0
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0Q(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7609F5w.A1E(r8, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.Page.task():com.hatch.browser.protocol.BrowserTaskBinding");
    }

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw AbstractC7608F5v.A0V();
        }
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        long jUniffi_hatch_browser_core_uniffi_fn_clone_page = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_page(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_page;
    }

    public Page(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    public Page(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
