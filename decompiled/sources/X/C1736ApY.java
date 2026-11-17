package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.ApY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1736ApY implements Comparable<C1736ApY> {
    public static final C1736ApY A01;
    public static final C1736ApY A02;
    public static final C1736ApY A03;
    public static final C1736ApY A04;
    public static final C1736ApY A05;
    public static final C1736ApY A06;
    public static final C1736ApY A07;
    public static final C1736ApY A08;
    public static final C1736ApY A09;
    public static final C1736ApY A0A;
    public static final C1736ApY A0B;
    public static final C1736ApY A0C;
    public static final C1736ApY A0D;
    public static final C1736ApY A0E;
    public static final C1736ApY A0F;
    public static final C1736ApY A0G;
    public static final C1736ApY A0H;
    public static final C1736ApY A0I;
    public static final List<C1736ApY> A0J;
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1736ApY) && this.A00 == ((C1736ApY) obj).A00);
    }

    static {
        C1736ApY c1736ApY = new C1736ApY(100);
        A0D = c1736ApY;
        C1736ApY c1736ApY2 = new C1736ApY(200);
        A0E = c1736ApY2;
        C1736ApY c1736ApY3 = new C1736ApY(300);
        A0F = c1736ApY3;
        C1736ApY c1736ApY4 = new C1736ApY(400);
        A06 = c1736ApY4;
        C1736ApY c1736ApY5 = new C1736ApY(500);
        A07 = c1736ApY5;
        C1736ApY c1736ApY6 = new C1736ApY(600);
        A08 = c1736ApY6;
        C1736ApY c1736ApY7 = new C1736ApY(700);
        A0G = c1736ApY7;
        C1736ApY c1736ApY8 = new C1736ApY(800);
        A0H = c1736ApY8;
        C1736ApY c1736ApY9 = new C1736ApY(900);
        A0I = c1736ApY9;
        A0C = c1736ApY;
        A0B = c1736ApY2;
        A02 = c1736ApY3;
        A04 = c1736ApY4;
        A03 = c1736ApY5;
        A05 = c1736ApY6;
        A01 = c1736ApY7;
        A0A = c1736ApY8;
        A09 = c1736ApY9;
        A0J = Arrays.asList(c1736ApY, c1736ApY2, c1736ApY3, c1736ApY4, c1736ApY5, c1736ApY6, c1736ApY7, c1736ApY8, c1736ApY9);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C1736ApY c1736ApY) {
        return C7384Etj.A00(this.A00, c1736ApY.A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C8j4.A0w("FontWeight(weight=", this.A00);
    }

    public C1736ApY(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw C60O.A0i(FGI.A0H("Font weight can be in range [1, 1000]. Current value: ", i));
        }
    }
}
