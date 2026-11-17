package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.A6n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0866A6n implements Externalizable {
    public static final long serialVersionUID = 0;
    public Collection<?> collection;
    public final int tag;

    /* JADX WARN: Type inference failed for: r0v6, types: [E[], java.lang.Object[]] */
    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection<?> collectionA18;
        C7384Etj.A0Y(objectInput, 0);
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(FGI.A0G("Unsupported flags value: ", '.', b));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(FGI.A0G("Illegal size value: ", '.', i2));
        }
        int i3 = 0;
        if (i == 0) {
            AII aii = new AII();
            aii.backing = new Object[i2];
            while (i3 < i2) {
                aii.add(objectInput.readObject());
                i3++;
            }
            collectionA18 = AIM.A18(aii);
        } else {
            if (i != 1) {
                throw new InvalidObjectException(FGI.A0G("Unsupported collection type tag: ", '.', i));
            }
            AIY aiy = AIY.A00;
            AIY aiy2 = new AIY(new C0924AIa(i2));
            while (i3 < i2) {
                aiy2.add(objectInput.readObject());
                i3++;
            }
            collectionA18 = AIX.A00(aiy2);
        }
        this.collection = collectionA18;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C7384Etj.A0Y(objectOutput, 0);
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    private final Object readResolve() {
        return this.collection;
    }

    public C0866A6n(Collection<?> collection, int i) {
        this.collection = collection;
        this.tag = i;
    }

    public C0866A6n() {
        this(C0881AGi.A00, 0);
    }
}
