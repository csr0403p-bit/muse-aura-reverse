package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C06H;
import X.C3cI;
import X.C60O;
import com.hatch.browser.core.UniffiCleaner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class TaskPageGroup implements AutoCloseable, Disposable, TaskPageGroupInterface {
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
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_taskpagegroup(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        X.AbstractC7610F5x.A1G(r7, (r7.callCounter.decrementAndGet() > 0 ? 1 : (r7.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
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
            if (r0 == 0) goto L47
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r0 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = X.G0U.A00(r8, r0)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r7, r0)
            return r3
        L35:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r7, r0)
            throw r3
        L42:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        X.AbstractC7610F5x.A1G(r9, (r9.callCounter.decrementAndGet() > 0 ? 1 : (r9.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.NotificationAck updateControl(com.hatch.browser.protocol.TaskPageGroupControlChange r10) {
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
            if (r0 == 0) goto L60
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L5b
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L6
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.protocol.FfiConverterTypeTaskPageGroupControlChange r0 = com.hatch.browser.protocol.FfiConverterTypeTaskPageGroupControlChange.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r10)     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_update_control(r1, r0, r4)     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r9, r0)
            java.lang.Object r0 = r6.lift(r3)
            com.hatch.browser.protocol.NotificationAck r0 = (com.hatch.browser.protocol.NotificationAck) r0
            return r0
        L4e:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r9, r0)
            throw r3
        L5b:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L60:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.updateControl(com.hatch.browser.protocol.TaskPageGroupControlChange):com.hatch.browser.protocol.NotificationAck");
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        X.AbstractC7610F5x.A1G(r14, (r14.callCounter.decrementAndGet() > 0 ? 1 : (r14.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.Page addPage(com.hatch.browser.core.PageAccess r15, com.hatch.browser.protocol.PageStateChange r16) {
        /*
            r14 = this;
            r3 = r16
            X.AnonymousClass003.A0u(r15, r3)
        L5:
            r4 = r14
            java.util.concurrent.atomic.AtomicLong r0 = r14.callCounter
            long r1 = r0.get()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L67
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L62
            java.util.concurrent.atomic.AtomicLong r0 = r14.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L5
            long r11 = r14.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.UniffiLib r10 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L55
            long r13 = r15.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.protocol.FfiConverterTypePageStateChange r0 = com.hatch.browser.protocol.FfiConverterTypePageStateChange.INSTANCE     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.protocol.RustBuffer$ByValue r15 = r0.lower(r3)     // Catch: java.lang.Throwable -> L55
            r16 = r1
            long r2 = r10.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_add_page(r11, r13, r15, r16)     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r1)     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.atomic.AtomicLong r0 = r4.callCounter
            long r5 = r0.decrementAndGet()
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r4, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.Page r0 = new com.hatch.browser.core.Page
            r0.<init>(r1, r2)
            return r0
        L55:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r4.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r4, r0)
            throw r3
        L62:
            java.lang.IllegalStateException r0 = X.FGI.A03(r14)
            throw r0
        L67:
            java.lang.IllegalStateException r0 = X.FGI.A02(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.addPage(com.hatch.browser.core.PageAccess, com.hatch.browser.protocol.PageStateChange):com.hatch.browser.core.Page");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        if (C3cI.A1W(this.wasDestroyed)) {
            AbstractC7610F5x.A1G(this, (this.callCounter.decrementAndGet() > 0L ? 1 : (this.callCounter.decrementAndGet() == 0L ? 0 : -1)));
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        X.AbstractC7610F5x.A1G(r8, (r8.callCounter.decrementAndGet() > 0 ? 1 : (r8.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.hatch.browser.core.Page> pages() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterSequenceTypePage r5 = com.hatch.browser.core.FfiConverterSequenceTypePage.INSTANCE
        L2:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.get()
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L56
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L51
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_pages(r3, r1)     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            java.util.List r0 = (java.util.List) r0
            return r0
        L44:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            throw r3
        L51:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.pages():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        X.AbstractC7610F5x.A1G(r8, (r8.callCounter.decrementAndGet() > 0 ? 1 : (r8.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.TaskPageGroupRetirement retire() {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L55
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r2 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L43
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r4 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L43
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L43
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L43
            long r2 = r0.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_retire(r2, r1)     // Catch: java.lang.Throwable -> L43
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r4, r1)     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r4 = r0.decrementAndGet()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.TaskPageGroupRetirement r0 = new com.hatch.browser.core.TaskPageGroupRetirement
            r0.<init>(r1, r2)
            return r0
        L43:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            throw r3
        L50:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L55:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.retire():com.hatch.browser.core.TaskPageGroupRetirement");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        X.AbstractC7610F5x.A1G(r8, (r8.callCounter.decrementAndGet() > 0 ? 1 : (r8.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
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
            if (r0 == 0) goto L56
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L51
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_task(r3, r1)     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            com.hatch.browser.protocol.BrowserTaskBinding r0 = (com.hatch.browser.protocol.BrowserTaskBinding) r0
            return r0
        L44:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r8.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r8, r0)
            throw r3
        L51:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L56:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.task():com.hatch.browser.protocol.BrowserTaskBinding");
    }

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw AbstractC7608F5v.A0V();
        }
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        long jUniffi_hatch_browser_core_uniffi_fn_clone_taskpagegroup = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_taskpagegroup(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_taskpagegroup;
    }

    public TaskPageGroup(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        X.AbstractC7610F5x.A1G(r9, (r9.callCounter.decrementAndGet() > 0 ? 1 : (r9.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.TaskPageGroupInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] decideSiteAccess(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.get()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L5a
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L55
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_taskpagegroup_decide_site_access(r2, r0, r4)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L48:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1G(r9, r0)
            throw r3
        L55:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5a:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.TaskPageGroup.decideSiteAccess(byte[]):byte[]");
    }

    public TaskPageGroup(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
