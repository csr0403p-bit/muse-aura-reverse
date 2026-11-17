package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.G0U;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$result$1", f = "HatchVmRepository.kt", l = {BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, 511, 514}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRepository$leaseAndCacheVm$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>>, Object> {
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ HatchlingVmType $vmType;
    public int label;

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchlingVmType.values().length];
            try {
                AnonymousClass002.A13(HatchlingVmType.HATCH_VM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchlingVmType.HATCH_CVM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRepository$leaseAndCacheVm$result$1(HatchlingVmType hatchlingVmType, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchVmRepository$leaseAndCacheVm$result$1> htJ) {
        super(1, htJ);
        this.$vmType = hatchlingVmType;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchVmRepository$leaseAndCacheVm$result$1(this.$vmType, this.$userSession, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 3
            r5 = 2
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L15
            if (r0 == r6) goto L78
            if (r0 == r5) goto L78
            if (r0 == r3) goto L78
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L15:
            X.Hwg.A00(r8)
            com.facebook.aura.gateway.HatchlingVmType r0 = r7.$vmType
            int r0 = r0.ordinal()
            if (r0 == r4) goto L4b
            if (r0 != r6) goto L6a
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r1 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            X.CGz r0 = r7.$userSession
            com.facebook.aura.user.provider.AuraViewerDataProvider r0 = r1.getInstance(r0)
            X.1BN<com.facebook.aura.user.provider.AuraUserData> r0 = r0.userData
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.user.provider.AuraUserData r0 = (com.facebook.aura.user.provider.AuraUserData) r0
            if (r0 == 0) goto L49
            java.lang.Boolean r1 = r0.isVmTypeSelectionRequired
        L36:
            boolean r0 = X.AnonymousClass002.A1b(r1, r6)
            if (r0 == 0) goto L52
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            X.CGz r0 = r7.$userSession
            r7.label = r5
            java.lang.Object r0 = com.facebook.aura.gateway.HatchVmRepository.m956access$leaseConfidentialVmgIAlus(r1, r0, r7)
        L46:
            if (r0 != r2) goto L7c
            return r2
        L49:
            r1 = 0
            goto L36
        L4b:
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_VM
            r7.label = r6
            goto L65
        L52:
            boolean r0 = X.AnonymousClass002.A1b(r1, r4)
            if (r0 == 0) goto L6f
            java.lang.String r1 = "HatchVmRepository"
            java.lang.String r0 = "Not eligible for a confidential VM; leasing a standard VM"
            X.CFK.A06(r1, r0)
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_VM
            r7.label = r3
        L65:
            java.lang.Object r0 = com.facebook.aura.gateway.HatchVmRepository.m957access$leaseVmgIAlus(r1, r0, r7)
            goto L46
        L6a:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L6f:
            if (r1 != 0) goto L81
            java.lang.String r0 = "cvm_eligibility_unknown"
            X.Hud r0 = X.C8j4.A19(r0)
            goto L7c
        L78:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r8)
        L7c:
            X.HsJ r2 = X.C3cG.A0t(r0)
            return r2
        L81:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmRepository$leaseAndCacheVm$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>> htJ) {
        return ((HatchVmRepository$leaseAndCacheVm$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends FetchLeasedVmV2ResponseJson>> htJ) {
        return invoke2((HtJ<? super HsJ<FetchLeasedVmV2ResponseJson>>) htJ);
    }
}
