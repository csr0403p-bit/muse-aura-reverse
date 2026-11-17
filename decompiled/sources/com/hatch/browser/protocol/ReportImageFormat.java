package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ReportImageFormat {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ReportImageFormat[] $VALUES;
    public static final Companion Companion;
    public static final ReportImageFormat JPEG;
    public static final ReportImageFormat PNG;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ReportImageFormat reportImageFormat = new ReportImageFormat("PNG", 0);
        PNG = reportImageFormat;
        ReportImageFormat reportImageFormat2 = new ReportImageFormat("JPEG", 1);
        JPEG = reportImageFormat2;
        ReportImageFormat[] reportImageFormatArr = {reportImageFormat, reportImageFormat2};
        $VALUES = reportImageFormatArr;
        $ENTRIES = C3cG.A0w(reportImageFormatArr);
        Companion = new Companion();
    }

    public static Ey9<ReportImageFormat> getEntries() {
        return $ENTRIES;
    }

    public static ReportImageFormat valueOf(String str) {
        return (ReportImageFormat) Enum.valueOf(ReportImageFormat.class, str);
    }

    public static ReportImageFormat[] values() {
        return (ReportImageFormat[]) $VALUES.clone();
    }

    public ReportImageFormat(String str, int i) {
    }
}
