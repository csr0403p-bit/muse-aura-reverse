package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTelemetryKt;
import com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt;
import com.facebook.aura.agentpermission.HotelCheckoutFormattingKt;
import com.facebook.aura.agentpermission.LegalLink;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFailure;
import com.facebook.aura.assist.AssistIdentityState;
import com.facebook.aura.assist.HatchAssistOverlayActivity;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalNode;
import com.facebook.aura.library.repo.GoalsStore;
import com.facebook.aura.library.repo.HatchGoalsTabDataSource;
import com.facebook.aura.library.repo.HatchGoalsTabDataSourceKt;
import com.facebook.aura.localbrowser.LocalBrowserEndpointFailure;
import com.facebook.aura.localbrowser.LocalBrowserFacts;
import com.facebook.aura.localbrowser.LocalBrowserSession;
import com.facebook.aura.localbrowser.LocalBrowserTask;
import com.facebook.aura.login.nativeflow.HatchCaaStage;
import com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent;
import com.facebook.aura.login.nativeflow.NativeLoginField;
import com.facebook.aura.login.nativeflow.NativeLoginRoutesKt;
import com.facebook.aura.login.nativeflow.NativeLoginUiState;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.nodes.cards.NodeCardComponentsKt;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentCallState;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.3cI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cI {
    public static BRg A05(BFM bfm, BRg bRg, AuraTheme auraTheme) {
        return C3U4.A0B(bRg, auraTheme.getDimensions(bfm, 6).gutterWidth, AuraDimensKt.SpacingXsmallPlusNano);
    }

    public static BRg A06(BRg bRg, String str, Function0 function0) {
        return C0v5.A04(bRg, new C1YD(0), str, function0, true);
    }

    public static LocalBrowserEndpointFailure A0E(String str) {
        C9jH c9jHA0E = AGH.A0E();
        return new LocalBrowserEndpointFailure(str, false, null, null, c9jHA0E, c9jHA0E);
    }

    public static LocalBrowserEndpointFailure A0F(String str, String str2, String str3) {
        C9jH c9jHA0E = AGH.A0E();
        return new LocalBrowserEndpointFailure(str, false, str2, str3, c9jHA0E, c9jHA0E);
    }

    public static AuraColors A0K(BFM bfm, int i) {
        bfm.AgE(i);
        return AuraTheme.INSTANCE.getColors(bfm, 6);
    }

    public static Object A0T(C9jG c9jG, C9sU c9sU, JsonElement jsonElement) {
        C7384Etj.A0Y(c9jG, 0);
        return C9sZ.A00(c9jG, c9sU, jsonElement);
    }

    public static String A0V(int i, int i2, String str) {
        if ((i & i2) != 0) {
            return null;
        }
        return str;
    }

    public static String A0Z(String str) {
        if (str != null) {
            return HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str);
        }
        return null;
    }

    public static String A0a(String str) {
        if (str != null) {
            return CheckoutRowPrimitivesKt.trimToNonEmpty(str);
        }
        return null;
    }

    public static ArrayList A0y(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return new ArrayList();
    }

    public static HoC A15(HoC hoC) {
        if (hoC == null) {
            return null;
        }
        hoC.A5w(null);
        return null;
    }

    public static void A19(C0CD c0cd, Object obj, int i) {
        c0cd.APJ(null, null, B1V.A01(obj, i, true));
    }

    public static void A1A(AkZ akZ) {
        C7384Etj.A0Y(akZ, 0);
        akZ.Ad0(false);
    }

    public static void A1B(C1299Agk c1299Agk) {
        C7384Etj.A0Y(c1299Agk, 0);
        c1299Agk.A02();
    }

    public static void A1C(HatchComponent hatchComponent, HatchScreen hatchScreen, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        AgentPermissionTelemetryKt.logAgentPermissionCardClick(hatchComponent, hatchScreen, agentPermissionApproval, null, null, 1);
    }

    public static void A1H(BzK bzK, String str) {
        bzK.A0A(str, true);
        bzK.apply();
    }

    public static boolean A1W(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    public static F0C[] A1Z(Integer num, Function0 function0) {
        return new F0C[]{AbstractC5321DgF.A02(num, function0), null, null};
    }

    public static int A00(int i, int i2) {
        if ((i & 1) != 0) {
            return 0;
        }
        return i2;
    }

    public static int A01(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static BRg A07(BRg bRg, boolean z, BFM bfm, int i) {
        return bRg.then(NodeCardComponentsKt.hatchCardChrome(z, bfm, i & 14));
    }

    public static EG6 A08(Context context, String str) {
        EG6 eg6 = new EG6(context, str);
        eg6.A03(R.drawable.hatch_notification_icon);
        return eg6;
    }

    public static AssistIdentityState A0A(HatchAssistOverlayActivity hatchAssistOverlayActivity) {
        return hatchAssistOverlayActivity.identityState.getValue();
    }

    public static GoalNode A0B(GoalsStore goalsStore, Object obj) {
        return goalsStore.goalsById.get(obj);
    }

    public static GoalsStore A0C(HatchGoalsTabDataSource hatchGoalsTabDataSource) {
        return hatchGoalsTabDataSource._store.getValue();
    }

    public static LocalBrowserFacts A0G(LocalBrowserSession localBrowserSession) {
        return localBrowserSession.facts.getValue();
    }

    public static VoiceCallPhase A0I(SessionController sessionController) {
        return sessionController._callState.getValue().phase;
    }

    public static SessionController.CallMarkerState A0J(SessionController sessionController) {
        return sessionController.callMarker.getValue();
    }

    public static Boolean A0L(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Boolean) c9j4.A8Z(C07839ix.A00, c9iZ, i);
    }

    public static Boolean A0M(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Boolean) c9j4.A8Z(C07839ix.A00, c9iZ, i);
    }

    public static Integer A0N(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Integer) c9j4.A8Z(C07729ii.A00, c9iZ, i);
    }

    public static Long A0P(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Long) c9j4.A8Z(C9j1.A00, c9iZ, i);
    }

    public static Long A0Q(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (Long) c9j4.A8Z(C9j1.A00, c9iZ, i);
    }

    public static Object A0R(SessionController sessionController) {
        return sessionController.voiceCallStateHolder.embodimentMedia.getValue();
    }

    public static Object A0S(G0V g0v, HtJ htJ) {
        return GAX.A01(htJ, g0v, 10000L);
    }

    public static Object A0U(C9iZ c9iZ, C9j4 c9j4) {
        return c9j4.A8Z(C07779iq.A01, c9iZ, 8);
    }

    public static String A0W(int i, String str) {
        if ((i & 4) == 0) {
            return null;
        }
        return str;
    }

    public static String A0X(SessionController sessionController) {
        return sessionController.callMarker.getValue().callId;
    }

    public static String A0f(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 1);
    }

    public static String A0g(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 2);
    }

    public static String A0h(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 5);
    }

    public static String A0i(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 1);
    }

    public static String A0j(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 2);
    }

    public static String A0k(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 3);
    }

    public static String A0l(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 4);
    }

    public static String A0m(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 5);
    }

    public static String A0n(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 6);
    }

    public static String A0o(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 7);
    }

    public static String A0p(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 9);
    }

    public static String A0q(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 10);
    }

    public static String A0r(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 11);
    }

    public static String A0s(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 12);
    }

    public static String A0t(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 13);
    }

    public static String A0u(C9iZ c9iZ, C9j4 c9j4) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, 15);
    }

    public static String A0v(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, i);
    }

    public static String A0w(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (String) c9j4.A8Z(C07779iq.A01, c9iZ, i);
    }

    public static StringBuilder A0x(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static List A10(List list, int i) {
        return (i & 1) != 0 ? C0881AGi.A00 : list;
    }

    public static List A11(List list, int i) {
        return (i & 2) != 0 ? C0881AGi.A00 : list;
    }

    public static List A12(List list, int i) {
        return (i & 4) != 0 ? C0881AGi.A00 : list;
    }

    public static Locale A13(Locale locale, int i) {
        if (i == 0) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        C7384Etj.A0U(locale2);
        return locale2;
    }

    public static HtJ A14(Object obj, Object obj2) {
        C9286GCn.A00(null, obj2, (C9286GCn) obj);
        return null;
    }

    public static JsonElement A16(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (JsonElement) c9j4.A8Z(JsonElementSerializer.A00, c9iZ, i);
    }

    public static JsonElement A17(C9iZ c9iZ, C9j4 c9j4, int i) {
        return (JsonElement) c9j4.A8Z(JsonElementSerializer.A00, c9iZ, i);
    }

    public static void A1D(GoalNode goalNode, Object obj, Map map, AHH ahh) {
        map.put(obj, goalNode.copy(goalNode.goal, ahh));
    }

    public static void A1E(LocalBrowserSession localBrowserSession, C0924AIa c0924AIa) {
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        if (localBrowserTask != null) {
            c0924AIa.put(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, localBrowserTask.id);
        }
    }

    public static void A1F(NativeLoginViewModel nativeLoginViewModel, C78T c78t, G0V g0v, C3UX c3ux) {
        nativeLoginViewModel.confirmJob = GAo.A02(C79.A00, c78t, g0v, c3ux);
    }

    public static void A1G(BrowserViewerSession browserViewerSession) {
        browserViewerSession.controlGeneration++;
    }

    public static void A1M(String str, StringBuilder sb, boolean z) {
        sb.append(FGI.A0r(str, z));
        sb.append('\n');
    }

    public static boolean A1S(int i, boolean z) {
        if ((i & 16) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1V(Object obj, Object obj2) {
        return C7384Etj.areEqual(obj2, ((InterfaceC2349BUy) obj).getFunctionDelegate());
    }

    public static boolean A1X(C9iK c9iK) {
        c9iK.A08("kind", true);
        return true;
    }

    public static boolean A1Y(C9iK c9iK) {
        c9iK.A08("label", true);
        return true;
    }

    public static C9hr[] A1a() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq)};
    }

    public static long A02() {
        return System.currentTimeMillis() / 1000;
    }

    public static long A03(C1BO c1bo) {
        return ((VoiceEmbodimentCallState) c1bo.getValue()).generation;
    }

    public static C1BO A04(BFM bfm, NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator, C1BN c1bn) {
        C1BO c1boA02 = C2CK.A02(bfm, c1bn);
        NativeLoginRoutesKt.NativeLoginEffects(nativeLoginViewModel, auraNavigator, bfm, NativeLoginViewModel.$stable);
        return c1boA02;
    }

    public static HatchCaaFailure A09(HatchCaaFailure.Companion companion, HatchCaaStage hatchCaaStage) {
        return companion.clientSide(HatchCaaErrorType.TEMP_TOKEN_UNAVAILABLE, hatchCaaStage.getValue(), HatchCaaAccountErrorType.SYSTEM_ERROR);
    }

    public static GoalsStore A0D(HatchGoalsTabDataSource hatchGoalsTabDataSource, GoalsStore goalsStore) {
        return hatchGoalsTabDataSource.withLocalOrder(hatchGoalsTabDataSource.withActiveCompletionSteps(goalsStore));
    }

    public static NativeLoginErrorDialogContent A0H(C1BO c1bo) {
        return ((NativeLoginUiState) c1bo.getValue()).errorDialog;
    }

    public static Long A0O() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }

    public static String A0Y(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0b(String str, String str2) {
        Locale locale = Locale.getDefault();
        C7384Etj.A0U(locale);
        return HotelCheckoutFormattingKt.hotelCheckoutAmount(str, str2, locale);
    }

    public static String A0c(Iterator it) {
        return ((Goal) it.next()).id;
    }

    public static String A0d(List list, int i) {
        return ((LegalLink) list.get(i)).label;
    }

    public static String A0e(C06847l8 c06847l8, int i) {
        return c06847l8.AG1().get(i);
    }

    public static Iterator A0z(C1BN c1bn) {
        return ((Iterable) c1bn.getValue()).iterator();
    }

    public static void A18(Context context, Intent intent) {
        C7mU.A00().A04().A05(context, intent);
    }

    public static void A1I(Object obj, int i, Object obj2) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 17);
    }

    public static void A1J(Object obj, Object obj2, String str, AbstractCollection abstractCollection) {
        if (str.equals(obj)) {
            abstractCollection.add(obj2);
        }
    }

    public static void A1K(Object obj, C0924AIa c0924AIa, boolean z) {
        c0924AIa.put(obj, String.valueOf(z));
    }

    public static void A1L(String str, String str2, Throwable th) {
        CFK.A08(HatchGoalsTabDataSourceKt.TAG, FGI.A0M(str, str2), th);
    }

    public static void A1N(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("url", z);
    }

    public static void A1O(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("text", z);
    }

    public static void A1P(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("label", z);
    }

    public static void A1Q(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("reason", z);
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((Goal) it.next()).id);
    }

    public static boolean A1T(C1BO c1bo) {
        return ((NativeLoginUiState) c1bo.getValue()).isLoading;
    }

    public static boolean A1U(NativeLoginField nativeLoginField, NativeLoginUiState nativeLoginUiState, NativeLoginViewModel.Companion companion, Object obj, BLG blg) {
        return blg.A6e(obj, companion.clearingErrorOn(nativeLoginUiState, nativeLoginField));
    }

    public static C9hr[] A1b(C9hr c9hr, C9hr c9hr2, C9hr c9hr3, C9hr c9hr4, C9hr c9hr5) {
        return new C9hr[]{c9hr2, c9hr3, c9hr4, c9hr5, AbstractC07749im.A00(c9hr)};
    }
}
