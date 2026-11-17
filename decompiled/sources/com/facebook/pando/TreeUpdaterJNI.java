package com.facebook.pando;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C3cH;
import X.C5119DZv;
import X.C5120DZw;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridClassBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class TreeUpdaterJNI extends HybridClassBase {
    private final native <T extends TreeJNI> T applyToTreeNative(T t);

    private final native void build();

    private final native void initHybridForRawBuilder();

    private final native void initHybridForRawBuilderWithFragment(int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    private final native <T extends TreeJNI> void initHybridForUpdateBuilder(T t);

    private final native <T extends TreeJNI> void initHybridForUpdateBuilderWithFragment(T t, int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    private final native void setBoolean(String str, boolean z);

    private final native void setBooleanList(String str, Iterable<Boolean> iterable);

    private final native void setDouble(String str, double d);

    private final native void setDoubleList(String str, Iterable<Double> iterable);

    private final native void setEmptyList(String str);

    private final native void setInt(String str, int i);

    private final native void setIntList(String str, Iterable<Integer> iterable);

    private final native void setLong(String str, long j);

    private final native void setLongList(String str, Iterable<Long> iterable);

    private final native void setNull(String str);

    private final native void setString(String str, String str2);

    private final native void setStringList(String str, Iterable<String> iterable);

    private final native <T extends TreeUpdaterJNI> void setTreeUpdater(String str, T t);

    private final native <T extends TreeUpdaterJNI> void setTreeUpdaterList(String str, Iterable<? extends T> iterable);

    public final native <T extends TreeJNI> void addAdditionalSnapshot(T t);

    public final <T extends TreeJNI> T applyToTree(T t) {
        C7384Etj.A0Y(t, 0);
        return (T) applyToTreeNative(t);
    }

    public final native <T extends TreeJNI> T treeFromUpdater(Class<T> cls);

    public final native <T extends TreeJNI> T treeFromUpdaterWithBaseState(TreeJNI treeJNI, Class<T> cls);

    static {
        ETi.loadLibrary("pando-jni");
    }

    private final void addArgsByName(Map<String, ? extends Object> map) {
        double dA00;
        String string;
        if (map == null) {
            map = AGH.A0E();
        }
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Object value = entryA0l.getValue();
            if (value == null) {
                setNull(strA0t);
            } else if (value instanceof Integer) {
                setInt(strA0t, AnonymousClass001.A0F(value));
            } else if (value instanceof Long) {
                setLong(strA0t, C3cG.A05(value));
            } else {
                if (value instanceof Double) {
                    dA00 = BV6.A00(value);
                } else if (value instanceof Float) {
                    dA00 = AnonymousClass001.A02(value);
                } else if (value instanceof Boolean) {
                    setBoolean(strA0t, AnonymousClass001.A1X(value));
                } else {
                    if (value instanceof String) {
                        string = (String) value;
                    } else if (value instanceof Enum) {
                        string = value.toString();
                    } else if (value instanceof TreeUpdaterJNI) {
                        setTreeUpdater(strA0t, (TreeUpdaterJNI) value);
                    } else if (value instanceof Iterable) {
                        constructFieldsForListType(strA0t, (Iterable) value);
                    }
                    setString(strA0t, string);
                }
                setDouble(strA0t, dA00);
            }
        }
    }

    private final void maybeAddTypeName(String str, Map<String, ? extends Object> map) {
        if (str == null || map == null || map.containsKey("__typename") || !map.containsKey("strong_id__")) {
            return;
        }
        setString("__typename", str);
    }

    public TreeUpdaterJNI(Map<String, ? extends Object> map) {
        initHybridForRawBuilder();
        constructTreeWithArgs(map);
    }

    private final <T> void constructFieldsForListType(String str, Iterable<? extends T> iterable) {
        if (AbstractC0878AGe.A05(iterable) == 0) {
            setEmptyList(str);
            return;
        }
        T next = iterable.iterator().next();
        if (next instanceof Number) {
            setCleanedUpNumberList(str, iterable);
            return;
        }
        if (next instanceof Boolean) {
            setBooleanList(str, iterable);
        } else if (next instanceof String) {
            setStringList(str, iterable);
        } else if (next instanceof TreeUpdaterJNI) {
            setTreeUpdaterList(str, iterable);
        }
    }

    private final void setCleanedUpNumberList(String str, Iterable<? extends Number> iterable) {
        boolean z = false;
        boolean z2 = false;
        for (Number number : iterable) {
            if (number instanceof Long) {
                z2 = true;
            } else if (number instanceof Double) {
                z = true;
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(iterable);
        Iterator<? extends Number> it = iterable.iterator();
        if (z) {
            while (it.hasNext()) {
                arrayListA0i.add(Double.valueOf(BV6.A00(it.next())));
            }
            setDoubleList(str, arrayListA0i);
        } else if (z2) {
            while (it.hasNext()) {
                BV6.A1R(arrayListA0i, BV7.A0Y(it));
            }
            setLongList(str, arrayListA0i);
        } else {
            while (it.hasNext()) {
                C60Q.A1P(arrayListA0i, C60Q.A03(it));
            }
            setIntList(str, arrayListA0i);
        }
    }

    public final void constructTreeWithArgs(Map<String, ? extends Object> map) {
        addArgsByName(map);
        build();
    }

    public TreeUpdaterJNI(Map<String, ? extends Object> map, TreeJNI treeJNI) {
        if (treeJNI != null) {
            initHybridForUpdateBuilder(treeJNI);
        } else {
            initHybridForRawBuilder();
        }
        constructTreeWithArgs(map);
    }

    public TreeUpdaterJNI(Map<String, ? extends Object> map, int i, String str, C5119DZv c5119DZv) {
        this(map);
    }

    public TreeUpdaterJNI(String str, Map<String, ? extends Object> map, int i, String str2, C5119DZv c5119DZv) {
        PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNIA00;
        C5120DZw c5120DZwA02;
        C7384Etj.A0Y(str2, 3);
        if (c5119DZv != null && (c5120DZwA02 = c5119DZv.A02(str2)) != null) {
            pandoBuildConfigFlatbufferAssetReaderJNIA00 = C5120DZw.A00(c5120DZwA02);
        } else {
            pandoBuildConfigFlatbufferAssetReaderJNIA00 = null;
        }
        initHybridForRawBuilderWithFragment(i, pandoBuildConfigFlatbufferAssetReaderJNIA00);
        maybeAddTypeName(str, map);
        constructTreeWithArgs(map);
    }

    public TreeUpdaterJNI(Map<String, ? extends Object> map, TreeJNI treeJNI, int i, String str, C5119DZv c5119DZv) {
        PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNIA00;
        C5120DZw c5120DZwA02;
        AnonymousClass005.A0y(map, treeJNI, str);
        if (c5119DZv != null && (c5120DZwA02 = c5119DZv.A02(str)) != null) {
            pandoBuildConfigFlatbufferAssetReaderJNIA00 = C5120DZw.A00(c5120DZwA02);
        } else {
            pandoBuildConfigFlatbufferAssetReaderJNIA00 = null;
        }
        initHybridForUpdateBuilderWithFragment(treeJNI, i, pandoBuildConfigFlatbufferAssetReaderJNIA00);
        constructTreeWithArgs(map);
    }

    public TreeUpdaterJNI(String str, Map<String, ? extends Object> map) {
        initHybridForRawBuilder();
        maybeAddTypeName(str, map);
        constructTreeWithArgs(map);
    }

    public TreeUpdaterJNI() {
    }
}
