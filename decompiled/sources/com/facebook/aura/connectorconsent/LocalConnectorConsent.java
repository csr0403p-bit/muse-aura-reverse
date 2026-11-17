package com.facebook.aura.connectorconsent;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class LocalConnectorConsent {
    public static final int $stable = 0;
    public static final String HEALTH_CONNECT_PERMISSION_PREFIX = "android.permission.health.";
    public static final LocalConnectorConsent INSTANCE = new LocalConnectorConsent();

    public final int footerRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(ConnectorConsentSyncCategory connectorConsentSyncCategory) {
        int iA0E = AnonymousClass001.A0E(connectorConsentSyncCategory, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f120af8;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f120af9;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f120afa;
        }
        if (iA0E == 3) {
            return R.string._name_removed__res_0x7f120af6;
        }
        throw C3cG.A0q();
    }

    public final LocalConnectorConsentType typeForPermissions(Collection<String> collection) {
        C7384Etj.A0Y(collection, 0);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            LocalConnectorConsentType localConnectorConsentTypeTypeForPermission = INSTANCE.typeForPermission(AnonymousClass005.A0j(it));
            if (localConnectorConsentTypeTypeForPermission != null) {
                return localConnectorConsentTypeTypeForPermission;
            }
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocalConnectorConsentType.values().length];
            try {
                AnonymousClass005.A0v(LocalConnectorConsentType.CALENDAR, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(LocalConnectorConsentType.CONTACTS, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(LocalConnectorConsentType.MESSAGES, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(LocalConnectorConsentType.PHONE, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LocalConnectorConsentType.NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LocalConnectorConsentType.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LocalConnectorConsentType.LOCATION, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(LocalConnectorConsentType.HEALTH, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(LocalConnectorConsentType.PHOTOS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectorConsentSyncCategory.values().length];
            try {
                AnonymousClass005.A0v(ConnectorConsentSyncCategory.HISTORICAL_SYNC, iArr2, 1);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(ConnectorConsentSyncCategory.PROACTIVE_PERSISTED, iArr2, 2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(ConnectorConsentSyncCategory.PROACTIVE_TRANSIENT, iArr2, 3);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(ConnectorConsentSyncCategory.NO_SYNC, iArr2, 4);
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final int accessBulletRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
                return R.string._name_removed__res_0x7f120ae0;
            case 1:
                return R.string._name_removed__res_0x7f120ae2;
            case 2:
                return R.string._name_removed__res_0x7f120ae5;
            case 3:
                return R.string._name_removed__res_0x7f120ae7;
            case 4:
                return R.string._name_removed__res_0x7f120ae6;
            case 5:
                return R.string._name_removed__res_0x7f120ae1;
            case 6:
                return R.string._name_removed__res_0x7f120ae4;
            case 7:
                return R.string._name_removed__res_0x7f120ae3;
            case 8:
                return R.string._name_removed__res_0x7f120ae8;
            default:
                throw C3cG.A0q();
        }
    }

    public final ConnectorConsentSyncCategory categoryFor$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
            case 1:
                return ConnectorConsentSyncCategory.HISTORICAL_SYNC;
            case 2:
            case 4:
                return ConnectorConsentSyncCategory.PROACTIVE_TRANSIENT;
            case 3:
            case 5:
                return ConnectorConsentSyncCategory.NO_SYNC;
            case 6:
            case 7:
            case 8:
                return ConnectorConsentSyncCategory.PROACTIVE_PERSISTED;
            default:
                throw C3cG.A0q();
        }
    }

    public final int descriptionRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
                return R.string._name_removed__res_0x7f120aed;
            case 1:
                return R.string._name_removed__res_0x7f120aef;
            case 2:
                return R.string._name_removed__res_0x7f120af2;
            case 3:
                return R.string._name_removed__res_0x7f120af4;
            case 4:
                return R.string._name_removed__res_0x7f120af3;
            case 5:
                return R.string._name_removed__res_0x7f120aee;
            case 6:
                return R.string._name_removed__res_0x7f120af1;
            case 7:
                return R.string._name_removed__res_0x7f120af0;
            case 8:
                return R.string._name_removed__res_0x7f120af5;
            default:
                throw C3cG.A0q();
        }
    }

    public final int iconRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
                return R.drawable.hatch_connector_logos_connectorgenericcal;
            case 1:
            case 8:
                return R.drawable.hatch_connector_logos_connectorgeneric;
            case 2:
                return R.drawable.hatch_connector_logos_connectorgenericchat;
            case 3:
            case 5:
                return R.drawable.hatch_connector_logos_connectorgenericphone;
            case 4:
                return R.drawable.hatch_connector_logos_connectorgenericnotifs;
            case 6:
                return R.drawable.meta_brand_design_system_icons_vector_map_dropper_filled;
            case 7:
                return R.drawable.health_connect_icon;
            default:
                throw C3cG.A0q();
        }
    }

    public final int manageBulletRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
                return R.string._name_removed__res_0x7f120afb;
            case 1:
                return R.string._name_removed__res_0x7f120afd;
            case 2:
                return R.string._name_removed__res_0x7f120b00;
            case 3:
                return R.string._name_removed__res_0x7f120b02;
            case 4:
                return R.string._name_removed__res_0x7f120b01;
            case 5:
                return R.string._name_removed__res_0x7f120afc;
            case 6:
                return R.string._name_removed__res_0x7f120aff;
            case 7:
                return R.string._name_removed__res_0x7f120afe;
            case 8:
                return R.string._name_removed__res_0x7f120b03;
            default:
                throw C3cG.A0q();
        }
    }

    public final int titleRes$fbandroid_express_aura_java_com_facebook_aura_connectorconsent_connectorconsent(LocalConnectorConsentType localConnectorConsentType) {
        switch (AnonymousClass003.A0L(localConnectorConsentType)) {
            case 0:
                return R.string._name_removed__res_0x7f120b6e;
            case 1:
                return R.string._name_removed__res_0x7f120b70;
            case 2:
                return R.string._name_removed__res_0x7f120b72;
            case 3:
                return R.string._name_removed__res_0x7f120b74;
            case 4:
                return R.string._name_removed__res_0x7f120b73;
            case 5:
                return R.string._name_removed__res_0x7f120b6f;
            case 6:
                return R.string._name_removed__res_0x7f120b04;
            case 7:
                return R.string._name_removed__res_0x7f120b71;
            case 8:
                return R.string._name_removed__res_0x7f120b75;
            default:
                throw C3cG.A0q();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.connectorconsent.LocalConnectorConsentType typeForPermission(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = X.C60R.A03(r3)
            switch(r0) {
                case -2062386608: goto L13;
                case -1928411001: goto L16;
                case -1921431796: goto L19;
                case -1888586689: goto L24;
                case -1142799244: goto L27;
                case -406040016: goto L2a;
                case -63024214: goto L2d;
                case 52602690: goto L38;
                case 112197485: goto L43;
                case 175802396: goto L4e;
                case 214526995: goto L59;
                case 603653886: goto L5c;
                case 1977429404: goto L67;
                default: goto L7;
            }
        L7:
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r2 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.HEALTH
            java.lang.String r0 = "android.permission.health."
            r1 = 0
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L71
            return r2
        L13:
            java.lang.String r0 = "android.permission.READ_SMS"
            goto L3a
        L16:
            java.lang.String r0 = "android.permission.READ_CALENDAR"
            goto L5e
        L19:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.CALL_LOG
            return r1
        L24:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            goto L2f
        L27:
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            goto L50
        L2a:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            goto L50
        L2d:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
        L2f:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.LOCATION
            return r1
        L38:
            java.lang.String r0 = "android.permission.SEND_SMS"
        L3a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.MESSAGES
            return r1
        L43:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.PHONE
            return r1
        L4e:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
        L50:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.PHOTOS
            return r1
        L59:
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            goto L69
        L5c:
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
        L5e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.CALENDAR
            return r1
        L67:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
        L69:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            com.facebook.aura.connectorconsent.LocalConnectorConsentType r1 = com.facebook.aura.connectorconsent.LocalConnectorConsentType.CONTACTS
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.connectorconsent.LocalConnectorConsent.typeForPermission(java.lang.String):com.facebook.aura.connectorconsent.LocalConnectorConsentType");
    }
}
