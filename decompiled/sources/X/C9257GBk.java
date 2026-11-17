package X;

/* renamed from: X.GBk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9257GBk implements InterfaceC9269GBw {
    public final boolean A00;

    @Override // X.InterfaceC9269GBw
    public final GC1 AH7() {
        return null;
    }

    @Override // X.InterfaceC9269GBw
    public final boolean isActive() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0N("Empty{", this.A00 ? "Active" : "New", '}');
    }

    public C9257GBk(boolean z) {
        this.A00 = z;
    }
}
