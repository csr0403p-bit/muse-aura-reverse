package X;

/* loaded from: classes6.dex */
public final class HAs implements HAy {
    public String A00;
    public boolean A01;

    @Override // X.HAy
    public final boolean AQK(HB2 hb2, HB4 hb4) {
        String strA00 = (this.A01 && this.A00 == null) ? hb4.A00() : this.A00;
        HB7 hb7 = ((HB3) hb4).A00;
        if (hb7 != null) {
            int i = 0;
            for (HB3 hb3 : hb7.ADb()) {
                if (strA00 == null || hb3.A00().equals(strA00)) {
                    i++;
                }
            }
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return this.A01 ? String.format("only-of-type <%s>", this.A00) : String.format("only-child", new Object[0]);
    }
}
