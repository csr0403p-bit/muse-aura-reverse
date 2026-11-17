package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import com.facebook.jni.HybridData;
import com.facebook.pando.TreeWithGraphQL;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class DaJ extends DaK {
    public final ConcurrentHashMap<Long, Object> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaJ(HybridData hybridData) {
        super(hybridData);
        C7384Etj.A0Y(hybridData, 0);
        this.A00 = C60O.A1C();
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;>(ITT;)TT; */
    @Override // X.DaI, X.C9YX
    public final Enum AIH(Enum r6, int i) {
        C7384Etj.A0Y(r6, 1);
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, 8589934592L));
        Object objAIH = concurrentHashMap.get(lValueOf);
        if (objAIH == null) {
            objAIH = super.AIH(r6, i);
            if (objAIH == null) {
                objAIH = C5166Daw.A00;
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, objAIH);
            if (objPutIfAbsent != null) {
                objAIH = objPutIfAbsent;
            }
        }
        if (objAIH == C5166Daw.A00) {
            objAIH = null;
        }
        return (Enum) objAIH;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/facebook/pando/TreeWithGraphQL;>(ILjava/lang/Class<TT;>;)TT; */
    @Override // X.DaI
    public final TreeWithGraphQL A00(Class cls, int i) {
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(BV4.A03(i));
        Object objA00 = concurrentHashMap.get(lValueOf);
        if (objA00 == null) {
            objA00 = super.A00(cls, i);
            if (objA00 == null) {
                objA00 = C5166Daw.A00;
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, objA00);
            if (objPutIfAbsent != null) {
                objA00 = objPutIfAbsent;
            }
        }
        if (objA00 == C5166Daw.A00) {
            objA00 = null;
        }
        return (TreeWithGraphQL) objA00;
    }

    @Override // X.DaI, X.C9YX
    public final boolean ADk(int i) {
        Object objPutIfAbsent;
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES));
        Object objValueOf = concurrentHashMap.get(lValueOf);
        if (objValueOf == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (objValueOf = Boolean.valueOf(super.ADk(i))))) != null) {
            objValueOf = objPutIfAbsent;
        }
        if (objValueOf == C5166Daw.A00) {
            objValueOf = null;
        }
        return AnonymousClass001.A1X(objValueOf);
    }

    @Override // X.DaI, X.C9YX
    public final double ADl(int i) {
        Object objPutIfAbsent;
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES));
        Object objValueOf = concurrentHashMap.get(lValueOf);
        if (objValueOf == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (objValueOf = Double.valueOf(super.ADl(i))))) != null) {
            objValueOf = objPutIfAbsent;
        }
        if (objValueOf == C5166Daw.A00) {
            objValueOf = null;
        }
        return BV6.A00(objValueOf);
    }

    @Override // X.DaI, X.C9YX
    public final int ADm(int i) {
        Object objPutIfAbsent;
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES));
        Object objValueOf = concurrentHashMap.get(lValueOf);
        if (objValueOf == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (objValueOf = Integer.valueOf(super.ADm(i))))) != null) {
            objValueOf = objPutIfAbsent;
        }
        if (objValueOf == C5166Daw.A00) {
            objValueOf = null;
        }
        return AnonymousClass001.A0F(objValueOf);
    }

    @Override // X.C9YX
    public final String AIJ(int i) {
        ConcurrentHashMap<Long, Object> concurrentHashMap = this.A00;
        Long lValueOf = Long.valueOf(C8j3.A0V(i, 8589934592L));
        Object stringValueByHashCode = concurrentHashMap.get(lValueOf);
        if (stringValueByHashCode == null) {
            stringValueByHashCode = getStringValueByHashCode(i);
            if (stringValueByHashCode == null) {
                stringValueByHashCode = C5166Daw.A00;
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, stringValueByHashCode);
            if (objPutIfAbsent != null) {
                stringValueByHashCode = objPutIfAbsent;
            }
        }
        if (stringValueByHashCode == C5166Daw.A00) {
            stringValueByHashCode = null;
        }
        return (String) stringValueByHashCode;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/facebook/pando/TreeWithGraphQL;>(ILjava/lang/Class<TT;>;)TT; */
    @Override // X.DaK, X.DaI
    public final TreeWithGraphQL A01(Class cls, int i) {
        return super.A01(cls, i);
    }
}
