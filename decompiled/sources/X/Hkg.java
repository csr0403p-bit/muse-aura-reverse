package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class Hkg {
    public final String A00;
    public final String A01;
    public final List<String> A02;
    public final List<String> A03;

    /* JADX WARN: Illegal instructions before constructor call */
    public Hkg() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, c0881AGi, null);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;)V */
    public Hkg(String str, List list, List list2, String str2) {
        boolean zA1Y = C60P.A1Y(list, list2);
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str;
        this.A00 = str2;
        if (str2 != null && list.size() + list2.size() != zA1Y) {
            throw C60O.A0i("A dynamic product token belongs to exactly one product");
        }
    }
}
