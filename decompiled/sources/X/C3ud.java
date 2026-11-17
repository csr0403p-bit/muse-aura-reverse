package X;

import com.facebook.acra.util.JavaProcFileReader;
import kotlin.Unit;

/* renamed from: X.3ud, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3ud<S, T> extends AbstractC05583ub<T> {
    public final C20Q<S> A00;

    public abstract Object A04(C20Z<? super T> c20z, HtJ<? super Unit> htJ);

    @Override // X.AbstractC05583ub
    public final Object A00(HyO<? super T> hyO, HtJ<? super Unit> htJ) {
        Object objA04 = A04(new C05613uf(hyO), htJ);
        return objA04 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA04;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // X.AbstractC05583ub, X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(final X.C20Z<? super T> r5, X.HtJ<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            int r1 = r4.A00
            r0 = -3
            if (r1 != r0) goto L52
            X.78T r2 = r6.getContext()
            X.78T r0 = r4.A02
            X.78T r3 = X.GAr.A00(r2, r0)
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 == 0) goto L20
            java.lang.Object r0 = r4.A04(r5, r6)
        L19:
            X.Hji r1 = X.EnumC10460Hji.A02
            if (r0 == r1) goto L1f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L1f:
            return r0
        L20:
            X.Hx7 r0 = X.InterfaceC10590Hxd.A00
            X.78X r1 = r3.get(r0)
            X.78X r0 = r2.get(r0)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L52
            X.78T r1 = r6.getContext()
            boolean r0 = r5 instanceof X.C05613uf
            if (r0 != 0) goto L42
            boolean r0 = r5 instanceof X.C3no
            if (r0 != 0) goto L42
            X.3ue r0 = new X.3ue
            r0.<init>(r1, r5)
            r5 = r0
        L42:
            r2 = 0
            r0 = 4
            X.60C r1 = new X.60C
            r1.<init>(r4, r2, r0)
            java.lang.Object r0 = X.GCA.A01(r3)
            java.lang.Object r0 = X.AbstractC9296GCy.A00(r5, r0, r6, r3, r1)
            goto L19
        L52:
            java.lang.Object r0 = super.collect(r5, r6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ud.collect(X.20Z, X.HtJ):java.lang.Object");
    }

    @Override // X.AbstractC05583ub
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        return AnonymousClass001.A0v(super.toString(), sb);
    }

    public C3ud(Integer num, C78T c78t, C20Q c20q, int i) {
        super(num, c78t, i);
        this.A00 = c20q;
    }
}
