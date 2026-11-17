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
import com.hatch.browser.protocol.FfiConverterTypePageCloseReceipt;
import com.hatch.browser.protocol.PageCloseReceipt;
import com.hatch.browser.protocol.RustBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class PageClosure implements AutoCloseable, Disposable, PageClosureInterface {
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
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_pageclosure(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    public static final PageCloseReceipt awaitSettlement$lambda$4(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        return (PageCloseReceipt) FfiConverterTypePageCloseReceipt.INSTANCE.lift(byValue);
    }

    public static final PageCloseReceipt inspect$lambda$4(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        return (PageCloseReceipt) FfiConverterTypePageCloseReceipt.INSTANCE.lift(byValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        X.AbstractC7610F5x.A1E(r7, (r7.callCounter.decrementAndGet() > 0 ? 1 : (r7.callCounter.decrementAndGet() == 0 ? 0 : -1)));
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
            X.AbstractC7610F5x.A1E(r7, r0)
            return r3
        L35:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1E(r7, r0)
            throw r3
        L42:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.PageClosure.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        X.AbstractC7610F5x.A1E(r9, (r9.callCounter.decrementAndGet() > 0 ? 1 : (r9.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object awaitSettlement$suspendImpl(com.hatch.browser.core.PageClosure r9, X.HtJ<? super com.hatch.browser.protocol.PageCloseReceipt> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4d
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4d
            long r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_pageclosure_await_settlement(r1)     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1E(r9, r0)
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda4 r5 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda4
            r5.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda5 r6 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda5
            r6.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda6 r7 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda6
            r7.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda7 r8 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda7
            r8.<init>()
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r9 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L4d:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1E(r9, r0)
            throw r3
        L5a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.PageClosure.awaitSettlement$suspendImpl(com.hatch.browser.core.PageClosure, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        X.AbstractC7610F5x.A1E(r9, (r9.callCounter.decrementAndGet() > 0 ? 1 : (r9.callCounter.decrementAndGet() == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object inspect$suspendImpl(com.hatch.browser.core.PageClosure r9, X.HtJ<? super com.hatch.browser.protocol.PageCloseReceipt> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L5f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r3)
            if (r0 == 0) goto L0
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4d
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4d
            long r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_pageclosure_inspect(r1)     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1E(r9, r0)
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda0 r5 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda0
            r5.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda1 r6 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda1
            r6.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda2 r7 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda2
            r7.<init>()
            com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda3 r8 = new com.hatch.browser.core.PageClosure$$ExternalSyntheticLambda3
            r8.<init>()
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r9 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L4d:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r9.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1E(r9, r0)
            throw r3
        L5a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L5f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.PageClosure.inspect$suspendImpl(com.hatch.browser.core.PageClosure, X.HtJ):java.lang.Object");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        if (C3cI.A1W(this.wasDestroyed)) {
            AbstractC7610F5x.A1E(this, (this.callCounter.decrementAndGet() > 0L ? 1 : (this.callCounter.decrementAndGet() == 0L ? 0 : -1)));
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

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw AbstractC7608F5v.A0V();
        }
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        long jUniffi_hatch_browser_core_uniffi_fn_clone_pageclosure = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_pageclosure(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_pageclosure;
    }

    public PageClosure(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    public static final Unit awaitSettlement$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit inspect$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    @Override // com.hatch.browser.core.PageClosureInterface
    public Object awaitSettlement(HtJ<? super PageCloseReceipt> htJ) {
        return awaitSettlement$suspendImpl(this, htJ);
    }

    @Override // com.hatch.browser.core.PageClosureInterface
    public Object inspect(HtJ<? super PageCloseReceipt> htJ) {
        return inspect$suspendImpl(this, htJ);
    }

    public PageClosure(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
