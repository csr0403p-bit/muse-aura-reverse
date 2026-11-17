package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G78 extends G75 {
    public final int A00;
    public final List<ADq> A01;
    public final /* synthetic */ G7B A02;

    public final G78 A08() {
        int size;
        int i = this.A00;
        List<ADq> list = this.A01;
        if (i >= list.size()) {
            return this;
        }
        int i2 = super.A00;
        int i3 = list.get(i).A01;
        G7B g7b = this.A02;
        if (i2 == i3) {
            i++;
            C0968AJv c0968AJv = (C0968AJv) AbstractC0878AGe.A0A(i, list);
            size = c0968AJv != null ? c0968AJv.A00 : ((G74) g7b).A02.size();
        } else {
            size = i2 + 1;
        }
        return new G78(list, g7b, i, size);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public G78(List list, List<ADq> list2) {
        C0968AJv c0968AJv = (C0968AJv) AbstractC0878AGe.A0G(list);
        this(list, list2, 0, c0968AJv != null ? c0968AJv.A00 : -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G78(List list, List<ADq> list2, int i, int i2) {
        super(list2, i2);
        this.A02 = list2;
        this.A01 = list;
        this.A00 = i;
    }
}
