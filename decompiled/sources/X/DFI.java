package X;

import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class DFI extends AH7 implements RandomAccess {
    public final int $t;
    public final Object A00;

    public DFI(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.$t != 0 ? ((int[]) this.A00).length : ((byte[]) this.A00).length;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (this.$t != 0) {
            if (obj instanceof Integer) {
                return BFI.A0L((int[]) this.A00, AnonymousClass001.A0F(obj));
            }
            return false;
        }
        if (!(obj instanceof Byte)) {
            return false;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = (byte[]) this.A00;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bByteValue == bArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.$t != 0 ? Integer.valueOf(((int[]) this.A00)[i]) : Byte.valueOf(((byte[]) this.A00)[i]);
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (this.$t != 0) {
            if (obj instanceof Integer) {
                int iA0F = AnonymousClass001.A0F(obj);
                int[] iArr = (int[]) this.A00;
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    if (iA0F == iArr[i]) {
                        return i;
                    }
                }
            }
        } else if (obj instanceof Byte) {
            byte bByteValue = ((Number) obj).byteValue();
            byte[] bArr = (byte[]) this.A00;
            int length2 = bArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (bByteValue == bArr[i2]) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean isEmpty() {
        return this.$t != 0 ? ((int[]) this.A00).length == 0 : ((byte[]) this.A00).length == 0;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        int i2;
        if (this.$t != 0) {
            if (obj instanceof Integer) {
                int iA0F = AnonymousClass001.A0F(obj);
                int[] iArr = (int[]) this.A00;
                int length = iArr.length - 1;
                if (length >= 0) {
                    do {
                        i2 = length - 1;
                        if (iA0F == iArr[length]) {
                            return length;
                        }
                        length = i2;
                    } while (i2 >= 0);
                }
            }
        } else if (obj instanceof Byte) {
            byte bByteValue = ((Number) obj).byteValue();
            byte[] bArr = (byte[]) this.A00;
            int length2 = bArr.length - 1;
            if (length2 >= 0) {
                do {
                    i = length2 - 1;
                    if (bByteValue == bArr[length2]) {
                        return length2;
                    }
                    length2 = i;
                } while (i >= 0);
            }
        }
        return -1;
    }
}
