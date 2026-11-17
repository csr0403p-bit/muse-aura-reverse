package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A5o {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return A5n.A02(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class<+TT;>;)Ljava/util/ArrayList<TT;>; */
    public static ArrayList A01(Bundle bundle, Class cls, String str) {
        return Build.VERSION.SDK_INT >= 34 ? A5n.A03(bundle, cls, str) : bundle.getParcelableArrayList(str);
    }
}
