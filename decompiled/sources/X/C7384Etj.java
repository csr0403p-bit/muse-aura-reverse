package X;

import android.graphics.Bitmap;
import android.os.Message;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import kotlin.UninitializedPropertyAccessException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Etj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7384Etj {
    public static int A02(Message message) {
        A0Y(message, 0);
        return message.what;
    }

    public static int A03(Parcel parcel) {
        A0Y(parcel, 0);
        return parcel.readInt();
    }

    public static int A04(BWU bwu, String str, int i) {
        A0Y(str, 0);
        int iA01 = BYg.A01(bwu, str, "none", true);
        return iA01 > 0 ? iA01 : i;
    }

    public static Bitmap A07(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public static CXB A08(CXB cxb) {
        A0Y(cxb, 0);
        return cxb instanceof DDj ? cxb : new C4892DDl(cxb);
    }

    public static String A0H(Object obj) {
        A0Y(obj, 0);
        return AbstractC7535F0i.A00().toString();
    }

    public static int A00(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int A01(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static EJV A09(Object obj) {
        EJV ejv = (EJV) obj;
        A0Y(ejv, 2);
        return ejv;
    }

    public static A7O A0A(Object obj) {
        A7O a7o = (A7O) obj;
        A0Y(a7o, 0);
        return a7o;
    }

    public static HsM A0B(Object[] objArr, int i) {
        Object obj = objArr[i];
        obj.getClass();
        HsM hsM = (HsM) obj;
        A0U(hsM);
        return hsM;
    }

    public static void A0P() {
        throw C8j3.A18("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void A0Q() {
        throw C8j3.A18("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void A0R(Object obj) {
        if (obj == null) {
            A0a("ARRAY_ELEMENT");
            throw F60.createAndThrow();
        }
    }

    public static void A0S(Object obj) {
        if (obj == null) {
            A0a("CHECK_CAST");
            throw F60.createAndThrow();
        }
    }

    public static void A0T(Object obj) {
        if (obj == null) {
            A0a("INSTANCE_FIELD");
            throw F60.createAndThrow();
        }
    }

    public static void A0U(Object obj) {
        if (obj == null) {
            A0a("INVOKE_RETURN");
            throw F60.createAndThrow();
        }
    }

    public static void A0V(Object obj) {
        if (obj == null) {
            A0a("STATIC_FIELD");
            throw F60.createAndThrow();
        }
    }

    public static void A0W(Object obj) {
        if (obj == null) {
            A0a("UNKNOWN");
            throw F60.createAndThrow();
        }
    }

    public static void A0X(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A0c(nullPointerException, C7384Etj.class.getName());
            throw nullPointerException;
        }
    }

    public static void A0Y(Object obj, int i) {
        if (obj == null) {
            String strA0M = FGI.A0M("param at index = ", Integer.toString(i));
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = C7384Etj.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException(FGI.A0j("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ", strA0M));
            A0c(nullPointerException, name);
            throw nullPointerException;
        }
    }

    public static void A0Z(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            A0c(nullPointerException, C7384Etj.class.getName());
            throw nullPointerException;
        }
    }

    public static void A0a(String str) {
        NullPointerException nullPointerExceptionA0a = BV4.A0a(FGI.A0M(str, " must not be null"));
        A0c(nullPointerExceptionA0a, C7384Etj.class.getName());
        throw nullPointerExceptionA0a;
    }

    public static void A0b(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(FGI.A0U("lateinit property ", str, " has not been initialized"));
        A0c(uninitializedPropertyAccessException, C7384Etj.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static byte[] A0e(Object obj) {
        byte[] bArr = (byte[]) obj;
        A0Y(bArr, 0);
        return bArr;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int A05(Object obj, Map map) {
        String str = (String) map.get(obj);
        A0X(str);
        return Integer.parseInt(str);
    }

    public static int A06(String str) {
        A0X(str);
        return str.length();
    }

    public static IOException A0C(Object obj, String str) {
        return new IOException(A0J(str, obj));
    }

    public static IllegalArgumentException A0D(Object obj, String str) {
        return new IllegalArgumentException(A0J(str, obj));
    }

    public static IllegalStateException A0E(int i) {
        return new IllegalStateException(A0J("state: ", Integer.valueOf(i)));
    }

    public static Object A0F(Iterator it) {
        Object next = it.next();
        A0U(next);
        return next;
    }

    public static Object A0G(F0C f0c) {
        Object value = f0c.getValue();
        A0U(value);
        return value;
    }

    public static String A0I(String str) {
        String strA01 = EK9.A01(str);
        A0U(strA01);
        return strA01;
    }

    public static String A0J(String str, Object obj) {
        return AnonymousClass006.A0y(obj, str, C60O.A0w());
    }

    public static String A0K(String str, Object[] objArr, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        return String.format(null, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
    }

    public static String A0L(JSONObject jSONObject, String str) throws JSONException {
        String string = jSONObject.getString(str);
        A0U(string);
        return string;
    }

    public static Charset A0M(String str) {
        Charset charsetForName = Charset.forName(str);
        A0U(charsetForName);
        return charsetForName;
    }

    public static Iterator A0N(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        A0U(it);
        return it;
    }

    public static Iterator A0O(Deque deque) {
        Iterator it = deque.iterator();
        A0U(it);
        return it;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Throwable;>(TT;Ljava/lang/String;)TT; */
    public static void A0c(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static byte[] A0d(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        A0U(byteArray);
        return byteArray;
    }
}
