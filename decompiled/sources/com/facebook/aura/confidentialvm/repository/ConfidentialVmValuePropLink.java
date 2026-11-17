package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmValuePropLink extends C06G {
    public final int length;
    public final int offset;
    public final String url;

    public ConfidentialVmValuePropLink(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        this.offset = i;
        this.length = i2;
        this.url = str;
    }

    public final ConfidentialVmValuePropLink copy(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        return new ConfidentialVmValuePropLink(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropLink) {
                ConfidentialVmValuePropLink confidentialVmValuePropLink = (ConfidentialVmValuePropLink) obj;
                if (this.offset != confidentialVmValuePropLink.offset || this.length != confidentialVmValuePropLink.length || !C7384Etj.areEqual(this.url, confidentialVmValuePropLink.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmValuePropLink copy$default(ConfidentialVmValuePropLink confidentialVmValuePropLink, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = confidentialVmValuePropLink.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = confidentialVmValuePropLink.length;
        }
        if ((i3 & 4) != 0) {
            str = confidentialVmValuePropLink.url;
        }
        return confidentialVmValuePropLink.copy(i, i2, str);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final String component3() {
        return this.url;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, ((this.offset * 31) + this.length) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
