package com.facebook.aura.commands.core;

import X.AGE;
import X.AGF;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass793;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C77m;
import X.C78N;
import X.C7mU;
import X.C9258GBl;
import X.CFK;
import X.FGI;
import X.FT4;
import X.G0U;
import X.G0V;
import X.GAt;
import X.HpR;
import X.HtJ;
import X.HwU;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.provider.Settings;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.connectorconsent.ConnectorConsentKt;
import com.facebook.aura.connectorconsent.ConnectorConsentUiModel;
import com.facebook.aura.connectorconsent.LocalConnectorConsent;
import com.facebook.aura.connectorconsent.LocalConnectorConsentKt;
import com.facebook.aura.connectorconsent.LocalConnectorConsentType;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.ext.ViewExtKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodePermissionActivity extends ComponentActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final Object lock = C3cG.A0T();
    public static final InterfaceC2261BLa mutex = new C9258GBl();
    public static G0U<? super Boolean, Unit> onFinished;
    public static InterfaceC10560Hsz<Boolean> pendingResult;
    public InterfaceC10560Hsz<Boolean> ownedDeferred;
    public G0U<? super Boolean, Unit> ownedOnFinished;
    public boolean pendingRationaleAccepted;
    public boolean pendingSkipRationaleLaunch;
    public final HwU<String[]> permissionLauncher;
    public final HwU<Intent> settingsLauncher;
    public final MutableState<Boolean> showConsent;
    public final MutableState<Boolean> showSettingsDialog;
    public boolean waitingForSettings;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final Object requestPermissionsInternal(Context context, String[] strArr, String str, String str2, boolean z, boolean z2, HtJ<? super Boolean> htJ) {
            boolean z3;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z3 = true;
                    break;
                }
                if (context.checkSelfPermission(strArr[i]) == 0) {
                    i++;
                } else {
                    if (AuraAppLifecycleManager.INSTANCE.canPresentInteractiveUi()) {
                        GAt gAt = new GAt(null);
                        Object obj = NodePermissionActivity.lock;
                        synchronized (obj) {
                            NodePermissionActivity.pendingResult = gAt;
                        }
                        try {
                            Intent intent = new Intent(context, (Class<?>) NodePermissionActivity.class);
                            intent.putExtra(NodePermissionActivityKt.EXTRA_PERMISSIONS, (String[]) Arrays.copyOf(strArr, length));
                            if (str != null) {
                                intent.putExtra(NodePermissionActivityKt.EXTRA_DENIED_TITLE, str);
                            }
                            if (str2 != null) {
                                intent.putExtra(NodePermissionActivityKt.EXTRA_DENIED_MESSAGE, str2);
                            }
                            intent.putExtra(NodePermissionActivityKt.EXTRA_RATIONALE_FIRST, z);
                            intent.putExtra(NodePermissionActivityKt.EXTRA_RATIONALE_ACCEPTED, z2);
                            intent.addFlags(268435456);
                            C77m.A00(context, intent);
                            return gAt.A0E(htJ);
                        } catch (Exception e) {
                            C60O.A1P("Failed to launch permission activity: ", e.getMessage(), NodePermissionActivityKt.TAG);
                            synchronized (obj) {
                                NodePermissionActivity.pendingResult = null;
                            }
                        }
                    }
                    z3 = false;
                }
            }
            return Boolean.valueOf(z3);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final boolean isSettingsPermissionGrantedStatic(Context context, String str) {
            String str2;
            C7384Etj.A0Y(context, 0);
            if (str != null) {
                switch (str.hashCode()) {
                    case -2003032073:
                        str2 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
                        break;
                    case -1471926860:
                        if (str.equals("android.settings.USAGE_ACCESS_SETTINGS")) {
                            return hasUsageAccessStatic(context);
                        }
                        break;
                    case -575689563:
                        if (str.equals("android.settings.REQUEST_SCHEDULE_EXACT_ALARM")) {
                            if (Build.VERSION.SDK_INT < 31) {
                                return true;
                            }
                            Object systemService = context.getSystemService("alarm");
                            C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                            return ((AlarmManager) systemService).canScheduleExactAlarms();
                        }
                        break;
                    case -260868242:
                        str2 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS";
                        break;
                    case 1005993649:
                        if (str.equals("android.settings.action.MANAGE_WRITE_SETTINGS")) {
                            return Settings.System.canWrite(context);
                        }
                        break;
                }
                if (str.equals(str2)) {
                    return NotificationAccessUtils.INSTANCE.isNotificationAccessGranted(context);
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object requestPermissions(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, X.HtJ<? super java.lang.Boolean> r15) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.core.NodePermissionActivity.Companion.requestPermissions(android.content.Context, java.lang.String[], java.lang.String, java.lang.String, boolean, boolean, X.HtJ):java.lang.Object");
        }

        private final boolean hasUsageAccessStatic(Context context) {
            Object systemService = context.getSystemService("appops");
            AppOpsManager appOpsManager = systemService instanceof AppOpsManager ? (AppOpsManager) systemService : null;
            return appOpsManager != null && appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0;
        }

        public static /* synthetic */ Object requestPermissions$default(Companion companion, Context context, String[] strArr, String str, String str2, boolean z, boolean z2, HtJ htJ, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            boolean zA1Q = AnonymousClass005.A1Q(i, z);
            if ((i & 32) != 0) {
                z2 = false;
            }
            return companion.requestPermissions(context, strArr, str, str2, zA1Q, z2, htJ);
        }

        public static /* synthetic */ Object requestSettingsPermission$default(Companion companion, Context context, Intent intent, String str, String str2, boolean z, HtJ htJ, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.requestSettingsPermission(context, intent, str, str2, AnonymousClass005.A1Q(i, z), htJ);
        }

        public final G0U<Boolean, Unit> getOnFinished() {
            return NodePermissionActivity.onFinished;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object requestSettingsPermission(android.content.Context r16, android.content.Intent r17, java.lang.String r18, java.lang.String r19, boolean r20, X.HtJ<? super java.lang.Boolean> r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.core.NodePermissionActivity.Companion.requestSettingsPermission(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, boolean, X.HtJ):java.lang.Object");
        }

        public final void setOnFinished(G0U<? super Boolean, Unit> g0u) {
            NodePermissionActivity.onFinished = g0u;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ LocalConnectorConsentType $settingsConsentType;
        public final /* synthetic */ Intent $settingsIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LocalConnectorConsentType localConnectorConsentType, Intent intent) {
            super(2);
            this.$settingsConsentType = localConnectorConsentType;
            this.$settingsIntent = intent;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            NodePermissionActivity nodePermissionActivity = NodePermissionActivity.this;
            int i2 = NodePermissionActivity.$stable;
            if (MutableState.A0A((MutableState) nodePermissionActivity.showConsent)) {
                bfm.AgE(1596126342);
                ConnectorConsentUiModel connectorConsentUiModelLocalConnectorConsentModel = LocalConnectorConsentKt.localConnectorConsentModel(this.$settingsConsentType, bfm, 0);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$settingsIntent, bfm.A67(NodePermissionActivity.this));
                NodePermissionActivity nodePermissionActivity2 = NodePermissionActivity.this;
                Intent intent = this.$settingsIntent;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new NodePermissionActivity$onCreate$2$1$1(nodePermissionActivity2, intent);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA67 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity3 = NodePermissionActivity.this;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new NodePermissionActivity$onCreate$2$2$1(nodePermissionActivity3);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA672 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity4 = NodePermissionActivity.this;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new NodePermissionActivity$onCreate$2$3$1(nodePermissionActivity4);
                    bfm.Ai0(objAaT3);
                }
                ConnectorConsentKt.ConnectorConsentBottomSheet(connectorConsentUiModelLocalConnectorConsentModel, function0, function02, (Function0) objAaT3, null, bfm, ConnectorConsentUiModel.$stable, 16);
            } else {
                bfm.AgE(1596510742);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $deniedMessage;
        public final /* synthetic */ String $deniedTitle;
        public final /* synthetic */ Intent $settingsIntent;

        /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $allowText;
            public final /* synthetic */ String $notNowText;
            public final /* synthetic */ Intent $settingsIntent;
            public final /* synthetic */ NodePermissionActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, NodePermissionActivity nodePermissionActivity, Intent intent, String str2) {
                super(2);
                this.$allowText = str;
                this.this$0 = nodePermissionActivity;
                this.$settingsIntent = intent;
                this.$notNowText = str2;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$notNowText, AnonymousClass001.A1T(bfm, this.$settingsIntent, AnonymousClass001.A1T(bfm, this.this$0, bfm.A65(this.$allowText))));
                String str = this.$allowText;
                String str2 = this.$notNowText;
                NodePermissionActivity nodePermissionActivity = this.this$0;
                Intent intent = this.$settingsIntent;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new NodePermissionActivity$onCreate$3$1$1$1(str, str2, nodePermissionActivity, intent);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, Intent intent) {
            super(2);
            this.$deniedTitle = str;
            this.$deniedMessage = str2;
            this.$settingsIntent = intent;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            NodePermissionActivity nodePermissionActivity = NodePermissionActivity.this;
            int i2 = NodePermissionActivity.$stable;
            if (MutableState.A0A((MutableState) nodePermissionActivity.showSettingsDialog)) {
                bfm.AgE(-395219764);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ef);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120705);
                String str = this.$deniedTitle;
                String str2 = this.$deniedMessage;
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(strA01, NodePermissionActivity.this, this.$settingsIntent, strA012), 986490866);
                boolean zA67 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity2 = NodePermissionActivity.this;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new NodePermissionActivity$onCreate$3$2$1(nodePermissionActivity2);
                    bfm.Ai0(objAaT);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
            } else {
                bfm.AgE(-394151132);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ LocalConnectorConsentType $consentType;
        public final /* synthetic */ String $deniedMessage;
        public final /* synthetic */ String $deniedTitle;
        public final /* synthetic */ boolean $rationaleFirst;
        public final /* synthetic */ String[] $ungranted;

        /* renamed from: com.facebook.aura.commands.core.NodePermissionActivity$onCreate$4$4, reason: invalid class name and collision with other inner class name */
        public final class C00634 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $primaryText;
            public final /* synthetic */ boolean $rationaleFirst;
            public final /* synthetic */ String $secondaryText;
            public final /* synthetic */ String[] $ungranted;
            public final /* synthetic */ NodePermissionActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00634(String str, NodePermissionActivity nodePermissionActivity, boolean z, String[] strArr, String str2) {
                super(2);
                this.$primaryText = str;
                this.this$0 = nodePermissionActivity;
                this.$rationaleFirst = z;
                this.$ungranted = strArr;
                this.$secondaryText = str2;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$secondaryText, AnonymousClass001.A1T(bfm, this.$ungranted, AnonymousClass001.A1U(bfm, this.$rationaleFirst, AnonymousClass001.A1T(bfm, this.this$0, bfm.A65(this.$primaryText)))));
                String str = this.$primaryText;
                String str2 = this.$secondaryText;
                NodePermissionActivity nodePermissionActivity = this.this$0;
                boolean z = this.$rationaleFirst;
                String[] strArr = this.$ungranted;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new NodePermissionActivity$onCreate$4$4$1$1(str, str2, nodePermissionActivity, z, strArr);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LocalConnectorConsentType localConnectorConsentType, boolean z, String[] strArr, String str, String str2) {
            super(2);
            this.$consentType = localConnectorConsentType;
            this.$rationaleFirst = z;
            this.$ungranted = strArr;
            this.$deniedTitle = str;
            this.$deniedMessage = str2;
        }

        public final void invoke(BFM bfm, int i) {
            int i2;
            int i3;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            NodePermissionActivity nodePermissionActivity = NodePermissionActivity.this;
            int i4 = NodePermissionActivity.$stable;
            if (!MutableState.A0A((MutableState) nodePermissionActivity.showConsent) || this.$consentType == null) {
                bfm.AgE(349464818);
            } else {
                bfm.AgE(349010265);
                ConnectorConsentUiModel connectorConsentUiModelLocalConnectorConsentModel = LocalConnectorConsentKt.localConnectorConsentModel(this.$consentType, bfm, 0);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$ungranted, AnonymousClass001.A1U(bfm, this.$rationaleFirst, bfm.A67(NodePermissionActivity.this)));
                NodePermissionActivity nodePermissionActivity2 = NodePermissionActivity.this;
                boolean z = this.$rationaleFirst;
                String[] strArr = this.$ungranted;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new NodePermissionActivity$onCreate$4$1$1(nodePermissionActivity2, z, strArr);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA67 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity3 = NodePermissionActivity.this;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new NodePermissionActivity$onCreate$4$2$1(nodePermissionActivity3);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA672 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity4 = NodePermissionActivity.this;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new NodePermissionActivity$onCreate$4$3$1(nodePermissionActivity4);
                    bfm.Ai0(objAaT3);
                }
                ConnectorConsentKt.ConnectorConsentBottomSheet(connectorConsentUiModelLocalConnectorConsentModel, function0, function02, (Function0) objAaT3, null, bfm, ConnectorConsentUiModel.$stable, 16);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (MutableState.A0A((MutableState) NodePermissionActivity.this.showSettingsDialog)) {
                bfm.AgE(349535932);
                if (this.$rationaleFirst) {
                    bfm.AgE(1535296857);
                    i2 = R.string._name_removed__res_0x7f1206ef;
                } else {
                    bfm.AgE(1535298753);
                    i2 = R.string._name_removed__res_0x7f120707;
                }
                String strA0s = AnonymousClass001.A0s(bfm, bbiA07, i2);
                if (this.$rationaleFirst) {
                    bfm.AgE(1535302267);
                    i3 = R.string._name_removed__res_0x7f120705;
                } else {
                    bfm.AgE(1535304218);
                    i3 = R.string._name_removed__res_0x7f1206f0;
                }
                String strA0s2 = AnonymousClass001.A0s(bfm, bbiA07, i3);
                String str = this.$deniedTitle;
                String str2 = this.$deniedMessage;
                B1U b1uA00 = B1V.A00(bfm, new C00634(strA0s, NodePermissionActivity.this, this.$rationaleFirst, this.$ungranted, strA0s2), -64876947);
                boolean zA673 = bfm.A67(NodePermissionActivity.this);
                NodePermissionActivity nodePermissionActivity5 = NodePermissionActivity.this;
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new NodePermissionActivity$onCreate$4$5$1(nodePermissionActivity5);
                    bfm.Ai0(objAaT4);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT4, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
            } else {
                bfm.AgE(350602642);
            }
            BBI.A0R(bbiA07, false);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchSettingsForConsent(Intent intent) {
        try {
            this.waitingForSettings = true;
            this.settingsLauncher.A01(null, intent);
        } catch (Exception e) {
            CFK.A04(NodePermissionActivityKt.TAG, FGI.A0M("Failed to launch settings: ", e.getMessage()));
            deliverResult(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAppSettings() {
        this.waitingForSettings = true;
        C7mU.A00().A04().A05(this, C60R.A09(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int length;
        MutableState<Boolean> mutableState;
        super.onCreate(bundle);
        this.waitingForSettings = bundle != null ? bundle.getBoolean(NodePermissionActivityKt.STATE_WAITING_FOR_SETTINGS, false) : false;
        synchronized (lock) {
            this.ownedDeferred = pendingResult;
            this.ownedOnFinished = onFinished;
            onFinished = null;
        }
        if (this.waitingForSettings) {
            return;
        }
        Intent intent = (Intent) getIntent().getParcelableExtra(NodePermissionActivityKt.EXTRA_SETTINGS_INTENT);
        if (intent != null) {
            if (!Companion.isSettingsPermissionGrantedStatic(this, intent.getAction())) {
                LocalConnectorConsentType localConnectorConsentType = settingsConsentTypeFor(intent.getAction());
                if (localConnectorConsentType != null) {
                    ViewExtKt.auraSetContent(this, AuraThemeMode.DEFAULT, B1V.A01(new AnonymousClass2(localConnectorConsentType, intent), -614975476, true));
                    mutableState = this.showConsent;
                } else {
                    if (getIntent().getBooleanExtra(NodePermissionActivityKt.EXTRA_SKIP_RATIONALE, false)) {
                        this.pendingSkipRationaleLaunch = true;
                        return;
                    }
                    String stringExtra = getIntent().getStringExtra(NodePermissionActivityKt.EXTRA_DENIED_TITLE);
                    if (stringExtra == null) {
                        stringExtra = getString(R.string._name_removed__res_0x7f120b89);
                    }
                    String stringExtra2 = getIntent().getStringExtra(NodePermissionActivityKt.EXTRA_DENIED_MESSAGE);
                    if (stringExtra2 == null) {
                        stringExtra2 = getString(R.string._name_removed__res_0x7f120b88);
                    }
                    ViewExtKt.auraSetContent(this, AuraThemeMode.DEFAULT, B1V.A01(new AnonymousClass3(stringExtra, stringExtra2, intent), -354527202, true));
                    mutableState = this.showSettingsDialog;
                }
                MutableState.A09(true, mutableState);
                return;
            }
            deliverResult(true);
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra(NodePermissionActivityKt.EXTRA_PERMISSIONS);
        if (stringArrayExtra == null || (length = stringArrayExtra.length) == 0) {
            CFK.A04(NodePermissionActivityKt.TAG, "No permissions specified");
            deliverResult(false);
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            String str = stringArrayExtra[i];
            if (checkSelfPermission(str) != 0) {
                arrayListA0h.add(str);
            }
            i++;
        } while (i < length);
        String[] strArr = (String[]) arrayListA0h.toArray(new String[0]);
        if (strArr.length != 0) {
            String stringExtra3 = getIntent().getStringExtra(NodePermissionActivityKt.EXTRA_DENIED_TITLE);
            if (stringExtra3 == null) {
                stringExtra3 = getString(R.string._name_removed__res_0x7f120b89);
            }
            String stringExtra4 = getIntent().getStringExtra(NodePermissionActivityKt.EXTRA_DENIED_MESSAGE);
            if (stringExtra4 == null) {
                stringExtra4 = getString(R.string._name_removed__res_0x7f120b88);
            }
            boolean booleanExtra = getIntent().getBooleanExtra(NodePermissionActivityKt.EXTRA_RATIONALE_FIRST, false);
            LocalConnectorConsentType localConnectorConsentTypeTypeForPermissions = LocalConnectorConsent.INSTANCE.typeForPermissions(BFI.A0G(stringArrayExtra));
            ViewExtKt.auraSetContent(this, AuraThemeMode.DEFAULT, B1V.A01(new AnonymousClass4(localConnectorConsentTypeTypeForPermissions, booleanExtra, strArr, stringExtra3, stringExtra4), -954825936, true));
            if (localConnectorConsentTypeTypeForPermissions != null) {
                mutableState = this.showConsent;
            } else if (!booleanExtra) {
                this.permissionLauncher.A01(null, strArr);
                return;
            } else {
                if (getIntent().getBooleanExtra(NodePermissionActivityKt.EXTRA_RATIONALE_ACCEPTED, false)) {
                    this.pendingRationaleAccepted = true;
                    return;
                }
                mutableState = this.showSettingsDialog;
            }
            MutableState.A09(true, mutableState);
            return;
        }
        deliverResult(true);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(NodePermissionActivityKt.STATE_WAITING_FOR_SETTINGS, this.waitingForSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void acceptRationale(String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            this.permissionLauncher.A01(null, strArr);
        } else {
            openAppSettings();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverResult(boolean z) {
        synchronized (lock) {
            InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.ownedDeferred;
            if (interfaceC10560Hsz != null) {
                ((GAt) interfaceC10560Hsz).A0R(Boolean.valueOf(z));
                if (pendingResult == interfaceC10560Hsz) {
                    pendingResult = null;
                }
            }
            this.ownedDeferred = null;
        }
        G0U<? super Boolean, Unit> g0u = this.ownedOnFinished;
        if (g0u != null) {
            AnonymousClass001.A1K(z, g0u);
        }
        this.ownedOnFinished = null;
        PermissionChangeNotifier.INSTANCE.notifyChanged();
        finish();
    }

    private final boolean isSettingsPermissionGranted(String str) {
        return Companion.isSettingsPermissionGrantedStatic(this, str);
    }

    private final LocalConnectorConsentType settingsConsentTypeFor(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2003032073) {
            str2 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
        } else {
            if (iHashCode != -260868242) {
                if (iHashCode == 1588986136 && str.equals(HealthConnectPermissionUtils.PERMISSION_REQUEST_ACTION)) {
                    return LocalConnectorConsentType.HEALTH;
                }
                return null;
            }
            str2 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS";
        }
        if (str.equals(str2)) {
            return LocalConnectorConsentType.NOTIFICATIONS;
        }
        return null;
    }

    public NodePermissionActivity() {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE ageA01 = AGF.A01();
        this.showSettingsDialog = C3cG.A08(ageA01, boolA0h);
        this.showConsent = C3cG.A08(ageA01, boolA0h);
        this.permissionLauncher = registerForActivityResult(new AnonymousClass793(), new FT4() { // from class: com.facebook.aura.commands.core.NodePermissionActivity$permissionLauncher$1
            @Override // X.FT4
            public final void onActivityResult(Map<String, Boolean> map) {
                C7384Etj.A0Y(map, 0);
                Collection<Boolean> collectionValues = map.values();
                boolean z = false;
                if (collectionValues == null || !collectionValues.isEmpty()) {
                    Iterator<Boolean> it = collectionValues.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (AnonymousClass001.A1X(it.next())) {
                            z = true;
                            break;
                        }
                    }
                }
                NodePermissionActivity nodePermissionActivity = this.this$0;
                if (z) {
                    nodePermissionActivity.deliverResult(true);
                } else {
                    int i = NodePermissionActivity.$stable;
                    MutableState.A09(true, nodePermissionActivity.showSettingsDialog);
                }
            }
        });
        this.settingsLauncher = registerForActivityResult(new HpR(), new FT4() { // from class: com.facebook.aura.commands.core.NodePermissionActivity$settingsLauncher$1
            public final void onActivityResult(ActivityResult activityResult) {
            }

            @Override // X.FT4
            public /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        synchronized (lock) {
            InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.ownedDeferred;
            if (interfaceC10560Hsz != null && interfaceC10560Hsz.isActive()) {
                ((GAt) interfaceC10560Hsz).A0R(false);
                if (pendingResult == interfaceC10560Hsz) {
                    pendingResult = null;
                }
            }
            this.ownedDeferred = null;
        }
        G0U<? super Boolean, Unit> g0u = this.ownedOnFinished;
        if (g0u != null) {
            AnonymousClass001.A1K(false, g0u);
        }
        this.ownedOnFinished = null;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zIsSettingsPermissionGrantedStatic = true;
        if (this.pendingSkipRationaleLaunch) {
            this.pendingSkipRationaleLaunch = false;
            Parcelable parcelableExtra = getIntent().getParcelableExtra(NodePermissionActivityKt.EXTRA_SETTINGS_INTENT);
            if (parcelableExtra == null) {
                deliverResult(false);
                return;
            }
            try {
                this.waitingForSettings = true;
                this.settingsLauncher.A01(null, parcelableExtra);
                return;
            } catch (Exception e) {
                C60O.A1P("Failed to launch settings: ", e.getMessage(), NodePermissionActivityKt.TAG);
                deliverResult(false);
                return;
            }
        }
        if (this.pendingRationaleAccepted) {
            this.pendingRationaleAccepted = false;
            String[] stringArrayExtra = getIntent().getStringArrayExtra(NodePermissionActivityKt.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (String str : stringArrayExtra) {
                if (checkSelfPermission(str) != 0) {
                    arrayListA0h.add(str);
                }
            }
            String[] strArr = (String[]) arrayListA0h.toArray(new String[0]);
            if (strArr.length != 0) {
                acceptRationale(strArr);
                return;
            }
        } else {
            if (!this.waitingForSettings) {
                return;
            }
            this.waitingForSettings = false;
            Intent intent = (Intent) getIntent().getParcelableExtra(NodePermissionActivityKt.EXTRA_SETTINGS_INTENT);
            if (intent == null) {
                String[] stringArrayExtra2 = getIntent().getStringArrayExtra(NodePermissionActivityKt.EXTRA_PERMISSIONS);
                if (stringArrayExtra2 == null) {
                    stringArrayExtra2 = new String[0];
                }
                int length = stringArrayExtra2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (checkSelfPermission(stringArrayExtra2[i]) != 0) {
                        zIsSettingsPermissionGrantedStatic = false;
                        break;
                    }
                    i++;
                }
            } else {
                zIsSettingsPermissionGrantedStatic = Companion.isSettingsPermissionGrantedStatic(this, intent.getAction());
            }
        }
        deliverResult(zIsSettingsPermissionGrantedStatic);
    }
}
