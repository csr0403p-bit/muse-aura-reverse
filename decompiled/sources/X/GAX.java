package X;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes6.dex */
public abstract class GAX {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLX/G0V<-LX/3UX;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    public static final Object A00(HtJ htJ, G0V g0v, long j) {
        if (j > 0) {
            return A02(g0v, new GAY(j, htJ));
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Failed to calculate best type for var: r3v0 X.Hqv
    jadx.core.utils.exceptions.JadxRuntimeException: Can't change type for register without SSA variable: (r3 I:X.Hqv)
    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:50)
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.lambda$applyUpdates$1(TypeUpdateInfo.java:49)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.applyUpdates(TypeUpdateInfo.java:49)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:95)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertCasts(FixTypesVisitor.java:363)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLX/G0V<-LX/3UX;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0054: IGET (r0 I:T) = (r3 I:X.Hqv) (LINE:84) X.Hqv.element java.lang.Object, block:B:21:0x0052 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.GAY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.HtJ r8, X.G0V r9, long r10) {
        /*
            boolean r0 = r8 instanceof X.G5Y
            if (r0 == 0) goto L23
            r7 = r8
            X.G5Y r7 = (X.G5Y) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L59
            java.lang.Object r3 = r7.L$1
            X.Hqv r3 = (X.C10543Hqv) r3
            goto L29
        L23:
            X.G5Y r7 = new X.G5Y
            r7.<init>(r8)
            goto L12
        L29:
            X.Hwg.A00(r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            return r1
        L2d:
            X.Hwg.A00(r1)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            X.Hqv r3 = new X.Hqv
            r3.<init>()
            r7.L$0 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            r7.L$1 = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            r7.J$0 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            r7.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            X.GAY r0 = new X.GAY     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            r0.<init>(r10, r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            r3.element = r0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            java.lang.Object r5 = A02(r9, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L51
            if (r5 != r6) goto L58
            return r6
        L51:
            r2 = move-exception
            X.HoC r1 = r2.A00
            T r0 = r3.element
            if (r1 != r0) goto L60
        L58:
            return r5
        L59:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
        L60:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAX.A01(X.HtJ, X.G0V, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <U:Ljava/lang/Object;T::TU;>(LX/GAY<TU;-TT;>;LX/G0V<-LX/3UX;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;)Ljava/lang/Object; */
    public static final Object A02(G0V g0v, GAY gay) {
        HzS.A01(gay, new GAa(C7Bq.A03(((GAk) gay).A00.getContext()).AO7(gay, ((GAq) gay).A00, gay.A00)), true);
        return GAj.A00(gay, g0v, gay, false);
    }
}
