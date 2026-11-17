package com.facebook.aura.webview.diagnostics;

import X.AIG;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchHtmlDiagnosticsRecorder {
    public static final int MAX_ENTRIES = 300;
    public static final HatchHtmlDiagnosticsRecorder INSTANCE = new HatchHtmlDiagnosticsRecorder();
    public static final Object lock = C3cG.A0T();
    public static final AIG<HatchHtmlDiagnosticsEntry> entries = new AIG<>();

    public final void record(HatchHtmlDiagnosticsEntry hatchHtmlDiagnosticsEntry) {
        C7384Etj.A0Y(hatchHtmlDiagnosticsEntry, 0);
        synchronized (lock) {
            AIG<HatchHtmlDiagnosticsEntry> aig = entries;
            aig.addLast(hatchHtmlDiagnosticsEntry);
            while (aig.size() > 300) {
                aig.removeFirst();
            }
        }
    }

    public final int failureCount() {
        int i;
        synchronized (lock) {
            AIG<HatchHtmlDiagnosticsEntry> aig = entries;
            i = 0;
            if (!(aig instanceof Collection) || !aig.isEmpty()) {
                Iterator<HatchHtmlDiagnosticsEntry> it = aig.iterator();
                while (it.hasNext()) {
                    if (it.next().errorCode != null && (i = i + 1) < 0) {
                        AbstractC0885AGm.A13();
                        throw F60.createAndThrow();
                    }
                }
            }
        }
        return i;
    }

    public final List<HatchHtmlDiagnosticsEntry> snapshot() {
        List<HatchHtmlDiagnosticsEntry> listA0X;
        synchronized (lock) {
            listA0X = AbstractC0878AGe.A0X(entries);
        }
        return listA0X;
    }
}
