package X;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A5n {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<+TT;>;)Landroid/util/SparseArray<TT;>; */
    public static SparseArray A00(Bundle bundle, Class cls, String str) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Serializable;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    public static Serializable A01(Bundle bundle, Class cls, String str) {
        return bundle.getSerializable(str, cls);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    public static Object A02(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<+TT;>;)Ljava/util/ArrayList<TT;>; */
    public static ArrayList A03(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<TT;>;)[TT; */
    public static Object[] A04(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArray(str, cls);
    }
}
