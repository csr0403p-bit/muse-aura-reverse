package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.AGq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0889AGq<T> extends AbstractC7470ExA<T> {
    public int A00;
    public int A01;
    public final /* synthetic */ C0888AGp<T> A02;

    public C0889AGq(C0888AGp<T> c0888AGp) {
        this.A02 = c0888AGp;
        this.A00 = c0888AGp.size();
        this.A01 = c0888AGp.A01;
    }

    @Override // X.AbstractC7470ExA
    public final void A00() {
        int i = this.A00;
        if (i == 0) {
            super.A00 = 2;
            return;
        }
        C0888AGp<T> c0888AGp = this.A02;
        Object[] objArr = c0888AGp.A03;
        int i2 = this.A01;
        super.A01 = (T) objArr[i2];
        super.A00 = 1;
        this.A01 = (i2 + 1) % c0888AGp.A02;
        this.A00 = i - 1;
    }
}
