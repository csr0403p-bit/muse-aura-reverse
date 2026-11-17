package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0V;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerViewModel$uiStateFor$owns$1 extends AbstractC7559F3s implements G0V<Integer, String, Boolean> {
    public final /* synthetic */ boolean $isNameUnique;
    public final /* synthetic */ String $name;
    public final /* synthetic */ FlightCheckoutPassengerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightCheckoutPassengerViewModel$uiStateFor$owns$1(FlightCheckoutPassengerViewModel flightCheckoutPassengerViewModel, boolean z, String str) {
        super(2);
        this.this$0 = flightCheckoutPassengerViewModel;
        this.$isNameUnique = z;
        this.$name = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // X.G0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.Integer r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 1
            X.C7384Etj.A0Y(r5, r0)
            r2 = 1
            if (r4 == 0) goto L16
            com.facebook.aura.agentpermission.FlightCheckoutPassengerViewModel r0 = r3.this$0
            int r1 = r0.passengerIndex
            int r0 = r4.intValue()
            if (r0 != r1) goto L23
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L16:
            boolean r0 = r3.$isNameUnique
            if (r0 == 0) goto L23
            java.lang.String r0 = r3.$name
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L23
            goto L11
        L23:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightCheckoutPassengerViewModel$uiStateFor$owns$1.invoke(java.lang.Integer, java.lang.String):java.lang.Boolean");
    }
}
