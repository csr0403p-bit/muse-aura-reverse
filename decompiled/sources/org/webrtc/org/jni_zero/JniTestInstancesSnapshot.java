package org.webrtc.org.jni_zero;

import X.BV4;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class JniTestInstancesSnapshot {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Object[] mValues;

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            Object[] objArr = jniTestInstancesSnapshot.mValues;
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            int length = objArr.length;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < length; i++) {
                    arrayList.get(i).value = objArr[i];
                }
                while (length < size) {
                    arrayList.get(length).value = null;
                    length++;
                }
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        JniTestInstancesSnapshot jniTestInstancesSnapshot;
        synchronized (JniTestInstanceHolder.class) {
            ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
            if (arrayList == null) {
                jniTestInstancesSnapshot = new JniTestInstancesSnapshot(new Object[0]);
            } else {
                Object[] objArr = new Object[arrayList.size()];
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    objArr[i] = arrayList.get(i).value;
                }
                jniTestInstancesSnapshot = new JniTestInstancesSnapshot(objArr);
            }
        }
        return jniTestInstancesSnapshot;
    }

    public JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(BV4.A1W()));
    }
}
