package X;

/* renamed from: X.AHw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0920AHw<T> {
    public boolean A00;
    public final String A01;
    public final G0V<T, T, T> A02;

    public C0920AHw(String str) {
        this(str, new BUR(28));
        this.A00 = true;
    }

    public static C0920AHw A00(String str) {
        return new C0920AHw(str, new BUR(28));
    }

    public static C0920AHw A01(String str, G0V g0v, boolean z) {
        C0920AHw c0920AHw = new C0920AHw(str, g0v);
        c0920AHw.A00 = z;
        return c0920AHw;
    }

    public final String toString() {
        return FGI.A0M("AccessibilityKey: ", this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0920AHw(String str, G0V<? super T, ? super T, ? extends T> g0v) {
        this.A01 = str;
        this.A02 = g0v;
    }
}
