package X;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class CMV {
    public static DQZ<String, File> A00(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        int size = arrayList.size();
        if (size != arrayList2.size()) {
            throw C8j3.A0v("processes has ", "; newestFilesUploaded has ", size, arrayList2.size());
        }
        DQZ<String, File> dqz = new DQZ<>(size);
        for (int i = 0; i < size; i++) {
            String str = arrayList2.get(i);
            dqz.put(arrayList.get(i), str != null ? BV4.A0G(str) : null);
        }
        return dqz;
    }
}
