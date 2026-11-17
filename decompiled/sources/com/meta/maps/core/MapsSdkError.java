package com.meta.maps.core;

import X.C60N;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class MapsSdkError extends Exception {
    public final int code;

    /* JADX WARN: Illegal instructions before constructor call */
    public MapsSdkError(CodedError codedError) {
        int i;
        String strA00;
        if (codedError != null) {
            i = codedError.code;
            strA00 = codedError.message;
            if (strA00 == null) {
            }
            this(i, strA00);
        }
        i = 0;
        strA00 = C60N.A00(102);
        this(i, strA00);
    }

    public final int getCode() {
        return this.code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapsSdkError(int i, String str) {
        super(str);
        C7384Etj.A0Y(str, 1);
        this.code = i;
    }
}
