package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.CTv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3558CTv implements CUK {
    public final String A00;

    @Override // X.CUK
    public final Object get() throws ClassNotFoundException {
        String str = this.A00;
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    public C3558CTv(String str) {
        this.A00 = str;
    }
}
