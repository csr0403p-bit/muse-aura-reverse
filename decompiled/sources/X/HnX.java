package X;

import android.graphics.PointF;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class HnX implements InterfaceC10514HoR<C10447Hid> {
    public static final HnX A00 = new HnX();
    public static final C6823Eab A01 = C6823Eab.A00("c", HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, "i", "o");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.AbstractCollection, java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // X.InterfaceC10514HoR
    public final /* bridge */ /* synthetic */ C10447Hid AXc(AbstractC6806EaH abstractC6806EaH, float f) {
        if (abstractC6806EaH.A0C() == C79.A00) {
            abstractC6806EaH.A0F();
        }
        abstractC6806EaH.A0G();
        ?? A03 = 0;
        ?? A032 = 0;
        ?? A033 = 0;
        boolean zA0M = false;
        while (abstractC6806EaH.A0L()) {
            int iA0B = abstractC6806EaH.A0B(A01);
            if (iA0B == 0) {
                zA0M = abstractC6806EaH.A0M();
            } else if (iA0B == 1) {
                A03 = HwH.A03(abstractC6806EaH, f);
            } else if (iA0B == 2) {
                A032 = HwH.A03(abstractC6806EaH, f);
            } else if (iA0B != 3) {
                abstractC6806EaH.A0J();
                abstractC6806EaH.A0K();
            } else {
                A033 = HwH.A03(abstractC6806EaH, f);
            }
        }
        abstractC6806EaH.A0I();
        if (abstractC6806EaH.A0C() == C79.A01) {
            abstractC6806EaH.A0H();
        }
        if (A03 == 0 || A032 == 0 || A033 == 0) {
            throw C60O.A0i("Shape data was missing information.");
        }
        if (A03.isEmpty()) {
            return new C10447Hid(new PointF(), Collections.EMPTY_LIST, false);
        }
        int size = A03.size();
        PointF pointF = (PointF) A03.get(0);
        ArrayList arrayListA11 = C60O.A11(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) A03.get(i);
            int i2 = i - 1;
            PointF pointF3 = (PointF) A03.get(i2);
            PointF pointF4 = (PointF) A033.get(i2);
            PointF pointF5 = (PointF) A032.get(i);
            PointF pointF6 = AbstractC8699Fiz.A00;
            arrayListA11.add(new HjF(new PointF(pointF3.x + pointF4.x, pointF3.y + pointF4.y), new PointF(pointF2.x + pointF5.x, pointF2.y + pointF5.y), pointF2));
        }
        if (zA0M) {
            PointF pointF7 = (PointF) A03.get(0);
            int i3 = size - 1;
            PointF pointF8 = (PointF) A03.get(i3);
            PointF pointF9 = (PointF) A033.get(i3);
            PointF pointF10 = (PointF) A032.get(0);
            PointF pointF11 = AbstractC8699Fiz.A00;
            arrayListA11.add(new HjF(AbstractC7607F5u.A0W(pointF8, pointF9), AbstractC7607F5u.A0W(pointF7, pointF10), pointF7));
        }
        return new C10447Hid(pointF, arrayListA11, zA0M);
    }
}
