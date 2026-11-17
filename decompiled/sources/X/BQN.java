package X;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class BQN {
    /* JADX WARN: Incorrect types in method signature: <VM:LX/AEs;>(LX/BOD;LX/9uG<TVM;>;Ljava/lang/String;LX/9ui;LX/A6J;)TVM; */
    public static final AEs A00(InterfaceC08439ui interfaceC08439ui, BOD bod, A6J a6j, String str, C9uG c9uG) {
        BON bon;
        if (interfaceC08439ui != null) {
            bon = BON.A00(interfaceC08439ui, bod.getViewModelStore(), a6j);
        } else if (bod instanceof BRk) {
            bon = BON.A00(((BRk) bod).getDefaultViewModelProviderFactory(), bod.getViewModelStore(), a6j);
        } else {
            C7384Etj.A0Y(bod, 0);
            bon = new BON(BOk.A00, bod.getViewModelStore(), A6K.A00);
        }
        return str != null ? bon.A00.A00(str, c9uG) : bon.A02(c9uG);
    }
}
