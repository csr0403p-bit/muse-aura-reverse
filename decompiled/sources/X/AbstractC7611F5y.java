package X;

import android.R;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.Violation;
import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.localbrowser.ManagedBrowserDecoder;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.rendercore.text.RCTextView;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiForeignFutureCompleteRustBuffer;
import com.hatch.browser.core.UniffiForeignFutureResultRustBuffer;
import com.hatch.browser.core.UniffiLib;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.protocol.RustBuffer;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.fancypins.FancyPin;
import com.meta.maps.fancypins.FancyPinBlueprint;
import java.lang.reflect.Executable;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.F5y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7611F5y {
    public static double A01(int i, int i2) {
        return Math.sqrt(((i * i) / 4.0f) + ((i2 * i2) / 4.0f));
    }

    public static float A03(float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static int A05(int i) {
        return C79.A00(3).length + (i * C79.A00(4).length);
    }

    public static int A06(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static RustBuffer.ByValue A0O(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        C7384Etj.A0Y(uniffiRustCallStatus, 1);
        RustBuffer.ByValue byValueFfi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer = UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
        return com.hatch.browser.protocol.RustBuffer.Companion.m3725xc5044f11(byValueFfi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer.capacity, byValueFfi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer.len, byValueFfi_hatch_browser_core_uniffi_rust_future_complete_rust_buffer.data);
    }

    public static Boolean A0Q(AbstractC7349EnM abstractC7349EnM, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return Boolean.valueOf(((ManagedBrowserDecoder) abstractC7349EnM.receiver).identity(jsonElement));
    }

    public static Integer A0U(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, int i) {
        FDW fdwA0C = fdw.A0C(i);
        if (fdwA0C != null) {
            return Integer.valueOf(HlW.A00(fdwA0C, interfaceC10557Hsn, 0));
        }
        return null;
    }

    public static void A0e(Rect rect, RectF rectF, float f, float f2, float f3) {
        rectF.set(f + f2, rect.top + f3, rect.right - f3, rect.bottom - f3);
    }

    public static void A0f(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A0l(C8117FUh c8117FUh, float f, int i, int i2) {
        c8117FUh.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - c8117FUh.A0G.getTop());
    }

    public static void A0n(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, UniffiRustCallStatus.ByValue byValue, long j) {
        C7384Etj.A0Y(byValue, 2);
        uniffiForeignFutureCompleteRustBuffer.callback(j, new UniffiForeignFutureResultRustBuffer.UniffiByValue(new RustBuffer.ByValue(), byValue));
    }

    public static void A0q(Enum r1, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(r1, 0);
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putInt(r1.ordinal() + 1);
    }

    public static void A18(List list, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putInt(list.size());
    }

    public static byte A00(int i, long j) {
        return (byte) ((i >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int A04() {
        return Math.min(Math.max(12, 1), 1073741823);
    }

    public static int A07(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((255 & i3) << i4) | (i2 & ((255 << i4) ^ (-1)));
    }

    public static int A0A(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
        return (i & 7) + 48;
    }

    public static int A0E(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int A0F(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >>> 18) | 240);
        bArr[i + 1] = (byte) (((i2 >>> 12) & 63) | 128);
        int i3 = i + 3;
        bArr[i + 2] = (byte) (((i2 >>> 6) & 63) | 128);
        return i3;
    }

    public static int A0G(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >>> 12) | 480);
        int i3 = i + 2;
        bArr[i + 1] = (byte) (((i2 >>> 6) & 63) | 128);
        return i3;
    }

    public static long A0I(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static long A0J(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static long A0K(byte[] bArr, int i, long j) {
        return (j ^ (bArr[i] << 56)) ^ 71499008037633920L;
    }

    public static FancyPin A0P(FancyPin fancyPin) {
        String str = fancyPin.id;
        GeoCoordinates geoCoordinates = fancyPin.coordinates;
        GeoCoordinates geoCoordinates2 = new GeoCoordinates(geoCoordinates.latitude, geoCoordinates.longitude, geoCoordinates.altitude);
        String str2 = fancyPin.blueprintId;
        byte[] bArr = fancyPin.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C7384Etj.A0U(bArrCopyOf);
        return new FancyPin(str, geoCoordinates2, str2, bArrCopyOf, fancyPin.rank);
    }

    public static IllegalArgumentException A0R(int i) {
        StringBuilder sb = new StringBuilder("Length too large: ");
        sb.append(i);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0S(Object obj, int[] iArr, int i) {
        StringBuilder sb = new StringBuilder("Source subfield ");
        sb.append(iArr[i]);
        sb.append(" is present but null: ");
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0T(int i) {
        return (i & 1) != 0 ? C79.A00 : (i & 4) == 4 ? C79.A0C : C79.A01;
    }

    public static Integer A0V(Object obj, AbstractMap abstractMap) {
        abstractMap.put("dodgerblue", obj);
        abstractMap.put("firebrick", -5103070);
        abstractMap.put("floralwhite", -1296);
        abstractMap.put("forestgreen", -14513374);
        abstractMap.put("fuchsia", -65281);
        abstractMap.put("gainsboro", -2302756);
        abstractMap.put("ghostwhite", -460545);
        abstractMap.put("gold", -10496);
        abstractMap.put("goldenrod", -2448096);
        abstractMap.put("gray", -8355712);
        abstractMap.put("green", -16744448);
        abstractMap.put("greenyellow", -5374161);
        abstractMap.put("grey", -8355712);
        abstractMap.put("honeydew", -983056);
        return -65281;
    }

    public static String A0Y(String str) {
        return AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, "\\\\"), "'", "\\'"), PairsDiscretionDocument.TERMINATOR, "\\n"), "\r", "\\r"), "`", "\\`");
    }

    public static BigInteger A0Z(AbstractC9916Gl7 abstractC9916Gl7, String str) {
        boolean zA23 = abstractC9916Gl7.A23(EnumC10013Gnl.A01);
        Pattern pattern = HlV.A03;
        return zA23 ? AbstractC6760EYu.A00(str) : new BigInteger(str);
    }

    public static GeneralSecurityException A0a(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return new GeneralSecurityException(sb.toString());
    }

    public static G72 A0b(int i) {
        return i == 34 ? AbstractC9205G6l.A0B : i == 39 ? AbstractC9205G6l.A0Z : i == 40 ? AbstractC9205G6l.A0S : i == 41 ? AbstractC9205G6l.A0V : i == 91 ? AbstractC9205G6l.A0N : i == 93 ? AbstractC9205G6l.A0U : i == 60 ? AbstractC9205G6l.A0T : i == 62 ? AbstractC9205G6l.A0I : AbstractC9205G6l.A04;
    }

    public static void A0c(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public static void A0d(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static void A0j(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        if (layoutInflaterFactory2C8250FaT.A0L.getParent() instanceof View) {
            ((View) layoutInflaterFactory2C8250FaT.A0L.getParent()).requestApplyInsets();
        }
    }

    public static void A0m(AbstractC6676EOt abstractC6676EOt) {
        abstractC6676EOt.A00(EnumC7397Eua.ANDROID, "platform");
        abstractC6676EOt.A02("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A0r(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put("lightslategrey", obj);
        abstractMap.put("lightsteelblue", -5192482);
        abstractMap.put("lightyellow", -32);
        abstractMap.put("lime", -16711936);
        abstractMap.put("limegreen", -13447886);
        abstractMap.put("linen", -331546);
        abstractMap.put("magenta", obj2);
        abstractMap.put("maroon", -8388608);
        abstractMap.put("mediumaquamarine", -10039894);
        abstractMap.put("mediumblue", -16777011);
        abstractMap.put("mediumorchid", -4565549);
        abstractMap.put("mediumpurple", -7114533);
        abstractMap.put("mediumseagreen", -12799119);
        abstractMap.put("mediumslateblue", -8689426);
    }

    public static void A0s(Object obj, AbstractMap abstractMap) {
        abstractMap.put("cyan", obj);
        abstractMap.put("darkblue", -16777077);
        abstractMap.put("darkcyan", -16741493);
        abstractMap.put("darkgoldenrod", -4684277);
        abstractMap.put("darkgray", -5658199);
        abstractMap.put("darkgreen", -16751616);
        abstractMap.put("darkgrey", -5658199);
        abstractMap.put("darkkhaki", -4343957);
    }

    public static void A0t(Object obj, AbstractMap abstractMap) {
        abstractMap.put("darkmagenta", obj);
        abstractMap.put("darkolivegreen", -11179217);
        abstractMap.put("darkorange", -29696);
        abstractMap.put("darkorchid", -6737204);
        abstractMap.put("darkred", -7667712);
        abstractMap.put("darksalmon", -1468806);
        abstractMap.put("darkseagreen", -7357297);
        abstractMap.put("darkslateblue", -12042869);
        abstractMap.put("darkslategray", -13676721);
        abstractMap.put("darkslategrey", -13676721);
        abstractMap.put("darkturquoise", -16724271);
        abstractMap.put("darkviolet", -7077677);
        abstractMap.put("deeppink", -60269);
        abstractMap.put("deepskyblue", -16728065);
    }

    public static void A0v(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(", islandRsaPub=");
        sb.append(str);
        sb.append(", islandRsaPubSignature=");
        sb.append(str2);
        sb.append(", opaquePub=");
        sb.append(str3);
        sb.append(", opaquePubSignature=");
        sb.append(str4);
        sb.append(", islandEd25519Pub=");
    }

    public static void A0w(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(", base64urlEncodedIslandRsaPubSignature=");
        sb.append(str);
        sb.append(", base64urlEncodedIslandEd25519Pub=");
        sb.append(str2);
        sb.append(", base64urlEncodedIslandEd25519PubSignature=");
        sb.append(str3);
        sb.append(", base64urlEncodedOpaquePub=");
        sb.append(str4);
        sb.append(", base64urlEncodedOpaquePubSignature=");
    }

    public static void A0x(String str, StringBuilder sb, int i, boolean z, boolean z2) {
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", oncall=");
        sb.append(str);
        sb.append(", forwardToDebugLogs=");
        sb.append(z2);
        sb.append(", minLogLevel=");
        sb.append(i);
        sb.append(", bugReportFilename=");
    }

    public static void A0y(StringBuilder sb, String str, String str2, String str3) {
        sb.append(", name=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", bytes=");
        sb.append(str3);
    }

    public static void A0z(Executable executable, AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (Modifier.isPublic(executable.getModifiers()) && executable.getParameterTypes().length == 0) {
            if (executable.getName().startsWith("has")) {
                abstractMap.put(executable.getName(), executable);
            } else if (executable.getName().startsWith("get")) {
                abstractMap2.put(executable.getName(), executable);
            }
        }
    }

    public static void A12(AbstractMap abstractMap) {
        abstractMap.put("black", -16777216);
        abstractMap.put("blanchedalmond", -5171);
        abstractMap.put("blue", -16776961);
        abstractMap.put("blueviolet", -7722014);
        abstractMap.put("brown", -5952982);
        abstractMap.put("burlywood", -2180985);
        abstractMap.put("cadetblue", -10510688);
        abstractMap.put("chartreuse", -8388864);
        abstractMap.put("chocolate", -2987746);
        abstractMap.put("coral", -32944);
        abstractMap.put("cornflowerblue", -10185235);
        abstractMap.put("cornsilk", -1828);
        abstractMap.put("crimson", -2354116);
    }

    public static void A19(char[] cArr, int i, int i2, int i3, int i4) {
        int i5 = i2 | ((i & 63) << 6) | (i3 & 63);
        cArr[i4] = (char) ((i5 >>> 10) + 55232);
        cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
    }

    public static boolean A1A(FancyPinBlueprint fancyPinBlueprint, Object obj, AbstractMap abstractMap) {
        Map map = (Map) abstractMap.get(fancyPinBlueprint.id);
        return map != null && map.containsKey(obj);
    }

    public static float A02(RCTextView rCTextView, float f) {
        return Math.min((rCTextView.getWidth() - rCTextView.getPaddingRight()) - 1, Math.max(0.0f, f - rCTextView.getTotalPaddingLeft())) + rCTextView.getScrollX();
    }

    public static int A08(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return i + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public static int A09(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        return childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
    }

    public static int A0B(List list, int i, int i2) {
        return i2 + ((640 - (Long.numberOfLeadingZeros(((Number) list.get(i)).longValue()) * 9)) >>> 6);
    }

    public static int A0C(List list, int i, int i2) {
        return i2 + ((640 - (Long.numberOfLeadingZeros(((Number) list.get(i)).intValue()) * 9)) >>> 6);
    }

    public static int A0D(Map map, int i) {
        Number number = (Number) map.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static long A0H(List list, int i) {
        long jLongValue = ((Number) list.get(i)).longValue();
        return (jLongValue >> 63) ^ (jLongValue << 1);
    }

    public static MotionEvent A0L() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        return MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static X.C10601Hxz A0M(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public static HjM A0N(HjM hjM, DRt dRt, DRt dRt2, int i) {
        int iA01 = dRt.A01(i);
        if (iA01 == 0) {
            return null;
        }
        int i2 = iA01 + dRt.A00;
        int i3 = i2 + dRt.A01.getInt(i2);
        ByteBuffer byteBuffer = dRt.A01;
        dRt2.A00 = i3;
        dRt2.A01 = byteBuffer;
        return hjM;
    }

    public static Integer A0W(AbstractMap abstractMap) {
        abstractMap.put("aliceblue", -984833);
        abstractMap.put("antiquewhite", -332841);
        abstractMap.put("aqua", -16711681);
        abstractMap.put("aquamarine", -8388652);
        abstractMap.put("azure", -983041);
        abstractMap.put("beige", -657956);
        abstractMap.put("bisque", -6972);
        return -16711681;
    }

    public static Integer A0X(AbstractMap abstractMap) {
        abstractMap.put("lightgray", -2894893);
        abstractMap.put("lightgreen", -7278960);
        abstractMap.put("lightgrey", -2894893);
        abstractMap.put("lightpink", -18751);
        abstractMap.put("lightsalmon", -24454);
        abstractMap.put("lightseagreen", -14634326);
        abstractMap.put("lightskyblue", -7876870);
        abstractMap.put("lightslategray", -8943463);
        return -8943463;
    }

    public static void A0g(View view) {
        Context context = view.getContext();
        C7384Etj.A0Z(context, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getApplicationContext());
    }

    public static void A0h(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public static void A0i(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void A0k(Hi5 hi5, Violation violation, Object obj, Object obj2, Set set) {
        if (set.contains(obj) && AbstractC8519FfS.A03(hi5, obj2.getClass(), violation.getClass())) {
            AbstractC8519FfS.A01(hi5, violation);
        }
    }

    public static void A0o(Class cls, Object obj, StringBuilder sb) {
        sb.append(cls.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append(" number=");
    }

    public static void A0p(Enum r1, StringBuilder sb, int i) {
        sb.append(i);
        sb.append(" name=");
        sb.append(r1.name());
        sb.append('>');
    }

    public static void A0u(Object obj, Map map) {
        C8420Fdd c8420Fdd = (C8420Fdd) map.remove(obj);
        if (c8420Fdd != null) {
            c8420Fdd.A01.A05(c8420Fdd.A00);
            c8420Fdd.A00 = null;
        }
    }

    public static void A10(AbstractMap abstractMap) {
        abstractMap.put("hotpink", -38476);
        abstractMap.put("indianred", -3318692);
        abstractMap.put("indigo", -11861886);
        abstractMap.put("ivory", -16);
        abstractMap.put("khaki", -989556);
        abstractMap.put("lavender", -1644806);
        abstractMap.put("lavenderblush", -3851);
        abstractMap.put("lawngreen", -8586240);
        abstractMap.put("lemonchiffon", -1331);
        abstractMap.put("lightblue", -5383962);
        abstractMap.put("lightcoral", -1015680);
        abstractMap.put("lightcyan", -2031617);
        abstractMap.put("lightgoldenrodyellow", -329006);
    }

    public static void A11(AbstractMap abstractMap) {
        abstractMap.put("turquoise", -12525360);
        abstractMap.put("violet", -1146130);
        abstractMap.put("wheat", -663885);
        abstractMap.put("white", -1);
        abstractMap.put("whitesmoke", -657931);
        abstractMap.put("yellow", -256);
        abstractMap.put("yellowgreen", -6632142);
    }

    public static void A13(AbstractMap abstractMap) {
        abstractMap.put("slategray", -9404272);
        abstractMap.put("slategrey", -9404272);
        abstractMap.put("snow", -1286);
        abstractMap.put("springgreen", -16711809);
        abstractMap.put("steelblue", -12156236);
        abstractMap.put("tan", -2968436);
        abstractMap.put("teal", -16744320);
        abstractMap.put("thistle", -2572328);
        abstractMap.put("tomato", -40121);
    }

    public static void A14(AbstractMap abstractMap) {
        abstractMap.put("rebeccapurple", -10079335);
        abstractMap.put("red", -65536);
        abstractMap.put("rosybrown", -4419697);
        abstractMap.put("royalblue", -12490271);
        abstractMap.put("saddlebrown", -7650029);
        abstractMap.put("salmon", -360334);
        abstractMap.put("sandybrown", -744352);
        abstractMap.put("seagreen", -13726889);
        abstractMap.put("seashell", -2578);
        abstractMap.put("sienna", -6270419);
        abstractMap.put("silver", -4144960);
        abstractMap.put("skyblue", -7876885);
        abstractMap.put("slateblue", -9807155);
    }

    public static void A15(AbstractMap abstractMap) {
        abstractMap.put("orangered", -47872);
        abstractMap.put("orchid", -2461482);
        abstractMap.put("palegoldenrod", -1120086);
        abstractMap.put("palegreen", -6751336);
        abstractMap.put("paleturquoise", -5247250);
        abstractMap.put("palevioletred", -2396013);
        abstractMap.put("papayawhip", -4139);
        abstractMap.put("peachpuff", -9543);
        abstractMap.put("peru", -3308225);
        abstractMap.put("pink", -16181);
        abstractMap.put("plum", -2252579);
        abstractMap.put("powderblue", -5185306);
        abstractMap.put("purple", -8388480);
    }

    public static void A16(AbstractMap abstractMap) {
        abstractMap.put("mediumspringgreen", -16713062);
        abstractMap.put("mediumturquoise", -12004916);
        abstractMap.put("mediumvioletred", -3730043);
        abstractMap.put("midnightblue", -15132304);
        abstractMap.put("mintcream", -655366);
        abstractMap.put("mistyrose", -6943);
        abstractMap.put("moccasin", -6987);
        abstractMap.put("navajowhite", -8531);
        abstractMap.put("navy", -16777088);
        abstractMap.put("oldlace", -133658);
        abstractMap.put("olive", -8355840);
        abstractMap.put("olivedrab", -9728477);
        abstractMap.put("orange", -23296);
    }

    public static void A17(AbstractMap abstractMap, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        abstractMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), entry.getKey());
    }

    public static boolean A1B(Object obj, AbstractList abstractList) {
        int iIndexOf = abstractList.indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        abstractList.remove(iIndexOf);
        return true;
    }

    public static Object[] A1C(int i, int i2, int i3) {
        return new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
    }

    public static int[][] A1D() {
        return new int[][]{new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    }
}
