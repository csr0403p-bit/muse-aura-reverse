package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1", f = "HatchAgentPermissionsRepository.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchAgentPermissionsRepository.DeviceApprovalCopy>, Object> {
    public final /* synthetic */ String $actionDescription;
    public final /* synthetic */ String $argumentsJson;
    public final /* synthetic */ String $commandId;
    public final /* synthetic */ String $displayName;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, String str, String str2, String str3, String str4, String str5, HtJ<? super HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchAgentPermissionsRepository;
        this.$commandId = str;
        this.$displayName = str2;
        this.$actionDescription = str3;
        this.$reason = str4;
        this.$argumentsJson = str5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1(this.this$0, this.$commandId, this.$displayName, this.$actionDescription, this.$reason, this.$argumentsJson, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
                String str = this.$commandId;
                String str2 = this.$displayName;
                String str3 = this.$actionDescription;
                String str4 = this.$reason;
                String str5 = this.$argumentsJson;
                this.label = 1;
                obj = hatchAgentPermissionsRepository.fetchDeviceApprovalCopy(str, str2, str3, str4, str5, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return (HatchAgentPermissionsRepository.DeviceApprovalCopy) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0K(HatchAgentPermissionsRepositoryKt.DEVICE_COPY_TAG, e2, "device approval copy threw");
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchAgentPermissionsRepository.DeviceApprovalCopy> htJ) {
        return ((HatchAgentPermissionsRepository$fetchDeviceApprovalCopyWithin$inFlight$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
