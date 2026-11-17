package X;

/* loaded from: classes4.dex */
public abstract class AW3 {
    public static /* synthetic */ void A00(AbstractC1555AlK abstractC1555AlK, AT3 at3, long j) {
        InterfaceC1068ATy interfaceC1068ATy;
        C16a c16a = C16a.A00;
        if (abstractC1555AlK instanceof C1097AYh) {
            AaC aaC = ((C1097AYh) abstractC1555AlK).A00;
            float f = aaC.A01;
            float f2 = aaC.A03;
            at3.A9g(null, c16a, 1.0f, 3, j, (C8j3.A0P(f) << 32) | (C8j3.A0P(f2) & 4294967295L), AnonymousClass005.A0M(aaC.A02 - f, aaC.A00 - f2));
            return;
        }
        if (abstractC1555AlK instanceof AW6) {
            AW6 aw6 = (AW6) abstractC1555AlK;
            interfaceC1068ATy = aw6.A01;
            if (interfaceC1068ATy == null) {
                AW7 aw7 = aw6.A00;
                float fA00 = AnonymousClass001.A00(aw7.A04);
                float f3 = aw7.A01;
                float f4 = aw7.A03;
                at3.A9j(null, c16a, 1.0f, 3, j, (C8j3.A0P(f3) << 32) | (C8j3.A0P(f4) & 4294967295L), AnonymousClass005.A0L(aw7.A02 - f3, aw7.A00 - f4), C8j3.A0O(fA00));
                return;
            }
        } else {
            if (!(abstractC1555AlK instanceof C1069ATz)) {
                throw C3cG.A0q();
            }
            interfaceC1068ATy = ((C1069ATz) abstractC1555AlK).A00;
        }
        at3.A9d(null, interfaceC1068ATy, c16a, 1.0f, 3, j);
    }
}
