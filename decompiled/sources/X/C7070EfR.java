package X;

/* renamed from: X.EfR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7070EfR implements InterfaceC7034Eeg {
    public static final InterfaceC7034Eeg A03;
    public int A00;
    public boolean A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7070EfR) {
                C7070EfR c7070EfR = (C7070EfR) obj;
                if (this.A00 != c7070EfR.A00 || this.A02 != c7070EfR.A02 || this.A01 != c7070EfR.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 ^ (this.A02 ? 4194304 : 0)) ^ (this.A01 ? 8388608 : 0);
    }

    static {
        C7070EfR c7070EfR = new C7070EfR();
        c7070EfR.A00 = Integer.MAX_VALUE;
        c7070EfR.A02 = true;
        c7070EfR.A01 = true;
        A03 = c7070EfR;
    }
}
