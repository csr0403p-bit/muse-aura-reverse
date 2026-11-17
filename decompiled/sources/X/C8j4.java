package X;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.view.SeededRandom;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.browsertask.view.AgentComputerScreenKt;
import com.facebook.aura.common.ble.AuraBleLogger;
import com.facebook.aura.components.reactions.AuraReactionPalette;
import com.facebook.aura.devices.pairing.HatchDeviceBleListener;
import com.facebook.aura.devices.pairing.HatchDeviceBleManager;
import com.facebook.aura.devices.pairing.HatchDevicePairingLinkAction;
import com.facebook.aura.devices.pairing.HatchDevicePairingMachineState;
import com.facebook.aura.devices.pairing.HatchDevicePairingStep;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.devices.pairing.HatchLinkOtaRepairState;
import com.facebook.aura.localbrowser.LocalBrowserBlocklist;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareMediaCache;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8j4, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8j4 {
    public static int A07(int i, int i2) {
        return 8 - (((i - i2) ^ (-1)) >>> 31);
    }

    public static int A0D(Object obj, int i) {
        C7384Etj.A0Y(obj, 0);
        return ((i >> 3) & 14) | 48;
    }

    public static AbstractC1439Aj8 A0X(C0910AHm c0910AHm, AbstractC1439Aj8 abstractC1439Aj8) {
        if (abstractC1439Aj8 == null) {
            return abstractC1439Aj8;
        }
        c0910AHm.A0G(abstractC1439Aj8);
        return null;
    }

    public static C1805ArO A0e(ApQ apQ, long j) {
        return new C1805ArO(apQ, null, j);
    }

    public static HatchDevicePairingMachineState A0f(HatchDevicePairingLinkAction hatchDevicePairingLinkAction, HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState, HatchLinkOtaRepairState hatchLinkOtaRepairState) {
        return hatchDevicePairingMachineState.copy(hatchDevicePairingViewState, hatchDevicePairingLinkAction, hatchLinkOtaRepairState, hatchDevicePairingMachineState.setUpAgainAddress, hatchDevicePairingMachineState.autoSelectsSetUpAgain);
    }

    public static AuraBlock.Heading A0h(int i, AHD ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new AuraBlock.Heading(i, ahd);
    }

    public static Object A0p(List list) {
        return list.get(0);
    }

    public static Object A0q(List list) {
        return list.get(1);
    }

    public static void A1K(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, float f, long j) {
        at3.A9d(null, interfaceC1068ATy, C16a.A00, f, 3, j);
    }

    public static void A1M(HatchDeviceBleManager.C116021 c116021) {
        c116021.L$0 = null;
        c116021.L$1 = null;
        c116021.L$2 = null;
        c116021.L$3 = null;
    }

    public static void A1T(byte[] bArr) {
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
    }

    public static boolean A1U(int i) {
        return i == 1;
    }

    public static boolean A1V(int i, int i2) {
        return i > i2;
    }

    public static boolean A1X(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        c16z.A9O();
        return false;
    }

    public static boolean A1Z(Collection collection) {
        C7384Etj.A0Y(collection, 0);
        return collection.isEmpty();
    }

    public static float A00(long j, float f) {
        return Float.intBitsToFloat((int) (j >> 32)) * f;
    }

    public static float A01(BFM bfm) {
        return AuraTheme.INSTANCE.getDimensions(bfm, 6).gutterWidth;
    }

    public static int A05(int i) {
        return (i & 14) | ((i >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
    }

    public static int A0B(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A0C(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A0E(Object obj, int i) {
        return obj != null ? obj.hashCode() : i;
    }

    public static int A0F(Object obj, Object obj2) {
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Number) obj2).intValue();
    }

    public static long A0J(float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L);
    }

    public static long A0K(float f) {
        return Float.floatToRawIntBits(f) << 32;
    }

    public static long A0L(long j) {
        return j & (j - 1);
    }

    public static long A0M(long j) {
        return j & ((j ^ (-1)) << 6);
    }

    public static ANU A0S() {
        return ANR.A00(APu.A00, APt.A00);
    }

    public static C0910AHm A0W(C0910AHm c0910AHm) {
        return c0910AHm == null ? new C0910AHm(0, new AbstractC1439Aj8[16]) : c0910AHm;
    }

    public static B6A A0Y(long j) {
        return new B6A(j << 32);
    }

    public static InterfaceC1380AiA A0b(InterfaceC04981Yd interfaceC04981Yd, BFM bfm, C1AC c1ac) {
        return C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
    }

    public static AuraTypography A0l(BFM bfm) {
        return AuraTheme.INSTANCE.getTypography(bfm, 6);
    }

    public static AuraToolbarAgent.Config A0m(AuraToolbarAgent auraToolbarAgent) {
        return auraToolbarAgent.config.getValue();
    }

    public static Object A0o(BFM bfm, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        bfm.Ai0(c1710AotA00);
        return c1710AotA00;
    }

    public static Object A0s(G0V g0v, HtJ htJ) {
        return GAX.A01(htJ, g0v, 5000L);
    }

    public static String A0t(int i, String str) {
        if ((i & 2) == 0) {
            return null;
        }
        return str;
    }

    public static String A0w(String str, int i) {
        return FGI.A0G(str, ')', i);
    }

    public static String A0x(String str, String str2) {
        return FGI.A0N(str, str2, ')');
    }

    public static String A0y(String str, String str2, int i, int i2) {
        return FGI.A0Q(str, str2, ')', i, i2);
    }

    public static UnsupportedOperationException A10() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static Map.Entry A15(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C7384Etj.A0Y(entry, 0);
        return entry;
    }

    public static HxE A17(Object obj, long j) {
        return new HxE(obj, new B6A(j));
    }

    public static C10571Hud A19(String str) {
        return new C10571Hud(new IOException(str));
    }

    public static C10571Hud A1A(String str) {
        return new C10571Hud(new Exception(str));
    }

    public static void A1H(MutableState mutableState, long j) {
        mutableState.Af8(new Au3(j));
    }

    public static void A1N(LocalBrowserBlocklist.C124061 c124061, Object obj, Object obj2, Object obj3, Object obj4) {
        c124061.L$0 = obj;
        c124061.L$1 = obj2;
        c124061.L$2 = obj3;
        c124061.L$3 = obj4;
    }

    public static void A1P(String str, Mac mac, byte[] bArr) throws InvalidKeyException {
        mac.init(new SecretKeySpec(bArr, str));
    }

    public static void A1Q(StringBuilder sb, int i) {
        sb.append(", version=");
        sb.append(i);
    }

    public static Object[] A1a(Object[] objArr, int i) {
        Object obj = objArr[i];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) obj;
    }

    public static Object[] A1b(Object[] objArr, int i) {
        Object obj = objArr[i];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) obj;
    }

    public static float A02(SeededRandom seededRandom, float f, float f2) {
        return f2 + (seededRandom.unit() * (f - f2));
    }

    public static float A03(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A04(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A06(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A08(int i, int i2, long j) {
        return ((Long.numberOfTrailingZeros(j) >> 3) + i) & i2;
    }

    public static int A09(int i, BFM bfm, int i2) {
        bfm.AgE(i);
        return (i2 & 14) | ((i2 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
    }

    public static int A0A(int i, BFM bfm, int i2) {
        bfm.AgE(i);
        return (i2 & 14) | ((i2 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
    }

    public static int A0G(AbstractCollection abstractCollection, List list, int i) {
        abstractCollection.add(list.get(i));
        return i + 1;
    }

    public static int A0H(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static int A0I(Function0 function0) {
        return ((Number) function0.invoke()).intValue();
    }

    public static long A0N(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() << 32;
    }

    public static long A0O(MutableState mutableState) {
        return ((C1805ArO) mutableState.getValue()).A00;
    }

    public static long A0P(List list, int i) {
        return ((B6A) list.get(i)).A00;
    }

    public static long A0Q(Function0 function0) {
        return ((Number) function0.invoke()).longValue();
    }

    public static Canvas A0R(Bitmap bitmap) {
        C7384Etj.A0U(bitmap);
        return new Canvas(bitmap);
    }

    public static InterfaceC1153Acj A0T(MutableState mutableState) {
        return (InterfaceC1153Acj) mutableState.getValue();
    }

    public static Ad2 A0U(MutableState mutableState) {
        return (Ad2) ((Ae5) mutableState.getValue());
    }

    public static C1133Abh A0V(MutableState mutableState) {
        return (C1133Abh) ((AZ2) mutableState.getValue());
    }

    public static C1298Agj A0Z(List list, int i) {
        return (C1298Agj) list.get(i);
    }

    public static C3Tr A0a(List list, int i) {
        return (C3Tr) list.get(i);
    }

    public static C1733ApU A0c(List list, int i) {
        return (C1733ApU) list.get(i);
    }

    public static C1805ArO A0d(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }

    public static HatchDevicePairingStep A0g(C1BO c1bo) {
        return ((HatchDevicePairingViewState) c1bo.getValue()).getPairingStep();
    }

    public static AuraBlock A0i(Iterator it) {
        return (AuraBlock) it.next();
    }

    public static AuraInline A0j(Iterator it) {
        return (AuraInline) it.next();
    }

    public static HatchShareMediaCache A0k(Context context) {
        C7384Etj.A0X(context);
        return new HatchShareMediaCache(context);
    }

    public static Object A0n(View view) {
        return view.getContext().getSystemService("input_method");
    }

    public static Object A0r(G0U g0u, int i) {
        return g0u.invoke(Integer.valueOf(i));
    }

    public static String A0u(BluetoothDevice bluetoothDevice) {
        String address = bluetoothDevice.getAddress();
        C7384Etj.A0U(address);
        return address;
    }

    public static String A0v(Context context, HatchFileProviderUtil hatchFileProviderUtil, File file) {
        C7384Etj.A0X(context);
        return hatchFileProviderUtil.getUriForFile(context, file).toString();
    }

    public static String A0z(Iterator it) {
        return ((VoiceOption) it.next()).id;
    }

    public static Iterator A11(Iterator it) {
        return ((List) it.next()).iterator();
    }

    public static List A12(Float f, Float f2, Float f3) {
        return Arrays.asList(f, f2, f3);
    }

    public static List A13(Float f, Float f2, Float f3, Float f4) {
        return Arrays.asList(f, f2, f3, f4);
    }

    public static List A14(Float f, Float f2, Float f3, Float f4, Float f5) {
        return Arrays.asList(f, f2, f3, f4, f5);
    }

    public static HxE A16(Object obj, char c) {
        return new HxE(obj, Character.valueOf(c));
    }

    public static C10571Hud A18(AuraBleLogger auraBleLogger, String str, String str2, Throwable th) {
        auraBleLogger.error(FGI.A0M(str, str2), th);
        return new C10571Hud(th);
    }

    public static Unit A1B(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    public static AHD A1C(BFM bfm, String str, int i) {
        bfm.AgE(i);
        return AuraReactionPalette.INSTANCE.colorsFor(str);
    }

    public static AHD A1D(C1BO c1bo) {
        return ((AuraBuyCreditsViewModel.UiState) c1bo.getValue()).products;
    }

    public static AHD A1E(Iterator it) {
        return ((ListItem) it.next()).children;
    }

    public static AHD A1F(Iterator it) {
        return ((TableCell) it.next()).children;
    }

    public static void A1G(Canvas canvas, Layout layout, float f, float f2) {
        canvas.translate(f, f2);
        layout.draw(canvas);
        canvas.restore();
    }

    public static void A1I(C1BO c1bo, HatchComponent hatchComponent) {
        AgentComputerScreenKt.logBrowserOverlayClick(hatchComponent, (String) c1bo.getValue());
    }

    public static void A1J(C1BO c1bo, Object obj) {
        ((G0U) c1bo.getValue()).invoke(obj);
    }

    public static void A1L(HatchDeviceBleListener hatchDeviceBleListener, String str, String str2) {
        hatchDeviceBleListener.onDebugLog(FGI.A0M(str, str2));
    }

    public static void A1O(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1R(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((Object) null);
    }

    public static void A1S(boolean z, Object obj) {
        ((GBM) obj).A0R(Boolean.valueOf(z));
    }

    public static boolean A1W(C1BO c1bo) {
        return ((HatchDevicePairingViewState) c1bo.getValue()).getShowPairingFlow();
    }

    public static boolean A1Y(Object obj, List list, int i) {
        return C7384Etj.areEqual(list.get(i), obj);
    }
}
