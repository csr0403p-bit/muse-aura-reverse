package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.EFd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6562EFd {
    public final DQZ<String, Class<?>> A00;
    public final DQZ<String, Method> A01;
    public final DQZ<String, Method> A02;

    public final <T extends E1K> T A04() throws Throwable {
        String string = ((C6563EFe) this).A05.readString();
        if (string == null) {
            return null;
        }
        C6563EFe c6563EFeA03 = A03();
        try {
            DQZ<String, Method> dqz = this.A01;
            Method declaredMethod = dqz.get(string);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(string, false, AbstractC6562EFd.class.getClassLoader()).getDeclaredMethod(BrowserOperationCatalogKt.READ, AbstractC6562EFd.class);
                dqz.put(string, declaredMethod);
            }
            return (T) declaredMethod.invoke(null, c6563EFeA03);
        } catch (ClassNotFoundException e) {
            throw BV4.A0e(e);
        } catch (IllegalAccessException e2) {
            throw BV4.A0e(e2);
        } catch (NoSuchMethodException e3) {
            throw BV4.A0e(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0e(e4);
        }
    }

    private Class<?> A00(Class<?> cls) throws ClassNotFoundException {
        DQZ<String, Class<?>> dqz = this.A00;
        String name = cls.getName();
        Class<?> cls2 = dqz.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        dqz.put(name, cls3);
        return cls3;
    }

    private final C6563EFe A03() {
        C6563EFe c6563EFe = (C6563EFe) this;
        Parcel parcel = c6563EFe.A05;
        int iDataPosition = parcel.dataPosition();
        int i = c6563EFe.A02;
        if (i == c6563EFe.A04) {
            i = c6563EFe.A03;
        }
        return new C6563EFe(parcel, ((AbstractC6562EFd) c6563EFe).A01, ((AbstractC6562EFd) c6563EFe).A02, ((AbstractC6562EFd) c6563EFe).A00, FGI.A0M(c6563EFe.A07, "  "), iDataPosition, i);
    }

    public final void A05(int i) {
        C6563EFe c6563EFe = (C6563EFe) this;
        int i2 = c6563EFe.A00;
        if (i2 >= 0) {
            int i3 = c6563EFe.A06.get(i2);
            Parcel parcel = c6563EFe.A05;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        c6563EFe.A00 = i;
        SparseIntArray sparseIntArray = c6563EFe.A06;
        Parcel parcel2 = c6563EFe.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public final void A08(E1K e1k) throws Throwable {
        if (e1k == null) {
            ((C6563EFe) this).A05.writeString(null);
            return;
        }
        try {
            Class<?> cls = e1k.getClass();
            ((C6563EFe) this).A05.writeString(A00(cls).getName());
            C6563EFe c6563EFeA03 = A03();
            try {
                DQZ<String, Method> dqz = this.A02;
                String name = cls.getName();
                Method declaredMethod = dqz.get(name);
                if (declaredMethod == null) {
                    declaredMethod = A00(cls).getDeclaredMethod("write", cls, AbstractC6562EFd.class);
                    dqz.put(name, declaredMethod);
                }
                declaredMethod.invoke(null, e1k, c6563EFeA03);
                int i = c6563EFeA03.A00;
                if (i >= 0) {
                    int i2 = c6563EFeA03.A06.get(i);
                    Parcel parcel = c6563EFeA03.A05;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw BV4.A0e(e);
            } catch (IllegalAccessException e2) {
                throw BV4.A0e(e2);
            } catch (NoSuchMethodException e3) {
                throw BV4.A0e(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof RuntimeException) && !(cause instanceof Error)) {
                    throw BV4.A0e(e4);
                }
            }
        } catch (ClassNotFoundException e5) {
            throw BV4.A0d(FGI.A0M(C3cI.A0Y(e1k), " does not have a Parcelizer"), e5);
        }
    }

    public final boolean A09(int i) {
        C6563EFe c6563EFe = (C6563EFe) this;
        while (true) {
            int i2 = c6563EFe.A02;
            int i3 = c6563EFe.A03;
            int i4 = c6563EFe.A01;
            if (i2 >= i3) {
                return i4 == i;
            }
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = c6563EFe.A05;
            parcel.setDataPosition(i2);
            int i5 = parcel.readInt();
            c6563EFe.A01 = parcel.readInt();
            c6563EFe.A02 += i5;
        }
    }

    public AbstractC6562EFd(DQZ<String, Method> dqz, DQZ<String, Method> dqz2, DQZ<String, Class<?>> dqz3) {
        this.A01 = dqz;
        this.A02 = dqz2;
        this.A00 = dqz3;
    }

    public final int A01(int i, int i2) {
        return A09(i2) ? ((C6563EFe) this).A05.readInt() : i;
    }

    public final <T extends Parcelable> T A02(T t, int i) {
        if (!A09(i)) {
            return t;
        }
        C6563EFe c6563EFe = (C6563EFe) this;
        return (T) c6563EFe.A05.readParcelable(c6563EFe.getClass().getClassLoader());
    }

    public final void A06(int i, int i2) {
        A05(i2);
        ((C6563EFe) this).A05.writeInt(i);
    }

    public final void A07(Parcelable parcelable, int i) {
        A05(i);
        ((C6563EFe) this).A05.writeParcelable(parcelable, 0);
    }
}
