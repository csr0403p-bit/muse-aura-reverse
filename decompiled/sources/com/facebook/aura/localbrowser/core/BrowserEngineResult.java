package com.facebook.aura.localbrowser.core;

import X.AnonymousClass003;
import X.HtJ;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.protocol.ReportImageFormat;

/* loaded from: classes2.dex */
public interface BrowserEngineResult {

    public final class Refused implements BrowserEngineResult {
        public static final int $stable = 0;
        public static final Refused INSTANCE = new Refused();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Refused);
        }

        public String toString() {
            return "Refused";
        }

        public int hashCode() {
            return -2135979909;
        }
    }

    public final class Reported implements AutoCloseable, BrowserEngineResult {
        public static final int $stable = CommandReport.$stable;
        public final ReportImageFormat imageFormat;
        public final CommandReport report;

        public final byte[] centralBlackholeSideband() {
            return this.report.centralBlackholeSideband();
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.report.destroy();
        }

        public final Object encode(int i, long j, HtJ<? super byte[]> htJ) {
            return BrowserEngineResultKt.encodeForReply(this.report, this.imageFormat, i, j, htJ);
        }

        public Reported(CommandReport commandReport, ReportImageFormat reportImageFormat) {
            AnonymousClass003.A0u(commandReport, reportImageFormat);
            this.report = commandReport;
            this.imageFormat = reportImageFormat;
        }
    }
}
