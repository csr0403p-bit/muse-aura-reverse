package X;

/* loaded from: classes6.dex */
public final class G7O extends AbstractC9230G7l {
    public final G72 A00;

    public G7O(ADq aDq, C9236G7r c9236G7r, G7Y g7y, int i, int i2) {
        G72 g72;
        super(new C9233G7o(c9236G7r), g7y);
        int i3 = c9236G7r.A00;
        AII aiiA17 = AIM.A17();
        int i4 = aDq.A00;
        int i5 = aDq.A01;
        int i6 = i3 + i5 + 1;
        ADq aDqA1C = AbstractC7607F5u.A1C(i4 + i3, i6);
        G72 g722 = AbstractC9205G6l.A01;
        aiiA17.add(new G7A(aDqA1C, g722));
        if (i6 != i) {
            aiiA17.add(new G7A(AbstractC7607F5u.A1C(i6, i), AbstractC9205G6l.A00));
        }
        if (i != i2) {
            aiiA17.add(new G7A(AbstractC7607F5u.A1C(i, i2), g722));
        }
        c9236G7r.A01.addAll(AIM.A18(aiiA17));
        switch ((i5 - i4) + 1) {
            case 1:
                g72 = AbstractC9206G6m.A00;
                break;
            case 2:
                g72 = AbstractC9206G6m.A01;
                break;
            case 3:
                g72 = AbstractC9206G6m.A02;
                break;
            case 4:
                g72 = AbstractC9206G6m.A03;
                break;
            case 5:
                g72 = AbstractC9206G6m.A04;
                break;
            default:
                g72 = AbstractC9206G6m.A05;
                break;
        }
        this.A00 = g72;
    }
}
