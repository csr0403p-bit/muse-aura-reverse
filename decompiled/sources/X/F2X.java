package X;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class F2X implements BM4, Serializable {
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F2X) {
                F2X f2x = (F2X) obj;
                if (this.isTopLevel != f2x.isTopLevel || this.arity != f2x.arity || this.flags != f2x.flags || !C7384Etj.areEqual(this.receiver, f2x.receiver) || !C7384Etj.areEqual(this.owner, f2x.owner) || !this.name.equals(f2x.name) || !this.signature.equals(f2x.signature)) {
                }
            }
            return false;
        }
        return true;
    }

    public F2X(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC7349EnM.NO_RECEIVER, cls, str, str2, i2);
    }

    @Override // X.BM4
    public int getArity() {
        return this.arity;
    }

    public F14 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? new F0U(cls) : new C0861A6i(cls);
    }

    public int hashCode() {
        int iA01 = C60R.A01(this.receiver) * 31;
        Class cls = this.owner;
        return ((((AnonymousClass005.A0I(this.signature, AnonymousClass005.A0I(this.name, (iA01 + (cls != null ? cls.hashCode() : 0)) * 31)) + BV7.A02(this.isTopLevel ? 1 : 0)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return F39.A00(this);
    }

    public F2X(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
