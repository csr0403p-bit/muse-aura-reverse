package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.analytics.hatch.authflow.HatchAuthFlowContext;
import com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaEntryPoint;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFailure;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.identity.provider.HatchChatThemesState;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.login.nativeflow.HatchAuthApi;
import com.facebook.aura.login.nativeflow.HatchCaaFailureClassificationKt;
import com.facebook.aura.login.nativeflow.HatchCaaRateLimit;
import com.facebook.aura.login.nativeflow.HatchCaaStage;
import com.facebook.aura.login.nativeflow.NativeLoginUiState;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.entries.AuraTransitionsKt;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthErrorKt;
import com.facebook.aura.network.hatchauth.HatchAuthException;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.3cG, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cG {
    public static float A00(BFM bfm, AuraTheme auraTheme) {
        return auraTheme.getDimensions(bfm, 6).gutterWidth;
    }

    public static BBI A07(Object obj) {
        BBI bbi = (BBI) obj;
        BBI.A0R(bbi, false);
        return bbi;
    }

    public static AuraNavKey A0H(AuraNavigator auraNavigator) {
        return auraNavigator.currentKey(true);
    }

    public static HatchAuthException A0J(AuraHttpResponse auraHttpResponse, HatchAuthError hatchAuthError, String str, Throwable th) {
        return new HatchAuthException(hatchAuthError, str, auraHttpResponse.code, null, th);
    }

    public static Map A0o(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return AuraTransitionsKt.pushTransitionMetadata;
    }

    public static C7354EnR A0y(Class cls, String str, String str2) {
        return new C7354EnR(cls, str, str2, 0);
    }

    public static C3Pi A11(C1BN c1bn) {
        return new C3Pi(null, c1bn);
    }

    public static Annotation[] A1T() {
        return new Annotation[0];
    }

    public static F0C[] A1X(Integer num, Function0 function0) {
        return new F0C[]{AbstractC5321DgF.A02(num, function0), null};
    }

    public static int A01(int i, int i2) {
        if ((i & 2) != 0) {
            return 0;
        }
        return i2;
    }

    public static int A02(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long A05(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Context A06() {
        return AuraAppContext.INSTANCE.requireContext();
    }

    public static ParcelableSnapshotMutableState A08(ATF atf, Object obj) {
        return new ParcelableSnapshotMutableState(atf, obj);
    }

    public static C1YD A0A(int i) {
        return new C1YD(i);
    }

    public static HatchCaaFailure A0B(HatchCaaFailure.Companion companion, String str, String str2) {
        return companion.clientSide(str, str2, HatchCaaAccountErrorType.SYSTEM_ERROR);
    }

    public static HatchCaaFailure A0C(HatchCaaStage hatchCaaStage, Throwable th) {
        return HatchCaaFailureClassificationKt.hatchCaaFailure(th, hatchCaaStage, HatchCaaRateLimit.PLATFORM_BUDGET);
    }

    public static HatchGatewayPrefsStore A0D(AbstractC3358CGz abstractC3358CGz) {
        return HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
    }

    public static HatchChatThemesState A0E(HatchIdentityProvider hatchIdentityProvider) {
        return hatchIdentityProvider._chatThemes.getValue();
    }

    public static NativeLoginUiState A0F(NativeLoginViewModel nativeLoginViewModel) {
        return nativeLoginViewModel._uiState.getValue();
    }

    public static HatchAuthError A0I(HatchProblemJson hatchProblemJson, AuraHttpResponse auraHttpResponse) {
        return HatchAuthErrorKt.hatchAuthErrorFrom(auraHttpResponse.code, hatchProblemJson);
    }

    public static VoiceCallStateHolder A0K(AbstractC3358CGz abstractC3358CGz) {
        return VoiceCallStateHolder.Companion.getInstance(abstractC3358CGz);
    }

    public static VoiceCallUiState A0L(SessionController sessionController) {
        return sessionController._callState.getValue();
    }

    public static VoiceAvatarTakeoverState A0M(BFM bfm) {
        return (VoiceAvatarTakeoverState) bfm.A6v(VoiceAvatarTakeoverKt.LocalVoiceAvatarTakeoverState);
    }

    public static C7491Exw A0N(long j) {
        return new C7491Exw(j);
    }

    public static File A0O(File file, String str) {
        return new File(file, str);
    }

    public static Boolean A0P(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static IllegalStateException A0Q(String str) {
        return new IllegalStateException(str);
    }

    public static Integer A0R(int i) {
        return new Integer(i);
    }

    public static Long A0S(long j) {
        return new Long(j);
    }

    public static Object A0T() {
        return new Object();
    }

    public static Object A0U(Object obj) {
        return obj != EnumC10460Hji.A02 ? Unit.INSTANCE : obj;
    }

    public static Object A0V(Object obj, Object obj2) {
        C9286GCn.A00(null, obj2, (C9286GCn) obj);
        return null;
    }

    public static Object A0W(Object obj, HtJ htJ) {
        return ((GBM) obj).A0E(htJ);
    }

    public static String A0X() {
        return HatchAuthApi.INSTANCE.deviceId();
    }

    public static String A0Y() {
        return HatchAuthFlowContext.INSTANCE.snapshot().waterfallId;
    }

    public static String A0Z(int i, String str) {
        return (i & 1) == 0 ? "" : str;
    }

    public static String A0b(AuraHttpResponse auraHttpResponse, String str) {
        return FGI.A0S(str, ": HTTP ", auraHttpResponse.code);
    }

    public static String A0c(VoiceCallStateHolder voiceCallStateHolder) {
        return voiceCallStateHolder.activeThreadId.getValue();
    }

    public static String A0d(Object obj, Object obj2) {
        String str = (String) obj;
        Hwg.A00(obj2);
        return str;
    }

    public static String A0e(String str, int i) {
        if (i != 0) {
            return null;
        }
        return str;
    }

    public static StringBuilder A0f(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return sb;
    }

    public static StringBuilder A0g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static ArrayList A0h() {
        return new ArrayList();
    }

    public static LinkedHashMap A0j() {
        return new LinkedHashMap();
    }

    public static LinkedHashSet A0k() {
        return new LinkedHashSet();
    }

    public static KotlinNothingValueException A0p() {
        return new KotlinNothingValueException();
    }

    public static NoWhenBranchMatchedException A0q() {
        return new NoWhenBranchMatchedException();
    }

    public static HxE A0r(Object obj, Object obj2) {
        return new HxE(obj, obj2);
    }

    public static C10571Hud A0s(Throwable th) {
        return new C10571Hud(th);
    }

    public static HsJ A0t(Object obj) {
        return new HsJ(obj);
    }

    public static C0924AIa A0u() {
        return new C0924AIa();
    }

    public static C78T A0v() {
        return AuraDispatchers.INSTANCE.m764default();
    }

    public static F3w A0w(Enum[] enumArr) {
        return new F3w(enumArr);
    }

    public static C0861A6i A0x(Class cls) {
        return new C0861A6i(cls);
    }

    public static C10543Hqv A0z() {
        return new C10543Hqv();
    }

    public static C9290GCr A12(Integer num, int i, int i2) {
        return new C9290GCr(num, i, i2);
    }

    public static C9286GCn A13() {
        return new C9286GCn(HwN.A01);
    }

    public static C9286GCn A14(Object obj) {
        return new C9286GCn(obj);
    }

    public static C9hr A15() {
        return AbstractC07749im.A00(C07779iq.A01);
    }

    public static C9hr A16(F0C[] f0cArr, int i) {
        return (C9hr) f0cArr[i].getValue();
    }

    public static UnknownFieldException A17(int i) {
        return new UnknownFieldException(i);
    }

    public static A64 A18() {
        return new A64(JsonElementSerializer.A00);
    }

    public static A64 A19(C9hr c9hr) {
        return new A64(c9hr);
    }

    public static C9tS A1A() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9tS(c07779iq, c07779iq);
    }

    public static C9dz A1B(Object obj, String str, Annotation[] annotationArr) {
        return new C9dz(obj, str, annotationArr);
    }

    public static C9iK A1C(String str, C9cd c9cd, int i) {
        return new C9iK(str, c9cd, i);
    }

    public static void A1D(BBb bBb, Object obj) {
        bBb.A06 = (G0V) obj;
    }

    public static void A1F(Object obj, Object obj2) {
        ((GBM) obj).A0R(obj2);
    }

    public static void A1I(C3Em c3Em) {
        c3Em.AhV(Unit.INSTANCE);
    }

    public static boolean A1J(int i, boolean z) {
        if ((i & 2) != 0) {
            return true;
        }
        return z;
    }

    public static boolean A1K(int i, boolean z) {
        if (i != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1L(Object obj) {
        return C7384Etj.areEqual(obj, C0881AGi.A00);
    }

    public static boolean A1N(Object obj) {
        return ((Collection) obj).isEmpty();
    }

    public static boolean A1O(Object obj, HxE hxE) {
        return C7384Etj.areEqual(hxE.first, obj);
    }

    public static boolean A1Q(C9iK c9iK) {
        c9iK.A08("id", true);
        return true;
    }

    public static boolean A1R(C9iK c9iK) {
        c9iK.A08("title", true);
        return true;
    }

    public static byte[] A1S(String str) {
        return str.getBytes(DCl.A05);
    }

    public static C9hr[] A1Y() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq};
    }

    public static C9hr[] A1Z() {
        return new C9hr[]{C07779iq.A01};
    }

    public static int A03(Iterable iterable, int i) {
        return AIW.A0H(Hr7.A1D(iterable, i));
    }

    public static long A04(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static BS0 A09(BFM bfm, int i) {
        bfm.AgE(i);
        return BRg.A00;
    }

    public static BrowserTaskPresentation A0G(C1BN c1bn) {
        return (BrowserTaskPresentation) c1bn.getValue();
    }

    public static String A0a(HatchGatewayPrefsStore hatchGatewayPrefsStore) {
        return HatcheryVMIdUtilsKt.extractHatcheryVMId(hatchGatewayPrefsStore.getGatewayUrl());
    }

    public static Iterator A0i(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static List A0l(C1BO c1bo) {
        return (List) c1bo.getValue();
    }

    public static List A0m(Iterable iterable) {
        return AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(iterable));
    }

    public static ListIterator A0n(List list) {
        return list.listIterator(list.size());
    }

    public static C10543Hqv A10(Object obj) {
        Hwg.A00(obj);
        return new C10543Hqv();
    }

    public static void A1E(HatchAuthFlowContext hatchAuthFlowContext, HatchCaaEntryPoint hatchCaaEntryPoint) {
        hatchAuthFlowContext.setEntryPoint(hatchCaaEntryPoint.getValue());
    }

    public static void A1G(String str, String str2, String str3) {
        CFK.A06(str3, FGI.A0M(str, str2));
    }

    public static void A1H(HzP hzP) {
        HzS.A05(hzP.getContext());
    }

    public static boolean A1M(Object obj) {
        return C7384Etj.areEqual(obj, AGH.A0E());
    }

    public static boolean A1P(Object obj, boolean z) {
        return C7384Etj.areEqual(obj, Boolean.valueOf(z));
    }

    public static F0C[] A1U(Integer num, F0C f0c, F0C f0c2, F0C f0c3, Function0 function0) {
        return new F0C[]{f0c, f0c2, f0c3, AbstractC5321DgF.A02(num, function0)};
    }

    public static F0C[] A1V(Integer num, F0C f0c, F0C f0c2, Function0 function0) {
        return new F0C[]{f0c, f0c2, AbstractC5321DgF.A02(num, function0)};
    }

    public static F0C[] A1W(Integer num, F0C f0c, Function0 function0) {
        return new F0C[]{f0c, AbstractC5321DgF.A02(num, function0)};
    }

    public static C9hr[] A1a(C9hr c9hr) {
        return new C9hr[]{AbstractC07749im.A00(c9hr)};
    }

    public static C9hr[] A1b(C9hr c9hr, C9hr c9hr2, C9hr c9hr3) {
        return new C9hr[]{c9hr2, c9hr3, AbstractC07749im.A00(c9hr)};
    }
}
