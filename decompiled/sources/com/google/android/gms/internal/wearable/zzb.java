package com.google.android.gms.internal.wearable;

import X.CMZ;
import X.InterfaceC4374CuU;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.zzij;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public static Parcel A00(InterfaceC4374CuU interfaceC4374CuU, zza zzaVar, zzij zzijVar) {
        zzijVar.A00 = interfaceC4374CuU;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(zzaVar.A01);
        parcelObtain.writeStrongBinder(zzijVar);
        return parcelObtain;
    }

    public static UnsupportedOperationException A01(Parcel parcel, Parcelable.Creator creator) {
        CMZ.A01(parcel, creator);
        CMZ.A00(parcel);
        return new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.wearable.internal.zzn] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.wearable.internal.zzbj] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.google.android.gms.wearable.internal.zzas] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.google.android.gms.wearable.internal.zzk] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.wearable.internal.zzhg] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.gms.wearable.internal.zzhg] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
