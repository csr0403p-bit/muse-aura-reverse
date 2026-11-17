package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* loaded from: classes5.dex */
public final class DS2 implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ MobileConfigManagerHolderImpl A00;
    public final /* synthetic */ DS1 A01;

    public DS2(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, DS1 ds1) {
        this.A01 = ds1;
        this.A00 = mobileConfigManagerHolderImpl;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
    public final void onNetworkComplete(boolean z) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = this.A01.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(z);
        }
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A00;
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl2 = MobileConfigManagerHolderImpl.$redex_init_class;
        mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs();
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
    public final void onNetworkCompleteWithMessage(boolean z, String str) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = this.A01.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkCompleteWithMessage(z, str);
        }
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A00;
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl2 = MobileConfigManagerHolderImpl.$redex_init_class;
        mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs();
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
    public final void onNetworkCompleteWithResult(boolean z, String str, Integer num) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = this.A01.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkCompleteWithResult(z, str, num);
        }
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A00;
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl2 = MobileConfigManagerHolderImpl.$redex_init_class;
        mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs();
    }
}
