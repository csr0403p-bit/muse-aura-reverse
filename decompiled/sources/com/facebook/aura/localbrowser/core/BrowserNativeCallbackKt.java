package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public abstract class BrowserNativeCallbackKt {

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt", f = "BrowserNativeCallback.kt", l = {20}, m = "nativeCallback", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserNativeCallbackKt.nativeCallback(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$2", f = "BrowserNativeCallback.kt", l = {20}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ G0U<HtJ<? super T>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$block = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$block, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass2(this.$block, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super T>, Object> g0u = this.$block;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object nativeCallback(com.hatch.browser.protocol.Budget r11, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r12, X.HtJ<? super T> r13) throws com.hatch.browser.core.NativeException {
        /*
            boolean r0 = r13 instanceof com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt.AnonymousClass1
            if (r0 == 0) goto L1e
            r7 = r13
            com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$1 r7 = (com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L28
            goto L24
        L1e:
            com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$1 r7 = new com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$1
            r7.<init>(r13)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            return r1
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            int r0 = r11.remainingMs     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            long r3 = X.BV4.A03(r0)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            X.GDq r0 = r11.expiresAtUnixMs     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r10 = 0
            if (r0 == 0) goto L4a
            long r1 = r0.A00     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            long r1 = r1 - r8
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L4f
            r1 = 0
            goto L4f
        L4a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4f:
            long r2 = java.lang.Math.min(r3, r1)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r1 = 0
            com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$2 r0 = new com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt$nativeCallback$2     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r0.<init>(r12, r1)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r7.J$0 = r2     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r7.label = r5     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            java.lang.Object r0 = X.GAX.A00(r7, r0, r2)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            if (r0 != r6) goto L6c
            return r6
        L6c:
            return r0
        L6d:
            com.hatch.browser.core.NativeException$Timeout r0 = new com.hatch.browser.core.NativeException$Timeout     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
            throw r0     // Catch: java.lang.Throwable -> L73 java.util.concurrent.CancellationException -> L91 com.hatch.browser.core.NativeException -> L97
        L73:
            r1 = move-exception
            java.lang.String r0 = X.C60Q.A0e(r1)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.StackTraceElement[] r0 = r1.getStackTrace()
            r2.setStackTrace(r0)
            java.lang.String r1 = "BrowserNativeCallback"
            java.lang.String r0 = "Unexpected host callback failure"
            X.CFK.A08(r1, r0, r2)
            com.hatch.browser.core.NativeException$Unavailable r0 = new com.hatch.browser.core.NativeException$Unavailable
            r0.<init>()
            throw r0
        L91:
            com.hatch.browser.core.NativeException$Timeout r0 = new com.hatch.browser.core.NativeException$Timeout
            r0.<init>()
            throw r0
        L97:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserNativeCallbackKt.nativeCallback(com.hatch.browser.protocol.Budget, X.G0U, X.HtJ):java.lang.Object");
    }
}
