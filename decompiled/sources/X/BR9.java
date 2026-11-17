package X;

/* loaded from: classes4.dex */
public abstract class BR9 {
    public int A00;
    public final AIG<char[]> A01 = new AIG<>();

    public final void A00(char[] cArr) {
        synchronized (this) {
            int length = this.A00 + cArr.length;
            if (length < BRm.A00) {
                this.A00 = length;
                this.A01.addLast(cArr);
            }
        }
    }

    public final char[] A01(int i) {
        char[] cArrRemoveLast;
        synchronized (this) {
            AIG<char[]> aig = this.A01;
            cArrRemoveLast = aig.isEmpty() ? null : aig.removeLast();
            if (cArrRemoveLast != null) {
                this.A00 -= cArrRemoveLast.length;
            } else {
                cArrRemoveLast = null;
            }
        }
        return cArrRemoveLast == null ? new char[i] : cArrRemoveLast;
    }
}
