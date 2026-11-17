package X;

import android.graphics.PointF;

/* renamed from: X.Fii, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8682Fii<T> {
    public AbstractC8724FjP<?, ?> A00;
    public final C8686Fim<T> A01 = new C8686Fim<>();

    /* JADX WARN: Type inference failed for: r12v0, types: [T, X.Fih] */
    private final T A00(C8686Fim<T> c8686Fim) {
        Number number;
        if (this instanceof C8665FiQ) {
            return ((C8665FiQ) this).A00.invoke(c8686Fim);
        }
        if (!(this instanceof C8678Fie)) {
            if (!(this instanceof C8687Fin) || (number = (Number) ((C8687Fin) this).A01.A00(c8686Fim)) == null) {
                return null;
            }
            return (T) Float.valueOf(number.floatValue() * 2.55f);
        }
        C8678Fie c8678Fie = (C8678Fie) this;
        C8686Fim<T> c8686Fim2 = c8678Fie.A02;
        float f = c8686Fim.A04;
        float f2 = c8686Fim.A00;
        T t = (T) ((C8681Fih) c8686Fim.A06).A0B;
        T t2 = (T) ((C8681Fih) c8686Fim.A05).A0B;
        float f3 = c8686Fim.A02;
        float f4 = c8686Fim.A01;
        float f5 = c8686Fim.A03;
        c8686Fim2.A04 = f;
        c8686Fim2.A00 = f2;
        c8686Fim2.A06 = t;
        c8686Fim2.A05 = t2;
        c8686Fim2.A02 = f3;
        c8686Fim2.A01 = f4;
        c8686Fim2.A03 = f5;
        String str = (String) c8678Fie.A03.A00(c8686Fim2);
        C8681Fih c8681Fih = c8686Fim.A01 == 1.0f ? c8686Fim.A05 : c8686Fim.A06;
        ?? r12 = (T) c8678Fie.A01;
        String str2 = c8681Fih.A0A;
        float f6 = c8681Fih.A02;
        Integer num = c8681Fih.A09;
        int i = c8681Fih.A06;
        float f7 = c8681Fih.A01;
        float f8 = c8681Fih.A00;
        int i2 = c8681Fih.A04;
        int i3 = c8681Fih.A05;
        float f9 = c8681Fih.A03;
        boolean z = c8681Fih.A0C;
        PointF pointF = c8681Fih.A07;
        PointF pointF2 = c8681Fih.A08;
        r12.A0B = str;
        r12.A0A = str2;
        r12.A02 = f6;
        r12.A09 = num;
        r12.A06 = i;
        r12.A01 = f7;
        r12.A00 = f8;
        r12.A04 = i2;
        r12.A05 = i3;
        r12.A03 = f9;
        r12.A0C = z;
        r12.A07 = pointF;
        r12.A08 = pointF2;
        return r12;
    }

    /* JADX WARN: Incorrect types in method signature: (FFTT;TT;FFF)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        C8686Fim<T> c8686Fim = this.A01;
        c8686Fim.A04 = f;
        c8686Fim.A00 = f2;
        c8686Fim.A06 = obj;
        c8686Fim.A05 = obj2;
        c8686Fim.A02 = f3;
        c8686Fim.A01 = f4;
        c8686Fim.A03 = f5;
        return A00(c8686Fim);
    }
}
