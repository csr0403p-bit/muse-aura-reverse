package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class A6Y extends BG0 {
    public static A6Y A01;
    public static final BNw<Application> A02 = new BSV(3);
    public final Application A00;

    @Override // X.BG0, X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return (T) A00(application, cls);
        }
        throw C8j3.A18("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AEs;>(Ljava/lang/Class<TT;>;Landroid/app/Application;)TT; */
    private final AEs A00(Application application, Class cls) {
        if (!AbstractC0858A6f.class.isAssignableFrom(cls)) {
            return AbstractC0855A6c.A00(cls);
        }
        try {
            AEs aEs = (AEs) cls.getConstructor(Application.class).newInstance(application);
            C7384Etj.A0X(aEs);
            return aEs;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e4);
        }
    }

    public A6Y(Application application) {
        this.A00 = application;
    }

    public A6Y() {
        this.A00 = null;
    }

    @Override // X.BG0, X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls, A6J a6j) {
        AnonymousClass003.A0u(cls, a6j);
        if (this.A00 != null) {
            return (T) create(cls);
        }
        Application application = (Application) a6j.A00(A02);
        if (application != null) {
            return (T) A00(application, cls);
        }
        if (!AbstractC0858A6f.class.isAssignableFrom(cls)) {
            return (T) AbstractC0855A6c.A00(cls);
        }
        throw C60O.A0i("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
