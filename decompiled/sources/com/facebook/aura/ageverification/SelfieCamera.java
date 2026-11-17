package com.facebook.aura.ageverification;

import X.AbstractC2440BbT;
import X.AbstractC2552Bdd;
import X.AbstractC2559Bdn;
import X.AnonymousClass007;
import X.BV4;
import X.BV6;
import X.BV8;
import X.Bd8;
import X.BdD;
import X.Be1;
import X.Be3;
import X.BeS;
import X.Bf1;
import X.Bf3;
import X.Bf7;
import X.Bf9;
import X.BfA;
import X.BfL;
import X.Bg6;
import X.Bm8;
import X.BnR;
import X.C2421Bax;
import X.C2439BbS;
import X.C2442BbV;
import X.C2549Bda;
import X.C2582Bee;
import X.C2584Beg;
import X.C2594Bes;
import X.C2595Bet;
import X.C2599Bex;
import X.C2601Bez;
import X.C2678Bha;
import X.C2688Bhn;
import X.C2823Bm4;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.HtJ;
import X.HzP;
import X.InterfaceC2551Bdc;
import X.InterfaceC2695Bhv;
import android.content.Context;
import android.util.Range;
import android.util.Size;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.store.HatchCvmChipSelectionBudget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class SelfieCamera {
    public static final int $stable = 8;
    public Bm8 activeRecording;
    public final BfL analysis;
    public final Executor analysisExecutor;
    public final Context context;
    public final Executor executor;
    public final BfA preview;
    public C2678Bha provider;
    public final Bf9<C2823Bm4> videoCapture;

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCamera", f = "SelfieCamera.kt", l = {71}, m = "bind", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCamera$bind$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelfieCamera.this.bind(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCamera", f = "SelfieCamera.kt", l = {131, 133}, m = HatchCvmChipSelectionBudget.LEGACY_KEY_RECORD, v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCamera$record$1, reason: invalid class name and case insensitive filesystem */
    public final class C108951 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C108951(HtJ<? super C108951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelfieCamera.this.record(null, null, this);
        }
    }

    public SelfieCamera(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        Executor mainExecutor = context.getMainExecutor();
        C7384Etj.A0U(mainExecutor);
        this.executor = mainExecutor;
        this.preview = new C2599Bex().A00();
        InterfaceC2695Bhv interfaceC2695Bhv = C2823Bm4.A0q;
        Range<Integer> range = Be3.A00;
        Range<Integer> range2 = Be3.A01;
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        Be1 be1 = new Be1(range, range2, -1);
        C2439BbS c2439BbS = AbstractC2440BbT.A02;
        Bd8 bd8A00 = BdD.A00(AbstractC2440BbT.A00, AbstractC2440BbT.A01, c2439BbS, -1);
        C2421Bax c2421Bax = C2421Bax.A01;
        C2442BbV c2442BbV = new C2442BbV(c2421Bax, 3);
        BeS.A03(c2421Bax, "quality cannot be null");
        BeS.A06(C2421Bax.A08.contains(c2421Bax), AnonymousClass007.A0a("Invalid quality: ", c2421Bax));
        C2439BbS c2439BbS2 = new C2439BbS(c2442BbV, Collections.singletonList(c2421Bax));
        Bd8 bd8A002 = BdD.A00(bd8A00.A01, bd8A00.A02, c2439BbS2, Integer.valueOf(bd8A00.A00));
        C2439BbS c2439BbS3 = bd8A002.A03;
        C2823Bm4 c2823Bm4 = new C2823Bm4(AbstractC2559Bdn.A00(be1, BdD.A00(new Range(262144, 262144), bd8A002.A02, c2439BbS3, Integer.valueOf(bd8A002.A00)), -1), interfaceC2695Bhv, interfaceC2695Bhv);
        Bf9 bf9 = Bf9.$redex_init_class;
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        c2582BeeA00.ANl(C2594Bes.A03, c2823Bm4);
        this.videoCapture = new Bf9<>(new C2594Bes(C2584Beg.A02(new C2595Bet(c2582BeeA00).A00)));
        C2582Bee c2582Bee = new Bf3().A00;
        BV6.A11(Bf7.A01, c2582Bee, 0);
        Bf1 bf1 = Bf1.A00;
        Size sizeA0P = BV6.A0P(640, 480);
        C2549Bda c2549Bda = new C2549Bda();
        c2549Bda.A01 = sizeA0P;
        c2549Bda.A00 = 1;
        c2582Bee.ANl(InterfaceC2551Bdc.A05, new C2601Bez(bf1, c2549Bda, 0));
        Bf7 bf7 = new Bf7(C2584Beg.A02(c2582Bee));
        AbstractC2552Bdd.A00(bf7);
        this.analysis = new BfL(bf7);
        this.analysisExecutor = AuraExecutors.INSTANCE.createSerialExecutor();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bind(X.BoY r12, X.C1HY r13, final X.InterfaceC2692Bhr r14, X.HtJ<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCamera.bind(X.BoY, X.1HY, X.Bhr, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:30|(4:32|(3:34|(1:36)|37)(0)|69|(0)(0))|100|38|(5:40|(1:42)(2:44|(1:46)(3:47|48|53))|43|48|53)(2:49|50)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r5 = 5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:68:0x01b3, B:69:0x01b6, B:71:0x01bc, B:72:0x01c9, B:17:0x0049), top: B:95:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.Bm8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.Bm8] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Bm8] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object record(java.io.File r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.HtJ<? super kotlin.Unit> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCamera.record(java.io.File, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public final void stop() {
        Bm8 bm8 = this.activeRecording;
        if (bm8 != null) {
            bm8.close();
        }
    }

    public final void unbind() {
        C2678Bha c2678Bha = this.provider;
        if (c2678Bha != null) {
            c2678Bha.A04(this.preview, this.videoCapture, this.analysis);
        }
        BfL bfL = this.analysis;
        synchronized (bfL.A05) {
            BnR bnR = bfL.A04;
            bnR.A01();
            synchronized (bnR.A0D) {
                bnR.A05 = null;
                bnR.A0B = null;
            }
            if (bfL.A00 != null) {
                bfL.A07 = C79.A01;
                bfL.A0O();
            }
            bfL.A00 = null;
        }
    }

    private final C2688Bhn useCases(Bg6 bg6, BfL bfL) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        arrayListA0h.add(this.preview);
        arrayListA0h.add(this.videoCapture);
        arrayListA0h.add(bfL);
        BeS.A06(!arrayListA0h.isEmpty(), "UseCase must not be empty.");
        Iterator it = arrayListA0h2.iterator();
        if (!it.hasNext()) {
            return new C2688Bhn(bg6, arrayListA0h, arrayListA0h2);
        }
        it.next();
        throw BV4.A0a("getTargets");
    }
}
