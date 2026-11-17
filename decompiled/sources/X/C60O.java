package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.aura.qpl.startup.signal.PointSignalResult;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.storagerecovery.StorageRecoveryUiState;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.60O, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60O {
    public static long A01(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getColors(bfm, 6).background;
    }

    public static AtomicBoolean A1E() {
        return new AtomicBoolean(false);
    }

    public static boolean A1X(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(str2);
    }

    public static HxE[] A1a(HxE[] hxEArr) {
        return (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
    }

    public static HatchMetadataKey A03(String str, String str2, int i) {
        return new HatchMetadataKey(str, i, str2);
    }

    public static HatchConversationState A04(HatchConversationRepository hatchConversationRepository) {
        return hatchConversationRepository._conversationState.getValue();
    }

    public static HatchGatewayConnection A05(AbstractC3358CGz abstractC3358CGz) {
        return HatchGatewayServiceManager.INSTANCE.getGateway(abstractC3358CGz);
    }

    public static HatchHttpClient A07() {
        return HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_UNAUTH);
    }

    public static HatchHttpClient A08() {
        return HatchTransport.INSTANCE.httpClient(HatchAuthScheme.VM_JWT);
    }

    public static NodeArgSpec A09(NodeArgType nodeArgType, String str) {
        return new NodeArgSpec(nodeArgType, str);
    }

    public static NodeCommandId A0A(String str, String str2, int i) {
        return new NodeCommandId(str, i, str2);
    }

    public static AppJobId A0B(String str, int i) {
        return new AppJobId(str, i);
    }

    public static StorageRecoveryUiState A0C(StorageRecoveryViewModel storageRecoveryViewModel) {
        return storageRecoveryViewModel._uiState.getValue();
    }

    public static AbstractC3358CGz A0D(Object obj, Object obj2) {
        AbstractC3358CGz abstractC3358CGz = (AbstractC3358CGz) obj;
        Hwg.A00(obj2);
        return abstractC3358CGz;
    }

    public static C7cU A0E() {
        return (C7cU) AuraPrefsStorage.sharedPrefsFactory$delegate.getValue();
    }

    public static QuickPerformanceLogger A0g() {
        return AuraQuickPerformanceLogger.INSTANCE.getInstance();
    }

    public static IllegalArgumentException A0i(String str) {
        return new IllegalArgumentException(str);
    }

    public static String A0l() {
        return AuraDeviceId.INSTANCE.getNodeId();
    }

    public static String A0r(String str, String str2) {
        return FGI.A0U(str, str2, ")");
    }

    public static String A0s(String str, String str2) {
        return new PointSignalResult(str, str2).toJson();
    }

    public static String A0u(JsonObject jsonObject, String str) {
        return JsonObjectExtensionsKt.optString(jsonObject, str, "");
    }

    public static StringBuilder A0w() {
        return new StringBuilder();
    }

    public static StringBuilder A0x(String str) {
        return new StringBuilder(str);
    }

    public static StringBuilder A0y(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0z(String str, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        return sb;
    }

    public static StringBuilder A10(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        return sb;
    }

    public static ArrayList A11(int i) {
        return new ArrayList(i);
    }

    public static HashSet A13() {
        return new HashSet();
    }

    public static Iterator A14(HatchConversationState hatchConversationState) {
        return hatchConversationState.messages.iterator();
    }

    public static LinkedHashMap A15(int i) {
        return new LinkedHashMap(i);
    }

    public static Set A18() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static ConcurrentHashMap A1C() {
        return new ConcurrentHashMap();
    }

    public static ExecutorService A1D() {
        return AuraExecutors.INSTANCE.getIoExecutor();
    }

    public static JsonObject A1H(String str) {
        return JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(str));
    }

    public static JsonObject A1J(JsonObject jsonObject) {
        return JsonObjectExtensionsKt.optJsonObject(jsonObject, "payload");
    }

    public static C2nw A1K() {
        return new C2nw();
    }

    public static void A1W(C9iK c9iK, boolean z) {
        c9iK.A08("subtitle", z);
    }

    public static boolean A1Y(C9iK c9iK) {
        c9iK.A08("id", false);
        return false;
    }

    public static HxE[] A1Z(Object obj, Object obj2, HxE hxE) {
        return new HxE[]{hxE, new HxE(obj, obj2)};
    }

    public static InterfaceC7359EnW[] A1b(Class cls, String str, String str2, int i) {
        return new InterfaceC7359EnW[]{new C7462Ewq(cls, str, str2, i)};
    }

    public static int A00(List list) {
        return list.size() - 1;
    }

    public static Handler A02() {
        return new Handler(Looper.getMainLooper());
    }

    public static HatchHttpApi A06(Object obj) {
        Hwg.A00(obj);
        return HatchHttpApi.INSTANCE;
    }

    public static BzK A0F(AuraDevicePrefStore auraDevicePrefStore, AuraDevicePrefs auraDevicePrefs) {
        return auraDevicePrefs.get(auraDevicePrefStore).A9q();
    }

    public static Boolean A0h(Object obj, Object obj2) {
        return Boolean.valueOf(C7384Etj.areEqual(obj, obj2));
    }

    public static Iterable A0j(BLG blg) {
        return (Iterable) blg.getValue();
    }

    public static Long A0k() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static String A0m(HatchGatewayPrefsStore.Companion companion, AbstractC3358CGz abstractC3358CGz) {
        return companion.getInstance(abstractC3358CGz).getGatewayUrl();
    }

    public static String A0n(Object obj) {
        return C0861A6i.A01(obj.getClass());
    }

    public static String A0o(Object obj) {
        String string = obj.toString();
        C7384Etj.A0U(string);
        return string;
    }

    public static String A0p(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0q(String str) {
        if (str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static String A0t(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static String A0v(C2nw c2nw) {
        return c2nw.A00().toString();
    }

    public static ArrayList A12(Object obj) {
        Hwg.A00(obj);
        return new ArrayList();
    }

    public static List A16(String str, String str2) {
        return Arrays.asList(str, str2);
    }

    public static List A17(BLG blg) {
        return (List) blg.getValue();
    }

    public static Set A19(String str, String str2) {
        return BFI.A0H(new String[]{str, str2});
    }

    public static Set A1A(String str, String str2, String str3) {
        return BFI.A0H(new String[]{str, str2, str3});
    }

    public static Set A1B(String str, String str2, String str3, String str4) {
        return BFI.A0H(new String[]{str, str2, str3, str4});
    }

    public static JsonElement A1F(Object obj, JsonObject jsonObject) {
        return (JsonElement) jsonObject.get(obj);
    }

    public static JsonObject A1G() {
        return new JsonObject(AGH.A0E());
    }

    public static JsonObject A1I(String str, JsonElement jsonElement, C2nw c2nw) {
        c2nw.A01(str, jsonElement);
        return c2nw.A00();
    }

    public static void A1L(Iterable iterable, BLG blg) {
        blg.Af8(AGI.A07(iterable));
    }

    public static void A1M(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 7);
    }

    public static void A1N(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 8);
    }

    public static void A1O(String str, int i, String str2, String str3) {
        CFK.A05(str3, FGI.A0I(str, i, str2));
    }

    public static void A1P(String str, String str2, String str3) {
        CFK.A04(str3, FGI.A0M(str, str2));
    }

    public static void A1Q(String str, String str2, String str3, Throwable th) {
        CFK.A0A(str3, FGI.A0M(str, str2), th);
    }

    public static void A1R(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str);
    }

    public static void A1S(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("kind", z);
    }

    public static void A1T(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("name", z);
    }

    public static void A1U(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("state", z);
    }

    public static void A1V(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08(HatchWebPageParserKt.DESCRIPTION, z);
    }

    public static C7491Exw A0G() {
        return new C7491Exw(2342155506003017920L);
    }

    public static C7491Exw A0H() {
        return new C7491Exw(2342155506004459715L);
    }

    public static C7491Exw A0I() {
        return new C7491Exw(2342155506012520674L);
    }

    public static C7491Exw A0J() {
        return new C7491Exw(2342155506015076596L);
    }

    public static C7491Exw A0K() {
        return new C7491Exw(36875446743072796L);
    }

    public static C7491Exw A0L() {
        return new C7491Exw(36875446746480669L);
    }

    public static C7491Exw A0M() {
        return new C7491Exw(36875446746546206L);
    }

    public static C7491Exw A0N() {
        return new C7491Exw(36875446746677279L);
    }

    public static C7491Exw A0O() {
        return new C7491Exw(36875446749626400L);
    }

    public static C7491Exw A0P() {
        return new C7491Exw(36875446749691937L);
    }

    public static C7491Exw A0Q() {
        return new C7491Exw(36875446750543906L);
    }

    public static C7491Exw A0R() {
        return new C7491Exw(36875446750609443L);
    }

    public static C7491Exw A0S() {
        return new C7491Exw(36875446751592484L);
    }

    public static C7491Exw A0T() {
        return new C7491Exw(36875446751985701L);
    }

    public static C7491Exw A0U() {
        return new C7491Exw(36875446752313382L);
    }

    public static C7491Exw A0V() {
        return new C7491Exw(36875446752772135L);
    }

    public static C7491Exw A0W() {
        return new C7491Exw(36875446755000360L);
    }

    public static C7491Exw A0X() {
        return new C7491Exw(36875446755065897L);
    }

    public static C7491Exw A0Y() {
        return new C7491Exw(36875446755393578L);
    }

    public static C7491Exw A0Z() {
        return new C7491Exw(36875446755852331L);
    }

    public static C7491Exw A0a() {
        return new C7491Exw(36875446756769836L);
    }

    public static C7491Exw A0b() {
        return new C7491Exw(36593971769182875L);
    }

    public static C7491Exw A0c() {
        return new C7491Exw(36593971769510556L);
    }

    public static C7491Exw A0d() {
        return new C7491Exw(36593971770690205L);
    }

    public static C7491Exw A0e() {
        return new C7491Exw(36593971771673246L);
    }

    public static C7491Exw A0f() {
        return new C7491Exw(36593971771738783L);
    }
}
