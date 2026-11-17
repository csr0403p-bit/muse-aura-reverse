package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.EhX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7162EhX<K, V> implements Eh0<C7161EhW<K, V>> {
    public final /* synthetic */ C7158EhT<K, V> A00;
    public final /* synthetic */ Eh0<V> A01;

    public C7162EhX(C7158EhT<K, V> c7158EhT, Eh0<V> eh0) {
        this.A00 = c7158EhT;
        this.A01 = eh0;
    }

    @Override // X.Eh0
    public final /* bridge */ /* synthetic */ int AKf(Object obj) {
        C7161EhW c7161EhW = (C7161EhW) obj;
        C7384Etj.A0Y(c7161EhW, 0);
        return this.A01.AKf(c7161EhW.A02.A04());
    }
}
