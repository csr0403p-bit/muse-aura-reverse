package X;

/* renamed from: X.EXn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6729EXn extends C06G {
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C6729EXn() {
        this(null, null, null, null, null, null, null);
    }

    public static final C6729EXn A0y(C6729EXn c6729EXn, Integer num, Long l, String str) {
        Integer num2 = num;
        Long l2 = l;
        String str2 = str;
        if (num2 == null) {
            num2 = c6729EXn.A00;
        }
        if (l == null) {
            l2 = c6729EXn.A01;
        }
        if (str == null) {
            str2 = c6729EXn.A05;
        }
        return new C6729EXn(num2, l2, c6729EXn.A04, c6729EXn.A06, c6729EXn.A03, c6729EXn.A02, str2);
    }

    public static void A0z(AbstractC8150FWo abstractC8150FWo, C6729EXn c6729EXn) {
        Long lA0s;
        String str = c6729EXn.A03;
        if (str == null || (lA0s = C9tI.A0s(str)) == null) {
            return;
        }
        abstractC8150FWo.A04("billable_id", lA0s);
    }

    public static void A10(AbstractC8150FWo abstractC8150FWo, C6729EXn c6729EXn) {
        Long lA0s;
        String str = c6729EXn.A06;
        if (str == null || (lA0s = C9tI.A0s(str)) == null) {
            return;
        }
        abstractC8150FWo.A04("quote_id", lA0s);
    }

    public C6729EXn(Integer num, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A00 = num;
        this.A06 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = l;
        this.A05 = str5;
    }
}
