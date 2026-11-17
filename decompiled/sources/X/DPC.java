package X;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DPC {
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void A00(InterfaceC5023DOs<K, V> multimap, ObjectInputStream stream, int distinctKeys) throws IOException {
        for (int i = 0; i < distinctKeys; i++) {
            Collection collectionAC1 = multimap.AC1(stream.readObject());
            int i2 = stream.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                collectionAC1.add(stream.readObject());
            }
        }
    }

    public static <K, V> void A01(InterfaceC5023DOs<K, V> multimap, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multimap.A4n().size());
        Iterator itA0n = AnonymousClass002.A0n(multimap.A4n());
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            stream.writeObject(entryA0l.getKey());
            stream.writeInt(((Collection) entryA0l.getValue()).size());
            Iterator it = ((Collection) entryA0l.getValue()).iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    public static <E> void A02(InterfaceC5026DPa<E> interfaceC5026DPa, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(interfaceC5026DPa.entrySet().size());
        for (DPD dpd : interfaceC5026DPa.entrySet()) {
            objectOutputStream.writeObject(dpd.A01());
            objectOutputStream.writeInt(dpd.A00());
        }
    }
}
