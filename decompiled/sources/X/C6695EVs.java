package X;

import java.util.Observable;

/* renamed from: X.EVs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6695EVs extends Observable {
    @Override // java.util.Observable
    public final void notifyObservers(Object obj) {
        super.setChanged();
        super.notifyObservers(obj);
    }
}
