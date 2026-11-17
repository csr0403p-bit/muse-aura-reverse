package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.2AB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AB implements C1YA {
    public final /* synthetic */ C2AC A00;
    public final /* synthetic */ LazyListState A01;

    public C2AB(C2AC c2ac, LazyListState lazyListState) {
        this.A01 = lazyListState;
        this.A00 = c2ac;
    }

    @Override // X.C1YA
    public final float A5p(float f) {
        char c;
        InterfaceC1174Add interfaceC1174Add;
        LazyListState lazyListState = this.A01;
        List listA0j = AnonymousClass003.A0j(lazyListState);
        C2AC c2ac = this.A00;
        int size = listA0j.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            C16C c16c = (C16C) listA0j.get(i);
            if (!(c16c instanceof InterfaceC1174Add) || (interfaceC1174Add = (InterfaceC1174Add) c16c) == null || !interfaceC1174Add.AI9()) {
                C2A9 c2a9A04 = lazyListState.A04();
                EnumC1108AYu enumC1108AYu = ((C1161Act) c2a9A04).A09;
                EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
                long jAMh = c2a9A04.AMh();
                int i2 = (int) (enumC1108AYu == enumC1108AYu2 ? jAMh & 4294967295L : jAMh >> 32);
                int i3 = -((C1161Act) lazyListState.A04()).A07;
                int i4 = ((C1161Act) lazyListState.A04()).A02;
                C1160Acs c1160Acs = (C1160Acs) c16c;
                int i5 = c1160Acs.A09;
                int i6 = c1160Acs.A02;
                lazyListState.A04();
                float fAY9 = i6 - c2ac.AY9(i2, i5, i3, i4);
                if (fAY9 <= 0.0f && fAY9 > f2) {
                    f2 = fAY9;
                }
                if (fAY9 >= 0.0f && fAY9 < f3) {
                    f3 = fAY9;
                }
            }
        }
        if (Math.abs(f) >= lazyListState.A0K.getValue().A0C.Ah4(400.0f)) {
            c = f <= 0.0f ? (char) 2 : (char) 0;
            f2 = f3;
            if (f2 != Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
                return 0.0f;
            }
            return f2;
        }
        if (c == 0 && Math.abs(f3) <= Math.abs(f2)) {
            f2 = f3;
        }
        if (f2 != Float.POSITIVE_INFINITY) {
        }
        return 0.0f;
    }

    @Override // X.C1YA
    public final float A5g(float f, float f2) {
        int i;
        float fAbs = Math.abs(f2);
        List listA0j = AnonymousClass003.A0j(this.A01);
        if (listA0j.isEmpty()) {
            i = 0;
        } else {
            int size = listA0j.size();
            int size2 = listA0j.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                i2 += ((C1160Acs) ((C16C) listA0j.get(i3))).A09;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return f3 * Math.signum(f2);
    }
}
