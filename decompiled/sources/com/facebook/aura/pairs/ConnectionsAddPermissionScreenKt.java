package com.facebook.aura.pairs;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C7qW;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsAddPermissionScreenKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddPermissionScreenKt$ConnectionsAddPermissionScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $chatText;
        public final /* synthetic */ MutableState<Boolean> $isSending$delegate;
        public final /* synthetic */ ConnectionsAddPermissionSheetKey $key;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsLogContext connectionsLogContext, AuraNavigator auraNavigator, ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, String str, MutableState<Boolean> mutableState) {
            super(2);
            this.$log = connectionsLogContext;
            this.$navigator = auraNavigator;
            this.$key = connectionsAddPermissionSheetKey;
            this.$chatText = str;
            this.$isSending$delegate = mutableState;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207fc);
            boolean z = !MutableState.A0A((MutableState) this.$isSending$delegate);
            BRg bRgA09 = C3U4.A09(BRg.A00, 16.0f);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$chatText, AnonymousClass001.A1T(bfm, this.$key, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$log))));
            ConnectionsLogContext connectionsLogContext = this.$log;
            AuraNavigator auraNavigator = this.$navigator;
            ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey = this.$key;
            String str = this.$chatText;
            MutableState<Boolean> mutableState = this.$isSending$delegate;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ConnectionsAddPermissionScreenKt$ConnectionsAddPermissionScreen$1$1$1(connectionsLogContext, auraNavigator, connectionsAddPermissionSheetKey, str, mutableState);
                bfm.Ai0(objAaT);
            }
            PairsComponentsKt.PairsPrimaryButton(strA01, (Function0) objAaT, bRgA09, z, false, bfm, 384, 16);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddPermissionScreenKt$ConnectionsAddPermissionScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsAddPermissionSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsAddPermissionSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsAddPermissionScreenKt.ConnectionsAddPermissionScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddPermissionScreenKt$continueInChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C128151 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final C128151 INSTANCE = new C128151();

        public C128151() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                boolean r0 = r1 instanceof com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey
                if (r0 != 0) goto Ld
                boolean r1 = r1 instanceof com.facebook.aura.navigation.key.ConnectionsSheetKey
                r0 = 0
                if (r1 == 0) goto Le
            Ld:
                r0 = 1
            Le:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsAddPermissionScreenKt.C128151.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
        }
    }

    public static final void ConnectionsAddPermissionScreen(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsAddPermissionSheetKey, 0);
        bfm.AgG(1896272445);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, connectionsAddPermissionSheetKey) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA0t = AnonymousClass001.A0t(bfm, connectionsAddPermissionSheetKey.name, R.string._name_removed__res_0x7f1207fa);
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, bfm.AaT(), C78N.A00, false);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_ADD_PERMISSION, bfm, 6);
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, AbstractC07539Wl.A00(bRg2, "connections-add-permission").then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContextRememberConnectionsLogContext, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60)), null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207f9), null, null, null, null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), B1V.A00(bfm, new AnonymousClass1(connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b, connectionsAddPermissionSheetKey, strA0t, mutableState), 494411940), null, null, false, false, false, null, ComposableSingletons$ConnectionsAddPermissionScreenKt.f200lambda$1213120928, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 48, 2021);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectionsAddPermissionSheetKey, bRg2, i, i2);
        }
    }

    public static final void continueInChat(AuraNavigator auraNavigator, String str, String str2) {
        HatchPendingMessage.INSTANCE.setPendingMessage(new HatchPendingMessage.PendingPayload(str2, null, null, AnonymousClass006.A10("product_request", C60O.A1I("connection_permission", C7qW.A01("connection_id", str, C60O.A1K()), C60O.A1K()))));
        auraNavigator.popAll(C128151.INSTANCE);
        AnonymousClass006.A1D(auraNavigator);
    }
}
