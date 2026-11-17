package X;

/* renamed from: X.COq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3468COq implements InterfaceC3465COn {
    @Override // X.InterfaceC3465COn
    public final int AKm() {
        return ETi.A09.get();
    }

    @Override // X.InterfaceC3465COn
    public final boolean APj(String str, int i) {
        return ETi.loadLibraryUnsafe(str, (i & 1) != 0 ? 16 : 0);
    }
}
