package com.facebook.aura.notifications.push;

import X.A7O;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes5.dex */
public final /* synthetic */ class ABRARegisterPushTokenMutationImpl$Builder$build$1 extends C7438Evz implements G0U<A7O, ABRARegisterPushTokenMutationResponse> {
    public static final ABRARegisterPushTokenMutationImpl$Builder$build$1 INSTANCE = new ABRARegisterPushTokenMutationImpl$Builder$build$1();

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final ABRARegisterPushTokenMutationResponse invoke2(A7O a7o) {
        C7384Etj.A0Y(a7o, 0);
        return new ABRARegisterPushTokenMutationResponse(a7o);
    }

    public ABRARegisterPushTokenMutationImpl$Builder$build$1() {
        super(1, ABRARegisterPushTokenMutationResponse.class, "<init>", "<init>(Lcom/facebook/graphql/modelutil/GraphQLData;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ ABRARegisterPushTokenMutationResponse invoke(A7O a7o) {
        return new ABRARegisterPushTokenMutationResponse(C7384Etj.A0A(a7o));
    }
}
