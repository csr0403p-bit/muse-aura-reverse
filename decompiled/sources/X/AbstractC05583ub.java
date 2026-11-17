package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;
import kotlin.Unit;

/* renamed from: X.3ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC05583ub<T> implements C3pV<T> {
    public final int A00;
    public final Integer A01;
    public final C78T A02;

    public abstract Object A00(HyO<? super T> hyO, HtJ<? super Unit> htJ);

    @Override // X.C20Q
    public Object collect(C20Z<? super T> c20z, HtJ<? super Unit> htJ) {
        Object objA00 = Hxb.A00(new C60D(this, c20z, null, 4), htJ);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        if (this instanceof C05563uZ) {
            StringBuilder sb = new StringBuilder("channel=");
            sb.append(((C05563uZ) this).A00);
            String string = sb.toString();
            if (string != null) {
                arrayList.add(string);
            }
        }
        C78T c78t = this.A02;
        if (c78t != C6ys.A00) {
            arrayList.add(AnonymousClass007.A0a("context=", c78t));
        }
        int i = this.A00;
        if (i != -3) {
            arrayList.add(FGI.A0H("capacity=", i));
        }
        Integer num = this.A01;
        if (num != C79.A00) {
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "DROP_OLDEST";
                        break;
                    case 2:
                        str = "DROP_LATEST";
                        break;
                    default:
                        str = "SUSPEND";
                        break;
                }
            } else {
                str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            }
            arrayList.add(FGI.A0M("onBufferOverflow=", str));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3cI.A0Y(this));
        sb2.append('[');
        sb2.append(C3cH.A0e(", ", arrayList));
        sb2.append(']');
        return sb2.toString();
    }

    public HxV<T> A01(C3UX c3ux) {
        C78T c78t = this.A02;
        int i = this.A00;
        if (i == -3) {
            i = -2;
        }
        Integer num = this.A01;
        Integer num2 = C79.A0C;
        G0V c60c = new C60C(this, (C1531Akn) null, (HtJ<? super C60C>) 3);
        HuI huI = new HuI(GAr.A02(c78t, c3ux), AbstractC10623Hzj.A00(num, i));
        huI.A0U(num2, huI, c60c);
        return huI;
    }

    public C20Q<T> A02() {
        return null;
    }

    public AbstractC05583ub A03(Integer num, C78T c78t, int i) {
        if (this instanceof C05573ua) {
            return new C05573ua(num, ((C05573ua) this).A00, c78t, i);
        }
        if (this instanceof C3pT) {
            return new C3pT(num, c78t, ((C3ud) this).A00, i);
        }
        if (this instanceof C05563uZ) {
            C05563uZ c05563uZ = (C05563uZ) this;
            return new C05563uZ(num, c78t, c05563uZ.A00, i, c05563uZ.A01);
        }
        C05593uc c05593uc = (C05593uc) this;
        return c05593uc instanceof C05653uk ? new C05653uk(num, c78t, ((C05653uk) c05593uc).A00, i) : new C05593uc(num, c78t, c05593uc.A00, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[PHI: r1
  0x001c: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v2 int) binds: [B:6:0x000f, B:9:0x0014, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C3pV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20Q ABr(java.lang.Integer r5, X.C78T r6, int r7) {
        /*
            r4 = this;
            X.78T r3 = r4.A02
            X.78T r2 = r6.plus(r3)
            java.lang.Integer r0 = X.C79.A00
            if (r5 != r0) goto L1f
            int r1 = r4.A00
            r0 = -3
            if (r1 == r0) goto L1d
            if (r7 == r0) goto L1c
            r0 = -2
            if (r1 == r0) goto L1d
            if (r7 == r0) goto L1c
            int r1 = r1 + r7
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < 0) goto L1d
        L1c:
            r7 = r1
        L1d:
            java.lang.Integer r5 = r4.A01
        L1f:
            boolean r0 = X.C7384Etj.areEqual(r2, r3)
            if (r0 == 0) goto L2e
            int r0 = r4.A00
            if (r7 != r0) goto L2e
            java.lang.Integer r0 = r4.A01
            if (r5 != r0) goto L2e
            return r4
        L2e:
            X.3ub r4 = r4.A03(r5, r2, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05583ub.ABr(java.lang.Integer, X.78T, int):X.20Q");
    }

    public AbstractC05583ub(Integer num, C78T c78t, int i) {
        this.A02 = c78t;
        this.A00 = i;
        this.A01 = num;
    }
}
