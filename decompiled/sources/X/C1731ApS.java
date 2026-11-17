package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.ApS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1731ApS implements Appendable {
    public final StringBuilder A00;
    public final List<C1732ApT<? extends C1OS>> A01;
    public final List<C1732ApT<? extends Object>> A02;
    public final C1735ApW A03;

    public static int A00(C1731ApS c1731ApS, Object obj) {
        C1732ApT<? extends C1OS> c1732ApT = new C1732ApT<>(obj, "", c1731ApS.A00.length(), Integer.MIN_VALUE);
        c1731ApS.A02.add(c1732ApT);
        c1731ApS.A01.add(c1732ApT);
        return r1.size() - 1;
    }

    public final ApQ A04() {
        StringBuilder sb = this.A00;
        String string = sb.toString();
        List<C1732ApT<? extends C1OS>> list = this.A01;
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayListA0t.add(list.get(i).A01(sb.length()));
        }
        return new ApQ(string, arrayListA0t);
    }

    public final void A05() {
        List<C1732ApT<? extends Object>> list = this.A02;
        if (list.isEmpty()) {
            throw C3cG.A0Q("Nothing to pop.");
        }
        list.remove(C60O.A00(list)).A00 = this.A00.length();
    }

    public final void A06(int i) {
        List<C1732ApT<? extends Object>> list = this.A02;
        if (i >= list.size()) {
            throw C3cG.A0Q(FGI.A07(i, list.size(), " should be less than "));
        }
        while (list.size() - 1 >= i) {
            A05();
        }
    }

    public final void A07(ApQ apQ) {
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(apQ.A00);
        List<C1733ApU<? extends C1OS>> list = apQ.A01;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1733ApU c1733ApUA0c = C8j4.A0c(list, i);
                List<C1732ApT<? extends C1OS>> list2 = this.A01;
                C1732ApT.A00(c1733ApUA0c.A02, c1733ApUA0c.A03, list2, c1733ApUA0c.A01 + length, c1733ApUA0c.A00 + length);
            }
        }
    }

    public final void A08(ApQ apQ, int i, int i2) {
        List<C1733ApU<? extends C1OS>> list;
        StringBuilder sb = this.A00;
        int length = sb.length();
        String str = apQ.A00;
        sb.append((CharSequence) str, i, i2);
        ApQ apQ2 = AbstractC1730ApR.A00;
        if (i == i2 || (list = apQ.A01) == null) {
            return;
        }
        if (i != 0 || i2 < str.length()) {
            ArrayList arrayListA0t = C60Q.A0t(list);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1733ApU c1733ApUA0c = C8j4.A0c(list, i3);
                if (AbstractC1730ApR.A00(i, i2, c1733ApUA0c.A01, c1733ApUA0c.A00)) {
                    arrayListA0t.add(new C1733ApU(c1733ApUA0c.A02, c1733ApUA0c.A03, ATD.A04(c1733ApUA0c.A01, i, i2) - i, ATD.A04(c1733ApUA0c.A00, i, i2) - i));
                }
            }
            list = arrayListA0t;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1733ApU c1733ApUA0c2 = C8j4.A0c(list, i4);
            C1732ApT.A00(c1733ApUA0c2.A02, c1733ApUA0c2.A03, this.A01, c1733ApUA0c2.A01 + length, c1733ApUA0c2.A00 + length);
        }
    }

    public final void A09(C1818Arh c1818Arh, int i, int i2) {
        C1732ApT.A00(c1818Arh, "", this.A01, i, i2);
    }

    public final void A0A(C1824Aro c1824Aro, int i, int i2) {
        C1732ApT.A00(c1824Aro, "", this.A01, i, i2);
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
    public final void A0B(C1OR c1or, int i, int i2) {
        C1732ApT.A00(c1or, "", this.A01, i, i2);
    }

    public final void A0C(CharSequence charSequence) {
        if (charSequence instanceof ApQ) {
            A07((ApQ) charSequence);
        } else {
            this.A00.append(charSequence);
        }
    }

    public final void A0D(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof ApQ) {
            A08((ApQ) charSequence, i, i2);
        } else {
            this.A00.append(charSequence, i, i2);
        }
    }

    public final void A0E(String str) {
        this.A00.append(str);
    }

    public final void A0F(String str, String str2) {
        C1732ApT<? extends C1OS> c1732ApT = new C1732ApT<>(new C1734ApV(str2), str, this.A00.length(), Integer.MIN_VALUE);
        List<C1732ApT<? extends Object>> list = this.A02;
        list.add(c1732ApT);
        this.A01.add(c1732ApT);
        list.size();
    }

    public final void A0G(String str, String str2, int i, int i2) {
        C1732ApT.A00(new C1734ApV(str2), str, this.A01, i, i2);
    }

    public C1731ApS(int i) {
        this.A00 = new StringBuilder(i);
        this.A02 = C3cG.A0h();
        this.A01 = C3cG.A0h();
        this.A03 = new C1735ApW(this);
    }

    public final int A01(AbstractC1699Aoe abstractC1699Aoe) {
        return A00(this, abstractC1699Aoe);
    }

    public final int A02(C1824Aro c1824Aro) {
        return A00(this, c1824Aro);
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
    public final int A03(C1OR c1or) {
        return A00(this, c1or);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        A0D(charSequence, i, i2);
        return this;
    }

    public C1731ApS() {
        this(16);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        A0C(charSequence);
        return this;
    }
}
