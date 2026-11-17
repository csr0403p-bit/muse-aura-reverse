package X;

/* renamed from: X.EnP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7352EnP extends AbstractC7349EnM implements InterfaceC7359EnW {
    public final boolean syntheticJavaProperty;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC7352EnP) {
                AbstractC7349EnM abstractC7349EnM = (AbstractC7349EnM) obj;
                if (!getOwner().equals(abstractC7349EnM.getOwner()) || !this.name.equals(abstractC7349EnM.name) || !this.signature.equals(abstractC7349EnM.signature) || !C7384Etj.areEqual(this.receiver, abstractC7349EnM.receiver)) {
                }
            } else if (obj instanceof InterfaceC7359EnW) {
                return obj.equals(compute());
            }
            return false;
        }
        return true;
    }

    public AbstractC7352EnP(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // X.AbstractC7349EnM
    public InterfaceC7350EnN compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        InterfaceC7350EnN interfaceC7350EnN = this.reflected;
        if (interfaceC7350EnN != null) {
            return interfaceC7350EnN;
        }
        this.reflected = this;
        return this;
    }

    @Override // X.AbstractC7349EnM
    public InterfaceC7359EnW getReflected() {
        if (this.syntheticJavaProperty) {
            throw C8j3.A18("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC7359EnW) super.getReflected();
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.signature, AnonymousClass005.A0I(this.name, AnonymousClass005.A0E(getOwner())));
    }

    @Override // X.InterfaceC7359EnW
    public boolean isConst() {
        getReflected().isConst();
        throw null;
    }

    @Override // X.InterfaceC7359EnW
    public boolean isLateinit() {
        getReflected().isLateinit();
        throw null;
    }

    public String toString() {
        InterfaceC7350EnN interfaceC7350EnNCompute = compute();
        return interfaceC7350EnNCompute != this ? interfaceC7350EnNCompute.toString() : FGI.A0U("property ", this.name, C8j2.A00(2));
    }
}
