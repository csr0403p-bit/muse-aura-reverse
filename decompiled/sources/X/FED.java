package X;

import android.content.Context;
import android.os.Looper;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FED implements FCX {
    public static final AtomicInteger A0T = BV5.A17();
    public int A00;
    public long A01;
    public FEE<Object, RenderContext> A02;
    public InterfaceC7734FCl<ResolveState, RenderContext, StateUpdateType> A03;
    public FGG A04;
    public FEJ A05;
    public ResolveState A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public InterfaceC7751FDd<RenderContext> A0C;
    public FEG<RenderContext> A0D;
    public C7736FCn<ResolveState, RenderContext, StateUpdateType> A0E;
    public boolean A0F;
    public final int A0G;
    public final long A0H;
    public final Context A0I;
    public final InterfaceC7738FCp<Object> A0J;

    /* JADX WARN: Incorrect inner types in field signature: LX/FED<TResolveState;TRenderContext;TStateUpdateType;>.RenderStateHandler; */
    public final FEH A0K;
    public final C7733FCk<ResolveState, RenderContext, StateUpdateType> A0L;
    public final C7732FCj A0M;
    public final RenderContext A0N;
    public final Object A0O;
    public final List<StateUpdateType> A0P;
    public final Runnable A0Q;
    public final Executor A0R;
    public final boolean A0S;

    /* JADX WARN: Multi-variable type inference failed */
    public FED(Context context, InterfaceC7738FCp interfaceC7738FCp, C7732FCj c7732FCj, Object obj, Runnable runnable, Executor executor, boolean z) {
        this.A0I = context;
        this.A0N = obj;
        this.A0R = executor;
        this.A0M = c7732FCj;
        this.A0Q = runnable;
        this.A0S = z;
        Looper mainLooper = Looper.getMainLooper();
        C7384Etj.A0U(mainLooper);
        this.A0K = new FEH(mainLooper, this);
        A0T.incrementAndGet();
        this.A08 = -1;
        this.A09 = -1;
        this.A0P = C3cG.A0h();
        AtomicInteger atomicInteger = FEO.A00;
        int iA00 = atomicInteger.get();
        if (iA00 == -1) {
            Object systemService = context.getSystemService("window");
            C7384Etj.A0Z(systemService, C8j2.A00(70));
            double refreshRate = ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
            iA00 = Ab3.A00(1.0E9d / (refreshRate < 0.0d ? 60.0d : ATD.A00(refreshRate, 30.0d, 240.0d)));
            atomicInteger.compareAndSet(-1, iA00);
        }
        this.A0G = iA00;
        this.A0H = System.nanoTime();
        this.A07 = -1;
        this.A00 = -1;
        this.A01 = C7828FGj.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0O = C3cG.A0T();
        this.A0J = interfaceC7738FCp;
        C7733FCk<ResolveState, RenderContext, StateUpdateType> c7733FCk = new C7733FCk();
        c7733FCk.A00 = this;
        this.A0L = c7733FCk;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ResolveState, State] */
    public static final Integer A00(FED fed, C7736FCn c7736FCn, FCW fcw) {
        Integer num = C79.A0C;
        synchronized (fed) {
            int i = c7736FCn.A01;
            int i2 = fed.A08;
            if (i > i2) {
                fed.A08 = i;
                fed.A0C = fcw.A00;
                fed.A09 = c7736FCn.A00;
                fed.A06 = fcw.A01;
                List list = fcw.A02;
                if (list != null && !list.isEmpty()) {
                    C0862A6j.A00(fed.A0P).removeAll(list);
                }
                num = C79.A00;
            } else if (i == i2) {
                num = C79.A01;
            }
            if (C7384Etj.areEqual(fed.A0E, c7736FCn)) {
                fed.A0E = null;
            }
        }
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(FED fed, boolean z) {
        if (z) {
            fed.A0K.removeMessages(99);
        }
        boolean z2 = fed.A0S;
        synchronized (fed) {
            if (z2) {
                FEE<Object, RenderContext> fee = fed.A02;
                if (fee != 0) {
                    FEJ fej = fed.A05;
                    FET fet = fej != null ? fej.A02 : null;
                    FET fet2 = fee.A01;
                    if (fet != fet2) {
                        if (fej != null) {
                            fej.A00 = null;
                            fej.A01 = null;
                        }
                        FEJ fej2 = new FEJ(fet2, fed.A0J, fee.A04);
                        fed.A05 = fej2;
                        FGG fgg = fed.A04;
                        if (fgg != null) {
                            fgg.A01(fej2);
                            return;
                        }
                        return;
                    }
                    if (fej.A00 != null) {
                        State state = fee.A04;
                        InterfaceC7738FCp<Object> interfaceC7738FCp = fed.A0J;
                        C7384Etj.A0Y(interfaceC7738FCp, 2);
                        fej.A01 = state;
                        fej.A00 = interfaceC7738FCp;
                    } else {
                        fed.A0J.A6d(null, fee.A04);
                    }
                }
            } else {
                FEE<Object, RenderContext> fee2 = fed.A02;
                if (fee2 != 0) {
                    fed.A0J.A6d(null, fee2.A04);
                    FEJ fej3 = fed.A05;
                    FET fet3 = fej3 != null ? fej3.A02 : null;
                    FET fet4 = fee2.A01;
                    if (fet3 != fet4) {
                        fed.A05 = new FEJ(fet4, null, null);
                        FGG fgg2 = fed.A04;
                        if (fgg2 != null) {
                            fgg2.A01(fed.A05);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x00a6, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x000f, B:10:0x0015, B:12:0x0019, B:17:0x003d, B:18:0x004a, B:20:0x004e, B:22:0x0068, B:24:0x006d, B:25:0x0080, B:28:0x0086, B:31:0x008c, B:33:0x0091, B:15:0x0036), top: B:42:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: all -> 0x00a6, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x000f, B:10:0x0015, B:12:0x0019, B:17:0x003d, B:18:0x004a, B:20:0x004e, B:22:0x0068, B:24:0x006d, B:25:0x0080, B:28:0x0086, B:31:0x008c, B:33:0x0091, B:15:0x0036), top: B:42:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(long r12, int[] r14) {
        /*
            r11 = this;
            java.lang.Runnable r0 = r11.A0Q
            if (r0 == 0) goto L7
            r0.run()
        L7:
            monitor-enter(r11)
            boolean r0 = r11.A0F     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r1 = 1
            r5 = r12
            if (r0 == 0) goto L36
            long r2 = r11.A01     // Catch: java.lang.Throwable -> La6
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L36
        L15:
            X.FEJ r0 = r11.A05     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L4a
            X.FET r0 = r0.A02     // Catch: java.lang.Throwable -> La6
            X.FGW r0 = r0.A03     // Catch: java.lang.Throwable -> La6
            long r7 = r0.A00     // Catch: java.lang.Throwable -> La6
            int r3 = X.FGW.A00(r0)     // Catch: java.lang.Throwable -> La6
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02     // Catch: java.lang.Throwable -> La6
            android.graphics.Rect r2 = r0.A03     // Catch: java.lang.Throwable -> La6
            int r0 = r2.height()     // Catch: java.lang.Throwable -> La6
            long r9 = X.FEP.A00(r3, r0)     // Catch: java.lang.Throwable -> La6
            boolean r0 = X.AbstractC7826FGh.A02(r5, r7, r9)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L4a
            goto L3b
        L36:
            r11.A0F = r1     // Catch: java.lang.Throwable -> La6
            r11.A01 = r12     // Catch: java.lang.Throwable -> La6
            goto L15
        L3b:
            if (r14 == 0) goto L8a
            int r0 = r2.width()     // Catch: java.lang.Throwable -> La6
            r14[r4] = r0     // Catch: java.lang.Throwable -> La6
            int r0 = r2.height()     // Catch: java.lang.Throwable -> La6
            r14[r1] = r0     // Catch: java.lang.Throwable -> La6
            goto L8a
        L4a:
            X.FEE<java.lang.Object, RenderContext> r3 = r11.A02     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L80
            X.FGW r0 = r3.A03     // Catch: java.lang.Throwable -> La6
            long r7 = r0.A00     // Catch: java.lang.Throwable -> La6
            int r2 = X.FGW.A00(r0)     // Catch: java.lang.Throwable -> La6
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02     // Catch: java.lang.Throwable -> La6
            android.graphics.Rect r0 = r0.A03     // Catch: java.lang.Throwable -> La6
            int r0 = r0.height()     // Catch: java.lang.Throwable -> La6
            long r9 = X.FEP.A00(r2, r0)     // Catch: java.lang.Throwable -> La6
            boolean r0 = X.AbstractC7826FGh.A02(r5, r7, r9)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L80
            A02(r11, r1)     // Catch: java.lang.Throwable -> La6
            if (r14 == 0) goto L8a
            X.FGW r0 = r3.A03     // Catch: java.lang.Throwable -> La6
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02     // Catch: java.lang.Throwable -> La6
            android.graphics.Rect r2 = r0.A03     // Catch: java.lang.Throwable -> La6
            int r0 = r2.width()     // Catch: java.lang.Throwable -> La6
            r14[r4] = r0     // Catch: java.lang.Throwable -> La6
            int r0 = r2.height()     // Catch: java.lang.Throwable -> La6
            r14[r1] = r0     // Catch: java.lang.Throwable -> La6
            goto L8a
        L80:
            X.FCl<ResolveState, RenderContext, StateUpdateType> r0 = r11.A03     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L8c
            if (r14 == 0) goto L8a
            r14[r4] = r4     // Catch: java.lang.Throwable -> La6
            r14[r1] = r4     // Catch: java.lang.Throwable -> La6
        L8a:
            monitor-exit(r11)
            return
        L8c:
            X.FDd<RenderContext> r0 = r11.A0C     // Catch: java.lang.Throwable -> La6
            r1 = 0
            if (r0 != 0) goto L96
            X.FCn<ResolveState, RenderContext, StateUpdateType> r1 = r11.A0E     // Catch: java.lang.Throwable -> La6
            r1.getClass()     // Catch: java.lang.Throwable -> La6
        L96:
            monitor-exit(r11)
            if (r1 == 0) goto La2
            java.lang.Object r0 = r1.A00()
            X.FCW r0 = (X.FCW) r0
            A00(r11, r1, r0)
        La2:
            A03(r11, r14)
            return
        La6:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FED.A04(long, int[]):void");
    }

    /* JADX WARN: Incorrect types in method signature: (TStateUpdateType;)V */
    @Override // X.FCX
    public final void AAk(FCT fct) {
        this.A0L.AAk(fct);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.FCn, X.FCn<ResolveState, RenderContext, StateUpdateType>] */
    public static final void A01(InterfaceC7734FCl interfaceC7734FCl, FED fed, boolean z) {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        synchronized (fed) {
            if (interfaceC7734FCl != null) {
                fed.A03 = interfaceC7734FCl;
            } else if (fed.A0P.isEmpty()) {
                return;
            }
            InterfaceC7734FCl<ResolveState, RenderContext, StateUpdateType> interfaceC7734FCl2 = fed.A03;
            if (interfaceC7734FCl2 == 0) {
                throw AbstractC7608F5v.A0e();
            }
            FCX fcx = fed.A0L;
            InterfaceC7751FDd<RenderContext> interfaceC7751FDd = fed.A0C;
            ResolveState resolvestate = fed.A06;
            List<StateUpdateType> list = fed.A0P;
            List listA0t = list.isEmpty() ? C0881AGi.A00 : BV4.A0t(list);
            int i = fed.A0B;
            fed.A0B = i + 1;
            int i2 = fed.A0G;
            ?? c7736FCn = new C7736FCn(interfaceC7751FDd, interfaceC7734FCl2, fcx, resolvestate, listA0t, i, i2 <= 0 ? 0 : Ab3.A00(((System.nanoTime() - fed.A0H) * 1.0d) / i2));
            c10543HqvA0z.element = c7736FCn;
            fed.A0E = c7736FCn;
            if (z) {
                fed.A0R.execute(new FEK(fed, c10543HqvA0z));
                return;
            }
            C7736FCn c7736FCn2 = (C7736FCn) c10543HqvA0z.element;
            if (A00(fed, c7736FCn2, (FCW) c7736FCn2.A00()).intValue() == 0) {
                A03(fed, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000b, B:10:0x000f, B:12:0x0014, B:14:0x001c, B:16:0x0024, B:18:0x0028, B:24:0x0051, B:26:0x0059, B:28:0x005f, B:30:0x0067, B:32:0x0070, B:34:0x0078, B:52:0x00af, B:54:0x00ba, B:19:0x002c, B:53:0x00b4), top: B:60:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.FED r13, int[] r14) {
        /*
            boolean r6 = X.AbstractC8162FXe.A03()
            monitor-enter(r13)
            boolean r0 = r13.A0F     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto Lb
            monitor-exit(r13)
            return
        Lb:
            X.FDd<RenderContext> r8 = r13.A0C     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto Lb4
            X.FEG<RenderContext> r2 = r13.A0D     // Catch: java.lang.Throwable -> Lbb
            r1 = 0
            if (r2 == 0) goto L2c
            X.FDd<RenderContext> r0 = r2.A02     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L2c
            long r4 = r13.A01     // Catch: java.lang.Throwable -> Lbb
            long r2 = r2.A01     // Catch: java.lang.Throwable -> Lbb
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L2c
        L24:
            X.FEG<RenderContext> r9 = r13.A0D     // Catch: java.lang.Throwable -> Lbb
            if (r9 == 0) goto Laf
            r3 = 1
            int r10 = r13.A09     // Catch: java.lang.Throwable -> Lbb
            goto L46
        L2c:
            int r10 = r13.A0A     // Catch: java.lang.Throwable -> Lbb
            int r0 = r10 + 1
            r13.A0A = r0     // Catch: java.lang.Throwable -> Lbb
            X.FEF r0 = new X.FEF     // Catch: java.lang.Throwable -> Lbb
            r0.<init>(r8, r13, r10)     // Catch: java.lang.Throwable -> Lbb
            X.Hhq r9 = new X.Hhq     // Catch: java.lang.Throwable -> Lbb
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            long r11 = r13.A01     // Catch: java.lang.Throwable -> Lbb
            X.FEG r7 = new X.FEG     // Catch: java.lang.Throwable -> Lbb
            r7.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbb
            r13.A0D = r7     // Catch: java.lang.Throwable -> Lbb
            goto L24
        L46:
            monitor-exit(r13)
            r11 = 0
            X.Hhq<X.FEE<java.lang.Object, RenderContext>> r0 = r9.A03     // Catch: java.lang.Throwable -> La9
            java.lang.Object r8 = r0.A00()     // Catch: java.lang.Throwable -> La9
            X.FEE r8 = (X.FEE) r8     // Catch: java.lang.Throwable -> La9
            monitor-enter(r13)
            long r6 = r13.A01     // Catch: java.lang.Throwable -> Lbb
            long r4 = r9.A01     // Catch: java.lang.Throwable -> Lbb
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L6f
            int r2 = r9.A00     // Catch: java.lang.Throwable -> Lbb
            int r0 = r13.A07     // Catch: java.lang.Throwable -> Lbb
            if (r2 <= r0) goto L6f
            X.FEE<java.lang.Object, RenderContext> r0 = r13.A02     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = X.C7384Etj.areEqual(r0, r8)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto L6f
            r13.A07 = r2     // Catch: java.lang.Throwable -> Lbb
            r13.A00 = r10     // Catch: java.lang.Throwable -> Lbb
            r13.A02 = r8     // Catch: java.lang.Throwable -> Lbb
            r2 = 1
            goto L70
        L6f:
            r2 = 0
        L70:
            X.FEG<RenderContext> r0 = r13.A0D     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = X.C7384Etj.areEqual(r0, r9)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L7a
            r13.A0D = r1     // Catch: java.lang.Throwable -> Lbb
        L7a:
            monitor-exit(r13)
            if (r14 == 0) goto L8f
            X.FGW r0 = r8.A03
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02
            android.graphics.Rect r1 = r0.A03
            int r0 = r1.width()
            r14[r11] = r0
            int r0 = r1.height()
            r14[r3] = r0
        L8f:
            if (r2 == 0) goto L9a
            boolean r0 = X.AbstractC8162FXe.A03()
            if (r0 == 0) goto L9b
            A02(r13, r3)
        L9a:
            return
        L9b:
            X.FEH r2 = r13.A0K
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L9a
            r2.sendEmptyMessage(r1)
            return
        La9:
            r0 = move-exception
            if (r6 == 0) goto Lae
            monitor-enter(r13)
            monitor-exit(r13)
        Lae:
            throw r0
        Laf:
            java.lang.IllegalArgumentException r0 = X.AbstractC7608F5v.A0e()     // Catch: java.lang.Throwable -> Lbb
            goto Lba
        Lb4:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)     // Catch: java.lang.Throwable -> Lbb
        Lba:
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FED.A03(X.FED, int[]):void");
    }
}
