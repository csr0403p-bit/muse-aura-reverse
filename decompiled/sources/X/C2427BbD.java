package X;

/* renamed from: X.BbD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2427BbD {
    public final String A00;
    public final String A01;
    public final G0V<Integer, String, Boolean> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2427BbD) {
                C2427BbD c2427BbD = (C2427BbD) obj;
                if (!this.A01.equals(c2427BbD.A01) || !this.A00.equals(c2427BbD.A00) || !this.A02.equals(c2427BbD.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A01)));
    }

    public final String toString() {
        String str = this.A01;
        String str2 = this.A00;
        G0V<Integer, String, Boolean> g0v = this.A02;
        StringBuilder sbA0x = C3cI.A0x("ReservedUniformDeclaration(name=", str);
        sbA0x.append(", declaration=");
        sbA0x.append(str2);
        return C3cJ.A0L(g0v, ", shouldEmit=", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;LX/G0V<-Ljava/lang/Integer;-Ljava/lang/String;Ljava/lang/Boolean;>;)V */
    public C2427BbD(G0V g0v, String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = g0v;
    }
}
