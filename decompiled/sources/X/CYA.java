package X;

import com.facebook.tigon.TigonXplatService;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CYA {
    public final TigonXplatService A00;
    public final Executor A01;

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.9jH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7416EvJ A00(X.CYB r17) throws java.lang.InterruptedException {
        /*
            r16 = this;
            r15 = 0
            r2 = r17
            X.C7384Etj.A0Y(r2, r15)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r2.A05
            com.facebook.tigon.iface.TigonRequestBuilder r6 = new com.facebook.tigon.iface.TigonRequestBuilder
            r6.<init>(r1, r0)
            java.util.LinkedHashMap r7 = X.C3cG.A0j()
            java.util.List<X.HxE<java.lang.String, java.lang.String>> r5 = r2.A06
            int r4 = r5.size()
            r3 = 0
        L1a:
            if (r3 >= r4) goto L32
            java.lang.Object r0 = r5.get(r3)
            X.HxE r0 = (X.HxE) r0
            A r1 = r0.first
            java.lang.Object r0 = r5.get(r3)
            X.HxE r0 = (X.HxE) r0
            B r0 = r0.second
            r7.put(r1, r0)
            int r3 = r3 + 1
            goto L1a
        L32:
            X.CG5 r4 = r2.A00
            if (r4 == 0) goto L41
            java.lang.String r1 = r4.A79()
            if (r1 == 0) goto L41
            java.lang.String r0 = "Content-Type"
            r7.put(r0, r1)
        L41:
            r6.addHeaders(r7)
            r5 = 0
            X.CYD r1 = r2.A01
            X.CYV r0 = r1.A01
            r6.requestCategory = r0
            X.CXt r0 = r1.A02
            r6.purpose = r0
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L55
            java.lang.String r0 = "CrudoNetTigonHttpEngine"
        L55:
            java.lang.String r3 = ""
            r6.setFriendlyNameAndTags(r0, r3, r3)
            X.CY4 r0 = X.AbstractC4088Clr.A09
            r1 = 1
            r6.setProperty(r0, r15, r1)
            com.facebook.tigon.iface.TigonRequest r13 = r6.build()
            if (r4 == 0) goto L6b
            X.CID r5 = new X.CID
            r5.<init>(r4, r2)
        L6b:
            X.F1E r10 = new X.F1E
            r10.<init>()
            X.Hqv r11 = X.C3cG.A0z()
            X.9jH r0 = X.AGH.A0E()
            r11.element = r0
            java.io.ByteArrayOutputStream r8 = X.BV4.A0F()
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r1)
            X.CYC r6 = new X.CYC
            r7 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            if (r5 == 0) goto L9d
            org.apache.http.HttpEntity r5 = (org.apache.http.HttpEntity) r5
            java.util.concurrent.Executor r4 = r7.A01
            X.CYI r1 = new X.CYI
            r1.<init>(r4, r5)
            com.facebook.tigon.TigonXplatService r0 = r7.A00
            com.facebook.tigon.TigonRequestToken r1 = r0.sendRequest(r13, r1, r6, r4)
            if (r1 != 0) goto Laa
        L9d:
            com.facebook.tigon.TigonXplatService r12 = r7.A00
            java.util.concurrent.Executor r0 = r7.A01
            r14 = 0
            r16 = r6
            r17 = r0
            com.facebook.tigon.TigonRequestToken r1 = r12.sendRequest(r13, r14, r15, r16, r17)
        Laa:
            X.C7384Etj.A0Y(r1, r15)
            X.CYN r0 = r2.A02
            r0.A00 = r1
            r9.await()
            T r5 = r11.element
            java.util.Map r5 = (java.util.Map) r5
            int r4 = r10.element
            X.Ey9 r0 = X.C7Ji.A00
            java.util.Iterator r2 = r0.iterator()
        Lc0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7Ji r0 = (X.C7Ji) r0
            int r0 = r0.code
            if (r0 != r4) goto Lc0
        Ld1:
            X.7Ji r1 = (X.C7Ji) r1
            if (r1 == 0) goto Ld9
            java.lang.String r2 = r1.message
            if (r2 != 0) goto Lda
        Ld9:
            r2 = r3
        Lda:
            byte[] r0 = r8.toByteArray()
            java.io.ByteArrayInputStream r1 = X.BV4.A0E(r0)
            X.EvJ r0 = new X.EvJ
            r0.<init>(r1, r2, r5, r4)
            return r0
        Le8:
            r1 = 0
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYA.A00(X.CYB):X.EvJ");
    }

    public CYA(TigonXplatService tigonXplatService, Executor executor) {
        AnonymousClass003.A0u(tigonXplatService, executor);
        this.A00 = tigonXplatService;
        this.A01 = executor;
    }
}
