package X;

/* renamed from: X.G7l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9230G7l {
    public int A00 = -2;
    public C9231G7m A01;
    public final C9233G7o A02;
    public final G7Y A03;

    public static boolean A05(G7T g7t) {
        return g7t.A02 == -1;
    }

    public static int A02(G7T g7t) {
        return g7t.A02;
    }

    public final G72 A06() {
        if (this instanceof G7G) {
            return ((G7G) this).A00;
        }
        if (this instanceof C9219G7a) {
            return AbstractC9206G6m.A0O;
        }
        if (!(this instanceof G7X)) {
            return this instanceof C9224G7f ? AbstractC9206G6m.A0L : this instanceof C9234G7p ? AbstractC9206G6m.A0G : this instanceof G7P ? AbstractC9206G6m.A0D : this instanceof C9239G7u ? AbstractC9205G6l.A0K : this instanceof G7M ? AbstractC9206G6m.A09 : this instanceof G7N ? AbstractC9206G6m.A08 : this instanceof C9226G7h ? AbstractC9206G6m.A07 : this instanceof G7O ? ((G7O) this).A00 : this instanceof G7F ? AbstractC9212G6s.A06 : AbstractC9212G6s.A00;
        }
        char c = ((G7X) this).A00;
        return (c == '-' || c == '*' || c == '+') ? AbstractC9206G6m.A0T : AbstractC9206G6m.A0N;
    }

    public AbstractC9230G7l(C9233G7o c9233G7o, G7Y g7y) {
        this.A03 = g7y;
        this.A02 = c9233G7o;
    }

    public static int A03(G7T g7t) {
        return g7t.A01();
    }

    public static int A04(G7T g7t) {
        Integer numA03 = g7t.A03();
        if (numA03 != null) {
            return numA03.intValue();
        }
        return -1;
    }
}
