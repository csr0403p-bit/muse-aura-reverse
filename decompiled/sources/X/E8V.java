package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class E8V {
    public static final /* synthetic */ E8V[] A00;
    public static final E8V A01;
    public static final E8V A02;

    static {
        E8V e8v = new E8V() { // from class: X.E8a
        };
        A01 = e8v;
        E8Z e8z = new E8Z();
        E8Y e8y = new E8Y();
        A02 = e8y;
        A00 = new E8V[]{e8v, e8z, e8y};
    }

    public static E8V valueOf(String name) {
        return (E8V) Enum.valueOf(E8V.class, name);
    }

    public static E8V[] values() {
        return (E8V[]) A00.clone();
    }

    public E8V(String $enum$name, int $enum$ordinal) {
    }
}
