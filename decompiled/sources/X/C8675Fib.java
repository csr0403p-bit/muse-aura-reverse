package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Fib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8675Fib {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final C6837Eap A09;
    public final C8689Fip A0A;
    public final C8690Fiq A0B;
    public final C8695Fiv A0C;
    public final C8728FjT A0D;
    public final C8791FkV A0E;
    public final C8778FkI A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final List<C8725FjQ<Float>> A0L;
    public final List<C8693Fit> A0M;
    public final List<InterfaceC8696Fiw> A0N;
    public final boolean A0O;

    public final String toString() {
        return A00("");
    }

    public C8675Fib(C6837Eap c6837Eap, C8689Fip c8689Fip, C8690Fiq c8690Fiq, C8695Fiv c8695Fiv, C8728FjT c8728FjT, C8791FkV c8791FkV, C8778FkI c8778FkI, Integer num, Integer num2, Integer num3, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0N = list;
        this.A09 = c6837Eap;
        this.A0J = str;
        this.A07 = j;
        this.A0H = num;
        this.A08 = j2;
        this.A0K = str2;
        this.A0M = list2;
        this.A0D = c8728FjT;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = c8690Fiq;
        this.A0C = c8695Fiv;
        this.A0L = list3;
        this.A0I = num2;
        this.A0A = c8689Fip;
        this.A0O = z;
        this.A0E = c8791FkV;
        this.A0F = c8778FkI;
        this.A0G = num3;
    }

    public final String A00(String str) {
        int i;
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(this.A0J);
        sbA0g.append(PairsDiscretionDocument.TERMINATOR);
        C6837Eap c6837Eap = this.A09;
        C8675Fib c8675FibA04 = c6837Eap.A06.A04(this.A08);
        if (c8675FibA04 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sbA0g.append(str2);
                sbA0g.append(c8675FibA04.A0J);
                c8675FibA04 = c6837Eap.A06.A04(c8675FibA04.A08);
                if (c8675FibA04 == null) {
                    break;
                }
                str2 = "->";
            }
            sbA0g.append(str);
            sbA0g.append(PairsDiscretionDocument.TERMINATOR);
        }
        List<C8693Fit> list = this.A0M;
        if (!list.isEmpty()) {
            sbA0g.append(str);
            sbA0g.append("\tMasks: ");
            sbA0g.append(list.size());
            sbA0g.append(PairsDiscretionDocument.TERMINATOR);
        }
        int i2 = this.A06;
        if (i2 != 0 && (i = this.A05) != 0) {
            sbA0g.append(str);
            sbA0g.append("\tBackground: ");
            sbA0g.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.A04)));
        }
        List<InterfaceC8696Fiw> list2 = this.A0N;
        if (!list2.isEmpty()) {
            sbA0g.append(str);
            sbA0g.append("\tShapes:\n");
            for (InterfaceC8696Fiw interfaceC8696Fiw : list2) {
                sbA0g.append(str);
                sbA0g.append("\t\t");
                sbA0g.append(interfaceC8696Fiw);
                sbA0g.append(PairsDiscretionDocument.TERMINATOR);
            }
        }
        return sbA0g.toString();
    }
}
