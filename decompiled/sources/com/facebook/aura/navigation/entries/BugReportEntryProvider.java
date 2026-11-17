package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.bugreport.AuraBugReportScreenKt;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.BottomSheetSceneStrategy;
import com.facebook.aura.navigation.key.ActivationBugReportScreenKey;
import com.facebook.aura.navigation.key.AuraBugReportDiagnosticLogsScreenKey;
import com.facebook.aura.navigation.key.AuraBugReportScreenKey;
import com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey;
import com.facebook.aura.session.LocalUserSessionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BugReportEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final BugReportEntryProvider INSTANCE = new BugReportEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.BugReportEntryProvider$BugReportScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ String $screenshotUri;
        public final /* synthetic */ String $submissionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, String str3, int i) {
            super(2);
            this.$submissionId = str;
            this.$screenshotUri = str2;
            this.$endpoint = str3;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            BugReportEntryProvider.this.BugReportScreen(this.$submissionId, this.$screenshotUri, this.$endpoint, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        final Map<String, Object> map = AuraTransitionsKt.pushTransitionMetadata;
        G0W<AuraBugReportScreenKey, BFM, Integer, Unit> g0w = ComposableSingletons$BugReportEntryProviderKt.lambda$1312316779;
        c5rn.A00(new G0U<AuraBugReportScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(AuraBugReportScreenKey auraBugReportScreenKey) {
                return auraBugReportScreenKey.toString();
            }
        }, new G0U<AuraBugReportScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraBugReportScreenKey auraBugReportScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraBugReportScreenKey auraBugReportScreenKey) {
                return map;
            }
        }, g0w, C3cG.A0x(AuraBugReportScreenKey.class));
        G0W<ActivationBugReportScreenKey, BFM, Integer, Unit> g0w2 = ComposableSingletons$BugReportEntryProviderKt.f104lambda$1394708031;
        c5rn.A00(new G0U<ActivationBugReportScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$3
            @Override // X.G0U
            public final Object invoke(ActivationBugReportScreenKey activationBugReportScreenKey) {
                return activationBugReportScreenKey.toString();
            }
        }, new G0U<ActivationBugReportScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$4
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ActivationBugReportScreenKey activationBugReportScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ActivationBugReportScreenKey activationBugReportScreenKey) {
                return map;
            }
        }, g0w2, C3cG.A0x(ActivationBugReportScreenKey.class));
        G0W<AuraBugReportDiagnosticLogsScreenKey, BFM, Integer, Unit> g0w3 = ComposableSingletons$BugReportEntryProviderKt.lambda$212607049;
        c5rn.A00(new G0U<AuraBugReportDiagnosticLogsScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$5
            @Override // X.G0U
            public final Object invoke(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey) {
                return auraBugReportDiagnosticLogsScreenKey.toString();
            }
        }, new G0U<AuraBugReportDiagnosticLogsScreenKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$6
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey) {
                return map;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey) {
                return map;
            }
        }, g0w3, C3cG.A0x(AuraBugReportDiagnosticLogsScreenKey.class));
        final Map<String, Object> mapBottomSheet = BottomSheetSceneStrategy.Companion.bottomSheet(true, true, false);
        G0W<ShakeToReportBottomSheetKey, BFM, Integer, Unit> g0w4 = ComposableSingletons$BugReportEntryProviderKt.f105lambda$1511884938;
        c5rn.A00(new G0U<ShakeToReportBottomSheetKey, Object>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$7
            @Override // X.G0U
            public final Object invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return shakeToReportBottomSheetKey.toString();
            }
        }, new G0U<ShakeToReportBottomSheetKey, Map<String, ? extends Object>>() { // from class: com.facebook.aura.navigation.entries.BugReportEntryProvider$provideEntry$$inlined$entry$default$8
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return mapBottomSheet;
            }

            @Override // X.G0U
            public final Map<String, ? extends Object> invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
                return mapBottomSheet;
            }
        }, g0w4, C3cG.A0x(ShakeToReportBottomSheetKey.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BugReportScreen(String str, String str2, String str3, BFM bfm, int i) {
        bfm.AgG(-187330679);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new BugReportEntryProvider$BugReportScreen$1$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA1B = AnonymousClass003.A1B(iA0d) | bfm.A67(auraNavigatorA05) | ((iA0d & 896) == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1B || objAaT2 == C78N.A00) {
                objAaT2 = new BugReportEntryProvider$BugReportScreen$2$1(auraNavigatorA05, str, str3);
                BBI.A0O(bbi, objAaT2);
            }
            AuraBugReportScreenKt.AuraBugReportScreen(function0, str, str2, str3, abstractC3358CGzA06, (Function0) objAaT2, null, bfm, (iA0d << 3) & 8176, 64);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, str3, i);
        }
    }
}
