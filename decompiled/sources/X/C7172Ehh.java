package X;

/* renamed from: X.Ehh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7172Ehh implements InterfaceC7288EkF {
    public final C7270Ejv A00;

    @Override // X.InterfaceC7288EkF
    public final int AFs(int i) {
        return this.A00.A0A[i];
    }

    @Override // X.InterfaceC7288EkF
    public final int AHK() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC7288EkF
    public final int ANN() {
        return this.A00.A06.getHeight();
    }

    @Override // X.InterfaceC7288EkF
    public final int AiQ() {
        return this.A00.A06.getWidth();
    }

    @Override // X.InterfaceC7288EkF
    public final int getFrameCount() {
        return this.A00.A06.getFrameCount();
    }

    @Override // X.InterfaceC7288EkF
    public final int getLoopCount() {
        return this.A00.A06.getLoopCount();
    }

    public C7172Ehh(C7270Ejv c7270Ejv) {
        this.A00 = c7270Ejv;
    }
}
