package com.google.mlkit.common;

import X.CRy;

/* loaded from: classes5.dex */
public class MlKitException extends Exception {
    public final int zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        CRy.A07(str, "Provided message must not be empty.");
        this.zza = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i, Throwable th) {
        super(str, th);
        CRy.A07(str, "Provided message must not be empty.");
        this.zza = i;
    }
}
