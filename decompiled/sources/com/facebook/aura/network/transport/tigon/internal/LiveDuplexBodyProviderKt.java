package com.facebook.aura.network.transport.tigon.internal;

import X.AbstractC07127nr;
import X.AbstractC9245GAx;
import X.BV4;
import X.C3UX;
import X.C6ys;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.HzR;
import com.facebook.tigon.TigonBodyStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public abstract class LiveDuplexBodyProviderKt {
    public static final int LIVE_DUPLEX_QUEUE_CAPACITY = 64;

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProviderKt$writeLiveDuplexBody$1", f = "LiveDuplexBodyProvider.kt", l = {131}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProviderKt$writeLiveDuplexBody$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AtomicBoolean $canceled;
        public final /* synthetic */ AtomicBoolean $closed;
        public final /* synthetic */ NoisePauseGate $pauseGate;
        public final /* synthetic */ HzR<Frame> $queue;
        public final /* synthetic */ TigonBodyStream $stream;
        public final /* synthetic */ F1F $streamCanceled;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HzR<Frame> hzR, NoisePauseGate noisePauseGate, AtomicBoolean atomicBoolean, F1F f1f, TigonBodyStream tigonBodyStream, AtomicBoolean atomicBoolean2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$queue = hzR;
            this.$pauseGate = noisePauseGate;
            this.$canceled = atomicBoolean;
            this.$streamCanceled = f1f;
            this.$stream = tigonBodyStream;
            this.$closed = atomicBoolean2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$queue, this.$pauseGate, this.$canceled, this.$streamCanceled, this.$stream, this.$closed, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:6:0x0010). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r4 = 1
                if (r0 == 0) goto L55
                if (r0 != r4) goto L6e
                java.lang.Object r6 = r7.L$0
                X.GCW r6 = (X.GCW) r6
                X.Hwg.A00(r8)
            L10:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 == 0) goto L2e
                java.lang.Object r2 = r6.A00()
                com.facebook.aura.network.transport.tigon.internal.Frame r2 = (com.facebook.aura.network.transport.tigon.internal.Frame) r2
                boolean r0 = r2 instanceof com.facebook.aura.network.transport.tigon.internal.Frame.Data
                if (r0 == 0) goto L69
                com.facebook.aura.network.transport.tigon.internal.NoisePauseGate r1 = r7.$pauseGate
                java.util.concurrent.atomic.AtomicBoolean r0 = r7.$canceled
                boolean r0 = com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProviderKt.awaitLiveDuplexResume(r1, r0)
                if (r0 != 0) goto L31
                X.F1F r0 = r7.$streamCanceled
                r0.element = r4
            L2e:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L31:
                com.facebook.tigon.TigonBodyStream r3 = r7.$stream
                com.facebook.aura.network.transport.tigon.internal.Frame$Data r2 = (com.facebook.aura.network.transport.tigon.internal.Frame.Data) r2
                byte[] r2 = r2.bytes
                int r1 = r2.length
                r0 = 0
                int r0 = r3.transferBytes(r2, r0, r1)
                if (r4 != r0) goto L5e
                X.F1F r0 = r7.$streamCanceled
                r0.element = r4
                java.util.concurrent.atomic.AtomicBoolean r0 = r7.$closed
                r0.set(r4)
                X.HzR<com.facebook.aura.network.transport.tigon.internal.Frame> r2 = r7.$queue
                java.lang.String r1 = "live duplex stream canceled"
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                r0.<init>(r1)
                r2.A5w(r0)
                goto L2e
            L55:
                X.Hwg.A00(r8)
                X.HzR<com.facebook.aura.network.transport.tigon.internal.Frame> r0 = r7.$queue
                X.GCW r6 = r0.APO()
            L5e:
                r7.L$0 = r6
                r7.label = r4
                java.lang.Object r8 = r6.A01(r7)
                if (r8 != r5) goto L10
                return r5
            L69:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L6e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.internal.LiveDuplexBodyProviderKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void writeLiveDuplexBody(TigonBodyStream tigonBodyStream, HzR<Frame> hzR, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, NoisePauseGate noisePauseGate) {
        noisePauseGate.captureWriterThread();
        F1F f1f = new F1F();
        try {
            AbstractC9245GAx.A00(C6ys.A00, new AnonymousClass1(hzR, noisePauseGate, atomicBoolean2, f1f, tigonBodyStream, atomicBoolean, null));
            if (!f1f.element && atomicBoolean3.get() && awaitLiveDuplexResume(noisePauseGate, atomicBoolean2)) {
                tigonBodyStream.writeEOM();
            }
        } catch (InterruptedException unused) {
            BV4.A1A();
        } catch (CancellationException unused2) {
        } catch (Throwable unused3) {
            atomicBoolean.set(true);
            hzR.A5w(new CancellationException("live duplex writer failed"));
        }
    }

    public static final boolean awaitLiveDuplexResume(NoisePauseGate noisePauseGate, AtomicBoolean atomicBoolean) {
        while (noisePauseGate.paused.get()) {
            if (atomicBoolean.get()) {
                return false;
            }
            LockSupport.park();
        }
        return !atomicBoolean.get();
    }
}
