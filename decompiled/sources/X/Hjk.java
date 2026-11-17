package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Hjk implements Runnable {
    public static final String __redex_internal_original_name = "u4";
    public final HtW A00;
    public final ListenableFuture A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.common.util.concurrent.ListenableFuture r2 = r7.A01
            boolean r0 = r2 instanceof X.CRN
            if (r0 == 0) goto L43
            r1 = r2
            X.CRN r1 = (X.CRN) r1
            X.CR9 r1 = (X.CR9) r1
            boolean r0 = r1 instanceof X.CRL
            if (r0 == 0) goto L43
            java.lang.Object r1 = r1.a
            boolean r0 = r1 instanceof X.CRH
            if (r0 == 0) goto L43
            X.CRH r1 = (X.CRH) r1
            java.lang.Throwable r6 = r1.A00
            X.HtW r4 = r7.A00
        L1b:
            boolean r0 = r6 instanceof java.util.concurrent.TimeoutException
            X.GNi r5 = r4.A01
            java.lang.String r3 = "BillingClientTesting"
            if (r0 == 0) goto L37
            X.GNn r2 = X.EnumC9535GNn.A15
            X.GNw r1 = X.EnumC9540GNw.A0E
            X.GNM r0 = X.GO0.A06
            r5.A0U(r0, r1, r2)
            java.lang.String r0 = "Asynchronous call to Billing Override Service timed out."
        L2e:
            X.GNN.A07(r3, r0, r6)
        L31:
            java.lang.Runnable r0 = r4.A03
            r0.run()
            return
        L37:
            X.GNn r2 = X.EnumC9535GNn.A0r
            X.GNw r1 = X.EnumC9540GNw.A0E
            X.GNM r0 = X.GO0.A06
            r5.A0U(r0, r1, r2)
            java.lang.String r0 = "An error occurred while retrieving billing override."
            goto L2e
        L43:
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
            r1 = 0
            if (r0 != 0) goto L59
            java.lang.Object[] r1 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
            java.lang.String r0 = "Future was expected to be done: %s"
            java.lang.String r0 = X.CL5.A01(r0, r1)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
        L58:
            throw r0     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
        L59:
            java.lang.Object r0 = r2.get()     // Catch: java.lang.InterruptedException -> L5e java.lang.Throwable -> L60
            goto L67
        L5e:
            r1 = 1
            goto L59
        L60:
            r0 = move-exception
            if (r1 == 0) goto L58
            X.BV4.A1A()     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
            goto L58
        L67:
            if (r1 == 0) goto L6c
            X.BV4.A1A()     // Catch: java.lang.Throwable -> L8d java.util.concurrent.ExecutionException -> L91
        L6c:
            X.HtW r4 = r7.A00
            java.lang.Number r0 = (java.lang.Number) r0
            X.GNi r3 = r4.A01
            int r1 = r0.intValue()
            if (r1 <= 0) goto L31
            X.GNw r2 = r4.A02
            X.GNM r0 = X.GO0.A00
            java.lang.String r0 = "Billing override value was set by a license tester."
            X.GNM r1 = X.AbstractC9548GOe.A00(r0, r1)
            X.GNn r0 = X.EnumC9535GNn.A0l
            r3.A0U(r1, r2, r0)
            X.BeM r0 = r4.A00
            r0.accept(r1)
            return
        L8d:
            r6 = move-exception
            X.HtW r4 = r7.A00
            goto L1b
        L91:
            r0 = move-exception
            X.HtW r4 = r7.A00
            java.lang.Throwable r6 = r0.getCause()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hjk.run():void");
    }

    public final String toString() {
        HtW htW = this.A00;
        StringBuilder sbA0p = BV4.A0p(32);
        sbA0p.append("u4{");
        sbA0p.append("");
        if (htW.getClass().isArray()) {
            String strDeepToString = Arrays.deepToString(new Object[]{htW});
            sbA0p.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
        } else {
            sbA0p.append(htW);
        }
        return C8j3.A15(sbA0p);
    }

    public Hjk(HtW htW, ListenableFuture listenableFuture) {
        this.A01 = listenableFuture;
        this.A00 = htW;
    }
}
