package com.facebook.errorreporting.field;

import X.BV6;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes5.dex */
public class ReportFieldBase {
    public static int autoId = 1;
    public static final Set<String> sNoConsentNeeded = C60O.A13();
    public int id;
    public final String name;
    public final boolean requiresConsent;

    public static final String getUnmarkedKey(String str) {
        C7384Etj.A0Y(str, 0);
        return str;
    }

    public static final boolean requiresConsent(String str) {
        C7384Etj.A0Y(str, 0);
        return !sNoConsentNeeded.contains(str);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getRequiresConsent() {
        return this.requiresConsent;
    }

    public final boolean isRequiresConsent() {
        return this.requiresConsent;
    }

    public /* synthetic */ ReportFieldBase(int i, String str, boolean z, int i2, C06H c06h) {
        this(i, str, BV6.A1U(i2, z));
    }

    public final void setId(int i) {
        this.id = i;
    }

    public ReportFieldBase(int i, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        this.id = i;
        this.name = str;
        this.requiresConsent = z;
        int i2 = autoId;
        if (i == 0) {
            autoId = i2 + 1;
            this.id = i2;
        } else {
            autoId = Math.max(i2, i + 1);
        }
        if (!z) {
            sNoConsentNeeded.add(str);
        }
    }
}
