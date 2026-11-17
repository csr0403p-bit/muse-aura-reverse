package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1", f = "HatchGatewayConnection.kt", l = {2128, 2130}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ PinnedHostData $pinned;
    public final /* synthetic */ AttestedHostDataVerdict $verdict;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttestedHostDataVerdict.values().length];
            try {
                AnonymousClass002.A13(AttestedHostDataVerdict.MATCHED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AttestedHostDataVerdict.REJECTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1(HatchGatewayConnection hatchGatewayConnection, AttestedHostDataVerdict attestedHostDataVerdict, PinnedHostData pinnedHostData, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$verdict = attestedHostDataVerdict;
        this.$pinned = pinnedHostData;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1(this.this$0, this.$verdict, this.$pinned, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository companion = ConfidentialVmRepository.Companion.getInstance(this.this$0.userSession);
                int iOrdinal = this.$verdict.ordinal();
                if (iOrdinal == 0) {
                    PinnedHostData pinnedHostData = this.$pinned;
                    String str = pinnedHostData.vmId;
                    byte[] bArr = pinnedHostData.hostData;
                    this.L$0 = null;
                    this.label = 1;
                    if (companion.promoteLegacySecret(str, bArr, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    PinnedHostData pinnedHostData2 = this.$pinned;
                    String str2 = pinnedHostData2.vmId;
                    byte[] bArr2 = pinnedHostData2.hostData;
                    this.L$0 = null;
                    this.label = 2;
                    if (companion.discardLegacySecret(str2, bArr2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0K(HatchGatewayConnectionKt.TAG, e2, "settleLegacySecret: failed to settle the legacy account secret");
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
