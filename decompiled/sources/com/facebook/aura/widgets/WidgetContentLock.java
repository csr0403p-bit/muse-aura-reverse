package com.facebook.aura.widgets;

import X.C9258GBl;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WidgetContentLock {
    public static final int $stable = 0;
    public static final WidgetContentLock INSTANCE = new WidgetContentLock();
    public static final InterfaceC2261BLa mutex = new C9258GBl();

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetContentLock", f = "WidgetContentLock.kt", l = {28, 21}, m = "exclusive", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetContentLock$exclusive$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetContentLock.this.exclusive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetContentLock", f = "WidgetContentLock.kt", l = {28, 18}, m = "writeIfEnabled", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetContentLock$writeIfEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C144261<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C144261(HtJ<? super C144261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetContentLock.this.writeIfEnabled(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object exclusive(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r8, X.HtJ<? super T> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.WidgetContentLock.AnonymousClass1
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.widgets.WidgetContentLock$exclusive$1 r6 = (com.facebook.aura.widgets.WidgetContentLock.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L41
            if (r1 == r3) goto L35
            if (r1 != r4) goto L30
            java.lang.Object r1 = r6.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L2c
        L26:
            com.facebook.aura.widgets.WidgetContentLock$exclusive$1 r6 = new com.facebook.aura.widgets.WidgetContentLock$exclusive$1
            r6.<init>(r9)
            goto L12
        L2c:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L66
            goto L60
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            java.lang.Object r1 = r6.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r8 = r6.L$0
            X.G0U r8 = (X.G0U) r8
            X.Hwg.A00(r0)
            goto L53
        L41:
            X.Hwg.A00(r0)
            X.BLa r1 = com.facebook.aura.widgets.WidgetContentLock.mutex
            r6.L$0 = r8
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r0 = r1.APs(r2, r6)
            if (r0 != r5) goto L53
            return r5
        L53:
            r6.L$0 = r2     // Catch: java.lang.Throwable -> L64
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L64
            r6.label = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r8.invoke(r6)     // Catch: java.lang.Throwable -> L64
            if (r0 != r5) goto L60
            return r5
        L60:
            r1.Ahe(r2)
            return r0
        L64:
            r0 = move-exception
            goto L67
        L66:
            r0 = move-exception
        L67:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetContentLock.exclusive(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object writeIfEnabled(android.content.Context r7, java.lang.Class<?> r8, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r9, X.HtJ<? super T> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.widgets.WidgetContentLock.C144261
            if (r0 == 0) goto L26
            r5 = r10
            com.facebook.aura.widgets.WidgetContentLock$writeIfEnabled$1 r5 = (com.facebook.aura.widgets.WidgetContentLock.C144261) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L48
            if (r2 == r1) goto L35
            if (r2 != r4) goto L30
            java.lang.Object r2 = r5.L$3
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            goto L2c
        L26:
            com.facebook.aura.widgets.WidgetContentLock$writeIfEnabled$1 r5 = new com.facebook.aura.widgets.WidgetContentLock$writeIfEnabled$1
            r5.<init>(r10)
            goto L12
        L2c:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7e
            goto L78
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            java.lang.Object r2 = r5.L$3
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            java.lang.Object r9 = r5.L$2
            X.G0U r9 = (X.G0U) r9
            java.lang.Object r8 = r5.L$1
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.Object r1 = r5.L$0
            android.content.Context r7 = X.C60P.A02(r1, r0)
            goto L5e
        L48:
            X.Hwg.A00(r0)
            X.BLa r2 = com.facebook.aura.widgets.WidgetContentLock.mutex
            r5.L$0 = r7
            r5.L$1 = r8
            r5.L$2 = r9
            r5.L$3 = r2
            r5.label = r1
            java.lang.Object r0 = r2.APs(r3, r5)
            if (r0 != r6) goto L5e
            return r6
        L5e:
            com.facebook.aura.widgets.WidgetsGate r0 = com.facebook.aura.widgets.WidgetsGate.INSTANCE     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.isComponentEnabled(r7, r8)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L77
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L7c
            r5.L$1 = r3     // Catch: java.lang.Throwable -> L7c
            r5.L$2 = r3     // Catch: java.lang.Throwable -> L7c
            r5.L$3 = r2     // Catch: java.lang.Throwable -> L7c
            r5.label = r4     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r9.invoke(r5)     // Catch: java.lang.Throwable -> L7c
            if (r0 != r6) goto L78
            return r6
        L77:
            r0 = r3
        L78:
            r2.Ahe(r3)
            return r0
        L7c:
            r0 = move-exception
            goto L7f
        L7e:
            r0 = move-exception
        L7f:
            r2.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetContentLock.writeIfEnabled(android.content.Context, java.lang.Class, X.G0U, X.HtJ):java.lang.Object");
    }
}
