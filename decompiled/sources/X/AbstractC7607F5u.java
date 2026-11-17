package X;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.android.billingclient.v6;
import com.caverock.androidsvg.SVGParseException;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.reactions.AuraReactionHapticsKt;
import com.facebook.aura.devices.link.ordering.UsState;
import com.facebook.aura.gateway.connection.ConnectionPhase;
import com.facebook.aura.gateway.connection.ConnectionReducer;
import com.facebook.aura.gateway.connection.ConnectionState;
import com.facebook.aura.localbrowser.core.BrowserArg;
import com.facebook.aura.localbrowser.core.BrowserArgType;
import com.facebook.rendercore.RenderTreeNode;
import com.hatch.browser.core.BrowserCore;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.core.FfiConverterByteArray;
import com.hatch.browser.core.Page;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.FfiConverterOptionalString;
import com.hatch.browser.protocol.FfiConverterString;
import com.hatch.browser.protocol.RustBuffer;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7607F5u {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static float A01(float f, float f2, float f3) {
        return f2 + (f3 * (f - f2));
    }

    public static float A04(float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static float A05(float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static int A08(float f) {
        return (int) Math.ceil(f);
    }

    public static int A09(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A0B(int i, int i2) {
        return Math.abs(i - i2);
    }

    public static int A0D(int i, int i2, int i3) {
        return Math.max(i3, i - i2);
    }

    public static void A1S(float[] fArr, float f, float f2, float f3) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public static float[] A1Z(float f, float f2, int i) {
        float[] fArr = new float[i];
        fArr[0] = f;
        fArr[1] = f2;
        return fArr;
    }

    public static float A06(float[] fArr, float f, float f2, int i) {
        return f2 + (fArr[i] * f);
    }

    public static float A07(float[] fArr, float f, float f2, int i, int i2) {
        return (fArr[i] * f) + (fArr[i2] * f2);
    }

    public static int A0A(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int A0C(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A0G(Object obj) {
        return ((List) obj).size();
    }

    public static int A0K(char[] cArr, int i, int i2) {
        int i3 = i + 1;
        cArr[i] = (char) i2;
        return i3;
    }

    public static long A0M(RenderTreeNode renderTreeNode) {
        return renderTreeNode.A07.A0J();
    }

    public static long A0N(BrowserCore browserCore) {
        return browserCore.callCounter.decrementAndGet();
    }

    public static long A0O(BrowserCore browserCore) {
        return browserCore.callCounter.get();
    }

    public static long A0P(CommandReport commandReport) {
        return commandReport.callCounter.decrementAndGet();
    }

    public static long A0Q(Page page) {
        return page.callCounter.decrementAndGet();
    }

    public static Paint A0T() {
        return new Paint();
    }

    public static Paint A0U(int i) {
        return new Paint(i);
    }

    public static Path A0V() {
        return new Path();
    }

    public static PointF A0W(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static Rect A0X() {
        return new Rect();
    }

    public static RectF A0Y() {
        return new RectF();
    }

    public static TypedValue A0Z() {
        return new TypedValue();
    }

    public static C8345FcJ A0i(C8497Ff4 c8497Ff4) {
        return c8497Ff4.A00.A0D();
    }

    public static C8497Ff4 A0j(WindowInsets windowInsets) {
        C8497Ff4 c8497Ff4 = C8497Ff4.A01;
        windowInsets.getClass();
        return new C8497Ff4(windowInsets);
    }

    public static InvalidProtocolBufferException A0k(String str) {
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(str);
        invalidProtocolBufferException.unfinishedMessage = null;
        return invalidProtocolBufferException;
    }

    public static v6 A0q(String str) {
        return new v6(str);
    }

    public static SVGParseException A0r(String str) {
        return new SVGParseException(str);
    }

    public static EVS A0s(Eu1 eu1, int i) {
        return new EVS(eu1, i);
    }

    public static CountryDialCode A0t(String str, int i) {
        return new CountryDialCode(str, i);
    }

    public static UsState A0u(String str, String str2, String str3, int i) {
        return new UsState(str, i, str2, str3);
    }

    public static ConnectionReducer.Reduction A0v(ConnectionState connectionState, List list) {
        return new ConnectionReducer.Reduction(connectionState, list);
    }

    public static BrowserArg A0w(String str, BrowserArgType browserArgType, String str2, boolean z) {
        return new BrowserArg(str, browserArgType, str2, z);
    }

    public static UniffiRustCallStatus A0x() {
        return new UniffiRustCallStatus();
    }

    public static IllegalStateException A10(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static String A11(ByteBuffer byteBuffer) {
        return FfiConverterOptionalString.INSTANCE.read(byteBuffer);
    }

    public static String A12(ByteBuffer byteBuffer) {
        return FfiConverterString.INSTANCE.read(byteBuffer);
    }

    public static Iterator A13(Object obj) {
        return ((List) obj).iterator();
    }

    public static LinkedHashMap A14(Map map) {
        return new LinkedHashMap(map);
    }

    public static C5322DgG A1A(Object obj, Function0 function0) {
        return new C5322DgG(obj, function0);
    }

    public static C8890Ft7 A1B(Object obj, int i) {
        return new C8890Ft7(obj, i);
    }

    public static ADq A1C(int i, int i2) {
        return new ADq(i, i2);
    }

    public static void A1F() throws ClassNotFoundException {
        Class.forName("com.facebook.simplejni.CoreFunctions");
    }

    public static void A1G(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A1H(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A1I(Paint paint, AbstractC8724FjP abstractC8724FjP) {
        if (abstractC8724FjP != null) {
            paint.setColorFilter((ColorFilter) abstractC8724FjP.A06());
        }
    }

    public static void A1K(AbstractC6676EOt abstractC6676EOt, Object obj) {
        abstractC6676EOt.A01((AbstractC8150FWo) obj, "event_payload");
    }

    public static void A1L(AbstractC6676EOt abstractC6676EOt, String str) {
        abstractC6676EOt.A03("session_id", str);
    }

    public static void A1M(FDW fdw, Object obj, int i) {
        fdw.A06.put(i, obj);
    }

    public static void A1N(String str) {
        Log.v("FragmentManager", str);
    }

    public static void A1O(String str) {
        Log.d("FragmentManager", str);
    }

    public static void A1T(int[] iArr, int i, int i2) {
        iArr[i] = iArr[i] + i2;
    }

    public static boolean A1V(ConnectionState connectionState) {
        return C7384Etj.areEqual(connectionState.phase, ConnectionPhase.Connected.INSTANCE);
    }

    public static boolean A1W(AbstractC9916Gl7 abstractC9916Gl7) {
        return abstractC9916Gl7.A22(EnumC9834GiY.VALUE_NULL);
    }

    public static boolean A1X(String str) {
        return str.endsWith("%");
    }

    public static float A02(View view) {
        return view.getWidth();
    }

    public static float A03(View view) {
        return view.getHeight();
    }

    public static int A0E(View view, int i) {
        return i - view.getTop();
    }

    public static int A0F(View view, int i) {
        return i - view.getPaddingRight();
    }

    public static int A0H(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() - 1;
    }

    public static int A0I(AbstractCollection abstractCollection, int i) {
        return abstractCollection.size() - i;
    }

    public static int A0J(List list, int i) {
        return list.size() - i;
    }

    public static long A0L(int i) {
        return i & 1048575;
    }

    public static long A0R(FfiConverterString ffiConverterString, String str, long j) {
        return j + ffiConverterString.mo3323allocationSizeI7RO_PI(str);
    }

    public static Animator A0S(Iterator it) {
        return (Animator) it.next();
    }

    public static View A0a(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static View A0b(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        return decorView;
    }

    public static View A0c(Reference reference) {
        return (View) reference.get();
    }

    public static View A0d(AbstractList abstractList, int i) {
        return (View) abstractList.get(i);
    }

    public static ViewGroup.MarginLayoutParams A0e(View view) {
        return (ViewGroup.MarginLayoutParams) view.getLayoutParams();
    }

    public static ViewGroup A0f(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        LayoutInflaterFactory2C8250FaT.A0E(layoutInflaterFactory2C8250FaT);
        return (ViewGroup) layoutInflaterFactory2C8250FaT.A08.findViewById(R.id.content);
    }

    public static C8252FaX A0g(AbstractList abstractList, int i) {
        return (C8252FaX) abstractList.get(i);
    }

    public static C8128FUx A0h(View view) {
        return (C8128FUx) view.getLayoutParams();
    }

    public static C8542Ffv A0l(Iterator it) {
        return (C8542Ffv) it.next();
    }

    public static FTf A0m(View view) {
        return (FTf) view.getLayoutParams();
    }

    public static FTV A0n(AbstractList abstractList, int i) {
        return (FTV) abstractList.get(i);
    }

    public static AbstractC8429Fds A0o(AbstractList abstractList, int i) {
        return (AbstractC8429Fds) abstractList.get(i);
    }

    public static C6823Eab A0p(String str, String str2) {
        return C6823Eab.A00(str, str2);
    }

    public static FDW A0y(Iterator it) {
        return (FDW) it.next();
    }

    public static FDW A0z(List list, int i) {
        return (FDW) list.get(i);
    }

    public static List A15(FfiConverter ffiConverter, RustBuffer.ByValue byValue) {
        return (List) FfiConverter.CC.$default$liftFromRustBuffer(ffiConverter, byValue);
    }

    public static List A16(Integer num, Integer num2) {
        return Arrays.asList(num, num2);
    }

    public static Set A17(C7mC c7mC, C7mC c7mC2) {
        return BFI.A0H(new C7mC[]{c7mC, c7mC2});
    }

    public static Set A18(C7mC c7mC, C7mC c7mC2, C7mC c7mC3) {
        return BFI.A0H(new C7mC[]{c7mC, c7mC2, c7mC3});
    }

    public static Set A19(C7mC c7mC, C7mC c7mC2, C7mC c7mC3, C7mC c7mC4) {
        return BFI.A0H(new C7mC[]{c7mC, c7mC2, c7mC3, c7mC4});
    }

    public static G65 A1D(Iterator it) {
        return (G65) it.next();
    }

    public static Gt3 A1E(AbstractList abstractList, int i) {
        return (Gt3) abstractList.get(i);
    }

    public static void A1J(RectF rectF, Drawable drawable) {
        rectF.set(drawable.getBounds());
    }

    public static void A1P(String str, String str2, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void A1Q(String str, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i - i2);
    }

    public static void A1R(GCK gck) {
        if (gck.A07()) {
            gck.A02();
        }
    }

    public static void A1U(Object[] objArr, float f, float f2, int i, int i2) {
        objArr[i2] = AuraReactionHapticsKt.tap(i, f, f2);
    }

    public static byte[] A1Y(FfiConverterByteArray ffiConverterByteArray, RustBuffer.ByValue byValue) {
        return (byte[]) ffiConverterByteArray.lift(byValue);
    }

    public static int[] A1a(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        C7384Etj.A0U(iArrCopyOf);
        return iArrCopyOf;
    }
}
