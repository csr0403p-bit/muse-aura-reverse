package X;

import java.util.Set;

/* renamed from: X.Cfb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3846Cfb implements Cg7 {
    public final AbstractC3874Cg5 A00;
    public final InterfaceC3926Ch7 A01;
    public final Set<Ce6> A02;

    @Override // X.Cg7
    public final C3844CfX AM1(Ce6 ce6, InterfaceC3914Cgs interfaceC3914Cgs, String str) {
        Set<Ce6> set = this.A02;
        if (set.contains(ce6)) {
            return new C3844CfX(ce6, interfaceC3914Cgs, this.A00, this.A01, str);
        }
        throw BV5.A0T("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{ce6, set});
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<LX/Ce6;>;LX/Cg5;LX/Ch7;)V */
    public C3846Cfb(AbstractC3874Cg5 abstractC3874Cg5, InterfaceC3926Ch7 interfaceC3926Ch7, Set set) {
        this.A02 = set;
        this.A00 = abstractC3874Cg5;
        this.A01 = interfaceC3926Ch7;
    }
}
