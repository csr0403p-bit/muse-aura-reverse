package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCloseRequestEnvelope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public PageCloseRequest request;

    public PageCloseRequestEnvelope(int i, PageCloseRequest pageCloseRequest) {
        C7384Etj.A0Y(pageCloseRequest, 1);
        this.apiVersion = i;
        this.request = pageCloseRequest;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final PageCloseRequestEnvelope m3647copyqim9Vi0(int i, PageCloseRequest pageCloseRequest) {
        C7384Etj.A0Y(pageCloseRequest, 1);
        return new PageCloseRequestEnvelope(i, pageCloseRequest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCloseRequestEnvelope) {
                PageCloseRequestEnvelope pageCloseRequestEnvelope = (PageCloseRequestEnvelope) obj;
                if (this.apiVersion != pageCloseRequestEnvelope.apiVersion || !C7384Etj.areEqual(this.request, pageCloseRequestEnvelope.request)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRequest(PageCloseRequest pageCloseRequest) {
        C7384Etj.A0Y(pageCloseRequest, 0);
        this.request = pageCloseRequest;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ PageCloseRequestEnvelope m3645copyqim9Vi0$default(PageCloseRequestEnvelope pageCloseRequestEnvelope, int i, PageCloseRequest pageCloseRequest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pageCloseRequestEnvelope.apiVersion;
        }
        if ((i2 & 2) != 0) {
            pageCloseRequest = pageCloseRequestEnvelope.request;
        }
        C7384Etj.A0Y(pageCloseRequest, 1);
        return new PageCloseRequestEnvelope(i, pageCloseRequest);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3646component1pVg5ArA() {
        return this.apiVersion;
    }

    public final PageCloseRequest component2() {
        return this.request;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3648getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final PageCloseRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.request, this.apiVersion * 31);
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3649setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.request, ", request=", C3cI.A0x("PageCloseRequestEnvelope(apiVersion=", String.valueOf(BV4.A03(this.apiVersion))));
    }

    public /* synthetic */ PageCloseRequestEnvelope(int i, PageCloseRequest pageCloseRequest, C06H c06h) {
        this(i, pageCloseRequest);
    }
}
