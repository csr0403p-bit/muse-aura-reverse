package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class RequestEnvelope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public CommandRequest request;

    public RequestEnvelope(int i, CommandRequest commandRequest) {
        C7384Etj.A0Y(commandRequest, 1);
        this.apiVersion = i;
        this.request = commandRequest;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final RequestEnvelope m3720copyqim9Vi0(int i, CommandRequest commandRequest) {
        C7384Etj.A0Y(commandRequest, 1);
        return new RequestEnvelope(i, commandRequest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RequestEnvelope) {
                RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
                if (this.apiVersion != requestEnvelope.apiVersion || !C7384Etj.areEqual(this.request, requestEnvelope.request)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRequest(CommandRequest commandRequest) {
        C7384Etj.A0Y(commandRequest, 0);
        this.request = commandRequest;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ RequestEnvelope m3718copyqim9Vi0$default(RequestEnvelope requestEnvelope, int i, CommandRequest commandRequest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = requestEnvelope.apiVersion;
        }
        if ((i2 & 2) != 0) {
            commandRequest = requestEnvelope.request;
        }
        C7384Etj.A0Y(commandRequest, 1);
        return new RequestEnvelope(i, commandRequest);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3719component1pVg5ArA() {
        return this.apiVersion;
    }

    public final CommandRequest component2() {
        return this.request;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3721getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final CommandRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.request, this.apiVersion * 31);
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3722setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.request, ", request=", C3cI.A0x("RequestEnvelope(apiVersion=", String.valueOf(BV4.A03(this.apiVersion))));
    }

    public /* synthetic */ RequestEnvelope(int i, CommandRequest commandRequest, C06H c06h) {
        this(i, commandRequest);
    }
}
