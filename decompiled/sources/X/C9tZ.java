package X;

import X.C9u3;

/* renamed from: X.9tZ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tZ<Element, Array, Builder extends C9u3<Array>> extends C9tX<Element, Array, Builder> {
    public final C9iZ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C9tX, X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, Array array) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        int iA02 = A02(array);
        C9iZ c9iZ = this.A00;
        C7384Etj.A0Y(c9iZ, 1);
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        if (this instanceof C9tb) {
            short[] sArr = ((C9oV) array).A00;
            C7384Etj.A0Y(c9j5A56, 0);
            for (int i = 0; i < iA02; i++) {
                c9j5A56.AAI(c9iZ, i).AAS(sArr[i]);
            }
        } else if (this instanceof C08199te) {
            long[] jArr = ((C9tP) array).A00;
            C7384Etj.A0Y(c9j5A56, 0);
            for (int i2 = 0; i2 < iA02; i2++) {
                c9j5A56.AAI(c9iZ, i2).AAM(jArr[i2]);
            }
        } else if (this instanceof C9tc) {
            int[] iArr = ((C9oX) array).A00;
            C7384Etj.A0Y(c9j5A56, 0);
            for (int i3 = 0; i3 < iA02; i3++) {
                c9j5A56.AAI(c9iZ, i3).AAJ(iArr[i3]);
            }
        } else if (this instanceof C9ta) {
            byte[] bArr = ((C9oW) array).A00;
            C7384Etj.A0Y(c9j5A56, 0);
            for (int i4 = 0; i4 < iA02; i4++) {
                c9j5A56.AAI(c9iZ, i4).AA8(bArr[i4]);
            }
        } else if (this instanceof C08209tg) {
            short[] sArr2 = (short[]) array;
            AnonymousClass003.A0u(c9j5A56, sArr2);
            for (int i5 = 0; i5 < iA02; i5++) {
                c9j5A56.AAT(c9iZ, i5, sArr2[i5]);
            }
        } else if (this instanceof C08279tn) {
            long[] jArr2 = (long[]) array;
            AnonymousClass003.A0u(c9j5A56, jArr2);
            for (int i6 = 0; i6 < iA02; i6++) {
                c9j5A56.AAN(c9iZ, i6, jArr2[i6]);
            }
        } else if (this instanceof C08249tk) {
            int[] iArr2 = (int[]) array;
            AnonymousClass003.A0u(c9j5A56, iArr2);
            for (int i7 = 0; i7 < iA02; i7++) {
                c9j5A56.AAK(c9iZ, i7, iArr2[i7]);
            }
        } else if (this instanceof C08229ti) {
            float[] fArr = (float[]) array;
            AnonymousClass003.A0u(c9j5A56, fArr);
            for (int i8 = 0; i8 < iA02; i8++) {
                c9j5A56.AAG(c9iZ, fArr[i8], i8);
            }
        } else if (this instanceof C08219th) {
            double[] dArr = (double[]) array;
            AnonymousClass003.A0u(c9j5A56, dArr);
            for (int i9 = 0; i9 < iA02; i9++) {
                c9j5A56.AAD(c9iZ, dArr[i9], i9);
            }
        } else if (this instanceof C08259tl) {
            char[] cArr = (char[]) array;
            AnonymousClass003.A0u(c9j5A56, cArr);
            for (int i10 = 0; i10 < iA02; i10++) {
                c9j5A56.AAB(c9iZ, cArr[i10], i10);
            }
        } else if (this instanceof C9tf) {
            byte[] bArr2 = (byte[]) array;
            AnonymousClass003.A0u(c9j5A56, bArr2);
            for (int i11 = 0; i11 < iA02; i11++) {
                c9j5A56.AA9(c9iZ, bArr2[i11], i11);
            }
        } else {
            boolean[] zArr = (boolean[]) array;
            AnonymousClass003.A0u(c9j5A56, zArr);
            for (int i12 = 0; i12 < iA02; i12++) {
                c9j5A56.AA7(c9iZ, i12, zArr[i12]);
            }
        }
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9tX, X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }

    public C9tZ(C9hr<Element> c9hr) {
        super(c9hr);
        final C9iZ descriptor = c9hr.getDescriptor();
        this.A00 = new C9tR(descriptor) { // from class: X.9u2
            public final String A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(descriptor);
                C7384Etj.A0Y(descriptor, 0);
                this.A00 = FGI.A0M(descriptor.AKP(), "Array");
            }

            @Override // X.C9iZ
            public final String AKP() {
                return this.A00;
            }
        };
    }
}
