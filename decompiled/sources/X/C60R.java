package X;

import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.browser.ModelLinkDiagnosticsKt;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.commands.geofence.GeofenceSetHandler;
import com.facebook.aura.commands.photos.PhotoUploadWorker;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.repo.StreamingState;
import com.facebook.aura.feed.model.CursorPaginationState;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.file.actions.HatchShareKt;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.file.utils.HatchShareDownloadLogger;
import com.facebook.aura.file.view.ExternalFileSource;
import com.facebook.aura.file.view.FileContentType;
import com.facebook.aura.file.view.FileLoadingState;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.health.HealthConnectorTelemetry;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.nodes.NodePinReminderDispatcher;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.datasource.NodeSyncDiff;
import com.facebook.aura.pairs.ConnectionsLogContext;
import com.facebook.aura.pairs.ConnectionsRuleEditorPhase;
import com.facebook.aura.pairs.ConnectionsRuleEditorUiState;
import com.facebook.aura.pairs.PairsAnalyticsKt;
import com.facebook.aura.pairs.PairsConfirmation;
import com.facebook.aura.pairs.PairsError;
import com.facebook.aura.pairs.PairsException;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt;
import com.facebook.aura.skills.view.ConnectorPermissionSectionsKt;
import com.facebook.aura.storagerecovery.StorageRecoveryUiState;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import com.facebook.aura.widgets.SpaceWidgetRefresher;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.60R, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60R {
    public static int A02(String str) {
        C7384Etj.A0Y(str, 0);
        return str.length();
    }

    public static int A03(String str) {
        C7384Etj.A0Y(str, 0);
        return str.hashCode();
    }

    public static long A04(BFM bfm, AuraTheme auraTheme) {
        return AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable);
    }

    public static Uri A0C(WebResourceRequest webResourceRequest) {
        C7384Etj.A0Y(webResourceRequest, 1);
        Uri url = webResourceRequest.getUrl();
        C7384Etj.A0U(url);
        return url;
    }

    public static BRg A0E(BFM bfm, BRg bRg, C1DM c1dm, AuraTheme auraTheme) {
        long j = auraTheme.getColors(bfm, 6).background;
        return C1b8.A03(bRg, c1dm, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.4f));
    }

    public static BRg A0F(BFM bfm, BRg bRg, C1DM c1dm, AuraTheme auraTheme) {
        return C1b8.A03(C11U.A03(bRg, c1dm), C1OM.A00, AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable));
    }

    public static FileLoadingState.Success A0L(ExternalFileSource externalFileSource, WorkspaceEntry workspaceEntry) {
        return new FileLoadingState.Success(new FileContentType.ExternalPreview(externalFileSource, HatchMimeResolver.INSTANCE.mimeForName(workspaceEntry.name), true, false));
    }

    public static HatchSessionItem A0M(HatchSessionItem hatchSessionItem, int i) {
        return HatchSessionItem.copy$default(hatchSessionItem, null, 0L, 0L, null, null, false, null, 0, false, false, null, null, false, i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONState A0O() {
        return new JSONState(0L, (JsonObject) null, 3, (C06H) (0 == true ? 1 : 0));
    }

    public static NodeCommandResponse A0P(String str) {
        return new NodeCommandResponse(false, null, str, null, null);
    }

    public static NodeCommandResponse A0Q(String str, JsonElement jsonElement, C2nw c2nw) {
        c2nw.A01(str, jsonElement);
        return new NodeCommandResponse(true, c2nw.A00(), null, null, null);
    }

    public static PairsConfirmation A0S(BFM bfm, String str, String str2, int i) {
        return new PairsConfirmation(str, str2, AbstractC2271BQs.A01(bfm, i), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d54), true);
    }

    public static Object A0a(Object obj, ConcurrentHashMap concurrentHashMap) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(obj, atomicInteger);
        return objPutIfAbsent == null ? atomicInteger : objPutIfAbsent;
    }

    public static String A0f(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return obj.toString();
    }

    public static C9iK A0q(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 2);
        c9iK.A08(AgeCheckFunnelLogging.KEY_METHOD, false);
        c9iK.A08("session_id", false);
        return c9iK;
    }

    public static C2nw A0s(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return new C2nw();
    }

    public static void A11(BFM bfm, int i) {
        bfm.AgE(i);
        ConnectorPermissionSectionsKt.EmptySkillDetailState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012b), bfm, 0);
    }

    public static void A14(BFM bfm, Object obj, int i) {
        InternalSettingsModulePageKt.InternalSettingsModulePage(null, B1V.A00(bfm, obj, i), bfm, 48, 1);
    }

    public static void A15(AuraBugReportSender.C110101 c110101) {
        c110101.L$14 = null;
        c110101.L$15 = null;
        c110101.L$16 = null;
        c110101.L$17 = null;
        c110101.L$18 = null;
        c110101.L$19 = null;
        c110101.L$20 = null;
        c110101.L$21 = null;
        c110101.L$22 = null;
        c110101.L$23 = null;
        c110101.L$24 = null;
    }

    public static void A16(GeofenceSetHandler.AnonymousClass1 anonymousClass1) {
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = null;
        anonymousClass1.L$6 = null;
        anonymousClass1.L$7 = null;
        anonymousClass1.L$8 = null;
        anonymousClass1.L$9 = null;
    }

    public static void A19(HatchNodeClient.C127441 c127441) {
        c127441.L$11 = null;
        c127441.L$12 = null;
        c127441.L$13 = null;
        c127441.L$14 = null;
        c127441.L$15 = null;
        c127441.L$16 = null;
        c127441.L$17 = null;
        c127441.L$18 = null;
        c127441.L$19 = null;
    }

    public static void A1A(HatchNodeClient.C127441 c127441, Object obj, Object obj2, Object obj3) {
        c127441.L$2 = null;
        c127441.L$3 = null;
        c127441.L$4 = obj;
        c127441.L$5 = null;
        c127441.L$6 = obj2;
        c127441.L$7 = obj3;
    }

    public static void A1B(HatchNodeClient.C127441 c127441, Object obj, Object obj2, Object obj3) {
        c127441.L$1 = null;
        c127441.L$2 = null;
        c127441.L$3 = null;
        c127441.L$4 = obj;
        c127441.L$5 = null;
        c127441.L$6 = null;
        c127441.L$7 = obj2;
        c127441.L$8 = obj3;
    }

    public static void A1C(HatchNodeClient.C127511 c127511) {
        c127511.L$0 = null;
        c127511.L$1 = null;
        c127511.L$2 = null;
        c127511.L$3 = null;
        c127511.L$4 = null;
        c127511.L$5 = null;
        c127511.L$6 = null;
        c127511.L$7 = null;
        c127511.L$8 = null;
    }

    public static void A1D(NodePinReminderDispatcher.AnonymousClass1 anonymousClass1) {
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = null;
    }

    public static void A1E(SpaceWidgetRefresher.C144121 c144121) {
        c144121.L$0 = null;
        c144121.L$1 = null;
        c144121.L$2 = null;
        c144121.L$3 = null;
        c144121.L$4 = null;
        c144121.L$5 = null;
        c144121.L$6 = null;
        c144121.L$7 = null;
    }

    public static boolean A1U(WebView webView) {
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        return true;
    }

    public static HxE[] A1b(List list) {
        HxE[] hxEArr = (HxE[]) list.toArray(new HxE[0]);
        return (HxE[]) Arrays.copyOf(hxEArr, hxEArr.length);
    }

    public static int A00(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A01(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static NotificationManager A07(Context context) {
        Object systemService = context.getSystemService("notification");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public static Intent A0A(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return intent;
    }

    public static BRg A0G(BFM bfm, HatchComponent hatchComponent, ConnectionsLogContext connectionsLogContext, int i) {
        return PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, null, null, null, null, bfm, i | 48, 60);
    }

    public static HatchConversationState A0K(HatchConversationState hatchConversationState, List list) {
        return HatchConversationState.copy$default(hatchConversationState, null, list, null, null, null, null, false, null, false, null, null, null, null, false, null, 32765, null);
    }

    public static HatchMessage A0N(HatchMessage hatchMessage, List list) {
        return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, list, false, null, null, false, null, -268435457, 3, null);
    }

    public static PairsException A0T() {
        return new PairsException(PairsError.FAILED, false, null, null);
    }

    public static BufferedReader A0U(InputStream inputStream, Charset charset) {
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    public static String A0d(WebView webView) {
        AuraUserAgent auraUserAgent = AuraUserAgent.INSTANCE;
        String userAgentString = webView.getSettings().getUserAgentString();
        C7384Etj.A0U(userAgentString);
        return auraUserAgent.generateWebUserAgent(userAgentString);
    }

    public static String A0g(Object obj, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj2 = jsonObject.get(obj);
        return (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj2) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null) ? "" : strA04;
    }

    public static String A0h(String str, StringBuilder sb, int i) {
        sb.append((Object) FGI.A0G(str, ')', i));
        return sb.toString();
    }

    public static String A0i(String str, JsonObject jsonObject) {
        String strOptString = JsonObjectExtensionsKt.optString(jsonObject, str, "");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String A0j(C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return (String) c31u.getValue(null, interfaceC7359EnWArr[i]);
    }

    public static SimpleDateFormat A0k(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static HxE A0m(int i) {
        return new HxE(PhotosSearchHandlerKt.PARAM_LIMIT, new Integer(i));
    }

    public static HxE A0n(C76B c76b, HxE hxE, int i) {
        return i != 0 ? new HxE(c76b, hxE.second) : new HxE(hxE.first, ((C76B) hxE.second).Agp(c76b));
    }

    public static C0924AIa A0o(Object obj) {
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("provider", obj);
        c0924AIa.put("provider_adapter", HealthConnectorTelemetry.PROVIDER_ADAPTER);
        return c0924AIa;
    }

    public static C9iK A0r(String str, C9cd c9cd, int i) {
        C9iK c9iK = new C9iK(str, c9cd, i);
        c9iK.A08(SpaceWidgetRefreshWorkerKt.KEY_SLUG, false);
        return c9iK;
    }

    public static void A0u(long j, String str, String str2) {
        HatchShareDownloadLogger.INSTANCE.logActionSuccess(str, str2, HatchShareDownloadLogger.clock.now() - j);
    }

    public static void A0w(Context context) {
        ToastApi.INSTANCE.showToast(context.getString(R.string._name_removed__res_0x7f121188));
    }

    public static void A0x(Intent intent, PackageItemInfo packageItemInfo) {
        intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
    }

    public static void A0y(Intent intent, Uri uri) {
        if (uri != null) {
            intent.putExtra(HatchShareKt.LINK_STICKER_ICON_URI_PARAM, uri);
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                clipData.addItem(new ClipData.Item(uri));
            }
        }
    }

    public static void A17(PhotoUploadWorker.AnonymousClass1 anonymousClass1, Object obj, Object obj2, Object obj3, Object obj4) {
        anonymousClass1.L$1 = obj;
        anonymousClass1.L$2 = obj2;
        anonymousClass1.L$3 = obj3;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = obj4;
        anonymousClass1.L$6 = null;
        anonymousClass1.L$7 = null;
        anonymousClass1.L$8 = null;
        anonymousClass1.L$9 = null;
        anonymousClass1.L$10 = null;
    }

    public static void A18(CursorPaginationState cursorPaginationState, FeedViewModel feedViewModel, boolean z) {
        feedViewModel.cursorPaginationState = new CursorPaginationState(cursorPaginationState.nextCursor, cursorPaginationState.previousCursor, z);
    }

    public static void A1G(Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        if (jsonObject.containsKey(PairsInviteMailboxKt.OUTCOME_OK)) {
            jsonObject.get("result");
        }
    }

    public static void A1J(Object obj, AbstractCollection abstractCollection) {
        if ((obj instanceof C10571Hud) || obj == null) {
            return;
        }
        abstractCollection.add(obj);
    }

    public static void A1M(String str, String str2, C2nw c2nw) {
        if (str != null) {
            C7qW.A06(str2, str, c2nw);
        } else {
            c2nw.A01(str2, JsonNull.A00);
        }
    }

    public static void A1N(StringBuilder sb, Throwable th) {
        sb.append(FGI.A0U("(failed: ", th.getMessage(), ")"));
        sb.append('\n');
    }

    public static void A1R(C9iK c9iK, boolean z) {
        c9iK.A08("app_target", z);
        c9iK.A08("recipient_type", z);
        c9iK.A08("recipient_id", z);
        c9iK.A08("sender_account_id", z);
    }

    public static boolean A1V(C90m c90m, BFM bfm, BRg bRg) {
        C01N.A07(bfm, c90m.AiP(bRg, 1.0f, true));
        return true;
    }

    public static boolean A1W(ConnectionsRuleEditorPhase connectionsRuleEditorPhase, ConnectionsRuleEditorUiState connectionsRuleEditorUiState, Object obj, BLG blg) {
        return blg.A6e(obj, ConnectionsRuleEditorUiState.copy$default(connectionsRuleEditorUiState, connectionsRuleEditorPhase, false, null, null, null, null, false, false, false, null, 1022, null));
    }

    public static boolean A1Y(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, HatchConversationState.copy$default((HatchConversationState) value, null, null, null, null, null, null, false, null, false, null, null, null, null, false, null, 24575, null));
    }

    public static boolean A1Z(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, HatchConversationState.copy$default((HatchConversationState) value, null, null, StreamingState.Done, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null));
    }

    public static long A05(Object obj, String str, String str2, String str3) {
        Hwg.A00(obj);
        HatchShareDownloadLogger hatchShareDownloadLogger = HatchShareDownloadLogger.INSTANCE;
        long jNow = HatchShareDownloadLogger.clock.now();
        hatchShareDownloadLogger.logActionStarted(str, str2, str3);
        return jNow;
    }

    public static long A06(LocalDate localDate, ZoneId zoneId, int i, int i2) {
        return ZonedDateTime.of(localDate, LocalTime.of(i, i2), zoneId).toInstant().toEpochMilli();
    }

    public static Intent A08(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    public static Intent A09(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null));
    }

    public static Uri A0B(Uri.Builder builder, String str, String str2) {
        Uri uriBuild = builder.appendQueryParameter(str, str2).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public static Uri A0D(String str) {
        Uri uriBuild = WidgetComponentsKt.auraUri(str).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public static BRg A0H(BRg bRg, C1DM c1dm, long j) {
        return C3U4.A09(C1b8.A03(bRg, c1dm, j), 12.0f);
    }

    public static C064476g A0I(AbstractC10440Hhn abstractC10440Hhn, AbstractC10440Hhn abstractC10440Hhn2) {
        GF0 gf0A00 = abstractC10440Hhn.A00();
        abstractC10440Hhn2.A01();
        C064476g c064476g = (C064476g) abstractC10440Hhn2.A00;
        int i = C064476g.DELETE_FIELD_NUMBER;
        c064476g.request_ = gf0A00;
        return c064476g;
    }

    public static BzB A0J(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        BzB bzB = new BzB(abstractMap);
        BzB.A00(bzB);
        return bzB;
    }

    public static NodeCommandResponse A0R(C2nw c2nw) {
        return new NodeCommandResponse(true, c2nw.A00(), null, null, null);
    }

    public static BufferedWriter A0V(MessageDigest messageDigest) {
        C7384Etj.A0X(messageDigest);
        return new BufferedWriter(new OutputStreamWriter(new NodeSyncDiff.MessageDigestOutputStream(messageDigest), DCl.A05), 8192);
    }

    public static Integer A0W(List list, List list2) {
        return new Integer(list.size() - list2.size());
    }

    public static Long A0X(Iterator it) {
        return Long.valueOf(((FeedUnit) it.next()).getEditionGeneratedAtMs());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Long A0Y(Iterator it) {
        return Long.valueOf(((Number) ((HxE) it.next()).second).longValue());
    }

    public static Object A0Z(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static String A0b(Uri.Builder builder) {
        String string = builder.build().toString();
        C7384Etj.A0U(string);
        return string;
    }

    public static String A0c(WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        C7384Etj.A0U(string);
        return string;
    }

    public static String A0e(Writer writer, MessageDigest messageDigest) throws IOException {
        writer.close();
        byte[] bArrDigest = messageDigest.digest();
        C7384Etj.A0U(bArrDigest);
        return BFI.A0C("", NodeSyncDiff.AnonymousClass2.INSTANCE, bArrDigest);
    }

    public static LocalDate A0l(ZoneId zoneId, long j) {
        return Instant.ofEpochMilli(j).atZone(zoneId).toLocalDate();
    }

    public static C9iQ A0p() {
        return C9iL.A01("com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin", HatchSkillOAuthOrigin.values());
    }

    public static JsonPrimitive A0t(Object obj, JsonObject jsonObject) {
        Object obj2 = jsonObject.get(obj);
        if (obj2 instanceof JsonPrimitive) {
            return (JsonPrimitive) obj2;
        }
        return null;
    }

    public static void A0v(ContentProviderOperation.Builder builder, List list) {
        ContentProviderOperation contentProviderOperationBuild = builder.build();
        C7384Etj.A0U(contentProviderOperationBuild);
        list.add(contentProviderOperationBuild);
    }

    public static void A0z(View view, HatchHtmlActionTrace hatchHtmlActionTrace, String str) {
        Context context = view.getContext();
        C7384Etj.A0U(context);
        ModelLinkDiagnosticsKt.recordOutcome(hatchHtmlActionTrace, AuraBrowserLauncherKt.openModelGeneratedLink(str, context), str);
    }

    public static void A10(BFM bfm) {
        bfm.AgF(-1115894518);
        bfm.AgF(1886828752);
    }

    public static void A12(BFM bfm, BBI bbi, Object obj) {
        bfm.AgB();
        if (bbi.A0M) {
            bfm.A7w(new C07358io(obj, 1));
        } else {
            bfm.AiE();
        }
    }

    public static void A13(BFM bfm, BBI bbi, Function0 function0) {
        bfm.AgB();
        if (bbi.A0M) {
            bfm.A7w(function0);
        } else {
            bfm.AiE();
        }
    }

    public static void A1F(Number number, Object obj, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        abstractCollection.add(obj);
        abstractCollection2.add(String.valueOf(number.longValue()));
    }

    public static void A1H(Object obj, Object obj2) {
        CFK.A0H(PairsRepositoryKt.TAG, "dropped %d undecodable %s items", obj, obj2);
    }

    public static void A1I(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.contains(obj)) {
            return;
        }
        abstractCollection2.add(obj2);
    }

    public static void A1K(String str, String str2, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(str2);
        sb.append(" elapsedMs=");
        sb.append(j);
    }

    public static void A1L(String str, String str2, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        CFK.A05(str2, sb.toString());
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        Long l = ((HatchMessage) it.next()).seq;
        if (l != null) {
            abstractCollection.add(l);
        }
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it, Set set) {
        Object next = it.next();
        if (set.contains(next)) {
            return;
        }
        abstractCollection.add(next);
    }

    public static void A1Q(Iterator it) {
        File file = (File) it.next();
        C7384Etj.A0X(file);
        CEV.A03(file);
    }

    public static boolean A1S(Uri uri, Uri uri2) {
        return C7384Etj.areEqual(uri.getHost(), uri2.getHost());
    }

    public static boolean A1T(Uri uri, Object[] objArr) {
        return Arrays.asList(objArr).contains(Integer.valueOf(uri.getPort()));
    }

    public static boolean A1X(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, new Integer(((Number) value).intValue() + 1));
    }

    public static boolean A1a(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, StorageRecoveryUiState.copy$default((StorageRecoveryUiState) value, null, null, null, false, null, false, null, null, false, 383, null));
    }
}
