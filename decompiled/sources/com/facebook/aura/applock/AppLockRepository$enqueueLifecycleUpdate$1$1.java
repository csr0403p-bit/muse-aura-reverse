package com.facebook.aura.applock;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HoC;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.applock.AppLockRepository$enqueueLifecycleUpdate$1$1", f = "AppLockRepository.kt", l = {154, 155}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AppLockRepository$enqueueLifecycleUpdate$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $previousJob;
    public final /* synthetic */ Function0<Unit> $update;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AppLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockRepository$enqueueLifecycleUpdate$1$1(HoC hoC, AppLockRepository appLockRepository, Function0<Unit> function0, HtJ<? super AppLockRepository$enqueueLifecycleUpdate$1$1> htJ) {
        super(2, htJ);
        this.$previousJob = hoC;
        this.this$0 = appLockRepository;
        this.$update = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AppLockRepository$enqueueLifecycleUpdate$1$1 appLockRepository$enqueueLifecycleUpdate$1$1 = new AppLockRepository$enqueueLifecycleUpdate$1$1(this.$previousJob, this.this$0, this.$update, htJ);
        appLockRepository$enqueueLifecycleUpdate$1$1.L$0 = obj;
        return appLockRepository$enqueueLifecycleUpdate$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.L$0
            X.3UX r4 = (X.C3UX) r4
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 == r1) goto L31
            if (r0 != r2) goto L52
            X.Hwg.A00(r6)
        L13:
            boolean r0 = X.Hxb.A04(r4)
            if (r0 == 0) goto L4f
            com.facebook.aura.applock.AppLockRepository r0 = r5.this$0
            java.lang.Object r2 = r0.lifecycleUpdateLock
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r5.$update
            monitor-enter(r2)
            goto L41
        L21:
            X.Hwg.A00(r6)
            X.HoC r0 = r5.$previousJob
            r5.L$0 = r4
            r5.label = r1
            java.lang.Object r0 = r0.APQ(r5)
            if (r0 != r3) goto L34
            return r3
        L31:
            X.Hwg.A00(r6)
        L34:
            com.facebook.aura.applock.AppLockRepository r0 = r5.this$0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r0 = r0.awaitLoaded(r5)
            if (r0 != r3) goto L13
            return r3
        L41:
            boolean r0 = X.Hxb.A04(r4)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4e
            r1.invoke()     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L4b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L4e:
            monitor-exit(r2)
        L4f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.AppLockRepository$enqueueLifecycleUpdate$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AppLockRepository$enqueueLifecycleUpdate$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
