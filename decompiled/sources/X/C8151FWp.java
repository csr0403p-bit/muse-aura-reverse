package X;

import kotlin.Unit;

/* renamed from: X.FWp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8151FWp<T> extends HzP implements C20Z<T>, GAu {
    public final C78T collectContext;
    public final int collectContextSize;
    public final C20Z<T> collector;
    public HtJ<? super Unit> completion_;
    public C78T lastEmissionContext;

    /* JADX WARN: Incorrect types in method signature: (LX/20Z<-TT;>;LX/78T;)V */
    public C8151FWp(C78T c78t, C20Z c20z) {
        super(FJ9.A00, C6ys.A00);
        this.collector = c20z;
        this.collectContext = c78t;
        this.collectContextSize = ((Number) c78t.fold(0, new C8i0(34))).intValue();
    }

    @Override // X.AbstractC8884Fsp, X.GAu
    public final GAu getCallerFrame() {
        HtJ<? super Unit> htJ = this.completion_;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    @Override // X.HzP, X.HtJ
    public final C78T getContext() {
        C78T c78t = this.lastEmissionContext;
        return c78t == null ? C6ys.A00 : c78t;
    }

    @Override // X.AbstractC8884Fsp
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // X.C20Z
    public final Object emit(T t, HtJ<? super Unit> htJ) {
        try {
            C78T context = htJ.getContext();
            HzS.A05(context);
            C78T c78t = this.lastEmissionContext;
            if (c78t != context) {
                if (c78t instanceof FH6) {
                    StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    sb.append(((FH6) c78t).A00);
                    sb.append(", but then emission attempt of value '");
                    sb.append(t);
                    sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    throw new IllegalStateException(C6tn.A05(sb.toString()));
                }
                if (((Number) context.fold(0, new C8943Ftz(this, 3))).intValue() != this.collectContextSize) {
                    StringBuilder sb2 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                    sb2.append(this.collectContext);
                    sb2.append(",\n\t\tbut emission happened in ");
                    sb2.append(context);
                    sb2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(sb2.toString());
                }
                this.lastEmissionContext = context;
            }
            this.completion_ = htJ;
            G0W<C20Z<Object>, Object, HtJ<? super Unit>, Object> g0w = AbstractC7791FEx.A00;
            C20Z<T> c20z = this.collector;
            C7384Etj.A0Z(c20z, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object objInvoke = g0w.invoke(c20z, t, this);
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (!C7384Etj.areEqual(objInvoke, enumC10460Hji)) {
                this.completion_ = null;
            }
            return objInvoke != enumC10460Hji ? Unit.INSTANCE : objInvoke;
        } catch (Throwable th) {
            this.lastEmissionContext = new FH6(htJ.getContext(), th);
            throw th;
        }
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            C78T c78t = this.lastEmissionContext;
            if (c78t == null) {
                c78t = C6ys.A00;
            }
            this.lastEmissionContext = new FH6(c78t, thA00);
        }
        HtJ<? super Unit> htJ = this.completion_;
        if (htJ != null) {
            htJ.resumeWith(obj);
        }
        return EnumC10460Hji.A02;
    }
}
