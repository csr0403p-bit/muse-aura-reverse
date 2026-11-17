package com.facebook.aura.perf;

import X.AnonymousClass001;
import X.BV6;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.FNA;

/* loaded from: classes6.dex */
public final class RealHatchNavTTRCTrace implements HatchNavTTRCTrace {
    public final FNA trace;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C79.A00(7).length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C79.A00(5).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealHatchNavTTRCTrace(FNA fna) {
        C7384Etj.A0Y(fna, 0);
        this.trace = fna;
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void annotate(String str, Object obj) {
        C7384Etj.A0Y(str, 0);
        if (obj != null) {
            if (obj instanceof Boolean) {
                this.trace.AQG(str, AnonymousClass001.A1X(obj));
                return;
            }
            if (obj instanceof Double) {
                this.trace.AQC(str, BV6.A00(obj));
                return;
            }
            if (obj instanceof Integer) {
                this.trace.AQD(str, AnonymousClass001.A0F(obj));
                return;
            }
            boolean z = obj instanceof Long;
            FNA fna = this.trace;
            if (z) {
                fna.AQE(str, C3cG.A05(obj));
            } else {
                fna.AQF(str, obj.toString());
            }
        }
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void cancel(String str) {
        C7384Etj.A0Y(str, 0);
        this.trace.APa(str);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void completeStep(String str) {
        C7384Etj.A0Y(str, 0);
        if (isStepPending(str)) {
            this.trace.AgO(str);
        }
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void displayQuery(String str) {
        C7384Etj.A0Y(str, 0);
        if (isQueryPending(str)) {
            this.trace.AR7(str, true);
        }
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void fail(String str) {
        C7384Etj.A0Y(str, 0);
        this.trace.fail(str);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public boolean isQueryPending(String str) {
        int iIntValue;
        C7384Etj.A0Y(str, 0);
        Integer numAJK = this.trace.AJK(str);
        return numAJK != null && ((iIntValue = numAJK.intValue()) == 0 || iIntValue == 2 || iIntValue == 1);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public boolean isStepPending(String str) {
        C7384Etj.A0Y(str, 0);
        return this.trace.AL5(str) == C79.A00;
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void markerPoint(String str) {
        C7384Etj.A0Y(str, 0);
        this.trace.markerPoint(str);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void registerNetworkOnlyQuery(String str) {
        C7384Etj.A0Y(str, 0);
        this.trace.A3i(str);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void registerStep(String str) {
        C7384Etj.A0Y(str, 0);
        this.trace.A3x(str);
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void revokeQuery(String str) {
        C7384Etj.A0Y(str, 0);
        if (isQueryPending(str)) {
            this.trace.AYw(str);
        }
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public void revokeStep(String str) {
        C7384Etj.A0Y(str, 0);
        if (isStepPending(str)) {
            this.trace.AgP(str);
        }
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public int getInstanceId() {
        return this.trace.AGc();
    }

    @Override // com.facebook.aura.perf.HatchNavTTRCTrace
    public HatchNavTTRCTraceTerminalState getTerminalState() {
        int iIntValue = this.trace.ALs().intValue();
        if (iIntValue == 3) {
            return HatchNavTTRCTraceTerminalState.SUCCESS;
        }
        if (iIntValue == 4 || iIntValue == 5 || iIntValue == 6) {
            return HatchNavTTRCTraceTerminalState.FAILURE;
        }
        return null;
    }
}
