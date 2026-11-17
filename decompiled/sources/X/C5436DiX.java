package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DiX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5436DiX implements DhC {
    public CXN A00;
    public CXN A01;
    public CXN A02;
    public CXN A03;
    public CXB A04;
    public C5326DgK A05;
    public C5326DgK A06;
    public C5353Dgw A07;
    public C5092DXa A08;
    public C5437DiY A09;
    public C6061Duw A0A;
    public C5596Dlb A0B;
    public AtomicBoolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final CXN A0G;
    public final InterfaceC5544DkM A0H;
    public final C5534DkB A0I;
    public final DEY A0J;
    public final C5527Dk3 A0K;

    public C5436DiX(CXN cxn, CXN cxn2, CXN cxn3, CXN cxn4, CXN cxn5, CXB cxb, InterfaceC5544DkM interfaceC5544DkM, C5534DkB c5534DkB, C5326DgK c5326DgK, C5326DgK c5326DgK2, C5353Dgw c5353Dgw, C5092DXa c5092DXa, DEY dey, C5437DiY c5437DiY, C6061Duw c6061Duw, C5527Dk3 c5527Dk3, C5596Dlb c5596Dlb, AtomicBoolean atomicBoolean, int i, boolean z) {
        this.A0E = false;
        this.A0A = null;
        this.A0C = null;
        this.A0B = null;
        this.A09 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A07 = null;
        this.A0H = interfaceC5544DkM;
        this.A0G = cxn;
        this.A0F = i * 1000;
        this.A0I = c5534DkB;
        this.A0K = c5527Dk3;
        this.A0J = dey;
        this.A0C = atomicBoolean;
        this.A0E = true;
        this.A03 = cxn2;
        this.A00 = cxn3;
        this.A02 = cxn4;
        this.A01 = cxn5;
        this.A0D = z;
        this.A0A = c6061Duw;
        this.A0B = c5596Dlb;
        this.A09 = c5437DiY;
        this.A08 = c5092DXa;
        this.A06 = c5326DgK;
        this.A05 = c5326DgK2;
        this.A07 = c5353Dgw;
        this.A04 = cxb;
        if (dey == null) {
            throw BV4.A0a("Use new DebugEventLoggerImpl(null) if you don't need to pass a logger.");
        }
    }
}
