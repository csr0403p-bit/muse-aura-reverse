package X;

/* loaded from: classes5.dex */
public final class E4F implements InterfaceC5509Djl {
    public final long A00;
    public final /* synthetic */ C6386E3n A01;

    public E4F(C6386E3n c6386E3n, long j) {
        this.A01 = c6386E3n;
        this.A00 = j;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        C6386E3n c6386E3n = this.A01;
        DkQ dkQA00 = c6386E3n.A08[0].A00(j);
        int i = 1;
        while (true) {
            C6391E3t[] c6391E3tArr = c6386E3n.A08;
            if (i >= c6391E3tArr.length) {
                return dkQA00;
            }
            DkQ dkQA002 = c6391E3tArr[i].A00(j);
            if (dkQA002.A00.A00 < dkQA00.A00.A00) {
                dkQA00 = dkQA002;
            }
            i++;
        }
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }
}
