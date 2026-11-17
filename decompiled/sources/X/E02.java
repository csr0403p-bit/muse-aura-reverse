package X;

/* loaded from: classes5.dex */
public final class E02 implements Comparable<E02> {
    public final long A00;
    public final byte[] A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(E02 e02) {
        return (this.A00 > e02.A00 ? 1 : (this.A00 == e02.A00 ? 0 : -1));
    }

    public E02(byte[] bArr, long j) {
        this.A00 = j;
        this.A01 = bArr;
    }
}
