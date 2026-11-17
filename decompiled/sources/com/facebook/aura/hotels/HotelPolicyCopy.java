package com.facebook.aura.hotels;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelPolicyCopy {
    public final int defaultTitle;
    public final String termsUrl;
    public final String text;
    public final String title;

    public HotelPolicyCopy(String str, int i, String str2, String str3) {
        C7384Etj.A0Y(str2, 2);
        this.title = str;
        this.defaultTitle = i;
        this.text = str2;
        this.termsUrl = str3;
    }

    public final int getDefaultTitle() {
        return this.defaultTitle;
    }

    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ HotelPolicyCopy(String str, int i, String str2, String str3, int i2, C06H c06h) {
        this(str, i, str2, AnonymousClass006.A0u(i2, str3));
    }
}
