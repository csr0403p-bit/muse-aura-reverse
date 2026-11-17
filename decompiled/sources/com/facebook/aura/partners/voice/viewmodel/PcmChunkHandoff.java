package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC10623Hzj;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.HtJ;
import X.HzP;
import X.HzR;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class PcmChunkHandoff {
    public int bufferedBytes;
    public boolean closed;
    public final int maxBufferedBytes;
    public final Object lock = C3cG.A0T();
    public final ArrayDeque<byte[]> chunks = new ArrayDeque<>();
    public final HzR<Unit> available = AbstractC10623Hzj.A00(C79.A00, -1);

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff", f = "VoicePreviewPlayer.kt", l = {631}, m = "receive", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff$receive$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PcmChunkHandoff.this.receive(this);
        }
    }

    public final boolean offer(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        synchronized (this.lock) {
            if (this.closed) {
                return true;
            }
            int i = this.bufferedBytes;
            int length = bArr.length;
            if (i + length > this.maxBufferedBytes) {
                return false;
            }
            this.chunks.addLast(bArr);
            this.bufferedBytes += length;
            this.available.AhZ(Unit.INSTANCE);
            return true;
        }
    }

    public final void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.available.AhZ(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receive(X.HtJ<? super byte[]> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff.AnonymousClass1
            if (r0 == 0) goto L22
            r5 = r7
            com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff$receive$1 r5 = (com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L28
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff$receive$1 r5 = new com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff$receive$1
            r5.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r2)
        L2b:
            java.lang.Object r3 = r6.lock
            monitor-enter(r3)
            java.util.ArrayDeque<byte[]> r0 = r6.chunks     // Catch: java.lang.Throwable -> L53
            java.lang.Object r2 = r0.pollFirst()     // Catch: java.lang.Throwable -> L53
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L3f
            int r1 = r6.bufferedBytes     // Catch: java.lang.Throwable -> L53
            int r0 = r2.length     // Catch: java.lang.Throwable -> L53
            int r1 = r1 - r0
            r6.bufferedBytes = r1     // Catch: java.lang.Throwable -> L53
            goto L51
        L3f:
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)
            if (r0 == 0) goto L46
            r4 = 0
            return r4
        L46:
            X.HzR<kotlin.Unit> r0 = r6.available
            r5.label = r1
            java.lang.Object r0 = r0.AZg(r5)
            if (r0 != r4) goto L2b
            return r4
        L51:
            monitor-exit(r3)
            return r2
        L53:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff.receive(X.HtJ):java.lang.Object");
    }

    public PcmChunkHandoff(int i) {
        this.maxBufferedBytes = i;
    }
}
