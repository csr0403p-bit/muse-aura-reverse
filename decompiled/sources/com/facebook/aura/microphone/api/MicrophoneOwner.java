package com.facebook.aura.microphone.api;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class MicrophoneOwner implements InterfaceC7549F2g {
    public final BLG<MicrophonePriority> _holder;
    public Claim current;
    public final C1BN<MicrophonePriority> holder;

    public final class Claim implements MicrophoneClaim {
        public final Function0<Unit> onPreempted;
        public final MicrophonePriority priority;
        public final /* synthetic */ MicrophoneOwner this$0;

        public final Function0<Unit> getOnPreempted() {
            return this.onPreempted;
        }

        public final MicrophonePriority getPriority() {
            return this.priority;
        }

        @Override // com.facebook.aura.microphone.api.MicrophoneClaim
        public void release() {
            this.this$0.release(this);
        }

        public Claim(MicrophoneOwner microphoneOwner, MicrophonePriority microphonePriority, Function0<Unit> function0) {
            AnonymousClass003.A0x(microphonePriority, function0);
            this.this$0 = microphoneOwner;
            this.priority = microphonePriority;
            this.onPreempted = function0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void release(Claim claim) {
        if (this.current == claim) {
            this.current = null;
            this._holder.Af8(null);
        }
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.current = null;
        this._holder.Af8(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preempt(com.facebook.aura.microphone.api.MicrophonePriority r4) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            monitor-enter(r3)
            com.facebook.aura.microphone.api.MicrophoneOwner$Claim r2 = r3.current     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            if (r2 == 0) goto L13
            com.facebook.aura.microphone.api.MicrophonePriority r0 = r2.priority     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.compareTo(r4)     // Catch: java.lang.Throwable -> L1f
            if (r0 > 0) goto L13
            goto L14
        L13:
            r2 = r1
        L14:
            monitor-exit(r3)
            if (r2 == 0) goto L1e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.onPreempted
            if (r0 == 0) goto L1e
            r0.invoke()
        L1e:
            return
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.microphone.api.MicrophoneOwner.preempt(com.facebook.aura.microphone.api.MicrophonePriority):void");
    }

    public final C1BN<MicrophonePriority> getHolder() {
        return this.holder;
    }

    public MicrophoneOwner() {
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._holder = c9286GCnA13;
        this.holder = C3cG.A11(c9286GCnA13);
    }

    public final MicrophoneClaim claim(MicrophonePriority microphonePriority, Function0<Unit> function0) {
        Function0<Unit> function02;
        AnonymousClass003.A0u(microphonePriority, function0);
        Claim claim = new Claim(this, microphonePriority, function0);
        synchronized (this) {
            Claim claim2 = this.current;
            if (claim2 != null && claim2.priority.compareTo(microphonePriority) > 0) {
                return null;
            }
            this.current = claim;
            AnonymousClass002.A1I(this._holder, microphonePriority);
            if (claim2 != null && (function02 = claim2.onPreempted) != null) {
                function02.invoke();
            }
            return claim;
        }
    }
}
