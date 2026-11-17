package X;

/* loaded from: classes4.dex */
public final class APA implements AOO {
    @Override // X.AOO
    public final InterfaceC1068ATy getClipPath(APL apl, AaC aaC, EnumC1820Arj enumC1820Arj, AXN axn) {
        APL apl2;
        APh aPh = (APh) apl.A01.getValue();
        if (aPh == null) {
            throw C60O.A0i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        }
        APh aPh2 = aPh.A01;
        if (aPh2 == null || (apl2 = (APL) aPh2.A0C.getValue()) == null) {
            return null;
        }
        APh aPh3 = (APh) apl2.A01.getValue();
        if (aPh3 != null) {
            return aPh3.A02;
        }
        throw C60O.A0i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
    }
}
