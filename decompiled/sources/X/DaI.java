package X;

import com.facebook.jni.HybridData;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeWithGraphQL;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class DaI extends AbstractC5144DaZ implements A7O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaI(HybridData hybridData) {
        super(hybridData);
        C7384Etj.A0Y(hybridData, 0);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/facebook/pando/TreeWithGraphQL;>(ILjava/lang/Class<TT;>;)TT; */
    public abstract TreeWithGraphQL A01(Class cls, int i);

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;>(ITT;)TT; */
    @Override // X.C9YX
    public Enum AIH(Enum r2, int i) {
        C7384Etj.A0Y(r2, 1);
        String stringValueByHashCode = getStringValueByHashCode(i);
        if (stringValueByHashCode == null) {
            return null;
        }
        Enum r0 = TreeJNI.parseEnum(stringValueByHashCode, r2);
        C7384Etj.A0U(r0);
        return r0;
    }

    @Override // X.A7O
    public final A7O AIK(int i) {
        DaK daK = (DaK) this;
        if (!(daK instanceof DaJ)) {
            throw F60.createAndThrow();
        }
        DaJ daJ = (DaJ) daK;
        ConcurrentHashMap<Long, Object> concurrentHashMap = daJ.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, 8589934592L));
        Object obj = concurrentHashMap.get(lValueOf);
        if (obj == null) {
            obj = (TreeWithGraphQL) daJ.getTreeValueByHashCode(i, TreeWithGraphQL.class);
            if (obj == null) {
                obj = C5166Daw.A00;
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, obj);
            if (objPutIfAbsent != null) {
                obj = objPutIfAbsent;
            }
        }
        if (obj == C5166Daw.A00) {
            obj = null;
        }
        return (TreeWithGraphQL) obj;
    }

    @Override // X.C9YX
    public final ImmutableList<String> AJb(int i) {
        DaJ daJ = (DaJ) this;
        ConcurrentHashMap<Long, Object> concurrentHashMap = daJ.A00;
        Long lValueOf = Long.valueOf(BV4.A03(i));
        Object stringListByHashCode = concurrentHashMap.get(lValueOf);
        if (stringListByHashCode == null) {
            stringListByHashCode = daJ.getStringListByHashCode(i);
            C7384Etj.A0U(stringListByHashCode);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, stringListByHashCode);
            if (objPutIfAbsent != null) {
                stringListByHashCode = objPutIfAbsent;
            }
        }
        if (stringListByHashCode == C5166Daw.A00) {
            stringListByHashCode = null;
        }
        return (ImmutableList) stringListByHashCode;
    }

    @Override // X.A7O
    public final ImmutableList<? extends A7O> AJc(int i) {
        DaJ daJ = (DaJ) this;
        ConcurrentHashMap<Long, Object> concurrentHashMap = daJ.A00;
        Long lValueOf = Long.valueOf(BV4.A03(i));
        Object treeListByHashCode = concurrentHashMap.get(lValueOf);
        if (treeListByHashCode == null) {
            treeListByHashCode = daJ.getTreeListByHashCode(i, TreeWithGraphQL.class);
            C7384Etj.A0U(treeListByHashCode);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, treeListByHashCode);
            if (objPutIfAbsent != null) {
                treeListByHashCode = objPutIfAbsent;
            }
        }
        if (treeListByHashCode == C5166Daw.A00) {
            treeListByHashCode = null;
        }
        return (ImmutableList) treeListByHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C9YX
    public final boolean AOK(C9YX c9yx) {
        if (c9yx instanceof TreeJNI) {
            return isDeepEqualTree((TreeJNI) c9yx);
        }
        return false;
    }

    @Override // X.A7O
    public final A7O Aa4(int i) {
        return A01(TreeWithGraphQL.class, i);
    }

    @Override // X.A7O
    public final A7O Aa5(int i) {
        DaI daI = (DaI) optionalReinterpretByHashCode(i, TreeWithGraphQL.class);
        if (daI == null) {
            return null;
        }
        daI.fromTypeModel = this.fromTypeModel;
        return daI;
    }

    @Override // X.A7O
    public final A7O Aa6(int i) {
        return A00(TreeWithGraphQL.class, i);
    }

    @Override // X.A7O
    public final F0r AiB() {
        return new C3185C1s(this);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/facebook/pando/TreeWithGraphQL;>(ILjava/lang/Class<TT;>;)TT; */
    public TreeWithGraphQL A00(Class cls, int i) {
        TreeJNI treeJNIRequiredReinterpretByHashCode = requiredReinterpretByHashCode(i, cls);
        C7384Etj.A0X(treeJNIRequiredReinterpretByHashCode);
        TreeWithGraphQL treeWithGraphQL = (TreeWithGraphQL) treeJNIRequiredReinterpretByHashCode;
        treeWithGraphQL.fromTypeModel = this.fromTypeModel;
        return treeWithGraphQL;
    }

    @Override // X.C9YX
    public boolean ADk(int i) {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(i);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        return false;
    }

    @Override // X.C9YX
    public double ADl(int i) {
        Double optionalDoubleValueByHashCode = getOptionalDoubleValueByHashCode(i);
        if (optionalDoubleValueByHashCode != null) {
            return optionalDoubleValueByHashCode.doubleValue();
        }
        return 0.0d;
    }

    @Override // X.C9YX
    public int ADm(int i) {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(i);
        if (optionalIntValueByHashCode != null) {
            return optionalIntValueByHashCode.intValue();
        }
        return 0;
    }
}
