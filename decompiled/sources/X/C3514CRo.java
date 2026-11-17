package X;

/* renamed from: X.CRo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3514CRo implements InterfaceC7005EeA {
    public final int $t;
    public final Object A00;

    public C3514CRo(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ T get() {
        return this.$t != 0 ? this.A00 : ((C7096Eg2) this.A00).A00.getApplicationContext().getCacheDir();
    }
}
