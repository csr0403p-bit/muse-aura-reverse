package X;

/* renamed from: X.GoQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10046GoQ {
    ANY,
    NATURAL,
    SCALAR,
    ARRAY,
    OBJECT,
    NUMBER,
    NUMBER_FLOAT,
    NUMBER_INT,
    STRING,
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN,
    BINARY;

    public final boolean A00() {
        return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
    }
}
