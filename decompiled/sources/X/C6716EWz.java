package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.EWz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6716EWz extends Number {
    public final String value;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return EX0.A00(this.value);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6716EWz) {
            return this.value.equals(((C6716EWz) obj).value);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    @Override // java.lang.Number
    public final int intValue() throws NumberFormatException {
        try {
            try {
                this = Integer.parseInt(this.value);
                return this;
            } catch (NumberFormatException unused) {
                this = (int) Long.parseLong(this.value);
                return this;
            }
        } catch (NumberFormatException unused2) {
            return EX0.A00(this.value).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return EX0.A00(this.value).longValue();
        }
    }

    public final String toString() {
        return this.value;
    }

    public C6716EWz(String str) {
        this.value = str;
    }
}
