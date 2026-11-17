package X;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.hatch.browser.core.FfiConverterByteArray;
import com.hatch.browser.core.InternalException;
import com.hatch.browser.core.UniffiLib;
import com.hatch.browser.protocol.FfiConverterString;
import com.hatch.browser.protocol.FfiConverterTypeOperationId;
import com.meta.maps.fancypins.FancyPinOverlayView;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.intellij.markdown.MarkdownParsingException;

/* renamed from: X.F5v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7608F5v {
    public static FQY A0M(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return FQY.A00;
    }

    public static FQO A0N(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return FQO.A00;
    }

    public static FfiConverterByteArray A0U(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return FfiConverterByteArray.INSTANCE;
    }

    public static FfiConverterString A0W(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return FfiConverterString.INSTANCE;
    }

    public static FfiConverterTypeOperationId A0X(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return FfiConverterTypeOperationId.INSTANCE;
    }

    public static Object A0k(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 2);
        return obj2;
    }

    public static byte[] A1a(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C7384Etj.A0U(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int A02(int i) {
        return (527 + i) * 31;
    }

    public static int A03(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A04(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int A05(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int A0A(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        return i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static int A0C(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 8);
    }

    public static AccessibilityManager A0F(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static InvalidProtocolBufferException.InvalidWireTypeException A0G() {
        InvalidProtocolBufferException.InvalidWireTypeException invalidWireTypeException = new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
        invalidWireTypeException.unfinishedMessage = null;
        return invalidWireTypeException;
    }

    public static InvalidProtocolBufferException A0H() {
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        invalidProtocolBufferException.unfinishedMessage = null;
        return invalidProtocolBufferException;
    }

    public static C9076Fy3 A0I(double d) {
        C9143FzC c9143FzC = C9076Fy3.A02;
        return new C9076Fy3(EnumC9090FyH.A03, d);
    }

    public static Fy1 A0J(double d) {
        C9119Fyk c9119Fyk = Fy1.A02;
        return new Fy1(EnumC9152FzL.A02, d);
    }

    public static C9072Fxy A0K(double d) {
        C9120Fyl c9120Fyl = C9072Fxy.A02;
        return new C9072Fxy(EnumC9160FzT.A03, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SecureUri A0L(Object obj, C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return (SecureUri) c31u.getValue(obj, interfaceC7359EnWArr[i]);
    }

    public static C9598GRe A0P(Object obj) {
        C9598GRe c9598GRe = (C9598GRe) obj;
        C7384Etj.A0Y(c9598GRe, 0);
        return c9598GRe;
    }

    public static EnumC10073Gou A0Q(EnumC10073Gou enumC10073Gou) {
        if (enumC10073Gou == EnumC10073Gou.DEFAULT) {
            return null;
        }
        return enumC10073Gou;
    }

    public static AbstractC9870GjI A0R(AbstractC9901Gkh abstractC9901Gkh, Type type) {
        return abstractC9901Gkh._base._typeFactory.A09(type);
    }

    public static InternalException A0V() {
        return new InternalException("uniffiCloneHandle() called on NoHandle object");
    }

    public static FDW A0Y(FDW fdw) {
        return fdw.A0C(35);
    }

    public static HsM A0Z(FDW fdw) {
        return fdw.A0D(35);
    }

    public static HsM A0a(FDW fdw) {
        return fdw.A0D(36);
    }

    public static FancyPinOverlayView.RetiringHull A0b(FancyPinOverlayView fancyPinOverlayView, int i) {
        return fancyPinOverlayView.retiringHulls.get(i);
    }

    public static IllegalArgumentException A0d() {
        return new IllegalArgumentException("startTime must be before endTime.");
    }

    public static IllegalArgumentException A0e() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static IllegalStateException A0f() {
        return new IllegalStateException("FancyPin data controller is closed");
    }

    public static Object A0j(Hj6 hj6, int i) {
        Object obj = hj6.A01[i];
        obj.getClass();
        return obj;
    }

    public static RuntimeException A0l() {
        return new RuntimeException("invalid enum value, something is very wrong!!");
    }

    public static RuntimeException A0m(Throwable th) {
        return new RuntimeException("simplejni not available - unable to bootstrap rsys native code!", th);
    }

    public static RuntimeException A0n(Throwable th) {
        return new RuntimeException("invalid enum value, something is very wrong!!", th);
    }

    public static String A0o(FDW fdw) {
        return fdw.A0F(35);
    }

    public static String A0p(FDW fdw) {
        return fdw.A0F(36);
    }

    public static String A0q(FDW fdw) {
        return fdw.A0F(38);
    }

    public static String A0r(FDW fdw) {
        return fdw.A0F(40);
    }

    public static String A0s(FDW fdw) {
        return fdw.A0F(41);
    }

    public static String A0t(FDW fdw) {
        return fdw.A0F(42);
    }

    public static String A0u(FDW fdw) {
        return fdw.A0F(45);
    }

    public static String A0v(FDW fdw) {
        return fdw.A0F(46);
    }

    public static StringBuilder A0y(String str, char c) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c);
        return sb;
    }

    public static GeneralSecurityException A0z() {
        return new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    }

    public static GeneralSecurityException A10() {
        return new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public static LinkedHashMap A13(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Unit A18(long j) {
        UniffiLib.INSTANCE.ffi_hatch_browser_core_uniffi_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static MarkdownParsingException A19() {
        return new MarkdownParsingException("");
    }

    public static void A1B(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i & 63) | 128);
    }

    public static void A1C(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i & 63) | 128);
    }

    public static void A1F(AbstractC8150FWo abstractC8150FWo) {
        abstractC8150FWo.A05("dcp_flow", "purchase");
    }

    public static void A1K(Object obj, int i, int i2) {
        System.arraycopy(obj, i, obj, i + 1, i2 - i);
    }

    public static void A1L(String str) {
        AbstractC2159Azp.A0z(str, "%", "%%");
    }

    public static void A1U(Throwable th) {
        GNN.A07("BillingLogger", "Unable to log.", th);
    }

    public static boolean A1X(Object obj, Gt4 gt4) {
        return (gt4 instanceof Gt3 ? ((Gt3) gt4).A02.A03 : gt4.A07()).equals(obj);
    }

    public static boolean A1Z(C10316GuW c10316GuW) {
        return !c10316GuW.A0N.isEmpty();
    }

    public static float A00(View view, float f) {
        return f / view.getWidth();
    }

    public static float A01(View view, float f) {
        return f / view.getHeight();
    }

    public static int A06(int i, int i2, int i3) {
        return Math.max(i3, Math.max(i, i2));
    }

    public static int A07(long j) {
        return (int) (j & 65535);
    }

    public static int A08(ColorStateList colorStateList, int[] iArr) {
        return colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
    }

    public static int A09(View view, int i) {
        return View.combineMeasuredStates(i, view.getMeasuredState());
    }

    public static int A0B(FDW fdw, int i, int i2) {
        return FF3.A02(fdw.A0F(i), i2);
    }

    public static Application A0D() {
        C6979Edd.A00();
        return C4JM.A00();
    }

    public static Context A0E(View view) {
        Context context = view.getContext();
        C7384Etj.A0U(context);
        return context;
    }

    public static FJA A0O() {
        C6979Edd.A00();
        FJA fja = AuraBloksCorePlugins.TYPEFACE_CREATOR;
        C7384Etj.A0U(fja);
        return fja;
    }

    public static C6966EdO A0S(Number number) {
        int iIntValue = number.intValue();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putInt(iIntValue);
        return C6966EdO.A00(byteBufferAllocate.array());
    }

    public static C6966EdO A0T(Number number) {
        int iIntValue = number.intValue();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.putInt(iIntValue);
        return C6966EdO.A00(byteBufferAllocate.array());
    }

    public static CharSequence A0c(CharSequence charSequence, int i) {
        return charSequence.subSequence(i, charSequence.length());
    }

    public static Long A0g(Instant instant) {
        return Long.valueOf(instant.getEpochSecond());
    }

    public static Object A0h(AbstractC9901Gkh abstractC9901Gkh, Class cls) {
        return AbstractC9855Gj3.A03(cls, abstractC9901Gkh.A07());
    }

    public static Object A0i(FBB fbb, FDW fdw) {
        Object objA05 = FBA.A05(fbb, fdw);
        objA05.getClass();
        return objA05;
    }

    public static String A0w(Object obj) {
        return EQZ.A00(obj.getClass());
    }

    public static String A0x(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.remove(obj);
    }

    public static Instant A11(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        C7384Etj.A0U(instantOfEpochMilli);
        return instantOfEpochMilli;
    }

    public static ArrayList A12(String str) {
        return AbstractC0885AGm.A0x(str);
    }

    public static List A14(FDW fdw, int i) {
        List<FDW> listA0I = fdw.A0I(i);
        C7384Etj.A0U(listA0I);
        return listA0I;
    }

    public static List A15(FDW fdw, int i) {
        List listA0H = fdw.A0H(i);
        C7384Etj.A0U(listA0H);
        return listA0H;
    }

    public static Map A16(HxE hxE, HxE hxE2, HxE hxE3, HxE hxE4, HxE hxE5) {
        return AGH.A0D(hxE, hxE2, hxE3, hxE4, hxE5);
    }

    public static Set A17(AbstractMap abstractMap) {
        Set setKeySet = abstractMap.keySet();
        C7384Etj.A0U(setKeySet);
        return setKeySet;
    }

    public static void A1A(int i, List list) {
        list.add(Integer.valueOf(i));
    }

    public static void A1D(View view) {
        FWZ.A03(view.getContext(), view);
    }

    public static void A1E(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A1G(GraphQlCallInput graphQlCallInput, Object obj, String str) {
        C3341CFl.A00(graphQlCallInput.A04(), obj, str);
    }

    public static void A1H(PrintWriter printWriter, int i) {
        printWriter.print(Integer.toHexString(i));
    }

    public static void A1I(Class cls, Object obj, AbstractMap abstractMap) {
        abstractMap.put(cls.getName(), obj);
    }

    public static void A1J(Class cls, AbstractCollection abstractCollection) {
        abstractCollection.add(cls.getName());
    }

    public static void A1M(StringBuilder sb, char c) {
        sb.append(Character.toLowerCase(c));
    }

    public static void A1N(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(", metadata=");
    }

    public static void A1O(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", ");
    }

    public static void A1P(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", endTime=");
    }

    public static void A1Q(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", metadata=");
    }

    public static void A1R(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", zoneOffset=");
    }

    public static void A1S(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", endZoneOffset=");
    }

    public static void A1T(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", startZoneOffset=");
    }

    public static void A1V(AbstractMap abstractMap, Iterator it) {
        abstractMap.remove(it.next());
    }

    public static void A1W(List list, long j) {
        list.add(Long.valueOf(j));
    }

    public static boolean A1Y(AbstractCollection abstractCollection, int i) {
        return abstractCollection.contains(Integer.valueOf(i));
    }
}
