package com.facebook.secure.receiver;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cI;
import X.C7384Etj;
import X.C7n1;
import X.C7o4;
import X.C7o5;
import X.C8fD;
import X.FGI;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public abstract class SecureBroadcastReceiverBase extends BroadcastReceiver implements C8fD {
    public C7n1 scope;

    public final String getEndpointName(Context context) {
        C7384Etj.A0Y(context, 0);
        return FGI.A0O(context.getPackageName(), C3cI.A0Y(this), '/');
    }

    public abstract Object getEndpointObject(String str);

    public abstract String getTag();

    public final boolean verifyReceiverScope(Context context, Intent intent) {
        boolean zA1a = AnonymousClass002.A1a(context, intent);
        C7n1 c7n1 = this.scope;
        if (c7n1 == null || c7n1.AAh(this, context, intent) == null) {
            return false;
        }
        return zA1a;
    }

    public final C7o4 getIntentLogger() {
        return C7o5.A00;
    }

    public boolean shouldCheckActionNotNull() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String verifyOnReceiveShouldContinue(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            java.lang.String r1 = r4.getAction()
            boolean r0 = r2.shouldCheckActionNotNull()
            if (r0 == 0) goto Lf
            if (r1 != 0) goto L11
            java.lang.String r0 = "action_null"
            return r0
        Lf:
            if (r1 == 0) goto L1e
        L11:
            X.7oN r0 = X.C7oV.A01()
            boolean r0 = r0.A00(r3, r4, r2)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "killswitch_check_failed"
            return r0
        L1e:
            boolean r0 = r2.verifyReceiverScope(r3, r4)
            if (r0 != 0) goto L27
            java.lang.String r0 = "scope_verification_failed"
            return r0
        L27:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.secure.receiver.SecureBroadcastReceiverBase.verifyOnReceiveShouldContinue(android.content.Context, android.content.Intent):java.lang.String");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AnonymousClass003.A0u(context, intent);
        String strVerifyOnReceiveShouldContinue = verifyOnReceiveShouldContinue(context, intent);
        String endpointName = getEndpointName(context);
        if (strVerifyOnReceiveShouldContinue == null) {
            C7o5.A00.A00(intent, endpointName);
        } else {
            getClass().isAnnotationPresent(FailOpenDuringMigration.class);
            C7o5.A00.A01(intent, endpointName, strVerifyOnReceiveShouldContinue);
            throw new SecurityException(FGI.A0M("The received intent failed one or more security checks, so no further action is allowed. Reason: ", strVerifyOnReceiveShouldContinue));
        }
    }
}
