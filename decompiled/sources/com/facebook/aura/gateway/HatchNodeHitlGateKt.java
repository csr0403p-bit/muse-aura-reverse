package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C4JM;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.C9tI;
import X.FGI;
import android.app.Application;
import android.content.Context;
import android.text.format.DateUtils;
import com.facebook.aura.R;
import com.facebook.aura.commands.calendar.CalendarEventsCreateHandlerKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeHitlAccess;
import com.facebook.aura.nodes.core.NodeHitlGroup;
import com.facebook.aura.nodes.core.NodeHitlMode;
import com.facebook.aura.nodes.core.NodeHitlRequest;
import com.facebook.aura.nodes.core.NodeHitlRequestKind;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchNodeHitlGateKt {
    public static final Set<NodeHitlGroup> ALLOW_ONCE_PER_REQUEST_GROUPS;
    public static final Map<NodeCommandId, String> BATCH_COLLECTION_BY_COMMAND;
    public static final long CARRY_OVER_WINDOW_MS = 300000;
    public static final long CONNECTOR_BASELINE_FETCH_TIMEOUT_MS = 5000;
    public static final long COPY_FETCH_TIMEOUT_MS = 8000;
    public static final Map<String, Integer> DND_MODE_LABELS;
    public static final List<String> END_KEYS;
    public static final String LOCAL_APPROVAL_PREFIX = "local_node_hitl";
    public static final long MIN_HITL_PROMPT_MS = 1000;
    public static final Set<NodeHitlGroup> NO_ALLOW_ALWAYS_GROUPS;
    public static final int PREVIEW_DATE_FLAGS = 20;
    public static final int PREVIEW_DATE_TIME_FLAGS = 21;
    public static final List<PreviewField> PREVIEW_FIELDS;
    public static final String TAG = "HatchNodeHitlGate";
    public static final List<PreviewField> TIMER_CANCEL_PREVIEW_FIELDS;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NodeCommandId.values().length];
            try {
                AnonymousClass005.A0v(NodeCommandId.CALENDAR_EVENTS_CREATE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.CALENDAR_EVENTS_UPDATE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.CALENDAR_EVENTS_DELETE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeCommandId.CALENDAR_REMINDERS_SET, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeCommandId.CALENDAR_REMINDERS_REMOVE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(NodeCommandId.CONTACTS_CREATE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(NodeCommandId.CONTACTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(NodeCommandId.CONTACTS_DELETE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(NodeCommandId.MESSAGE_SEND, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(NodeCommandId.NOTIFICATIONS_ACTION, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(NodeCommandId.TIMER_CANCEL, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(NodeCommandId.CALENDAR_SEARCH, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(NodeCommandId.CALENDAR_REMINDERS_LIST, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(NodeCommandId.CONTACTS_SEARCH, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                C60Q.A1E(NodeCommandId.CALL_LOG_SEARCH, iArr);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NodeCommandId.MESSAGE_SEARCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NodeCommandId.PHOTOS_SEARCH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NodeCommandId.PHOTOS_UPLOAD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NodeCommandId.NOTIFICATIONS_GET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NodeCommandId.NAVIGATION_START.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NodeCommandId.APP_OPEN_LINK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NodeCommandId.PHONE_CALL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NodeCommandId.DND_SET.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NodeCommandId.DISPLAY_BRIGHTNESS_SET.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PreviewFormat.values().length];
            try {
                AnonymousClass005.A0v(PreviewFormat.TEXT, iArr2, 1);
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AnonymousClass005.A0v(PreviewFormat.WINDOW_DATE, iArr2, 2);
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AnonymousClass005.A0v(PreviewFormat.INSTANT, iArr2, 3);
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        NodeHitlGroup nodeHitlGroup = NodeHitlGroup.SMS_SEND;
        NodeHitlGroup nodeHitlGroup2 = NodeHitlGroup.PHONE_CALL;
        NodeHitlGroup nodeHitlGroup3 = NodeHitlGroup.BROWSER;
        NodeHitlGroup nodeHitlGroup4 = NodeHitlGroup.NAVIGATION;
        ALLOW_ONCE_PER_REQUEST_GROUPS = BFI.A0H(new NodeHitlGroup[]{nodeHitlGroup, nodeHitlGroup2, nodeHitlGroup3, nodeHitlGroup4, NodeHitlGroup.DO_NOT_DISTURB});
        NO_ALLOW_ALWAYS_GROUPS = BFI.A0H(new NodeHitlGroup[]{nodeHitlGroup3, nodeHitlGroup4, NodeHitlGroup.APPS});
        DND_MODE_LABELS = C3cH.A0m("alarms_only", Integer.valueOf(R.string._name_removed__res_0x7f1202ee), C3cG.A0r(HatchUtil.TYPING_INDICATOR_STATE_OFF, Integer.valueOf(R.string._name_removed__res_0x7f1202f0)), C3cG.A0r("priority", Integer.valueOf(R.string._name_removed__res_0x7f1202f1)));
        BATCH_COLLECTION_BY_COMMAND = AGH.A0D(C3cG.A0r(NodeCommandId.CALENDAR_EVENTS_CREATE, CalendarEventsCreateHandlerKt.PARAM_EVENTS), C3cG.A0r(NodeCommandId.CALENDAR_EVENTS_UPDATE, "updates"), C3cG.A0r(NodeCommandId.CALENDAR_EVENTS_DELETE, "targets"), C3cG.A0r(NodeCommandId.CALENDAR_REMINDERS_SET, "reminders"), C3cG.A0r(NodeCommandId.CALENDAR_REMINDERS_LIST, "targets"), C3cG.A0r(NodeCommandId.CALENDAR_REMINDERS_REMOVE, "targets"), C3cG.A0r(NodeCommandId.CONTACTS_CREATE, HatchNodeCardJsonKt.TYPE_CONTACTS), C3cG.A0r(NodeCommandId.CONTACTS_UPDATE, "updates"), C3cG.A0r(NodeCommandId.CONTACTS_DELETE, "targets"), C3cG.A0r(NodeCommandId.ALARM_DISMISS, "targets"), C3cG.A0r(NodeCommandId.ALARM_UPDATE, "updates"), C3cG.A0r(NodeCommandId.REMINDER_SET, "reminders"), C3cG.A0r(NodeCommandId.REMINDER_DISMISS, "targets"), C3cG.A0r(NodeCommandId.REMINDER_UPDATE, "updates"), C3cG.A0r(NodeCommandId.REMINDER_SNOOZE, "targets"));
        END_KEYS = C60O.A16("end_date", "end_time");
        List listSingletonList = Collections.singletonList("title");
        PreviewFormat previewFormat = PreviewFormat.TEXT;
        PreviewField previewField = new PreviewField(R.string._name_removed__res_0x7f120300, listSingletonList, previewFormat, null);
        PreviewField previewField2 = new PreviewField(R.string._name_removed__res_0x7f1202f8, Collections.singletonList("name"), previewFormat, null);
        PreviewField previewField3 = new PreviewField(R.string._name_removed__res_0x7f1202fd, Collections.singletonList("query"), previewFormat, null);
        PreviewField previewField4 = new PreviewField(R.string._name_removed__res_0x7f1202f5, Collections.singletonList("uri"), previewFormat, null);
        PreviewField previewField5 = new PreviewField(R.string._name_removed__res_0x7f1202fa, Collections.singletonList("package"), previewFormat, NodeCommandId.APP_OPEN_LINK);
        PreviewField previewField6 = new PreviewField(R.string._name_removed__res_0x7f1202e8, C60O.A16("app_name", "package"), previewFormat, NodeCommandId.APP_OPEN);
        PreviewField previewField7 = new PreviewField(R.string._name_removed__res_0x7f1202ed, Collections.singletonList("destination"), previewFormat, null);
        PreviewField previewField8 = new PreviewField(R.string._name_removed__res_0x7f1202fe, Collections.singletonList("recipients"), previewFormat, null);
        PreviewField previewField9 = new PreviewField(R.string._name_removed__res_0x7f1202f7, Collections.singletonList(MetaAiAppBroadcastSender.EXTRA_BODY), previewFormat, null);
        PreviewField previewField10 = new PreviewField(R.string._name_removed__res_0x7f1202ff, Collections.singletonList("start_date"), PreviewFormat.WINDOW_DATE, null);
        PreviewField previewField11 = new PreviewField(R.string._name_removed__res_0x7f1202ff, Collections.singletonList("start_time"), PreviewFormat.INSTANT, null);
        PreviewField previewField12 = new PreviewField(R.string._name_removed__res_0x7f1202f3, Collections.singletonList("end_date"), PreviewFormat.WINDOW_DATE, null);
        PreviewField previewField13 = new PreviewField(R.string._name_removed__res_0x7f1202f3, Collections.singletonList("end_time"), PreviewFormat.INSTANT, null);
        List listSingletonList2 = Collections.singletonList(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        PreviewFormat previewFormat2 = PreviewFormat.TEXT;
        PREVIEW_FIELDS = Arrays.asList(previewField, previewField2, previewField3, previewField4, previewField5, previewField6, previewField7, previewField8, previewField9, previewField10, previewField11, previewField12, previewField13, new PreviewField(R.string._name_removed__res_0x7f1202f6, listSingletonList2, previewFormat2, null), new PreviewField(R.string._name_removed__res_0x7f1202fb, Collections.singletonList("organization"), previewFormat2, null), new PreviewField(R.string._name_removed__res_0x7f1202fc, Collections.singletonList("phone_number"), previewFormat2, null), new PreviewField(R.string._name_removed__res_0x7f1202f2, Collections.singletonList("email"), previewFormat2, null), new PreviewField(R.string._name_removed__res_0x7f1202f9, C60O.A16(HatchWebPageParserKt.DESCRIPTION, "notes"), previewFormat2, null));
        TIMER_CANCEL_PREVIEW_FIELDS = Collections.singletonList(new PreviewField(R.string._name_removed__res_0x7f1202f8, Collections.singletonList("label"), previewFormat2, null));
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField brightnessRow(Context context, NodeHitlRequest nodeHitlRequest, JsonObject jsonObject) {
        int i;
        String string;
        String strPreviewValue;
        String strPreviewValue2;
        if (NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId) != NodeCommandId.DISPLAY_BRIGHTNESS_SET) {
            return null;
        }
        JsonElement jsonElementA1F = C60O.A1F("level_percent", jsonObject);
        Integer numA0r = (jsonElementA1F == null || (strPreviewValue2 = previewValue(jsonElementA1F)) == null) ? null : C9tI.A0r(strPreviewValue2);
        JsonElement jsonElementA1F2 = C60O.A1F("auto", jsonObject);
        Boolean boolA0E = (jsonElementA1F2 == null || (strPreviewValue = previewValue(jsonElementA1F2)) == null) ? null : C7BY.A0E(strPreviewValue);
        if (numA0r != null) {
            string = C60Q.A0b(context, numA0r, R.string._name_removed__res_0x7f1202ec);
        } else {
            if (AnonymousClass002.A1b(boolA0E, true)) {
                i = R.string._name_removed__res_0x7f1202ea;
            } else {
                if (!AnonymousClass002.A1b(boolA0E, false)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f1202eb;
            }
            string = context.getString(i);
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField(context.getString(R.string._name_removed__res_0x7f1202e9), string, null);
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField dndModeRow(Context context, NodeHitlRequest nodeHitlRequest, JsonObject jsonObject) {
        if (NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId) != NodeCommandId.DND_SET) {
            return null;
        }
        Map<String, Integer> map = DND_MODE_LABELS;
        JsonElement jsonElementA1F = C60O.A1F(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, jsonObject);
        Integer num = map.get(jsonElementA1F != null ? previewValue(jsonElementA1F) : null);
        if (num != null) {
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField(context.getString(R.string._name_removed__res_0x7f1202ef), context.getString(num.intValue()), null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List<com.facebook.aura.gateway.PreviewField>] */
    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument localRequestPreviewDocument(NodeHitlRequest nodeHitlRequest) {
        Object objA0s;
        ?? A0h;
        ?? A0h2;
        String str = nodeHitlRequest.payloadJson;
        if (str == null) {
            return null;
        }
        try {
            objA0s = C60Q.A13(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        JsonObject jsonObject = (JsonObject) objA0s;
        if (jsonObject == null) {
            return null;
        }
        Application applicationA00 = C4JM.A00();
        NodeCommandId nodeCommandIdFromId = NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId);
        if (nodeCommandIdFromId == NodeCommandId.TIMER_CANCEL) {
            A0h = TIMER_CANCEL_PREVIEW_FIELDS;
        } else {
            List<PreviewField> list = PREVIEW_FIELDS;
            A0h = C3cG.A0h();
            for (PreviewField previewField : list) {
                NodeCommandId nodeCommandId = previewField.onlyFor;
                if (nodeCommandId == null || nodeCommandId == nodeCommandIdFromId) {
                    A0h.add(previewField);
                }
            }
        }
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewFieldDndModeRow = dndModeRow(applicationA00, nodeHitlRequest, jsonObject);
        if (agentPermissionRequestPreviewFieldDndModeRow == null) {
            agentPermissionRequestPreviewFieldDndModeRow = brightnessRow(applicationA00, nodeHitlRequest, jsonObject);
        }
        if (agentPermissionRequestPreviewFieldDndModeRow != null) {
            A0h2 = Collections.singletonList(Collections.singletonList(agentPermissionRequestPreviewFieldDndModeRow));
        } else {
            List<JsonObject> listPreviewRecords = previewRecords(nodeHitlRequest, jsonObject);
            ArrayList arrayListA0m = AnonymousClass002.A0m(listPreviewRecords);
            for (JsonObject jsonObject2 : listPreviewRecords) {
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator it = A0h.iterator();
                while (it.hasNext()) {
                    HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewFieldPreviewRow = previewRow(applicationA00, jsonObject2, (PreviewField) it.next());
                    if (agentPermissionRequestPreviewFieldPreviewRow != null) {
                        arrayListA0h.add(agentPermissionRequestPreviewFieldPreviewRow);
                    }
                }
                arrayListA0m.add(arrayListA0h);
            }
            A0h2 = C3cG.A0h();
            for (Object obj : arrayListA0m) {
                if (!((List) obj).isEmpty()) {
                    A0h2.add(obj);
                }
            }
        }
        if (A0h2.isEmpty()) {
            return null;
        }
        if (nodeHitlRequest.kind == NodeHitlRequestKind.DATA_SOURCE_BACKFILL) {
            List<String> list2 = END_KEYS;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                A0h2 = AbstractC0878AGe.A0P(Collections.singletonList(AbstractC0878AGe.A0Q(openEndedRow(applicationA00), (Collection) AbstractC0878AGe.A0H(A0h2))), AbstractC0878AGe.A0d(A0h2, 1));
            } else {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (jsonObject.containsKey(it2.next())) {
                        break;
                    }
                }
                A0h2 = AbstractC0878AGe.A0P(Collections.singletonList(AbstractC0878AGe.A0Q(openEndedRow(applicationA00), (Collection) AbstractC0878AGe.A0H(A0h2))), AbstractC0878AGe.A0d(A0h2, 1));
            }
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(A0h2);
        Iterator it3 = A0h2.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields((List) it3.next()));
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument(false, arrayListA0m2);
    }

    public static final List<JsonObject> previewObjectArray(JsonElement jsonElement) {
        String strA04;
        Object objA0s;
        ArrayList arrayListA0h = null;
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next instanceof JsonObject) {
                    arrayListA0h.add(next);
                }
            }
        } else {
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive != null) {
                if (!jsonPrimitive.A01()) {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
                    try {
                        Object objA04 = HatchJsonKt.HatchJson.A04(strA04);
                        objA0s = objA04 instanceof JsonArray ? (JsonArray) objA04 : null;
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    if (objA0s instanceof C10571Hud) {
                        objA0s = null;
                    }
                    JsonArray jsonArray2 = (JsonArray) objA0s;
                    if (jsonArray2 != null) {
                        arrayListA0h = C3cG.A0h();
                        Iterator<JsonElement> it2 = jsonArray2.iterator();
                        while (it2.hasNext()) {
                            JsonElement next2 = it2.next();
                            if (next2 instanceof JsonObject) {
                                arrayListA0h.add(next2);
                            }
                        }
                    }
                }
            }
        }
        return arrayListA0h;
    }

    public static final List<JsonObject> previewRecords(NodeHitlRequest nodeHitlRequest, JsonObject jsonObject) {
        List<JsonObject> listPreviewObjectArray;
        String str = BATCH_COLLECTION_BY_COMMAND.get(NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId));
        if (nodeHitlRequest.kind != NodeHitlRequestKind.COMMAND) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            JsonElement jsonElementA1F = C60O.A1F(FGI.A0M(str2, "_json"), jsonObject);
            if ((jsonElementA1F == null && (jsonElementA1F = C60O.A1F(str2, jsonObject)) == null) || (listPreviewObjectArray = previewObjectArray(jsonElementA1F)) == null) {
                listPreviewObjectArray = C0881AGi.A00;
            }
            if (!listPreviewObjectArray.isEmpty()) {
                return listPreviewObjectArray;
            }
        }
        return Collections.singletonList(jsonObject);
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField previewRow(Context context, JsonObject jsonObject, PreviewField previewField) {
        String strPreviewValue;
        Iterator<String> it = previewField.keys.iterator();
        while (it.hasNext()) {
            JsonElement jsonElementA1F = C60O.A1F(it.next(), jsonObject);
            if (jsonElementA1F != null && (strPreviewValue = previewValue(jsonElementA1F)) != null) {
                String string = context.getString(previewField.labelResId);
                int iOrdinal = previewField.format.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        strPreviewValue = formatPreviewWindowDate(strPreviewValue);
                    } else {
                        if (iOrdinal != 2) {
                            throw C3cG.A0q();
                        }
                        strPreviewValue = formatPreviewInstant(strPreviewValue);
                    }
                }
                return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField(string, strPreviewValue, null);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String previewValue(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        String strA0l;
        String strA0l2;
        if (jsonElement instanceof JsonPrimitive) {
            String strA042 = C9oY.A04((JsonPrimitive) jsonElement);
            if (strA042 != null && (strA0l2 = AnonymousClass002.A0l(strA042)) != null && strA0l2.length() > 0) {
                return strA0l2;
            }
        } else if (jsonElement instanceof JsonArray) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = ((Iterable) jsonElement).iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && (strA0l = AnonymousClass002.A0l(strA04)) != null) {
                    C60Q.A1M(strA0l, arrayListA0h);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                return AbstractC06907md.A01(", ", arrayListA0h, null);
            }
        }
        return null;
    }

    public static final String serverActionDescription(String str, NodeHitlSpec nodeHitlSpec) {
        NodeCommandId nodeCommandIdFromId = NodeCommandId.Companion.fromId(str);
        if (nodeCommandIdFromId != null) {
            switch (nodeCommandIdFromId.ordinal()) {
                case 0:
                    return "Look up contacts";
                case 1:
                    return "Look up call history";
                case 2:
                    return "Create contact";
                case 3:
                    return "Update contact";
                case 4:
                    return "Delete contact";
                case 9:
                    return "Look up notifications";
                case 10:
                    return "Reply to notification";
                case 12:
                    return "Update Do Not Disturb";
                case 18:
                    return "Look up calendar events";
                case 19:
                    return "Create event";
                case 20:
                    return "Update event";
                case 21:
                    return "Delete event";
                case 22:
                    return "Create reminder";
                case 23:
                    return "Look up reminders";
                case 24:
                    return "Delete reminder";
                case 25:
                    return "Look up text messages";
                case 26:
                    return "Look up photos";
                case 27:
                    return "Copy photos to your library";
                case 31:
                    return "Send message";
                case 32:
                    return "Place a phone call";
                case 40:
                    return "Delete timer";
                case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                    return "Update screen brightness";
                case 68:
                    return "Open a link in an app";
                case 69:
                    return "Open directions in a map app";
            }
        }
        return nodeHitlSpec.access == NodeHitlAccess.WRITE ? "Update device data" : "Look up device data";
    }

    public static final NodeHitlMode withBaseline(NodeHitlMode nodeHitlMode, PermissionDefaultMode permissionDefaultMode) {
        return (permissionDefaultMode == PermissionDefaultMode.ALWAYS_ASK && nodeHitlMode == NodeHitlMode.ALLOW) ? NodeHitlMode.ASK : nodeHitlMode;
    }

    public static final String formatPreviewInstant(String str) {
        Object objA0s;
        Object objA0s2;
        Object objA0s3;
        long epochSecond;
        int i;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        try {
            objA0s = Instant.parse(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Instant instant = (Instant) objA0s;
        if (instant == null) {
            try {
                objA0s2 = LocalDateTime.parse(str).atZone(zoneIdSystemDefault).toInstant();
            } catch (Throwable th2) {
                objA0s2 = C3cG.A0s(th2);
            }
            if (objA0s2 instanceof C10571Hud) {
                objA0s2 = null;
            }
            instant = (Instant) objA0s2;
        }
        if (instant != null) {
            epochSecond = instant.toEpochMilli();
            i = 21;
        } else {
            try {
                objA0s3 = LocalDate.parse(str);
            } catch (Throwable th3) {
                objA0s3 = C3cG.A0s(th3);
            }
            LocalDate localDate = (LocalDate) (objA0s3 instanceof C10571Hud ? null : objA0s3);
            if (localDate == null) {
                return str;
            }
            epochSecond = localDate.atStartOfDay(zoneIdSystemDefault).toEpochSecond() * 1000;
            i = 20;
        }
        return formatPreviewMillis(epochSecond, i);
    }

    public static final String formatPreviewMillis(long j, int i) {
        String dateTime = DateUtils.formatDateTime(C4JM.A00(), j, i);
        C7384Etj.A0U(dateTime);
        return dateTime;
    }

    public static final String formatPreviewWindowDate(String str) {
        Object objA0s;
        Object objA0s2;
        Object objA0s3;
        try {
            objA0s = Instant.parse(str).atZone(ZoneOffset.UTC).toLocalDate();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        LocalDate localDate = (LocalDate) objA0s;
        if (localDate == null) {
            try {
                objA0s2 = LocalDate.parse(str);
            } catch (Throwable th2) {
                objA0s2 = C3cG.A0s(th2);
            }
            if (objA0s2 instanceof C10571Hud) {
                objA0s2 = null;
            }
            localDate = (LocalDate) objA0s2;
            if (localDate == null) {
                try {
                    objA0s3 = LocalDateTime.parse(str).toLocalDate();
                } catch (Throwable th3) {
                    objA0s3 = C3cG.A0s(th3);
                }
                localDate = (LocalDate) (objA0s3 instanceof C10571Hud ? null : objA0s3);
                if (localDate == null) {
                    return str;
                }
            }
        }
        return formatPreviewMillis(localDate.atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000, 20);
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField openEndedRow(Context context) {
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField(context.getString(R.string._name_removed__res_0x7f1202f3), context.getString(R.string._name_removed__res_0x7f1202f4), null);
    }
}
