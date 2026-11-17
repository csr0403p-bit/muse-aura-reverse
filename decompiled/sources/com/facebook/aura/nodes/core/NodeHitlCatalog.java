package com.facebook.aura.nodes.core;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFI;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import com.facebook.aura.commands.geofence.GeofenceStore;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class NodeHitlCatalog {
    public static final NodeHitlCatalog INSTANCE = new NodeHitlCatalog();
    public static final Set<String> knownDataSourceIds = BFI.A0H(new String[]{"alarms", "calendar", "call_log", HatchNodeCardJsonKt.TYPE_CONTACTS, GeofenceStore.KEY_GEOFENCES, "health", MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, "notifications", "reminders", "sms"});

    public final NodeHitlSpec forCommand(NodeCommandId nodeCommandId) {
        NodeHitlGroup nodeHitlGroup;
        NodeHitlAccess nodeHitlAccess;
        C7384Etj.A0Y(nodeCommandId, 0);
        switch (nodeCommandId.ordinal()) {
            case 0:
                nodeHitlGroup = NodeHitlGroup.CONTACTS;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 1:
                nodeHitlGroup = NodeHitlGroup.CALL_LOG;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 2:
            case 3:
            case 4:
                nodeHitlGroup = NodeHitlGroup.CONTACTS;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 28:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
            case 64:
                return null;
            case 9:
            case 61:
                nodeHitlGroup = NodeHitlGroup.NOTIFICATIONS;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 10:
                nodeHitlGroup = NodeHitlGroup.NOTIFICATIONS;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 12:
                nodeHitlGroup = NodeHitlGroup.DO_NOT_DISTURB;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 18:
            case 23:
                nodeHitlGroup = NodeHitlGroup.CALENDAR;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
                nodeHitlGroup = NodeHitlGroup.CALENDAR;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 25:
            case 29:
                nodeHitlGroup = NodeHitlGroup.SMS;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 26:
            case 27:
                nodeHitlGroup = NodeHitlGroup.PHOTOS;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 31:
                nodeHitlGroup = NodeHitlGroup.SMS_SEND;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 32:
                nodeHitlGroup = NodeHitlGroup.PHONE_CALL;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 40:
                nodeHitlGroup = NodeHitlGroup.ALARMS;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 63:
                nodeHitlGroup = NodeHitlGroup.OTHER;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                nodeHitlGroup = NodeHitlGroup.DISPLAY;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 66:
                nodeHitlGroup = NodeHitlGroup.APPS;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                nodeHitlGroup = NodeHitlGroup.OTHER;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 68:
                nodeHitlGroup = NodeHitlGroup.BROWSER;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case 69:
                nodeHitlGroup = NodeHitlGroup.NAVIGATION;
                nodeHitlAccess = NodeHitlAccess.WRITE;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                nodeHitlGroup = NodeHitlGroup.BUG_REPORT;
                nodeHitlAccess = NodeHitlAccess.READ;
                return new NodeHitlSpec(nodeHitlGroup, nodeHitlAccess);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCommandId.values().length];
            try {
                AnonymousClass002.A13(NodeCommandId.CALENDAR_SEARCH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCommandId.CONTACTS_SEARCH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCommandId.CALL_LOG_SEARCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeCommandId.CONTACTS_CREATE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeCommandId.CONTACTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(NodeCommandId.CONTACTS_DELETE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(NodeCommandId.NETWORK_STATE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(NodeCommandId.LOCATION_GET, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(NodeCommandId.BATTERY_GET, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(NodeCommandId.CLIPBOARD_SET, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(NodeCommandId.NOTIFICATIONS_GET, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(NodeCommandId.NOTIFICATIONS_ACTION, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(NodeCommandId.DND_GET, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(NodeCommandId.DND_SET, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                C60Q.A1E(NodeCommandId.NOTIFICATIONS_ANNOUNCE_GET, iArr);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NodeCommandId.NOTIFICATIONS_ANNOUNCE_SET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NodeCommandId.GEOFENCE_SET.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NodeCommandId.GEOFENCE_REMOVE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NodeCommandId.GEOFENCE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_EVENTS_CREATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_EVENTS_UPDATE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_EVENTS_DELETE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_REMINDERS_SET.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_REMINDERS_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NodeCommandId.CALENDAR_REMINDERS_REMOVE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_SEARCH.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[NodeCommandId.PHOTOS_SEARCH.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[NodeCommandId.PHOTOS_UPLOAD.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[NodeCommandId.PHOTOS_UPLOAD_STATUS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_ATTACHMENT_GET.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_DRAFT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_SEND.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[NodeCommandId.PHONE_CALL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[NodeCommandId.ALARM_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[NodeCommandId.ALARM_DISMISS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[NodeCommandId.ALARM_LIST.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[NodeCommandId.ALARM_DISMISS_ALL.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[NodeCommandId.ALARM_UPDATE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[NodeCommandId.TIMER_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[NodeCommandId.TIMER_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[NodeCommandId.TIMER_CANCEL.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[NodeCommandId.REMINDER_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[NodeCommandId.REMINDER_DISMISS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[NodeCommandId.REMINDER_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[NodeCommandId.REMINDER_DISMISS_ALL.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[NodeCommandId.REMINDER_UPDATE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[NodeCommandId.REMINDER_SNOOZE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[NodeCommandId.SUBSCRIPTIONS_UPGRADE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[NodeCommandId.INVITE_UPSELL.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[NodeCommandId.APP_INFO.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[NodeCommandId.APP_UPDATE_CHECK.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[NodeCommandId.APP_UPDATE_START.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[NodeCommandId.ASSISTANT_SET_DEFAULT.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[NodeCommandId.SHORTCUT_ADD_HOME.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[NodeCommandId.BACKGROUND_SESSION.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[NodeCommandId.CAMERA_OPEN.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[NodeCommandId.FLASHLIGHT_SET.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[NodeCommandId.SHARE_CONTENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[NodeCommandId.EMAIL_COMPOSE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[NodeCommandId.LOCATION_SET_SHARING_MODE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[NodeCommandId.MEDIA_CONTROL.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[NodeCommandId.MEDIA_NOW_PLAYING.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[NodeCommandId.MEDIA_VOLUME_SET.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[NodeCommandId.MEDIA_PLAY.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[NodeCommandId.SETTINGS_OPEN.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[NodeCommandId.DISPLAY_BRIGHTNESS_SET.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[NodeCommandId.APP_OPEN_LINK.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[NodeCommandId.APP_LIST.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[NodeCommandId.APP_OPEN.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[NodeCommandId.NAVIGATION_START.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[NodeCommandId.BUG_REPORT_CREATE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Set<String> getKnownDataSourceIds() {
        return knownDataSourceIds;
    }

    public final NodeHitlSpec forDataSource(String str) {
        NodeHitlGroup nodeHitlGroup;
        switch (C60R.A03(str)) {
            case -1221262756:
                if (!str.equals("health")) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.HEALTH;
                break;
            case -567451565:
                if (!str.equals(HatchNodeCardJsonKt.TYPE_CONTACTS)) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.CONTACTS;
                break;
            case -178324674:
                if (!str.equals("calendar")) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.CALENDAR;
                break;
            case -172298781:
                if (!str.equals("call_log")) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.CALL_LOG;
                break;
            case 114009:
                if (!str.equals("sms")) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.SMS;
                break;
            case 1272354024:
                if (!str.equals("notifications")) {
                    return null;
                }
                nodeHitlGroup = NodeHitlGroup.NOTIFICATIONS;
                break;
            default:
                return null;
        }
        return new NodeHitlSpec(nodeHitlGroup, NodeHitlAccess.READ);
    }
}
