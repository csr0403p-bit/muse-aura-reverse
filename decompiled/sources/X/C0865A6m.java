package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.A6m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0865A6m implements Externalizable {
    public static final long serialVersionUID = 0;
    public Map<?, ?> map = C9jH.A00;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        C7384Etj.A0Y(objectInput, 0);
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(FGI.A0H("Unsupported flags value: ", b));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException(FGI.A0G("Illegal size value: ", '.', i));
        }
        C0924AIa c0924AIa = new C0924AIa(i);
        for (int i2 = 0; i2 < i; i2++) {
            c0924AIa.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = AIW.A0K(c0924AIa);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C7384Etj.A0Y(objectOutput, 0);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        Iterator itA0n = AnonymousClass002.A0n(this.map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            objectOutput.writeObject(entryA0l.getKey());
            objectOutput.writeObject(entryA0l.getValue());
        }
    }

    private final Object readResolve() {
        return this.map;
    }
}
