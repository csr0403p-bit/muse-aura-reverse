package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.AggregateDataCallback;
import androidx.health.platform.client.impl.FilterGrantedPermissionsCallback;
import androidx.health.platform.client.impl.GetChangesCallback;
import androidx.health.platform.client.impl.GetChangesTokenCallback;
import androidx.health.platform.client.impl.ReadDataRangeCallback;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.request.RequestContext;
import androidx.health.platform.client.service.IHealthDataService;
import androidx.health.platform.client.service.IHealthDataService$Stub$Proxy;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class F5J implements InterfaceC5268Dei {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F5J(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static boolean A00(IInterface iInterface, Parcel parcel, Parcelable parcelable, Parcelable parcelable2) {
        parcel.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
        Cxc.A00(parcel, parcelable);
        Cxc.A00(parcel, parcelable2);
        parcel.writeStrongInterface(iInterface);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5268Dei
    public final void AB0(SettableFuture settableFuture, Object obj) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        int i;
        int i2;
        IBinder iBinder;
        int i3 = this.$t;
        C5272Dem c5272Dem = (C5272Dem) this.A00;
        try {
            switch (i3) {
                case 0:
                    C9186Fzt c9186Fzt = (C9186Fzt) this.A01;
                    RequestContext requestContextA00 = C5272Dem.A00(c5272Dem);
                    GetChangesRequest getChangesRequest = new GetChangesRequest(c9186Fzt);
                    C7384Etj.A0X(settableFuture);
                    GetChangesCallback getChangesCallback = new GetChangesCallback(settableFuture);
                    IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy = (IHealthDataService$Stub$Proxy) ((IHealthDataService) obj);
                    parcelObtain = Parcel.obtain();
                    parcelObtain2 = Parcel.obtain();
                    boolean zA00 = A00(getChangesCallback, parcelObtain, requestContextA00, getChangesRequest);
                    i = 18;
                    iBinder = iHealthDataService$Stub$Proxy.A00;
                    i2 = zA00;
                    break;
                case 1:
                    C9173Fzg c9173Fzg = (C9173Fzg) this.A01;
                    RequestContext requestContextA002 = C5272Dem.A00(c5272Dem);
                    GetChangesTokenRequest getChangesTokenRequest = new GetChangesTokenRequest(c9173Fzg);
                    C7384Etj.A0X(settableFuture);
                    GetChangesTokenCallback getChangesTokenCallback = new GetChangesTokenCallback(settableFuture);
                    IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy2 = (IHealthDataService$Stub$Proxy) ((IHealthDataService) obj);
                    parcelObtain = Parcel.obtain();
                    parcelObtain2 = Parcel.obtain();
                    boolean zA002 = A00(getChangesTokenCallback, parcelObtain, requestContextA002, getChangesTokenRequest);
                    i = 17;
                    iBinder = iHealthDataService$Stub$Proxy2.A00;
                    i2 = zA002;
                    break;
                case 2:
                    C9170Fzd c9170Fzd = (C9170Fzd) this.A01;
                    RequestContext requestContextA003 = C5272Dem.A00(c5272Dem);
                    AggregateDataRequest aggregateDataRequest = new AggregateDataRequest(c9170Fzd);
                    C7384Etj.A0X(settableFuture);
                    AggregateDataCallback aggregateDataCallback = new AggregateDataCallback(settableFuture);
                    IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy3 = (IHealthDataService$Stub$Proxy) ((IHealthDataService) obj);
                    parcelObtain = Parcel.obtain();
                    parcelObtain2 = Parcel.obtain();
                    boolean zA003 = A00(aggregateDataCallback, parcelObtain, requestContextA003, aggregateDataRequest);
                    i = 15;
                    iBinder = iHealthDataService$Stub$Proxy3.A00;
                    i2 = zA003;
                    break;
                case 3:
                    Set set = (Set) this.A01;
                    IHealthDataService iHealthDataService = (IHealthDataService) obj;
                    RequestContext requestContextA004 = C5272Dem.A00(c5272Dem);
                    ArrayList arrayListA0i = AnonymousClass003.A0i(set);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(new Permission((C9180Fzn) it.next()));
                    }
                    List listA0X = AbstractC0878AGe.A0X(arrayListA0i);
                    C7384Etj.A0X(settableFuture);
                    FilterGrantedPermissionsCallback filterGrantedPermissionsCallback = new FilterGrantedPermissionsCallback(settableFuture);
                    IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy4 = (IHealthDataService$Stub$Proxy) iHealthDataService;
                    Parcel parcelObtain3 = Parcel.obtain();
                    Parcel parcelObtain4 = Parcel.obtain();
                    try {
                        parcelObtain3.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                        Cxc.A00(parcelObtain3, requestContextA004);
                        if (listA0X == null) {
                            parcelObtain3.writeInt(-1);
                        } else {
                            int size = listA0X.size();
                            parcelObtain3.writeInt(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                Cxc.A00(parcelObtain3, (Parcelable) listA0X.get(i4));
                            }
                        }
                        parcelObtain3.writeStrongInterface(filterGrantedPermissionsCallback);
                        iHealthDataService$Stub$Proxy4.A00.transact(23, parcelObtain3, parcelObtain4, 0);
                        parcelObtain4.readException();
                        return;
                    } finally {
                        parcelObtain4.recycle();
                        parcelObtain3.recycle();
                    }
                default:
                    ProtoParcelable protoParcelable = (ProtoParcelable) this.A01;
                    RequestContext requestContextA005 = C5272Dem.A00(c5272Dem);
                    C7384Etj.A0X(settableFuture);
                    ReadDataRangeCallback readDataRangeCallback = new ReadDataRangeCallback(settableFuture);
                    IHealthDataService$Stub$Proxy iHealthDataService$Stub$Proxy5 = (IHealthDataService$Stub$Proxy) ((IHealthDataService) obj);
                    parcelObtain = Parcel.obtain();
                    parcelObtain2 = Parcel.obtain();
                    boolean zA004 = A00(readDataRangeCallback, parcelObtain, requestContextA005, protoParcelable);
                    i = 16;
                    iBinder = iHealthDataService$Stub$Proxy5.A00;
                    i2 = zA004;
                    break;
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, i2);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
