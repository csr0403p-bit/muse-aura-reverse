package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.HoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10510HoE {
    public static final C5181Dba A00() throws Exception {
        try {
            Object objInvoke = C10580Hwe.class.getMethod("create", null).invoke(null, null);
            C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type com.facebook.payments.dcp.iap.internal.mutator.gql.DCPProductInfoQuery.BuilderForInput");
            return (C5181Dba) objInvoke;
        } catch (Exception e) {
            if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                throw BV4.A0e(e);
            }
            throw e;
        }
    }
}
