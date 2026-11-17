package X;

/* renamed from: X.Col, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4177Col extends AbstractC4348Ctq {
    public final C4232Cqg A00;
    public final CSE A01;
    public final InterfaceC4457CwZ A02;

    public C4177Col(InterfaceC4457CwZ interfaceC4457CwZ, C4232Cqg c4232Cqg, CSE cse, int i) {
        super(i);
        this.A01 = cse;
        this.A00 = c4232Cqg;
        this.A02 = interfaceC4457CwZ;
        if (i == 2 && c4232Cqg.A01) {
            throw C60O.A0i("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
