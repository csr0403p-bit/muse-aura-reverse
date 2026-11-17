package X;

import android.graphics.PointF;

/* renamed from: X.Fjt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8754Fjt implements InterfaceC10514HoR<C8681Fih> {
    public static final C8754Fjt A00 = new C8754Fjt();
    public static final C6823Eab A01 = C6823Eab.A00("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // X.InterfaceC10514HoR
    public final /* bridge */ /* synthetic */ C8681Fih AXc(AbstractC6806EaH abstractC6806EaH, float f) {
        Integer num = C79.A0C;
        abstractC6806EaH.A0G();
        String strA0E = null;
        Integer num2 = num;
        String strA0E2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fA09 = 0.0f;
        int iA0A = 0;
        float fA092 = 0.0f;
        float fA093 = 0.0f;
        int iA01 = 0;
        int iA012 = 0;
        float fA094 = 0.0f;
        boolean zA0M = true;
        while (abstractC6806EaH.A0L()) {
            switch (abstractC6806EaH.A0B(A01)) {
                case 0:
                    strA0E = abstractC6806EaH.A0E();
                    continue;
                case 1:
                    strA0E2 = abstractC6806EaH.A0E();
                    continue;
                case 2:
                    fA09 = (float) abstractC6806EaH.A09();
                    continue;
                case 3:
                    int iA0A2 = abstractC6806EaH.A0A();
                    if (iA0A2 > 2 || iA0A2 < 0) {
                        num2 = num;
                        continue;
                    } else {
                        num2 = C79.A00(3)[iA0A2];
                    }
                    break;
                case 4:
                    iA0A = abstractC6806EaH.A0A();
                    continue;
                case 5:
                    fA092 = (float) abstractC6806EaH.A09();
                    continue;
                case 6:
                    fA093 = (float) abstractC6806EaH.A09();
                    continue;
                case 7:
                    iA01 = HwH.A01(abstractC6806EaH);
                    continue;
                case 8:
                    iA012 = HwH.A01(abstractC6806EaH);
                    continue;
                case 9:
                    fA094 = (float) abstractC6806EaH.A09();
                    continue;
                case 10:
                    zA0M = abstractC6806EaH.A0M();
                    continue;
                case 11:
                    abstractC6806EaH.A0F();
                    pointF = new PointF(((float) abstractC6806EaH.A09()) * f, ((float) abstractC6806EaH.A09()) * f);
                    break;
                case 12:
                    abstractC6806EaH.A0F();
                    pointF2 = new PointF(((float) abstractC6806EaH.A09()) * f, ((float) abstractC6806EaH.A09()) * f);
                    break;
                default:
                    abstractC6806EaH.A0J();
                    abstractC6806EaH.A0K();
                    continue;
            }
            abstractC6806EaH.A0H();
        }
        abstractC6806EaH.A0I();
        C8681Fih c8681Fih = new C8681Fih();
        c8681Fih.A0B = strA0E;
        c8681Fih.A0A = strA0E2;
        c8681Fih.A02 = fA09;
        c8681Fih.A09 = num2;
        c8681Fih.A06 = iA0A;
        c8681Fih.A01 = fA092;
        c8681Fih.A00 = fA093;
        c8681Fih.A04 = iA01;
        c8681Fih.A05 = iA012;
        c8681Fih.A03 = fA094;
        c8681Fih.A0C = zA0M;
        c8681Fih.A07 = pointF;
        c8681Fih.A08 = pointF2;
        return c8681Fih;
    }
}
