package X;

/* renamed from: X.EWm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6707EWm implements InterfaceC3587CVm {
    public final int $t;
    public final Object A00;

    public C6707EWm(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC3587CVm
    public final /* bridge */ /* synthetic */ void Aa9(Object obj) {
        if (this.$t != 0) {
            ((EFU) this.A00).A01.release();
        } else {
            C7384Etj.A0Y(obj, 0);
            ((C7118EgY) this.A00).A01.Aa9(obj);
        }
    }
}
