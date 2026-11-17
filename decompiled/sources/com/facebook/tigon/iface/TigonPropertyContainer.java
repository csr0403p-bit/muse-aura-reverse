package com.facebook.tigon.iface;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV5;
import X.BV6;
import X.C0861A6i;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.C9uG;
import X.C9uT;
import X.CY4;
import X.CY6;
import X.CY7;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class TigonPropertyContainer {
    public static final byte BOOLEAN = 0;
    public static final byte BOOLEAN_MAP = 4;
    public static final byte GROUP_TYPE = 0;
    public static final byte LONG = 1;
    public static final byte LONG_MAP = 5;
    public static final byte STRING = 2;
    public static final byte STRING_MAP = 3;
    public static final byte VALUE_TYPE = 1;
    public final Map<Integer, Object> properties = new LinkedHashMap();

    public final class Group {
        public final Map<Integer, CY6> properties;

        public Group(Group group) {
            C7384Etj.A0Y(group, 0);
            Map<Integer, CY6> map = group.properties;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, CY6> entry : map.entrySet()) {
                Integer key = entry.getKey();
                CY6 value = entry.getValue();
                C7384Etj.A0Y(value, 0);
                linkedHashMap.put(key, new CY6(value.A01, value.A00));
            }
            this(linkedHashMap);
        }

        public static /* synthetic */ void propertiesInternal$annotations() {
        }

        public final void setProperty(CY4 cy4, long j) {
            C7384Etj.A0Y(cy4, 0);
            setProperty(cy4, j, true);
        }

        private final void put(CY4 cy4, CY6 cy6, boolean z) {
            if (z || !this.properties.containsKey(Integer.valueOf(cy4.A00))) {
                this.properties.put(Integer.valueOf(cy4.A00), cy6);
            }
        }

        public final Map<Integer, CY6> getProperties() {
            return Collections.unmodifiableMap(this.properties);
        }

        public final Map<Integer, CY6> propertiesInternal() {
            return this.properties;
        }

        public final <T> T getProperty(CY4 cy4, C9uG<? super T> c9uG) {
            AnonymousClass003.A0u(cy4, c9uG);
            CY6 cy6 = (CY6) BV5.A0f(this.properties, cy4.A00);
            if (cy6 != null) {
                T t = (T) cy6.A01;
                if (C9uT.A02(c9uG).isInstance(t)) {
                    return t;
                }
            }
            return null;
        }

        public final <V> Map<String, V> getPropertyMapView(CY4 cy4, C9uG<V> c9uG) {
            AnonymousClass003.A0u(cy4, c9uG);
            return TigonPropertyContainer.A00((CY6) BV5.A0f(this.properties, cy4.A00), c9uG);
        }

        public final void setBooleanMapProperty(CY4 cy4, Map<String, Boolean> map) {
            setBooleanMapProperty(cy4, map, C60P.A1Y(cy4, map));
        }

        public final void setLongMapProperty(CY4 cy4, Map<String, Long> map) {
            setLongMapProperty(cy4, map, C60P.A1Y(cy4, map));
        }

        public Group(Map<Integer, CY6> map) {
            C7384Etj.A0Y(map, 0);
            this.properties = map;
        }

        public final void setBooleanMapProperty(CY4 cy4, Map<String, Boolean> map, boolean z) {
            AnonymousClass003.A0u(cy4, map);
            put(cy4, new CY6(BV5.A15(map), (byte) 4), z);
        }

        public final void setLongMapProperty(CY4 cy4, Map<String, Long> map, boolean z) {
            AnonymousClass003.A0u(cy4, map);
            put(cy4, new CY6(BV5.A15(map), (byte) 5), z);
        }

        public final void setProperty(CY4 cy4, Map<String, String> map, boolean z) {
            AnonymousClass003.A0u(cy4, map);
            put(cy4, new CY6(BV5.A15(map), (byte) 3), z);
        }

        public Group() {
            this(new LinkedHashMap());
        }

        public final void setProperty(CY4 cy4, boolean z) {
            C7384Etj.A0Y(cy4, 0);
            setProperty(cy4, z, true);
        }

        public final void setProperty(CY4 cy4, String str, boolean z) {
            C7384Etj.A0Y(cy4, 0);
            C7384Etj.A0Y(str, 1);
            put(cy4, new CY6(str, (byte) 2), z);
        }

        public final void setProperty(CY4 cy4, boolean z, boolean z2) {
            C7384Etj.A0Y(cy4, 0);
            put(cy4, new CY6(Boolean.valueOf(z), (byte) 0), z2);
        }

        public final void setProperty(CY4 cy4, String str) {
            setProperty(cy4, str, C60P.A1Y(cy4, str));
        }

        public final void setProperty(CY4 cy4, Map<String, String> map) {
            setProperty(cy4, map, C60P.A1Y(cy4, map));
        }

        public final void setProperty(CY4 cy4, long j, boolean z) {
            C7384Etj.A0Y(cy4, 0);
            put(cy4, new CY6(Long.valueOf(j), (byte) 1), z);
        }
    }

    public static /* synthetic */ void propertiesInternal$annotations() {
    }

    public final void copyPropertiesTo(TigonPropertyContainer tigonPropertyContainer) {
        Object group;
        C7384Etj.A0Y(tigonPropertyContainer, 0);
        for (Map.Entry<Integer, Object> entry : this.properties.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Object value = entry.getValue();
            Map<Integer, Object> map = tigonPropertyContainer.properties;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (value instanceof CY6) {
                CY6 cy6 = (CY6) value;
                C7384Etj.A0Y(cy6, 0);
                group = new CY6(cy6.A01, cy6.A00);
            } else {
                if (!(value instanceof Group)) {
                    C0861A6i c0861A6i = new C0861A6i(value.getClass());
                    StringBuilder sb = new StringBuilder("Unexpected property type: ");
                    sb.append(c0861A6i);
                    throw new IllegalStateException(sb.toString());
                }
                group = new Group((Group) value);
            }
            map.put(numValueOf, group);
        }
    }

    public final Group getPropertyGroupCopyOrEmpty(CY4 cy4) {
        Group group;
        C7384Etj.A0Y(cy4, 0);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        return (!(objA0f instanceof Group) || (group = (Group) objA0f) == null) ? new Group() : new Group(group);
    }

    public final CY7 getPropertyGroupView(CY4 cy4) {
        Group group;
        C7384Etj.A0Y(cy4, 0);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        if (!(objA0f instanceof Group) || (group = (Group) objA0f) == null) {
            return null;
        }
        return new CY7(group);
    }

    public final void setProperty(CY4 cy4, long j) {
        C7384Etj.A0Y(cy4, 0);
        setProperty(cy4, j, true);
    }

    public final void setPropertyGroup(CY4 cy4, Group group) {
        C7384Etj.A0Y(cy4, 0);
        C7384Etj.A0Y(group, 1);
        this.properties.put(Integer.valueOf(cy4.A00), new Group(group));
    }

    private final void put(CY4 cy4, CY6 cy6, boolean z) {
        if (z || !this.properties.containsKey(Integer.valueOf(cy4.A00))) {
            this.properties.put(Integer.valueOf(cy4.A00), cy6);
        }
    }

    public static /* synthetic */ void setBooleanMapProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
        }
        tigonPropertyContainer.setBooleanMapProperty(cy4, map, BV6.A1U(i, z));
    }

    public static /* synthetic */ void setLongMapProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
        }
        tigonPropertyContainer.setLongMapProperty(cy4, map, BV6.A1U(i, z));
    }

    public static /* synthetic */ void setProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
        }
        tigonPropertyContainer.setProperty(cy4, j, BV6.A1U(i, z));
    }

    public final Map<Integer, Object> getProperties() {
        return Collections.unmodifiableMap(this.properties);
    }

    public final Map<Integer, Object> propertiesInternal() {
        return this.properties;
    }

    public static final <V> Map<String, V> A00(CY6 cy6, C9uG<V> c9uG) {
        byte b;
        Class clsA02 = C9uT.A02(c9uG);
        if (String.class.equals(clsA02)) {
            b = 3;
        } else {
            if (!Boolean.class.equals(clsA02)) {
                if (Long.class.equals(clsA02)) {
                    b = 5;
                }
                return null;
            }
            b = 4;
        }
        if (cy6 != null && cy6.A00 == b) {
            return (Map) cy6.A01;
        }
        return null;
    }

    public final <T> T getProperty(CY4 cy4, C9uG<? super T> c9uG) {
        CY6 cy6;
        AnonymousClass003.A0u(cy4, c9uG);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        if ((objA0f instanceof CY6) && (cy6 = (CY6) objA0f) != null) {
            T t = (T) cy6.A01;
            if (C9uT.A02(c9uG).isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public final <V> Map<String, V> getPropertyMapView(CY4 cy4, C9uG<V> c9uG) {
        AnonymousClass003.A0u(cy4, c9uG);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        return A00(objA0f instanceof CY6 ? (CY6) objA0f : null, c9uG);
    }

    public final void setBooleanMapProperty(CY4 cy4, Map<String, Boolean> map) {
        setBooleanMapProperty(cy4, map, C60P.A1Y(cy4, map));
    }

    public final void setLongMapProperty(CY4 cy4, Map<String, Long> map) {
        setLongMapProperty(cy4, map, C60P.A1Y(cy4, map));
    }

    public static /* synthetic */ void setProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            tigonPropertyContainer.setProperty(cy4, str, BV6.A1U(i, z));
            return;
        }
        throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
    }

    public final <T> T getProperty(CY4 cy4, CY4 cy42, C9uG<? super T> c9uG) {
        Group group;
        AnonymousClass005.A0x(cy4, cy42, c9uG);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        if (!(objA0f instanceof Group) || (group = (Group) objA0f) == null) {
            return null;
        }
        return (T) group.getProperty(cy42, c9uG);
    }

    public final <V> Map<String, V> getPropertyMapView(CY4 cy4, CY4 cy42, C9uG<V> c9uG) {
        Group group;
        AnonymousClass005.A0x(cy4, cy42, c9uG);
        Object objA0f = BV5.A0f(this.properties, cy4.A00);
        if (!(objA0f instanceof Group) || (group = (Group) objA0f) == null) {
            return null;
        }
        return group.getPropertyMapView(cy42, c9uG);
    }

    public final void setBooleanMapProperty(CY4 cy4, Map<String, Boolean> map, boolean z) {
        AnonymousClass003.A0u(cy4, map);
        put(cy4, new CY6(BV5.A15(map), (byte) 4), z);
    }

    public final void setLongMapProperty(CY4 cy4, Map<String, Long> map, boolean z) {
        AnonymousClass003.A0u(cy4, map);
        put(cy4, new CY6(BV5.A15(map), (byte) 5), z);
    }

    public final void setProperty(CY4 cy4, String str, boolean z) {
        C7384Etj.A0Y(cy4, 0);
        C7384Etj.A0Y(str, 1);
        put(cy4, new CY6(str, (byte) 2), z);
    }

    public static /* synthetic */ void setProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, Map map, boolean z, int i, Object obj) {
        if (obj == null) {
            tigonPropertyContainer.setProperty(cy4, (Map<String, String>) map, BV6.A1U(i, z));
            return;
        }
        throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
    }

    public final void setProperty(CY4 cy4, boolean z) {
        C7384Etj.A0Y(cy4, 0);
        setProperty(cy4, z, true);
    }

    public static /* synthetic */ void setProperty$default(TigonPropertyContainer tigonPropertyContainer, CY4 cy4, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            tigonPropertyContainer.setProperty(cy4, z, BV6.A1U(i, z2));
            return;
        }
        throw C8j3.A18("Super calls with default arguments not supported in this target, function: setProperty");
    }

    public final void setProperty(CY4 cy4, long j, boolean z) {
        C7384Etj.A0Y(cy4, 0);
        put(cy4, new CY6(Long.valueOf(j), (byte) 1), z);
    }

    public final void setProperty(CY4 cy4, boolean z, boolean z2) {
        C7384Etj.A0Y(cy4, 0);
        put(cy4, new CY6(Boolean.valueOf(z), (byte) 0), z2);
    }

    public final void setProperty(CY4 cy4, String str) {
        setProperty(cy4, str, C60P.A1Y(cy4, str));
    }

    public final void setProperty(CY4 cy4, Map<String, String> map) {
        setProperty(cy4, map, C60P.A1Y(cy4, map));
    }

    public final void setProperty(CY4 cy4, Map<String, String> map, boolean z) {
        C7384Etj.A0Y(cy4, 0);
        C7384Etj.A0Y(map, 1);
        put(cy4, new CY6(Collections.unmodifiableMap(new HashMap(map)), (byte) 3), z);
    }
}
