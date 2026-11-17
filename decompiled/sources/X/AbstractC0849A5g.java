package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Deprecated;

/* renamed from: X.A5g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0849A5g {
    public static Bundle A00(HxE[] hxEArr) {
        return A01((HxE[]) Arrays.copyOf(hxEArr, hxEArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(message = "This method does not provide type safety at compile time. Use the platform `Bundle` class directly instead.")
    public static final Bundle A01(HxE<String, ? extends Object>... hxEArr) {
        Bundle bundle = new Bundle(hxEArr.length);
        for (HxE<String, ? extends Object> hxE : hxEArr) {
            String str = hxE.first;
            B b = hxE.second;
            if (b == 0) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                C7384Etj.A0X(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw C60O.A0i(FGI.A0e("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, '\"'));
                    }
                    bundle.putSerializable(str, (Serializable) b);
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b);
            } else if (b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b);
            } else if (b instanceof Size) {
                bundle.putSize(str, (Size) b);
            } else {
                if (!(b instanceof SizeF)) {
                    throw C60O.A0i(FGI.A0e("Illegal value type ", b.getClass().getCanonicalName(), " for key \"", str, '\"'));
                }
                bundle.putSizeF(str, (SizeF) b);
            }
        }
        return bundle;
    }
}
