package X;

/* renamed from: X.Cu2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4358Cu2 implements InterfaceC7005EeA {
    public final int $t;

    public C4358Cu2(int i) {
        this.$t = i;
    }

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ Object get() {
        boolean z;
        switch (this.$t) {
            case 0:
                z = true;
                break;
            case 1:
                z = false;
                break;
            default:
                return null;
        }
        return Boolean.valueOf(z);
    }
}
