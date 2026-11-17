package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Eix, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7233Eix<T> implements InterfaceC7248EjS<T> {
    public final /* synthetic */ C7229Eit A00;

    public C7233Eix(C7229Eit c7229Eit) {
        this.A00 = c7229Eit;
    }

    @Override // X.InterfaceC7248EjS
    public final void onProgressUpdate(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        C7229Eit c7229Eit = this.A00;
        if (interfaceC7236Ej0 == c7229Eit.A00) {
            c7229Eit.A04(interfaceC7236Ej0.getProgress());
        }
    }

    @Override // X.InterfaceC7248EjS
    public final void onFailure(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
    }

    @Override // X.InterfaceC7248EjS
    public final void onNewResult(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        if (!interfaceC7236Ej0.ANI()) {
            synchronized (interfaceC7236Ej0) {
            }
            return;
        }
        C7229Eit c7229Eit = this.A00;
        if (interfaceC7236Ej0 == c7229Eit.A00) {
            c7229Eit.A06(null, ((AbstractC7206EiO) interfaceC7236Ej0).A04, false);
        }
    }
}
