package com.facebook.aura.nodes.transport;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C9286GCn;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchNodeOperationLease {
    public static final BLG<Boolean> _hasHostLease;
    public static final BLG<Boolean> _hasOperationLease;
    public static final BLG<Boolean> _isHeld;
    public static int count;
    public static final C1BN<Boolean> hasHostLease;
    public static final C1BN<Boolean> hasOperationLease;
    public static int hostCount;
    public static final C1BN<Boolean> isHeldFlow;
    public static final HatchNodeOperationLease INSTANCE = new HatchNodeOperationLease();
    public static final C3UX scope = C3cH.A0x(C3cG.A0v());

    @DebugMetadata(c = "com.facebook.aura.nodes.transport.HatchNodeOperationLease", f = "HatchNodeOperationLease.kt", l = {80}, m = "withHostLease", v = 2)
    /* renamed from: com.facebook.aura.nodes.transport.HatchNodeOperationLease$withHostLease$1, reason: invalid class name */
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
            return HatchNodeOperationLease.this.withHostLease(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.transport.HatchNodeOperationLease", f = "HatchNodeOperationLease.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "withLease", v = 2)
    /* renamed from: com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$1, reason: invalid class name and case insensitive filesystem */
    public final class C127751<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C127751(HtJ<? super C127751> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeOperationLease.this.withLease(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean releaseOnce(AtomicBoolean atomicBoolean, String str) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            return false;
        }
        release(str, false);
        return true;
    }

    static {
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCnA14 = C3cG.A14(boolA0h);
        _hasHostLease = c9286GCnA14;
        hasHostLease = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(boolA0h);
        _isHeld = c9286GCnA142;
        isHeldFlow = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(boolA0h);
        _hasOperationLease = c9286GCnA143;
        hasOperationLease = C3cG.A11(c9286GCnA143);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void acquire(String str, boolean z) {
        count++;
        if (z) {
            hostCount++;
        }
        C3cJ.A0C(_hasHostLease, AnonymousClass002.A1N(hostCount));
        AnonymousClass003.A14(_hasOperationLease, count > hostCount);
        CFK.A05(HatchNodeOperationLeaseKt.TAG, FGI.A0V("lease acquired reason=", reasonForLog(str), " count=", count));
        AnonymousClass003.A14(_isHeld, true);
    }

    private final String reasonForLog(String str) {
        return AnonymousClass005.A1a(str, "geofence:") ? HatchNodeCardJsonKt.TYPE_GEOFENCE : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void release(String str, boolean z) {
        int i;
        int i2 = count;
        if (i2 > 0) {
            count = i2 - 1;
        }
        if (z && (i = hostCount) > 0) {
            hostCount = i - 1;
        }
        C3cJ.A0C(_hasHostLease, AnonymousClass002.A1N(hostCount));
        AnonymousClass003.A14(_hasOperationLease, count > hostCount);
        CFK.A05(HatchNodeOperationLeaseKt.TAG, FGI.A0V("lease released reason=", reasonForLog(str), " count=", count));
        AnonymousClass003.A14(_isHeld, count > 0);
    }

    public final C1BN<Boolean> getHasHostLease() {
        return hasHostLease;
    }

    public final C1BN<Boolean> getHasOperationLease() {
        return hasOperationLease;
    }

    public final boolean isHeld() {
        return AnonymousClass003.A1Z(_isHeld);
    }

    public final C1BN<Boolean> isHeldFlow() {
        return isHeldFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object withHostLease(java.lang.String r6, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r7, X.HtJ<? super T> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.nodes.transport.HatchNodeOperationLease.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r8
            com.facebook.aura.nodes.transport.HatchNodeOperationLease$withHostLease$1 r4 = (com.facebook.aura.nodes.transport.HatchNodeOperationLease.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L2c
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            goto L28
        L22:
            com.facebook.aura.nodes.transport.HatchNodeOperationLease$withHostLease$1 r4 = new com.facebook.aura.nodes.transport.HatchNodeOperationLease$withHostLease$1
            r4.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L49
            goto L45
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r3)
            r5.acquire(r6, r1)
            r4.L$0 = r6     // Catch: java.lang.Throwable -> L49
            r0 = 0
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L49
            r4.label = r1     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L49
            if (r3 != r2) goto L45
            return r2
        L45:
            r5.release(r6, r1)
            return r3
        L49:
            r0 = move-exception
            r5.release(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.transport.HatchNodeOperationLease.withHostLease(java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object withLease(java.lang.String r8, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r9, X.HtJ<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.nodes.transport.HatchNodeOperationLease.C127751
            if (r0 == 0) goto L2b
            r6 = r10
            com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$1 r6 = (com.facebook.aura.nodes.transport.HatchNodeOperationLease.C127751) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 != r4) goto L37
            java.lang.Object r1 = r6.L$3
            X.HoC r1 = (X.HoC) r1
            java.lang.Object r2 = r6.L$2
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            goto L31
        L2b:
            com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$1 r6 = new com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$1
            r6.<init>(r10)
            goto L12
        L31:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L35
            goto L64
        L35:
            r0 = move-exception
            goto L6c
        L37:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3c:
            X.Hwg.A00(r0)
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r0)
            r7.acquire(r8, r0)
            X.3UX r1 = com.facebook.aura.nodes.transport.HatchNodeOperationLease.scope
            com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$watchdog$1 r0 = new com.facebook.aura.nodes.transport.HatchNodeOperationLease$withLease$watchdog$1
            r0.<init>(r2, r8, r3)
            X.Hqc r1 = X.AnonymousClass001.A11(r0, r1)
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L6b
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L6b
            r6.L$2 = r2     // Catch: java.lang.Throwable -> L6b
            r6.L$3 = r1     // Catch: java.lang.Throwable -> L6b
            r6.label = r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r9.invoke(r6)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r5) goto L64
            return r5
        L64:
            r1.A5w(r3)
            r7.releaseOnce(r2, r8)
            return r0
        L6b:
            r0 = move-exception
        L6c:
            r1.A5w(r3)
            r7.releaseOnce(r2, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.transport.HatchNodeOperationLease.withLease(java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }
}
