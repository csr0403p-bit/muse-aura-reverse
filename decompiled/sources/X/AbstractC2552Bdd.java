package X;

/* renamed from: X.Bdd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC2552Bdd {
    public static void A00(InterfaceC2551Bdc interfaceC2551Bdc) {
        boolean zA74 = interfaceC2551Bdc.A74(InterfaceC2551Bdc.A07);
        boolean zA1X = AnonymousClass002.A1X(interfaceC2551Bdc.Abl(InterfaceC2551Bdc.A08, null));
        if (zA74 && zA1X) {
            throw C60O.A0i("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC2551Bdc.Abl(InterfaceC2551Bdc.A05, null) != null) {
            if (zA74 || zA1X) {
                throw C60O.A0i("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
