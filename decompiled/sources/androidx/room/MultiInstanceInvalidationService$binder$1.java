package androidx.room;

import X.AnonymousClass000;
import X.BV5;
import X.C60O;
import X.C7384Etj;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MultiInstanceInvalidationService$binder$1 extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void A5M(int i, String[] strArr) {
        C7384Etj.A0Y(strArr, 1);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList<IMultiInstanceInvalidationCallback> remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            Map<Integer, String> map = multiInstanceInvalidationService.A02;
            String str = (String) BV5.A0f(map, i);
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = remoteCallbackList.getBroadcastCookie(i2);
                        C7384Etj.A0Z(broadcastCookie, AnonymousClass000.A00(0));
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String strA0p = C60O.A0p(num, map);
                        if (i != iIntValue && str.equals(strA0p)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i2)).ATh(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int AZz(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        C7384Etj.A0Y(iMultiInstanceInvalidationCallback, 0);
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList<IMultiInstanceInvalidationCallback> remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            int i2 = multiInstanceInvalidationService.A00 + 1;
            multiInstanceInvalidationService.A00 = i2;
            Integer numValueOf = Integer.valueOf(i2);
            if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, numValueOf)) {
                multiInstanceInvalidationService.A02.put(numValueOf, str);
                i = i2;
            } else {
                multiInstanceInvalidationService.A00--;
            }
        }
        return i;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void Ahj(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
        C7384Etj.A0Y(iMultiInstanceInvalidationCallback, 0);
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList<IMultiInstanceInvalidationCallback> remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            remoteCallbackList.unregister(iMultiInstanceInvalidationCallback);
            multiInstanceInvalidationService.A02.remove(Integer.valueOf(i));
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback;
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback2;
        String str = IMultiInstanceInvalidationService.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        iMultiInstanceInvalidationCallback = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.A00);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                            IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy = new IMultiInstanceInvalidationCallback$Stub$Proxy();
                            iMultiInstanceInvalidationCallback$Stub$Proxy.A00 = strongBinder;
                            iMultiInstanceInvalidationCallback = iMultiInstanceInvalidationCallback$Stub$Proxy;
                        } else {
                            iMultiInstanceInvalidationCallback = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
                        }
                    }
                    int iAZz = AZz(iMultiInstanceInvalidationCallback, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAZz);
                    return true;
                }
                if (i == 2) {
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 == null) {
                        iMultiInstanceInvalidationCallback2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.A00);
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                            IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy2 = new IMultiInstanceInvalidationCallback$Stub$Proxy();
                            iMultiInstanceInvalidationCallback$Stub$Proxy2.A00 = strongBinder2;
                            iMultiInstanceInvalidationCallback2 = iMultiInstanceInvalidationCallback$Stub$Proxy2;
                        } else {
                            iMultiInstanceInvalidationCallback2 = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
                        }
                    }
                    Ahj(iMultiInstanceInvalidationCallback2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                if (i == 3) {
                    A5M(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public MultiInstanceInvalidationService$binder$1() {
        attachInterface(this, IMultiInstanceInvalidationService.A00);
    }
}
