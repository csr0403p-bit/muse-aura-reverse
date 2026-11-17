package X;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CpZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4197CpZ {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Process.myUid();
        Method method8 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        A00 = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        A01 = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        A02 = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        A03 = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        A04 = method5;
        try {
            method6 = WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            method6 = null;
        }
        A05 = method6;
        try {
            method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            method7 = null;
        }
        A06 = method7;
        try {
            method8 = WorkSource.class.getMethod("isEmpty", null);
            method8.setAccessible(true);
        } catch (Exception unused6) {
        }
        A07 = method8;
    }

    public static boolean A00(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = A07;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                CRy.A03(objInvoke);
                return AnonymousClass001.A1X(objInvoke);
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = A02;
        if (method2 != null) {
            try {
                Object objInvoke2 = method2.invoke(workSource, null);
                CRy.A03(objInvoke2);
                if (BV6.A07(objInvoke2) != 0) {
                    return false;
                }
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return true;
    }
}
