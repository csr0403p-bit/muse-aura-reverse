package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.mlkit_vision_label.zza;
import com.google.android.gms.internal.mlkit_vision_label.zzod;
import com.google.android.gms.internal.mlkit_vision_label.zzof;
import com.google.android.gms.internal.mlkit_vision_label.zzog;
import com.google.android.gms.internal.mlkit_vision_label.zzoi;
import com.google.android.gms.internal.mlkit_vision_label.zzoj;
import com.google.android.gms.internal.mlkit_vision_label.zzol;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CbS implements CcF {
    public zzof A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final C3104ByR A04;

    @Override // X.CcF
    public final ArrayList AjG(C3665CcL c3665CcL) throws MlKitException {
        if (this.A00 == null) {
            AjR();
        }
        zzof zzofVar = this.A00;
        CRy.A03(zzofVar);
        if (!this.A01) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zzofVar.A00);
                zzofVar.A01(parcelObtain, 1);
                this.A01 = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init thin image labeler.", 13, e);
            }
        }
        zzod zzodVar = new zzod(c3665CcL.A03, c3665CcL.A00, c3665CcL.A01, SystemClock.elapsedRealtime(), CbU.A00(c3665CcL.A02));
        ObjectWrapper objectWrapperA01 = CAC.A01(c3665CcL);
        try {
            Parcel parcelObtain2 = Parcel.obtain();
            zzb.A01(parcelObtain2, objectWrapperA01, zzofVar.A00);
            parcelObtain2.writeInt(1);
            zzodVar.writeToParcel(parcelObtain2, 0);
            Parcel parcelA00 = zzofVar.A00(parcelObtain2, 3);
            ArrayList arrayListCreateTypedArrayList = parcelA00.createTypedArrayList(zzoj.CREATOR);
            parcelA00.recycle();
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                zzoj zzojVar = (zzoj) it.next();
                arrayListA0h.add(new CS5(zzojVar.A02, zzojVar.A03, zzojVar.A00, zzojVar.A01));
            }
            return arrayListA0h;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run thin image labeler.", 13, e2);
        }
    }

    @Override // X.CcF
    public final void AjR() throws MlKitException {
        IInterface zzogVar;
        zzof zzofVar;
        if (this.A00 == null) {
            try {
                CbG cbG = Cb9.A09;
                Context context = this.A03;
                IBinder iBinderA09 = Cb9.A04(context, cbG, "com.google.android.gms.vision.ica").A09("com.google.android.gms.vision.label.mlkit.ImageLabelerCreator");
                if (iBinderA09 == null) {
                    zzogVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderA09.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabelerCreator");
                    zzogVar = iInterfaceQueryLocalInterface instanceof zzoi ? (zzoi) iInterfaceQueryLocalInterface : new zzog("com.google.mlkit.vision.label.aidls.IImageLabelerCreator", iBinderA09);
                }
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzol zzolVar = new zzol(0.6f, -1);
                zza zzaVar = (zza) zzogVar;
                Parcel parcelObtain = Parcel.obtain();
                zzb.A01(parcelObtain, objectWrapper, zzaVar.A00);
                parcelObtain.writeInt(1);
                zzolVar.writeToParcel(parcelObtain, 0);
                Parcel parcelA00 = zzaVar.A00(parcelObtain, 1);
                IBinder strongBinder = parcelA00.readStrongBinder();
                if (strongBinder == null) {
                    zzofVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
                    zzofVar = iInterfaceQueryLocalInterface2 instanceof zzof ? (zzof) iInterfaceQueryLocalInterface2 : new zzof("com.google.mlkit.vision.label.aidls.IImageLabeler", strongBinder);
                }
                parcelA00.recycle();
                this.A00 = zzofVar;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thin image labeler.", 13, e);
            } catch (DynamiteModule$LoadingException unused) {
                if (!this.A02) {
                    AbstractC3782CeQ.A00(this.A03, "ica");
                    this.A02 = true;
                }
                throw new MlKitException("Waiting for the label optional module to be downloaded. Please wait.", 14);
            }
        }
    }

    @Override // X.CcF
    public final void AjV() {
        zzof zzofVar = this.A00;
        if (zzofVar != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zzofVar.A00);
                zzofVar.A01(parcelObtain, 2);
            } catch (RemoteException unused) {
                Log.e("DecoupledImageLabeler", "Failed to release thin image labeler.");
            }
            this.A00 = null;
            this.A01 = false;
        }
    }

    public CbS(Context context, C3104ByR c3104ByR) {
        this.A03 = context;
        this.A04 = c3104ByR;
    }
}
