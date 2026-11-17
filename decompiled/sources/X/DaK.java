package X;

import com.facebook.pando.TreeWithGraphQL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class DaK extends DaI {
    /* JADX WARN: Incorrect types in method signature: <T:Lcom/facebook/pando/TreeWithGraphQL;>(ILjava/lang/Class<TT;>;)TT; */
    @Override // X.DaI
    public TreeWithGraphQL A01(Class cls, int i) {
        TreeWithGraphQL treeWithGraphQL = (TreeWithGraphQL) optionalReinterpretByHashCode(i, cls);
        if (treeWithGraphQL == null) {
            return null;
        }
        treeWithGraphQL.fromTypeModel = this.fromTypeModel;
        return treeWithGraphQL;
    }

    public final List<String> A02(String str) {
        List<String> listBubbledNullPathsNative = bubbledNullPathsNative();
        C7384Etj.A0U(listBubbledNullPathsNative);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listBubbledNullPathsNative);
        Iterator<String> it = listBubbledNullPathsNative.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(FGI.A0U(str, ".", AnonymousClass005.A0j(it)));
        }
        return arrayListA0i;
    }

    @Override // X.C9YX
    public final boolean ANA(int i) {
        return hasFieldValueByHashCode(i);
    }
}
