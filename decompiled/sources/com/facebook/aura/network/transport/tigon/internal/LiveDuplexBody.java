package com.facebook.aura.network.transport.tigon.internal;

import X.AbstractC10623Hzj;
import X.BV4;
import X.C06H;
import X.C7384Etj;
import X.C79;
import X.HtJ;
import X.HzP;
import X.HzR;
import com.facebook.tigon.TigonBodyStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class LiveDuplexBody {
    public final AtomicBoolean canceled;
    public final AtomicBoolean closed;
    public final AtomicBoolean finished;
    public final NoisePauseGate pauseGate;
    public final HzR<Frame> queue;

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody", f = "LiveDuplexBodyProvider.kt", l = {78}, m = "write", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody$write$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LiveDuplexBody.this.write(null, this);
        }
    }

    public final void writeTo(TigonBodyStream tigonBodyStream) {
        C7384Etj.A0Y(tigonBodyStream, 0);
        LiveDuplexBodyProviderKt.writeLiveDuplexBody(tigonBodyStream, this.queue, this.closed, this.canceled, this.finished, this.pauseGate);
    }

    public final void cancel() {
        this.canceled.set(true);
        this.closed.set(true);
        this.queue.A5w(new CancellationException("live duplex body canceled"));
        this.pauseGate.wakeWriter();
    }

    public final boolean finish() {
        if (!this.closed.compareAndSet(false, true)) {
            return false;
        }
        this.finished.set(true);
        return this.queue.A6R(null);
    }

    public final void setPausedForOutboundBackpressure(boolean z) {
        this.pauseGate.setPaused(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object write(byte[] r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody.AnonymousClass1
            if (r0 == 0) goto L1f
            r6 = r9
            com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody$write$1 r6 = (com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L6c
            goto L25
        L1f:
            com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody$write$1 r6 = new com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody$write$1
            r6.<init>(r9)
            goto L12
        L25:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            goto L54
        L29:
            X.Hwg.A00(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.closed
            boolean r0 = r0.get()
            if (r0 == 0) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L39:
            X.HzR<com.facebook.aura.network.transport.tigon.internal.Frame> r2 = r7.queue     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            int r0 = r8.length     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            byte[] r0 = java.util.Arrays.copyOf(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            X.C7384Etj.A0U(r0)     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            com.facebook.aura.network.transport.tigon.internal.Frame$Data r1 = new com.facebook.aura.network.transport.tigon.internal.Frame$Data     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            r1.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            r0 = 0
            r6.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            r6.label = r3     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            java.lang.Object r0 = r2.AcU(r1, r6)     // Catch: java.util.concurrent.CancellationException -> L56 kotlinx.coroutines.channels.ClosedSendChannelException -> L67
            if (r0 != r5) goto L54
            return r5
        L54:
            r4 = 1
            goto L67
        L56:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.closed
            boolean r0 = r0.get()
            if (r0 != 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.canceled
            boolean r0 = r0.get()
            if (r0 == 0) goto L70
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L6c:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L70:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.internal.LiveDuplexBody.write(byte[], X.HtJ):java.lang.Object");
    }

    public LiveDuplexBody(int i) {
        this.queue = AbstractC10623Hzj.A00(C79.A00, i);
        this.closed = BV4.A12(false);
        this.canceled = BV4.A12(false);
        this.finished = BV4.A12(false);
        this.pauseGate = new NoisePauseGate();
    }

    public /* synthetic */ LiveDuplexBody(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public LiveDuplexBody() {
        this(64);
    }
}
