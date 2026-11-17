package com.facebook.aura.storagerecovery.data;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class StorageRecoveryListRequestJson$$serializer implements C9cd<StorageRecoveryListRequestJson> {
    public static final StorageRecoveryListRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StorageRecoveryListRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new StorageRecoveryListRequestJson(i, strA0v, strA0v2, iA8U, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        StorageRecoveryListRequestJson$$serializer storageRecoveryListRequestJson$$serializer = new StorageRecoveryListRequestJson$$serializer();
        INSTANCE = storageRecoveryListRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.storagerecovery.data.StorageRecoveryListRequestJson", storageRecoveryListRequestJson$$serializer, 3);
        c9iKA1C.A08("directory_token", true);
        c9iKA1C.A08("cursor", true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_LIMIT, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, StorageRecoveryListRequestJson storageRecoveryListRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, storageRecoveryListRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StorageRecoveryListRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(storageRecoveryListRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
