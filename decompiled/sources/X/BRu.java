package X;

/* loaded from: classes4.dex */
public abstract class BRu {
    public int A00;
    public final AIG<byte[]> A01 = new AIG<>();

    public final void A00(byte[] bArr) {
        synchronized (this) {
            int i = this.A00;
            int length = bArr.length;
            if (i + length < BRm.A00) {
                this.A00 = i + (length / 2);
                this.A01.addLast(bArr);
            }
        }
    }

    public final byte[] A01(int i) {
        byte[] bArrRemoveLast;
        synchronized (this) {
            AIG<byte[]> aig = this.A01;
            bArrRemoveLast = aig.isEmpty() ? null : aig.removeLast();
            if (bArrRemoveLast != null) {
                this.A00 -= bArrRemoveLast.length / 2;
            } else {
                bArrRemoveLast = null;
            }
        }
        return bArrRemoveLast == null ? new byte[i] : bArrRemoveLast;
    }
}
