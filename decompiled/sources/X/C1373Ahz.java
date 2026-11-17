package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* renamed from: X.Ahz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1373Ahz implements InterfaceC1367Aht {
    public final InterfaceC1370Ahw<?> A03;
    public final BBG A04;
    public final C1371Ahx<Object> A05;
    public final AlX A06;
    public final Object A07;
    public final BBV A08;
    public final BBI A09;
    public final G0V<BFM, Integer, Unit> A0A;
    public final boolean A0B;
    public AtomicReference<EnumC1374Ai0> A01 = new AtomicReference<>(EnumC1374Ai0.A05);
    public long A00 = Thread.currentThread().getId();
    public AbstractC0916AHs<BBb> A02 = HsU.A00;

    public static void A00(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder("Unexpected state change from: ");
        sb.append(obj);
        sb.append(" to: ");
        sb.append(obj2);
        sb.append('.');
        AK7.A00(sb.toString());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:2:0x0000, B:3:0x000c, B:4:0x000f, B:5:0x0013, B:6:0x0014, B:7:0x001b, B:8:0x0022, B:9:0x0029, B:10:0x0030, B:12:0x003a, B:44:0x00c7, B:45:0x00cb, B:13:0x003f, B:26:0x0087, B:28:0x008f, B:29:0x0093, B:39:0x00b5, B:41:0x00bd, B:16:0x0059, B:18:0x0061, B:19:0x0065, B:21:0x0069, B:33:0x009c, B:34:0x00a1, B:36:0x00ab, B:37:0x00af, B:25:0x0081, B:43:0x00c2, B:14:0x0041, B:22:0x0071), top: B:49:0x0000, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1367Aht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Abh(X.InterfaceC2246BCr r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicReference<X.Ai0> r3 = r8.A01     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r0 = r3.get()     // Catch: java.lang.Exception -> Lcc
            X.Ai0 r0 = (X.EnumC1374Ai0) r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> Lcc
            switch(r0) {
                case 0: goto L29;
                case 1: goto L22;
                case 2: goto L65;
                case 3: goto L30;
                case 4: goto Lc2;
                case 5: goto L14;
                case 6: goto L1b;
                default: goto Lf;
            }     // Catch: java.lang.Exception -> Lcc
        Lf:
            kotlin.NoWhenBranchMatchedException r1 = X.C3cG.A0q()     // Catch: java.lang.Exception -> Lcc
        L13:
            throw r1     // Catch: java.lang.Exception -> Lcc
        L14:
            java.lang.String r0 = "Pausable composition is complete and apply() should be applied"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)     // Catch: java.lang.Exception -> Lcc
            goto L13
        L1b:
            java.lang.String r0 = "The paused composition has been applied"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)     // Catch: java.lang.Exception -> Lcc
            goto L13
        L22:
            java.lang.String r0 = "The paused composition has been cancelled"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)     // Catch: java.lang.Exception -> Lcc
            goto L13
        L29:
            java.lang.String r0 = "The paused composition is invalid because of a previous exception"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)     // Catch: java.lang.Exception -> Lcc
            goto L13
        L30:
            X.Ai0 r2 = X.EnumC1374Ai0.A07     // Catch: java.lang.Exception -> Lcc
            X.Ai0 r7 = X.EnumC1374Ai0.A08     // Catch: java.lang.Exception -> Lcc
            boolean r0 = X.Bs8.A00(r2, r7, r3)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L3f
            A00(r2, r7)     // Catch: java.lang.Exception -> Lcc
            goto Lc7
        L3f:
            long r4 = r8.A00     // Catch: java.lang.Exception -> Lcc
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L58
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L58
            r8.A00 = r0     // Catch: java.lang.Throwable -> L58
            X.BBV r6 = r8.A08     // Catch: java.lang.Throwable -> L58
            X.BBG r1 = r8.A04     // Catch: java.lang.Throwable -> L58
            X.AHs<X.BBb> r0 = r8.A02     // Catch: java.lang.Throwable -> L58
            X.AHs r0 = r6.A0E(r0, r1, r9)     // Catch: java.lang.Throwable -> L58
            r8.A02 = r0     // Catch: java.lang.Throwable -> L58
            goto L87
        L58:
            r1 = move-exception
            r8.A00 = r4     // Catch: java.lang.Exception -> Lcc
            boolean r0 = X.Bs8.A00(r7, r2, r3)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L13
            A00(r7, r2)     // Catch: java.lang.Exception -> Lcc
            goto Lc7
        L65:
            boolean r4 = r8.A0B     // Catch: java.lang.Exception -> Lcc
            if (r4 == 0) goto L71
            X.BBI r1 = r8.A09     // Catch: java.lang.Exception -> Lcc
            r0 = 0
            r1.A05 = r0     // Catch: java.lang.Exception -> Lcc
            r0 = 1
            r1.A0Q = r0     // Catch: java.lang.Exception -> Lcc
        L71:
            X.BBV r2 = r8.A08     // Catch: java.lang.Throwable -> L7e
            X.BBG r1 = r8.A04     // Catch: java.lang.Throwable -> L7e
            X.G0V<X.BFM, java.lang.Integer, kotlin.Unit> r0 = r8.A0A     // Catch: java.lang.Throwable -> L7e
            X.AHs r0 = r2.A0F(r1, r9, r0)     // Catch: java.lang.Throwable -> L7e
            r8.A02 = r0     // Catch: java.lang.Throwable -> L7e
            goto L9a
        L7e:
            r1 = move-exception
            if (r4 == 0) goto L13
            X.BBI r0 = r8.A09     // Catch: java.lang.Exception -> Lcc
            r0.A0Y()     // Catch: java.lang.Exception -> Lcc
            goto L13
        L87:
            r8.A00 = r4     // Catch: java.lang.Exception -> Lcc
            boolean r0 = X.Bs8.A00(r7, r2, r3)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L93
            A00(r7, r2)     // Catch: java.lang.Exception -> Lcc
            goto Lc7
        L93:
            X.AHs<X.BBb> r0 = r8.A02     // Catch: java.lang.Exception -> Lcc
            int r0 = r0.A01     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto Lc1
            goto Lb5
        L9a:
            if (r4 == 0) goto La1
            X.BBI r0 = r8.A09     // Catch: java.lang.Exception -> Lcc
            r0.A0Y()     // Catch: java.lang.Exception -> Lcc
        La1:
            X.Ai0 r1 = X.EnumC1374Ai0.A05     // Catch: java.lang.Exception -> Lcc
            X.Ai0 r2 = X.EnumC1374Ai0.A07     // Catch: java.lang.Exception -> Lcc
            boolean r0 = X.Bs8.A00(r1, r2, r3)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto Laf
            A00(r1, r2)     // Catch: java.lang.Exception -> Lcc
            goto Lc7
        Laf:
            X.AHs<X.BBb> r0 = r8.A02     // Catch: java.lang.Exception -> Lcc
            int r0 = r0.A01     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto Lc1
        Lb5:
            X.Ai0 r1 = X.EnumC1374Ai0.A03     // Catch: java.lang.Exception -> Lcc
            boolean r0 = X.Bs8.A00(r2, r1, r3)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto Lc1
            A00(r2, r1)     // Catch: java.lang.Exception -> Lcc
            goto Lc7
        Lc1:
            return
        Lc2:
            java.lang.String r0 = "Recursive call to resume()"
            X.BBL.A02(r0)     // Catch: java.lang.Exception -> Lcc
        Lc7:
            X.F60 r0 = X.F60.createAndThrow()     // Catch: java.lang.Exception -> Lcc
            throw r0     // Catch: java.lang.Exception -> Lcc
        Lcc:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicReference<X.Ai0> r1 = r8.A01
            X.Ai0 r0 = X.EnumC1374Ai0.A06
            r1.set(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373Ahz.Abh(X.BCr):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BBG;LX/BBV;LX/BBI;Ljava/util/Set<LX/AlZ;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/Ahw<*>;Ljava/lang/Object;)V */
    public C1373Ahz(InterfaceC1370Ahw interfaceC1370Ahw, BBV bbv, BBG bbg, BBI bbi, Object obj, Set set, G0V g0v, boolean z) {
        this.A04 = bbg;
        this.A08 = bbv;
        this.A09 = bbi;
        this.A0A = g0v;
        this.A0B = z;
        this.A03 = interfaceC1370Ahw;
        this.A07 = obj;
        AlX alX = new AlX();
        alX.A05(bbi.A0W(), set);
        this.A06 = alX;
        this.A05 = new C1371Ahx<>(interfaceC1370Ahw.AEN());
    }
}
