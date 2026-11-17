package com.facebook.aura.analytics.impl;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C06H;
import X.C3339CFj;
import X.C3341CFl;
import X.C4931DFd;
import X.C4949DGw;
import X.C7384Etj;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AbraPigeonIdentity extends C4931DFd {
    public static final Companion Companion = new Companion();
    public final String abraUserId;

    public AbraPigeonIdentity(String str, Function0<String> function0) {
        super(str, str, null, AnonymousClass004.A1b(str, function0), function0);
        this.abraUserId = str;
    }

    @Override // X.C4931DFd
    public void addFieldsToIdentityDescriptor(C4949DGw c4949DGw) {
        C7384Etj.A0Y(c4949DGw, 0);
        c4949DGw.A0A = false;
        c4949DGw.A04 = Long.valueOf(Long.parseLong(this.abraUserId));
        String atClaim = getAtClaim();
        if (atClaim != null) {
            c4949DGw.A08.add(atClaim);
        }
    }

    @Override // X.C4931DFd
    public void attachBatchLevelFields(C3341CFl c3341CFl, C3339CFj c3339CFj) {
        C7384Etj.A0Y(c3341CFl, 0);
        C3341CFl.A00(c3341CFl, HatchPriceImpressionEventDataKt.NO_DISCOUNT, ErrorReportingConstants.USER_ID_KEY);
        C3341CFl.A00(c3341CFl, this.abraUserId, AuraAnalyticsDecoratorImplementation.TIME_SPENT_APP_UID);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public final AbraPigeonIdentity createIdentity(String str, Function0<String> function0) {
            AnonymousClass003.A0u(str, function0);
            return new AbraPigeonIdentity(str, function0);
        }

        public Companion() {
        }
    }

    public final String getAbraUserId() {
        return this.abraUserId;
    }
}
