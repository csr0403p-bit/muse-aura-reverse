package X;

import com.facebook.analytics2.healthcounter.HCLogDataStruct;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DGx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4950DGx implements DGS {
    public static C4950DGx A01;
    public static DHE A02;
    public static DHH A03;
    public static HandlerC4951DGy A04;
    public static C4943DGh A05;
    public static boolean A06;
    public static boolean A07;
    public static final DHL A08 = new DHL();
    public DG4 A00;

    @Override // X.DGS
    public final void APw(String str, String str2, long j, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        APx(str, str2, str3, null, j);
    }

    @Override // X.DGS
    public final void APx(String str, String str2, String str3, Function0 function0, long j) {
        String str4;
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        if (A02 == null) {
            C7384Etj.A0b("clientSamplingHandler");
            throw F60.createAndThrow();
        }
        if (function0 == null || !(A07 || A06)) {
            str4 = "";
        } else {
            try {
                str4 = (String) function0.invoke();
                if (str4 == null) {
                    str4 = "{error: \"Failed to execute payload callback\"}";
                }
            } catch (Exception e) {
                CFK.A08("Analytics2HealthCounterLogger", "Failed to execute payload callback", e);
                str4 = "{error: \"Failed to parse debug data payload\"}";
            }
        }
        HandlerC4951DGy handlerC4951DGy = A04;
        if (handlerC4951DGy == null) {
            C7384Etj.A0b("hcLogQueue");
            throw F60.createAndThrow();
        }
        handlerC4951DGy.sendMessage(handlerC4951DGy.obtainMessage(handlerC4951DGy.A00, new HCLogDataStruct(0L, str, j, str2, str3, str4)));
    }
}
