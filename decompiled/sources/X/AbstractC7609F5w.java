package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import com.facebook.aura.localbrowser.ManagedBrowserDecoder;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.base.Throwables;
import com.hatch.browser.core.BrowserHostFilesImpl;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.Page;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.UniffiCleaner;
import com.hatch.browser.core.UniffiLib;
import com.hatch.browser.core.UniffiRustCallStatus;
import com.hatch.browser.core.UniffiRustFutureContinuationCallback;
import com.hatch.browser.protocol.RustBuffer;
import com.hatch.browser.protocol.UniffiRustCallStatus;
import com.meta.maps.fancypins.FancyPin;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.F5w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7609F5w {
    public static byte A00(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return byteBuffer.get();
    }

    public static int A0C(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        return i + i2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int A0F(Enum r2) {
        return 1 << r2.ordinal();
    }

    public static int A0G(Number number) {
        C7384Etj.A0Y(number, 0);
        return number.intValue();
    }

    public static int A0H(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return byteBuffer.getInt();
    }

    public static long A0L(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static long A0M(long j, long j2) {
        return j + j2 + 4;
    }

    public static long A0N(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return byteBuffer.getLong();
    }

    public static ManagedBrowserDecoder A0Z(Object obj, AbstractC7349EnM abstractC7349EnM) {
        C7384Etj.A0Y(obj, 0);
        return (ManagedBrowserDecoder) abstractC7349EnM.receiver;
    }

    public static NullPointerException A0n(List list) {
        list.get(0);
        return new NullPointerException("getExtension");
    }

    public static Object A0p(FfiConverter ffiConverter, RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        return ffiConverter.liftFromRustBuffer(byValue);
    }

    public static Object A0q(com.hatch.browser.protocol.FfiConverter ffiConverter, RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 1);
        return ffiConverter.liftFromRustBuffer(byValue);
    }

    public static void A13(int i, Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C7384Etj.A0Y(obj2, i);
    }

    public static void A14(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        C7384Etj.A0Y(uniffiRustFutureContinuationCallback, 1);
        UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
    }

    public static void A15(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    public static void A1F(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 27, 24);
    }

    public static void A1G(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 1);
        C7384Etj.A0Y(obj2, 2);
    }

    public static void A1S(float[] fArr, float f) {
        fArr[6] = f;
        fArr[7] = f;
    }

    public static void A1T(float[] fArr, float f, float f2) {
        fArr[3] = f;
        fArr[4] = f2;
    }

    public static boolean A1U(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean A1W(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 1);
        return HqY.A01(obj2, obj);
    }

    public static double A01(Fy1 fy1) {
        return fy1.A00 * fy1.A01.A00();
    }

    public static float A02(float f, float f2, float f3, int i) {
        return i != 0 ? (f * f2) / 100.0f : f3;
    }

    public static int A04(int i) {
        return Math.max(i * 2, 8);
    }

    public static int A06(int i) {
        return i != 0 ? 0 : 8;
    }

    public static int A07(int i, int i2) {
        return ((i << 28) + (i2 + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)) >> 30;
    }

    public static int A0E(FTV ftv) {
        int i = ftv.A05;
        return i == -1 ? ftv.A04 : i;
    }

    public static int A0I(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static int A0J(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }

    public static long A0K(int i, long j) {
        if ((i & 1) != 0) {
            return 0L;
        }
        return j;
    }

    public static long A0P(int[] iArr, int i) {
        return iArr[i + 1] & 1048575;
    }

    public static long A0Q(int[] iArr, int i) {
        return iArr[i + 2] & 1048575;
    }

    public static InterfaceC9366GGc A0T(Object obj) {
        return GGS.A02.A00(obj.getClass());
    }

    public static InvalidProtocolBufferException A0U(String str) {
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(str);
        invalidProtocolBufferException.unfinishedMessage = null;
        return invalidProtocolBufferException;
    }

    public static GG0 A0V(Object obj) {
        return C9359GFs.A02.A00(obj.getClass());
    }

    public static androidx.health.platform.client.proto.InvalidProtocolBufferException A0W(String str) {
        androidx.health.platform.client.proto.InvalidProtocolBufferException invalidProtocolBufferException = new androidx.health.platform.client.proto.InvalidProtocolBufferException(str);
        invalidProtocolBufferException.unfinishedMessage = null;
        return invalidProtocolBufferException;
    }

    public static GF4 A0X(Object obj) {
        return GFJ.A02.A00(obj.getClass());
    }

    public static GIK A0Y(Object obj) {
        return GIL.A02.A00(obj.getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JsonSerializer A0b(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9842Gii abstractC9842Gii, int i) {
        return i != 0 ? ((InterfaceC9833GiW) jsonSerializer).A7f(interfaceC10017Gnp, abstractC9842Gii) : jsonSerializer;
    }

    public static com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException A0c(String str) {
        com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException invalidProtocolBufferException = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException(str);
        invalidProtocolBufferException.unfinishedMessage = null;
        return invalidProtocolBufferException;
    }

    public static GHV A0d(Object obj) {
        return GHP.A02.A00(obj.getClass());
    }

    public static UniffiCleaner A0e() {
        return (UniffiCleaner) UniffiLib.CLEANER$delegate.getValue();
    }

    public static UniffiRustCallStatus.ByValue A0f(UniffiRustCallStatus.ByValue byValue, int i) {
        return (i & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue;
    }

    public static UniffiRustCallStatus.ByValue A0g(UniffiRustCallStatus.ByValue byValue, int i) {
        return (i & 2) != 0 ? new UniffiRustCallStatus.ByValue() : byValue;
    }

    public static FDW A0h(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return (FDW) obj;
    }

    public static Double A0k() {
        return Double.valueOf(0.0d);
    }

    public static Long A0l() {
        return new Long(60L);
    }

    public static Object A0o(Context context) {
        Object systemService = context.getSystemService("audio");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return systemService;
    }

    public static String A0r(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return (String) obj;
    }

    public static String A0s(String str) {
        return str == null ? "[null]" : AbstractC9855Gj3.A09(str);
    }

    public static StringBuilder A0t() {
        return Gt5.A03.A00();
    }

    public static StringBuilder A0u(Object obj) {
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(obj);
        return sb;
    }

    public static ArrayList A0x(ArrayList arrayList) {
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public static Calendar A0y() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        return calendar;
    }

    public static HashMap A0z(Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        map3.putAll(map2);
        return map3;
    }

    public static List A10(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return (List) obj;
    }

    public static AtomicLong A11() {
        return new AtomicLong(1L);
    }

    public static void A16(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static void A18(Parcel parcel, String str, int i) {
        parcel.writeInt(i);
        parcel.writeString("com.facebook.aura");
        parcel.writeString(str);
    }

    public static void A1B(AbstractC9901Gkh abstractC9901Gkh, Member member) {
        AbstractC9855Gj3.A0H(member, abstractC9901Gkh.A09(EnumC9951GmA.A0L));
    }

    public static void A1D(BrowserHostFilesImpl browserHostFilesImpl, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = browserHostFilesImpl.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1E(Page page, int i) {
        UniffiCleaner.Cleanable cleanable;
        if (i != 0 || (cleanable = page.cleanable) == null) {
            return;
        }
        cleanable.clean();
    }

    public static void A1M(StringBuilder sb, Object obj) {
        sb.append(", scope=");
        sb.append(obj);
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        Log.v("FragmentManager", sb.toString());
    }

    public static void A1O(Throwable th) {
        Throwables.propagateIfPossible(th, IOException.class);
        Throwables.propagate(th);
        throw F60.createAndThrow();
    }

    public static void A1P(Charset charset, List list, byte[] bArr, int i, int i2) {
        list.add(new String(bArr, i, i2, charset));
    }

    public static boolean A1V(Class cls, Object obj) {
        return C7384Etj.areEqual(obj, new C0861A6i(cls));
    }

    public static float A03(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static int A05(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int A08(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int A09(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A0A(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A0B(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A0D(EditText editText) {
        return editText.getText().length();
    }

    public static long A0O(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static TypedArray A0R(Resources.Theme theme, int i) {
        return theme.obtainStyledAttributes(new int[]{i});
    }

    public static DisplayMetrics A0S(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static UserFlowLogger A0a() {
        return (UserFlowLogger) C5246DeB.A00(65546);
    }

    public static FDW A0i(Iterator it) {
        FDW fdw = (FDW) it.next();
        C7384Etj.A0X(fdw);
        return fdw;
    }

    public static ArrayIndexOutOfBoundsException A0j(String str, Object[] objArr) {
        return new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static NullPointerException A0m(Iterator it) {
        it.next();
        return new NullPointerException("getEvents");
    }

    public static GeneralSecurityException A0v(String str, Object[] objArr) {
        return new GeneralSecurityException(String.format(str, objArr));
    }

    public static InvalidAlgorithmParameterException A0w(String str, Object[] objArr) {
        return new InvalidAlgorithmParameterException(String.format(str, objArr));
    }

    public static Gt4 A12(Gt4 gt4, int i) {
        return gt4.A0C().get(i);
    }

    public static void A17(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            creator.createFromParcel(parcel);
        }
    }

    public static void A19(GraphQlCallInput graphQlCallInput, GraphQlCallInput graphQlCallInput2, String str) {
        graphQlCallInput.A04().A0E(graphQlCallInput2.A04(), str);
    }

    public static void A1A(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2) {
        lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str);
    }

    public static void A1C(Hna hna, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        hna.A00(Collections.unmodifiableMap(abstractMap));
    }

    public static void A1H(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
    }

    public static void A1I(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj);
        sb2.append(sb.toString());
    }

    public static void A1J(StringBuilder sb, double d) {
        sb.append(d);
        sb.append(' ');
    }

    public static void A1K(StringBuilder sb, Object obj) {
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1L(StringBuilder sb, Object obj) {
        sb.append(obj.getClass().getSimpleName());
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((FancyPin) it.next()).id);
    }

    public static void A1R(AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (abstractMap.isEmpty()) {
            return;
        }
        abstractMap2.putAll(abstractMap);
    }

    public static boolean A1X(String str, Gt4 gt4) {
        return !Gt5.A08(gt4.A0B(str));
    }

    public static boolean A1Y(Executable executable) {
        return Modifier.isStatic(executable.getModifiers());
    }

    public static boolean A1Z(List list, int i) {
        return ((Boolean) list.get(i)).booleanValue();
    }

    public static boolean A1a(F0C f0c) {
        return ((Boolean) f0c.getValue()).booleanValue();
    }

    public static Object[] A1b(Class cls, Object obj) {
        return new Object[]{obj, cls.getName()};
    }
}
