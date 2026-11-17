package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A5Z extends C9jJ {
    public String A00;
    public final Bundle A01;
    public final C9jC A02;

    public A5Z(Bundle bundle, C9jC c9jC) {
        C7384Etj.A0Y(c9jC, 1);
        this.A01 = bundle;
        this.A02 = c9jC;
        this.A00 = "";
    }

    @Override // X.C9jJ
    public final boolean A05(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        this.A00 = c9iZ.AF5(i);
        return true;
    }

    @Override // X.C9jJ, X.InterfaceC07789is
    public final C9j5 A56(C9iZ c9iZ) {
        HxE[] hxEArrA1b;
        C7384Etj.A0Y(c9iZ, 0);
        if (C3cH.A1Q(this.A00)) {
            return this;
        }
        C9jH c9jH = C9jH.A00;
        if (c9jH.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA1A = C8j3.A1A(c9jH);
            Iterator itA1B = C8j3.A1B(c9jH);
            while (itA1B.hasNext()) {
                Map.Entry entry = (Map.Entry) itA1B.next();
                arrayListA1A.add(new HxE(entry.getKey(), entry.getValue()));
            }
            hxEArrA1b = C8j3.A1b(arrayListA1A);
        }
        Bundle bundleA00 = AbstractC0849A5g.A00(hxEArrA1b);
        Bundle bundle = this.A01;
        C7384Etj.A0Y(bundle, 0);
        String str = this.A00;
        C7384Etj.A0Y(str, 1);
        bundle.putBundle(str, bundleA00);
        return new A5Z(bundleA00, this.A02);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hv<-TT;>;TT;)V */
    @Override // X.C9jJ, X.InterfaceC07789is
    public final void AAR(Object obj, C9hv c9hv) {
        C7384Etj.A0Y(c9hv, 0);
        C9iZ descriptor = c9hv.getDescriptor();
        if (C7384Etj.areEqual(descriptor, A5X.A06)) {
            A5e a5e = A5e.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            CharSequence charSequence = (CharSequence) obj;
            C60P.A1Y(this, charSequence);
            if (!(this instanceof A5Z)) {
                throw C9iZ.A01(A5e.A01, this);
            }
            A5Z a5z = this;
            Bundle bundle = a5z.A01;
            bundle.putCharSequence(C9jJ.A00(a5z, bundle), charSequence);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A0B)) {
            A5b a5b = A5b.A01;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type android.os.Parcelable");
            Parcelable parcelable = (Parcelable) obj;
            C60P.A1Y(this, parcelable);
            if (!(this instanceof A5Z)) {
                throw C9iZ.A01(a5b.A00, this);
            }
            A5Z a5z2 = this;
            Bundle bundle2 = a5z2.A01;
            bundle2.putParcelable(C9jJ.A00(a5z2, bundle2), parcelable);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A09)) {
            A5i a5i = A5i.A01;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type java.io.Serializable");
            Serializable serializable = (Serializable) obj;
            C60P.A1Y(this, serializable);
            if (!(this instanceof A5Z)) {
                throw C9iZ.A01(a5i.A00, this);
            }
            A5Z a5z3 = this;
            Bundle bundle3 = a5z3.A01;
            bundle3.putSerializable(C9jJ.A00(a5z3, bundle3), serializable);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A08)) {
            C9iZ c9iZ = A5k.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type android.os.IBinder");
            IBinder iBinder = (IBinder) obj;
            C7384Etj.A0Y(iBinder, 1);
            Bundle bundle4 = this.A01;
            bundle4.putBinder(C9jJ.A00(this, bundle4), iBinder);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A00) || C7384Etj.areEqual(descriptor, A5X.A05)) {
            C9iZ c9iZ2 = A5f.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            C7384Etj.A0Y(charSequenceArr, 1);
            Bundle bundle5 = this.A01;
            bundle5.putCharSequenceArray(C9jJ.A00(this, bundle5), charSequenceArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A01) || C7384Etj.areEqual(descriptor, A5X.A07)) {
            C9iZ c9iZ3 = A5a.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            List list = (List) obj;
            C7384Etj.A0Y(list, 1);
            Bundle bundle6 = this.A01;
            bundle6.putCharSequenceArrayList(C9jJ.A00(this, bundle6), list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A03) || C7384Etj.areEqual(descriptor, A5X.A0A)) {
            C9iZ c9iZ4 = A5j.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            C7384Etj.A0Y(parcelableArr, 1);
            Bundle bundle7 = this.A01;
            bundle7.putParcelableArray(C9jJ.A00(this, bundle7), parcelableArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A04) || C7384Etj.areEqual(descriptor, A5X.A0C)) {
            C9iZ c9iZ5 = A5c.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            List list2 = (List) obj;
            C7384Etj.A0Y(list2, 1);
            Bundle bundle8 = this.A01;
            bundle8.putParcelableArrayList(C9jJ.A00(this, bundle8), list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
            return;
        }
        if (C7384Etj.areEqual(descriptor, A5X.A0E) || C7384Etj.areEqual(descriptor, A5X.A0D) || C7384Etj.areEqual(descriptor, A5X.A02)) {
            C9iZ c9iZ6 = AbstractC0850A5h.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
            SparseArray<? extends Parcelable> sparseArray = (SparseArray) obj;
            C7384Etj.A0Y(sparseArray, 1);
            Bundle bundle9 = this.A01;
            bundle9.putSparseParcelableArray(C9jJ.A00(this, bundle9), sparseArray);
            return;
        }
        C9iZ descriptor2 = c9hv.getDescriptor();
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A05)) {
            Bundle bundle10 = this.A01;
            C7384Etj.A0Y(bundle10, 0);
            String str = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            List list3 = (List) obj;
            AnonymousClass003.A0x(str, list3);
            bundle10.putIntegerArrayList(str, list3 instanceof ArrayList ? (ArrayList) list3 : new ArrayList<>(list3));
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A08)) {
            Bundle bundle11 = this.A01;
            C7384Etj.A0Y(bundle11, 0);
            String str2 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list4 = (List) obj;
            AnonymousClass003.A0x(str2, list4);
            bundle11.putStringArrayList(str2, list4 instanceof ArrayList ? (ArrayList) list4 : new ArrayList<>(list4));
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A00)) {
            Bundle bundle12 = this.A01;
            C7384Etj.A0Y(bundle12, 0);
            String str3 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.BooleanArray");
            boolean[] zArr = (boolean[]) obj;
            AnonymousClass003.A0x(str3, zArr);
            bundle12.putBooleanArray(str3, zArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A01)) {
            Bundle bundle13 = this.A01;
            C7384Etj.A0Y(bundle13, 0);
            String str4 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.CharArray");
            char[] cArr = (char[]) obj;
            AnonymousClass003.A0x(str4, cArr);
            bundle13.putCharArray(str4, cArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A02)) {
            Bundle bundle14 = this.A01;
            C7384Etj.A0Y(bundle14, 0);
            String str5 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
            double[] dArr = (double[]) obj;
            AnonymousClass003.A0x(str5, dArr);
            bundle14.putDoubleArray(str5, dArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A03)) {
            Bundle bundle15 = this.A01;
            C7384Etj.A0Y(bundle15, 0);
            String str6 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.FloatArray");
            float[] fArr = (float[]) obj;
            AnonymousClass003.A0x(str6, fArr);
            bundle15.putFloatArray(str6, fArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A04)) {
            Bundle bundle16 = this.A01;
            C7384Etj.A0Y(bundle16, 0);
            String str7 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            AnonymousClass003.A0x(str7, iArr);
            bundle16.putIntArray(str7, iArr);
            return;
        }
        if (C7384Etj.areEqual(descriptor2, AbstractC08239tj.A06)) {
            Bundle bundle17 = this.A01;
            C7384Etj.A0Y(bundle17, 0);
            String str8 = this.A00;
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.LongArray");
            long[] jArr = (long[]) obj;
            AnonymousClass003.A0x(str8, jArr);
            bundle17.putLongArray(str8, jArr);
            return;
        }
        if (!C7384Etj.areEqual(descriptor2, AbstractC08239tj.A07)) {
            c9hv.serialize(this, obj);
            return;
        }
        Bundle bundle18 = this.A01;
        C7384Etj.A0Y(bundle18, 0);
        String str9 = this.A00;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        String[] strArr = (String[]) obj;
        AnonymousClass003.A0x(str9, strArr);
        bundle18.putStringArray(str9, strArr);
    }

    @Override // X.C9jJ, X.InterfaceC07789is
    public final void AAU(String str) {
        C7384Etj.A0Y(str, 0);
        Bundle bundle = this.A01;
        C7384Etj.A0Y(bundle, 0);
        String str2 = this.A00;
        C7384Etj.A0Y(str2, 1);
        bundle.putString(str2, str);
    }

    @Override // X.InterfaceC07789is
    public final C07959pz AKT() {
        return this.A02.A00;
    }
}
