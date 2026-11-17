package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FEE<State, RenderContext> {
    public final C7765FDs A00;
    public final FET A01;
    public final InterfaceC7751FDd<RenderContext> A02;
    public final FGW A03;
    public final State A04;

    /* JADX WARN: Incorrect types in method signature: (LX/FET;LX/FDd<TRenderContext;>;LX/FDs;TState;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public FEE(C7765FDs c7765FDs, FET fet, InterfaceC7751FDd interfaceC7751FDd, Object obj) {
        this.A01 = fet;
        this.A02 = interfaceC7751FDd;
        this.A00 = c7765FDs;
        this.A04 = obj;
        this.A03 = fet.A03;
    }

    public static final <RenderContext> FET A00(C7764FDr<RenderContext> c7764FDr, InterfaceC7751FDd<RenderContext> interfaceC7751FDd, long j) {
        return new FET(FEM.A01, FGZ.A00(c7764FDr, interfaceC7751FDd.A5j(c7764FDr, AbstractC7826FGh.A01(j), AbstractC7826FGh.A00(j)), j));
    }

    public static final <State, RenderContext> FEE<State, RenderContext> A01(C7764FDr<RenderContext> c7764FDr, InterfaceC7751FDd<RenderContext> interfaceC7751FDd, State state, long j) {
        InterfaceC7823FGe interfaceC7823FGeA5j = interfaceC7751FDd.A5j(c7764FDr, AbstractC7826FGh.A01(j), AbstractC7826FGh.A00(j));
        C7384Etj.A0Y(interfaceC7823FGeA5j, 2);
        FET fet = new FET(FEM.A01, FGZ.A00(c7764FDr, interfaceC7823FGeA5j, j));
        C7749FDb c7749FDbA00 = c7764FDr.A00();
        Map<Object, Object> map = c7749FDbA00.A02;
        C0918AHu<Object, Object> c0918AHu = c7749FDbA00.A00;
        if (c0918AHu == null) {
            c0918AHu = AbstractC0977AKq.A00;
        }
        return new FEE<>(new C7765FDs(c0918AHu, map), fet, interfaceC7751FDd, state);
    }
}
