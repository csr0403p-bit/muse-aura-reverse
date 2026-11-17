package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionController;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$1$installed$1", f = "BrowserSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserSessionController$openNoiseDuplexStream$1$installed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ int $generation;
    public final /* synthetic */ BrowserSessionController.VncHost $host;
    public final /* synthetic */ HatchDuplexHttpStream $stream;
    public final /* synthetic */ AtomicBoolean $terminal;
    public int label;
    public final /* synthetic */ BrowserSessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserSessionController$openNoiseDuplexStream$1$installed$1(BrowserSessionController browserSessionController, int i, BrowserSessionController.VncHost vncHost, AtomicBoolean atomicBoolean, HatchDuplexHttpStream hatchDuplexHttpStream, HtJ<? super BrowserSessionController$openNoiseDuplexStream$1$installed$1> htJ) {
        super(2, htJ);
        this.this$0 = browserSessionController;
        this.$generation = i;
        this.$host = vncHost;
        this.$terminal = atomicBoolean;
        this.$stream = hatchDuplexHttpStream;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserSessionController$openNoiseDuplexStream$1$installed$1(this.this$0, this.$generation, this.$host, this.$terminal, this.$stream, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.this$0.isCurrentNativeSocket(this.$generation) && this.this$0.isCurrentHost(this.$host) && !this.$terminal.get()) {
            this.this$0.duplexStream = this.$stream;
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((BrowserSessionController$openNoiseDuplexStream$1$installed$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
