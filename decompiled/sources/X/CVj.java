package X;

/* loaded from: classes5.dex */
public final class CVj implements InterfaceC3585CVk<C3581CVc> {
    public final DQZ<Class<? extends AbstractC3582CVd<?>>, InterfaceC3585CVk<?>> A00 = new DQZ<>(0);

    @Override // X.InterfaceC3585CVk
    public final /* bridge */ /* synthetic */ void Ab5(AbstractC3582CVd abstractC3582CVd, DMN dmn) {
        C3581CVc c3581CVc = (C3581CVc) abstractC3582CVd;
        C7384Etj.A0Y(c3581CVc, 0);
        DQZ<Class<? extends AbstractC3582CVd<?>>, InterfaceC3585CVk<?>> dqz = this.A00;
        int size = dqz.size();
        for (int i = 0; i < size; i++) {
            Class<? extends AbstractC3582CVd<?>> clsA05 = dqz.A05(i);
            if (c3581CVc.A04(clsA05)) {
                AbstractC3582CVd abstractC3582CVdA03 = c3581CVc.A03(clsA05);
                C7384Etj.A0U(abstractC3582CVdA03);
                InterfaceC3585CVk<?> interfaceC3585CVk = dqz.get(clsA05);
                if (interfaceC3585CVk == null) {
                    throw BV4.A0U();
                }
                interfaceC3585CVk.Ab5(abstractC3582CVdA03, dmn);
            }
        }
    }
}
