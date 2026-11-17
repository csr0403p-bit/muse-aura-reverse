package com.facebook.graphservice.interfaces;

import X.InterfaceC5106DYe;
import com.facebook.tigon.TigonErrorException;

/* loaded from: classes6.dex */
public interface GraphQLService {

    /* loaded from: classes5.dex */
    public interface DataCallbacks {
        void onError(TigonErrorException tigonErrorException, Summary summary);

        void onUpdate(Tree tree, Summary summary);
    }

    /* loaded from: classes5.dex */
    public interface OperationCallbacks {
        void onError(TigonErrorException tigonErrorException);

        void onSuccess();
    }

    /* loaded from: classes5.dex */
    public interface Token extends InterfaceC5106DYe {
        @Override // X.InterfaceC5106DYe
        void cancel();
    }
}
