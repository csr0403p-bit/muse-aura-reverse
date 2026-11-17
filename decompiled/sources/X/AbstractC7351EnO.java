package X;

/* renamed from: X.EnO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7351EnO extends AbstractC7349EnM implements InterfaceC7353EnQ, BM4 {
    public final int arity;

    public AbstractC7351EnO(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // X.AbstractC7349EnM
    public InterfaceC7350EnN computeReflected() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC7351EnO) {
                AbstractC7349EnM abstractC7349EnM = (AbstractC7349EnM) obj;
                if (!this.name.equals(abstractC7349EnM.name) || !this.signature.equals(abstractC7349EnM.signature) || !C7384Etj.areEqual(this.receiver, abstractC7349EnM.receiver) || !C7384Etj.areEqual(getOwner(), abstractC7349EnM.getOwner())) {
                }
            } else if (obj instanceof InterfaceC7353EnQ) {
                return obj.equals(compute());
            }
            return false;
        }
        return true;
    }

    @Override // X.BM4
    public int getArity() {
        return this.arity;
    }

    @Override // X.AbstractC7349EnM
    public InterfaceC7353EnQ getReflected() {
        return (InterfaceC7353EnQ) super.getReflected();
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.signature, AnonymousClass005.A0I(this.name, getOwner() == null ? 0 : AnonymousClass005.A0E(getOwner())));
    }

    @Override // X.InterfaceC7353EnQ
    public boolean isExternal() {
        ((InterfaceC7353EnQ) super.getReflected()).isExternal();
        throw null;
    }

    @Override // X.InterfaceC7353EnQ
    public boolean isInfix() {
        ((InterfaceC7353EnQ) super.getReflected()).isInfix();
        throw null;
    }

    @Override // X.InterfaceC7353EnQ
    public boolean isInline() {
        ((InterfaceC7353EnQ) super.getReflected()).isInline();
        throw null;
    }

    @Override // X.InterfaceC7353EnQ
    public boolean isOperator() {
        ((InterfaceC7353EnQ) super.getReflected()).isOperator();
        throw null;
    }

    @Override // X.AbstractC7349EnM, X.InterfaceC7350EnN
    public boolean isSuspend() {
        ((InterfaceC7353EnQ) super.getReflected()).isSuspend();
        throw null;
    }

    public String toString() {
        InterfaceC7350EnN interfaceC7350EnNCompute = compute();
        if (interfaceC7350EnNCompute != this) {
            return interfaceC7350EnNCompute.toString();
        }
        String str = this.name;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : FGI.A0U("function ", str, C8j2.A00(2));
    }

    @Override // X.AbstractC7349EnM
    public /* bridge */ /* synthetic */ InterfaceC7350EnN getReflected() {
        return super.getReflected();
    }
}
