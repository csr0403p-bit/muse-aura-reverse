package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class Hi0 implements Cloneable {
    public Context mContext;
    public Map<String, Object> mCustomInfo;
    public boolean mIsCustomInfoInitialized;
    public final String mSimpleName;

    public Hi0 addCustomInfoFrom(Hi0 hi0) {
        synchronized (this) {
            if (this.mIsCustomInfoInitialized || this.mContext == null) {
                return this;
            }
            synchronized (this) {
                this.mIsCustomInfoInitialized = true;
            }
            return this;
        }
    }

    public abstract Hi0 fromBundle(Context context, Bundle bundle);

    public Object getCustomInfo(String str) {
        synchronized (this) {
            if (this.mIsCustomInfoInitialized || this.mContext == null) {
                Map<String, Object> map = this.mCustomInfo;
                return map != null ? map.get(str) : null;
            }
            synchronized (this) {
                if (this.mIsCustomInfoInitialized) {
                    Map<String, Object> map2 = this.mCustomInfo;
                    if (map2 != null) {
                        obj = map2.get(str);
                    }
                } else {
                    this.mIsCustomInfoInitialized = true;
                    Map<String, Object> map3 = this.mCustomInfo;
                    if (map3 != null) {
                        obj = map3.get(str);
                    }
                }
            }
            return obj;
        }
    }

    public abstract long getDataPropsHashCode();

    public abstract Bundle toBundle();

    public abstract <T> FNN<T> toDataFetch(C7979FNv c7979FNv);

    private void addCustomInfo(Map<String, Object> map, boolean z) {
        if (map != null) {
            if (this.mCustomInfo == null) {
                this.mCustomInfo = map;
                return;
            }
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA11);
                if (z && this.mCustomInfo.containsKey(strA0j)) {
                    throw BV5.A0V("key ", strA0j, " is already used");
                }
                Object obj = map.get(strA0j);
                if (obj != null) {
                    this.mCustomInfo.put(strA0j, obj);
                }
            }
        }
    }

    public Map<String, Object> getCustomInfoFromSpec(Context context) {
        return null;
    }

    public final String getSimpleName() {
        return this.mSimpleName;
    }

    public Set<String> getTransientFieldNames() {
        return Collections.EMPTY_SET;
    }

    public Object getTransientValue(String str) {
        return null;
    }

    public void updateTransientProps(Hi0 hi0) {
    }

    public Hi0(String str) {
        this.mSimpleName = str;
    }

    public static Map<String, Object> getMapForCustomInfo() {
        return BV4.A0u();
    }

    public final String getDatakey() {
        String strA0e = C60Q.A0e(this);
        return BV7.A0z(":", C3cG.A0g(strA0e), getDataPropsHashCode());
    }

    public boolean setTransientValue(String str, Object obj) {
        return false;
    }

    public boolean shouldUpdateData(Hi0 hi0, Hi0 hi02) {
        return false;
    }
}
