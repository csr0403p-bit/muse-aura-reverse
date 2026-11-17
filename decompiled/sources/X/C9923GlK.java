package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: X.GlK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9923GlK implements Externalizable, Serializable {
    public static final long serialVersionUID = 1;
    public byte[] json;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if ((r9 & (-65281)) == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object readResolve() throws java.lang.IllegalAccessException, java.io.CharConversionException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9923GlK.readResolve():java.lang.Object");
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i;
        byte[] bArrA05;
        int i2 = objectInput.readInt();
        if (i2 <= 100000) {
            bArrA05 = new byte[i2];
            objectInput.readFully(bArrA05, 0, i2);
        } else {
            C9964Gmb c9964Gmb = new C9964Gmb(100000);
            try {
                c9964Gmb.A01();
                byte[] bArr = c9964Gmb.A01;
                loop0: while (true) {
                    i = 0;
                    do {
                        int iMin = Math.min(bArr.length - i, i2);
                        objectInput.readFully(bArr, 0, iMin);
                        i2 -= iMin;
                        i += iMin;
                        if (i2 == 0) {
                            break loop0;
                        }
                    } while (i != bArr.length);
                    C9964Gmb.A00(c9964Gmb);
                    bArr = c9964Gmb.A01;
                }
                c9964Gmb.A00 = i;
                bArrA05 = c9964Gmb.A05();
            } finally {
            }
        }
        this.json = bArrA05;
    }
}
