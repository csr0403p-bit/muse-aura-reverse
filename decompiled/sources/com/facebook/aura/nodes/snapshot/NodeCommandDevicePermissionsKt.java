package com.facebook.aura.nodes.snapshot;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.Hr7;
import com.facebook.aura.commands.core.PhotoAccessUtils;
import com.facebook.aura.nodes.core.NodeCommandId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class NodeCommandDevicePermissionsKt {
    public static final List<String> CALENDAR_PERMISSIONS;
    public static final List<String> CONTACTS_PERMISSIONS;
    public static final List<String> CONTACT_RESOLUTION_PERMISSIONS = Collections.singletonList("android.permission.READ_CONTACTS");
    public static final List<List<String>> PERMISSIONS_PROMPTED_TOGETHER;

    public static final List<String> devicePermissionsCommandMayRequest(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        int iOrdinal = nodeCommandId.ordinal();
        return AbstractC0878AGe.A0P(optionalDevicePermissionsForCommand(nodeCommandId), (iOrdinal == 30 || iOrdinal == 31) ? CONTACT_RESOLUTION_PERMISSIONS : preHitlDevicePermissionsToRequest(nodeCommandId, null));
    }

    public static final List<String> devicePermissionsToPrompt(List<String> list) {
        C7384Etj.A0Y(list, 0);
        List<List<String>> list2 = PERMISSIONS_PROMPTED_TOGETHER;
        ArrayList arrayListA0h = C3cG.A0h();
        for (List<String> list3 : list2) {
            List<String> list4 = list3;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (list4.contains(it.next())) {
                        arrayListA0h.add(list3);
                        break;
                    }
                }
            }
        }
        return AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(Hr7.A1F(arrayListA0h), list));
    }

    public static final boolean optionalDevicePermissionDeclineIsRemembered(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        return nodeCommandId == NodeCommandId.REMINDER_SET;
    }

    public static final List<String> optionalDevicePermissionsForCommand(NodeCommandId nodeCommandId) {
        String str;
        C7384Etj.A0Y(nodeCommandId, 0);
        int iOrdinal = nodeCommandId.ordinal();
        if (iOrdinal == 26 || iOrdinal == 27) {
            str = "android.permission.ACCESS_MEDIA_LOCATION";
        } else if (iOrdinal == 15) {
            str = "android.permission.ACCESS_BACKGROUND_LOCATION";
        } else {
            if (iOrdinal != 32) {
                return iOrdinal != 41 ? C0881AGi.A00 : CALENDAR_PERMISSIONS;
            }
            str = "android.permission.CALL_PHONE";
        }
        return Collections.singletonList(str);
    }

    public static final List<String> preHitlDevicePermissionsToRequest(NodeCommandId nodeCommandId, String str) {
        C7384Etj.A0Y(nodeCommandId, 0);
        String permission = "notifications";
        switch (nodeCommandId.ordinal()) {
            case 0:
                permission = "android.permission.READ_CONTACTS";
                break;
            case 1:
                permission = "android.permission.READ_CALL_LOG";
                break;
            case 2:
            case 3:
            case 4:
                return CONTACTS_PERMISSIONS;
            case 6:
            case 15:
                return Arrays.asList("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
            case 9:
            case 10:
            case 12:
            case 61:
                break;
            case 14:
                return announceSetDevicePermissions(str);
            case 18:
                permission = "android.permission.READ_CALENDAR";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                return CALENDAR_PERMISSIONS;
            case 25:
            case 29:
                return Collections.singletonList("android.permission.READ_SMS");
            case 26:
            case 27:
                permission = PhotoAccessUtils.INSTANCE.readPermission();
                break;
            case 30:
            case 31:
                return messageDraftDevicePermissions(str);
            default:
                return C0881AGi.A00;
        }
        return Collections.singletonList(permission);
    }

    public static final String stringParamOrNull(String str, String str2) {
        if (str != null) {
            try {
                Object obj = C60Q.A13(str).get(str2);
                JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                if (jsonPrimitive != null) {
                    return C9oY.A04(jsonPrimitive);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCommandId.values().length];
            try {
                AnonymousClass002.A13(NodeCommandId.CONTACTS_SEARCH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCommandId.CALL_LOG_SEARCH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCommandId.CALENDAR_SEARCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeCommandId.MESSAGE_SEARCH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeCommandId.MESSAGE_ATTACHMENT_GET, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(NodeCommandId.PHOTOS_SEARCH, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(NodeCommandId.PHOTOS_UPLOAD, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(NodeCommandId.CONTACTS_CREATE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(NodeCommandId.CONTACTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(NodeCommandId.CONTACTS_DELETE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(NodeCommandId.CALENDAR_EVENTS_CREATE, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(NodeCommandId.CALENDAR_EVENTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(NodeCommandId.CALENDAR_EVENTS_DELETE, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(NodeCommandId.CALENDAR_REMINDERS_SET, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                C60Q.A1E(NodeCommandId.GEOFENCE_SET, iArr);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NodeCommandId.LOCATION_GET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NodeCommandId.NOTIFICATIONS_GET.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NodeCommandId.NOTIFICATIONS_ACTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NodeCommandId.MEDIA_NOW_PLAYING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NodeCommandId.DND_SET.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NodeCommandId.NOTIFICATIONS_ANNOUNCE_SET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_DRAFT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_SEND.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NodeCommandId.PHONE_CALL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NodeCommandId.REMINDER_SET.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> listA16 = C60O.A16("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
        CONTACTS_PERMISSIONS = listA16;
        List<String> listA162 = C60O.A16("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
        CALENDAR_PERMISSIONS = listA162;
        PERMISSIONS_PROMPTED_TOGETHER = Arrays.asList(listA16, listA162);
    }

    public static final List<String> announceSetDevicePermissions(String str) {
        return "false".equals(stringParamOrNull(str, "enabled")) ? C0881AGi.A00 : Collections.singletonList("notifications");
    }

    public static final List<String> messageDraftDevicePermissions(String str) {
        Boolean boolA0E;
        String strStringParamOrNull = stringParamOrNull(str, "contact_ids");
        if (strStringParamOrNull == null || C7BY.A0j(strStringParamOrNull)) {
            strStringParamOrNull = null;
        }
        boolean zBooleanValue = false;
        boolean zA1X = AnonymousClass002.A1X(strStringParamOrNull);
        String strStringParamOrNull2 = stringParamOrNull(str, "resolve_name");
        if (strStringParamOrNull2 != null && (boolA0E = C7BY.A0E(strStringParamOrNull2)) != null) {
            zBooleanValue = boolA0E.booleanValue();
        }
        return (zA1X || zBooleanValue) ? CONTACT_RESOLUTION_PERMISSIONS : C0881AGi.A00;
    }

    public static final List<String> messageSendDevicePermissions(String str) {
        return messageDraftDevicePermissions(str);
    }

    public static final List<String> preHitlDevicePermissionsToVerify(NodeCommandId nodeCommandId, String str) {
        return AnonymousClass003.A0L(nodeCommandId) == 6 ? Collections.singletonList("android.permission.ACCESS_COARSE_LOCATION") : preHitlDevicePermissionsToRequest(nodeCommandId, str);
    }
}
