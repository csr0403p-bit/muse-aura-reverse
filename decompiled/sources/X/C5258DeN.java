package X;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.DeN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5258DeN<K, V> {
    public final InterfaceC5264DeT<K, V> A00;
    public final WeakHashMap<K, WeakReference<V>> A01 = new WeakHashMap<>(16);

    /* JADX WARN: Multi-variable type inference failed */
    public C5258DeN(InterfaceC5264DeT<K, ? extends V> interfaceC5264DeT) {
        this.A00 = interfaceC5264DeT;
    }
}
