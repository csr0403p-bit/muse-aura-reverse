package X;

import X.AbstractC10440Hhn;
import X.GF0;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class GF0<MessageType extends GF0<MessageType, BuilderType>, BuilderType extends AbstractC10440Hhn<MessageType, BuilderType>> extends GF1<MessageType, BuilderType> {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Object, GF0<?, ?>> defaultInstanceMap = C60O.A1C();
    public int memoizedSerializedSize = -1;
    public GG7 unknownFields = GG7.A05;

    public abstract Object A05(Integer num);

    /* JADX WARN: Incorrect return type in method signature: <T:LX/GF0<TT;*>;>(TT;)TT; */
    public static void A02(GF0 message) throws InvalidProtocolBufferException {
        byte bByteValue;
        if (message == null || (bByteValue = ((Number) message.A05(C79.A00)).byteValue()) == 1) {
            return;
        }
        if (bByteValue != 0) {
            boolean zAOY = AbstractC7609F5w.A0V(message).AOY(message);
            message.A05(C79.A01);
            if (zAOY) {
                return;
            }
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionA0U = AbstractC7609F5w.A0U(new UninitializedMessageException().getMessage());
        invalidProtocolBufferExceptionA0U.unfinishedMessage = message;
        throw invalidProtocolBufferExceptionA0U;
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/GF0<**>;>(Ljava/lang/Class<TT;>;TT;)V */
    public static void A03(GF0 clazz, Class defaultInstance) {
        clazz.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(defaultInstance, clazz);
    }

    public final boolean equals(Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other == null || (cls = getClass()) != other.getClass()) {
            return false;
        }
        return C9359GFs.A02.A00(cls).AAo(this, other);
    }

    public final int hashCode() {
        if (AbstractC7609F5w.A1U(this.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return AbstractC7609F5w.A0V(this).ANL(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iANL = AbstractC7609F5w.A0V(this).ANL(this);
        this.memoizedHashCode = iANL;
        return iANL;
    }

    public static GDU A00(AnonymousClass775 list) {
        int iA0P = AbstractC7610F5x.A0P(list);
        GDU gdu = (GDU) list;
        if (iA0P < gdu.A00) {
            throw BV4.A0P();
        }
        int[] iArrCopyOf = Arrays.copyOf(gdu.A01, iA0P);
        int i = gdu.A00;
        GDU gdu2 = new GDU(true);
        gdu2.A01 = iArrCopyOf;
        gdu2.A00 = i;
        return gdu2;
    }

    public static Object A01(Object method, Method object, Object... params) {
        try {
            return object.invoke(method, params);
        } catch (IllegalAccessException e) {
            throw BV4.A0d("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0d("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        char[] cArr = AbstractC9327GEi.A00;
        StringBuilder sbA13 = AbstractC7610F5x.A13(string);
        AbstractC9327GEi.A00(this, sbA13, 0);
        return sbA13.toString();
    }
}
