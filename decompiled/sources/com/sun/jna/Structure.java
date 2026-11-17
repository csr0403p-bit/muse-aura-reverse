package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.FGI;
import com.sun.jna.Structure;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.Reference;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class Structure {
    public static final int ALIGN_DEFAULT = 0;
    public static final int ALIGN_GNUC = 2;
    public static final int ALIGN_MSVC = 3;
    public static final int ALIGN_NONE = 1;
    public static final int CALCULATE_SIZE = -1;
    public int actualAlignType;
    public int alignType;
    public Structure[] array;
    public boolean autoRead;
    public boolean autoWrite;
    public String encoding;
    public Pointer memory;
    public final Map<String, NativeStringTracking> nativeStrings;
    public boolean readCalled;
    public int size;
    public int structAlignment;
    public Map<String, StructField> structFields;
    public long typeInfo;
    public TypeMapper typeMapper;
    public static final Logger LOG = BV5.A1B(Structure.class);
    public static final ReentrantReadWriteLock cacheStructureLock = new ReentrantReadWriteLock();
    public static final Map<Class<?>, LayoutInfo> layoutInfo = BV4.A11();
    public static final Map<Class<?>, List<String>> fieldOrder = BV4.A11();
    public static final Map<Class<?>, List<Field>> fieldList = BV4.A11();
    public static final Map<Class<?>, Boolean> validationMap = BV4.A11();
    public static final ThreadLocal<Map<Pointer, Structure>> reads = new ThreadLocal<Map<Pointer, Structure>>() { // from class: com.sun.jna.Structure.1
        @Override // java.lang.ThreadLocal
        public synchronized Map<Pointer, Structure> initialValue() {
            return BV4.A0u();
        }
    };
    public static final ThreadLocal<Set<Structure>> busy = new ThreadLocal<Set<Structure>>() { // from class: com.sun.jna.Structure.2
        @Override // java.lang.ThreadLocal
        public synchronized Set<Structure> initialValue() {
            return new StructureSet();
        }
    };
    public static final Pointer PLACEHOLDER_MEMORY = new Pointer(0) { // from class: com.sun.jna.Structure.3
        @Override // com.sun.jna.Pointer
        public Pointer share(long j, long j2) {
            return this;
        }
    };

    public class AutoAllocated extends Memory {
        public AutoAllocated(int i) {
            super(i);
            super.clear();
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return FGI.A0M("auto-", super.toString());
        }
    }

    public interface ByReference {
    }

    /* loaded from: classes6.dex */
    public interface ByValue {
    }

    @FieldOrder({"size", "alignment", "type", "elements"})
    public class FFIType extends Structure {
        public static final int FFI_TYPE_STRUCT = 13;
        public static final Map<Pointer, FFIType> ffiTypeInfo;
        public static final Map<Class, Map<Integer, FFIType>> typeInfoMap = BV4.A11();
        public static final Map<Class, FFIType> unionHelper = BV4.A11();
        public short alignment;
        public Pointer elements;
        public size_t size;
        public short type;

        public class FFITypes {
            public static Pointer ffi_type_double;
            public static Pointer ffi_type_float;
            public static Pointer ffi_type_longdouble;
            public static Pointer ffi_type_pointer;
            public static Pointer ffi_type_sint16;
            public static Pointer ffi_type_sint32;
            public static Pointer ffi_type_sint64;
            public static Pointer ffi_type_sint8;
            public static Pointer ffi_type_uint16;
            public static Pointer ffi_type_uint32;
            public static Pointer ffi_type_uint64;
            public static Pointer ffi_type_uint8;
            public static Pointer ffi_type_void;
        }

        public class size_t extends IntegerType {
            public static final long serialVersionUID = 1;

            public size_t(long j) {
                super(Native.SIZE_T_SIZE, j);
            }

            public size_t() {
                this(0L);
            }
        }

        public static void storeTypeInfo(Class cls, FFIType fFIType) {
            storeTypeInfo(cls, 0, fFIType);
        }

        public static FFIType get(Object obj) {
            return obj == null ? getTypeInfo(Pointer.class, 0) : obj instanceof Class ? get(null, (Class) obj) : get(obj, obj.getClass());
        }

        public static FFIType getTypeInfo(Class cls, int i) {
            ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
            BV4.A1S(reentrantReadWriteLock);
            try {
                Map<Integer, FFIType> map = typeInfoMap.get(cls);
                if (map == null) {
                    BV4.A1R(reentrantReadWriteLock);
                    return null;
                }
                FFIType fFIType = (FFIType) BV5.A0f(map, i);
                BV4.A1R(reentrantReadWriteLock);
                return fFIType;
            } catch (Throwable th) {
                BV4.A1R(Structure.cacheStructureLock);
                throw th;
            }
        }

        private void init(Pointer[] pointerArr) {
            Map<Long, Reference<Memory>> map = Memory.allocatedMemory;
            int i = Native.POINTER_SIZE;
            int length = pointerArr.length;
            Memory memory = new Memory(i * length);
            this.elements = memory;
            memory.write(0L, pointerArr, 0, length);
            write();
        }

        static {
            HashMap mapA0u = BV4.A0u();
            ffiTypeInfo = mapA0u;
            if (Native.POINTER_SIZE == 0) {
                throw new Error("Native library not initialized");
            }
            Pointer pointer = FFITypes.ffi_type_void;
            if (pointer == null) {
                throw new Error("FFI types not initialized");
            }
            BV6.A16(pointer, mapA0u);
            BV6.A16(FFITypes.ffi_type_float, mapA0u);
            BV6.A16(FFITypes.ffi_type_double, mapA0u);
            BV6.A16(FFITypes.ffi_type_longdouble, mapA0u);
            BV6.A16(FFITypes.ffi_type_uint8, mapA0u);
            BV6.A16(FFITypes.ffi_type_sint8, mapA0u);
            BV6.A16(FFITypes.ffi_type_uint16, mapA0u);
            BV6.A16(FFITypes.ffi_type_sint16, mapA0u);
            BV6.A16(FFITypes.ffi_type_uint32, mapA0u);
            BV6.A16(FFITypes.ffi_type_sint32, mapA0u);
            BV6.A16(FFITypes.ffi_type_uint64, mapA0u);
            BV6.A16(FFITypes.ffi_type_sint64, mapA0u);
            BV6.A16(FFITypes.ffi_type_pointer, mapA0u);
            Iterator itA0x = BV5.A0x(mapA0u);
            while (itA0x.hasNext()) {
                ((Structure) itA0x.next()).read();
            }
            Class cls = Void.TYPE;
            Map<Pointer, FFIType> map = ffiTypeInfo;
            storeTypeInfo(cls, 0, map.get(FFITypes.ffi_type_void));
            BV7.A1B(Void.class, FFITypes.ffi_type_void, map);
            BV7.A1B(Float.TYPE, FFITypes.ffi_type_float, map);
            BV7.A1B(Float.class, FFITypes.ffi_type_float, map);
            BV7.A1B(Double.TYPE, FFITypes.ffi_type_double, map);
            BV7.A1B(Double.class, FFITypes.ffi_type_double, map);
            BV7.A1B(Long.TYPE, FFITypes.ffi_type_sint64, map);
            BV7.A1B(Long.class, FFITypes.ffi_type_sint64, map);
            BV7.A1B(Integer.TYPE, FFITypes.ffi_type_sint32, map);
            BV7.A1B(Integer.class, FFITypes.ffi_type_sint32, map);
            BV7.A1B(Short.TYPE, FFITypes.ffi_type_sint16, map);
            BV7.A1B(Short.class, FFITypes.ffi_type_sint16, map);
            FFIType fFIType = map.get(Native.WCHAR_SIZE == 2 ? FFITypes.ffi_type_uint16 : FFITypes.ffi_type_uint32);
            storeTypeInfo(Character.TYPE, 0, fFIType);
            storeTypeInfo(Character.class, 0, fFIType);
            BV7.A1B(Byte.TYPE, FFITypes.ffi_type_sint8, map);
            BV7.A1B(Byte.class, FFITypes.ffi_type_sint8, map);
            BV7.A1B(Pointer.class, FFITypes.ffi_type_pointer, map);
            BV7.A1B(String.class, FFITypes.ffi_type_pointer, map);
            BV7.A1B(WString.class, FFITypes.ffi_type_pointer, map);
            BV7.A1B(Boolean.TYPE, FFITypes.ffi_type_uint32, map);
            BV7.A1B(Boolean.class, FFITypes.ffi_type_uint32, map);
        }

        public FFIType(Structure structure) {
            this.type = (short) 13;
            structure.ensureAllocated(true);
            int i = 0;
            Pointer[] pointerArr = new Pointer[structure.structFields.size() + 1];
            Iterator itA10 = BV5.A10(structure.structFields);
            while (itA10.hasNext()) {
                pointerArr[i] = structure.getFieldTypeInfo((StructField) itA10.next()).getPointer();
                i++;
            }
            init(pointerArr);
            write();
        }

        public static boolean isFloatType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            return pointer.equals(FFITypes.ffi_type_float) || pointer.equals(FFITypes.ffi_type_double);
        }

        public static boolean isIntegerType(FFIType fFIType) {
            Pointer pointer = fFIType.getPointer();
            return pointer.equals(FFITypes.ffi_type_uint8) || pointer.equals(FFITypes.ffi_type_sint8) || pointer.equals(FFITypes.ffi_type_uint16) || pointer.equals(FFITypes.ffi_type_sint16) || pointer.equals(FFITypes.ffi_type_uint32) || pointer.equals(FFITypes.ffi_type_sint32) || pointer.equals(FFITypes.ffi_type_uint64) || pointer.equals(FFITypes.ffi_type_sint64) || pointer.equals(FFITypes.ffi_type_pointer);
        }

        public FFIType(Object obj, Class<?> cls) {
            this.type = (short) 13;
            int length = Array.getLength(obj);
            Pointer[] pointerArr = new Pointer[length + 1];
            Pointer pointer = get(null, cls.getComponentType()).getPointer();
            for (int i = 0; i < length; i++) {
                pointerArr[i] = pointer;
            }
            init(pointerArr);
            write();
        }

        public static FFIType get(Object obj, Class<?> cls) {
            int length;
            FFIType fFIType;
            ToNativeConverter toNativeConverter;
            TypeMapper typeMapper = Native.getTypeMapper(cls);
            if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
                cls = toNativeConverter.nativeType();
            }
            if (cls.isArray()) {
                length = Array.getLength(obj);
            } else {
                length = 0;
            }
            FFIType typeInfo = getTypeInfo(cls, length);
            if (typeInfo == null) {
                ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
                BV4.A1T(reentrantReadWriteLock);
                try {
                    if ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls)) {
                        if (BV6.A1X(cls)) {
                            if (obj == null) {
                                obj = Structure.newInstance(cls, Structure.PLACEHOLDER_MEMORY);
                            }
                            if (ByReference.class.isAssignableFrom(cls)) {
                                Map<Class, Map<Integer, FFIType>> map = typeInfoMap;
                                map.put(cls, map.get(Pointer.class));
                                fFIType = (FFIType) BV5.A0f(map.get(Pointer.class), 0);
                            } else {
                                FFIType fFIType2 = new FFIType((Structure) obj);
                                storeTypeInfo(cls, 0, fFIType2);
                                BV4.A1Q(reentrantReadWriteLock);
                                return fFIType2;
                            }
                        } else {
                            BV4.A1Q(reentrantReadWriteLock);
                            if (NativeMapped.class.isAssignableFrom(cls)) {
                                NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                                return get(nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
                            }
                            if (cls.isArray()) {
                                FFIType fFIType3 = new FFIType(obj, cls);
                                storeTypeInfo(cls, Array.getLength(obj), fFIType3);
                                return fFIType3;
                            }
                            throw BV5.A0O(cls, "Unsupported type ");
                        }
                    } else {
                        Map<Class, Map<Integer, FFIType>> map2 = typeInfoMap;
                        map2.put(cls, map2.get(Pointer.class));
                        fFIType = (FFIType) BV5.A0f(map2.get(Pointer.class), 0);
                    }
                    BV4.A1Q(reentrantReadWriteLock);
                    return fFIType;
                } catch (Throwable th) {
                    ReentrantReadWriteLock reentrantReadWriteLock2 = Structure.cacheStructureLock;
                    BV4.A1Q(reentrantReadWriteLock);
                    throw th;
                }
            }
            return typeInfo;
        }

        public static void storeTypeInfo(Class cls, int i, FFIType fFIType) {
            ReentrantReadWriteLock reentrantReadWriteLock = Structure.cacheStructureLock;
            BV4.A1T(reentrantReadWriteLock);
            try {
                typeInfoMap.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$FFIType$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i2 = Structure.FFIType.FFI_TYPE_STRUCT;
                        return BV4.A0u();
                    }
                }).put(Integer.valueOf(i), fFIType);
                BV4.A1Q(reentrantReadWriteLock);
            } catch (Throwable th) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = Structure.cacheStructureLock;
                BV4.A1Q(reentrantReadWriteLock);
                throw th;
            }
        }

        public FFIType(FFIType fFIType) {
            this.type = (short) 13;
            this.size = fFIType.size;
            this.alignment = fFIType.alignment;
            this.type = fFIType.type;
            this.elements = fFIType.elements;
        }

        public FFIType() {
            this.type = (short) 13;
        }
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface FieldOrder {
        String[] value();
    }

    public class StructureSet extends AbstractCollection<Structure> implements Set<Structure> {
        public int count;
        public Structure[] elements;

        private int indexOf(Structure structure) {
            for (int i = 0; i < this.count; i++) {
                Structure structure2 = this.elements[i];
                if (structure == structure2 || (structure.getClass() == structure2.getClass() && structure.size() == structure2.size() && structure.getPointer().equals(structure2.getPointer()))) {
                    return i;
                }
            }
            return -1;
        }

        private void ensureCapacity(int i) {
            Structure[] structureArr;
            Structure[] structureArr2 = this.elements;
            if (structureArr2 == null) {
                structureArr = new Structure[(i * 3) / 2];
            } else {
                int length = structureArr2.length;
                if (length >= i) {
                    return;
                }
                structureArr = new Structure[(i * 3) / 2];
                System.arraycopy(structureArr2, 0, structureArr, 0, length);
            }
            this.elements = structureArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return AnonymousClass002.A1P(indexOf((Structure) obj), -1);
        }

        public Structure[] getElements() {
            return this.elements;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Structure> iterator() {
            int i = this.count;
            Structure[] structureArr = new Structure[i];
            if (i > 0) {
                System.arraycopy(this.elements, 0, structureArr, 0, i);
            }
            return Arrays.asList(structureArr).iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iIndexOf = indexOf((Structure) obj);
            if (iIndexOf == -1) {
                return false;
            }
            int i = this.count - 1;
            this.count = i;
            if (i >= 0) {
                Structure[] structureArr = this.elements;
                structureArr[iIndexOf] = structureArr[i];
                structureArr[i] = null;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.count;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Structure structure) {
            if (contains(structure)) {
                return false;
            }
            ensureCapacity(this.count + 1);
            Structure[] structureArr = this.elements;
            int i = this.count;
            this.count = i + 1;
            structureArr[i] = structure;
            return true;
        }
    }

    public Structure(TypeMapper typeMapper) {
        this(null, 0, typeMapper);
    }

    public static int size(Class<? extends Structure> cls) {
        return size(cls, null);
    }

    public static void validate(Class<? extends Structure> cls) throws NoSuchMethodException, SecurityException {
        try {
            cls.getConstructor(null);
        } catch (NoSuchMethodException | SecurityException unused) {
            throw C60Q.A0U("No suitable constructor found for class: ", cls.getName());
        }
    }

    public void allocateMemory(int i) {
        if (i == -1) {
            i = calculateSize(false, false);
            if (i == -1) {
                return;
            }
        } else if (i <= 0) {
            throw BV5.A0Q("Structure size must be greater than zero: ", i);
        }
        Pointer pointer = this.memory;
        if (pointer == null || (pointer instanceof AutoAllocated)) {
            this.memory = new AutoAllocated(i);
        }
        this.size = i;
    }

    public int calculateSize(boolean z) {
        return calculateSize(z, false);
    }

    public void clear() {
        ensureAllocated(false);
        this.nativeStrings.clear();
        Pointer pointer = this.memory;
        ensureAllocated(false);
        pointer.clear(this.size);
    }

    public boolean dataEquals(Structure structure) {
        return dataEquals(structure, false);
    }

    public int fieldOffset(String str) {
        ensureAllocated(false);
        StructField structField = this.structFields.get(str);
        if (structField != null) {
            return structField.offset;
        }
        throw C60Q.A0U("No such field: ", str);
    }

    public int getNativeSize(Class<?> cls) {
        return Native.getNativeSize(cls, null);
    }

    public Pointer getPointer() {
        ensureAllocated(false);
        return this.memory;
    }

    public int hashCode() {
        Object obj;
        ensureAllocated(false);
        if (this.memory != null) {
            ensureAllocated(false);
            obj = this.memory;
        } else {
            obj = getClass();
        }
        return obj.hashCode();
    }

    public void setFieldValue(Field field, Object obj) throws IllegalAccessException, IllegalArgumentException {
        setFieldValue(field, obj, false);
    }

    public void sortFields(List<Field> list, List<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            String strA0n = C60Q.A0n(list2, i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (strA0n.equals(list.get(i2).getName())) {
                    Collections.swap(list, i, i2);
                    break;
                }
                i2++;
            }
        }
    }

    public Structure[] toArray(Structure[] structureArr) {
        ensureAllocated(false);
        Pointer pointer = this.memory;
        if (pointer instanceof AutoAllocated) {
            int length = structureArr.length;
            ensureAllocated(false);
            int i = length * this.size;
            if (((Memory) pointer).size < i) {
                useMemory(new AutoAllocated(i), 0);
            }
        }
        structureArr[0] = this;
        ensureAllocated(false);
        int i2 = this.size;
        for (int i3 = 1; i3 < structureArr.length; i3++) {
            Structure structureNewInstance = newInstance((Class<Structure>) getClass(), this.memory.share(i3 * i2, i2));
            structureArr[i3] = structureNewInstance;
            structureNewInstance.conditionalAutoRead();
        }
        if (!(this instanceof ByValue)) {
            this.array = structureArr;
        }
        return structureArr;
    }

    public String toString(boolean z) {
        return toString(0, true, z);
    }

    public void useMemory(Pointer pointer) {
        useMemory(pointer, 0);
    }

    public void writeField(String str) {
        ensureAllocated(false);
        StructField structField = this.structFields.get(str);
        if (structField == null) {
            throw C60Q.A0U("No such field: ", str);
        }
        writeField(structField);
    }

    public class LayoutInfo {
        public int alignType;
        public int alignment;
        public final Map<String, StructField> fields;
        public int size;
        public TypeMapper typeMapper;
        public boolean variable;

        public LayoutInfo() {
            this.size = -1;
            this.alignment = 1;
            this.fields = Collections.synchronizedMap(C3cG.A0j());
            this.alignType = 0;
        }
    }

    public class NativeStringTracking {
        public NativeString peer;
        public final Object value;

        public NativeStringTracking(Object obj) {
            this.value = obj;
        }
    }

    public class StructField {
        public FromNativeContext context;
        public Field field;
        public boolean isReadOnly;
        public boolean isVolatile;
        public String name;
        public FromNativeConverter readConverter;
        public Class<?> type;
        public ToNativeConverter writeConverter;
        public int size = -1;
        public int offset = -1;

        public String toString() {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(this.name);
            sbA0w.append("@");
            sbA0w.append(this.offset);
            sbA0w.append("[");
            sbA0w.append(this.size);
            sbA0w.append("] (");
            sbA0w.append(this.type);
            return BV7.A10(sbA0w);
        }
    }

    private int addPadding(int i) {
        return addPadding(i, this.structAlignment);
    }

    private Class<?> baseClass() {
        if ((this instanceof ByReference) || (this instanceof ByValue)) {
            Class<?> cls = getClass();
            if (BV6.A1X(cls.getSuperclass())) {
                return cls.getSuperclass();
            }
        }
        return getClass();
    }

    public static Set<Structure> busy() {
        return busy.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sun.jna.Structure.LayoutInfo deriveLayout(boolean r16, boolean r17) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Structure.deriveLayout(boolean, boolean):com.sun.jna.Structure$LayoutInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureAllocated(boolean z) {
        if (this.memory == null) {
            allocateMemory(z);
            return;
        }
        if (this.size == -1) {
            int iCalculateSize = calculateSize(true, z);
            this.size = iCalculateSize;
            Pointer pointer = this.memory;
            if (pointer instanceof AutoAllocated) {
                return;
            }
            try {
                this.memory = pointer.share(0L, iCalculateSize);
            } catch (IndexOutOfBoundsException e) {
                throw BV4.A0Q("Structure exceeds provided memory bounds", e);
            }
        }
    }

    private void initializeTypeMapper(TypeMapper typeMapper) {
        if (typeMapper == null) {
            typeMapper = Native.getTypeMapper(getClass());
        }
        this.typeMapper = typeMapper;
        layoutChanged();
    }

    private void layoutChanged() {
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof AutoAllocated) {
                this.memory = null;
            }
            ensureAllocated(false);
        }
    }

    public static Map<Pointer, Structure> reading() {
        return reads.get();
    }

    public static void structureArrayCheck(Structure[] structureArr) {
        if (BV6.A1Y(ByReference[].class, structureArr)) {
            return;
        }
        Structure structure = structureArr[0];
        structure.ensureAllocated(false);
        Pointer pointer = structure.memory;
        Structure structure2 = structureArr[0];
        structure2.ensureAllocated(false);
        int i = structure2.size;
        for (int i2 = 1; i2 < structureArr.length; i2++) {
            Structure structure3 = structureArr[i2];
            structure3.ensureAllocated(false);
            if (structure3.memory.peer != pointer.peer + (i * i2)) {
                throw BV5.A0S("Structure array elements must use contiguous memory (bad backing address at Structure array index ", ")", i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends com.sun.jna.Structure> T updateStructureByReference(java.lang.Class<T> r1, T r2, com.sun.jna.Pointer r3) {
        /*
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            if (r2 == 0) goto L12
            r0 = 0
            r2.ensureAllocated(r0)
            com.sun.jna.Pointer r0 = r2.memory
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
        L12:
            java.util.Map r0 = reading()
            java.lang.Object r2 = r0.get(r3)
            com.sun.jna.Structure r2 = (com.sun.jna.Structure) r2
            if (r2 == 0) goto L2c
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
        L28:
            r2.autoRead()
            return r2
        L2c:
            com.sun.jna.Structure r2 = newInstance(r1, r3)
            r2.conditionalAutoRead()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Structure.updateStructureByReference(java.lang.Class, com.sun.jna.Structure, com.sun.jna.Pointer):com.sun.jna.Structure");
    }

    private void validateField(String str, Class<?> cls) {
        Class<?> componentType;
        ToNativeConverter toNativeConverter;
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
            componentType = toNativeConverter.nativeType();
        } else {
            if (!cls.isArray()) {
                try {
                    Native.getNativeSize(cls, null);
                    return;
                } catch (IllegalArgumentException e) {
                    StringBuilder sbA13 = BV8.A13(this, "Invalid Structure field in ");
                    sbA13.append(", field name '");
                    sbA13.append(str);
                    sbA13.append("' (");
                    sbA13.append(cls);
                    sbA13.append("): ");
                    throw BV4.A0Q(AnonymousClass001.A0v(e.getMessage(), sbA13), e);
                }
            }
            componentType = cls.getComponentType();
        }
        validateField(str, componentType);
    }

    private void validateFields() {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        BV4.A1S(reentrantReadWriteLock);
        try {
            Map<Class<?>, Boolean> map = validationMap;
            Class<?> cls = getClass();
            boolean zContainsKey = map.containsKey(cls);
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (zContainsKey) {
                lock.unlock();
                return;
            }
            lock.unlock();
            BV4.A1T(reentrantReadWriteLock);
            try {
                map.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f$0.m3898lambda$validateFields$0$comsunjnaStructure((Class) obj);
                    }
                });
            } finally {
                BV4.A1Q(reentrantReadWriteLock);
            }
        } catch (Throwable th) {
            BV4.A1R(reentrantReadWriteLock);
            throw th;
        }
    }

    public Memory autoAllocate(int i) {
        return new AutoAllocated(i);
    }

    public void cacheTypeInfo(Pointer pointer) {
        this.typeInfo = pointer.peer;
    }

    public void conditionalAutoRead() {
        if (this.readCalled) {
            return;
        }
        autoRead();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Structure) && obj.getClass() == getClass()) {
            Structure structure = (Structure) obj;
            structure.ensureAllocated(false);
            Pointer pointer = structure.memory;
            ensureAllocated(false);
            if (pointer.equals(this.memory)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, StructField> fields() {
        return this.structFields;
    }

    public boolean getAutoRead() {
        return this.autoRead;
    }

    public boolean getAutoWrite() {
        return this.autoWrite;
    }

    public FFIType getFieldTypeInfo(StructField structField) {
        ToNativeConverter toNativeConverter;
        Class<?> clsNativeType = structField.type;
        Object fieldValue = getFieldValue(structField.field);
        TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(clsNativeType)) != null) {
            clsNativeType = toNativeConverter.nativeType();
            fieldValue = toNativeConverter.toNative(fieldValue, new ToNativeContext());
        }
        return FFIType.get(fieldValue, clsNativeType);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getNativeAlignment(java.lang.Class<?> r4, java.lang.Object r5, boolean r6) {
        /*
            r3 = this;
            java.lang.Class<com.sun.jna.NativeMapped> r0 = com.sun.jna.NativeMapped.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L19
            com.sun.jna.NativeMappedConverter r1 = com.sun.jna.NativeMappedConverter.getInstance(r4)
            java.lang.Class r4 = r1.nativeType()
            com.sun.jna.ToNativeContext r0 = new com.sun.jna.ToNativeContext
            r0.<init>()
            java.lang.Object r5 = r1.toNative(r5, r0)
        L19:
            int r2 = com.sun.jna.Native.getNativeSize(r4, r5)
            boolean r0 = r4.isPrimitive()
            if (r0 != 0) goto L8b
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r0 == r4) goto L8b
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r0 == r4) goto L8b
            java.lang.Class<com.sun.jna.Pointer> r0 = com.sun.jna.Pointer.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L53
            java.lang.Class<com.sun.jna.Function> r0 = com.sun.jna.Function.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto Laa
        L53:
            boolean r0 = com.sun.jna.Platform.HAS_BUFFERS
            if (r0 == 0) goto L5f
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto Laa
        L5f:
            java.lang.Class<com.sun.jna.Callback> r0 = com.sun.jna.Callback.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto Laa
            java.lang.Class<com.sun.jna.WString> r0 = com.sun.jna.WString.class
            if (r0 == r4) goto Laa
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r0 == r4) goto Laa
            boolean r0 = X.BV6.A1X(r4)
            if (r0 == 0) goto L9a
            java.lang.Class<com.sun.jna.Structure$ByReference> r0 = com.sun.jna.Structure.ByReference.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto Laa
            if (r5 != 0) goto L85
            com.sun.jna.Pointer r0 = com.sun.jna.Structure.PLACEHOLDER_MEMORY
            com.sun.jna.Structure r5 = newInstance(r4, r0)
        L85:
            com.sun.jna.Structure r5 = (com.sun.jna.Structure) r5
            int r2 = r5.getStructAlignment()
        L8b:
            int r1 = r3.actualAlignType
            r0 = 1
            if (r1 == r0) goto L99
            r0 = 3
            if (r1 != r0) goto Lad
            r0 = 8
            int r0 = java.lang.Math.min(r0, r2)
        L99:
            return r0
        L9a:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto Ldc
            java.lang.Class r1 = r4.getComponentType()
            r0 = 0
            int r2 = r3.getNativeAlignment(r1, r0, r6)
            goto L8b
        Laa:
            int r2 = com.sun.jna.Native.POINTER_SIZE
            goto L8b
        Lad:
            r0 = 2
            if (r1 != r0) goto Ldb
            if (r6 == 0) goto Lc0
            int r0 = com.sun.jna.Platform.osType
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 == 0) goto Lc0
            boolean r0 = com.sun.jna.Platform.isPPC()
            if (r0 != 0) goto Ldb
        Lc0:
            int r0 = com.sun.jna.Native.MAX_ALIGNMENT
            int r2 = java.lang.Math.min(r0, r2)
            if (r6 != 0) goto Ldb
            int r1 = com.sun.jna.Platform.osType
            r0 = 7
            boolean r0 = X.AnonymousClass002.A1Q(r1, r0)
            if (r0 == 0) goto Ldb
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r4 == r0) goto Ld9
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r4 != r0) goto Ldb
        Ld9:
            r0 = 4
            return r0
        Ldb:
            return r2
        Ldc:
            java.lang.String r0 = "Type "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r4, r0)
            java.lang.String r0 = " has unknown native alignment"
            java.lang.IllegalArgumentException r0 = X.C8j3.A0w(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Structure.getNativeAlignment(java.lang.Class, java.lang.Object, boolean):int");
    }

    public String getStringEncoding() {
        return this.encoding;
    }

    public int getStructAlignment() {
        if (this.size == -1) {
            calculateSize(true, false);
        }
        return this.structAlignment;
    }

    public TypeMapper getTypeMapper() {
        return this.typeMapper;
    }

    public void read() {
        if (this.memory != PLACEHOLDER_MEMORY) {
            this.readCalled = true;
            ensureAllocated(false);
            if (busy().add(this)) {
                boolean z = this instanceof ByReference;
                if (z) {
                    Map<Pointer, Structure> map = reading();
                    ensureAllocated(false);
                    map.put(this.memory, this);
                }
                try {
                    Iterator itA10 = BV5.A10(this.structFields);
                    while (itA10.hasNext()) {
                        readField((StructField) itA10.next());
                    }
                } finally {
                    busy().remove(this);
                    if (z) {
                        Map<Pointer, Structure> map2 = reading();
                        ensureAllocated(false);
                        if (map2.get(this.memory) == this) {
                            Map<Pointer, Structure> map3 = reading();
                            ensureAllocated(false);
                            map3.remove(this.memory);
                        }
                    }
                }
            }
        }
    }

    public Object readField(StructField structField) throws IllegalAccessException, IllegalArgumentException {
        int i = structField.offset;
        Class<?> clsNativeType = structField.type;
        FromNativeConverter fromNativeConverter = structField.readConverter;
        if (fromNativeConverter != null) {
            clsNativeType = fromNativeConverter.nativeType();
        }
        Object value = null;
        Object fieldValue = (BV6.A1X(clsNativeType) || Callback.class.isAssignableFrom(clsNativeType) || (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(clsNativeType)) || Pointer.class.isAssignableFrom(clsNativeType) || NativeMapped.class.isAssignableFrom(clsNativeType) || clsNativeType.isArray()) ? getFieldValue(structField.field) : null;
        Pointer pointer = this.memory;
        long j = i;
        if (clsNativeType == String.class) {
            Pointer pointer2 = pointer.getPointer(j);
            if (pointer2 != null) {
                value = pointer2.getString(0L, this.encoding);
            }
        } else {
            value = pointer.getValue(j, clsNativeType, fieldValue);
        }
        if (fromNativeConverter != null) {
            Object objFromNative = fromNativeConverter.fromNative(value, structField.context);
            if (fieldValue == null || !fieldValue.equals(objFromNative)) {
                fieldValue = objFromNative;
            }
        } else {
            fieldValue = value;
        }
        if (clsNativeType.equals(String.class) || clsNativeType.equals(WString.class)) {
            if (fieldValue != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(fieldValue);
                NativeStringTracking nativeStringTrackingPut = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (nativeStringTrackingPut != null) {
                    nativeStringTracking.peer = nativeStringTrackingPut.peer;
                }
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        setFieldValue(structField.field, fieldValue, true);
        return fieldValue;
    }

    public void setAlignType(int i) {
        this.alignType = i;
        if (i == 0 && (i = Native.getStructureAlignment(getClass())) == 0) {
            i = 2;
            if (Platform.isWindows()) {
                i = 3;
            }
        }
        this.actualAlignType = i;
        layoutChanged();
    }

    public void setAutoSynch(boolean z) {
        this.autoRead = z;
        this.autoWrite = z;
    }

    public void write() {
        if (this.memory != PLACEHOLDER_MEMORY) {
            ensureAllocated(false);
            if (this instanceof ByValue) {
                getTypeInfo();
            }
            if (busy().add(this)) {
                try {
                    Iterator itA10 = BV5.A10(this.structFields);
                    while (itA10.hasNext()) {
                        StructField structField = (StructField) itA10.next();
                        if (!structField.isVolatile) {
                            writeField(structField);
                        }
                    }
                } finally {
                    busy().remove(this);
                }
            }
        }
    }

    public static void autoRead(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoRead();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoRead();
            }
        }
    }

    public static void autoWrite(Structure[] structureArr) {
        structureArrayCheck(structureArr);
        Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoWrite();
            return;
        }
        for (Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoWrite();
            }
        }
    }

    public static List<String> createFieldsOrder(String str) {
        return Collections.unmodifiableList(Collections.singletonList(str));
    }

    private List<String> fieldOrder() {
        Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        BV4.A1S(reentrantReadWriteLock);
        try {
            Map<Class<?>, List<String>> map = fieldOrder;
            List<String> listA0z = BV4.A0z(cls, map);
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (listA0z != null) {
                lock.unlock();
                return listA0z;
            }
            lock.unlock();
            BV4.A1T(reentrantReadWriteLock);
            try {
                return map.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f$0.getFieldOrder();
                    }
                });
            } finally {
                BV4.A1Q(reentrantReadWriteLock);
            }
        } catch (Throwable th) {
            BV4.A1R(reentrantReadWriteLock);
            throw th;
        }
    }

    private String format(Class<?> cls) {
        String name = cls.getName();
        return BV4.A0g(name.lastIndexOf("."), name);
    }

    public static <T> Constructor<T> getPointerConstructor(Class<T> cls) throws SecurityException {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(Pointer.class)) {
                return constructor;
            }
        }
        return null;
    }

    public static FFIType getTypeInfo(Object obj) {
        return FFIType.get(obj);
    }

    private Object initializeField(Field field, Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        if (!BV6.A1X(cls) || ByReference.class.isAssignableFrom(cls)) {
            if (!NativeMapped.class.isAssignableFrom(cls)) {
                return null;
            }
            NativeMapped nativeMappedDefaultValue = NativeMappedConverter.getInstance(cls).defaultValue();
            setFieldValue(field, nativeMappedDefaultValue);
            return nativeMappedDefaultValue;
        }
        try {
            Structure structureNewInstance = newInstance((Class<Structure>) cls, PLACEHOLDER_MEMORY);
            setFieldValue(field, structureNewInstance);
            return structureNewInstance;
        } catch (IllegalArgumentException e) {
            throw BV4.A0Q("Can't determine size of nested structure", e);
        }
    }

    private void initializeFields() {
        for (Field field : getFieldList()) {
            try {
                if (field.get(this) == null) {
                    initializeField(field, field.getType());
                }
            } catch (Exception e) {
                StringBuilder sbA14 = BV8.A14("Exception reading field '", field);
                BV7.A1C(this, "' in ", sbA14);
                throw new Error(sbA14.toString(), e);
            }
        }
    }

    public static /* synthetic */ List lambda$getFieldList$0(Class cls, Class cls2) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        while (!cls.equals(Structure.class)) {
            for (Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                    arrayListA0h2.add(field);
                }
            }
            arrayListA0h.addAll(0, arrayListA0h2);
            arrayListA0h2.clear();
            cls = cls.getSuperclass();
        }
        return arrayListA0h;
    }

    public static <T extends Structure> T newInstance(Class<T> cls) {
        T t = (T) Klass.newInstance(cls);
        if (t instanceof ByValue) {
            t.allocateMemory(false);
        }
        return t;
    }

    public static <T extends Comparable<T>> List<T> sort(Collection<? extends T> collection) {
        ArrayList arrayListA0t = BV4.A0t(collection);
        Collections.sort(arrayListA0t);
        return arrayListA0t;
    }

    public List<Field> getFieldList() {
        final Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        BV4.A1S(reentrantReadWriteLock);
        try {
            Map<Class<?>, List<Field>> map = fieldList;
            List<Field> listA0z = BV4.A0z(cls, map);
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (listA0z != null) {
                lock.unlock();
                return listA0z;
            }
            lock.unlock();
            BV4.A1T(reentrantReadWriteLock);
            try {
                return map.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda2
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Structure.lambda$getFieldList$0(cls, (Class) obj);
                    }
                });
            } finally {
                BV4.A1Q(reentrantReadWriteLock);
            }
        } catch (Throwable th) {
            BV4.A1R(reentrantReadWriteLock);
            throw th;
        }
    }

    public List<String> getFieldOrder() {
        LinkedList linkedListA0y = BV4.A0y();
        for (Class<?> superclass = getClass(); superclass != Structure.class; superclass = superclass.getSuperclass()) {
            FieldOrder fieldOrder2 = (FieldOrder) superclass.getAnnotation(FieldOrder.class);
            if (fieldOrder2 != null) {
                linkedListA0y.addAll(0, Arrays.asList(fieldOrder2.value()));
            }
        }
        return Collections.unmodifiableList(linkedListA0y);
    }

    public Object getFieldValue(Field field) {
        try {
            return field.get(this);
        } catch (Exception e) {
            StringBuilder sbA14 = BV8.A14("Exception reading field '", field);
            BV7.A1C(this, "' in ", sbA14);
            throw new Error(sbA14.toString(), e);
        }
    }

    public List<Field> getFields(boolean z) {
        ArrayList arrayListA0t = BV4.A0t(getFieldList());
        HashSet hashSetA13 = C60O.A13();
        Iterator it = arrayListA0t.iterator();
        while (it.hasNext()) {
            hashSetA13.add(((Field) it.next()).getName());
        }
        List<String> listFieldOrder = fieldOrder();
        if (listFieldOrder.size() == arrayListA0t.size() || arrayListA0t.size() <= 1) {
            if (BV4.A0x(listFieldOrder).equals(hashSetA13)) {
                sortFields(arrayListA0t, listFieldOrder);
                return arrayListA0t;
            }
            StringBuilder sbA13 = BV8.A13(this, "Structure.getFieldOrder() on ");
            BV8.A1M(" returns names (", sbA13, listFieldOrder);
            BV8.A1M(") which do not match declared field names (", sbA13, hashSetA13);
            throw new Error(AnonymousClass001.A0v(")", sbA13));
        }
        if (!z) {
            return null;
        }
        StringBuilder sbA132 = BV8.A13(this, "Structure.getFieldOrder() on ");
        sbA132.append(listFieldOrder.size() < arrayListA0t.size() ? " does not provide enough" : " provides too many");
        sbA132.append(" names [");
        sbA132.append(listFieldOrder.size());
        BV8.A1M("] (", sbA132, listFieldOrder);
        sbA132.append(") to match declared fields [");
        sbA132.append(arrayListA0t.size());
        BV8.A1M("] (", sbA132, hashSetA13);
        throw new Error(AnonymousClass001.A0v(")", sbA132));
    }

    /* renamed from: lambda$fieldOrder$0$com-sun-jna-Structure, reason: not valid java name */
    public /* synthetic */ List m3897lambda$fieldOrder$0$comsunjnaStructure(Class cls) {
        return getFieldOrder();
    }

    /* renamed from: lambda$validateFields$0$com-sun-jna-Structure, reason: not valid java name */
    public /* synthetic */ Boolean m3898lambda$validateFields$0$comsunjnaStructure(Class cls) {
        for (Field field : getFieldList()) {
            validateField(field.getName(), field.getType());
        }
        return AnonymousClass001.A0i();
    }

    public void setAutoRead(boolean z) {
        this.autoRead = z;
    }

    public void setAutoWrite(boolean z) {
        this.autoWrite = z;
    }

    public void setStringEncoding(String str) {
        this.encoding = str;
    }

    public Structure(Pointer pointer, int i, TypeMapper typeMapper) {
        this.size = -1;
        this.nativeStrings = BV4.A0v(8);
        this.autoRead = true;
        this.autoWrite = true;
        setAlignType(i);
        this.encoding = Native.getStringEncoding(getClass());
        initializeTypeMapper(typeMapper);
        validateFields();
        if (pointer != null) {
            useMemory(pointer, 0, true);
        } else {
            allocateMemory(-1);
        }
        initializeFields();
    }

    private int addPadding(int i, int i2) {
        int i3;
        if (this.actualAlignType != 1 && (i3 = i % i2) != 0) {
            return i + (i2 - i3);
        }
        return i;
    }

    private void allocateMemory(boolean z) {
        allocateMemory(calculateSize(true, z));
    }

    public static List<String> createFieldsOrder(List<String> list, List<String> list2) {
        ArrayList arrayListA11 = C60O.A11(list.size() + list2.size());
        arrayListA11.addAll(list);
        arrayListA11.addAll(list2);
        return Collections.unmodifiableList(arrayListA11);
    }

    public static <T extends Structure> T newInstance(Class<T> cls, Pointer pointer) {
        try {
            Constructor pointerConstructor = getPointerConstructor(cls);
            if (pointerConstructor != null) {
                return (T) pointerConstructor.newInstance(pointer);
            }
        } catch (IllegalAccessException e) {
            throw BV4.A0Q(AnonymousClass001.A0v(" (Pointer) not allowed, is it public?", C3cG.A0f(cls, "Instantiation of ")), e);
        } catch (InstantiationException e2) {
            throw BV4.A0Q(AnonymousClass007.A0a("Can't instantiate ", cls), e2);
        } catch (SecurityException unused) {
        } catch (InvocationTargetException e3) {
            throw BV4.A0Q(AnonymousClass007.A0a("Exception thrown while instantiating an instance of ", cls), e3);
        }
        T t = (T) newInstance(cls);
        if (pointer != PLACEHOLDER_MEMORY) {
            t.useMemory(pointer, 0);
        }
        return t;
    }

    private void setFieldValue(Field field, Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException {
        try {
            field.set(this, obj);
        } catch (IllegalAccessException e) {
            if (Modifier.isFinal(field.getModifiers())) {
                if (z) {
                    StringBuilder sbA14 = BV8.A14("This VM does not support Structures with final fields (field '", field);
                    BV7.A1C(this, "' within ", sbA14);
                    throw new UnsupportedOperationException(BV7.A10(sbA14), e);
                }
                StringBuilder sbA142 = BV8.A14("Attempt to write to read-only field '", field);
                BV7.A1C(this, "' within ", sbA142);
                throw new UnsupportedOperationException(sbA142.toString(), e);
            }
            StringBuilder sbA143 = BV8.A14("Unexpectedly unable to write to field '", field);
            BV7.A1C(this, "' within ", sbA143);
            throw new Error(sbA143.toString(), e);
        }
    }

    public static <T extends Structure> int size(Class<T> cls, T t) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        BV4.A1S(reentrantReadWriteLock);
        try {
            LayoutInfo layoutInfo2 = layoutInfo.get(cls);
            BV4.A1R(reentrantReadWriteLock);
            if (layoutInfo2 == null || layoutInfo2.variable || (i = layoutInfo2.size) == -1) {
                if (t == null) {
                    t = (T) newInstance(cls, PLACEHOLDER_MEMORY);
                }
                t.ensureAllocated(false);
                return t.size;
            }
            return i;
        } catch (Throwable th) {
            BV4.A1R(reentrantReadWriteLock);
            throw th;
        }
    }

    private void writeField(StructField structField, Object obj) {
        String str;
        String strA0M;
        int i = structField.offset;
        Class<?> clsNativeType = structField.type;
        ToNativeConverter toNativeConverter = structField.writeConverter;
        if (toNativeConverter != null) {
            obj = toNativeConverter.toNative(obj, new StructureWriteContext(this, structField.field));
            clsNativeType = toNativeConverter.nativeType();
        }
        if (String.class == clsNativeType || WString.class == clsNativeType) {
            if (obj != null) {
                NativeStringTracking nativeStringTracking = new NativeStringTracking(obj);
                NativeStringTracking nativeStringTrackingPut = this.nativeStrings.put(structField.name, nativeStringTracking);
                if (nativeStringTrackingPut != null && obj.equals(nativeStringTrackingPut.value)) {
                    nativeStringTracking.peer = nativeStringTrackingPut.peer;
                    return;
                }
                String string = obj.toString();
                if (clsNativeType == WString.class) {
                    str = NativeString.WIDE_STRING;
                } else {
                    str = this.encoding;
                }
                NativeString nativeString = new NativeString(string, str);
                nativeStringTracking.peer = nativeString;
                obj = nativeString.pointer;
            } else {
                this.nativeStrings.remove(structField.name);
            }
        }
        try {
            this.memory.setValue(i, obj, clsNativeType);
        } catch (IllegalArgumentException e) {
            StringBuilder sbA0x = C60O.A0x("Structure field \"");
            sbA0x.append(structField.name);
            sbA0x.append("\" was declared as ");
            sbA0x.append(structField.type);
            if (structField.type == clsNativeType) {
                strA0M = "";
            } else {
                strA0M = C3cJ.A0M(" (native type ", clsNativeType);
            }
            sbA0x.append(strA0M);
            throw BV4.A0Q(AnonymousClass001.A0v(", which is not supported within a Structure", sbA0x), e);
        }
    }

    public void autoRead() {
        if (this.autoRead) {
            read();
            if (this.array != null) {
                int i = 1;
                while (true) {
                    Structure[] structureArr = this.array;
                    if (i < structureArr.length) {
                        structureArr[i].autoRead();
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void autoWrite() {
        if (this.autoWrite) {
            write();
            if (this.array != null) {
                int i = 1;
                while (true) {
                    Structure[] structureArr = this.array;
                    if (i < structureArr.length) {
                        structureArr[i].autoWrite();
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public int calculateSize(boolean z, boolean z2) {
        Class<?> cls = getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = cacheStructureLock;
        BV4.A1S(reentrantReadWriteLock);
        try {
            Map<Class<?>, LayoutInfo> map = layoutInfo;
            LayoutInfo layoutInfoDeriveLayout = map.get(cls);
            if ((layoutInfoDeriveLayout == null || this.alignType != layoutInfoDeriveLayout.alignType || this.typeMapper != layoutInfoDeriveLayout.typeMapper) && (layoutInfoDeriveLayout = deriveLayout(z, z2)) == null) {
                return -1;
            }
            this.structAlignment = layoutInfoDeriveLayout.alignment;
            this.structFields = layoutInfoDeriveLayout.fields;
            if (!layoutInfoDeriveLayout.variable) {
                BV4.A1S(reentrantReadWriteLock);
                if (!map.containsKey(cls) || this.alignType != 0 || this.typeMapper != null) {
                    BV4.A1R(reentrantReadWriteLock);
                    BV4.A1T(reentrantReadWriteLock);
                    map.put(cls, layoutInfoDeriveLayout);
                    BV4.A1S(reentrantReadWriteLock);
                    BV4.A1Q(reentrantReadWriteLock);
                }
            }
            return layoutInfoDeriveLayout.size;
        } finally {
            BV4.A1R(reentrantReadWriteLock);
        }
    }

    public boolean dataEquals(Structure structure, boolean z) {
        if (z) {
            structure.ensureAllocated(false);
            Pointer pointer = structure.memory;
            structure.ensureAllocated(false);
            pointer.clear(structure.size);
            structure.write();
            ensureAllocated(false);
            Pointer pointer2 = this.memory;
            ensureAllocated(false);
            pointer2.clear(this.size);
            write();
        }
        structure.ensureAllocated(false);
        Pointer pointer3 = structure.memory;
        structure.ensureAllocated(false);
        byte[] byteArray = pointer3.getByteArray(0L, structure.size);
        ensureAllocated(false);
        Pointer pointer4 = this.memory;
        ensureAllocated(false);
        byte[] byteArray2 = pointer4.getByteArray(0L, this.size);
        int length = byteArray.length;
        if (length != byteArray2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (byteArray[i] != byteArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public void ensureAllocated() {
        ensureAllocated(false);
    }

    public int getNativeSize(Class<?> cls, Object obj) {
        return Native.getNativeSize(cls, obj);
    }

    public Pointer getTypeInfo() {
        FFIType fFIType = FFIType.get(this);
        fFIType.ensureAllocated(false);
        Pointer pointer = fFIType.memory;
        cacheTypeInfo(pointer);
        return pointer;
    }

    public Object readField(String str) {
        ensureAllocated(false);
        StructField structField = this.structFields.get(str);
        if (structField != null) {
            return readField(structField);
        }
        throw C60Q.A0U("No such field: ", str);
    }

    public Structure[] toArray(int i) {
        Structure[] structureArr = (Structure[]) Array.newInstance(getClass(), i);
        toArray(structureArr);
        return structureArr;
    }

    public void useMemory(Pointer pointer, int i, boolean z) {
        try {
            this.nativeStrings.clear();
            if (!(this instanceof ByValue) || z) {
                int iCalculateSize = this.size;
                if (iCalculateSize == -1) {
                    iCalculateSize = calculateSize(false, false);
                    this.size = iCalculateSize;
                }
                if (iCalculateSize != -1) {
                    this.memory = pointer.share(i, iCalculateSize);
                } else {
                    this.memory = pointer.share(i);
                }
            } else {
                ensureAllocated(false);
                int i2 = this.size;
                byte[] bArr = new byte[i2];
                pointer.read(0L, bArr, 0, i2);
                this.memory.write(0L, bArr, 0, i2);
            }
            this.array = null;
            this.readCalled = false;
        } catch (IndexOutOfBoundsException e) {
            throw BV4.A0Q("Structure exceeds provided memory bounds", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String toString(int r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Structure.toString(int, boolean, boolean):java.lang.String");
    }

    public Structure(int i, TypeMapper typeMapper) {
        this(null, i, typeMapper);
    }

    public static List<String> createFieldsOrder(List<String> list, String... strArr) {
        return createFieldsOrder(list, (List<String>) Arrays.asList(strArr));
    }

    public static <T extends Structure> T newInstance(Class<T> cls, long j) {
        Pointer pointer;
        try {
            if (j != 0) {
                pointer = new Pointer(j);
            } else {
                pointer = PLACEHOLDER_MEMORY;
            }
            T t = (T) newInstance(cls, pointer);
            if (j != 0) {
                t.conditionalAutoRead();
            }
            return t;
        } catch (Throwable th) {
            LOG.log(Level.WARNING, "JNA: Error creating structure", th);
            return null;
        }
    }

    public void allocateMemory() {
        allocateMemory(false);
    }

    public int size() {
        ensureAllocated(false);
        return this.size;
    }

    public String toString() {
        return toString(Boolean.getBoolean("jna.dump_memory"));
    }

    public void useMemory(Pointer pointer, int i) {
        useMemory(pointer, i, false);
    }

    public void writeField(String str, Object obj) throws IllegalAccessException, IllegalArgumentException {
        ensureAllocated(false);
        StructField structField = this.structFields.get(str);
        if (structField != null) {
            setFieldValue(structField.field, obj);
            writeField(structField, obj);
            return;
        }
        throw C60Q.A0U("No such field: ", str);
    }

    public Structure(Pointer pointer, int i) {
        this(pointer, i, null);
    }

    public static List<String> createFieldsOrder(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public void writeField(StructField structField) {
        if (!structField.isReadOnly) {
            writeField(structField, getFieldValue(structField.field));
        }
    }

    public Structure() {
        this((Pointer) null, 0);
    }

    public Structure(int i) {
        this((Pointer) null, i);
    }

    public Structure(Pointer pointer) {
        this(pointer, 0);
    }
}
