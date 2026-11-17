package com.facebook.pando;

import X.AbstractC3081BxN;
import X.AbstractC7489Ext;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV4;
import X.BV7;
import X.C7384Etj;
import X.ETi;
import X.InterfaceC5148Dae;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TreeJNI {
    public static final long CONVERSION_ABSENT = 0;
    public static final long CONVERSION_UNNAMED = -1;
    public static final long OPTIONAL_ABSENT = Long.MIN_VALUE;
    public static volatile boolean sAnrFixForBoxedPrimitivesEnabled;
    public static volatile boolean sAnrFixForNullableObjectsEnabled;
    public static volatile boolean sOptionalBooleanAsIntEnabled;
    public static volatile boolean sOptionalIntAsLongEnabled;
    public boolean fromTypeModel;
    public int mBuildConfigNameHash;
    public volatile long mChainKey;
    public int mFragmentNameHashCode;
    public final HybridData mHybridData;
    public volatile long mNativePeer;
    public int[] mPendingConversionChain;

    private final native boolean areAllSelectionsOptionalOrNonnullNative(long j);

    private final native String asJSONNative(long j, boolean z, boolean z2);

    private final native List<String> bubbledNullPathsNative(long j);

    private final native ImmutableList<Boolean> getBooleanList(long j, String str);

    private native ImmutableList<Boolean> getBooleanListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native boolean getBooleanValue(long j, String str);

    private native boolean getBooleanValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Boolean getBooleanVariable(long j, String str);

    private final native ImmutableList<Double> getDoubleList(long j, String str);

    private native ImmutableList<Double> getDoubleListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native double getDoubleValue(long j, String str);

    private native double getDoubleValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Map<String, String> getEncodedNonTransientVariables(long j);

    private final native Map<String, String> getEncodedTransientVariables(long j);

    private final native Object getFieldByHashCode_UNTYPED(long j, int i);

    private final native Object getField_UNTYPED(long j, String str);

    private final native ImmutableList<Integer> getIntList(long j, String str);

    private native ImmutableList<Integer> getIntListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native int getIntValue(long j, String str);

    private native int getIntValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<Boolean> getOptionalBooleanList(long j, String str);

    private native ImmutableList<Boolean> getOptionalBooleanListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Boolean getOptionalBooleanValue(long j, String str);

    private native Boolean getOptionalBooleanValueAsBooleanByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native int getOptionalBooleanValueAsIntByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<Double> getOptionalDoubleList(long j, String str);

    private native ImmutableList<Double> getOptionalDoubleListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Double getOptionalDoubleValue(long j, String str);

    private native double getOptionalDoubleValueAsDoubleByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native Double getOptionalDoubleValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<Integer> getOptionalIntList(long j, String str);

    private native ImmutableList<Integer> getOptionalIntListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Integer getOptionalIntValue(long j, String str);

    private native Integer getOptionalIntValueAsIntegerByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native long getOptionalIntValueAsLongByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<String> getOptionalStringList(long j, String str);

    private native ImmutableList<String> getOptionalStringListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<Long> getOptionalTimeList(long j, String str);

    private native ImmutableList<Long> getOptionalTimeListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native Long getOptionalTimeValue(long j, String str);

    private native long getOptionalTimeValueAsLongByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native Long getOptionalTimeValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native <T extends TreeJNI> ImmutableList<T> getOptionalTreeList(long j, String str, Class<T> cls);

    private native <T extends TreeJNI> ImmutableList<T> getOptionalTreeListByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private final native int getReaderFragmentNameHash(long j, int i, int i2, long j2);

    private native ByteBuffer getRequiredStringAsNonOwningBufferByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native String getRequiredStringValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native <T extends TreeJNI> T getRequiredTreeValueByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private final native int[] getSetFields(long j);

    private final native int getSnapshotSize(long j);

    private final native ByteBuffer getStringAsNonOwningBuffer(long j, String str);

    private native ByteBuffer getStringAsNonOwningBufferByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native ImmutableList<String> getStringList(long j, String str);

    private native ImmutableList<String> getStringListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native String getStringValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native String getStringValueNative(long j, String str);

    private final native ImmutableList<Long> getTimeList(long j, String str);

    private native ImmutableList<Long> getTimeListByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native long getTimeValue(long j, String str);

    private native long getTimeValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native <T extends TreeJNI> ImmutableList<T> getTreeList(long j, String str, Class<T> cls);

    private native <T extends TreeJNI> ImmutableList<T> getTreeListByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private final native <T extends TreeJNI> T getTreeValue(long j, String str, Class<T> cls);

    private native <T extends TreeJNI> T getTreeValueByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private final native ImmutableList<TreeJNI> getTreesForType_EXPERIMENTAL(long j, String... strArr);

    private final native boolean getUseSegmentedCanonicalArguments(long j);

    private final native boolean hasFieldValue(long j, String str);

    private native boolean hasFieldValueByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native boolean isFieldSet(long j, String str);

    private native boolean isFieldSetByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private final native void logToFlipper(long j, String str, String str2);

    private final native void maybeUpdateActiveFields(long j);

    private native <T extends TreeJNI> T optionalReinterpretByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private final native long primaryKeyNative(long j);

    private final native <T extends TreeJNI> T recreateWithFragmentNative(long j, Class<? extends T> cls, int i, int i2);

    private final <T extends TreeJNI> T recreateWithFragmentNative(Class<? extends T> cls, int i, int i2) {
        return (T) recreateWithFragmentNative(this.mNativePeer, cls, i, i2);
    }

    private final native <T extends TreeJNI> T recreateWithoutSubscription(long j, Class<T> cls);

    private native <T extends TreeJNI> T requiredReinterpretByHashCodeNative(long j, int i, int i2, long j2, int i3, Class<T> cls);

    private native long resolveOptionalConversionByHashCodeNative(long j, int i, int i2, long j2, int i3);

    private native long resolvedFragmentPointerForTestingNative(long j, int i, int i2, long j2);

    public static native void setLazyFragmentReinterpretEnabledNative(boolean z);

    public static native void setLazyTreeHybridCachesEnabledNative(boolean z);

    public final native boolean fieldCanBeSafelySharedAcrossSpreads(int i);

    public final ImmutableList<Boolean> getBooleanListByHashCode(int i) {
        return getBooleanListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final boolean getBooleanValueByHashCode(int i) {
        return getBooleanValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Double> getDoubleListByHashCode(int i) {
        return getDoubleListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final double getDoubleValueByHashCode(int i) {
        return getDoubleValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Integer> getIntListByHashCode(int i) {
        return getIntListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final int getIntValueByHashCode(int i) {
        return getIntValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Boolean> getOptionalBooleanListByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalBooleanListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final Boolean getOptionalBooleanValueAsBooleanByHashCode(int i) {
        return getOptionalBooleanValueAsBooleanByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final int getOptionalBooleanValueAsIntByHashCode(int i) {
        return getOptionalBooleanValueAsIntByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Double> getOptionalDoubleListByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalDoubleListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final double getOptionalDoubleValueAsDoubleByHashCode(int i) {
        return getOptionalDoubleValueAsDoubleByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Integer> getOptionalIntListByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalIntListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final Integer getOptionalIntValueAsIntegerByHashCode(int i) {
        return getOptionalIntValueAsIntegerByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final long getOptionalIntValueAsLongByHashCode(int i) {
        return getOptionalIntValueAsLongByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<String> getOptionalStringListByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalStringListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Long> getOptionalTimeListByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalTimeListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final long getOptionalTimeValueAsLongByHashCode(int i) {
        return getOptionalTimeValueAsLongByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final <T extends TreeJNI> ImmutableList<T> getOptionalTreeListByHashCode(int i, Class<T> cls) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getOptionalTreeListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final int getReaderFragmentNameHash() {
        return getReaderFragmentNameHash(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey);
    }

    public final ByteBuffer getRequiredStringAsNonOwningBufferByHashCode(int i) {
        return getRequiredStringAsNonOwningBufferByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final String getRequiredStringValueByHashCode(int i) {
        return getRequiredStringValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final <T extends TreeJNI> T getRequiredTreeValueByHashCode(int i, Class<T> cls) {
        return (T) getRequiredTreeValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final ByteBuffer getStringAsNonOwningBufferByHashCode(int i) {
        return getStringAsNonOwningBufferByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<String> getStringListByHashCode(int i) {
        return getStringListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final String getStringValueByHashCode(int i) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return getStringValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final ImmutableList<Long> getTimeListByHashCode(int i) {
        return getTimeListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final long getTimeValueByHashCode(int i) {
        return getTimeValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final <T extends TreeJNI> ImmutableList<T> getTreeListByHashCode(int i, Class<T> cls) {
        return getTreeListByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final <T extends TreeJNI> T getTreeValueByHashCode(int i, Class<T> cls) {
        if (shouldSkipNullableObjectRead(i)) {
            return null;
        }
        return (T) getTreeValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final boolean hasFieldValueByHashCode(int i) {
        return hasFieldValueByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final native boolean isDeepEqualTreeNative(TreeJNI treeJNI);

    public final boolean isFieldSetByHashCode(int i) {
        return isFieldSetByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final void logToFlipper(String str) {
        logToFlipper(asJSONNative(true, false), str);
    }

    public final <T extends TreeJNI> T optionalReinterpretByHashCode(int i, Class<T> cls) {
        return (T) optionalReinterpretByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final <T extends TreeJNI> T recreateWithoutFragment(Class<T> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(HybridData.class);
            declaredConstructor.setAccessible(true);
            T tNewInstance = declaredConstructor.newInstance(this.mHybridData);
            tNewInstance.mNativePeer = this.mNativePeer;
            tNewInstance.fromTypeModel = this.fromTypeModel;
            return tNewInstance;
        } catch (ReflectiveOperationException e) {
            throw BV4.A0d(AnonymousClass007.A0a("recreateWithoutFragment failed for ", cls), e);
        }
    }

    public final <T extends TreeJNI> T requiredReinterpretByHashCode(int i, Class<T> cls) {
        return (T) requiredReinterpretByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i, cls);
    }

    public final long resolveOptionalConversionByHashCode(int i) {
        return resolveOptionalConversionByHashCodeNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey, i);
    }

    public final long resolvedFragmentPointerForTesting() {
        return resolvedFragmentPointerForTestingNative(this.mNativePeer, this.mFragmentNameHashCode, this.mBuildConfigNameHash, this.mChainKey);
    }

    public final String toExpensiveHumanReadableDebugString() {
        return asJSONNative(false, false);
    }

    public final String toFlipperFormattedResponseString() {
        return asJSONNative(true, false);
    }

    static {
        ETi.loadLibrary("pando-jni");
    }

    public static boolean isNamedConversion(long j) {
        return (j == 0 || j == -1) ? false : true;
    }

    public static <T extends Enum<T>> T parseEnum(String str, T t) {
        if (str != null) {
            try {
                return (T) Enum.valueOf(t.getClass(), str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return t;
    }

    public static String parseStringDef(String str, String str2, String str3, FromStringAble fromStringAble) {
        if (str == null) {
            return str3;
        }
        throw null;
    }

    public final boolean areAllSelectionsOptionalOrNonnullNative() {
        return areAllSelectionsOptionalOrNonnullNative(this.mNativePeer);
    }

    public final String asJSONNative(boolean z, boolean z2) {
        return asJSONNative(this.mNativePeer, z, z2);
    }

    public final List<String> bubbledNullPathsNative() {
        return bubbledNullPathsNative(this.mNativePeer);
    }

    public final ImmutableList<Boolean> getBooleanList(String str) {
        return getBooleanList(this.mNativePeer, str);
    }

    public final boolean getBooleanValue(String str) {
        return getBooleanValue(this.mNativePeer, str);
    }

    public final Boolean getBooleanVariable(String str) {
        return getBooleanVariable(this.mNativePeer, str);
    }

    public final ImmutableList<Double> getDoubleList(String str) {
        return getDoubleList(this.mNativePeer, str);
    }

    public final double getDoubleValue(String str) {
        return getDoubleValue(this.mNativePeer, str);
    }

    public final Map<String, String> getEncodedNonTransientVariables() {
        return getEncodedNonTransientVariables(this.mNativePeer);
    }

    public final Map<String, String> getEncodedTransientVariables() {
        return getEncodedTransientVariables(this.mNativePeer);
    }

    public final <T extends Enum<T>> ImmutableList<T> getEnumList(String str, T t) {
        ImmutableList<String> stringList = getStringList(this.mNativePeer, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        AbstractC7489Ext<String> it = stringList.iterator();
        while (it.hasNext()) {
            builder.add((ImmutableList.Builder) parseEnum(AnonymousClass005.A0j(it), t));
        }
        return builder.build();
    }

    public final <T extends Enum<T>> T getEnumValue(String str, T t) {
        return (T) parseEnum(getStringValueNative(this.mNativePeer, str), t);
    }

    public final Object getFieldByHashCode_UNTYPED(int i) {
        return getFieldByHashCode_UNTYPED(this.mNativePeer, i);
    }

    public final Object getField_UNTYPED(String str) {
        return getField_UNTYPED(this.mNativePeer, str);
    }

    public final ImmutableList<Integer> getIntList(String str) {
        return getIntList(this.mNativePeer, str);
    }

    public final int getIntValue(String str) {
        return getIntValue(this.mNativePeer, str);
    }

    public final ImmutableList<Boolean> getOptionalBooleanList(String str) {
        return getOptionalBooleanList(this.mNativePeer, str);
    }

    public final Boolean getOptionalBooleanValue(String str) {
        return getOptionalBooleanValue(this.mNativePeer, str);
    }

    public final Boolean getOptionalBooleanValueByHashCode(int i) {
        if (!sOptionalBooleanAsIntEnabled) {
            return getOptionalBooleanValueAsBooleanByHashCode(i);
        }
        int optionalBooleanValueAsIntByHashCode = getOptionalBooleanValueAsIntByHashCode(i);
        if (optionalBooleanValueAsIntByHashCode == -1) {
            return null;
        }
        return Boolean.valueOf(BV7.A1Q(optionalBooleanValueAsIntByHashCode));
    }

    public final ImmutableList<Double> getOptionalDoubleList(String str) {
        return getOptionalDoubleList(this.mNativePeer, str);
    }

    public final Double getOptionalDoubleValue(String str) {
        return getOptionalDoubleValue(this.mNativePeer, str);
    }

    public final Double getOptionalDoubleValueByHashCode(int i) {
        boolean z = sAnrFixForBoxedPrimitivesEnabled;
        long j = this.mNativePeer;
        int i2 = this.mFragmentNameHashCode;
        int i3 = this.mBuildConfigNameHash;
        long j2 = this.mChainKey;
        if (!z) {
            return getOptionalDoubleValueByHashCodeNative(j, i2, i3, j2, i);
        }
        double optionalDoubleValueAsDoubleByHashCodeNative = getOptionalDoubleValueAsDoubleByHashCodeNative(j, i2, i3, j2, i);
        if (!Double.isNaN(optionalDoubleValueAsDoubleByHashCodeNative) || hasFieldValueByHashCode(i)) {
            return Double.valueOf(optionalDoubleValueAsDoubleByHashCodeNative);
        }
        return null;
    }

    public final ImmutableList<Integer> getOptionalIntList(String str) {
        return getOptionalIntList(this.mNativePeer, str);
    }

    public final Integer getOptionalIntValue(String str) {
        return getOptionalIntValue(this.mNativePeer, str);
    }

    public final Integer getOptionalIntValueByHashCode(int i) {
        if (!sOptionalIntAsLongEnabled) {
            return getOptionalIntValueAsIntegerByHashCode(i);
        }
        long optionalIntValueAsLongByHashCode = getOptionalIntValueAsLongByHashCode(i);
        if (optionalIntValueAsLongByHashCode == Long.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf((int) optionalIntValueAsLongByHashCode);
    }

    public final ImmutableList<String> getOptionalStringList(String str) {
        return getOptionalStringList(this.mNativePeer, str);
    }

    public final ImmutableList<Long> getOptionalTimeList(String str) {
        return getOptionalTimeList(this.mNativePeer, str);
    }

    public final Long getOptionalTimeValue(String str) {
        return getOptionalTimeValue(this.mNativePeer, str);
    }

    public final Long getOptionalTimeValueByHashCode(int i) {
        boolean z = sAnrFixForBoxedPrimitivesEnabled;
        long j = this.mNativePeer;
        int i2 = this.mFragmentNameHashCode;
        int i3 = this.mBuildConfigNameHash;
        long j2 = this.mChainKey;
        if (!z) {
            return getOptionalTimeValueByHashCodeNative(j, i2, i3, j2, i);
        }
        long optionalTimeValueAsLongByHashCodeNative = getOptionalTimeValueAsLongByHashCodeNative(j, i2, i3, j2, i);
        if (optionalTimeValueAsLongByHashCodeNative != Long.MIN_VALUE || hasFieldValueByHashCode(i)) {
            return Long.valueOf(optionalTimeValueAsLongByHashCodeNative);
        }
        return null;
    }

    public final <T extends TreeJNI> ImmutableList<T> getOptionalTreeList(String str, Class<T> cls) {
        return getOptionalTreeList(this.mNativePeer, str, cls);
    }

    public Long getPrimaryKey() {
        return Long.valueOf(primaryKeyNative(this.mNativePeer));
    }

    public final int[] getSetFields() {
        return getSetFields(this.mNativePeer);
    }

    public final int getSnapshotSize() {
        return getSnapshotSize(this.mNativePeer);
    }

    public final ByteBuffer getStringAsNonOwningBuffer(String str) {
        return getStringAsNonOwningBuffer(this.mNativePeer, str);
    }

    public final ImmutableList<String> getStringDefList(String str, String str2, String str3, FromStringAble fromStringAble) {
        ImmutableList<String> stringList = getStringList(this.mNativePeer, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        AbstractC7489Ext<String> it = stringList.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw null;
            }
            builder.add((ImmutableList.Builder) str3);
        }
        return builder.build();
    }

    public final String getStringDefValue(String str, String str2, String str3, FromStringAble fromStringAble) {
        if (getStringValueNative(this.mNativePeer, str) == null) {
            return str3;
        }
        throw null;
    }

    public final ImmutableList<String> getStringList(String str) {
        return getStringList(this.mNativePeer, str);
    }

    public final String getStringValue(String str) {
        return getStringValueNative(this.mNativePeer, str);
    }

    public final String getStringValueNative(String str) {
        return getStringValueNative(this.mNativePeer, str);
    }

    public final ImmutableList<Long> getTimeList(String str) {
        return getTimeList(this.mNativePeer, str);
    }

    public final long getTimeValue(String str) {
        return getTimeValue(this.mNativePeer, str);
    }

    public final <T extends TreeJNI> ImmutableList<T> getTreeList(String str, Class<T> cls) {
        return getTreeList(this.mNativePeer, str, cls);
    }

    public final <T extends TreeJNI> T getTreeValue(String str, Class<T> cls) {
        return (T) getTreeValue(this.mNativePeer, str, cls);
    }

    public final ImmutableList<TreeJNI> getTreesForType_EXPERIMENTAL(String... strArr) {
        return getTreesForType_EXPERIMENTAL(this.mNativePeer, strArr);
    }

    public String getTypeName() {
        return getStringValueNative(this.mNativePeer, "__typename");
    }

    public final boolean getUseSegmentedCanonicalArguments() {
        return getUseSegmentedCanonicalArguments(this.mNativePeer);
    }

    public final boolean hasFieldValue(String str) {
        return hasFieldValue(this.mNativePeer, str);
    }

    public boolean isDeepEqualTree(TreeJNI treeJNI) {
        if (this == treeJNI) {
            return true;
        }
        if (treeJNI == null) {
            return false;
        }
        return isDeepEqualTreeNative(treeJNI);
    }

    public final boolean isFieldSet(String str) {
        return isFieldSet(this.mNativePeer, str);
    }

    public final void maybeUpdateActiveFields() {
        maybeUpdateActiveFields(this.mNativePeer);
    }

    public final long primaryKeyNative() {
        return primaryKeyNative(this.mNativePeer);
    }

    public final <T extends TreeJNI> T recreateAsLazyConversion(InterfaceC5148Dae<T> interfaceC5148Dae, int i) {
        int[] iArr;
        HybridData hybridData = this.mHybridData;
        C7384Etj.A0Y(hybridData, 0);
        TreeWithGraphQL treeWithGraphQL = new TreeWithGraphQL(hybridData);
        treeWithGraphQL.mNativePeer = this.mNativePeer;
        treeWithGraphQL.mFragmentNameHashCode = this.mFragmentNameHashCode;
        treeWithGraphQL.mBuildConfigNameHash = this.mBuildConfigNameHash;
        treeWithGraphQL.fromTypeModel = this.fromTypeModel;
        int[] iArr2 = this.mPendingConversionChain;
        if (iArr2 == null) {
            iArr = new int[]{i};
        } else {
            int length = iArr2.length;
            iArr = new int[length + 1];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            iArr[iArr2.length] = i;
        }
        treeWithGraphQL.mPendingConversionChain = iArr;
        treeWithGraphQL.mChainKey = nextChainKey(this.mChainKey, this.mFragmentNameHashCode, i);
        return treeWithGraphQL;
    }

    public final <T extends TreeJNI> T recreateAsLazyFragment(InterfaceC5148Dae<T> interfaceC5148Dae, int i, int i2) {
        HybridData hybridData = this.mHybridData;
        C7384Etj.A0Y(hybridData, 0);
        TreeWithGraphQL treeWithGraphQL = new TreeWithGraphQL(hybridData);
        treeWithGraphQL.mNativePeer = this.mNativePeer;
        treeWithGraphQL.mFragmentNameHashCode = i;
        treeWithGraphQL.mBuildConfigNameHash = i2;
        treeWithGraphQL.fromTypeModel = this.fromTypeModel;
        return treeWithGraphQL;
    }

    public final <T extends TreeJNI> T recreateWithoutSubscription(Class<T> cls) {
        return (T) recreateWithoutSubscription(this.mNativePeer, cls);
    }

    public final boolean shouldSkipNullableObjectRead(int i) {
        return sAnrFixForNullableObjectsEnabled && !hasFieldValueByHashCode(i);
    }

    public TreeJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static int namedConversionFragmentHash(long j) {
        return (int) j;
    }

    public static void setAnrFixForBoxedPrimitivesEnabled(boolean z) {
        sAnrFixForBoxedPrimitivesEnabled = z;
    }

    public static void setAnrFixForNullableObjectsEnabled(boolean z) {
        sAnrFixForNullableObjectsEnabled = z;
    }

    public static void setOptionalBooleanAsIntEnabled(boolean z) {
        sOptionalBooleanAsIntEnabled = z;
    }

    public static void setOptionalIntAsLongEnabled(boolean z) {
        sOptionalIntAsLongEnabled = z;
    }

    public final JSONObject asJSON(boolean z, boolean z2) {
        return BV4.A19(asJSONNative(z, z2));
    }

    public final boolean isFulfilled(String str) {
        if (!str.equals(getTypeName())) {
            if (!getBooleanValue(this.mNativePeer, String.format("is_fulfilled__(name:\"%s\")", str))) {
                return false;
            }
        }
        return true;
    }

    public final <T extends TreeJNI> T recreateWithFragment(Class<? extends T> cls, int i, String str) {
        return (T) recreateWithFragmentNative(cls, i, AbstractC3081BxN.A00().A00(str));
    }

    public static long nextChainKey(long j, int i, int i2) {
        if (j == 0) {
            j = (i & 4294967295L) | LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES;
        }
        long j2 = (j + (i2 & 4294967295L)) * (-7046029254386353131L);
        long j3 = j2 ^ (j2 >>> 32);
        if (j3 == 0) {
            return 1L;
        }
        return j3;
    }

    public final void logToFlipper(String str, String str2) {
        logToFlipper(this.mNativePeer, str, str2);
    }

    public final <T extends TreeJNI> T recreateWithFragment(Class<? extends T> cls, int i, int i2) {
        return (T) recreateWithFragmentNative(cls, i, i2);
    }
}
