package X;

/* renamed from: X.Fju, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8755Fju implements InterfaceC10514HoR<C8770Fk9> {
    public static final C8755Fju A00 = new C8755Fju();

    @Override // X.InterfaceC10514HoR
    public final /* bridge */ /* synthetic */ C8770Fk9 AXc(AbstractC6806EaH abstractC6806EaH, float f) {
        boolean z = false;
        if (abstractC6806EaH.A0C() == C79.A00) {
            z = true;
            abstractC6806EaH.A0F();
        }
        float fA09 = (float) abstractC6806EaH.A09();
        float fA092 = (float) abstractC6806EaH.A09();
        while (abstractC6806EaH.A0L()) {
            abstractC6806EaH.A0K();
        }
        if (z) {
            abstractC6806EaH.A0H();
        }
        C8770Fk9 c8770Fk9 = new C8770Fk9();
        c8770Fk9.A00 = (fA09 / 100.0f) * f;
        c8770Fk9.A01 = (fA092 / 100.0f) * f;
        return c8770Fk9;
    }
}
