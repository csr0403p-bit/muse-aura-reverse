package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.FCm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC7735FCm<V> implements Callable {
    public final /* synthetic */ InterfaceC7751FDd<RenderContext> A00;
    public final /* synthetic */ InterfaceC7734FCl<State, RenderContext, StateUpdateType> A01;
    public final /* synthetic */ FCX<StateUpdateType> A02;
    public final /* synthetic */ State A03;
    public final /* synthetic */ List<StateUpdateType> A04;

    /* JADX WARN: Multi-variable type inference failed */
    public CallableC7735FCm(InterfaceC7751FDd interfaceC7751FDd, InterfaceC7734FCl interfaceC7734FCl, FCX fcx, Object obj, List list) {
        this.A01 = interfaceC7734FCl;
        this.A02 = fcx;
        this.A00 = interfaceC7751FDd;
        this.A03 = obj;
        this.A04 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.A01.AbX(this.A02, this.A03, this.A04);
    }
}
