package X;

import com.facebook.aura.widgets.WidgetComponentsKt;

/* loaded from: classes6.dex */
public final class FF2 extends FSJ {
    public int A00;
    public int A01;
    public C7636F7t A02;
    public boolean A03;

    public final void A07(String str) {
        int i = 0;
        if (str != null) {
            i = 1;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i = Integer.MIN_VALUE;
                        break;
                    } else {
                        return;
                    }
                case 100571:
                    if (!str.equals("end")) {
                        return;
                    }
                    break;
                case 109757538:
                    if (str.equals(WidgetComponentsKt.START_PATH)) {
                        this.A01 = -1;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.A01 = i;
    }

    @Override // X.FSJ
    public final int A06(int i, int i2, int i3, int i4, int i5) {
        return this.A01 == Integer.MIN_VALUE ? (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2)) : super.A06(i, i2, i3, i4, i5);
    }

    @Override // X.FSJ, X.AbstractC8094FTa
    public final void A01() {
        super.A01();
        C7636F7t c7636F7t = this.A02;
        if (c7636F7t != null) {
            c7636F7t.A02.A02 = null;
            c7636F7t.A00.A10(new I0J(c7636F7t, 3));
        }
    }
}
