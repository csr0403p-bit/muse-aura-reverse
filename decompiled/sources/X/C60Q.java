package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.webkit.WebResourceRequest;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState;
import com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel;
import com.facebook.aura.ageverification.AgeVerificationMethod;
import com.facebook.aura.ageverification.AgeVerificationStatus;
import com.facebook.aura.ageverification.SelfieCaptureState;
import com.facebook.aura.ageverification.SelfieCaptureViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.health.HealthConnectorTelemetry;
import com.facebook.aura.hotels.HotelMoneyJson;
import com.facebook.aura.hotels.HotelMoneyJson$$serializer;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import com.facebook.aura.nodes.core.NodeHitlGroup;
import com.facebook.aura.onboarding.OnboardingGateUiState;
import com.facebook.aura.onboarding.OnboardingGateViewModel;
import com.facebook.aura.pairs.ConnectionsLogContext;
import com.facebook.aura.pairs.PairsAnalytics;
import com.facebook.aura.pairs.PairsException;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.pairs.PeersPath;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingUiState;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.perf.HatchQplLogger;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionsUiState;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.widgets.SpaceWidgetRefresher;
import java.io.ByteArrayInputStream;
import java.time.Instant;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.60Q, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60Q {
    public static float A00(BFM bfm) {
        return AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.8f;
    }

    public static C1822Arm A0C(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).footnoteEmphasized;
    }

    public static C1822Arm A0D(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).bodyMedium;
    }

    public static AuraDeeplinkRoute A0G(AuraNavKey auraNavKey) {
        return new AuraDeeplinkRoute(auraNavKey, LaunchFlag.NAVIGATE, null);
    }

    public static HatchQplLogger A0P(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return HatchQplLogger.INSTANCE;
    }

    public static ByteArrayInputStream A0T() {
        return new ByteArrayInputStream(new byte[0]);
    }

    public static Object A0Z(Map.Entry entry) {
        C7384Etj.A0Y(entry, 0);
        return entry.getValue();
    }

    public static String A0i(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ROOT);
        }
        return null;
    }

    public static String A0o(C9iZ c9iZ, C9j4 c9j4) {
        return c9j4.A8f(c9iZ, 3);
    }

    public static Throwable A0p(Throwable th) {
        return PairsRepositoryKt.toPairsException(th, null);
    }

    public static void A16(ContentResolver contentResolver, Intent intent, Uri uri, CharSequence charSequence) {
        intent.setClipData(ClipData.newUri(contentResolver, charSequence, uri));
        intent.addFlags(1);
    }

    public static long A04() {
        return C19U.A03(20);
    }

    public static Context A08(BFM bfm) {
        return (Context) bfm.A6v(C7VW.A00);
    }

    public static Intent A09(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static ActivePermissionsUiState A0E(ActivePermissionsViewModel activePermissionsViewModel) {
        return activePermissionsViewModel._uiState.getValue();
    }

    public static SelfieCaptureState A0F(SelfieCaptureViewModel selfieCaptureViewModel) {
        return selfieCaptureViewModel._state.getValue();
    }

    public static FeedViewModel.FeedUiState A0H(FeedViewModel feedViewModel) {
        return feedViewModel._uiState.getValue();
    }

    public static HatchGatewayStateSnapshot A0I(HatchGatewayConnection hatchGatewayConnection) {
        return hatchGatewayConnection.gatewayState.getValue();
    }

    public static HotelMoneyJson A0J(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (HotelMoneyJson) c9j4.A8Z(HotelMoneyJson$$serializer.INSTANCE, c9iZ, i);
    }

    public static OnboardingGateUiState A0L(OnboardingGateViewModel onboardingGateViewModel) {
        return onboardingGateViewModel._uiState.getValue();
    }

    public static HatchConnectorQplLogger.AuthTraceState A0O() {
        return HatchConnectorQplLogger.activeAuthTrace.get();
    }

    public static SkillAccountsUiState A0Q(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel) {
        return skillLinkedAccountsViewModel._uiState.getValue();
    }

    public static Integer A0X(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Integer) c9j4.A8Z(C07729ii.A00, c9iZ, i);
    }

    public static String A0g(String str) {
        Locale locale = Locale.US;
        C7384Etj.A0V(locale);
        return str.toLowerCase(locale);
    }

    public static String A0j(String str) {
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        return str.toLowerCase(locale);
    }

    public static String A0k(String str, int i) {
        return FGI.A0I(str, i, "]");
    }

    public static UnsupportedOperationException A0q() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static HxE A0x() {
        return new HxE("provider_adapter", HealthConnectorTelemetry.PROVIDER_ADAPTER);
    }

    public static JsonElement A12(JsonObject jsonObject) {
        return (JsonElement) jsonObject.get("result");
    }

    public static JsonObject A13(String str) {
        return C9oY.A05(HatchJsonKt.HatchJson.A04(str));
    }

    public static void A15(NotificationManager notificationManager, CharSequence charSequence, String str, int i) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, charSequence, i));
    }

    public static void A17(HatchConversationAttachmentBuilder.AnonymousClass1 anonymousClass1, Object obj, Object obj2, Object obj3, Object obj4) {
        anonymousClass1.L$1 = obj;
        anonymousClass1.L$2 = obj2;
        anonymousClass1.L$3 = obj3;
        anonymousClass1.L$4 = obj4;
    }

    public static void A18(HatchNodeClient.C127441 c127441, Object obj, Object obj2, Object obj3, Object obj4) {
        c127441.L$8 = obj;
        c127441.L$9 = obj2;
        c127441.L$10 = obj3;
        c127441.L$11 = obj4;
    }

    public static void A19(ConnectionsLogContext connectionsLogContext, PairsAnalytics pairsAnalytics) {
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsLogContext.screen, HatchComponent.RETRY_BUTTON, null, null);
    }

    public static void A1A(SpaceWidgetRefresher.C144121 c144121, long j, boolean z, boolean z2) {
        c144121.Z$0 = z;
        c144121.Z$1 = z2;
        c144121.J$0 = j;
    }

    public static void A1B(SpaceWidgetRefresher.C144121 c144121, Object obj, Object obj2, Object obj3, Object obj4) {
        c144121.L$4 = obj;
        c144121.L$5 = obj2;
        c144121.L$6 = obj3;
        c144121.L$7 = obj4;
    }

    public static void A1L(String str, String str2, StringBuilder sb) {
        sb.append(FGI.A0M(str, str2));
        sb.append('\n');
    }

    public static boolean A1Q(int i, boolean z) {
        if (i != 0) {
            return true;
        }
        return z;
    }

    public static boolean A1S(AgeVerificationStatus ageVerificationStatus) {
        return ageVerificationStatus.methods.contains(AgeVerificationMethod.SELFIE);
    }

    public static boolean A1T(HatchMessage hatchMessage, HatchMessage hatchMessage2) {
        return C7384Etj.areEqual(hatchMessage.id, hatchMessage2.id);
    }

    public static boolean A1U(Object obj) {
        return "assistant".equals(((HatchTranscriptMessage) obj).role);
    }

    public static boolean A1X(C9iK c9iK) {
        c9iK.A08("type", true);
        return true;
    }

    public static Object[] A1Y(int i) {
        return new Object[]{new Integer(i)};
    }

    public static Object[] A1Z(PairsException pairsException) {
        return new Object[]{pairsException.error};
    }

    public static C9hr[] A1b() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq};
    }

    public static int A01(Long l, long j) {
        return l.compareTo(Long.valueOf(j));
    }

    public static int A02(Object obj) {
        return 217 + obj.hashCode();
    }

    public static int A03(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static long A05(CharSequence charSequence) {
        return Instant.parse(charSequence).toEpochMilli();
    }

    public static long A06(ChronoZonedDateTime chronoZonedDateTime) {
        return chronoZonedDateTime.toInstant().toEpochMilli();
    }

    public static Notification A07(EG6 eg6) {
        Notification notificationA01 = eg6.A01();
        C7384Etj.A0U(notificationA01);
        return notificationA01;
    }

    public static Uri A0A(WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        C7384Etj.A0U(url);
        return url;
    }

    public static DisplayMetrics A0B(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static HatchMessage A0K(Iterator it) {
        return (HatchMessage) it.next();
    }

    public static PeersPath A0M(String str, String str2, String str3) {
        return new PeersPath(FGI.A0U(str, str2, str3));
    }

    public static WearablesLinkingUiState A0N(C1BO c1bo) {
        return (WearablesLinkingUiState) c1bo.getValue();
    }

    public static SkillPermissionsUiState A0R(C1BO c1bo) {
        return (SkillPermissionsUiState) c1bo.getValue();
    }

    public static C7n4 A0S() {
        return C7mU.A00().A03();
    }

    public static IllegalArgumentException A0U(String str, String str2) {
        return new IllegalArgumentException(FGI.A0M(str, str2));
    }

    public static IllegalArgumentException A0V(String str, String str2, String str3) {
        return new IllegalArgumentException(FGI.A0U(str, str2, str3));
    }

    public static Integer A0W(List list) {
        return Integer.valueOf(list.size());
    }

    public static Object A0Y(NodeExecutionContext nodeExecutionContext, String str, String str2, String str3, HtJ htJ) {
        return NodeExecutionKt.sendError(nodeExecutionContext, str, str2, AGH.A0E(), str3, htJ);
    }

    public static Object A0a(Map map, long j) {
        return map.get(Long.valueOf(j));
    }

    public static String A0b(Context context, Object obj, int i) {
        return context.getString(i, obj);
    }

    public static String A0c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static String A0d(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    public static String A0e(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0f(Object obj) {
        return obj.getClass().getCanonicalName();
    }

    public static String A0h(String str) {
        return Uri.parse(str).getHost();
    }

    public static String A0l(Iterator it) {
        return ((HatchMessage) it.next()).id;
    }

    public static String A0m(Iterator it) {
        return ((FeedUnit) it.next()).getId();
    }

    public static String A0n(List list, int i) {
        return (String) list.get(i);
    }

    public static ZoneId A0r() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        C7384Etj.A0U(zoneIdSystemDefault);
        return zoneIdSystemDefault;
    }

    public static ArrayList A0s(Object obj) {
        C7384Etj.A0U(obj);
        return new ArrayList();
    }

    public static ArrayList A0t(List list) {
        return new ArrayList(list.size());
    }

    public static List A0u(NodeHitlGroup nodeHitlGroup, String str, String str2, G0U g0u, int i) {
        return Collections.singletonList(LocalDeviceConnectorKt.action(str, str2, i, nodeHitlGroup, g0u));
    }

    public static List A0v(String str, String str2) {
        return BFI.A0F(new String[]{str, str2});
    }

    public static Locale A0w() {
        Locale locale = Locale.getDefault();
        C7384Etj.A0U(locale);
        return locale;
    }

    public static HxE A0y(Object obj, int i) {
        return new HxE(Integer.valueOf(i), obj);
    }

    public static HxE A0z(Object obj, HxE[] hxEArr) {
        return new HxE(obj, AGH.A0D(hxEArr));
    }

    public static HxE A10(Iterator it) {
        return (HxE) it.next();
    }

    public static JsonElement A11(Iterator it) {
        return (JsonElement) it.next();
    }

    public static JsonObject A14(Iterator it) {
        return JsonObjectExtensionsKt.asJsonObjectOrNull((JsonElement) it.next());
    }

    public static void A1C(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 13;
    }

    public static void A1D(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 14;
    }

    public static void A1E(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 15;
    }

    public static void A1F(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 15);
    }

    public static void A1G(Object obj, Object obj2, AbstractCollection abstractCollection, Set set) {
        if (set.contains(obj)) {
            abstractCollection.add(obj2);
        }
    }

    public static void A1H(Object obj, Object obj2, AbstractCollection abstractCollection, Set set) {
        if (set.contains(obj)) {
            return;
        }
        abstractCollection.add(obj2);
    }

    public static void A1I(String str, String str2, String str3) {
        CFK.A05(str3, FGI.A0M(str, str2));
    }

    public static void A1J(String str, String str2, String str3, String str4) {
        CFK.A06(str4, FGI.A0U(str, str2, str3));
    }

    public static void A1K(String str, String str2, String str3, String str4, String str5) {
        CFK.A06(str5, FGI.A0d(str, str2, str3, str4));
    }

    public static void A1M(String str, AbstractCollection abstractCollection) {
        if (str.length() > 0) {
            abstractCollection.add(str);
        }
    }

    public static void A1N(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("error", z);
    }

    public static void A1O(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("origin", z);
    }

    public static void A1P(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static boolean A1R(Uri uri) {
        return "https".equals(uri.getScheme());
    }

    public static boolean A1V(String str) {
        return str.trim().isEmpty();
    }

    public static boolean A1W(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static String[] A1a(long j) {
        return new String[]{String.valueOf(j)};
    }
}
