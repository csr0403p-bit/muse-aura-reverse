package X;

/* renamed from: X.Ee2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7000Ee2 implements InterfaceC7005EeA<C7167Ehc> {
    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ C7167Ehc get() {
        int i;
        int iA01 = BV4.A01(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iA01 < 16777216) {
            i = 1048576;
        } else {
            i = 4194304;
            if (iA01 < 33554432) {
                i = 2097152;
            }
        }
        return new C7167Ehc(i, Integer.MAX_VALUE, i, i / 8);
    }
}
