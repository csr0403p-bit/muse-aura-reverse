package com.facebook.aura.devices.link.ordering.impl;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C20Q;
import X.C20Y;
import X.C9hr;
import X.F0C;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.devices.intf.InternalDeviceSettingsContributor;
import com.facebook.aura.devices.intf.InternalDeviceSettingsRow;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.utils.HatchUtil;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchLinkOrderInternalSettingsContributor implements InternalDeviceSettingsContributor {
    public static final String DEEPLINK_ROW_ID = "devices:link:order:deeplink";
    public static final String HOME_LINK_ORDER_DEEPLINK = "hatch://home_link_order";
    public static final HatchLinkOrderInternalSettingsContributor INSTANCE = new HatchLinkOrderInternalSettingsContributor();
    public static final String ROW_ID = "devices:link:order";

    @Override // com.facebook.aura.devices.intf.InternalDeviceSettingsContributor
    public C20Q<List<InternalDeviceSettingsRow>> rows(Context context, AbstractC3358CGz abstractC3358CGz) {
        Object objAsList;
        if (HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled()) {
            F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
            objAsList = Arrays.asList(new InternalDeviceSettingsRow(ROW_ID, R.string._name_removed__res_0x7f120b4b, new HatchLinkOrderSheetKey(HatchLinkOrderEntryPoint.INTERNAL_SETTINGS), null, null), new InternalDeviceSettingsRow(DEEPLINK_ROW_ID, R.string._name_removed__res_0x7f120b4a, null, HOME_LINK_ORDER_DEEPLINK, Uri.parse(HOME_LINK_ORDER_DEEPLINK)));
        } else {
            objAsList = C0881AGi.A00;
        }
        return new C20Y(objAsList);
    }
}
