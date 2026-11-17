package com.facebook.aura.activation.repo;

import X.A7O;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes5.dex */
public final /* synthetic */ class AuraDebugSetHatchWaitlistStatusMutationImpl$Builder$build$1 extends C7438Evz implements G0U<A7O, AuraDebugSetHatchWaitlistStatusMutationResponse> {
    public static final AuraDebugSetHatchWaitlistStatusMutationImpl$Builder$build$1 INSTANCE = new AuraDebugSetHatchWaitlistStatusMutationImpl$Builder$build$1();

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDebugSetHatchWaitlistStatusMutationResponse invoke2(A7O a7o) {
        C7384Etj.A0Y(a7o, 0);
        return new AuraDebugSetHatchWaitlistStatusMutationResponse(a7o);
    }

    public AuraDebugSetHatchWaitlistStatusMutationImpl$Builder$build$1() {
        super(1, AuraDebugSetHatchWaitlistStatusMutationResponse.class, "<init>", "<init>(Lcom/facebook/graphql/modelutil/GraphQLData;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AuraDebugSetHatchWaitlistStatusMutationResponse invoke(A7O a7o) {
        return new AuraDebugSetHatchWaitlistStatusMutationResponse(C7384Etj.A0A(a7o));
    }
}
