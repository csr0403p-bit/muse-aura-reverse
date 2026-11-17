package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.C06H;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.HtJ;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiCleaner;
import com.hatch.browser.protocol.Access;
import com.hatch.browser.protocol.PageAuthorityClaim;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class BrowserHostAuthorityImpl implements AutoCloseable, Disposable, BrowserHostAuthority {
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
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_browserhostauthority(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    public static final NativePageAuthorityDecision authorize$lambda$4(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        return (NativePageAuthorityDecision) FfiConverterTypeNativePageAuthorityDecision.INSTANCE.lift(byValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r3 = move-exception;
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
            if (r0 == 0) goto L53
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L4
            long r0 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = X.G0U.A00(r8, r0)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            com.hatch.browser.core.UniffiCleaner$Cleanable r0 = r7.cleanable
            if (r0 == 0) goto L3a
            r0.clean()
        L3a:
            return r3
        L3b:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L52
            com.hatch.browser.core.UniffiCleaner$Cleanable r0 = r7.cleanable
            if (r0 == 0) goto L52
            r0.clean()
            throw r3
        L4e:
            java.lang.IllegalStateException r3 = X.FGI.A03(r7)
        L52:
            throw r3
        L53:
            java.lang.IllegalStateException r3 = X.FGI.A02(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserHostAuthorityImpl.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r3 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object authorize$suspendImpl(com.hatch.browser.core.BrowserHostAuthorityImpl r7, com.hatch.browser.protocol.PageAuthorityClaim r8, com.hatch.browser.protocol.Access r9, X.HtJ<? super com.hatch.browser.core.NativePageAuthorityDecision> r10) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.get()
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L77
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L72
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            boolean r0 = X.AbstractC7610F5x.A1Y(r0, r1)
            if (r0 == 0) goto L0
            long r1 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L5f
            com.hatch.browser.core.UniffiLib r4 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L5f
            com.hatch.browser.protocol.FfiConverterTypePageAuthorityClaim r0 = com.hatch.browser.protocol.FfiConverterTypePageAuthorityClaim.INSTANCE     // Catch: java.lang.Throwable -> L5f
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.lower(r8)     // Catch: java.lang.Throwable -> L5f
            com.hatch.browser.protocol.FfiConverterTypeAccess r0 = com.hatch.browser.protocol.FfiConverterTypeAccess.INSTANCE     // Catch: java.lang.Throwable -> L5f
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L5f
            long r3 = r4.uniffi_hatch_browser_core_uniffi_fn_method_browserhostauthority_authorize(r1, r3, r0)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L44
            com.hatch.browser.core.UniffiCleaner$Cleanable r0 = r7.cleanable
            if (r0 == 0) goto L44
            r0.clean()
        L44:
            com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda0 r5 = new com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda0
            r5.<init>()
            com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda1 r6 = new com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda1
            r6.<init>()
            com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda2 r7 = new com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda2
            r7.<init>()
            com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda3 r8 = new com.hatch.browser.core.BrowserHostAuthorityImpl$$ExternalSyntheticLambda3
            r8.<init>()
            com.hatch.browser.core.NativeException$ErrorHandler r9 = com.hatch.browser.core.NativeException.ErrorHandler
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L5f:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicLong r0 = r7.callCounter
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L76
            com.hatch.browser.core.UniffiCleaner$Cleanable r0 = r7.cleanable
            if (r0 == 0) goto L76
            r0.clean()
            throw r3
        L72:
            java.lang.IllegalStateException r3 = X.FGI.A03(r7)
        L76:
            throw r3
        L77:
            java.lang.IllegalStateException r3 = X.FGI.A02(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserHostAuthorityImpl.authorize$suspendImpl(com.hatch.browser.core.BrowserHostAuthorityImpl, com.hatch.browser.protocol.PageAuthorityClaim, com.hatch.browser.protocol.Access, X.HtJ):java.lang.Object");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        UniffiCleaner.Cleanable cleanable;
        if (C3cI.A1W(this.wasDestroyed) && this.callCounter.decrementAndGet() == 0 && (cleanable = this.cleanable) != null) {
            cleanable.clean();
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
        long jUniffi_hatch_browser_core_uniffi_fn_clone_browserhostauthority = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_browserhostauthority(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_browserhostauthority;
    }

    public BrowserHostAuthorityImpl(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    public static final Unit authorize$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    @Override // com.hatch.browser.core.BrowserHostAuthority
    public Object authorize(PageAuthorityClaim pageAuthorityClaim, Access access, HtJ<? super NativePageAuthorityDecision> htJ) {
        return authorize$suspendImpl(this, pageAuthorityClaim, access, htJ);
    }

    public BrowserHostAuthorityImpl(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
