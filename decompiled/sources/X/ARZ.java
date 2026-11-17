package X;

/* loaded from: classes4.dex */
public abstract class ARZ {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/1Z2;LX/AKN<TT;>;)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A01(AKN akn, C1Z2 c1z2) {
        if (((AbstractC1439Aj8) c1z2).node.isAttached) {
            return AKO.A08(akn, (C0967AJu) AbstractC1414Aij.A04(c1z2).A04);
        }
        ASP.A01("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        throw F60.createAndThrow();
    }

    public static InterfaceC1079AXi A00(C1Z2 c1z2) {
        return (InterfaceC1079AXi) A01(Am0.A0H, c1z2);
    }
}
