package X;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;
import kotlinx.serialization.PolymorphicSerializer;

/* loaded from: classes4.dex */
public abstract class A5X {
    public static final C9iZ A00;
    public static final C9iZ A01;
    public static final C9iZ A02;
    public static final C9iZ A03;
    public static final C9iZ A04;
    public static final C9iZ A05;
    public static final C9iZ A07;
    public static final C9iZ A0A;
    public static final C9iZ A0C;
    public static final C9iZ A0D;
    public static final C9iZ A0E;
    public static final C9iZ A06 = A00(CharSequence.class).getDescriptor();
    public static final C9iZ A0B = A00(Parcelable.class).getDescriptor();
    public static final C9iZ A09 = A00(Serializable.class).getDescriptor();
    public static final C9iZ A08 = A00(IBinder.class).getDescriptor();

    static {
        A5b a5b = A5b.A01;
        A03 = C9tX.A00(Parcelable.class, a5b);
        A0A = C9tX.A00(Parcelable.class, A00(Parcelable.class));
        A04 = C3cG.A19(a5b).A00;
        A0C = C3cG.A19(A00(Parcelable.class)).A00;
        A5e a5e = A5e.A00;
        A00 = C9tX.A00(CharSequence.class, a5e);
        A05 = C9tX.A00(CharSequence.class, A00(CharSequence.class));
        A01 = C3cG.A19(a5e).A00;
        A07 = C3cG.A19(A00(CharSequence.class)).A00;
        A0E = new A1R(a5b).A01;
        A0D = new A1R(A00(Parcelable.class)).A01;
        A02 = new A1R(AbstractC07749im.A00(A00(Parcelable.class))).A01;
    }

    public static PolymorphicSerializer A00(Class cls) {
        return new PolymorphicSerializer(new C0861A6i(cls));
    }
}
