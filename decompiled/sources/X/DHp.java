package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public interface DHp<DataStartType, DataSnapshotType> {
    ListenableFuture<?> decorateEvent(COt cOt, DataStartType datastarttype, DataSnapshotType datasnapshottype);

    String getProviderName();

    int getProviderTypeId();

    Class<DataSnapshotType> getSnapshotType();

    Class<DataStartType> getStartType();

    boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c);

    DataSnapshotType snapshot(int i, int i2);

    DataStartType start(int i, int i2);
}
