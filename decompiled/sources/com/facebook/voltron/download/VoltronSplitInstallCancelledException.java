package com.facebook.voltron.download;

import X.C7384Etj;

/* loaded from: classes5.dex */
public final class VoltronSplitInstallCancelledException extends Exception {
    public final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoltronSplitInstallCancelledException(String str, int i) {
        super(str);
        C7384Etj.A0Y(str, 0);
        this.errorCode = i;
    }
}
