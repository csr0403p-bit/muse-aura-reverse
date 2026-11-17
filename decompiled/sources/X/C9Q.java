package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.EventBuilder;

/* loaded from: classes5.dex */
public final class C9Q implements Runnable {
    public static final String __redex_internal_original_name = "UnexpectedEventBuilderImpl$report$1";
    public final /* synthetic */ C9O A00;

    public C9Q(C9O c9o) {
        this.A00 = c9o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9O c9o = this.A00;
        F18<String> f18 = c9o.A00;
        if (f18 == null) {
            throw C3cG.A0Q("mReportSourceRefProvider is null");
        }
        EventBuilder eventBuilder = c9o.A01;
        eventBuilder.annotate(ErrorReportingConstants.REPORT_SOURCE_REF, f18.AMN());
        eventBuilder.report();
    }
}
