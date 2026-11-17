package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public interface E8d<K, V> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/ref/ReferenceQueue<TV;>;TV;LX/E8b<TK;TV;>;)LX/E8d<TK;TV;>; */
    E8d A7M(E8b queue, Object value, ReferenceQueue entry);

    E8b<K, V> AFG();

    int AMk();

    V get();

    boolean isActive();
}
