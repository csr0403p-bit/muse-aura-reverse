package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HtmlWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String html;
    public final String path;

    public final class Companion {
        public final C9hr<HtmlWidgetData> serializer() {
            return HtmlWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HtmlWidgetData(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.html = str;
        this.path = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HtmlWidgetData htmlWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(htmlWidgetData.html, c9iZ, 0);
        if (c9j5.AfR() || htmlWidgetData.path != null) {
            c9j5.AAP(htmlWidgetData.path, C07779iq.A01, c9iZ, 1);
        }
    }

    public final HtmlWidgetData copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HtmlWidgetData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HtmlWidgetData) {
                HtmlWidgetData htmlWidgetData = (HtmlWidgetData) obj;
                if (!C7384Etj.areEqual(this.html, htmlWidgetData.html) || !C7384Etj.areEqual(this.path, htmlWidgetData.path)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HtmlWidgetData copy$default(HtmlWidgetData htmlWidgetData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = htmlWidgetData.html;
        }
        if ((i & 2) != 0) {
            str2 = htmlWidgetData.path;
        }
        C7384Etj.A0Y(str, 0);
        return new HtmlWidgetData(str, str2);
    }

    public final String component1() {
        return this.html;
    }

    public final String component2() {
        return this.path;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.html) + AnonymousClass006.A0G(this.path);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HtmlWidgetData(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HtmlWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.html = str;
        this.path = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ HtmlWidgetData(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
