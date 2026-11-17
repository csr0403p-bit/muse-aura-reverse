package X;

/* renamed from: X.DHn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4954DHn implements CSZ {
    public final int $t;
    public final Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C4954DHn(Object obj, C3320CDz<Integer> c3320CDz) {
        this.$t = c3320CDz;
        this.A00 = obj;
    }

    @Override // X.CSZ
    public final void onSuccess(Object obj) {
        if (8 - this.$t != 0) {
            ((G0U) this.A00).invoke(obj);
            return;
        }
        C3320CDz c3320CDz = (C3320CDz) this.A00;
        c3320CDz.A00.A06(BV4.A0W());
    }
}
