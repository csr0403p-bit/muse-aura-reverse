package X;

import android.content.Context;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class DX4 {
    public static DX4 A01;
    public static final DX5 A02 = new DX5();
    public static final Set<String> A03;
    public final Context A00;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        A03 = treeSet;
        treeSet.add("com.instagram.android");
    }

    public DX4(Context context) {
        A03.contains(context.getApplicationContext().getPackageName());
        this.A00 = AnonymousClass001.A0I(context);
    }
}
