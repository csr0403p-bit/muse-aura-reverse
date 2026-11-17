package X;

import com.facebook.aura.agentpermission.RichApprovalSurface;
import com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaCore;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFailure;
import com.facebook.aura.assist.AssistOverlayMode;
import com.facebook.aura.assist.AssistOverlayPhase;
import com.facebook.aura.assist.AssistOverlayState;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmTransferFollower;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.aura.library.repo.GoalsStore;
import com.facebook.aura.localbrowser.LocalBrowserConnection;
import com.facebook.aura.localbrowser.LocalBrowserEndpointFailure;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler;
import com.facebook.aura.localbrowser.LocalBrowserSession;
import com.facebook.aura.localbrowser.LocalBrowserTask;
import com.facebook.aura.login.nativeflow.AuthSsoLinkedAccountJson;
import com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt;
import com.facebook.aura.login.nativeflow.HatchCaaStage;
import com.facebook.aura.login.nativeflow.HatchDisclosurePresentation;
import com.facebook.aura.login.nativeflow.HatchLandingPresentation;
import com.facebook.aura.login.nativeflow.NativeLoginErrorDialogContent;
import com.facebook.aura.login.nativeflow.NativeLoginRoutesKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.OverlaySceneStrategy;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthException;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.view.UpcomingScreenKt;
import com.facebook.aura.status.viewmodel.TaskCategory;
import com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$8$1$gestureModifier$1$1;
import com.facebook.aura.ui.ReorderableLazyListState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.3cJ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3cJ {
    public static LocalBrowserEndpointFailure A07() {
        C9jH c9jHA0E = AGH.A0E();
        return new LocalBrowserEndpointFailure("invalid_payload", true, null, null, c9jHA0E, c9jHA0E);
    }

    public static LocalBrowserEndpointFailure A08(boolean z) {
        C9jH c9jHA0E = AGH.A0E();
        return new LocalBrowserEndpointFailure("stale_connection", z, null, null, c9jHA0E, c9jHA0E);
    }

    public static String A0H(BFM bfm, Object obj, Object obj2, int i) {
        String strA02 = AbstractC2271BQs.A02(bfm, new Object[]{obj, obj2}, i);
        BBI.A0R((BBI) bfm, false);
        return strA02;
    }

    public static String A0K(Object obj) {
        return String.format("%02x", Arrays.copyOf(new Object[]{obj}, 1));
    }

    public static HxE A0S(BFM bfm, BBI bbi, Object obj, int i) {
        HxE hxE = new HxE(AbstractC2271BQs.A01(bfm, i), obj);
        BBI.A0R(bbi, false);
        return hxE;
    }

    public static C9iK A0V(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 6);
        c9iK.A08("refundable", true);
        c9iK.A08("free_cancellation", true);
        c9iK.A08("free_cancellation_until", true);
        c9iK.A08("policy_text", true);
        c9iK.A08("penalties", true);
        c9iK.A08(HatchWebPageParserKt.DESCRIPTION, true);
        return c9iK;
    }

    public static C9iK A0W(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 2);
        c9iK.A08(ConnectorOrderCheckoutKt.ITEMS_KEY, true);
        c9iK.A08("next_cursor", true);
        return c9iK;
    }

    public static short A0Y(ReorderableColumnKt$ReorderableColumn$8$1$gestureModifier$1$1.AnonymousClass1 anonymousClass1) {
        anonymousClass1.$draggedKey$delegate.Af8(null);
        anonymousClass1.$dragOffsetY$delegate.AdS(0.0f);
        anonymousClass1.$hoveredTargetIndex$delegate.AdX(-1);
        return (short) -1;
    }

    public static void A0Z(BFM bfm, int i) {
        bfm.AgE(i);
        AuraDividerKt.AuraRowDivider(C3U4.A0B(BRg.A00, AuraDimensKt.SpacingMedium, 0.0f), bfm, 0, 0);
    }

    public static void A0b(BFM bfm, TaskCategory taskCategory, Object obj, AHD ahd) {
        UpcomingScreenKt.TaskCategoryCard(taskCategory, ahd, (G0U) obj, null, bfm, 6, 8);
    }

    public static void A0d(ConfidentialVmSwitchOperation.AnonymousClass1 anonymousClass1, int i, int i2) {
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.I$0 = i;
        anonymousClass1.I$1 = i2;
    }

    public static void A0e(ConfidentialVmTransferFollower.C113281 c113281, int i) {
        c113281.L$0 = null;
        c113281.L$1 = null;
        c113281.L$2 = null;
        c113281.L$3 = null;
        c113281.L$4 = null;
        c113281.L$5 = null;
        c113281.L$6 = null;
        c113281.L$7 = null;
        c113281.I$0 = i;
    }

    public static void A0f(LocalBrowserEndpointNodeHandler.C124271 c124271, Object obj, Object obj2) {
        c124271.L$5 = null;
        c124271.L$6 = null;
        c124271.L$7 = null;
        c124271.L$8 = null;
        c124271.L$9 = obj;
        c124271.L$10 = obj2;
    }

    public static void A0l(String str, C9iK c9iK) {
        c9iK.A08(str, false);
        c9iK.A08("aymh_device_id", false);
        c9iK.A08("waterfall_id", true);
    }

    public static void A0m(String str, C9iK c9iK) {
        c9iK.A08(str, false);
        c9iK.A08("device_id", true);
        c9iK.A08("waterfall_id", true);
    }

    public static void A0n(String str, C9iK c9iK) {
        c9iK.A08(str, true);
        c9iK.A08("amount", true);
        c9iK.A08("currency", true);
    }

    public static void A0o(String str, C9iK c9iK) {
        c9iK.A08(str, true);
        c9iK.A08("display_label", true);
        c9iK.A08("linked_accounts", true);
    }

    public static void A0x(C9iK c9iK) {
        c9iK.A08("totals", true);
        c9iK.A08("legal_links", true);
        c9iK.A08("payment_method_label", true);
        c9iK.A08("card_brand", true);
        c9iK.A08("card_last4", true);
        c9iK.A08("payment_selection", true);
        c9iK.A08("payment_options", true);
    }

    public static boolean A0y(GoalsStore goalsStore, Object obj, BLG blg, int i) {
        return blg.A6e(obj, GoalsStore.copy$default(goalsStore, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, i, null));
    }

    public static C9hr[] A1B(F0C[] f0cArr) {
        return new C9hr[]{(C9hr) f0cArr[0].getValue()};
    }

    public static int A01(int i) {
        return (RichApprovalSurface.$stable << 3) | 1769856 | ((i >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i & 7168);
    }

    public static int A02(int i, int i2, int i3) {
        int i4 = i2 | (i << 3);
        int i5 = i3 << 3;
        return i4 | (i5 & 896) | (i5 & 7168);
    }

    public static int A04(Object obj, Object obj2) {
        return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
    }

    public static BRg A05(BRg bRg, float f, float f2) {
        return C3U4.A0C(bRg.then(C10G.A01), 0.0f, f2, 0.0f, f + f2);
    }

    public static HatchAuthError A09(Object obj) {
        HatchAuthException hatchAuthException;
        if (!(obj instanceof HatchAuthException) || (hatchAuthException = (HatchAuthException) obj) == null) {
            return null;
        }
        return hatchAuthException.error;
    }

    public static Integer A0B(ReorderableColumnKt$ReorderableColumn$8$1$gestureModifier$1$1.AnonymousClass1 anonymousClass1) {
        return new Integer(anonymousClass1.$currentItemKeys$delegate.getValue().indexOf(anonymousClass1.$itemKey));
    }

    public static Object A0E(C9iZ c9iZ, C9j4 c9j4, F0C[] f0cArr, int i) {
        return c9j4.A8a((C9jG) f0cArr[i].getValue(), c9iZ, i);
    }

    public static Object A0F(C9iZ c9iZ, C9j4 c9j4, F0C[] f0cArr, int i) {
        return c9j4.A8a((C9jG) f0cArr[i].getValue(), c9iZ, i);
    }

    public static Object A0G(C9iZ c9iZ, C9j4 c9j4, F0C[] f0cArr, int i) {
        return c9j4.A8Z((C9jG) f0cArr[i].getValue(), c9iZ, i);
    }

    public static String A0M(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public static Iterator A0O(ReorderableLazyListState reorderableLazyListState) {
        return ((C1161Act) reorderableLazyListState.listState.A04()).A0D.iterator();
    }

    public static List A0P(C9iZ c9iZ, C9j4 c9j4, F0C[] f0cArr, int i) {
        return (List) c9j4.A8a((C9jG) f0cArr[i].getValue(), c9iZ, i);
    }

    public static List A0Q(C9iZ c9iZ, C9j4 c9j4, F0C[] f0cArr, int i) {
        return (List) c9j4.A8a((C9jG) f0cArr[i].getValue(), c9iZ, i);
    }

    public static C78T A0T() {
        return C78W.A02(HwK.A00, AuraDispatchers.INSTANCE.io());
    }

    public static AHH A0U(Object obj, Object obj2) {
        AHF ahf = (AHF) obj;
        int iIndexOf = ahf.indexOf(obj2);
        return iIndexOf != -1 ? ahf.Aam(iIndexOf) : ahf;
    }

    public static C9iK A0X(String str, C9cd c9cd, int i) {
        C9iK c9iK = new C9iK(str, c9cd, i);
        c9iK.A08("approvalId", false);
        return c9iK;
    }

    public static void A0a(BFM bfm, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, AuraNavKey auraNavKey, Object obj) {
        NativeLoginRoutesKt.NativeLoginError(auraNavKey, nativeLoginErrorDialogContent, (Function0) ((InterfaceC7353EnQ) obj), bfm, (NativeLoginErrorDialogContent.$stable << 3) | 6);
    }

    public static void A0c(AbstractC8150FWo abstractC8150FWo, HatchCaaCore hatchCaaCore, String str) {
        abstractC8150FWo.A05("event", hatchCaaCore.event);
        abstractC8150FWo.A05("event_flow", hatchCaaCore.eventFlow);
        abstractC8150FWo.A05("event_step", hatchCaaCore.eventStep);
        abstractC8150FWo.A05("event_category", hatchCaaCore.eventCategory);
        abstractC8150FWo.A05("contactpoint", str);
        abstractC8150FWo.A05("waterfall_id", hatchCaaCore.waterfallId);
        abstractC8150FWo.A00.put("extra_client_data", hatchCaaCore.extraClientData);
    }

    public static void A0h(LocalBrowserTask localBrowserTask, C2nw c2nw) {
        C7qW.A06(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, localBrowserTask.id, c2nw);
        C7qW.A06("binding_id", localBrowserTask.bindingId, c2nw);
    }

    public static void A0i(EmbodimentVideoRenderer embodimentVideoRenderer, SessionController sessionController) {
        sessionController.connectionTracker.onEmbodimentRendererReleased(embodimentVideoRenderer.frameCount.get(), embodimentVideoRenderer.markerKey, embodimentVideoRenderer);
    }

    public static void A0j(SessionController$startCallInternal$job$1 sessionController$startCallInternal$job$1) {
        sessionController$startCallInternal$job$1.this$0.connectionTracker.onCallEnded(VoiceCallConnectionTracker.END_REASON_TEARDOWN, new Integer(sessionController$startCallInternal$job$1.$markerKey), null);
    }

    public static void A0k(Object obj, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(obj);
        sb.append(sb2.toString());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0w(C10543Hqv c10543Hqv) throws Exception {
        HatchNodeInvocationResult.Deferred deferred;
        T t = c10543Hqv.element;
        if (!(t instanceof HatchNodeInvocationResult.Deferred) || (deferred = (HatchNodeInvocationResult.Deferred) t) == null) {
            return;
        }
        deferred.close();
    }

    public static boolean A0z(SessionController sessionController, Object obj) {
        return C7384Etj.areEqual(sessionController.callMarker.getValue().callId, obj);
    }

    public static boolean A13(C9iK c9iK) {
        c9iK.A08("from", true);
        c9iK.A08("to", true);
        c9iK.A08("depart", true);
        c9iK.A08("arrive", true);
        c9iK.A08("duration", true);
        return true;
    }

    public static boolean A14(C9iK c9iK) {
        c9iK.A08("type", false);
        c9iK.A08("key", false);
        c9iK.A08("label", true);
        return false;
    }

    public static C9hr[] A16() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static C9hr[] A17() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static C9hr[] A18() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static C9hr[] A19() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
    }

    public static float A00(OverlaySceneStrategy overlaySceneStrategy, Iterator it) {
        BRL brl = (BRL) it.next();
        return ((Number) AGH.A00(brl.A00, overlaySceneStrategy.zIndices)).floatValue();
    }

    public static int A03(C0981AMm c0981AMm, Object obj) {
        Number number = (Number) c0981AMm.get(obj);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static HatchCaaFailure A06(HatchCaaFailure.Companion companion, HatchCaaStage hatchCaaStage) {
        return companion.clientSide("checkpointRequired", hatchCaaStage.getValue(), HatchCaaAccountErrorType.INTEGRITY_ERROR);
    }

    public static File A0A(File file, File file2) {
        String name = file.getName();
        UUID uuidRandomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(".");
        sb.append(uuidRandomUUID);
        sb.append(AuraPrefsStorage.TEMP_FILE_SUFFIX);
        return new File(file2, sb.toString());
    }

    public static Object A0C(Object obj, boolean z) {
        C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) obj);
        return null;
    }

    public static Object A0D(HtJ htJ, C78T c78t, G0V g0v) {
        Object objA00 = GAo.A00(htJ, c78t, g0v);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public static String A0I(BFM bfm, List list, int i, int i2) {
        return AbstractC2271BQs.A00(i, new Object[]{Integer.valueOf(list.size())}, bfm, i2);
    }

    public static String A0J(CharSequence charSequence) {
        return C7BY.A0F(charSequence).toString().toLowerCase(Locale.ROOT);
    }

    public static String A0L(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public static String A0N(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static Map A0R(Enum r1, Object obj) {
        return AIW.A0J(new HxE(obj, r1.name().toLowerCase(Locale.ROOT)));
    }

    public static void A0g(LocalBrowserSession localBrowserSession, Object obj, BLG blg) {
        blg.Af8(obj);
        LocalBrowserConnection localBrowserConnection = localBrowserSession.connection;
        if (localBrowserConnection != null) {
            localBrowserConnection.apply(localBrowserSession.mutableFacts.getValue());
        }
    }

    public static void A0p(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("city", z);
        c9iK.A08("state", z);
        c9iK.A08("postal_code", z);
        c9iK.A08("country", z);
    }

    public static void A0q(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((LocalBrowserTask) next).retired) {
            return;
        }
        abstractCollection.add(next);
    }

    public static void A0r(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((HatchDisclosurePresentation) it.next()).getWireValue());
    }

    public static void A0s(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((HatchLandingPresentation) it.next()).getWireValue());
    }

    public static void A0t(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(HatchAuthApiJsonKt.toDomain((AuthSsoLinkedAccountJson) it.next()));
    }

    public static void A0u(AbstractMap abstractMap, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        HxE hxE = new HxE(entry.getKey(), entry.getValue());
        abstractMap.put(hxE.first, hxE.second);
    }

    public static void A0v(Iterator it, C2nw c2nw) {
        Map.Entry entry = (Map.Entry) it.next();
        c2nw.A01((String) entry.getKey(), (JsonElement) entry.getValue());
    }

    public static boolean A10(BLG blg) {
        Object value = blg.getValue();
        AssistOverlayState assistOverlayState = (AssistOverlayState) value;
        return blg.A6e(value, assistOverlayState.copy(assistOverlayState.mode, AssistOverlayPhase.IDLE, assistOverlayState.errorMessage));
    }

    public static boolean A11(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, Integer.valueOf(((Number) value).intValue() + 1));
    }

    public static boolean A12(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, new AssistOverlayState(AssistOverlayMode.KEYBOARD, AssistOverlayPhase.IDLE, ((AssistOverlayState) value).errorMessage));
    }

    public static byte[] A15(Object obj) {
        String string = obj.toString();
        C7384Etj.A0Y(string, 0);
        return string.getBytes(DCl.A05);
    }

    public static C9hr[] A1A(C9hr c9hr, C9hr c9hr2, C9hr c9hr3, C9hr c9hr4, C9hr c9hr5) {
        return new C9hr[]{c9hr2, c9hr3, c9hr4, c9hr5, AbstractC07749im.A00(c9hr), AbstractC07749im.A00(c9hr), AbstractC07749im.A00(c9hr)};
    }
}
