package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.ReleaseReason;
import com.hatch.browser.protocol.ReportEncodingOptions;
import com.hatch.browser.protocol.ReportView;
import com.hatch.browser.protocol.SettlementReceipt;

/* loaded from: classes6.dex */
public interface CommandReportInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object awaitSettlement(HtJ<? super SettlementReceipt> htJ);

    byte[] centralBlackholeSideband();

    Object encode(HtJ<? super byte[]> htJ);

    Object encodeCompact(ReportEncodingOptions reportEncodingOptions, HtJ<? super byte[]> htJ);

    /* renamed from: encodeNativeFacts-Qn1smSk */
    byte[] mo3227encodeNativeFactsQn1smSk(ReleaseReason releaseReason, int i);

    String failureDiagnostics();

    Object inspect(HtJ<? super ReportView> htJ);

    byte[] navigationSideband();
}
