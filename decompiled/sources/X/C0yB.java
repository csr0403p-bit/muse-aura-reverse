package X;

/* renamed from: X.0yB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0yB {
    public static final AKH<InterfaceC05011Yg> A00 = AnonymousClass002.A0L(new C3bN(0));

    public static final BRg A00(InterfaceC05011Yg interfaceC05011Yg, final C0dy c0dy, BRg bRg) {
        if (!(interfaceC05011Yg instanceof C3UH)) {
            return AxM.A02(bRg, AbstractC2139Az7.A00, new C3bV(0, interfaceC05011Yg, c0dy));
        }
        final C3UH c3uh = (C3UH) interfaceC05011Yg;
        return bRg.then(new Ab8<C3UI>(c3uh, c0dy) { // from class: X.3UG
            public final C3UH A00;
            public final C0dy A01;

            @Override // X.Ab8
            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C3UG) {
                        C3UG c3ug = (C3UG) obj;
                        if (!C7384Etj.areEqual(this.A01, c3ug.A01) || !C7384Etj.areEqual(this.A00, c3ug.A00)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                C1Z3 c1z3Create = this.A00.create(this.A01);
                C3UI c3ui = new C3UI();
                c3ui.A00 = c1z3Create;
                c3ui.A0G(c1z3Create);
                return c3ui;
            }

            @Override // X.Ab8
            public final int hashCode() {
                return AnonymousClass005.A0E(this.A01) + this.A00.hashCode();
            }

            @Override // X.Ab8
            public final void inspectableProperties(ASF asf) {
                asf.A01 = "indication";
                BHD bhd = asf.A02;
                bhd.A01("interactionSource", this.A01);
                bhd.A01("indication", this.A00);
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                C3UI c3ui = (C3UI) abstractC1439Aj8;
                C1Z3 c1z3Create = this.A00.create(this.A01);
                c3ui.A0H(c3ui.A00);
                c3ui.A00 = c1z3Create;
                c3ui.A0G(c1z3Create);
            }

            {
                this.A01 = c0dy;
                this.A00 = c3uh;
            }
        });
    }
}
