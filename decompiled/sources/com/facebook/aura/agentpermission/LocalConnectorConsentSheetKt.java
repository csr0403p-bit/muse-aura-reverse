package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.C07C;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import android.content.Context;
import com.facebook.aura.connectorconsent.ConnectorConsentKt;
import com.facebook.aura.connectorconsent.ConnectorConsentUiModel;
import com.facebook.aura.connectorconsent.LocalConnectorConsentKt;
import com.facebook.aura.connectorconsent.LocalConnectorConsentType;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class LocalConnectorConsentSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ LocalConnectorConsentType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LocalConnectorConsentType localConnectorConsentType, AuraNavigator auraNavigator, Context context) {
            super(3);
            this.$type = localConnectorConsentType;
            this.$navigator = auraNavigator;
            this.$context = context;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$type == null) {
                bfm.AgE(155777254);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
                AnonymousClass001.A1D(bfm);
                return;
            }
            AnonymousClass003.A0l(bfm, 155900262);
            ConnectorConsentUiModel connectorConsentUiModelLocalConnectorConsentModel = LocalConnectorConsentKt.localConnectorConsentModel(this.$type, bfm, 0);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$navigator));
            AuraNavigator auraNavigator2 = this.$navigator;
            Context context = this.$context;
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2$2$1(auraNavigator2, context);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA672 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator3 = this.$navigator;
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$2$3$1(auraNavigator3);
                bfm.Ai0(objAaT3);
            }
            ConnectorConsentKt.ConnectorConsentContent(connectorConsentUiModelLocalConnectorConsentModel, function0, (Function0) objAaT3, null, false, false, null, null, null, bfm, ConnectorConsentUiModel.$stable, 504);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PermissionDestination $destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PermissionDestination permissionDestination, int i) {
            super(2);
            this.$destination = permissionDestination;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            LocalConnectorConsentSheetKt.LocalConnectorConsentSheet(this.$destination, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void LocalConnectorConsentSheet(PermissionDestination permissionDestination, BFM bfm, int i) {
        C7384Etj.A0Y(permissionDestination, 0);
        bfm.AgG(-1384370375);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, permissionDestination) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA08), bfm, iA08)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            LocalConnectorConsentType localConnectorConsentType = toLocalConnectorConsentType(permissionDestination);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = LocalConnectorConsentHandshake.onAccept;
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1(function0);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, function0);
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, null, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(localConnectorConsentType, auraNavigatorA0b, contextA0H), -358257124), bfm, 0, 48, 2047);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(permissionDestination, i);
        }
    }

    public static final boolean requiresLocalConnectorConsent(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        return toLocalConnectorConsentType(permissionDestination) != null;
    }

    public static final LocalConnectorConsentType toLocalConnectorConsentType(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (permissionDestination.ordinal()) {
            case 0:
                return LocalConnectorConsentType.LOCATION;
            case 1:
                return LocalConnectorConsentType.CONTACTS;
            case 2:
                return LocalConnectorConsentType.CALENDAR;
            case 3:
                return LocalConnectorConsentType.HEALTH;
            case 4:
                return LocalConnectorConsentType.MESSAGES;
            case 5:
                return LocalConnectorConsentType.CALL_LOG;
            case 6:
                return LocalConnectorConsentType.PHONE;
            case 7:
                return LocalConnectorConsentType.PHOTOS;
            case 8:
                return LocalConnectorConsentType.NOTIFICATIONS;
            case 9:
            case 10:
            case 11:
                return null;
            default:
                throw C3cG.A0q();
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDestination.values().length];
            try {
                AnonymousClass002.A13(PermissionDestination.CONTACTS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PermissionDestination.CALENDAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PermissionDestination.MESSAGES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PermissionDestination.PHONE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PermissionDestination.PHONE_NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PermissionDestination.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PermissionDestination.LOCATION, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PermissionDestination.HEALTH, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PermissionDestination.PHOTOS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PermissionDestination.MICROPHONE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(PermissionDestination.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(PermissionDestination.RUN_IN_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
