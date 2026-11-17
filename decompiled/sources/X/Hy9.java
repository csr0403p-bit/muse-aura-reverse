package X;

/* loaded from: classes6.dex */
public abstract class Hy9 {
    public static Hy9 A00(Appendable appendable) {
        return appendable instanceof StringBuilder ? new C10613Hyu((StringBuilder) appendable) : new C6977EdZ(appendable);
    }

    public void A01(char c) {
        ((C10613Hyu) this).A00.append(c);
    }

    public void A02(CharSequence charSequence) {
        ((C10613Hyu) this).A00.append(charSequence);
    }

    public void A03(char[] cArr, int i, int i2) {
        ((C10613Hyu) this).A00.append(cArr, i, i2);
    }
}
