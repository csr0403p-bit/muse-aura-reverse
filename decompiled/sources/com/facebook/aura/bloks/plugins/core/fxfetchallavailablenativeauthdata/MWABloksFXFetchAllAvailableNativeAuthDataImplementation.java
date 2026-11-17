package com.facebook.aura.bloks.plugins.core.fxfetchallavailablenativeauthdata;

import X.AbstractC6666EOb;
import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.AnonymousClass001;
import X.BV4;
import X.C3cG;
import X.C60P;
import X.C6678EOz;
import X.CFK;
import X.EPN;
import X.EPU;
import X.F6D;
import X.FBB;
import X.GBK;
import X.Hj6;
import X.Hxb;
import com.facebook.aura.bloks.extensions.fx.AuraFXCalExtensions;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class MWABloksFXFetchAllAvailableNativeAuthDataImplementation {
    public static final String CALLER_NAME = "mwa_android_access_library_bloks_native_auth";
    public static final MWABloksFXFetchAllAvailableNativeAuthDataImplementation INSTANCE = new MWABloksFXFetchAllAvailableNativeAuthDataImplementation();
    public static final String TAG = "AuraFXFetchAuthData";

    public final Object evaluate(Hj6 hj6, F6D f6d) {
        boolean zA1Y = C60P.A1Y(hj6, f6d);
        if (AbstractC6666EOb.A00()) {
            return C6678EOz.A01.A00(hj6, f6d);
        }
        try {
            EPU epu = new EPU();
            epu.A00 = zA1Y;
            GBK gbk = AbstractC9266GBt.A00;
            AnonymousClass001.A1J(new EPN(f6d, hj6, CALLER_NAME, null, null, epu), Hxb.A02(AbstractC7429Evm.A00));
            return Unit.INSTANCE;
        } catch (Exception e) {
            CFK.A0J(TAG, e, "Unified impl failed, falling back to AuraFXCalExtensions");
            FBB fbb = f6d.A02;
            if (fbb == null) {
                throw BV4.A0U();
            }
            AuraFXCalExtensions.fetchAllNativeAuthData(fbb.A02, f6d, hj6);
            return C3cG.A0T();
        }
    }
}
