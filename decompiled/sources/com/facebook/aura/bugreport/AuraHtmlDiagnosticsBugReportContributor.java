package com.facebook.aura.bugreport;

import X.A3Y;
import X.A3Z;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.CFP;
import X.DCl;
import X.FGI;
import android.content.Context;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.devices.intf.BugReportSectionContributor;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnosticsEntry;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnosticsRecorder;
import com.facebook.aura.webview.diagnostics.HatchHtmlEntrySource;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraHtmlDiagnosticsBugReportContributor implements BugReportSectionContributor {
    public static final int $stable = 0;
    public static final String HTML_DIAGNOSTICS_FILE_NAME = "html_diagnostics.txt";
    public static final AuraHtmlDiagnosticsBugReportContributor INSTANCE = new AuraHtmlDiagnosticsBugReportContributor();
    public static final String TAG = "AuraHtmlDiagnosticsBugReport";
    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public File collectAttachment(Context context, AbstractC3358CGz abstractC3358CGz, File file) {
        C7384Etj.A0Y(file, 2);
        List<HatchHtmlDiagnosticsEntry> listSnapshot = HatchHtmlDiagnosticsRecorder.INSTANCE.snapshot();
        if (listSnapshot.isEmpty()) {
            return null;
        }
        try {
            File fileA0O = C3cG.A0O(file, HTML_DIAGNOSTICS_FILE_NAME);
            CFP.A05(fileA0O, INSTANCE.render(listSnapshot), DCl.A05);
            return fileA0O;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to write HTML diagnostics file", e);
            return null;
        }
    }

    private final String render(List<HatchHtmlDiagnosticsEntry> list) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIMESTAMP_FORMAT, Locale.US);
        StringBuilder sbA0x = C60O.A0x("Hatch HTML rendering diagnostics\n");
        sbA0x.append(FGI.A0I("Most recent ", list.size(), " events (oldest first)."));
        sbA0x.append(PairsDiscretionDocument.OWNER_SEPARATOR);
        for (HatchHtmlDiagnosticsEntry hatchHtmlDiagnosticsEntry : list) {
            sbA0x.append(simpleDateFormat.format(new Date(hatchHtmlDiagnosticsEntry.atMs)));
            sbA0x.append(' ');
            HatchHtmlSurface hatchHtmlSurface = hatchHtmlDiagnosticsEntry.surface;
            sbA0x.append(hatchHtmlSurface.getWireName());
            sbA0x.append(" (");
            sbA0x.append(hatchHtmlSurface.getPipeline().getWireName());
            sbA0x.append(") ");
            sbA0x.append(hatchHtmlDiagnosticsEntry.event);
            HatchHtmlEntrySource hatchHtmlEntrySource = hatchHtmlDiagnosticsEntry.entrySource;
            if (hatchHtmlEntrySource != null) {
                sbA0x.append(FGI.A0M(" from=", hatchHtmlEntrySource.getWireName()));
            }
            Long l = hatchHtmlDiagnosticsEntry.durationMs;
            if (l != null) {
                sbA0x.append(FGI.A0J(InviteCodeScratcherKt.CODE_SEPARATOR, l.longValue(), "ms"));
            }
            HatchHtmlErrorCode hatchHtmlErrorCode = hatchHtmlDiagnosticsEntry.errorCode;
            if (hatchHtmlErrorCode != null) {
                sbA0x.append(FGI.A0M(" error=", hatchHtmlErrorCode.getWireName()));
            }
            String str = hatchHtmlDiagnosticsEntry.detail;
            if (str != null) {
                sbA0x.append(FGI.A0M(" | ", str));
            }
            sbA0x.append('\n');
        }
        return sbA0x.toString();
    }

    @Override // com.facebook.aura.devices.intf.BugReportSectionContributor
    public String summarySection(Context context, AbstractC3358CGz abstractC3358CGz) {
        List<HatchHtmlDiagnosticsEntry> listSnapshot = HatchHtmlDiagnosticsRecorder.INSTANCE.snapshot();
        if (listSnapshot.isEmpty()) {
            return null;
        }
        final ArrayList arrayListA0h = C3cG.A0h();
        for (HatchHtmlDiagnosticsEntry hatchHtmlDiagnosticsEntry : listSnapshot) {
            if (hatchHtmlDiagnosticsEntry.errorCode != null) {
                arrayListA0h.add(hatchHtmlDiagnosticsEntry);
            }
        }
        StringBuilder sbA0x = C60O.A0x("=== HTML Rendering ===\n");
        sbA0x.append(FGI.A0Y("Recorded events: ", " (", " failures)", listSnapshot.size(), arrayListA0h.size()));
        sbA0x.append('\n');
        if (!arrayListA0h.isEmpty()) {
            sbA0x.append("Failures by surface:\n");
            Iterator it = AbstractC0878AGe.A0c(A3Z.A00(new A3Y<HatchHtmlDiagnosticsEntry, String>() { // from class: com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor$summarySection$lambda$1$$inlined$groupingBy$1
                @Override // X.A3Y
                public String keyOf(HatchHtmlDiagnosticsEntry hatchHtmlDiagnosticsEntry2) {
                    return hatchHtmlDiagnosticsEntry2.surface.getWireName();
                }

                @Override // X.A3Y
                public Iterator<HatchHtmlDiagnosticsEntry> sourceIterator() {
                    return arrayListA0h.iterator();
                }
            }).entrySet(), new Comparator() { // from class: com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor$summarySection$lambda$1$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC7536F0j.A00((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
                }
            }).iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                sbA0x.append(FGI.A0V("  ", C60O.A0t(entryA0l), ": ", AnonymousClass001.A0F(entryA0l.getValue())));
                sbA0x.append('\n');
            }
            sbA0x.append("Failures by error code:\n");
            Iterator it2 = AbstractC0878AGe.A0c(A3Z.A00(new A3Y<HatchHtmlDiagnosticsEntry, String>() { // from class: com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor$summarySection$lambda$1$$inlined$groupingBy$2
                @Override // X.A3Y
                public String keyOf(HatchHtmlDiagnosticsEntry hatchHtmlDiagnosticsEntry2) {
                    String wireName;
                    HatchHtmlErrorCode hatchHtmlErrorCode = hatchHtmlDiagnosticsEntry2.errorCode;
                    return (hatchHtmlErrorCode == null || (wireName = hatchHtmlErrorCode.getWireName()) == null) ? "" : wireName;
                }

                @Override // X.A3Y
                public Iterator<HatchHtmlDiagnosticsEntry> sourceIterator() {
                    return arrayListA0h.iterator();
                }
            }).entrySet(), new Comparator() { // from class: com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor$summarySection$lambda$1$$inlined$sortedByDescending$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC7536F0j.A00((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
                }
            }).iterator();
            while (it2.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(it2);
                sbA0x.append(FGI.A0V("  ", C60O.A0t(entryA0l2), ": ", AnonymousClass001.A0F(entryA0l2.getValue())));
                sbA0x.append('\n');
            }
            sbA0x.append("Full detail in html_diagnostics.txt\n");
        }
        return sbA0x.toString();
    }
}
