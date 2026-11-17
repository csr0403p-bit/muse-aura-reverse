package X;

import com.google.common.base.Supplier;

/* renamed from: X.Dll, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5606Dll implements InterfaceC5910Drt {
    public int A00;
    public C6154Dwx A01;
    public Dw9 A02;
    public InterfaceC5530Dk7 A03;
    public InterfaceC5334DgV A04;
    public Supplier<InterfaceExecutorC5232Ddq> A05;
    public final CXN A06;

    @Override // X.InterfaceC5791Dpa
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5429DiQ A7u(C5704Dnm c5704Dnm) {
        c5704Dnm.A03.getClass();
        return new C5429DiQ(c5704Dnm, this.A06, this.A03, this.A04, this.A05, this.A00);
    }

    public C5606Dll(CXN cxn, final InterfaceC5819Dq4 interfaceC5819Dq4) {
        this(cxn, new C6070Dv8(), new InterfaceC5530Dk7() { // from class: X.Djw
            @Override // X.InterfaceC5530Dk7
            public final C5494DjW A7y() {
                return new C5494DjW(interfaceC5819Dq4);
            }
        }, new C5330DgR(-1), 1048576);
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void AdL(Dw9 dw9) {
        if (dw9 == null) {
            throw BV5.A0Y("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.A02 = dw9;
    }

    @Override // X.InterfaceC5791Dpa
    public final /* bridge */ /* synthetic */ void Adg(InterfaceC5334DgV interfaceC5334DgV) {
        if (interfaceC5334DgV == null) {
            throw BV5.A0Y("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.A04 = interfaceC5334DgV;
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void ABD(boolean z) {
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void ABF(int i) {
    }

    @Override // X.InterfaceC5791Dpa
    public final /* synthetic */ void Aer(InterfaceC5885DrL interfaceC5885DrL) {
    }

    public C5606Dll(CXN cxn, Dw9 dw9, InterfaceC5530Dk7 interfaceC5530Dk7, InterfaceC5334DgV interfaceC5334DgV, int i) {
        this.A06 = cxn;
        this.A03 = interfaceC5530Dk7;
        this.A02 = dw9;
        this.A04 = interfaceC5334DgV;
        this.A00 = i;
    }
}
