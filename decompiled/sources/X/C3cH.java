package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.facebook.aura.agentpermission.AgentPermissionApprovalsUiState;
import com.facebook.aura.agentpermission.WalletSheetUiState;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.analytics.hatch.caa.HatchCaaLoginEvent;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.identity.provider.HatchChatThemesState;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.GoalNode;
import com.facebook.aura.localbrowser.LocalBrowserEndpoint;
import com.facebook.aura.localbrowser.LocalBrowserRuntime;
import com.facebook.aura.localbrowser.LocalBrowserTask;
import com.facebook.aura.login.nativeflow.NativeLoginUiState;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthException;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3cH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cH {
    public static int A02(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static long A05(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getColors(bfm, 6).tertiaryText;
    }

    public static long A06(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getColors(bfm, 6).primaryText;
    }

    public static long A07(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getColors(bfm, 6).secondaryText;
    }

    public static C1822Arm A0B(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).subheadlineRegular;
    }

    public static C1822Arm A0C(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).bodyRegular;
    }

    public static C1822Arm A0D(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).bodyEmphasized;
    }

    public static C1822Arm A0E(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getTypography(bfm, 6).footnoteRegular;
    }

    public static NodeCommandSpec A0U(String str, String str2, Map map, Map map2) {
        return new NodeCommandSpec(str, map, map2, C0881AGi.A00, null, str2, 0L);
    }

    public static AuraTypography A0X(BFM bfm, AuraTheme auraTheme, int i) {
        bfm.AgE(i);
        return auraTheme.getTypography(bfm, 6);
    }

    public static Object A0Y(NativeLoginViewModel nativeLoginViewModel, HtJ htJ, G0V g0v) {
        return NativeLoginViewModel.m1325withTempTokenRgG5Fkc$default(nativeLoginViewModel, false, g0v, htJ, 1, null);
    }

    public static String A0e(CharSequence charSequence, Iterable iterable) {
        return AbstractC0878AGe.A0L(charSequence, "", "", iterable, null);
    }

    public static String A0h(C9iZ c9iZ, C9j4 c9j4) {
        return c9j4.A8f(c9iZ, 1);
    }

    public static String A0i(C9iZ c9iZ, C9j4 c9j4) {
        return c9j4.A8f(c9iZ, 2);
    }

    public static C10571Hud A0s(AuraHttpResponse auraHttpResponse, String str, Throwable th) {
        int i = auraHttpResponse.code;
        return new C10571Hud(new HatchAuthException(new HatchAuthError.Failed(i), FGI.A0M(str, " decode failed"), i, null, th));
    }

    public static C78T A0u() {
        return C78W.A02(new C8eO(null), AuraDispatchers.mainImmediate);
    }

    public static HzC A0w() {
        return Hxb.A02(C78W.A02(new C8eO(null), AuraDispatchers.INSTANCE.io()));
    }

    public static HzC A0x(C78T c78t) {
        return Hxb.A02(c78t.plus(new C8eO(null)));
    }

    public static C9hr A0z(F0C[] f0cArr) {
        return (C9hr) f0cArr[0].getValue();
    }

    public static C9hr A10(F0C[] f0cArr) {
        return (C9hr) f0cArr[1].getValue();
    }

    public static C9hr A11(F0C[] f0cArr) {
        return (C9hr) f0cArr[2].getValue();
    }

    public static C9hr A12(F0C[] f0cArr) {
        return (C9hr) f0cArr[3].getValue();
    }

    public static C9hr A13(F0C[] f0cArr) {
        return (C9hr) f0cArr[4].getValue();
    }

    public static C9iK A16(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 3);
        c9iK.A08("x", true);
        c9iK.A08("y", true);
        c9iK.A08("size", true);
        return c9iK;
    }

    public static void A1C(String str, C9iK c9iK) {
        c9iK.A08(str, true);
        c9iK.A08(HatchWebPageParserKt.WIDTH_ATTR, true);
        c9iK.A08(HatchWebPageParserKt.HEIGHT_ATTR, true);
    }

    public static void A1D(String str, C9iK c9iK) {
        c9iK.A08(str, true);
        c9iK.A08("device_id", true);
        c9iK.A08("waterfall_id", true);
    }

    public static boolean A1L(int i, int i2, boolean z) {
        if ((i & i2) != 0) {
            return false;
        }
        return z;
    }

    public static F0C[] A1U(Integer num, Function0 function0) {
        return new F0C[]{null, AbstractC5321DgF.A02(num, function0), null};
    }

    public static C9hr[] A1b(C9hr c9hr, F0C[] f0cArr) {
        return new C9hr[]{c9hr, (C9hr) f0cArr[1].getValue()};
    }

    public static float A00(AT5 at5) {
        return ((Number) at5.A04.getValue()).floatValue();
    }

    public static int A01(int i) {
        return HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | (i & 14);
    }

    public static long A03(int i, long j) {
        if (i != 0) {
            return 0L;
        }
        return j;
    }

    public static ComponentActivity A0A(BFM bfm, AKN akn) {
        Object objA6v = bfm.A6v(akn);
        C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        return (ComponentActivity) objA6v;
    }

    public static C1YL A0F(int i) {
        return new C1YL(i);
    }

    public static AEs A0G(InterfaceC08439ui interfaceC08439ui, BOD bod, A6J a6j, Class cls) {
        return BON.A00(interfaceC08439ui, bod.getViewModelStore(), a6j).A02(new C0861A6i(cls));
    }

    public static C8ee A0I() {
        return AuraLogger.INSTANCE.getInstance();
    }

    public static HatchCaaLoginEvent A0L(String str, String str2, int i) {
        return new HatchCaaLoginEvent(str, i, str2);
    }

    public static LazyStartSingleFlightImpl A0M() {
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, 1);
        return new LazyStartSingleFlightImpl(join);
    }

    public static HatchAuthException A0T(HatchProblemJson hatchProblemJson, AuraHttpResponse auraHttpResponse, HatchAuthError hatchAuthError, String str) {
        return new HatchAuthException(hatchAuthError, str, auraHttpResponse.code, hatchProblemJson, auraHttpResponse.cause);
    }

    public static VoiceAvatarFullScreenState A0V(BFM bfm) {
        return ((VoiceAvatarTakeoverState) bfm.A6v(VoiceAvatarTakeoverKt.LocalVoiceAvatarTakeoverState)).fullScreen;
    }

    public static AuraColors A0W(BFM bfm) {
        return AuraTheme.INSTANCE.getColors(bfm, 6);
    }

    public static String A0Z(int i, String str) {
        return (i & 1) != 0 ? "" : str;
    }

    public static String A0b(LocalBrowserTask localBrowserTask) {
        return BrowserTaskIdKt.logicalBrowserTaskId(localBrowserTask.id);
    }

    public static String A0c(AuraHttpResponse auraHttpResponse, String str) {
        String str2 = auraHttpResponse.errorMessage;
        return str2 == null ? FGI.A0M(str, ": response missing body") : str2;
    }

    public static String A0d(AuraHttpResponse auraHttpResponse, String str, Throwable th) {
        String str2 = auraHttpResponse.errorMessage;
        if (str2 != null) {
            return str2;
        }
        String message = th.getMessage();
        return message == null ? FGI.A0M(str, " response read failed") : message;
    }

    public static Collection A0j(LocalBrowserEndpoint localBrowserEndpoint) {
        Collection<LocalBrowserTask> collectionValues = localBrowserEndpoint.tasks.values();
        C7384Etj.A0U(collectionValues);
        return collectionValues;
    }

    public static Iterator A0k(LocalBrowserRuntime localBrowserRuntime) {
        return AbstractC0878AGe.A0X(localBrowserRuntime.mutableSessions.getValue().values()).iterator();
    }

    public static Map A0m(Object obj, Object obj2, HxE hxE, HxE hxE2) {
        return AGH.A0D(hxE, hxE2, new HxE(obj, obj2));
    }

    public static Map A0n(Object obj, Object obj2, HxE hxE, HxE hxE2, HxE hxE3) {
        return AGH.A0D(hxE, hxE2, hxE3, new HxE(obj, obj2));
    }

    public static Map A0o(Map map, int i) {
        return i != 0 ? AGH.A0E() : map;
    }

    public static ReentrantLock A0p(SessionController sessionController) {
        ReentrantLock reentrantLock = sessionController.lock;
        reentrantLock.lock();
        return reentrantLock;
    }

    public static G0V A0v(BFM bfm, Object obj) {
        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
        BPg.A02(bfm, obj, g0v);
        return g0v;
    }

    public static C9hr A14(F0C[] f0cArr, int i) {
        return AbstractC07749im.A00((C9hr) f0cArr[i].getValue());
    }

    public static C9hv A15(F0C[] f0cArr, int i) {
        return (C9hv) f0cArr[i].getValue();
    }

    public static void A17(HatchIdentityProvider hatchIdentityProvider, boolean z) {
        BLG<HatchChatThemesState> blg = hatchIdentityProvider._chatThemes;
        HatchChatThemesState value = blg.getValue();
        blg.Af8(value.copy(value.themes, value.selectedThemeId, value.hasFetched, z));
    }

    public static void A18(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 9);
        C7384Etj.A0Y(obj2, 10);
    }

    public static void A1J(AbstractC7349EnM abstractC7349EnM) {
        ((NativeLoginViewModel) abstractC7349EnM.receiver).onErrorDismissed();
    }

    public static boolean A1M(int i, boolean z) {
        if ((i & 64) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1N(int i, boolean z) {
        if ((i & 128) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1P(VoiceCallStateHolder voiceCallStateHolder) {
        return voiceCallStateHolder.isCallActive.getValue().booleanValue();
    }

    public static boolean A1Q(Object obj) {
        return "".equals(obj);
    }

    public static byte[] A1T(String str) {
        return MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(str.getBytes(DCl.A05));
    }

    public static C9hr[] A1V() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq)};
    }

    public static C9hr[] A1W() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static C9hr[] A1X() {
        return new C9hr[]{AbstractC07749im.A00(C07779iq.A01)};
    }

    public static C9hr[] A1Y(C9hr c9hr) {
        return new C9hr[]{c9hr, AbstractC07749im.A00(C07779iq.A01)};
    }

    public static long A04(long j) {
        return j - SystemClock.elapsedRealtime();
    }

    public static long A08(BLG blg) {
        return ((Number) blg.getValue()).longValue();
    }

    public static long A09(C1BN c1bn) {
        return ((Number) c1bn.getValue()).longValue();
    }

    public static AEs A0H(InterfaceC08439ui interfaceC08439ui, BOD bod, A6J a6j, C9uG c9uG) {
        return BON.A00(interfaceC08439ui, bod.getViewModelStore(), a6j).A02(c9uG);
    }

    public static AgentPermissionApprovalsUiState A0J(C1BO c1bo) {
        return (AgentPermissionApprovalsUiState) c1bo.getValue();
    }

    public static WalletSheetUiState A0K(C1BO c1bo) {
        return (WalletSheetUiState) c1bo.getValue();
    }

    public static HatchAgentPermissionsRepository.AgentPermissionApproval A0N(C1BO c1bo) {
        return (HatchAgentPermissionsRepository.AgentPermissionApproval) c1bo.getValue();
    }

    public static HatchGoalsTabViewModel.UiState A0O(C1BO c1bo) {
        return (HatchGoalsTabViewModel.UiState) c1bo.getValue();
    }

    public static GoalNode A0P(Object obj, Map map) {
        return (GoalNode) map.get(obj);
    }

    public static NativeLoginUiState A0Q(C1BO c1bo) {
        return (NativeLoginUiState) c1bo.getValue();
    }

    public static AiIdentity A0R(HatchGatewayConnection hatchGatewayConnection) {
        return hatchGatewayConnection.getAiIdentity().getValue();
    }

    public static BrowserTaskPresentation A0S(C1BO c1bo) {
        return (BrowserTaskPresentation) c1bo.getValue();
    }

    public static String A0a(HatchGatewayPrefsStore.Companion companion, AbstractC3358CGz abstractC3358CGz) {
        return HatcheryVMIdUtilsKt.extractHatcheryVMId(companion.getInstance(abstractC3358CGz).getGatewayUrl());
    }

    public static String A0f(C9jG c9jG, C9iZ c9iZ, C9j4 c9j4, int i) {
        return (String) c9j4.A8Z(c9jG, c9iZ, i);
    }

    public static String A0g(C9jG c9jG, C9iZ c9iZ, C9j4 c9j4, int i) {
        return (String) c9j4.A8Z(c9jG, c9iZ, i);
    }

    public static Map.Entry A0l(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static HxE A0q(HatchGatewayPrefsStore hatchGatewayPrefsStore, Object obj) {
        return new HxE(obj, HatcheryVMIdUtilsKt.extractHatcheryVMId(hatchGatewayPrefsStore.getGatewayUrl()));
    }

    public static HxE A0r(Object obj, boolean z) {
        return new HxE(obj, String.valueOf(z));
    }

    public static C78X A0t(C3UX c3ux) {
        return c3ux.AEA().get(HoC.A00);
    }

    public static HzC A0y(C78T c78t, C78T c78t2) {
        return Hxb.A02(c78t.plus(c78t2));
    }

    public static void A19(Object obj, Object obj2, Object obj3, int i) {
        C7384Etj.A0Y(obj, i);
        C7384Etj.A0Y(obj2, 41);
        C7384Etj.A0Y(obj3, 42);
    }

    public static void A1A(Object obj, C0924AIa c0924AIa, long j) {
        c0924AIa.put(obj, String.valueOf(j));
    }

    public static void A1B(String str, String str2, String str3, Throwable th) {
        CFK.A08(str3, FGI.A0M(str, str2), th);
    }

    public static void A1E(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, z);
    }

    public static void A1F(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("type", z);
    }

    public static void A1G(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("title", z);
    }

    public static void A1H(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08(AuraDeeplinkRouteMapper.STATUS_ROUTE, z);
    }

    public static void A1I(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("display_name", z);
    }

    public static boolean A1K() {
        return C7384Etj.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static boolean A1O(BFM bfm, Object obj, Object obj2, Object obj3) {
        return bfm.A65(obj) | bfm.A67(obj2) | bfm.A67(obj3);
    }

    public static boolean A1R(C1BN c1bn) {
        return ((Boolean) c1bn.getValue()).booleanValue();
    }

    public static byte[] A1S(Object obj, C9hv c9hv, C9sU c9sU) {
        return c9sU.A02(obj, c9hv).getBytes(DCl.A05);
    }

    public static C9hr[] A1Z(C9hr c9hr, C9hr c9hr2) {
        return new C9hr[]{c9hr2, AbstractC07749im.A00(c9hr)};
    }

    public static C9hr[] A1a(C9hr c9hr, C9hr c9hr2, C9hr c9hr3, C9hr c9hr4) {
        return new C9hr[]{c9hr2, c9hr3, c9hr4, AbstractC07749im.A00(c9hr)};
    }
}
