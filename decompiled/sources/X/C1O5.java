package X;

/* renamed from: X.1O5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1O5 {
    public static final BRg A00(final InterfaceC1072AWd interfaceC1072AWd, BRg bRg, boolean z) {
        return bRg.then(z ? new Ab8<Aen>(interfaceC1072AWd) { // from class: X.3XP
            public final InterfaceC1072AWd A00;

            @Override // X.Ab8
            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C3XP) && C7384Etj.areEqual(this.A00, ((C3XP) obj).A00));
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                return new Aen(this.A00, null, 1);
            }

            @Override // X.Ab8
            public final int hashCode() {
                InterfaceC1072AWd interfaceC1072AWd2 = this.A00;
                if (interfaceC1072AWd2 != null) {
                    return interfaceC1072AWd2.hashCode();
                }
                return 0;
            }

            @Override // X.Ab8
            public final void inspectableProperties(ASF asf) {
                asf.A01 = "focusable";
                BHD bhd = asf.A02;
                bhd.A01("enabled", AnonymousClass001.A0i());
                bhd.A01("interactionSource", this.A00);
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                ((Aen) abstractC1439Aj8).A0I(this.A00);
            }

            {
                this.A00 = interfaceC1072AWd;
            }
        } : BRg.A00);
    }
}
