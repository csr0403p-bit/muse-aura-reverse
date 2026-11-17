package com.facebook.aura.partners.voice.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.InterfaceC7549F2g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final class VoiceBugReportRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long MAX_VOICE_CALL_AGE_MS = 28800000;
    public final AtomicReference<VoiceBugReportInfo> ref;

    public final void updateLatestCallInfo(final G0U<? super VoiceBugReportInfo, VoiceBugReportInfo> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.ref.updateAndGet(new UnaryOperator(g0u) { // from class: com.facebook.aura.partners.voice.intf.VoiceBugReportRepository$sam$java_util_function_UnaryOperator$0
            public final /* synthetic */ G0U function;

            {
                C7384Etj.A0Y(g0u, 0);
                this.function = g0u;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
    }

    public static /* synthetic */ VoiceBugReportInfo freshLatestCallInfo$default(VoiceBugReportRepository voiceBugReportRepository, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return voiceBugReportRepository.freshLatestCallInfo(j);
    }

    public final String bugReportSummary() {
        String strA0r;
        StringBuilder sb = new StringBuilder();
        VoiceBugReportInfo voiceBugReportInfoFreshLatestCallInfo = freshLatestCallInfo(System.currentTimeMillis());
        if (voiceBugReportInfoFreshLatestCallInfo == null) {
            strA0r = "(no recent voice call)";
        } else {
            sb.append(FGI.A0M("sharedCallId: ", voiceBugReportInfoFreshLatestCallInfo.sharedCallId));
            sb.append('\n');
            sb.append(FGI.A0B(voiceBugReportInfoFreshLatestCallInfo.startedAtMillis, "startedAtMs: "));
            sb.append('\n');
            C3cJ.A0k(voiceBugReportInfoFreshLatestCallInfo.connectedAtMillis, "connectedAtMs: ", sb);
            C3cJ.A0k(voiceBugReportInfoFreshLatestCallInfo.endedAtMillis, "endedAtMs: ", sb);
            strA0r = FGI.A0r("isActive: ", voiceBugReportInfoFreshLatestCallInfo.isActive);
        }
        return AnonymousClass001.A0v(strA0r, sb);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.ref.set(null);
    }

    public final VoiceBugReportInfo getLatestCallInfo() {
        return this.ref.get();
    }

    public final void setLatestCallInfo(VoiceBugReportInfo voiceBugReportInfo) {
        this.ref.set(voiceBugReportInfo);
    }

    public final class Companion {
        public final VoiceBugReportRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceBugReportRepository) abstractC3358CGz.A03(VoiceBugReportRepository.class, VoiceBugReportRepository$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VoiceBugReportInfo freshLatestCallInfo(long j) {
        VoiceBugReportInfo latestCallInfo = getLatestCallInfo();
        if (latestCallInfo != null) {
            if (!latestCallInfo.isActive) {
                Long l = latestCallInfo.endedAtMillis;
                if (j - (l != null ? l.longValue() : latestCallInfo.startedAtMillis) <= MAX_VOICE_CALL_AGE_MS) {
                }
            }
            return latestCallInfo;
        }
        return null;
    }

    public /* synthetic */ VoiceBugReportRepository(C06H c06h) {
        this();
    }

    public VoiceBugReportRepository() {
        this.ref = new AtomicReference<>(null);
    }
}
