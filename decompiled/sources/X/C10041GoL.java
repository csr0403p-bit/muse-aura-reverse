package X;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.GoL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10041GoL implements InterfaceC10212GrY, Serializable {
    public static final long serialVersionUID = 1;

    public static C9917Gl8 A00(C9898Gke c9898Gke, AbstractC9970Gmj abstractC9970Gmj) {
        if (abstractC9970Gmj instanceof C9937Glg) {
            Constructor<?> constructor = ((C9937Glg) abstractC9970Gmj)._constructor;
            if (c9898Gke.A07()) {
                AbstractC7609F5w.A1B(c9898Gke, constructor);
            }
            return new C10069Goq(constructor);
        }
        Method method = ((C9934Glc) abstractC9970Gmj).A00;
        if (c9898Gke.A07()) {
            AbstractC7609F5w.A1B(c9898Gke, method);
        }
        return new C10092GpG(method);
    }
}
