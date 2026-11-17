package X;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes4.dex */
public final class A5b implements C9hr {
    public static final A5b A01 = new A5b(0);
    public final C9iZ A00;

    /* JADX WARN: Incorrect return type in method signature: (LX/9iw;)TT; */
    @Override // X.C9jG
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Parcelable deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        if (!(interfaceC07829iw instanceof A5Y)) {
            throw C9iZ.A00(this.A00, interfaceC07829iw);
        }
        A5Y a5y = (A5Y) interfaceC07829iw;
        Bundle bundle = a5y.A02;
        C7384Etj.A0Y(bundle, 0);
        String str = a5y.A00;
        Parcelable parcelable = (Parcelable) A5o.A00(bundle, C9uT.A00(Parcelable.class, str), str);
        if (parcelable != null) {
            return parcelable;
        }
        A5q.A00(str);
        throw F60.createAndThrow();
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        C60P.A1Y(interfaceC07789is, parcelable);
        if (!(interfaceC07789is instanceof A5Z)) {
            throw C9iZ.A01(this.A00, interfaceC07789is);
        }
        A5Z a5z = (A5Z) interfaceC07789is;
        Bundle bundle = a5z.A01;
        bundle.putParcelable(C9jJ.A00(a5z, bundle), parcelable);
    }

    public A5b(int i) {
        this.A00 = C9iY.A00("android.os.Parcelable");
    }

    public A5b() {
        this(0);
    }
}
