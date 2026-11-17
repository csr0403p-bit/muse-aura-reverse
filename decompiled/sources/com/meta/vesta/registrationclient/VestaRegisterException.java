package com.meta.vesta.registrationclient;

import X.EnumC10363HCk;
import X.EnumC10364HCl;
import X.HD3;

/* loaded from: classes6.dex */
public final class VestaRegisterException extends Exception {
    public final HD3 exceptionType;
    public final Throwable failureReason;
    public final EnumC10363HCk vestaServiceErrorCode;

    public final EnumC10364HCl A00() {
        HD3 hd3 = this.exceptionType;
        if (hd3 == HD3.A09) {
            EnumC10363HCk enumC10363HCk = this.vestaServiceErrorCode;
            if (enumC10363HCk != null) {
                int iOrdinal = enumC10363HCk.ordinal();
                if (iOrdinal == 2) {
                    return EnumC10364HCl.A09;
                }
                if (iOrdinal == 3) {
                    return EnumC10364HCl.A07;
                }
                if (iOrdinal == 10) {
                    return EnumC10364HCl.A03;
                }
                if (iOrdinal == 11) {
                    return EnumC10364HCl.A08;
                }
            }
        } else if (hd3 == HD3.A06) {
            return EnumC10364HCl.A04;
        }
        return EnumC10364HCl.A06;
    }

    public VestaRegisterException(EnumC10363HCk enumC10363HCk, HD3 hd3, Throwable th) {
        this.exceptionType = hd3;
        this.failureReason = th;
        this.vestaServiceErrorCode = enumC10363HCk;
    }
}
