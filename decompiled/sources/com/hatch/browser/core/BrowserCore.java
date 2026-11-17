package com.hatch.browser.core;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.UniffiCleaner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* loaded from: classes6.dex */
public class BrowserCore implements AutoCloseable, Disposable, BrowserCoreInterface {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AtomicLong callCounter;
    public final UniffiCleaner.Cleanable cleanable;
    public final long handle;
    public final AtomicBoolean wasDestroyed;

    public final class Companion {
        public static final Unit create$lambda$0(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
            C7384Etj.A0Y(uniffiRustFutureContinuationCallback, 1);
            UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_poll_u64(j, uniffiRustFutureContinuationCallback, j2);
            return Unit.INSTANCE;
        }

        public static final long create$lambda$1(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            C7384Etj.A0Y(uniffiRustCallStatus, 1);
            return UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_complete_u64(j, uniffiRustCallStatus);
        }

        public static final Unit create$lambda$2(long j) {
            UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_free_u64(j);
            return Unit.INSTANCE;
        }

        public static final BrowserCore create$lambda$3(long j) {
            return new BrowserCore(UniffiWithHandle.INSTANCE, j);
        }

        public final Object create(BrowserHostAuthority browserHostAuthority, BrowserCoreOptions browserCoreOptions, HtJ<? super BrowserCore> htJ) {
            return Hatch_browser_core_uniffiKt.uniffiRustCallAsync(UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_constructor_browsercore_create(FfiConverterTypeBrowserHostAuthority.INSTANCE.lower(browserHostAuthority).longValue(), FfiConverterTypeBrowserCoreOptions.INSTANCE.lower((Object) browserCoreOptions)), new G0W() { // from class: com.hatch.browser.core.BrowserCore$Companion$$ExternalSyntheticLambda0
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BrowserCore.Companion.create$lambda$0(C3cG.A05(obj), (UniffiRustFutureContinuationCallback) obj2, C3cG.A05(obj3));
                }
            }, new G0V() { // from class: com.hatch.browser.core.BrowserCore$Companion$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return Long.valueOf(BrowserCore.Companion.create$lambda$1(C3cG.A05(obj), (UniffiRustCallStatus) obj2));
                }
            }, new G0U() { // from class: com.hatch.browser.core.BrowserCore$Companion$$ExternalSyntheticLambda2
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_free_u64(C3cG.A05(obj));
                    return Unit.INSTANCE;
                }
            }, new G0U() { // from class: com.hatch.browser.core.BrowserCore$Companion$$ExternalSyntheticLambda3
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return new BrowserCore(UniffiWithHandle.INSTANCE, C3cG.A05(obj));
                }
            }, UniffiNullRustCallStatusErrorHandler.INSTANCE, htJ);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final class UniffiCleanAction implements Runnable {
        public final long handle;

        @Override // java.lang.Runnable
        public void run() {
            if (this.handle != 0) {
                UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
                UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
                UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_free_browsercore(this.handle, uniffiRustCallStatusA0x);
                Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
            }
        }

        public UniffiCleanAction(long j) {
            this.handle = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PageClosure beginClose(com.hatch.browser.protocol.PageCloseRequest r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L57
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L52
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.FfiConverterTypePageCloseRequest r0 = com.hatch.browser.protocol.FfiConverterTypePageCloseRequest.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L47
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_close(r1, r0, r4)     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L47
            long r4 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PageClosure r0 = new com.hatch.browser.core.PageClosure
            r0.<init>(r1, r2)
            return r0
        L47:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.beginClose(com.hatch.browser.protocol.PageCloseRequest):com.hatch.browser.core.PageClosure");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PendingCommand beginExecute(com.hatch.browser.protocol.CommandRequest r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L57
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L52
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.FfiConverterTypeCommandRequest r0 = com.hatch.browser.protocol.FfiConverterTypeCommandRequest.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L47
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_execute(r1, r0, r4)     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L47
            long r4 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PendingCommand r0 = new com.hatch.browser.core.PendingCommand
            r0.<init>(r1, r2)
            return r0
        L47:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.beginExecute(com.hatch.browser.protocol.CommandRequest):com.hatch.browser.core.PendingCommand");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] blockedPolicySite(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            com.hatch.browser.core.FfiConverterOptionalByteArray r6 = com.hatch.browser.core.FfiConverterOptionalByteArray.INSTANCE
        L6:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L58
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L53
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L6
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r10)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocked_policy_site(r1, r0, r4)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L48
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            java.lang.Object r0 = r6.lift(r3)
            byte[] r0 = (byte[]) r0
            return r0
        L48:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L53:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L58:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.blockedPolicySite(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        X.AbstractC7610F5x.A1C(r7, (X.AbstractC7607F5u.A0N(r7) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r7) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
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
            long r3 = X.AbstractC7607F5u.A0O(r7)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3a
            boolean r0 = X.AbstractC7610F5x.A1U(r7, r3)
            if (r0 == 0) goto L4
            long r0 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = X.G0U.A00(r8, r0)     // Catch: java.lang.Throwable -> L2f
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            return r3
        L2f:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            throw r3
        L3a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L3f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.callWithHandle$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(X.G0U):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.CancelAck cancel(com.hatch.browser.protocol.OperationId r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            com.hatch.browser.protocol.FfiConverterTypeCancelAck r6 = com.hatch.browser.protocol.FfiConverterTypeCancelAck.INSTANCE
        L6:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L58
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L53
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L6
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.protocol.FfiConverterTypeOperationId r0 = com.hatch.browser.protocol.FfiConverterTypeOperationId.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r10)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_cancel(r1, r0, r4)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L48
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            java.lang.Object r0 = r6.lift(r3)
            com.hatch.browser.protocol.CancelAck r0 = (com.hatch.browser.protocol.CancelAck) r0
            return r0
        L48:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L53:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L58:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.cancel(com.hatch.browser.protocol.OperationId):com.hatch.browser.protocol.CancelAck");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.TaskPageGroup createTaskPageGroup(com.hatch.browser.protocol.BrowserTaskBinding r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L57
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L52
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.FfiConverterTypeBrowserTaskBinding r0 = com.hatch.browser.protocol.FfiConverterTypeBrowserTaskBinding.INSTANCE     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.protocol.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L47
            long r2 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_create_task_page_group(r1, r0, r4)     // Catch: java.lang.Throwable -> L47
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L47
            long r4 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.TaskPageGroup r0 = new com.hatch.browser.core.TaskPageGroup
            r0.<init>(r1, r2)
            return r0
        L47:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.createTaskPageGroup(com.hatch.browser.protocol.BrowserTaskBinding):com.hatch.browser.core.TaskPageGroup");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableBlockedPolicy(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L3f
            r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_blocked_policy(r1, r0, r4)     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L3f
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            return
        L3f:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L4a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enableBlockedPolicy(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableEnhancedPolicy(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L3f
            r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_enhanced_policy(r1, r0, r4)     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L3f
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            return
        L3f:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L4a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enableEnhancedPolicy(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableHeaderPolicy(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L3f
            r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_header_policy(r1, r0, r4)     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L3f
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            return
        L3f:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L4a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enableHeaderPolicy(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableNavigationConsent(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L4
            long r1 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r9)     // Catch: java.lang.Throwable -> L3f
            r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enable_navigation_consent(r1, r0, r4)     // Catch: java.lang.Throwable -> L3f
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L3f
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            return
        L3f:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L4a:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4f:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enableNavigationConsent(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean enhancedSiteAllowed(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            com.hatch.browser.core.FfiConverterOptionalBoolean r6 = com.hatch.browser.core.FfiConverterOptionalBoolean.INSTANCE
        L6:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L58
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L53
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L6
            long r1 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.UniffiLib r3 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r0 = r0.lower(r10)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.RustBuffer$ByValue r3 = r3.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enhanced_site_allowed(r1, r0, r4)     // Catch: java.lang.Throwable -> L48
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L48
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            java.lang.Object r0 = r6.lift(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        L48:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L53:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L58:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enhancedSiteAllowed(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String prescreenUrl(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            com.hatch.browser.core.FfiConverterString r6 = com.hatch.browser.core.FfiConverterString.INSTANCE
        L6:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L54
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4f
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L6
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r5 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_prescreen_url(r2, r0, r4)     // Catch: java.lang.Throwable -> L44
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L44
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            java.lang.String r0 = r6.lift(r3)
            return r0
        L44:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4f:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L54:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.prescreenUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        X.AbstractC7610F5x.A1C(r13, (X.AbstractC7607F5u.A0N(r13) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r13) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void useBlocklistFilter(com.hatch.browser.core.BrowserBlocklistFilter r14) {
        /*
            r13 = this;
            r0 = 0
            X.C7384Etj.A0Y(r14, r0)
        L4:
            long r3 = X.AbstractC7607F5u.A0O(r13)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L4d
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            boolean r0 = X.AbstractC7610F5x.A1U(r13, r3)
            if (r0 == 0) goto L4
            long r8 = r13.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r0 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiRustCallStatus r12 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiLib r7 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3d
            long r10 = r14.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3d
            r7.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_use_blocklist_filter(r8, r10, r12)     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r0, r12)     // Catch: java.lang.Throwable -> L3d
            long r1 = X.AbstractC7607F5u.A0N(r13)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r13, r0)
            return
        L3d:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r13)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r13, r0)
            throw r3
        L48:
            java.lang.IllegalStateException r0 = X.FGI.A03(r13)
            throw r0
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A02(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.useBlocklistFilter(com.hatch.browser.core.BrowserBlocklistFilter):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] blockedPolicyInventory() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocked_policy_inventory(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.blockedPolicyInventory():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] blocklistInfo() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_blocklist_info(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.blocklistInfo():byte[]");
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        if (C3cI.A1W(this.wasDestroyed)) {
            AbstractC7610F5x.A1C(this, (AbstractC7607F5u.A0N(this) > 0L ? 1 : (AbstractC7607F5u.A0N(this) == 0L ? 0 : -1)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] enhancedPolicyInventory() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_enhanced_policy_inventory(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.enhancedPolicyInventory():byte[]");
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] headerPolicyInventory() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_header_policy_inventory(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.headerPolicyInventory():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] headerPolicyRules() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_header_policy_rules(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.headerPolicyRules():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.protocol.SdkIdentity identity() {
        /*
            r8 = this;
            com.hatch.browser.protocol.FfiConverterTypeSdkIdentity r5 = com.hatch.browser.protocol.FfiConverterTypeSdkIdentity.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4e
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3e
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r2 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3e
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3e
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3e
            com.hatch.browser.protocol.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_identity(r3, r1)     // Catch: java.lang.Throwable -> L3e
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3e
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            java.lang.Object r0 = r5.lift(r3)
            com.hatch.browser.protocol.SdkIdentity r0 = (com.hatch.browser.protocol.SdkIdentity) r0
            return r0
        L3e:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L49:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.identity():com.hatch.browser.protocol.SdkIdentity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] navigationInventory() {
        /*
            r8 = this;
            com.hatch.browser.core.FfiConverterByteArray r5 = com.hatch.browser.core.FfiConverterByteArray.INSTANCE
        L2:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L2
            long r3 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_navigation_inventory(r3, r1)     // Catch: java.lang.Throwable -> L3c
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L3c
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r5, r3)
            return r0
        L3c:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L47:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.navigationInventory():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        X.AbstractC7610F5x.A1C(r15, (X.AbstractC7607F5u.A0N(r15) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r15) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] requestHeaders(java.lang.String r16, boolean r17) {
        /*
            r15 = this;
            r3 = r16
            com.hatch.browser.core.FfiConverterByteArray r4 = X.AbstractC7608F5v.A0U(r3)
        L6:
            long r5 = X.AbstractC7607F5u.A0O(r15)
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L5e
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L59
            boolean r0 = X.AbstractC7610F5x.A1U(r15, r5)
            if (r0 == 0) goto L6
            long r10 = r15.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r1 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiRustCallStatus r14 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.UniffiLib r9 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.RustBuffer$ByValue r12 = r0.lower(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Byte r0 = java.lang.Byte.valueOf(r17)     // Catch: java.lang.Throwable -> L4e
            byte r13 = r0.byteValue()     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.RustBuffer$ByValue r3 = r9.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_request_headers(r10, r12, r13, r14)     // Catch: java.lang.Throwable -> L4e
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r1, r14)     // Catch: java.lang.Throwable -> L4e
            long r1 = X.AbstractC7607F5u.A0N(r15)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r15, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r4, r3)
            return r0
        L4e:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r15)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r15, r0)
            throw r3
        L59:
            java.lang.IllegalStateException r0 = X.FGI.A03(r15)
            throw r0
        L5e:
            java.lang.IllegalStateException r0 = X.FGI.A02(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.requestHeaders(java.lang.String, boolean):byte[]");
    }

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw AbstractC7608F5v.A0V();
        }
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatusA0x = AbstractC7607F5u.A0x();
        long jUniffi_hatch_browser_core_uniffi_fn_clone_browsercore = UniffiLib.INSTANCE.uniffi_hatch_browser_core_uniffi_fn_clone_browsercore(this.handle, uniffiRustCallStatusA0x);
        Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatusA0x);
        return jUniffi_hatch_browser_core_uniffi_fn_clone_browsercore;
    }

    public BrowserCore(NoHandle noHandle) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = 0L;
        this.cleanable = null;
    }

    public static final Unit screenNavigation$lambda$1(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        AbstractC7609F5w.A14(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        X.AbstractC7610F5x.A1C(r7, (X.AbstractC7607F5u.A0N(r7) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r7) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object screenNavigation$suspendImpl(com.hatch.browser.core.BrowserCore r7, java.lang.String r8, boolean r9, X.HtJ<? super byte[]> r10) {
        /*
        L0:
            long r3 = X.AbstractC7607F5u.A0O(r7)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L65
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L60
            boolean r0 = X.AbstractC7610F5x.A1U(r7, r3)
            if (r0 == 0) goto L0
            long r1 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.UniffiLib r4 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.FfiConverterString r0 = com.hatch.browser.core.FfiConverterString.INSTANCE     // Catch: java.lang.Throwable -> L55
            com.hatch.browser.core.RustBuffer$ByValue r3 = r0.lower(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)     // Catch: java.lang.Throwable -> L55
            byte r0 = r0.byteValue()     // Catch: java.lang.Throwable -> L55
            long r3 = r4.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_screen_navigation(r1, r3, r0)     // Catch: java.lang.Throwable -> L55
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda0 r5 = new com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda0
            r5.<init>()
            com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda1 r6 = new com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda1
            r6.<init>()
            com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda2 r7 = new com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda2
            r7.<init>()
            com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda3 r8 = new com.hatch.browser.core.BrowserCore$$ExternalSyntheticLambda3
            r8.<init>()
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r9 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE
            java.lang.Object r0 = com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiRustCallAsync(r3, r5, r6, r7, r8, r9, r10)
            return r0
        L55:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            throw r3
        L60:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L65:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.screenNavigation$suspendImpl(com.hatch.browser.core.BrowserCore, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        X.AbstractC7610F5x.A1C(r8, (X.AbstractC7607F5u.A0N(r8) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r8) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.hatch.browser.core.PendingShutdown beginShutdown() {
        /*
            r8 = this;
        L0:
            long r3 = X.AbstractC7607F5u.A0O(r8)
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L4d
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            boolean r0 = X.AbstractC7610F5x.A1U(r8, r3)
            if (r0 == 0) goto L0
            long r2 = r8.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler r4 = com.hatch.browser.core.UniffiNullRustCallStatusErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L3d
            long r2 = r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_begin_shutdown(r2, r1)     // Catch: java.lang.Throwable -> L3d
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r4, r1)     // Catch: java.lang.Throwable -> L3d
            long r4 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            com.hatch.browser.core.UniffiWithHandle r1 = com.hatch.browser.core.UniffiWithHandle.INSTANCE
            com.hatch.browser.core.PendingShutdown r0 = new com.hatch.browser.core.PendingShutdown
            r0.<init>(r1, r2)
            return r0
        L3d:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r8)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r8, r0)
            throw r3
        L48:
            java.lang.IllegalStateException r0 = X.FGI.A03(r8)
            throw r0
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.beginShutdown():com.hatch.browser.core.PendingShutdown");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        X.AbstractC7610F5x.A1C(r7, (X.AbstractC7607F5u.A0N(r7) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r7) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void clearBlocklistFilter() {
        /*
            r7 = this;
        L0:
            long r3 = X.AbstractC7607F5u.A0O(r7)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            boolean r0 = X.AbstractC7610F5x.A1U(r7, r3)
            if (r0 == 0) goto L0
            long r3 = r7.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L35
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r2 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L35
            com.hatch.browser.core.UniffiRustCallStatus r1 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L35
            com.hatch.browser.core.UniffiLib r0 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L35
            r0.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_clear_blocklist_filter(r3, r1)     // Catch: java.lang.Throwable -> L35
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r2, r1)     // Catch: java.lang.Throwable -> L35
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            return
        L35:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r7)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r7, r0)
            throw r3
        L40:
            java.lang.IllegalStateException r0 = X.FGI.A03(r7)
            throw r0
        L45:
            java.lang.IllegalStateException r0 = X.FGI.A02(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.clearBlocklistFilter():void");
    }

    @Override // com.hatch.browser.core.BrowserCoreInterface
    public Object screenNavigation(String str, boolean z, HtJ<? super byte[]> htJ) {
        return screenNavigation$suspendImpl(this, str, z, htJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] setBlockedPolicy(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_blocked_policy(r2, r0, r4)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.setBlockedPolicy(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] setBlocklistFilter(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_blocklist_filter(r2, r0, r4)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.setBlocklistFilter(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] setEnhancedPolicy(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_enhanced_policy(r2, r0, r4)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.setEnhancedPolicy(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] setHeaderPolicy(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_header_policy(r2, r0, r4)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.setHeaderPolicy(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        X.AbstractC7610F5x.A1C(r9, (X.AbstractC7607F5u.A0N(r9) > 0 ? 1 : (X.AbstractC7607F5u.A0N(r9) == 0 ? 0 : -1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw r3;
     */
    @Override // com.hatch.browser.core.BrowserCoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] setNavigationPolicy(byte[] r10) {
        /*
            r9 = this;
            com.hatch.browser.core.FfiConverterByteArray r6 = X.AbstractC7608F5v.A0U(r10)
        L4:
            long r1 = X.AbstractC7607F5u.A0O(r9)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L52
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            boolean r0 = X.AbstractC7610F5x.A1U(r9, r1)
            if (r0 == 0) goto L4
            long r2 = r9.uniffiCloneHandle()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.ApiExceptionExternalErrorHandler r5 = com.hatch.browser.core.ApiExceptionExternalErrorHandler.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiRustCallStatus r4 = X.AbstractC7607F5u.A0x()     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.UniffiLib r1 = com.hatch.browser.core.UniffiLib.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r0 = r6.lower(r10)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.RustBuffer$ByValue r3 = r1.uniffi_hatch_browser_core_uniffi_fn_method_browsercore_set_navigation_policy(r2, r0, r4)     // Catch: java.lang.Throwable -> L42
            com.hatch.browser.core.Hatch_browser_core_uniffiKt.uniffiCheckCallStatus(r5, r4)     // Catch: java.lang.Throwable -> L42
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            byte[] r0 = X.AbstractC7607F5u.A1Y(r6, r3)
            return r0
        L42:
            r3 = move-exception
            long r1 = X.AbstractC7607F5u.A0N(r9)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            X.AbstractC7610F5x.A1C(r9, r0)
            throw r3
        L4d:
            java.lang.IllegalStateException r0 = X.FGI.A03(r9)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.FGI.A02(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserCore.setNavigationPolicy(byte[]):byte[]");
    }

    public BrowserCore(UniffiWithHandle uniffiWithHandle, long j) {
        this.wasDestroyed = C60O.A1E();
        this.callCounter = AbstractC7609F5w.A11();
        this.handle = j;
        this.cleanable = AbstractC7609F5w.A0e().register(this, new UniffiCleanAction(j));
    }
}
