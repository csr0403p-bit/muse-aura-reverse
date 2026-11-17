package com.facebook.aura.bugreport;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C10571Hud;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7qW;
import X.C9oY;
import X.CFK;
import X.CFP;
import X.DCl;
import X.HsJ;
import android.content.Context;
import com.facebook.aura.devices.intf.BugReportSectionContributor;
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import com.facebook.aura.network.transport.AuraNetworkLogEntry;
import com.facebook.aura.network.transport.AuraNetworkLogRecorder;
import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class AuraNetworkLogBugReportContributor implements BugReportSectionContributor {
    public static final int $stable = 0;
    public static final String HAR_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final AuraNetworkLogBugReportContributor INSTANCE = new AuraNetworkLogBugReportContributor();
    public static final String NETWORK_STACK_FILE_NAME = "mobile_network_stack.txt";
    public static final String TAG = "AuraNetworkLogBugReport";
    public static final String UNSUPPORTED_REPORT = "Unsupported.";

    public final String buildNetworkStackHar$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(JsonObject jsonObject, List<AuraNetworkLogEntry> list) {
        List list2;
        List list3;
        C7384Etj.A0Y(list, 1);
        JsonElement jsonElementA1F = jsonObject != null ? C60O.A1F(AuraCvmPushReplayStore.ENTRIES_KEY, jsonObject) : null;
        if (!(jsonElementA1F instanceof JsonArray) || (list2 = (JsonArray) jsonElementA1F) == null) {
            list2 = C0881AGi.A00;
        }
        JsonElement jsonElementA1F2 = jsonObject != null ? C60O.A1F("_connectionEvents", jsonObject) : null;
        if (!(jsonElementA1F2 instanceof JsonArray) || (list3 = (JsonArray) jsonElementA1F2) == null) {
            list3 = C0881AGi.A00;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HAR_DATE_FORMAT, Locale.US);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<AuraNetworkLogEntry> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(INSTANCE.toHarEntry(it.next(), simpleDateFormat));
        }
        if (list2.isEmpty() && arrayListA0i.isEmpty() && list3.isEmpty()) {
            return null;
        }
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A08("log", new AuraNetworkLogBugReportContributor$buildNetworkStackHar$har$1$1(list3, list2, arrayListA0i), c2nwA1K);
        return C60O.A0v(c2nwA1K);
    }

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public File collectAttachment(Context context, AbstractC3358CGz abstractC3358CGz, File file) {
        C7384Etj.A0Y(file, 2);
        String strBuildNetworkStackHar = buildNetworkStackHar();
        if (strBuildNetworkStackHar == null) {
            return null;
        }
        try {
            File fileA0O = C3cG.A0O(file, NETWORK_STACK_FILE_NAME);
            CFP.A05(fileA0O, strBuildNetworkStackHar, DCl.A05);
            return fileA0O;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to write network stack file", e);
            return null;
        }
    }

    private final JsonObject nativeMnsLog() {
        Object objA0s;
        try {
            String strGenerateBugReport = AuraTigonServiceProvider.INSTANCE.generateBugReport();
            if (C7BY.A0j(strGenerateBugReport) || UNSUPPORTED_REPORT.equals(strGenerateBugReport)) {
                return null;
            }
            try {
                JsonElement jsonElementA1F = C60O.A1F("log", C60Q.A13(strGenerateBugReport));
                objA0s = jsonElementA1F != null ? C9oY.A05(jsonElementA1F) : null;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                CFK.A08(TAG, "Failed to parse Tigon network report", thA00);
            }
            return (JsonObject) (objA0s instanceof C10571Hud ? null : objA0s);
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to generate Tigon network report", e);
            return null;
        }
    }

    private final String buildNetworkStackHar() {
        return buildNetworkStackHar$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(nativeMnsLog(), AuraNetworkLogRecorder.INSTANCE.snapshot());
    }

    private final JsonElement toHarEntry(AuraNetworkLogEntry auraNetworkLogEntry, SimpleDateFormat simpleDateFormat) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("startedDateTime", simpleDateFormat.format(new Date(auraNetworkLogEntry.startedAtMs)), c2nwA1K);
        C7qW.A05(Long.valueOf(auraNetworkLogEntry.durationMs), "time", c2nwA1K);
        C7qW.A08("request", new AuraNetworkLogBugReportContributor$toHarEntry$1$1(auraNetworkLogEntry), c2nwA1K);
        C7qW.A08(HatchPasskeyW3cKt.RESPONSE_KEY, new AuraNetworkLogBugReportContributor$toHarEntry$1$2(auraNetworkLogEntry), c2nwA1K);
        C7qW.A08("timings", AuraNetworkLogBugReportContributor$toHarEntry$1$3.INSTANCE, c2nwA1K);
        return c2nwA1K.A00();
    }

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public String summarySection(Context context, AbstractC3358CGz abstractC3358CGz) {
        return null;
    }
}
