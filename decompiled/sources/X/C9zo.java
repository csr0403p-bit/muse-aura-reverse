package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* renamed from: X.9zo, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9zo implements Externalizable {
    public static final long serialVersionUID = 0;
    public long mostSignificantBits = 0;
    public long leastSignificantBits = 0;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        C7384Etj.A0Y(objectInput, 0);
        this.mostSignificantBits = objectInput.readLong();
        this.leastSignificantBits = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C7384Etj.A0Y(objectOutput, 0);
        objectOutput.writeLong(this.mostSignificantBits);
        objectOutput.writeLong(this.leastSignificantBits);
    }

    private final Object readResolve() {
        long j = this.mostSignificantBits;
        long j2 = this.leastSignificantBits;
        return (j == 0 && j2 == 0) ? C9zn.A00 : new C9zn(j, j2);
    }
}
