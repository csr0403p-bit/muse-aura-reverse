package com.hatch.browser.core;

import X.HtJ;
import X.HzP;
import com.hatch.browser.protocol.CommandRequest;
import com.hatch.browser.protocol.PageCloseInvocation;
import com.hatch.browser.protocol.PageCloseRequest;
import com.hatch.browser.protocol.PageCommandInvocation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public abstract class BrowserOperationsKt {

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {31}, m = "close", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$close$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.close((Page) null, (PageCloseInvocation) null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "close", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$close$2, reason: invalid class name */
    public final class AnonymousClass2 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.close((BrowserCore) null, (PageCloseRequest) null, this);
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {20}, m = "connect", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$connect$1, reason: invalid class name and case insensitive filesystem */
    public final class C144371 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.connect(null, null, this);
        }

        public C144371(HtJ<? super C144371> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {9}, m = "execute", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C144381 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.execute((BrowserCore) null, (CommandRequest) null, this);
        }

        public C144381(HtJ<? super C144381> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {15}, m = "execute", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$execute$2, reason: invalid class name and case insensitive filesystem */
    public final class C144392 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.execute((Page) null, (PageCommandInvocation) null, this);
        }

        public C144392(HtJ<? super C144392> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {25}, m = "reconnect", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$reconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C144401 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.reconnect(null, null, null, this);
        }

        public C144401(HtJ<? super C144401> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.hatch.browser.core.BrowserOperationsKt", f = "BrowserOperations.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "shutdown", v = 2)
    /* renamed from: com.hatch.browser.core.BrowserOperationsKt$shutdown$1, reason: invalid class name and case insensitive filesystem */
    public final class C144411 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserOperationsKt.shutdown(null, this);
        }

        public C144411(HtJ<? super C144411> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PageClosure] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PageClosure] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object close(com.hatch.browser.core.BrowserCore r5, com.hatch.browser.protocol.PageCloseRequest r6, X.HtJ<? super com.hatch.browser.protocol.PageCloseReceipt> r7) {
        /*
            boolean r0 = r7 instanceof com.hatch.browser.core.BrowserOperationsKt.AnonymousClass2
            if (r0 == 0) goto L22
            r4 = r7
            com.hatch.browser.core.BrowserOperationsKt$close$2 r4 = (com.hatch.browser.core.BrowserOperationsKt.AnonymousClass2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$2
            com.hatch.browser.core.PageClosure r1 = (com.hatch.browser.core.PageClosure) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$close$2 r4 = new com.hatch.browser.core.BrowserOperationsKt$close$2
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PageClosure r1 = r5.beginClose(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L4c
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.inspect(r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L48
            return r3
        L48:
            r1.destroy()
            return r0
        L4c:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.close(com.hatch.browser.core.BrowserCore, com.hatch.browser.protocol.PageCloseRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PendingPageConnection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PendingPageConnection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object connect(com.hatch.browser.core.Page r5, com.hatch.browser.protocol.Budget r6, X.HtJ<? super com.hatch.browser.protocol.PageReference> r7) {
        /*
            boolean r0 = r7 instanceof com.hatch.browser.core.BrowserOperationsKt.C144371
            if (r0 == 0) goto L22
            r4 = r7
            com.hatch.browser.core.BrowserOperationsKt$connect$1 r4 = (com.hatch.browser.core.BrowserOperationsKt.C144371) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$2
            com.hatch.browser.core.PendingPageConnection r1 = (com.hatch.browser.core.PendingPageConnection) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$connect$1 r4 = new com.hatch.browser.core.BrowserOperationsKt$connect$1
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PendingPageConnection r1 = r5.beginConnect(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L4c
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.awaitReference(r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L48
            return r3
        L48:
            r1.destroy()
            return r0
        L4c:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.connect(com.hatch.browser.core.Page, com.hatch.browser.protocol.Budget, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PendingCommand] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PendingCommand] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object execute(com.hatch.browser.core.BrowserCore r5, com.hatch.browser.protocol.CommandRequest r6, X.HtJ<? super com.hatch.browser.core.CommandReport> r7) {
        /*
            boolean r0 = r7 instanceof com.hatch.browser.core.BrowserOperationsKt.C144381
            if (r0 == 0) goto L22
            r4 = r7
            com.hatch.browser.core.BrowserOperationsKt$execute$1 r4 = (com.hatch.browser.core.BrowserOperationsKt.C144381) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$2
            com.hatch.browser.core.PendingCommand r1 = (com.hatch.browser.core.PendingCommand) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$execute$1 r4 = new com.hatch.browser.core.BrowserOperationsKt$execute$1
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PendingCommand r1 = r5.beginExecute(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L4c
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.awaitReport(r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L48
            return r3
        L48:
            r1.destroy()
            return r0
        L4c:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.execute(com.hatch.browser.core.BrowserCore, com.hatch.browser.protocol.CommandRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PendingPageConnection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PendingPageConnection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reconnect(com.hatch.browser.core.Page r5, com.hatch.browser.core.PageAccess r6, com.hatch.browser.protocol.Budget r7, X.HtJ<? super com.hatch.browser.protocol.PageReference> r8) {
        /*
            boolean r0 = r8 instanceof com.hatch.browser.core.BrowserOperationsKt.C144401
            if (r0 == 0) goto L22
            r4 = r8
            com.hatch.browser.core.BrowserOperationsKt$reconnect$1 r4 = (com.hatch.browser.core.BrowserOperationsKt.C144401) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$3
            com.hatch.browser.core.PendingPageConnection r1 = (com.hatch.browser.core.PendingPageConnection) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$reconnect$1 r4 = new com.hatch.browser.core.BrowserOperationsKt$reconnect$1
            r4.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4e
            goto L4a
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PendingPageConnection r1 = r5.beginReconnect(r6, r7)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4e
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4e
            r4.L$2 = r0     // Catch: java.lang.Throwable -> L4e
            r4.L$3 = r1     // Catch: java.lang.Throwable -> L4e
            r4.label = r2     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r1.awaitReference(r4)     // Catch: java.lang.Throwable -> L4e
            if (r0 != r3) goto L4a
            return r3
        L4a:
            r1.destroy()
            return r0
        L4e:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.reconnect(com.hatch.browser.core.Page, com.hatch.browser.core.PageAccess, com.hatch.browser.protocol.Budget, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PendingShutdown] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PendingShutdown] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object shutdown(com.hatch.browser.core.BrowserCore r5, X.HtJ<? super com.hatch.browser.protocol.ShutdownReceipt> r6) {
        /*
            boolean r0 = r6 instanceof com.hatch.browser.core.BrowserOperationsKt.C144411
            if (r0 == 0) goto L22
            r4 = r6
            com.hatch.browser.core.BrowserOperationsKt$shutdown$1 r4 = (com.hatch.browser.core.BrowserOperationsKt.C144411) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$1
            com.hatch.browser.core.PendingShutdown r1 = (com.hatch.browser.core.PendingShutdown) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$shutdown$1 r4 = new com.hatch.browser.core.BrowserOperationsKt$shutdown$1
            r4.<init>(r6)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4a
            goto L46
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PendingShutdown r1 = r5.beginShutdown()
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4a
            r4.L$1 = r1     // Catch: java.lang.Throwable -> L4a
            r4.label = r2     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r1.awaitSettlement(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 != r3) goto L46
            return r3
        L46:
            r1.destroy()
            return r0
        L4a:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.shutdown(com.hatch.browser.core.BrowserCore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PageClosure] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PageClosure] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object close(com.hatch.browser.core.Page r5, com.hatch.browser.protocol.PageCloseInvocation r6, X.HtJ<? super com.hatch.browser.protocol.PageCloseReceipt> r7) {
        /*
            boolean r0 = r7 instanceof com.hatch.browser.core.BrowserOperationsKt.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r7
            com.hatch.browser.core.BrowserOperationsKt$close$1 r4 = (com.hatch.browser.core.BrowserOperationsKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$2
            com.hatch.browser.core.PageClosure r1 = (com.hatch.browser.core.PageClosure) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$close$1 r4 = new com.hatch.browser.core.BrowserOperationsKt$close$1
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PageClosure r1 = r5.beginClose(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L4c
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.inspect(r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L48
            return r3
        L48:
            r1.destroy()
            return r0
        L4c:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.close(com.hatch.browser.core.Page, com.hatch.browser.protocol.PageCloseInvocation, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.hatch.browser.core.PendingCommand] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.hatch.browser.core.PendingCommand] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object execute(com.hatch.browser.core.Page r5, com.hatch.browser.protocol.PageCommandInvocation r6, X.HtJ<? super com.hatch.browser.core.CommandReport> r7) {
        /*
            boolean r0 = r7 instanceof com.hatch.browser.core.BrowserOperationsKt.C144392
            if (r0 == 0) goto L22
            r4 = r7
            com.hatch.browser.core.BrowserOperationsKt$execute$2 r4 = (com.hatch.browser.core.BrowserOperationsKt.C144392) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2c
            java.lang.Object r1 = r4.L$2
            com.hatch.browser.core.PendingCommand r1 = (com.hatch.browser.core.PendingCommand) r1
            goto L28
        L22:
            com.hatch.browser.core.BrowserOperationsKt$execute$2 r4 = new com.hatch.browser.core.BrowserOperationsKt$execute$2
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.hatch.browser.core.PendingCommand r1 = r5.beginExecute(r6)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L4c
            r4.L$2 = r1     // Catch: java.lang.Throwable -> L4c
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.awaitReport(r4)     // Catch: java.lang.Throwable -> L4c
            if (r0 != r3) goto L48
            return r3
        L48:
            r1.destroy()
            return r0
        L4c:
            r0 = move-exception
            r1.destroy()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hatch.browser.core.BrowserOperationsKt.execute(com.hatch.browser.core.Page, com.hatch.browser.protocol.PageCommandInvocation, X.HtJ):java.lang.Object");
    }
}
