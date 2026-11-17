package X;

/* renamed from: X.7nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC07117nq extends C7Bn implements BM4 {
    public final int arity;

    public AbstractC07117nq(int i) {
        this(i, null);
    }

    @Override // X.BM4
    public int getArity() {
        return this.arity;
    }

    @Override // X.AbstractC8884Fsp
    public String toString() {
        if (this.completion != null) {
            return super.toString();
        }
        String strA00 = F39.A00(this);
        C7384Etj.A0U(strA00);
        return strA00;
    }

    public AbstractC07117nq(int i, HtJ<Object> htJ) {
        super(htJ);
        this.arity = i;
    }
}
