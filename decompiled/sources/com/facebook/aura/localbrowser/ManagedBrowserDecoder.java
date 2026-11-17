package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC7609F5w;
import X.AbstractC7611F5y;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BFI;
import X.BQG;
import X.BV4;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.C8j2;
import X.C9jH;
import X.C9oY;
import X.C9sU;
import X.G0U;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.BrowserTaskExecutionJsonKt;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes6.dex */
public final class ManagedBrowserDecoder {
    public static final int $stable = 0;
    public static final int MAX_REQUEST_BYTES = 6291456;
    public static final int MAX_REQUEST_DEPTH = 24;
    public static final ManagedBrowserDecoder INSTANCE = new ManagedBrowserDecoder();
    public static final Set<String> CONTROLS = BFI.A0H(new String[]{"present", "hide", "inspect", "retain", "fence_agent", "commit_user_control", "heartbeat", "release_user_control", "close_viewer", "stop", "exit_checkout"});
    public static final Set<String> CAPABILITIES = BFI.A0H(new String[]{"task_binding", "control_transfer", "observation", "navigation", "input", "sensitive_output", "navigation_policy", "checkout_signals", "visual_capture", "visual_input", "tabs", "file_upload", HatchDataExportLoggingKt.PHASE_DOWNLOAD, "original_pdf", "native_autofill", "onepassword_authorization_v1", "credential_fields_v1", "onepassword_external_fill_v1", "wallet_fields_v1", "shop_pay_v1"});

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass1(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass2(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass3(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass4(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass5(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass6(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$7, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass7 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass7(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$binding$8, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass8 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public AnonymousClass8(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "positive", "positive(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).positive(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$decode$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124851 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124851(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "fence", "fence(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).fence(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$decode$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124862 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124862(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "operation", "operation(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).operation(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$document$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124871 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124871(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$document$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124882 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124882(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$document$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124893 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124893(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$fence$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124901 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124901(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "binding", "binding(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).binding(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$fence$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124912 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124912(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "document", "document(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).document(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$fence$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124923 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124923(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "identity", "identity(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JsonElement jsonElement) {
            return AbstractC7611F5y.A0Q(this, jsonElement);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$fence$4, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124934 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124934(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "nonnegative", "nonnegative(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).nonnegative(jsonElement));
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.ManagedBrowserDecoder$fence$5, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C124945 extends C7438Evz implements G0U<JsonElement, Boolean> {
        public C124945(Object obj) {
            super(1, obj, ManagedBrowserDecoder.class, "positive", "positive(Lkotlinx/serialization/json/JsonElement;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(JsonElement jsonElement) {
            return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).positive(jsonElement));
        }
    }

    public static final boolean action$lambda$0(String str, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        return C7384Etj.areEqual(INSTANCE.text(jsonElement), str);
    }

    public static final boolean boundedText$lambda$0(int i, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        String strText = INSTANCE.text(jsonElement);
        return strText != null && strText.length() <= i;
    }

    public static final boolean capabilities$lambda$0(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return jsonElement.equals(C9oY.A06(BV4.A0W()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean capabilities$lambda$1(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        if (!(jsonElement instanceof JsonArray)) {
            return false;
        }
        JsonArray jsonArray = (JsonArray) jsonElement;
        if (jsonArray.size() > 20) {
            return false;
        }
        Iterable iterable = (Iterable) jsonElement;
        if (AbstractC0878AGe.A0T(iterable).size() != jsonArray.size()) {
            return false;
        }
        if (!(iterable instanceof Collection) || !C3cG.A1N(iterable)) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!AbstractC0878AGe.A0k(CAPABILITIES, INSTANCE.text((JsonElement) it.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean fence$lambda$0(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return jsonElement.equals(C9oY.A06(BV4.A0W()));
    }

    public static final boolean nullable$lambda$0(G0U g0u, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        return jsonElement.equals(JsonNull.A00) || AnonymousClass003.A1X(jsonElement, g0u);
    }

    public static final boolean operation$lambda$0(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return AbstractC0878AGe.A0k(CONTROLS, INSTANCE.text(jsonElement));
    }

    public static final boolean operation$lambda$1(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return AbstractC0878AGe.A0k(CONTROLS, INSTANCE.text(jsonElement));
    }

    public static final boolean operation$lambda$2(String str, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        return C7384Etj.areEqual(INSTANCE.text(jsonElement), str);
    }

    public static final boolean policy$lambda$0(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return jsonElement.equals(C9oY.A06(BV4.A0X()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean policy$lambda$1(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        if ((jsonElement instanceof JsonArray) && ((JsonArray) jsonElement).size() <= 20480) {
            Iterable iterable = (Iterable) jsonElement;
            if (!(iterable instanceof Collection) || !C3cG.A1N(iterable)) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    String strText = INSTANCE.text((JsonElement) it.next());
                    if (strText == null || !ManagedBrowserSitePolicy.Companion.canonicalHost(strText)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean policy$lambda$2(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        if (!(jsonElement instanceof JsonPrimitive)) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        return jsonPrimitive.A01() && jsonPrimitive.A00().length() == 64;
    }

    public final ManagedBrowserRequestJson decode(String str) {
        if (str != null && C3cG.A1S(str).length <= 6291456 && !exceedsDepth(str)) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                JsonElement jsonElementA04 = c9sU.A04(str);
                if (fields(jsonElementA04, AGH.A0D(C3cG.A0r("fence", new C124851(this)), C3cG.A0r("operation", new C124862(this))), C9jH.A00)) {
                    ManagedBrowserRequestJson managedBrowserRequestJson = (ManagedBrowserRequestJson) c9sU.A01(ManagedBrowserRequestJson$$serializer.INSTANCE, jsonElementA04);
                    ManagedBrowserSensitiveSitePolicyJson managedBrowserSensitiveSitePolicyJson = managedBrowserRequestJson.operation.sensitive_site_policy;
                    if (managedBrowserSensitiveSitePolicyJson != null) {
                        if (ManagedBrowserSitePolicy.Companion.fromJson(managedBrowserSensitiveSitePolicyJson) == null) {
                            return null;
                        }
                    }
                    return managedBrowserRequestJson;
                }
                return null;
            } catch (SerializationException | IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r3.equals("list_targets") != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean action(kotlinx.serialization.json.JsonElement r10) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.ManagedBrowserDecoder.action(kotlinx.serialization.json.JsonElement):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean binding(JsonElement jsonElement) {
        return fields(jsonElement, AGH.A0D(C3cG.A0r(C3cF.A00(26), new AnonymousClass1(this)), C3cG.A0r("device_id", new AnonymousClass2(this)), C3cG.A0r("account_id", new AnonymousClass3(this)), C3cG.A0r("vm_id", new AnonymousClass4(this)), C3cG.A0r("executor_instance_id", new AnonymousClass5(this)), C3cG.A0r("task_binding_id", new AnonymousClass6(this)), C3cG.A0r("transport_generation", new AnonymousClass7(this)), C3cG.A0r(C8j2.A00(5), new AnonymousClass8(this))), C9jH.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: boolean, reason: not valid java name */
    public final boolean m1234boolean(JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (!jsonPrimitive.A01() && C9oY.A01(jsonPrimitive) != null) {
                return true;
            }
        }
        return false;
    }

    private final G0U<JsonElement, Boolean> boundedText(int i) {
        return new ManagedBrowserDecoder$$ExternalSyntheticLambda0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean capabilities(JsonElement jsonElement) {
        return fields(jsonElement, AnonymousClass007.A0d("capabilities", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda10
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.capabilities$lambda$1((JsonElement) obj));
            }
        }, C3cG.A0r("protocol_version", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda9
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.capabilities$lambda$0((JsonElement) obj));
            }
        })), C9jH.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean document(JsonElement jsonElement) {
        return fields(jsonElement, C3cH.A0m("reference_scope", new C124893(this), C3cG.A0r("target_id", new C124871(this)), C3cG.A0r("document_id", new C124882(this))), C9jH.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fence(JsonElement jsonElement) {
        return fields(jsonElement, AGH.A0D(C3cG.A0r("binding", new C124901(this)), C3cG.A0r("document", new ManagedBrowserDecoder$$ExternalSyntheticLambda11(new C124912(this))), C3cG.A0r("operation_id", new C124923(this)), C3cG.A0r(C60N.A00(99), new C124934(this)), C3cG.A0r("deadline_at_ms", new C124945(this)), C3cG.A0r(C8j2.A00(18), new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda8
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.fence$lambda$0((JsonElement) obj));
            }
        })), C9jH.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean fields(JsonElement jsonElement, Map<String, ? extends G0U<? super JsonElement, Boolean>> map, Map<String, ? extends G0U<? super JsonElement, Boolean>> map2) {
        if ((jsonElement instanceof JsonObject) && ((JsonObject) jsonElement).keySet().containsAll(map.keySet())) {
            Map map3 = (Map) jsonElement;
            if (map3.isEmpty()) {
                return true;
            }
            Iterator itA0n = AnonymousClass002.A0n(map3);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Object key = entryA0l.getKey();
                Object value = entryA0l.getValue();
                G0U<? super JsonElement, Boolean> g0u = map.get(key);
                if ((g0u != null || (g0u = map2.get(key)) != null) && AnonymousClass003.A1X(value, g0u)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean fields$default(ManagedBrowserDecoder managedBrowserDecoder, JsonElement jsonElement, Map map, Map map2, int i, Object obj) {
        if ((i & 4) != 0) {
            map2 = C9jH.A00;
        }
        return managedBrowserDecoder.fields(jsonElement, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nonnegative(JsonElement jsonElement) {
        Long lA03;
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (!jsonPrimitive.A01() && (lA03 = C9oY.A03(jsonPrimitive)) != null && lA03.longValue() >= 0) {
                return true;
            }
        }
        return false;
    }

    private final G0U<JsonElement, Boolean> nullable(G0U<? super JsonElement, Boolean> g0u) {
        return new ManagedBrowserDecoder$$ExternalSyntheticLambda11(g0u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final boolean operation(JsonElement jsonElement) {
        JsonElement jsonElementA1F;
        final String strText;
        Map mapA0J;
        String str;
        Object managedBrowserDecoder$operation$required$9;
        HxE[] hxEArrA01;
        Object managedBrowserDecoder$operation$required$2;
        HxE hxEA0r;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null && (jsonElementA1F = C60O.A1F("kind", jsonObject)) != null && (strText = text(jsonElementA1F)) != null) {
            String str2 = "sensitive_site_policy";
            switch (strText.hashCode()) {
                case -1651322596:
                    if (strText.equals("observe")) {
                        mapA0J = C9jH.A00;
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case -1422950858:
                    str = "action";
                    if (strText.equals("action")) {
                        managedBrowserDecoder$operation$required$9 = new ManagedBrowserDecoder$operation$required$9(this);
                        hxEA0r = C3cG.A0r(str, managedBrowserDecoder$operation$required$9);
                        mapA0J = AIW.A0J(hxEA0r);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case -851817928:
                    if (strText.equals("reattach")) {
                        hxEArrA01 = HxE.A01("sensitive_site_policy", new ManagedBrowserDecoder$operation$required$5(this), C3cG.A0r("previous_binding", new ManagedBrowserDecoder$operation$required$3(this)), C3cG.A0r("unresolved_operation", new ManagedBrowserDecoder$$ExternalSyntheticLambda11(new ManagedBrowserDecoder$operation$required$4(this))));
                        mapA0J = AGH.A0D(hxEArrA01);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case 3023933:
                    if (strText.equals("bind")) {
                        hxEArrA01 = new HxE[2];
                        hxEArrA01[0] = C3cG.A0r("capabilities", new ManagedBrowserDecoder$operation$required$1(this));
                        managedBrowserDecoder$operation$required$2 = new ManagedBrowserDecoder$operation$required$2(this);
                        hxEArrA01[1] = C3cG.A0r(str2, managedBrowserDecoder$operation$required$2);
                        mapA0J = AGH.A0D(hxEArrA01);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case 951543133:
                    if (strText.equals(LocalBrowserNodeHandler.CONTROL)) {
                        hxEA0r = C3cG.A0r(LocalBrowserNodeHandler.CONTROL, new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda5
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$0((JsonElement) obj));
                            }
                        });
                        mapA0J = AIW.A0J(hxEA0r);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case 989834062:
                    if (strText.equals("reconcile")) {
                        managedBrowserDecoder$operation$required$9 = new ManagedBrowserDecoder$operation$required$10(this);
                        str = "operation_id";
                        hxEA0r = C3cG.A0r(str, managedBrowserDecoder$operation$required$9);
                        mapA0J = AIW.A0J(hxEA0r);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
                case 1367233651:
                    if (strText.equals("transition_control")) {
                        hxEArrA01 = new HxE[2];
                        hxEArrA01[0] = C3cG.A0r(LocalBrowserNodeHandler.CONTROL, new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda6
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$1((JsonElement) obj));
                            }
                        });
                        managedBrowserDecoder$operation$required$2 = new ManagedBrowserDecoder$operation$required$8(this);
                        str2 = "next_state_revision";
                        hxEArrA01[1] = C3cG.A0r(str2, managedBrowserDecoder$operation$required$2);
                        mapA0J = AGH.A0D(hxEArrA01);
                        return fields(jsonElement, AnonymousClass006.A11("kind", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ManagedBrowserDecoder.operation$lambda$2(strText, (JsonElement) obj));
                            }
                        }, mapA0J), C9jH.A00);
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean policy(JsonElement jsonElement) {
        return fields(jsonElement, C3cH.A0m("policy_digest", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda4
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.policy$lambda$2((JsonElement) obj));
            }
        }, C3cG.A0r(C3cF.A00(8), new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.policy$lambda$0((JsonElement) obj));
            }
        }), C3cG.A0r("hosts", new G0U() { // from class: com.facebook.aura.localbrowser.ManagedBrowserDecoder$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ManagedBrowserDecoder.policy$lambda$1((JsonElement) obj));
            }
        })), C9jH.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean positive(JsonElement jsonElement) {
        Long lA03;
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (!jsonPrimitive.A01() && (lA03 = C9oY.A03(jsonPrimitive)) != null && lA03.longValue() > 0) {
                return true;
            }
        }
        return false;
    }

    private final String text(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean exceedsDepth(java.lang.String r10) {
        /*
            r9 = this;
            int r9 = r10.length()
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
        L9:
            if (r7 >= r9) goto L43
            char r3 = r10.charAt(r7)
            r2 = 34
            r1 = 1
            if (r6 == 0) goto L24
            if (r5 == 0) goto L1a
            r5 = 0
        L17:
            int r7 = r7 + 1
            goto L9
        L1a:
            r0 = 92
            if (r3 != r0) goto L20
            r5 = 1
            goto L17
        L20:
            if (r3 != r2) goto L17
            r6 = 0
            goto L17
        L24:
            if (r3 == r2) goto L41
            r0 = 91
            if (r3 == r0) goto L3a
            r0 = 93
            if (r3 == r0) goto L37
            r0 = 123(0x7b, float:1.72E-43)
            if (r3 == r0) goto L3a
            r0 = 125(0x7d, float:1.75E-43)
            if (r3 == r0) goto L37
            goto L17
        L37:
            int r4 = r4 + (-1)
            goto L17
        L3a:
            int r4 = r4 + 1
            r0 = 24
            if (r4 <= r0) goto L17
            return r1
        L41:
            r6 = 1
            goto L17
        L43:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.ManagedBrowserDecoder.exceedsDepth(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean identity(JsonElement jsonElement) {
        String strText = text(jsonElement);
        return strText != null && BrowserTaskExecutionJsonKt.isValidBrowserExecutionIdentity(strText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean reference(JsonElement jsonElement) {
        int length;
        String strText = text(jsonElement);
        if (strText == null || 3 > (length = strText.length()) || length >= 33 || !strText.startsWith("@e")) {
            return false;
        }
        String strA16 = BQG.A16(strText, 2);
        for (int i = 0; i < strA16.length(); i++) {
            char cCharAt = strA16.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return false;
            }
        }
        return true;
    }
}
