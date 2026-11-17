package com.facebook.aura.composer.dictation;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BV4;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import com.facebook.aura.composer.dictation.engine.DictationEngine;
import com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine;
import com.facebook.aura.composer.dictation.vm.VmDictationEngine;
import com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DictationEngineSelector {
    public static final int $stable = 0;
    public static final DictationEngineSelector INSTANCE = new DictationEngineSelector();
    public static final String TAG = "DictationEngineSelector";

    /* renamed from: com.facebook.aura.composer.dictation.DictationEngineSelector$create$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return DictationGating.INSTANCE.getVoyagerModelName();
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return DictationGating.INSTANCE.getVoyagerModelName();
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.DictationEngineSelector$create$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 1500L;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return 1500L;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.DictationEngineSelector$create$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<List<? extends String>> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            return DictationGating.INSTANCE.isLanguageBiasEnabled() ? DictationLanguages.INSTANCE.preferred(this.$context) : C0881AGi.A00;
        }
    }

    public final DictationEngine create(DictationEngineType dictationEngineType, AbstractC3358CGz abstractC3358CGz, Context context, Function0<Boolean> function0, boolean z, Long l, Function0<Boolean> function02) {
        DictationEngine voyagerDictationEngine;
        boolean zA1a = AnonymousClass002.A1a(dictationEngineType, abstractC3358CGz);
        AnonymousClass002.A1B(context, 2, function0);
        C7384Etj.A0Y(function02, 6);
        int iOrdinal = dictationEngineType.ordinal();
        if (iOrdinal == 0) {
            voyagerDictationEngine = new VoyagerDictationEngine(abstractC3358CGz, context, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, new AnonymousClass3(context), function0, z, l, function02);
        } else if (iOrdinal == zA1a) {
            voyagerDictationEngine = new OnDeviceDictationEngine(context);
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            voyagerDictationEngine = new VmDictationEngine(abstractC3358CGz, context);
        }
        return voyagerDictationEngine;
    }

    public final void recordVmFailure(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        VmFallbackWindow.Companion.get(abstractC3358CGz).restart();
        CFK.A0H(TAG, "vm_failed on_device_fallback_ms=%d", BV4.A1X(300000L));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.composer.dictation.DictationEngineType select(com.facebook.aura.composer.dictation.engine.DictationMode r7, X.AbstractC3358CGz r8, boolean r9) {
        /*
            r6 = this;
            r4 = r7
            X.AnonymousClass003.A0u(r7, r8)
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r0 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r1 = r0.getInstance(r8)
            boolean r0 = r1.isStandardVm()
            if (r0 == 0) goto L22
            if (r9 == 0) goto L1f
            X.BLG<com.facebook.aura.network.state.AuraNetworkState> r0 = com.facebook.aura.network.state.AuraNetworkMonitor._state
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.network.state.AuraNetworkState.Offline
            if (r0 == 0) goto L1f
            com.facebook.aura.composer.dictation.DictationEngineType r8 = com.facebook.aura.composer.dictation.DictationEngineType.ON_DEVICE
            return r8
        L1f:
            com.facebook.aura.composer.dictation.DictationEngineType r8 = com.facebook.aura.composer.dictation.DictationEngineType.VOYAGER
            return r8
        L22:
            boolean r3 = r1.isConfidentialVm()
            boolean r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.signOutCallbackRegistered
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r0 = com.facebook.aura.gateway.HatchGatewayConnection.Companion
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.getInstance(r8)
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r0 = r0.connectionState
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            if (r9 == 0) goto L45
            com.facebook.aura.composer.dictation.VmFallbackWindow$Companion r0 = com.facebook.aura.composer.dictation.VmFallbackWindow.Companion
            com.facebook.aura.composer.dictation.VmFallbackWindow r0 = r0.get(r8)
            boolean r0 = r0.isActive()
            r1 = 1
            if (r0 != 0) goto L46
        L45:
            r1 = 0
        L46:
            if (r3 == 0) goto L72
            if (r2 == 0) goto L72
            if (r1 != 0) goto L72
            com.facebook.aura.composer.dictation.DictationGating r0 = com.facebook.aura.composer.dictation.DictationGating.INSTANCE
            boolean r0 = r0.isVmDictationAllowed$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(r7)
            if (r0 == 0) goto L72
            com.facebook.aura.composer.dictation.DictationEngineType r8 = com.facebook.aura.composer.dictation.DictationEngineType.VM
        L56:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r1 = "DictationEngineSelector"
            java.lang.String r0 = "confidential_vm=%s mode=%s is_gateway_connected=%s on_device_supported=%s vm_fallback=%s selected_engine=%s"
            X.CFK.A0G(r1, r0, r2)
            return r8
        L72:
            if (r9 == 0) goto L77
            com.facebook.aura.composer.dictation.DictationEngineType r8 = com.facebook.aura.composer.dictation.DictationEngineType.ON_DEVICE
            goto L56
        L77:
            r8 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.DictationEngineSelector.select(com.facebook.aura.composer.dictation.engine.DictationMode, X.CGz, boolean):com.facebook.aura.composer.dictation.DictationEngineType");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DictationEngineType.values().length];
            try {
                AnonymousClass002.A13(DictationEngineType.VOYAGER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DictationEngineType.ON_DEVICE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DictationEngineType.VM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
