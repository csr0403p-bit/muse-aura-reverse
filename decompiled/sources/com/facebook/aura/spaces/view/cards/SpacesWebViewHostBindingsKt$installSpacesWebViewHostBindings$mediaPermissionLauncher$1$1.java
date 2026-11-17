package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.BFI;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import android.content.Context;
import android.webkit.PermissionRequest;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchPermissionUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$mediaPermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Map<String, Boolean>, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<PermissionRequest> $pendingPermissionRequest$delegate;
    public final /* synthetic */ MutableState<String[]> $pendingRequestedResources$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Boolean> map) {
        C7384Etj.A0Y(map, 0);
        PermissionRequest value = this.$pendingPermissionRequest$delegate.getValue();
        String[] value2 = this.$pendingRequestedResources$delegate.getValue();
        this.$pendingPermissionRequest$delegate.Af8(null);
        this.$pendingRequestedResources$delegate.Af8(null);
        if (value == null || value2 == null) {
            return;
        }
        Context context = this.$context;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : value2) {
            String strAndroidPermissionFor = SpacesWebViewHostBindingsKt.androidPermissionFor(str);
            if (strAndroidPermissionFor != null && (C3cG.A1P(map.get(strAndroidPermissionFor), true) || HatchPermissionUtils.INSTANCE.hasPermission(context, strAndroidPermissionFor))) {
                arrayListA0h.add(str);
            }
        }
        String[] strArr = (String[]) arrayListA0h.toArray(new String[0]);
        if (strArr.length == 0) {
            CFK.A06(SpacesWebViewHostBindingsKt.SPACES_HOST_TAG, "mediaPermissionLauncher: nothing granted \u2014 denying WebView");
            value.deny();
        } else {
            BFI.A0G(strArr);
            value.grant(strArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$mediaPermissionLauncher$1$1(MutableState<PermissionRequest> mutableState, MutableState<String[]> mutableState2, Context context) {
        super(1);
        this.$pendingPermissionRequest$delegate = mutableState;
        this.$pendingRequestedResources$delegate = mutableState2;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
        invoke2(map);
        return Unit.INSTANCE;
    }
}
