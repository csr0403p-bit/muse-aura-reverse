package com.facebook.aura.bloks.data;

import X.AnonymousClass005;
import X.Hi0;
import X.HsN;
import android.content.Context;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraDataFetchPropsCreator {
    public /* bridge */ /* synthetic */ Hi0 create(Context context, String str, Map map, long j, String str2, HsN hsN) {
        AnonymousClass005.A0x(context, str, map);
        AuraBloksDataProps.Builder builderCreate = AuraBloksDataProps.Companion.create(context);
        builderCreate.appId(str);
        builderCreate.params(map);
        return builderCreate.props;
    }

    public Hi0 create(Context context, String str, Map<String, String> map, long j, String str2, AuraAppDataConfig auraAppDataConfig) {
        AnonymousClass005.A0x(context, str, map);
        AuraBloksDataProps.Builder builderCreate = AuraBloksDataProps.Companion.create(context);
        builderCreate.appId(str);
        builderCreate.params(map);
        return builderCreate.props;
    }
}
