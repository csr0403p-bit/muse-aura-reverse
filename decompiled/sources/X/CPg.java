package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public abstract class CPg<InputT, OutputT> extends AbstractC3476CPj<OutputT> {
    public static final CPa A03 = new CPa(CPg.class);
    public ImmutableCollection<? extends ListenableFuture<? extends InputT>> A00;
    public final boolean A01;
    public final boolean A02;

    public static void A01(CPg cPg, ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                cPg.A00 = null;
                cPg.cancel(false);
            } else {
                cPg.A02(listenableFuture, i);
            }
        } finally {
            A00(null, cPg);
        }
    }

    public static void A00(ImmutableCollection immutableCollection, CPg cPg) {
        int iA00 = AbstractC3476CPj.A00.A00(cPg);
        Preconditions.checkState(iA00 >= 0, "Less than 0 remaining futures");
        if (iA00 == 0) {
            if (immutableCollection != null) {
                AbstractC7489Ext it = immutableCollection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        cPg.A02(future, i);
                    }
                    i++;
                }
            }
            cPg.seenExceptions = null;
            cPg.A03();
            cPg.A05(C79.A01);
        }
    }

    public void A03() {
        CPr cPr = (CPr) this;
        List<C3482CPs<V>> list = cPr.A00;
        if (list != 0) {
            int size = list.size();
            AbstractC3830CfJ.A00(size, "initialArraySize");
            ArrayList arrayListA11 = C60O.A11(size);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3482CPs c3482CPs = (C3482CPs) it.next();
                arrayListA11.add(c3482CPs != null ? c3482CPs.A00 : null);
            }
            cPr.set(Collections.unmodifiableList(arrayListA11));
        }
    }

    public final void A04() {
        this.A00.getClass();
        if (this.A00.isEmpty()) {
            A03();
            return;
        }
        boolean z = this.A01;
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.A00;
        if (!z) {
            final ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection2 = this.A02 ? immutableCollection : null;
            Runnable runnable = new Runnable() { // from class: X.CPl
                public static final String __redex_internal_original_name = "AggregateFuture$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    CPg.A00(immutableCollection2, this);
                }
            };
            AbstractC7489Ext<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                ListenableFuture<? extends InputT> next = it.next();
                if (next.isDone()) {
                    A00(immutableCollection2, this);
                } else {
                    next.addListener(runnable, EnumC3451CNw.A01);
                }
            }
            return;
        }
        AbstractC7489Ext<? extends ListenableFuture<? extends InputT>> it2 = immutableCollection.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture<? extends InputT> next2 = it2.next();
            int i2 = i + 1;
            if (next2.isDone()) {
                A01(this, next2, i);
            } else {
                next2.addListener(new Runnable() { // from class: X.CPm
                    public static final String __redex_internal_original_name = "AggregateFuture$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        CPg.A01(this.A01, next2, i);
                    }
                }, EnumC3451CNw.A01);
            }
            i = i2;
        }
    }

    @Override // X.CQU
    public final void afterDone() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.A00;
        A05(C79.A00);
        boolean zIsCancelled = isCancelled();
        if (immutableCollection == null || (!zIsCancelled || !true)) {
            return;
        }
        boolean zWasInterrupted = wasInterrupted();
        AbstractC7489Ext<? extends ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
        while (it.hasNext()) {
            it.next().cancel(zWasInterrupted);
        }
    }

    @Override // X.CQU
    public final String pendingToString() {
        ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection = this.A00;
        return immutableCollection != null ? AnonymousClass007.A0a("futures=", immutableCollection) : BV8.A0t(this);
    }

    public CPg(ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues) {
        int size = futures.size();
        this.seenExceptions = null;
        this.remaining = size;
        this.A00 = futures;
        this.A01 = allMustSucceed;
        this.A02 = collectsValues;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/concurrent/Future<+TInputT;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(java.util.concurrent.Future r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r2 = X.AbstractC2991Br9.A00(r6)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            boolean r0 = r5 instanceof X.CPn     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            if (r0 != 0) goto L93
            r0 = r5
            X.CPr r0 = (X.CPr) r0     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            java.util.List<X.CPs<V>> r1 = r0.A00     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            if (r1 == 0) goto L93
            X.CPs r0 = new X.CPs     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            r1.set(r7, r0)     // Catch: java.util.concurrent.ExecutionException -> L18 java.lang.Throwable -> L1e
            return
        L18:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()
            goto L1f
        L1e:
            r3 = move-exception
        L1f:
            r3.getClass()
            boolean r0 = r5.A01
            if (r0 == 0) goto L7e
            boolean r0 = r5.setException(r3)
            if (r0 != 0) goto L7e
            java.util.Set<java.lang.Throwable> r2 = r5.seenExceptions
            if (r2 != 0) goto L70
            java.util.Set r4 = X.C60O.A18()
            r4.getClass()
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L51
            java.lang.Throwable r1 = r5.tryInternalFastPathGetFailure()
            r1.getClass()
        L44:
            boolean r0 = r4.add(r1)
            if (r0 == 0) goto L51
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L51
            goto L44
        L51:
            X.CPh r2 = X.AbstractC3476CPj.A00
            r1 = 0
            boolean r0 = r2 instanceof X.C3475CPi
            if (r0 == 0) goto L64
            monitor-enter(r5)
            java.util.Set<java.lang.Throwable> r0 = r5.seenExceptions     // Catch: java.lang.Throwable -> L61
            if (r0 != r1) goto L5f
            r5.seenExceptions = r4     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L61
            goto L6b
        L61:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L61
            throw r0
        L64:
            X.CPk r2 = (X.C3477CPk) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super X.CPj<?>, ? super java.util.Set<java.lang.Throwable>> r0 = r2.A01
            X.AbstractC5217DdT.A00(r5, r1, r4, r0)
        L6b:
            java.util.Set<java.lang.Throwable> r2 = r5.seenExceptions
            r2.getClass()
        L70:
            r1 = r3
        L71:
            boolean r0 = r2.add(r1)
            if (r0 == 0) goto L7e
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L82
            goto L71
        L7e:
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto L93
        L82:
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto L94
            java.lang.String r2 = "Input Future failed with Error"
        L88:
            X.CPa r0 = X.CPg.A03
            java.util.logging.Logger r1 = r0.A00()
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            r1.log(r0, r2, r3)
        L93:
            return
        L94:
            java.lang.String r2 = "Got more than one input Future failure. Logging failures after the first"
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CPg.A02(java.util.concurrent.Future, int):void");
    }

    public void A05(Integer reason) {
        reason.getClass();
        this.A00 = null;
    }
}
