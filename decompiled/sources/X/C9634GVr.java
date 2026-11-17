package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.LogPersistenceProxy;

/* renamed from: X.GVr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9634GVr extends LogPersistenceProxy {
    @Override // com.facebook.rsys.log.gen.LogPersistenceProxy
    public final void deleteCallSummaryLog(String str) {
        C7384Etj.A0Y(str, 0);
    }

    @Override // com.facebook.rsys.log.gen.LogPersistenceProxy
    public final void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str) {
        AnonymousClass003.A0u(callSummaryInfo, str);
    }
}
