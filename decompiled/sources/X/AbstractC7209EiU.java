package X;

/* renamed from: X.EiU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7209EiU<T> implements InterfaceC7248EjS<T> {
    public abstract void onFailureImpl(InterfaceC7236Ej0<T> interfaceC7236Ej0);

    public abstract void onNewResultImpl(InterfaceC7236Ej0<T> interfaceC7236Ej0);

    public void onCancellation(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
    }

    @Override // X.InterfaceC7248EjS
    public void onFailure(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        try {
            onFailureImpl(interfaceC7236Ej0);
        } finally {
            interfaceC7236Ej0.A6Q();
        }
    }

    @Override // X.InterfaceC7248EjS
    public void onNewResult(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        boolean zAOQ = interfaceC7236Ej0.AOQ();
        try {
            onNewResultImpl(interfaceC7236Ej0);
        } finally {
            if (zAOQ) {
                interfaceC7236Ej0.A6Q();
            }
        }
    }

    @Override // X.InterfaceC7248EjS
    public void onProgressUpdate(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
    }
}
