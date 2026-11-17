package X;

import com.facebook.common.dextricks.DexStoreUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class C36 extends C2x {
    public final C37[] A00;
    public final /* synthetic */ C38 A01;

    public C36(C38 c38, AbstractC3198C2y abstractC3198C2y) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.A01 = c38;
        File fileA0G = BV4.A0G(FGI.A0U("/data/local/tmp/exopackage/", ((AbstractC3198C2y) c38).A01.getPackageName(), "/native-libs/"));
        ArrayList arrayListA0h = C3cG.A0h();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        int i = 0;
        for (String str : AbstractC3181C1l.A03()) {
            File fileA0O = C3cG.A0O(fileA0G, str);
            if (fileA0O.isDirectory()) {
                linkedHashSetA0k.add(str);
                File fileA0O2 = C3cG.A0O(fileA0O, DexStoreUtils.SECONDARY_DEX_MANIFEST);
                if (fileA0O2.isFile()) {
                    FileReader fileReader = new FileReader(fileA0O2);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        throw BV5.A0i("illegal line in exopackage metadata: [", line, "]");
                                    }
                                    String strA0M = FGI.A0M(line.substring(i, iIndexOf), ".so");
                                    int size = arrayListA0h.size();
                                    while (true) {
                                        if (i < size) {
                                            boolean zEquals = ((C37) arrayListA0h.get(i)).A01.equals(strA0M);
                                            i++;
                                            if (zEquals) {
                                                break;
                                            }
                                        } else {
                                            String strA0g = BV4.A0g(iIndexOf, line);
                                            arrayListA0h.add(new C37(C3cG.A0O(fileA0O, strA0g), strA0M, strA0g.substring(strA0g.indexOf(45), strA0g.indexOf(".so"))));
                                            break;
                                        }
                                    }
                                    i = 0;
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            fileReader.close();
                            throw th;
                        } finally {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        abstractC3198C2y.A00 = (String[]) linkedHashSetA0k.toArray(new String[linkedHashSetA0k.size()]);
        this.A00 = (C37[]) arrayListA0h.toArray(new C37[arrayListA0h.size()]);
    }
}
