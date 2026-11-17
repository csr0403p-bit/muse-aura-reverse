package com.bloks.signatures.bkactionarrayslice;

import X.FFJ;
import java.util.List;

/* loaded from: classes6.dex */
public final class BKBloksActionArraySliceImpl$SliceReportingException extends RuntimeException implements FFJ {
    public final List<String> bloksStackTrace;
    public final String errorMessage;
    public final String loggingId;

    @Override // X.FFJ
    public final List<String> ACv() {
        return this.bloksStackTrace;
    }

    @Override // X.FFJ
    public final void AFP() {
    }

    @Override // X.FFJ
    public final void AHF() {
    }

    @Override // X.FFJ
    public final void AHu() {
    }

    public BKBloksActionArraySliceImpl$SliceReportingException(String str, List<String> list, String str2) {
        super(str);
        this.errorMessage = str;
        this.bloksStackTrace = list;
        this.loggingId = str2;
    }
}
