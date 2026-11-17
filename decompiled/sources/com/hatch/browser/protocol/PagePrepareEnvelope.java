package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PagePrepareEnvelope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public PagePrepareRequest request;

    public PagePrepareEnvelope(int i, PagePrepareRequest pagePrepareRequest) {
        C7384Etj.A0Y(pagePrepareRequest, 1);
        this.apiVersion = i;
        this.request = pagePrepareRequest;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final PagePrepareEnvelope m3673copyqim9Vi0(int i, PagePrepareRequest pagePrepareRequest) {
        C7384Etj.A0Y(pagePrepareRequest, 1);
        return new PagePrepareEnvelope(i, pagePrepareRequest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PagePrepareEnvelope) {
                PagePrepareEnvelope pagePrepareEnvelope = (PagePrepareEnvelope) obj;
                if (this.apiVersion != pagePrepareEnvelope.apiVersion || !C7384Etj.areEqual(this.request, pagePrepareEnvelope.request)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRequest(PagePrepareRequest pagePrepareRequest) {
        C7384Etj.A0Y(pagePrepareRequest, 0);
        this.request = pagePrepareRequest;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ PagePrepareEnvelope m3671copyqim9Vi0$default(PagePrepareEnvelope pagePrepareEnvelope, int i, PagePrepareRequest pagePrepareRequest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pagePrepareEnvelope.apiVersion;
        }
        if ((i2 & 2) != 0) {
            pagePrepareRequest = pagePrepareEnvelope.request;
        }
        C7384Etj.A0Y(pagePrepareRequest, 1);
        return new PagePrepareEnvelope(i, pagePrepareRequest);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3672component1pVg5ArA() {
        return this.apiVersion;
    }

    public final PagePrepareRequest component2() {
        return this.request;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3674getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final PagePrepareRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.request, this.apiVersion * 31);
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3675setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.request, ", request=", C3cI.A0x("PagePrepareEnvelope(apiVersion=", String.valueOf(BV4.A03(this.apiVersion))));
    }

    public /* synthetic */ PagePrepareEnvelope(int i, PagePrepareRequest pagePrepareRequest, C06H c06h) {
        this(i, pagePrepareRequest);
    }
}
