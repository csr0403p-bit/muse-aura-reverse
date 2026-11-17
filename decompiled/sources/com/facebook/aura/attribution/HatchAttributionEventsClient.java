package com.facebook.aura.attribution;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.BV6;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.C9jH;
import X.CFK;
import X.CZ9;
import X.CZI;
import X.CZN;
import X.CZQ;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.attribution.AttributionStefiPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchAttributionEventsClient {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchAttributionEventsClient";
    public final CZI debugLogger;
    public final G0U<Boolean, Unit> onSettled;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.attribution.HatchAttributionEventsClient$send$1", f = "HatchAttributionEventsClient.kt", l = {133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.attribution.HatchAttributionEventsClient$send$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CZQ $callback;
        public final /* synthetic */ List<String> $eventNames;
        public final /* synthetic */ ReportAttributionEventsRequestJson $request;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ HatchAttributionEventsClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, ReportAttributionEventsRequestJson reportAttributionEventsRequestJson, HatchAttributionEventsClient hatchAttributionEventsClient, CZQ czq, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$eventNames = list;
            this.$request = reportAttributionEventsRequestJson;
            this.this$0 = hatchAttributionEventsClient;
            this.$callback = czq;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$eventNames, this.$request, this.this$0, this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CFK.A03(AbstractC06907md.A01(", ", this.$eventNames, null), HatchAttributionEventsClient.TAG, "Sending %s");
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                AttributionStefiPath.AttributionReportEvents attributionReportEvents = AttributionStefiPath.AttributionReportEvents.INSTANCE;
                ReportAttributionEventsRequestJson reportAttributionEventsRequestJson = this.$request;
                RequestType requestType = RequestType.POST;
                C9jH c9jHA0E = AGH.A0E();
                HatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = hatchHttpApi.m1604executeStefiRequestWithjLovISM(hatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchAttributionEventsClient$send$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, attributionReportEvents, reportAttributionEventsRequestJson, requestType, c9jHA0E, true, null, false, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                objM1604executeStefiRequestWithjLovISM = ((HsJ) obj).value;
            }
            List<String> list = this.$eventNames;
            HatchAttributionEventsClient hatchAttributionEventsClient = this.this$0;
            CZQ czq = this.$callback;
            Throwable thA00 = HsJ.A00(objM1604executeStefiRequestWithjLovISM);
            if (thA00 == null) {
                CFK.A03(AbstractC06907md.A01(", ", list, null), HatchAttributionEventsClient.TAG, "Sent %s");
                AnonymousClass001.A1K(true, hatchAttributionEventsClient.onSettled);
                CZN czn = (CZN) czq;
                CZI czi = czn.A01.A04;
                if (czi != null) {
                    CZI.A01(CZI.A00("report_events_success", null, null, czn.A00), "info", czi);
                }
            } else {
                AnonymousClass001.A1K(false, hatchAttributionEventsClient.onSettled);
                HatchAttributionEventsClientKt.logAttributionFailure(AttributionStefiPath.AttributionReportEvents.INSTANCE.getValue(), thA00);
                czq.ATI(HatchAttributionEventsClientKt.attributionFailureMessage(thA00), thA00);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public void reportAdid(String str, CZQ czq) {
        C7384Etj.A0Y(czq, 1);
        CFK.A06(TAG, "reportAdid is unsupported: no Stefi endpoint for report_advertiser_id");
        czq.ATI("report_advertiser_id has no Stefi endpoint", null);
    }

    public void send(List<? extends CZ9> list, String str, boolean z, String str2, String str3, CZQ czq) {
        AnonymousClass002.A1D(list, 0, czq);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends CZ9> it = list.iterator();
        while (it.hasNext()) {
            String strEventName = eventName(it.next());
            if (strEventName != null) {
                arrayListA0h.add(strEventName);
            }
        }
        if (arrayListA0h.size() != list.size()) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (CZ9 cz9 : list) {
                if (eventName(cz9) == null) {
                    arrayListA0h2.add(cz9);
                }
            }
            CZI.A01(CZI.A00("unsupported_event_types", null, null, arrayListA0h2), "error", this.debugLogger);
            CFK.A0H(TAG, "Dropping event types with no wire name: %s", AbstractC06907md.A01(", ", arrayListA0h2, null));
        }
        if (arrayListA0h.isEmpty()) {
            AnonymousClass001.A1K(true, this.onSettled);
            czq.ATI("No attribution events to report", null);
            return;
        }
        boolean z2 = z || str == null || str.length() == 0;
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            String str4 = str;
            if (z2) {
                str4 = null;
            }
            arrayListA0i.add(new AttributionEventJson(strA0j, str4, z2));
        }
        AnonymousClass001.A1J(new AnonymousClass1(arrayListA0h, new ReportAttributionEventsRequestJson(arrayListA0i, BV5.A0j()), this, czq, null), this.scope);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CZ9.values().length];
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttributionEventsClient(CZI czi, G0U<? super Boolean, Unit> g0u) {
        AnonymousClass003.A0u(czi, g0u);
        this.debugLogger = czi;
        this.onSettled = g0u;
        this.scope = C78T.A00();
    }

    private final String eventName(CZ9 cz9) {
        switch (cz9.ordinal()) {
            case 0:
                return "LOGIN";
            case 1:
                return "REGISTRATION";
            case 2:
                return "CONFIRMATION";
            case 3:
                return "EXISTING_SESSION_LOGIN";
            case 4:
                return "RESURRECTION";
            case 5:
                return "FIRST_APP_LAUNCH";
            default:
                return null;
        }
    }
}
