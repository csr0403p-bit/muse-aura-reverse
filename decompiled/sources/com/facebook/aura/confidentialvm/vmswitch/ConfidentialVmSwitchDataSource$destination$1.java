package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2l;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.user.provider.AuraUserData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDataSource$destination$1", f = "ConfidentialVmSwitchDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchDataSource$destination$1 extends AbstractC07127nr implements G2l<SubscriptionDetailsState, ConfidentialVmWaitlistState, Boolean, Boolean, AuraUserData, HtJ<? super ConfidentialVmSwitchDestination>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;
    public final /* synthetic */ ConfidentialVmSwitchDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchDataSource$destination$1(ConfidentialVmSwitchDataSource confidentialVmSwitchDataSource, HtJ<? super ConfidentialVmSwitchDataSource$destination$1> htJ) {
        super(6, htJ);
        this.this$0 = confidentialVmSwitchDataSource;
    }

    public final Object invoke(SubscriptionDetailsState subscriptionDetailsState, ConfidentialVmWaitlistState confidentialVmWaitlistState, boolean z, boolean z2, AuraUserData auraUserData, HtJ<? super ConfidentialVmSwitchDestination> htJ) {
        ConfidentialVmSwitchDataSource$destination$1 confidentialVmSwitchDataSource$destination$1 = new ConfidentialVmSwitchDataSource$destination$1(this.this$0, htJ);
        confidentialVmSwitchDataSource$destination$1.L$0 = subscriptionDetailsState;
        confidentialVmSwitchDataSource$destination$1.L$1 = confidentialVmWaitlistState;
        confidentialVmSwitchDataSource$destination$1.Z$0 = z;
        confidentialVmSwitchDataSource$destination$1.Z$1 = z2;
        confidentialVmSwitchDataSource$destination$1.L$2 = auraUserData;
        return confidentialVmSwitchDataSource$destination$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SubscriptionDetailsState subscriptionDetailsState = (SubscriptionDetailsState) this.L$0;
        ConfidentialVmWaitlistState confidentialVmWaitlistState = (ConfidentialVmWaitlistState) this.L$1;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        AuraUserData auraUserData = (AuraUserData) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return ConfidentialVmSwitchDataSourceKt.resolveConfidentialVmSwitchDestination(subscriptionDetailsState, confidentialVmWaitlistState, z, this.this$0.isSwitchOffered(z2, auraUserData));
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Object invoke(SubscriptionDetailsState subscriptionDetailsState, ConfidentialVmWaitlistState confidentialVmWaitlistState, Boolean bool, Boolean bool2, AuraUserData auraUserData, HtJ<? super ConfidentialVmSwitchDestination> htJ) {
        return invoke(subscriptionDetailsState, confidentialVmWaitlistState, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), auraUserData, htJ);
    }
}
