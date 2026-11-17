package X;

import X.InterfaceC3786CeU;

/* renamed from: X.CrC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4240CrC<O extends InterfaceC3786CeU> {
    public final AbstractC4203Cpp A00;
    public final C4378CuY A01;
    public final String A02;

    /* JADX WARN: Incorrect types in method signature: <C::LX/CpP;>(Ljava/lang/String;LX/Cpp<TC;TO;>;LX/CuY<TC;>;)V */
    public C4240CrC(AbstractC4203Cpp abstractC4203Cpp, C4378CuY c4378CuY, String str) {
        CRy.A04(abstractC4203Cpp, "Cannot construct an Api with a null ClientBuilder");
        CRy.A04(c4378CuY, "Cannot construct an Api with a null ClientKey");
        this.A02 = str;
        this.A00 = abstractC4203Cpp;
        this.A01 = c4378CuY;
    }
}
