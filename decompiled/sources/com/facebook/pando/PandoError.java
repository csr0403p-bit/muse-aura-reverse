package com.facebook.pando;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV7;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes5.dex */
public final class PandoError {
    public final List<PandoError> allErrors;
    public final String apiAdditionalInfoFromRESTDoNotUseExceptForMigration;
    public final int apiErrorBackoff;
    public final int apiErrorCode;
    public final String apiErrorDebugInfo;
    public final String apiErrorDescription;
    public final boolean apiErrorIsRetryable;
    public final boolean apiErrorIsSilent;
    public final boolean apiErrorIsSummary;
    public final boolean apiErrorIsTransient;
    public final List<String> apiErrorPath;
    public final boolean apiErrorRequiresReauth;
    public final int apiErrorSeverityValue;
    public final String apiErrorSummary;
    public final String message;
    public final Throwable platformInfraError;
    public final String tigonErrorAnalyticsDetail;
    public final String tigonErrorAnalyticsDomain;
    public final short tigonErrorCode;
    public final String tigonErrorCodeDescription;

    public final PandoErrorSeverity getApiErrorSeverity() {
        int i = this.apiErrorSeverityValue;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? PandoErrorSeverity.UNKNOWN : PandoErrorSeverity.UNSET : PandoErrorSeverity.CRITICAL : PandoErrorSeverity.ERROR : PandoErrorSeverity.WARNING : PandoErrorSeverity.NONE;
    }

    public PandoError(String str, String str2, String str3, short s, String str4, int i, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str7, String str8, boolean z5, List<String> list, int i3, List<PandoError> list2, Throwable th) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        AnonymousClass003.A10(str5, str6);
        AnonymousClass002.A1H(str7, 13, str8);
        C7384Etj.A0Y(list, 16);
        C7384Etj.A0Y(list2, 18);
        this.message = str;
        this.tigonErrorCodeDescription = str2;
        this.tigonErrorAnalyticsDomain = str3;
        this.tigonErrorCode = s;
        this.tigonErrorAnalyticsDetail = str4;
        this.apiErrorCode = i;
        this.apiErrorSummary = str5;
        this.apiErrorDescription = str6;
        this.apiErrorIsTransient = z;
        this.apiErrorIsSilent = z2;
        this.apiErrorRequiresReauth = z3;
        this.apiErrorIsRetryable = z4;
        this.apiErrorSeverityValue = i2;
        this.apiErrorDebugInfo = str7;
        this.apiAdditionalInfoFromRESTDoNotUseExceptForMigration = str8;
        this.apiErrorIsSummary = z5;
        this.apiErrorPath = list;
        this.apiErrorBackoff = i3;
        this.allErrors = list2;
        this.platformInfraError = th;
    }

    public /* synthetic */ PandoError(String str, String str2, String str3, short s, String str4, int i, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str7, String str8, boolean z5, List list, int i3, List list2, Throwable th, int i4, C06H c06h) {
        this(str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? (short) 0 : s, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, C3cG.A1K(i4 & 256, z), C3cG.A1K(i4 & 512, z2), C3cG.A1K(i4 & 1024, z3), C3cG.A1K(i4 & 2048, z4), (i4 & 4096) != 0 ? 0 : i2, (i4 & 8192) != 0 ? "" : str7, (i4 & 16384) == 0 ? str8 : "", C3cH.A1L(32768, i4, z5), (i4 & 65536) != 0 ? C0881AGi.A00 : list, BV7.A05(i4, 131072, i3), (i4 & 262144) != 0 ? C0881AGi.A00 : list2, (i4 & 524288) != 0 ? null : th);
    }
}
