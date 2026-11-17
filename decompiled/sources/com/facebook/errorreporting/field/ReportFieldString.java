package com.facebook.errorreporting.field;

import X.BZW;
import X.C06H;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes5.dex */
public class ReportFieldString extends BZW {
    public static final int DEFAULT_STRING_FIELD_LENGTH = 48;
    public static final int FIX_ME_DISK_ID = -1;
    public static final int FIX_ME_MEM_ID = -2;
    public final boolean overflowToDisk;
    public final boolean useLeadByte;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportFieldString(int i, String str, boolean z, int i2, boolean z2) {
        this(i, str, z, true, i2, z2);
        C7384Etj.A0Y(str, 1);
    }

    public static final ReportFieldString createFixMe(String str) {
        C7384Etj.A0Y(str, 0);
        return new ReportFieldString(-2, str, true);
    }

    public static final ReportFieldString createFixMePersist(String str) {
        C7384Etj.A0Y(str, 0);
        return new ReportFieldString(-1, str, true);
    }

    public static final ReportFieldString createForTesting(String str) {
        C7384Etj.A0Y(str, 0);
        return new ReportFieldString(0, str, false);
    }

    public final boolean getOverflowToDisk() {
        return this.overflowToDisk;
    }

    public final boolean getUseLeadByte() {
        return this.useLeadByte;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportFieldString(int i, String str, boolean z) {
        this(i, str, z, true, 48, true);
        C7384Etj.A0Y(str, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReportFieldString(int i, String str, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 1);
        boolean z3 = !z2;
        this(i, str, z, z3, z2 ? 1 : 48, z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportFieldString(int i, String str, boolean z, boolean z2, int i2, boolean z3) {
        super(i, str, z, Math.min(126, i2));
        C7384Etj.A0Y(str, 1);
        this.useLeadByte = z2;
        this.overflowToDisk = z3;
    }

    public /* synthetic */ ReportFieldString(int i, String str, boolean z, int i2, boolean z2, int i3, C06H c06h) {
        this(i, str, z, i2, C3cG.A1K(i3 & 16, z2));
    }
}
