package com.facebook.aura.perf;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.DKe;
import X.F8H;
import X.FNA;
import X.HrW;
import X.HuE;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNavTTRCLogger implements HatchNavTTRCTraceLogger {
    public final HrW clock;
    public final Function0<DKe> errorReporterFactory;
    public final TraceFactory traceFactory;
    public final F8H traceStore;

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCLogger$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<DKe> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DKe invoke() {
            return new HatchNavTTRCErrorReporter();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ DKe invoke() {
            return new HatchNavTTRCErrorReporter();
        }
    }

    public final class RealTraceFactory implements TraceFactory {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        @Override // com.facebook.aura.perf.HatchNavTTRCLogger.TraceFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public X.FNA create(com.facebook.aura.perf.HatchNavTTRCStartTraceParams r15, X.HrW r16, X.F8H r17, X.DKe r18) {
            /*
                r14 = this;
                r1 = 0
                r2 = r15
                X.C7384Etj.A0Y(r15, r1)
                r0 = 1
                r7 = r16
                r9 = r17
                r8 = r18
                X.AnonymousClass005.A11(r7, r9, r8, r0)
                long r14 = r7.now()
                java.lang.Long r0 = r2.touchUpTimeMs
                if (r0 == 0) goto L58
                long r16 = r0.longValue()
            L1b:
                com.facebook.quicklog.QuickPerformanceLogger r10 = X.C60O.A0g()
                int r12 = r2.markerId
                int r13 = r2.instanceId
                java.lang.Long r0 = r2.touchUpTimeMs
                boolean r18 = X.AnonymousClass002.A1X(r0)
                java.lang.String r11 = r2.touchUpModule
                X.C7384Etj.A0Y(r10, r1)
                r5 = 2001(0x7d1, double:9.886E-321)
                r3 = 0
                int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
                if (r0 <= 0) goto L46
                long r1 = r14 - r16
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L46
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 >= 0) goto L46
            L40:
                X.DKY r6 = new X.DKY
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
                return r6
            L46:
                int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
                if (r0 <= 0) goto L55
                long r1 = r14 - r16
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L55
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 >= 0) goto L55
                goto L40
            L55:
                r16 = -1
                goto L40
            L58:
                r16 = r14
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.perf.HatchNavTTRCLogger.RealTraceFactory.create(com.facebook.aura.perf.HatchNavTTRCStartTraceParams, X.HrW, X.F8H, X.DKe):X.FNA");
        }
    }

    public interface TraceFactory {
        FNA create(HatchNavTTRCStartTraceParams hatchNavTTRCStartTraceParams, HrW hrW, F8H f8h, DKe dKe);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTraceLogger
    public HatchNavTTRCTrace startTrace(HatchNavTTRCStartTraceParams hatchNavTTRCStartTraceParams) {
        C7384Etj.A0Y(hatchNavTTRCStartTraceParams, 0);
        FNA fnaCreate = this.traceFactory.create(hatchNavTTRCStartTraceParams, this.clock, this.traceStore, this.errorReporterFactory.invoke());
        this.traceStore.A37(fnaCreate);
        return new RealHatchNavTTRCTrace(fnaCreate);
    }

    public /* synthetic */ HatchNavTTRCLogger(HrW hrW, F8H f8h, TraceFactory traceFactory, Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchNavTTRCClock.INSTANCE : hrW, (i & 2) != 0 ? HuE.A05.A00() : f8h, (i & 4) != 0 ? new RealTraceFactory() : traceFactory, (i & 8) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNavTTRCLogger(HrW hrW, F8H f8h, TraceFactory traceFactory, Function0<? extends DKe> function0) {
        AnonymousClass005.A14(hrW, f8h, traceFactory, function0);
        this.clock = hrW;
        this.traceStore = f8h;
        this.traceFactory = traceFactory;
        this.errorReporterFactory = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNavTTRCLogger() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }
}
