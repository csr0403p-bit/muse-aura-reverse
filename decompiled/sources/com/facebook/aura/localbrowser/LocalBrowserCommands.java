package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC7608F5v;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9iZ;
import X.C9jH;
import X.C9oY;
import X.C9sU;
import X.C9tJ;
import X.Hr7;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.localbrowser.core.BrowserArg;
import com.facebook.aura.localbrowser.core.BrowserArgType;
import com.facebook.aura.localbrowser.core.BrowserArgs;
import com.facebook.aura.localbrowser.core.BrowserOperation;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalog;
import com.facebook.aura.localbrowser.core.BrowserOperationSpec;
import com.facebook.aura.nodes.json.ArgSpecJson;
import com.facebook.aura.nodes.json.DeviceCommandCapabilityJson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes6.dex */
public final class LocalBrowserCommands {
    public static final int $stable = 0;
    public static final String CLOSE = "browser.close";
    public static final LocalBrowserCommands INSTANCE;
    public static final String OPEN = "browser.open";
    public static final String SESSION_ID = "session_id";
    public static final String STATUS = "browser.status";
    public static final long TIMEOUT_MS = 30000;
    public static final String URL = "url";
    public static final Map<String, ArgSpecJson> sessionId;
    public static final Map<String, DeviceCommandCapabilityJson> specs;

    private final DeviceCommandCapabilityJson spec(String str, Map<String, ArgSpecJson> map, Map<String, ArgSpecJson> map2) {
        return new DeviceCommandCapabilityJson(str, map, map2, C0881AGi.A00, 30000L, null);
    }

    private final ArgSpecJson string(String str) {
        return new ArgSpecJson(1, str);
    }

    public final JsonObject decode(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        DeviceCommandCapabilityJson deviceCommandCapabilityJson = specs.get(str);
        if (deviceCommandCapabilityJson != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                if (str2 == null) {
                    str2 = "{}";
                }
                JsonElement jsonElementA04 = c9sU.A04(str2);
                if (jsonElementA04 instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) jsonElementA04;
                    if (jsonObject != null) {
                        LinkedHashMap linkedHashMapA02 = AGH.A02(deviceCommandCapabilityJson.required, deviceCommandCapabilityJson.optional);
                        if (jsonObject.keySet().containsAll(deviceCommandCapabilityJson.required.keySet())) {
                            if (!jsonObject.isEmpty()) {
                                Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entryA0l = C3cH.A0l(it);
                                    Object key = entryA0l.getKey();
                                    JsonElement jsonElement = (JsonElement) entryA0l.getValue();
                                    ArgSpecJson argSpecJson = (ArgSpecJson) linkedHashMapA02.get(key);
                                    if (argSpecJson == null || !INSTANCE.matches(argSpecJson.type, jsonElement)) {
                                    }
                                }
                            }
                            return jsonObject;
                        }
                    }
                }
            } catch (SerializationException | IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserArgType.values().length];
            try {
                AnonymousClass002.A13(BrowserArgType.STRING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserArgType.INTEGER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserArgType.BOOLEAN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BrowserArgType.NUMBER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BrowserArgType.OBJECT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BrowserArgType.ARRAY, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LocalBrowserCommands localBrowserCommands = new LocalBrowserCommands();
        INSTANCE = localBrowserCommands;
        Map<String, ArgSpecJson> mapA10 = AnonymousClass006.A10("session_id", new ArgSpecJson(1, "session_id returned by browser.open. Omit to use the open session."));
        sessionId = mapA10;
        Map<String, ArgSpecJson> mapA102 = AnonymousClass006.A10("url", new ArgSpecJson(1, "Absolute HTTPS URL."));
        C9jH c9jH = C9jH.A00;
        Map mapA0m = C3cH.A0m(CLOSE, localBrowserCommands.spec("Close this exact phone browser session. Returns closed plus an SDK receipt with the native close outcome and settlement. Never retry an uncertain close against a new session.", AnonymousClass006.A10("session_id", new ArgSpecJson(1, "session_id returned by browser.open.")), c9jH), C3cG.A0r(OPEN, localBrowserCommands.spec("Open a website in this phone's own browser. Use only when the user asks to use their phone or its browser. One session at a time. Returns session_id and a report of the loaded page. First use downloads the browser engine automatically.", mapA102, c9jH)), C3cG.A0r(STATUS, localBrowserCommands.spec("Read the phone browser session: session_id, whether the agent or the user is in control, whether it is available, and the current site. Never returns page contents.", c9jH, mapA10)));
        List<BrowserOperationSpec> list = BrowserOperationCatalog.specs;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (BrowserOperationSpec browserOperationSpec : list) {
            HxE hxEA0r = C3cG.A0r(browserOperationSpec.name, INSTANCE.toCapability(browserOperationSpec));
            linkedHashMapA15.put(hxEA0r.first, hxEA0r.second);
        }
        specs = AGH.A02(mapA0m, linkedHashMapA15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean matches(int r7, kotlinx.serialization.json.JsonElement r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L58
            r1 = r8
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
        L7:
            r5 = 1
            r6 = 0
            switch(r7) {
                case 1: goto Ld;
                case 2: goto L16;
                case 3: goto L23;
                case 4: goto L49;
                case 5: goto L5a;
                case 6: goto L5d;
                default: goto Lc;
            }
        Lc:
            return r6
        Ld:
            if (r1 == 0) goto Lc
            boolean r0 = r1.A01()
            if (r0 != r5) goto Lc
            return r5
        L16:
            if (r1 == 0) goto Lc
            boolean r0 = r1.A01()
            if (r0 != 0) goto Lc
            java.lang.Long r0 = X.C9oY.A03(r1)
            goto L55
        L23:
            if (r1 == 0) goto Lc
            boolean r0 = r1.A01()
            if (r0 != 0) goto Lc
            X.9iZ r0 = X.C9oY.A00
            java.lang.String r0 = r1.A00()
            java.lang.Double r0 = X.C9tJ.A0v(r0)
            if (r0 == 0) goto Lc
            double r0 = r0.doubleValue()
            double r3 = java.lang.Math.abs(r0)
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            return r5
        L49:
            if (r1 == 0) goto Lc
            boolean r0 = r1.A01()
            if (r0 != 0) goto Lc
            java.lang.Boolean r0 = X.C9oY.A01(r1)
        L55:
            if (r0 == 0) goto Lc
            return r5
        L58:
            r1 = 0
            goto L7
        L5a:
            boolean r5 = r8 instanceof kotlinx.serialization.json.JsonObject
            return r5
        L5d:
            boolean r5 = r8 instanceof kotlinx.serialization.json.JsonArray
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserCommands.matches(int, kotlinx.serialization.json.JsonElement):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceCommandCapabilityJson spec$default(LocalBrowserCommands localBrowserCommands, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C9jH.A00;
        }
        if ((i & 4) != 0) {
            map2 = C9jH.A00;
        }
        return localBrowserCommands.spec(str, map, map2);
    }

    private final ArgSpecJson toArgSpec(BrowserArg browserArg) {
        int i;
        switch (browserArg.type.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            default:
                throw C3cG.A0q();
        }
        return new ArgSpecJson(i, browserArg.description);
    }

    private final DeviceCommandCapabilityJson toCapability(BrowserOperationSpec browserOperationSpec) {
        String str = browserOperationSpec.description;
        Map mapSingletonMap = Collections.singletonMap("session_id", new ArgSpecJson(1, "session_id returned by browser.open."));
        List<BrowserArg> list = browserOperationSpec.args;
        ArrayList<BrowserArg> arrayListA0h = C3cG.A0h();
        for (BrowserArg browserArg : list) {
            if (browserArg.required) {
                arrayListA0h.add(browserArg);
            }
        }
        int iA03 = C3cG.A03(arrayListA0h, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(iA03);
        for (BrowserArg browserArg2 : arrayListA0h) {
            linkedHashMapA15.put(browserArg2.name, INSTANCE.toArgSpec(browserArg2));
        }
        Map<String, ArgSpecJson> mapA13 = AbstractC7608F5v.A13(mapSingletonMap, linkedHashMapA15);
        List<BrowserArg> list2 = browserOperationSpec.args;
        ArrayList<BrowserArg> arrayListA0h2 = C3cG.A0h();
        for (BrowserArg browserArg3 : list2) {
            if (!browserArg3.required) {
                arrayListA0h2.add(browserArg3);
            }
        }
        LinkedHashMap linkedHashMapA152 = C60O.A15(Hr7.A1C(arrayListA0h2));
        for (BrowserArg browserArg4 : arrayListA0h2) {
            linkedHashMapA152.put(browserArg4.name, INSTANCE.toArgSpec(browserArg4));
        }
        return spec(str, mapA13, linkedHashMapA152);
    }

    public final Map<String, DeviceCommandCapabilityJson> getSpecs() {
        return specs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.serialization.json.JsonElement] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Double, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Long] */
    public final BrowserOperation operation(String str, JsonObject jsonObject) {
        BrowserArg next;
        AnonymousClass003.A0u(str, jsonObject);
        BrowserOperationSpec browserOperationSpec = BrowserOperationCatalog.byName.get(str);
        if (browserOperationSpec == null) {
            return null;
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!"session_id".equals(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(linkedHashMapA0j.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i);
            Object key = entryA0l2.getKey();
            Object key2 = entryA0l2.getKey();
            ?? A0v = (JsonElement) entryA0l2.getValue();
            Iterator<BrowserArg> it2 = browserOperationSpec.args.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C7384Etj.areEqual(next.name, key2)) {
                    }
                } else {
                    next = null;
                }
            }
            BrowserArg browserArg = next;
            if (browserArg == null) {
                return null;
            }
            JsonPrimitive jsonPrimitive = A0v instanceof JsonPrimitive ? (JsonPrimitive) A0v : null;
            switch (browserArg.type.ordinal()) {
                case 0:
                    if (jsonPrimitive != null && jsonPrimitive.A01() && (A0v = jsonPrimitive.A00()) != 0) {
                        break;
                    } else {
                        return null;
                    }
                    break;
                case 1:
                    if (jsonPrimitive != null && !jsonPrimitive.A01() && (A0v = C9oY.A03(jsonPrimitive)) != 0) {
                        break;
                    } else {
                        return null;
                    }
                case 2:
                    if (jsonPrimitive != null && !jsonPrimitive.A01()) {
                        C9iZ c9iZ = C9oY.A00;
                        A0v = C9tJ.A0v(jsonPrimitive.A00());
                        if (A0v != 0 && Math.abs(A0v.doubleValue()) <= Double.MAX_VALUE) {
                            break;
                        }
                    }
                    return null;
                case 3:
                    if (jsonPrimitive != null && !jsonPrimitive.A01() && (A0v = C9oY.A01(jsonPrimitive)) != 0) {
                        break;
                    } else {
                        return null;
                    }
                case 4:
                    if ((A0v instanceof JsonObject) && A0v != 0) {
                        break;
                    } else {
                        return null;
                    }
                case 5:
                    if ((A0v instanceof JsonArray) && A0v != 0) {
                        break;
                    } else {
                        return null;
                    }
                default:
                    throw C3cG.A0q();
            }
            linkedHashMapA15.put(key, A0v);
        }
        return browserOperationSpec.operation(new BrowserArgs(linkedHashMapA15));
    }
}
